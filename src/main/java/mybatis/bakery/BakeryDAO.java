package mybatis.bakery;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class BakeryDAO {

	private SqlSession session;

	public void setSession(SqlSession session) {
		this.session = session;
	}

	public List<BakeryVO> getAllItems() {
		return session.selectList("bakery.allitems");
	}

	public int insertItem(BakeryVO vo) {
		return session.insert("bakery.insertitem", vo);
	}
}
