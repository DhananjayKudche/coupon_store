package couponstore.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import couponstore.app.entity.Coupon;
import couponstore.app.repository.CouponRepository;

@Service
public class CouponServiceImpl implements CouponService {

	@Autowired
	private CouponRepository couponRepository;

	@Override
	public Coupon saveCoupon(Coupon coupon) {
		Coupon savedCoupon = null;
		try {
			savedCoupon = couponRepository.save(coupon);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return savedCoupon;
	}

	@Override
	public Coupon getCouponById(Long id) {
		Optional<Coupon> couponOptional = couponRepository.findById(id);
		return couponOptional.orElse(null);
	}

    @Override
    public void deleteCoupon(Long id) {
        couponRepository.deleteById(id);
    }
    
    @Override
    public List<Coupon> getAllCoupons() {
        return couponRepository.findAll();
    }

}
