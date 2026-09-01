package Finance;

public class ReservaSaude extends Reserva{
    public ReservaSaude() {
        super();
    }

    public ReservaSaude(double fundo) {
        super(fundo);
    }

    @Override
    public void Deposito(double Deposito) {
        super.Deposito(Deposito);
    }

    @Override
    public void Retirado(double Retirado) {
        if (ReservaSaude.super.getFundo()-(Retirado) > 600){
            double novovalor = getFundo() - Retirado;
            setFundo(novovalor);
            System.out.println("Retirada realizada com sucesso \n Novo valor disponivel R$ "+getFundo()+" Reais.");}
        else {
            System.out.println("Não foi possivel realizar a retirada, a reserva emergencial foi ativada.");
        }
    }

    @Override
    public void ExibirReserva() {
        {System.out.println("O saldo atual de Saúde é de R$ "+super.getFundo()+ " Reais");}
    }
}
