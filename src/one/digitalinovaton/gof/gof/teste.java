package one.digitalinovaton.gof.gof;

import one.digitalinovaton.gof.gof.Facade.Facade;
import one.digitalinovaton.gof.gof.Strategy.*;

public class teste {
    public static void main(String[] args) {
        //validações dos singletons
        Singleton_Lazy lazy=Singleton_Lazy.getInstancia();
        System.out.println(lazy);
        lazy = Singleton_Lazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager=SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        Singleton_Lazy_Holder lazyH=Singleton_Lazy_Holder.getInstancia();
        System.out.println(lazyH);
        lazyH = Singleton_Lazy_Holder.getInstancia();
        System.out.println(lazyH);

        //construção privada e instancia static publica


        //STRATETGY
        Comportamento defensivo = new Comportamento_Defensivo();
        Comportamento normal = new Comportamento_Normal();
        Comportamento agressivo= new Comportamento_Agressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();

        //FACADE
        Facade facade= new Facade();
        facade.migrarCliente("Vicky", "44202-678");
    }
}
