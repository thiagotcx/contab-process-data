package contab.services;

import contab.dto.CategoryDTO;

import java.util.List;

public interface ICategoryService {
    List<CategoryDTO> getActiveCategories();
}
