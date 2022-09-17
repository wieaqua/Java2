public class People {
	int height;
	String ear;
	void speak(String s) {
		System.out.println(s);
	}
}

class A {
	public static void main(String args[]) {
		People zhubajie;
		zhubajie = new People();
		zhubajie.height = 170;
		zhubajie.ear = "Two Big Ear";
		System.out.println("Height:" + zhubajie.height);
		System.out.println(zhubajie.ear);
		zhubajie.speak("师傅，咱们别去西天了，改去月宫吧");
	}
}
