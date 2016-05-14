package samples;

public class DrumKitTestDrive {
	static DrumKit d = new DrumKit();
	
	
	public static void main(String[] args) {
		d.playSnare();
		
		d.snare = false;
		if (d.snare == true) {
			 d.playSnare();
			 }
		d.playTopHat();
	}

}
