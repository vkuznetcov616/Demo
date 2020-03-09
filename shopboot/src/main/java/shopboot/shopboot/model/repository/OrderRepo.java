package shopboot.shopboot.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shopboot.shopboot.model.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {
}
