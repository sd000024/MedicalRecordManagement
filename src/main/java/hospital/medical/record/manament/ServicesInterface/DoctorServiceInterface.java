package hospital.medical.record.manament.ServicesInterface;

import java.util.List;

import hospital.medical.record.manament.constants.DoctorStatus;
import hospital.medical.record.manament.domains.Address;
import hospital.medical.record.manament.domains.Doctor;
import hospital.medical.record.manament.domains.MedicalVisit;

public interface DoctorServiceInterface {
	
	public void registerDoctor(Doctor doctor);
	public void modifyDoctor(Doctor doctor);
	public void changeDoctorStatus(String doctorID, DoctorStatus status);
	public void saveAddress(String doctorID, Address address);
	public Doctor getDoctor(String doctorID);
	List<Doctor> getAllDoctors(int pageNumer, int pageSize);
	List<Doctor> getDoctorsByHospital(String hospitalID, int pageNumer, int pageSize);
	Doctor getDoctorByPatient(String patientID);
	List<MedicalVisit> getPrescriptionsIssuedByDOctor(String doctorID, int pageNumber, int pageSize);
}
