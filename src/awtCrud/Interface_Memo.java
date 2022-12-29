package awtCrud;
class Phone{
	void voicecall() {
		System.out.println("Make A VoiceCall");
	}
	void sms() {
		System.out.println("We Can Send A SMS");
	}
	
}

interface camera{
	void click();
	void record();
}
interface player{
	void play();
	void pause();
	void stop();
}

class Smartphone extends Phone implements camera,player{

	@Override
	public void play() {
		System.out.println("Play A Song..:)");
	}

	@Override
	public void pause() {
		System.out.println("Pause A Song..:)");
	}

	@Override
	public void stop() {
		System.out.println("Stop A Song..:)");
	}

	@Override
	public void click() {
		System.out.println("Take A Selfie..:)");
		
	}

	@Override
	public void record() {
 System.out.println("Record The Sounds...");		
	}
	
}

public class Interface_Memo {

	public static void main(String[] args) {
		Smartphone o = new Smartphone();
		o.voicecall();
		o.sms();
		o.click();
		o.record();
		o.play();
		o.pause();
		o.stop();
	}

}
