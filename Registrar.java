package technical;

public class Registrar {

	public static Registrar reg;
	
	private Registrar(){
		//System.out.println("constructor called");
		
	}
	public static Registrar getRegistrar(){
		if(reg==null)
			reg =new Registrar();
		
		return reg;
	}
}
