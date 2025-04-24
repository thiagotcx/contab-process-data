package contab.services.impl;

import contab.dto.CategoryDTO;
import contab.persistence.repositories.CategoryRepository;
import contab.services.ICategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<CategoryDTO> getActiveCategories() {


        return categoryRepository.getActiveCategories();
    }
}
