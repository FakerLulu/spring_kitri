package mybatis.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobServiceImpl implements JobService {

	@Autowired
	JobDAO dao;

	@Override
	public List<String> getAllJobID() {
		return dao.getAllJobID();
	}

}
