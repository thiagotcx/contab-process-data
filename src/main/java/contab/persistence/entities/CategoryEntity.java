package contab.persistence.entities;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Entity
@Table(name = "tb_categories", schema = "public")
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, name = "category_id")
    private Long categoryId;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false, name = "is_active")
    private Boolean isActive;

    @Column(nullable = false, name = "is_deleted")
    private Boolean isDeleted;

    @Column(nullable = false, name = "created_at")
    private LocalDateTime createdAt;

    @OneToMany
    private List<ProductEntity> productEntityList;
}
