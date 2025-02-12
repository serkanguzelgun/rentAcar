package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;
import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.requests.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.GetByIdResponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandsContoller {
	private BrandService brandService;

	@GetMapping("getall")
	public List<GetAllBrandsResponse> getAll() {
		return brandService.getAll();
	}

	@GetMapping("/{id}")
	public GetByIdResponse getById(@PathVariable int id) {
		return brandService.getById(id);
	}

	@PostMapping("add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(@RequestBody() @Valid() CreateBrandRequest createBrandRequest) {
		this.brandService.add(createBrandRequest);
	}

	@PutMapping("update")
	public void update(@RequestBody() UpdateBrandRequest updateBrandRequest) {
		this.brandService.update(updateBrandRequest);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		this.brandService.delete(id);
	}
}
