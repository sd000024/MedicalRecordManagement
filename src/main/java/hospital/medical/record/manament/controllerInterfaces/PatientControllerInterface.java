package hospital.medical.record.manament.controllerInterfaces;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hospital.medical.record.manament.models.DoctorDTO;
import hospital.medical.record.manament.models.PatientDTO;

public interface PatientControllerInterface {

	@RequestMapping(value = "/patient", consumes = { "application/json" }, method = RequestMethod.POST)
	ResponseEntity<Void> createPatient(@Valid @RequestBody DoctorDTO body);

	@RequestMapping(value = "/patient/{medicalNumber}", method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteUser(@PathVariable("medicalNumber") String medicalNumber);

	@RequestMapping(value = "/patient/{medicalNumber}", produces = { "application/json" }, method = RequestMethod.GET)
	ResponseEntity<PatientDTO> getPatientByPatientID(@PathVariable("medicalNumber") String medicalNumber);

	@RequestMapping(value = "/patient/{medicalNumber}", consumes = { "*/*" }, method = RequestMethod.PUT)
	ResponseEntity<Void> updatePatient(@PathVariable("medicalNumber") String medicalNumber,
			@Valid @RequestBody PatientDTO body);
}
