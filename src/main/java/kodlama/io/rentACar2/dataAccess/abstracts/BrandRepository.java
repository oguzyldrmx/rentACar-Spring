package kodlama.io.rentACar2.dataAccess.abstracts;

import java.util.List;

import kodlama.io.rentACar2.entities.concretes.Brand;

public interface BrandRepository {
	List<Brand> getAll();
}
