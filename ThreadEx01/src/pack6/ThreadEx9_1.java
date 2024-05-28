package pack6;

public class ThreadEx9_1 extends Thread {
	public void run() {
		int i= 10;
		
		while(i!= 0 && !isInterrupted()) {
			System.out.println(i--);
			for(long x=0; x<2500000000L; x++);
		}
		
		System.out.println("카운트가 종료되었습니다.");
	}
}
