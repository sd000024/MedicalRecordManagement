package hospital.medical.record.manament.models;


import org.springframework.core.io.Resource;
import javax.validation.Valid;


public class ContractNumberUploadContractBody {

	private String additionalMetadata = null;

	private Resource file = null;


	public String getAdditionalMetadata() {
		return additionalMetadata;
	}

	public void setAdditionalMetadata(String additionalMetadata) {
		this.additionalMetadata = additionalMetadata;
	}

	@Valid
	public Resource getFile() {
		return file;
	}

	public void setFile(Resource file) {
		this.file = file;
	}
}
