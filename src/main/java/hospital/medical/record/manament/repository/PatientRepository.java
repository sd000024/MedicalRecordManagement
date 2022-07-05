package hospital.medical.record.manament.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hospital.medical.record.manament.domains.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, String>{

}
