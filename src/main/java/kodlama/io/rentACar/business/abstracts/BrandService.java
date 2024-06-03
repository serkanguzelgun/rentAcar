package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.requests.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.GetByIdResponse;

public interface BrandService {
	List<GetAllBrandsResponse> getAll();
	GetByIdResponse getById(int id);
	void add(CreateBrandRequest createBrandRequest);
	void update(UpdateBrandRequest updateBrandRequest);
	void delete(int id);
}
