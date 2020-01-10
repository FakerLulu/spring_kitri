package service;

public class ProductDao {
	ProductVo vo;

	public ProductVo sell(double sale, int coupon) {
		vo.setSale(sale);
		vo.setCoupon(coupon);
		return vo;
	}

	public void setVo(ProductVo vo) {
		this.vo = vo;
	}

}
