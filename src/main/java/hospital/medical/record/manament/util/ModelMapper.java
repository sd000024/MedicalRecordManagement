package hospital.medical.record.manament.util;

import java.util.List;

import hospital.medical.record.manament.domains.Address;
import hospital.medical.record.manament.domains.Contract;
import hospital.medical.record.manament.domains.Doctor;
import hospital.medical.record.manament.domains.Hospital;
import hospital.medical.record.manament.domains.Patient;
import hospital.medical.record.manament.models.AddressDTO;
import hospital.medical.record.manament.models.DoctorDTO;

public class ModelMapper {

	public DoctorDTO toDoctorDTO(Doctor doctor) {
		return new DoctorDTO(doctor.getDoctorNumber(), doctor.getEmail(), doctor.getPassword(), doctor.getFirstName(),
				doctor.getLastName(), doctor.getIDCardNumber(), doctor.getPhoneNumber(), doctor.getPhotoURL(),
				doctor.getNationality(), doctor.getAddress().getId(), doctor.getHospital().getId(),
				doctor.getContract().getId(), doctor.getLevelOfDoctor(), doctor.getTypeOfDoctor(),
				doctor.getDoctorStatus(), doctor.getSpeciality(), doctor.getGender());
	}

	public Doctor toDoctor(DoctorDTO d, Hospital hospital, Contract contract, Address address, List<Patient> patients) {
		Doctor doc= new Doctor(d.getFirstName(), d.getLastName(), d.getIdcardNumber(), d.getPhotoURL(), d.getPhoneNumber(),
				d.getEmail(), d.getNationality(), d.getGender(), address, d.getDoctorID(), d.getPassword(),
				d.getLevelOfDoctor(), hospital, d.getTypeOfDoctor(), d.getSpeciality(), d.getDoctorStatus(),
				contract);
		
		if(patients!=null)
			doc.setMyPatients(patients);
		
		return doc;
	}

	public Address toAddress(AddressDTO adto) {
		return new Address(adto.getId(), adto.getRegion(), adto.getCity(), adto.getStreet(), adto.getHouse());
	}

	public AddressDTO toAddressDTO(Address address) {
		return new AddressDTO(address.getId(), address.getRegion(), address.getCity(), address.getStreet(),
				address.getHouse());
	}
}
