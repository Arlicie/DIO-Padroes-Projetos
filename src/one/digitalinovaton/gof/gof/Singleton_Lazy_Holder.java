package one.digitalinovaton.gof.gof;

public class Singleton_Lazy_Holder {
    private static class InstanceHolder{
        public static Singleton_Lazy_Holder
                      instancia=new Singleton_Lazy_Holder();
    }

    private Singleton_Lazy_Holder(){
        super();
    }

    public static Singleton_Lazy_Holder getInstancia(){
        return InstanceHolder.instancia;
    }
}
