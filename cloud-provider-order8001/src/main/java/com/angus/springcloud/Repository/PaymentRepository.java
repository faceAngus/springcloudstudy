package com.angus.springcloud.Repository;

import com.angus.springcloud.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @author angus
 * @create 2020-03-07 22:23
 */
@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
	@Query(value = "insert into payment (id,serial) values (?1,?2)", nativeQuery = true)
	int create(Long id, String serial);

	Payment findBySerial(String serial);
}
