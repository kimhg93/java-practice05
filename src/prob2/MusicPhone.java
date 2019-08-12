package prob2;

public class MusicPhone extends Phone {
	public void execute(String function) {
		if (function.equals("음악")) {
			playMusic();
			return;
		}
		super.execute(function);
	}

	private void playMusic() {
		System.out.println("음악재생");
	}
}
