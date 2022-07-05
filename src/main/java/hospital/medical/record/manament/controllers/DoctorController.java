package hospital.medical.record.manament.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;

import hospital.medical.record.manament.ServicesInterface.DoctorServiceInterface;
import hospital.medical.record.manament.controllerInterfaces.DoctorControllerInterface;
import hospital.medical.record.manament.models.DoctorDTO;
import hospital.medical.record.manament.models.ModelApiResponse;
import hospital.medical.record.manament.util.LocalDateConverter;
import hospital.medical.record.manament.util.LocalDateTimeConverter;
import hospital.medical.record.manament.util.ModelMapper;

@RestController
public class DoctorController implements DoctorControllerInterface{

	private static final Logger log = LoggerFactory.getLogger(DoctorController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;
	
	private ModelMapper mapperDTO;
	
	@Autowired
	private DoctorServiceInterface doctorService;
	
	@Autowired
	public DoctorController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}
	
	@InitBinder
	private void initController(WebDataBinder web) {
		web.addCustomFormatter(new LocalDateConverter());
		web.addCustomFormatter(new LocalDateTimeConverter());
	}
	
	@Override
	public ResponseEntity<Void> addDoctor(@Valid DoctorDTO doctor) {
		
		
		//doctorService.registerDoctor(doctor);

		return null;
	}

	@Override
	public ResponseEntity<Void> deleteDoctor(String doctorID) {
		return null;
	}

	@Override
	public ResponseEntity<List<DoctorDTO>> findDoctorsByStatus(@Valid String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<DoctorDTO> getDoctorById(String doctorID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<ModelApiResponse> uploadContract(String doctorID, String contractNumber,
			String additionalMetadata, @Valid MultipartFile file) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<ModelApiResponse> uploadDoctorImage(String doctorID, String additionalMetadata,
			@Valid MultipartFile file) {
		// TODO Auto-generated method stub
		return null;
	}

}
