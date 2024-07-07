package dev.ducku.config.repositories;

import dev.ducku.config.model.Product;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository {

    private final JdbcTemplate jdbcTemplate;

    public ProductRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Product> findAll() {
        String sql = "select * from product";
        return jdbcTemplate.query(sql, (resultSet, i) -> {
            Product product = new Product();
            product.setId(resultSet.getInt("id"));
            product.setName(resultSet.getString("name"));
            product.setPrice(resultSet.getDouble("price"));
            return product;
        });
    }

    public void save(Product product) {
        String sql = "INSERT INTO product VALUES(NULL, ?, ?)";
        jdbcTemplate.update(sql, product.getName(), product.getPrice());
    }
}
