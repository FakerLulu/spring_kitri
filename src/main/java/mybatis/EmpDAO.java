package mybatis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDAO {
	SqlSession sqls;

	public void setSqls(SqlSession sqls) {
		this.sqls = sqls;
	}

	public List<EmpVO> getAllEmp() {
		if (sqls == null) {
			System.out.println("세션 설정 안됨");
			return new ArrayList<EmpVO>();
		}
		List<EmpVO> list = sqls.selectList("allemp");
		sqls.close();
		return list;

	}

	public EmpVO getOneEmp(int id) {
		if (sqls == null) {
			System.out.println("세션 설정 안됨");
			return new EmpVO();
		}
		EmpVO vo = sqls.selectOne("a.oneemp", id);// sql에 변수 할당을 위해서 이렇게 함. id를 너었다.
		sqls.close();
		return vo;
	}

	public List<EmpVO> getManyEmp(int id) {
		if (sqls == null) {
			System.out.println("세션 설정 안됨");
			return new ArrayList<EmpVO>();
		}
		List<EmpVO> list = sqls.selectList("a.manyemp", id);
		sqls.close();
		return list;
	}

	public int insertEmp(EmpVO vo) {
		if (sqls == null) {
			System.out.println("세션 설정 안됨");
			return 0;

		}

		int result = sqls.insert("a.insertemp", vo);
//		sqls.commit();
		sqls.close();
		return result;
	}

	public int updateEmp(EmpVO vo) {
		if (sqls == null) {
			System.out.println("세션 설정 안됨");
			return 0;

		}

		int result = sqls.insert("a.updateemp", vo);
		sqls.close();
		return result;
	}

	public int deleteEmp(int id) {
		if (sqls == null) {
			System.out.println("세션 설정 안됨");
			return 0;

		}

		int result = sqls.delete("a.deleteemp", id);
		sqls.close();
		return result;
	}

	public int getAllEmpCount() {
		if (sqls == null) {
			System.out.println("세션 설정 안됨");
			return 0;
		}

		int result = sqls.selectOne("a.empcount");
		sqls.close();
		return result;
	}

	public List<EmpVO> getPagingEmp(int[] param) {
		if (sqls == null) {
			System.out.println("세션 설정 안됨");
			return new ArrayList<EmpVO>();
		}

		List<EmpVO> result = sqls.selectList("a.emppaging", param);
		sqls.close();
		return result;
	}

	public List<EmpVO> getDepartEmp(int[] deptparam) {
		if (sqls == null) {
			System.out.println("세션 설정 안됨");
			return new ArrayList<EmpVO>();
		}
		List<EmpVO> result = sqls.selectList("a.empdeptid", deptparam);
		sqls.close();
		return result;
	}

	public List<EmpVO> getDepartEmp2(ArrayList<Integer> departparam2) {
		if (sqls == null) {
			System.out.println("세션 설정 안됨");
			return new ArrayList<EmpVO>();
		}
		List<EmpVO> result = sqls.selectList("a.empdeptid2", departparam2);
		sqls.close();
		return result;
	}

	public List<EmpVO> getEmpDynamicWhere(HashMap<String, String> mapmap) {
		if (sqls == null) {
			System.out.println("세션 설정 안됨");
			return new ArrayList<EmpVO>();
		}
		List<EmpVO> result = sqls.selectList("a.empdynamic", mapmap);
		sqls.close();
		return result;
	}
}
