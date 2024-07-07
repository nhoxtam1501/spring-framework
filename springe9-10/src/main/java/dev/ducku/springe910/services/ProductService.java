package dev.ducku.springe910.services;

import dev.ducku.springe910.dto.ProductDTO;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final JdbcTemplate jdbcTemplate;

    public ProductService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int save(ProductDTO productDTO) {
        String sql = "INSERT INTO products VALUES(NULL, ?)";
        return jdbcTemplate.update(sql, productDTO.name());
    }
}
