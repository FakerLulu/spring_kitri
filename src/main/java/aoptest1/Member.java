package aoptest1;

public class Member {

	protected Boolean login(String id) {
		System.out.println(id + "회원님 로그인했읍니다");
		return true;
	}

	public Boolean logout() {
		System.out.println("로그아웃 했읍니다");
		return true;
	}
}
