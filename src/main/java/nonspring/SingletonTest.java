package nonspring;

class Singleton {
	static int i = 0;
	final static private Singleton s = new Singleton();

	private Singleton() {
		System.out.println(++i + "번째 생성자 호출");
	}

	public static Singleton getInstance() {
		return s;
	}
}

public class SingletonTest {

	public static void main(String[] args) {
		Singleton ns1 = Singleton.getInstance();
		Singleton ns2 = Singleton.getInstance();
		Singleton ns3 = Singleton.getInstance();
		System.out.println("생성 객체 : " + ns1);
		System.out.println("생성 객체 : " + ns2);
		System.out.println("생성 객체 : " + ns3);

		// 싱글톤 리플렉션으로 부수기
		/*
		 * try { Singleton ss = null; Constructor<?>[] c =
		 * Singleton.class.getDeclaredConstructors(); for (Constructor<?> con : c) {
		 * con.setAccessible(true); ss = (Singleton) con.newInstance(); }
		 * System.out.println(ss); } catch (SecurityException e) { e.printStackTrace();
		 * } catch (InstantiationException e) { e.printStackTrace(); } catch
		 * (IllegalAccessException e) { e.printStackTrace(); } catch
		 * (IllegalArgumentException e) { e.printStackTrace(); } catch
		 * (InvocationTargetException e) { e.printStackTrace(); }
		 */

	}
}