abstract class Player{ //abstract class
	abstract void play(int pos); // abstract method
	abstract void stop();
}

class AudioPlayer extends Player {
	void play(int pos) {System.out.println(pos+ "위치부터 실행 ");}
	void stop(){}
}


public class abstraction1 {

	public static void main(String[] args) {
		//AudioPlayer ap = new AudioPlayer();
		Player ap = new AudioPlayer()  // it is okay to use polymorphism by Player ap
;		ap.play(100);
		ap.stop();
	}

}
