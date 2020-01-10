package service;

public class ProductService12 implements ProductService {

	ProductDao dao;

	public void setDao(ProductDao dao) {
		this.dao = dao;
	}

	@Override
	public ProductVo sell() {

		return dao.sell(0.5, 1);
	}

}
