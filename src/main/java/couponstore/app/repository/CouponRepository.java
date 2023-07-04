package couponstore.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import couponstore.app.entity.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Long>{

}
