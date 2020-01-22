package mybatis.bakery;

import java.util.List;

public class BakeryServiceImpl implements BakeryService {
	private BakeryDAO dao;

	public void setDao(BakeryDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<BakeryVO> getAllItems() {

		return dao.getAllItems();
	}

	@Override
	public int insertItem(BakeryVO vo) {
		return dao.insertItem(vo);
	}

}
