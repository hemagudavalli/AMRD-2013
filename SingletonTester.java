package technical;

public class SingletonTester {

	public static void main(String[] args){
		Registrar reg=Registrar.getRegistrar();
		System.out.println(reg.hashCode());
		Registrar reg1 = Registrar.getRegistrar();
		System.out.println(reg1.hashCode());
	}
}
