package mybatis.spring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpMybatisService implements EmpService {

	@Autowired
	EmpDAO dao;

	@Override
	public List<EmpVO> getAllEmp() {
		return dao.getAllEmp();
	}

	@Override
	public EmpVO getOneEmp(int id) {
		return dao.getOneEmp(id);
	}

	@Override
	public List<EmpVO> getManyEmp(int id) {
		return dao.getManyEmp(id);
	}

	@Override
	public int insertEmp(EmpVO vo) {
		return dao.insertEmp(vo);
	}

	@Override
	public int updateEmp(EmpVO vo) {
		return dao.updateEmp(vo);
	}

	@Override
	public int deleteEmp(int id) {
		return dao.deleteEmp(id);
	}

	@Override
	public int selectEmpCount() {
		return dao.getAllEmpCount();
	}

	@Override
	public List<EmpVO> getPagingEmp(int[] param) {
		return dao.getPagingEmp(param);
	}

	@Override
	public List<EmpVO> getDepartEmp(int[] deptparam) {
		return dao.getDepartEmp(deptparam);
	}

	@Override
	public List<EmpVO> getDepartEmp2(ArrayList<Integer> departparam2) {
		return dao.getDepartEmp2(departparam2);
	}

	@Override
	public List<EmpVO> getEmpDynamicWhere(HashMap<String, String> mapmap) {
		return dao.getEmpDynamicWhere(mapmap);
	}

}
