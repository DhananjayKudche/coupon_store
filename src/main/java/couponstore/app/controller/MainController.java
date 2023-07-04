package couponstore.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import couponstore.app.entity.Coupon;
import couponstore.app.entity.CouponDTO;
import couponstore.app.service.CouponService;

@RestController
@RequestMapping("/coupons")
public class MainController {
	
	@Autowired
	private CouponService couponService;
	
	
	@PostMapping("/create")
	public String saveDataToDataBase(@RequestBody Coupon coupon) {
		couponService.saveCoupon(coupon);
		return "Coupon is saved";
	}
	
	@GetMapping("/data")
	public CouponDTO getDataFromDb(@RequestParam("pid") Long id ) {
		Coupon coupon= couponService.getCouponById(id);
	    CouponDTO couponDTO = new CouponDTO(coupon.getId(), coupon.getCode(), coupon.getExpiryDate(), coupon.getDiscount());
	    return couponDTO;
	}
	
    @GetMapping("/{id}")
    public ResponseEntity<Coupon> getCouponById(@PathVariable Long id) {
        Coupon coupon = couponService.getCouponById(id);
        if (coupon != null) {
            return ResponseEntity.ok(coupon);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @GetMapping
    public List<Coupon> getAllCoupons() {
        return couponService.getAllCoupons();
    }
	
	@GetMapping("/test")
	public String deleteDataFromDb() {
		return "Testing is fine";
	}
	
	@PutMapping("/test")
	public String updateDataFromDb() {
		return "Testing is fine";
	}

}
