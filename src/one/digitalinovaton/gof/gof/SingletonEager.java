package one.digitalinovaton.gof.gof;

public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }
    static SingletonEager getInstancia(){
        return instancia;
    }
}
