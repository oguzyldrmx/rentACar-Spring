package kodlama.io.rentACar2.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rentACar2.business.abstracts.BrandService;
import kodlama.io.rentACar2.business.requests.CreateBrandRequest;
import kodlama.io.rentACar2.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar2.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar2.entities.concretes.Brand;

@Service // bu sınıf business nesnesidir
public class BrandManager implements BrandService{
	private BrandRepository brandRepository;
	
	@Autowired
	public BrandManager(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}


	@Override
	public List<GetAllBrandsResponse> getAll() {
		
		List<Brand> brands = brandRepository.findAll();
		List<GetAllBrandsResponse> brandsResponse = new ArrayList<GetAllBrandsResponse>();
		for (Brand brand : brands) {
			GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
			responseItem.setId(brand.getId());
			responseItem.setName(brand.getName());
			brandsResponse.add(responseItem);
		}
		
		return brandsResponse;
	}


	@Override
	public void add(CreateBrandRequest createBrandRequest) {
		// TODO Auto-generated method stub
		Brand brand = new Brand();
		brand.setName(createBrandRequest.getName());
		this.brandRepository.save(brand);
	}

}
