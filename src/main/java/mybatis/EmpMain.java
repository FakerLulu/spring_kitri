package mybatis;

public class EmpMain {
	public static void main(String[] args) {
		EmpService es = new EmpMybatisService();
		for (EmpVO vo : es.getAllEmp()) {
			System.out.println(vo);
		}
		System.out.println("============");
		EmpVO ev = new EmpVO();

		// 삽입하는 ㄱ부분
		ev.setEmployee_id(9999);
		ev.setFirst_name("샘이솟아");
		ev.setLast_name("하이브리드");
		ev.setDepartment_id(100);
		ev.setEmail("a1w2e3e@def.gh");
		ev.setJob_id("IT_PROG");
		System.out.println(es.insertEmp(ev));
		System.out.println(es.getOneEmp(9999));

		System.out.println("============");
		for (EmpVO vo : es.getManyEmp(160)) {
			System.out.println(vo);
		}
		System.out.println("============");
		System.out.println("전 : " + es.getOneEmp(999));
		ev = new EmpVO();
		ev.setEmployee_id(999);
		ev.setLast_name("가카2");
		System.out.println(es.updateEmp(ev));
		System.out.println("후 : " + es.getOneEmp(999));
		System.out.println("============");

		System.out.println("전 : " + es.getOneEmp(9999));
		System.out.println(es.deleteEmp(9999));
		System.out.println("후 : " + es.getOneEmp(9999));

	}
}
