package mybatis.spring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface EmpService {
	public List<EmpVO> getAllEmp();

	public EmpVO getOneEmp(int id);

	public List<EmpVO> getManyEmp(int id);

	public int insertEmp(EmpVO vo);

	public int updateEmp(EmpVO vo);

	public int deleteEmp(int id);

	public int selectEmpCount();

	public List<EmpVO> getPagingEmp(int[] param);

	public List<EmpVO> getDepartEmp(int[] deptparam);

	public List<EmpVO> getDepartEmp2(ArrayList<Integer> departparam2);

	public List<EmpVO> getEmpDynamicWhere(HashMap<String, String> mapmap);
}
