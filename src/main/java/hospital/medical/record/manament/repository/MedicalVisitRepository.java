package hospital.medical.record.manament.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import hospital.medical.record.manament.domains.MedicalVisit;

public interface MedicalVisitRepository extends JpaRepository<MedicalVisit, Long> {

	Page<MedicalVisit> findByDoctor(String doctorID, Pageable pageable);

}
