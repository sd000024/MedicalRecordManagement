package hospital.medical.record.manament.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hospital.medical.record.manament.domains.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

}
