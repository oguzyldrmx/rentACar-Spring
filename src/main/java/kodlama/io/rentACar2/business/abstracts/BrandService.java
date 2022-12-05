package kodlama.io.rentACar2.business.abstracts;

import java.util.List;

import kodlama.io.rentACar2.entities.concretes.Brand;

public interface BrandService {
	List<Brand> getAll();
}
