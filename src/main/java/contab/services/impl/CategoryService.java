package contab.services.impl;

import contab.dto.CategoryDTO;
import contab.persistence.repositories.CategoryRepository;
import contab.services.ICategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CategoryService implements ICategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public List<CategoryDTO> getActiveCategories() {
        return categoryRepository.getActiveCategories();
    }
}
