package nonspring;

public class TvFactory {

	public TV makeTV(String manufacturer) {
		switch (manufacturer.toLowerCase()) {
		case "samsung":
			return new SamsungTV();
		case "lg":
			return new LGTV();
		default:
			return new TV() {
				@Override
				public void powerOff() {
					System.out.println("tv없음");
				}

				@Override
				public void powerOn() {
					System.out.println("tv없음");
				}
			};
		}
	}
}
