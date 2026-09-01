package Finance;

public abstract class  Reserva {
    private double fundo;

    public Reserva(){}

    public Reserva(double fundo){
        this.fundo = fundo;
    }

    public double getFundo() {
        return fundo;
    }
    public void setFundo(double fundo){
        this.fundo = fundo;
    }

    public void Deposito(double deposito) {
     if (deposito != 0){
           fundo += deposito;
           System.out.println("Você efetuou um deposito na reserva do seu pet");}
     else {
         System.out.println("Não ouve qualquer deposito no fundo");
     }
    }

    public void Retirado(double retirado){
        if (retirado != 0) {
            System.out.println("Você efetuou uma retirada na reserva do seu pet");}
        else {
            System.out.println("Não ouve qualquer retirada no fundo");
        }
    }
    public abstract void ExibirReserva();
}
