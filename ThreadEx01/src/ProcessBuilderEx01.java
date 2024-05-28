import java.io.IOException;

public class ProcessBuilderEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ProcessBuilder => 프로세스 실행 => 프로그램 실행
		
	    ProcessBuilder processBuilder = null;
	    
	    try {
//	    	C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe
			processBuilder = new ProcessBuilder("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
			processBuilder.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] : " + e.getMessage());
		}
		

	}

}
