package one.dio.gof;

import one.dio.gof.facade.Facade;
import one.dio.gof.singleton.SingletonEager;
import one.dio.gof.singleton.SingletonLazy;
import one.dio.gof.singleton.SingletonLazyHolder;
import one.dio.gof.strategy.Comportamento;
import one.dio.gof.strategy.ComportamentoAgressivo;
import one.dio.gof.strategy.ComportamentoDefensivo;
import one.dio.gof.strategy.ComportamentoNormal;
import one.dio.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {

		System.out.println("*** Singleton ***");
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);

		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);

		SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);
		holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);
		System.out.println("------------------------------------");
		System.out.println();
		System.out.println("*** Strategy ***");

		Comportamento defensiso = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();

		Robo robo = new Robo();
		robo.setComp(normal);
		robo.mover();
		robo.mover();
		robo.setComp(defensiso);
		robo.mover();
		robo.setComp(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		System.out.println("------------------------------------");
		System.out.println();

		System.out.println("*** Facade ***");
		Facade fac = new Facade();
		fac.migrarCliente("Joao", "14870-000");
		System.out.println("------------------------------------");

	}
}
