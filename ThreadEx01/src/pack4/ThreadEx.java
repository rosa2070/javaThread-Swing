package pack4;

public class ThreadEx {
	public static void main(String[] args) {
		
		//익명 내부클래스 -> 람다식
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i=1; i<= 10; i++) {
					System.out.println("Go : " + i);
				}
			}
		});
		
	
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i=1; i<= 10; i++) {
					System.out.println("Come : " + i);
				}
			}
		});
		
		Thread t3 = new Thread(() -> {
			// TODO Auto-generated method stub
			for (int i=1; i<= 10; i++) {
				System.out.println("Come : " + i);
			}
		});
		
		System.out.println("시작");
		
		t1.start();
		t3.start();
		
		System.out.println("끝");
	}

}
