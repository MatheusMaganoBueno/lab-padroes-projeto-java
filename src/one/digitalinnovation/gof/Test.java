package one.digitalinnovation.gof;

import one.digitalinnovation.gof.Facade.Facade;
import one.digitalinnovation.gof.Singleton.SigletonLazy;
import one.digitalinnovation.gof.Singleton.SingletonEager;
import one.digitalinnovation.gof.Singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.*;

public class Test {
    public static void main(String[] args) {

        //Singleton

        SigletonLazy lazy = SigletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SigletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager Eager = SingletonEager.getInstancia();
        System.out.println(Eager);
        lazy = SigletonLazy.getInstance();
        System.out.println(Eager);

        SingletonLazyHolder Holder = SingletonLazyHolder.getInstancia();
        System.out.println(Holder);
        lazy = SigletonLazy.getInstance();
        System.out.println(Holder);

        // Strategy

        Comportamento normal = new  ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // Facede

        Facade facade = new Facade();
        facade.migrarCliente("Vanilton", "13801788");


    }
}
