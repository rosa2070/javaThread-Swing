package pack2;

public class ThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Go go = new Go();
		Come come = new Come();
		
		System.out.println("시작");
		
		// 스레드 실행방법이 아님
//		go.run();
//		come.run();
		
		go.start();
		come.start();
		
		System.out.println("끝");

	}

}
