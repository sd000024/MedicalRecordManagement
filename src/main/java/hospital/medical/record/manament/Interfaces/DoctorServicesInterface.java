package hospital.medical.record.manament.Interfaces;

import hospital.medical.record.manament.constants.DoctorStatus;
import hospital.medical.record.manament.domains.Address;
import hospital.medical.record.manament.domains.Doctor;

public interface DoctorServicesInterface {
	
	public void registerDoctor(Doctor doctor);
	public void modifyDoctor(Doctor doctor);
	public void changeDoctorStatus(String doctorID, DoctorStatus status);
	public void saveAddress(String doctorID, Address address);
}
