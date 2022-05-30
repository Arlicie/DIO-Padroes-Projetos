package one.digitalinovaton.gof.gof;

public class Singleton_Lazy {
    private static Singleton_Lazy instancia;

    private Singleton_Lazy(){
        super();
    }
    //ngm fora da classa poderá instanciá-la
    static Singleton_Lazy getInstancia(){
        if ((instancia==null)){
            instancia=new Singleton_Lazy();
        }
        return instancia;
    }
}
