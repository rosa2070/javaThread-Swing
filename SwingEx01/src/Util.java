
public class Util {
	private String strName;

	public Util(String strName) {
		this.strName = strName;
	}
	
	public String capitalizeName() {
		String[] names = this.strName.split(" ");
		
		for(int i=0; i<names.length; i++) {
			names[i] = names[i].substring(0,1).toUpperCase() + names[i].substring(1);
		}
		
		return "출력 : " + String.join(" ", names);
		
	}
	 
	

}
