package couponstore.app.service;

import java.util.List;

import couponstore.app.entity.Coupon;


public interface CouponService {

	Coupon saveCoupon(Coupon coupon);
	
    Coupon getCouponById(Long id);

    List<Coupon> getAllCoupons();
    
    void deleteCoupon(Long id);
}
