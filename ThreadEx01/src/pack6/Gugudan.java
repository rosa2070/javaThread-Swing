package pack6;

public class Gugudan extends Thread {
	// 캡슐화
	private int dan;
	
	public Gugudan(int dan) {
		this.dan = dan;
	}
	
	@Override
	public void run() {
		
		// 스레드의 이름
		System.out.println(this.getName() + " 시작");
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%s x %s = %s%n", dan , i , (dan * i));
		}
	}

}
