package sub_sistema2;

public class cep {
    private static cep instancia = new cep();

    private cep(){
        super();
    }
    public static cep getInstancia(){
        return instancia;
    }
    public String recuperarCidade(String cep){
        return "Araraquara";
    }
    public String recuperarEstado(String cep){
        return "SP";
    }
}
