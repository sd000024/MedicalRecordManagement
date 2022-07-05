package hospital.medical.record.manament.controllerInterfaces;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import hospital.medical.record.manament.models.DoctorDTO;
import hospital.medical.record.manament.models.ModelApiResponse;

public interface DoctorControllerInterface {

	@PostMapping(value = "/doctor", consumes = { "application/json" })
	ResponseEntity<Void> addDoctor(@Valid @RequestBody DoctorDTO body);

	@RequestMapping(value = "/doctor/{doctorID}", method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteDoctor(@PathVariable("doctorID") String doctorID);

	@RequestMapping(value = "/doctor/findByStatus", produces = { "application/json" }, method = RequestMethod.GET)
	ResponseEntity<List<DoctorDTO>> findDoctorsByStatus(
			@Valid @RequestParam(value = "status", required = true) String status);

	@RequestMapping(value = "/doctor/{doctorID}", produces = { "application/json" }, method = RequestMethod.GET)
	ResponseEntity<DoctorDTO> getDoctorById(@PathVariable("doctorID") String doctorID);

	@PostMapping(value = "/doctor/{doctorID}/{contractNumber}/uploadContract", produces = {
			"application/json" }, consumes = { "multipart/form-data" })
	ResponseEntity<ModelApiResponse> uploadContract(@PathVariable("doctorID") String doctorID,
			@PathVariable("contractNumber") String contractNumber,
			@RequestParam(value = "additionalMetadata", required = false) String additionalMetadata,
			@Valid @RequestPart("file") MultipartFile file);

	@PostMapping(value = "/doctor/{doctorID}/uploadImage", produces = { "application/json" }, consumes = {
			"multipart/form-data" })
	ResponseEntity<ModelApiResponse> uploadDoctorImage(@PathVariable("doctorID") String doctorID,
			@RequestParam(value = "additionalMetadata", required = false) String additionalMetadata,
			@Valid @RequestPart("file") MultipartFile file);

}
