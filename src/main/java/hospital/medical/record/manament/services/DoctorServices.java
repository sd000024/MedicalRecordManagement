package hospital.medical.record.manament.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import hospital.medical.record.manament.ServicesInterface.DoctorServiceInterface;
import hospital.medical.record.manament.constants.DoctorStatus;
import hospital.medical.record.manament.domains.Address;
import hospital.medical.record.manament.domains.Doctor;
import hospital.medical.record.manament.domains.MedicalVisit;
import hospital.medical.record.manament.domains.Patient;
import hospital.medical.record.manament.exceptions.UserDoesNoTExistException;
import hospital.medical.record.manament.exceptions.UserExistedException;
import hospital.medical.record.manament.repository.DoctorRepository;
import hospital.medical.record.manament.repository.PatientRepository;
import hospital.medical.record.manament.repository.MedicalVisitRepository;

@Service
public class DoctorServices implements DoctorServiceInterface{
	
	//@Autowired
	//private AddressRepository repoAddress;
	
	@Autowired
	private DoctorRepository repoDoctor;
	
	@Autowired
	private PatientRepository repoPatient;
	
	@Autowired
	private MedicalVisitRepository repoMedicalVisit;
	
	Pageable paging;

	@Override
	public void registerDoctor(Doctor doctor) {
		if(repoDoctor.existsById(doctor.getDoctorNumber()))
			throw new UserExistedException("The Doctor ("+ doctor.getDoctorNumber()+") already existed");
		repoDoctor.save(doctor);
	}

	@Override
	public void modifyDoctor(Doctor doctor) {
		if(!repoDoctor.existsById(doctor.getDoctorNumber()))
			throw new UserDoesNoTExistException("The Doctor ("+ doctor.getDoctorNumber()+") does not exist");
		repoDoctor.save(doctor);
		
	}

	@Override
	public void changeDoctorStatus(String doctorID, DoctorStatus status) {
		Doctor doctor = repoDoctor.findById(doctorID).orElseThrow(UserDoesNoTExistException::new);
		doctor.setDoctorStatus(status);
		
		repoDoctor.save(doctor);
	}
	
	@Override
	public void saveAddress(String doctorID, Address address) {
		Doctor doctor = repoDoctor.findById(doctorID).orElseThrow(UserDoesNoTExistException::new);
		doctor.setAddress(address);
		repoDoctor.save(doctor);
		
	}
	
	@Override
	public Doctor getDoctor(String doctorID) {
		return repoDoctor.findById(doctorID).orElseThrow(UserDoesNoTExistException::new);
	}
	
	@Override
	public List<Doctor> getAllDoctors(int pageNumer, int pageSize) {
		paging = PageRequest.of(pageNumer, pageSize);
		repoDoctor.findAll(paging);
		
		return repoDoctor.findAll(paging).getContent();
	}
	
	@Override
	public List<Doctor> getDoctorsByHospital(String hospitalID, int pageNumer, int pageSize) {
		paging = PageRequest.of(pageNumer, pageSize);
		
		return repoDoctor.findDoctorsByHospital(hospitalID, paging).getContent();
	}
	
	@Override
	public Doctor getDoctorByPatient(String patientID) {
		Patient patient=repoPatient.findById(patientID).orElseThrow(UserDoesNoTExistException::new);
		return patient.getMyDoctor();
	}
	
	@Override
	public List<MedicalVisit> getPrescriptionsIssuedByDOctor(String doctorID, int pageNumber, int pageSize) {
		paging = PageRequest.of(pageNumber, pageSize);
		return repoMedicalVisit.findByDoctor(doctorID, paging).getContent();
	}
	
	
}
