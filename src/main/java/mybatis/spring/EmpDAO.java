package mybatis.spring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmpDAO {
	@Autowired
	SqlSession session;

	public List<EmpVO> getAllEmp() {
		if (session == null) {
			System.out.println("세션 설정 안됨");
			return new ArrayList<EmpVO>();
		}
		List<EmpVO> list = session.selectList("allemp");
		// session.close();
		return list;

	}

	public EmpVO getOneEmp(int id) {
		if (session == null) {
			System.out.println("세션 설정 안됨");
			return new EmpVO();
		}
		EmpVO vo = session.selectOne("a.oneemp", id);// sql에 변수 할당을 위해서 이렇게 함. id를 너었다.
		// session.close();
		return vo;
	}

	public List<EmpVO> getManyEmp(int id) {
		if (session == null) {
			System.out.println("세션 설정 안됨");
			return new ArrayList<EmpVO>();
		}
		List<EmpVO> list = session.selectList("a.manyemp", id);
		// session.close();
		return list;
	}

	public int insertEmp(EmpVO vo) {
		if (session == null) {
			System.out.println("세션 설정 안됨");
			return 0;

		}
		System.out.println(vo);
		int result = session.insert("a.insertemp", vo);
//		sqls.commit();
		// session.close();
		return result;
	}

	public int updateEmp(EmpVO vo) {
		if (session == null) {
			System.out.println("세션 설정 안됨");
			return 0;

		}

		int result = session.insert("a.updateemp", vo);
		// session.close();
		return result;
	}

	public int deleteEmp(int id) {
		if (session == null) {
			System.out.println("세션 설정 안됨");
			return 0;

		}

		int result = session.delete("a.deleteemp", id);
		// session.close();
		return result;
	}

	public int getAllEmpCount() {
		if (session == null) {
			System.out.println("세션 설정 안됨");
			return 0;
		}

		int result = session.selectOne("a.empcount");
		// session.close();
		return result;
	}

	public List<EmpVO> getPagingEmp(int[] param) {
		if (session == null) {
			System.out.println("세션 설정 안됨");
			return new ArrayList<EmpVO>();
		}

		List<EmpVO> result = session.selectList("a.emppaging", param);
		// session.close();
		return result;
	}

	public List<EmpVO> getDepartEmp(int[] deptparam) {
		if (session == null) {
			System.out.println("세션 설정 안됨");
			return new ArrayList<EmpVO>();
		}
		List<EmpVO> result = session.selectList("a.empdeptid", deptparam);
		// session.close();
		return result;
	}

	public List<EmpVO> getDepartEmp2(ArrayList<Integer> departparam2) {
		if (session == null) {
			System.out.println("세션 설정 안됨");
			return new ArrayList<EmpVO>();
		}
		List<EmpVO> result = session.selectList("a.empdeptid2", departparam2);
		// session.close();
		return result;
	}

	public List<EmpVO> getEmpDynamicWhere(HashMap<String, String> mapmap) {
		if (session == null) {
			System.out.println("세션 설정 안됨");
			return new ArrayList<EmpVO>();
		}
		List<EmpVO> result = session.selectList("a.empdynamic", mapmap);
		// session.close();
		return result;
	}
}
