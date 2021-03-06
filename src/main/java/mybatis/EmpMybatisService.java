package mybatis;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class EmpMybatisService implements EmpService {

	@Override
	public List<EmpVO> getAllEmp() {
		EmpDAO dao = makeDAOsetting();
		return dao.getAllEmp();
	}

	@Override
	public EmpVO getOneEmp(int id) {
		EmpDAO dao = makeDAOsetting();
		return dao.getOneEmp(id);
	}

	private EmpDAO makeDAOsetting() {
		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
		SqlSessionFactory ssf;
		EmpDAO dao = new EmpDAO();

		try {
			ssf = ssfb.build(Resources.getResourceAsReader("mybatis/mybatis-config.xml"));
			dao.setSqls(ssf.openSession(true)); // 오토 커밋

		} catch (IOException e) {
			e.printStackTrace();
		}
		return dao;
	}

	@Override
	public List<EmpVO> getManyEmp(int id) {
		EmpDAO dao = makeDAOsetting();
		return dao.getManyEmp(id);
	}

	@Override
	public int insertEmp(EmpVO vo) {
		EmpDAO dao = makeDAOsetting();
		return dao.insertEmp(vo);
	}

	@Override
	public int updateEmp(EmpVO vo) {
		EmpDAO dao = makeDAOsetting();
		return dao.updateEmp(vo);
	}

	@Override
	public int deleteEmp(int id) {
		EmpDAO dao = makeDAOsetting();
		return dao.deleteEmp(id);
	}

	@Override
	public int selectEmpCount() {
		EmpDAO dao = makeDAOsetting();
		return dao.getAllEmpCount();
	}

	@Override
	public List<EmpVO> getPagingEmp(int[] param) {
		EmpDAO dao = makeDAOsetting();
		return dao.getPagingEmp(param);
	}

	@Override
	public List<EmpVO> getDepartEmp(int[] deptparam) {
		return makeDAOsetting().getDepartEmp(deptparam);
	}

	@Override
	public List<EmpVO> getDepartEmp2(ArrayList<Integer> departparam2) {
		return makeDAOsetting().getDepartEmp2(departparam2);
	}

	@Override
	public List<EmpVO> getEmpDynamicWhere(HashMap<String, String> mapmap) {
		return makeDAOsetting().getEmpDynamicWhere(mapmap);
	}

}
