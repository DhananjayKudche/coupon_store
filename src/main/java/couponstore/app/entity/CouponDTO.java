package couponstore.app.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CouponDTO {
    private Long id;
    private String name;
    private LocalDate expiryDate;
    private BigDecimal discountAmount;

    // Default constructor
    public CouponDTO() {
    }

    // Parameterized constructor
    public CouponDTO(Long id, String name, LocalDate expiryDate, BigDecimal discountAmount) {
        this.id = id;
        this.name = name;
        this.expiryDate = expiryDate;
        this.discountAmount = discountAmount;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public BigDecimal getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(BigDecimal discountAmount) {
		this.discountAmount = discountAmount;
	}
    
}