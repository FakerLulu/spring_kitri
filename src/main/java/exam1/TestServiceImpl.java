package exam1;

public class TestServiceImpl implements TestService {
	private TestDAO dao;

	public TestDAO getDao() {
		return dao;
	}

	public void setDao(TestDAO dao) {
		this.dao = dao;
	}

	@Override
	public TestVO test() {
		System.out.println("TestServiceImpl : test() ");
		return dao.test();
		// return dao.getVo();
	}
}
