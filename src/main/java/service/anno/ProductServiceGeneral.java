package service.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("psgen")
public class ProductServiceGeneral implements ProductService {
	@Autowired
	ProductDao dao;

	public void setDao(ProductDao dao) {
		this.dao = dao;
	}

	@Override
	public ProductVo sell() {

		return dao.sell(0, 5);
	}

}
