package hospital.medical.record.manament.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hospital.medical.record.manament.Interfaces.DoctorServicesInterface;
import hospital.medical.record.manament.constants.DoctorStatus;
import hospital.medical.record.manament.domains.Address;
import hospital.medical.record.manament.domains.Doctor;
import hospital.medical.record.manament.exceptions.UserDoesNoTExistException;
import hospital.medical.record.manament.exceptions.UserExistedException;
import hospital.medical.record.manament.repository.DoctorRepository;

@Service
public class DoctorServices implements DoctorServicesInterface{
	
	//@Autowired
	//private AddressRepository repoAddress;
	
	@Autowired
	private DoctorRepository repoDoctor;

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
	
	public void saveAddress(String doctorID, Address address) {
		Doctor doctor = repoDoctor.findById(doctorID).orElseThrow(UserDoesNoTExistException::new);
		doctor.setAddress(address);
		repoDoctor.save(doctor);
		
	}
}
