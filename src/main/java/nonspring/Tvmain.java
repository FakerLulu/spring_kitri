package nonspring;

public class Tvmain {

	public static void main(String[] args) {
//		TV stv = new SamsungTV();
//		stv.powerOn();
//		stv.powerOff();
//
//		TV lg = new LGTV();
//		lg.powerOn();
//		lg.powerOff();
		TvFactory tvfac = new TvFactory();
		TV tv = tvfac.makeTV("Samsung");
		tv.powerOn();
		tv.powerOff();

		tv = tvfac.makeTV("LG");
		tv.powerOn();
		tv.powerOff();

		tv = tvfac.makeTV("daewoo");
		tv.powerOn();
		tv.powerOff();

	}

}
