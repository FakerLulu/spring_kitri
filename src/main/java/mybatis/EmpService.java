package mybatis;

import java.util.List;

public interface EmpService {
	public List<EmpVO> getAllEmp();

	public EmpVO getOneEmp(int id);

	public List<EmpVO> getManyEmp(int id);

	public int insertEmp(EmpVO vo);

	public int updateEmp(EmpVO vo);

	public int deleteEmp(int id);
}
