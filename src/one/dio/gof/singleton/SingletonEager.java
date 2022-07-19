package one.dio.gof.singleton;

public class SingletonEager {
	
	public static class InstanceHolder{

	public static SingletonEager instancia = new SingletonEager();
	}

	private SingletonEager() {
		super();
	}

	public static SingletonEager getInstancia() {
		return InstanceHolder.instancia;
	}

}
