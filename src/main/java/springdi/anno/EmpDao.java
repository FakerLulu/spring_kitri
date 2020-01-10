package springdi.anno;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

@Repository("dao")
public class EmpDao {

//	@Autowired
//	@Qualifier("emp1")
	@Resource(name = "emp1")
	EmpVo vo;

	public void setVo(EmpVo vo) {
		this.vo = vo;
	}

	public EmpVo getVo() {
		return vo;
	}

}
