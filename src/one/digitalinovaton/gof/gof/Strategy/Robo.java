package one.digitalinovaton.gof.gof.Strategy;

public class Robo {
    private Comportamento comportamento;
    public void setComportamento(Comportamento comportamento){
        comportamento=comportamento;
    }
    public void mover(){
        comportamento.mover();
    }
}
