package one.digitalinovaton.gof.gof.Facade;
import sub_sistema1.crm.Crm_Service;


public class Facade {
    public void migrarCliente (String nome, String cep){
        String cidade = sub_sistema2.cep.getInstancia().recuperarCidade(cep);
        String estado = sub_sistema2.cep.getInstancia().recuperarEstado(cep);

        Crm_Service.gravarCliente(nome, cep, cidade, estado);
    }
}
