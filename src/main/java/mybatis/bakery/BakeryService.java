package mybatis.bakery;

import java.util.List;

public interface BakeryService {
	public List<BakeryVO> getAllItems();

	public int insertItem(BakeryVO vo);
}
