package pack5;

public class GugudanMainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gugudan g1 = new Gugudan(2);
		Gugudan g2 = new Gugudan(8);
		
		g1.setName("2단");
		g2.setName("8단");
		
		System.out.println("시작");
		
		g1.start();
		g2.start();
		
		System.out.println("끝");
		

	}

}
