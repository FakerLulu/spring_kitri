package service.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class ProductDao {
	@Autowired
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
