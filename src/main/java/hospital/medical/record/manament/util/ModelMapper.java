package hospital.medical.record.manament.util;

import java.util.List;

import hospital.medical.record.manament.domains.Address;
import hospital.medical.record.manament.domains.Administration;
import hospital.medical.record.manament.domains.Appointment;
import hospital.medical.record.manament.domains.Contract;
import hospital.medical.record.manament.domains.Doctor;
import hospital.medical.record.manament.domains.Drug;
import hospital.medical.record.manament.domains.Hospital;
import hospital.medical.record.manament.domains.Insurance;
import hospital.medical.record.manament.domains.MedicalVisit;
import hospital.medical.record.manament.domains.Patient;
import hospital.medical.record.manament.domains.Prescription;
import hospital.medical.record.manament.models.AddressDTO;
import hospital.medical.record.manament.models.AdministrationDTO;
import hospital.medical.record.manament.models.AppointmentDTO;
import hospital.medical.record.manament.models.ContractDTO;
import hospital.medical.record.manament.models.DoctorDTO;
import hospital.medical.record.manament.models.DrugDTO;
import hospital.medical.record.manament.models.InsuranceDTO;
import hospital.medical.record.manament.models.MedicalVisitDTO;
import hospital.medical.record.manament.models.PatientDTO;
import hospital.medical.record.manament.models.PrescriptionDTO;

public class ModelMapper {

	public DoctorDTO toDoctorDTO(Doctor doctor) {
		return new DoctorDTO(doctor.getDoctorNumber(), doctor.getEmail(), doctor.getPassword(), doctor.getFirstName(),
				doctor.getLastName(), doctor.getIDCardNumber(), doctor.getPhoneNumber(), doctor.getPhotoURL(),
				doctor.getNationality(), doctor.getAddress().getId(), doctor.getHospital().getId(),
				doctor.getContract().getId(), doctor.getLevelOfDoctor(), doctor.getTypeOfDoctor(),
				doctor.getDoctorStatus(), doctor.getSpeciality(), doctor.getGender());
	}

	public Doctor toDoctor(DoctorDTO d, Hospital hospital, Contract contract, Address address, List<Patient> patients) {
		Doctor doc = new Doctor(d.getFirstName(), d.getLastName(), d.getIdcardNumber(), d.getPhotoURL(),
				d.getPhoneNumber(), d.getEmail(), d.getNationality(), d.getGender(), address, d.getDoctorID(),
				d.getPassword(), d.getLevelOfDoctor(), hospital, d.getTypeOfDoctor(), d.getSpeciality(),
				d.getDoctorStatus(), contract);

		if (patients != null)
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

	public Patient toDoctor(PatientDTO ddto, Address address, Doctor doctor) {
		return new Patient(ddto.getFirstName(), ddto.getLastName(), ddto.getIdCardNumber(), ddto.getPhotoURL(),
				ddto.getPhoneNumber(), ddto.getEmail(), ddto.getNationality(), ddto.getGender(), address,
				ddto.getMedicalNumber(), ddto.getPassword(), doctor);
	}

	public PatientDTO toPatientDTO(Patient p) {
		return new PatientDTO(p.getMedicalNumber(), p.getPassword(), p.getFirstName(), p.getLastName(),
				p.getIDCardNumber(), p.getPhotoURL(), p.getPhoneNumber(), p.getEmail(), p.getNationality(),
				p.getGender(), p.getAddress().getId(), p.getMyDoctor().getDoctorNumber());
	}

	public Administration toAdministration(AdministrationDTO adto, Address address, Hospital hospital,
			Contract contract) {
		return new Administration(adto.getFirstName(), adto.getLastName(), adto.getIDCardNumber(), adto.getPhotoURL(),
				adto.getPhoneNumber(), adto.getEmail(), adto.getNationality(), adto.getGender(), address,
				adto.getEmploymentNumber(), adto.getAdminRole(), contract, hospital);
	}

	public AdministrationDTO toAdminStrationDTO(Administration a) {
		return new AdministrationDTO(a.getEmploymentNumber(), a.getFirstName(), a.getLastName(), a.getIDCardNumber(),
				a.getPhotoURL(), a.getPhoneNumber(), a.getEmail(), a.getAdminRole(), a.getContract().getId(),
				a.getHospital().getId(), a.getNationality(), a.getGender(), a.getAddress().getId());
	}

	public Contract toContract(ContractDTO cdto, Hospital hospital) {
		return new Contract(cdto.getId(), cdto.getContractNumber(), hospital, cdto.getStartDate(), cdto.getEndDate(),
				cdto.getContractLocation());
	}

	public ContractDTO toContractDTO(Contract c) {
		return new ContractDTO(c.getId(), c.getContractNumber(), c.getHospital().getId(), c.getStartDate(),
				c.getEndDate(), c.getContractLocation());
	}

	public Appointment toAppointment(AppointmentDTO adto, Doctor doctor, Patient patient, Hospital hospital) {
		return new Appointment(adto.getId(), patient, doctor, adto.getDateAndTime(), adto.getComment(), hospital);
	}

	public AppointmentDTO toAppointmentDTO(Appointment a) {
		return new AppointmentDTO(a.getId(), a.getPatient().getMedicalNumber(), a.getDoctor().getDoctorNumber(),
				a.getDateAndTime(), a.getComment(), a.getHospital().getId());
	}

	public Drug toDrug(DrugDTO ddto) {
		return new Drug(ddto.getId(), ddto.getName(), ddto.getInfo());

	}

	public DrugDTO toDrugDTO(Drug d) {
		return new DrugDTO(d.getId(), d.getName(), d.getInfo());
	}

	public Insurance toInsurance(InsuranceDTO idto, Patient patient) {
		return new Insurance(idto.getId(), idto.getInsuranceNumber(), idto.getType(), idto.getExpirationDate(),
				idto.getFileLocation(), patient, idto.isValid());
	}

	public InsuranceDTO toInsuranceDTO(Insurance i, Patient patient) {
		return new InsuranceDTO(i.getId(), i.getInsuranceNumber(), i.getType(), i.getExpirationDate(),
				i.getFileLocation(), i.getPatient().getMedicalNumber(), i.isValid());
	}

	public MedicalVisit toMedicalVisit(MedicalVisitDTO mvdto, Doctor doctor, Patient patient, List<String> diagonsises,
			List<String> symptoms, List<Prescription> prescription) {
		MedicalVisit mv = new MedicalVisit(mvdto.getId(), mvdto.getDate(), doctor, patient, mvdto.getComments());
		if (diagonsises != null) {
			mv.setDiagonsises(diagonsises);
		}
		if (prescription != null) {
			mv.setPrescription(prescription);
		}
		if (symptoms != null) {
			mv.setSymptoms(symptoms);
		}
		return mv;
	}

	public MedicalVisitDTO toMedicalVisitDTO(MedicalVisit mv, List<String> diagonsises, List<String> symptoms,
			List<PrescriptionDTO> prescriptionDTO) {

		MedicalVisitDTO mvdto = new MedicalVisitDTO(mv.getId(), mv.getDate(), mv.getDoctor().getDoctorNumber(),
				mv.getPatient().getMedicalNumber(), mv.getComments());
		if (diagonsises != null) {
			mvdto.setDiagonsises(diagonsises);
		}
		if (prescriptionDTO != null) {
			mvdto.setPrescription(prescriptionDTO);
		}
		if (symptoms != null) {
			mvdto.setSymptoms(symptoms);
		}
		return mvdto;
	}

	public Prescription toPrescription(PrescriptionDTO pdto, Drug drug, MedicalVisit mv) {
		return new Prescription(pdto.getId(), pdto.getDuracion(), pdto.getDailyDose(), drug, mv);
	}

	public PrescriptionDTO toPrescriptionDTO(Prescription p, Drug drug, MedicalVisit mv) {
		return new PrescriptionDTO(p.getId(), p.getDuracion(), p.getDailyDose(), p.getDrug().getId(),
				p.getMedicalVisit().getId());
	}
}
