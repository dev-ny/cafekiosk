package sample.cafekiosk.spring.domain.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    /**
     * select *
     * from product
     * where selling_status in('SELLING', 'HOLD')
     * 기대한 쿼리는 위와 같음
     */
    List<Product> findAllBySellingStatusIn(List<ProductSellingStatus> sellingStatues);
}
