package mybatis;

public class EmpMain {
	public static void main(String[] args) {
		EmpService es = new EmpMybatisService();
		/*
		 * for (EmpVO vo : es.getAllEmp()) { System.out.println(vo); }
		 * System.out.println("============"); EmpVO ev = new EmpVO();
		 * 
		 * // 삽입하는 ㄱ부분 ev.setEmployee_id(9999); ev.setFirst_name("샘이솟아");
		 * ev.setLast_name("하이브리드"); ev.setDepartment_id(100);
		 * ev.setEmail("a1w2e3e@def.gh"); ev.setJob_id("IT_PROG");
		 * System.out.println(es.insertEmp(ev)); System.out.println(es.getOneEmp(9999));
		 * 
		 * System.out.println("============"); for (EmpVO vo : es.getManyEmp(160)) {
		 * System.out.println(vo); } System.out.println("============");
		 * System.out.println("전 : " + es.getOneEmp(999)); ev = new EmpVO();
		 * ev.setEmployee_id(999); ev.setLast_name("가카2");
		 * System.out.println(es.updateEmp(ev)); System.out.println("후 : " +
		 * es.getOneEmp(999)); System.out.println("============");
		 * 
		 * System.out.println("전 : " + es.getOneEmp(9999));
		 * System.out.println(es.deleteEmp(9999)); System.out.println("후 : " +
		 * es.getOneEmp(9999));
		 * 
		 * System.out.println("============"); System.out.println(es.selectEmpCount() +
		 * "명");
		 */
		System.out.println("============"); // 10개씩 결과 가져오도록 할 예정
		int pgnum = 5;
		int[] param = new int[2];
		param[0] = (pgnum - 1) * 10;
		param[1] = (pgnum) * 10;

		for (EmpVO vo : es.getPagingEmp(param)) {
			System.out.println(vo.getEmployee_id() + " " + vo.getLast_name() + ":" + vo.getHire_date());

		}
		/*
		 * System.out.println("============"); // 배열 부서코드로 조회
		 * System.out.println("배열로 조회함");
		 * 
		 * int[] deptparam = new int[3]; deptparam[0] = 10; deptparam[1] = 30;
		 * deptparam[2] = 80;
		 * 
		 * for (EmpVO vo : es.getDepartEmp(deptparam)) {
		 * System.out.println(vo.getEmployee_id() + " " + vo.getLast_name() + ":" +
		 * vo.getDepartment_id());
		 * 
		 * }
		 * 
		 * System.out.println("============"); // ArrayList 부서코드로 조회
		 * System.out.println("arraylist로 조회함"); ArrayList<Integer> departparam2 = new
		 * ArrayList(); departparam2.add(10); departparam2.add(50);
		 * departparam2.add(80);
		 * 
		 * for (EmpVO vo : es.getDepartEmp2(departparam2)) {
		 * System.out.println(vo.getEmployee_id() + " " + vo.getLast_name() + ":" +
		 * vo.getDepartment_id());
		 * 
		 * }
		 * 
		 * System.out.println("============"); // ArrayList 부서코드로 조회
		 * System.out.println("&&&map으로 조회함&&&"); HashMap<String, String> mapmap = new
		 * HashMap(); mapmap.put("column", "first_name"); mapmap.put("word", "Steven");
		 * // sql로 패턴비교할거면 여기다 써주면 좋읍니다
		 * 
		 * for (EmpVO vo : es.getEmpDynamicWhere(mapmap)) { System.out.println(vo);
		 * 
		 * }
		 */
	}
}
