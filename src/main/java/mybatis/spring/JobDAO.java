package mybatis.spring;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class JobDAO {

	@Autowired
	SqlSession session;

	public List<String> getAllJobID() {
		if (session == null) {
			System.out.println("세션없음");
			return new ArrayList<String>();
		}
		return session.selectList("job.alljobid");
	}
}
