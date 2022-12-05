package kodlama.io.rentACar2.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.rentACar2.entities.concretes.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer>{
	
}
