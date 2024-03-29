package hospital.medical.record.manament.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hospital.medical.record.manament.domains.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, String>{
	
	public Page<Doctor> findDoctorsByHospital(String hospital, Pageable pageable);

}
