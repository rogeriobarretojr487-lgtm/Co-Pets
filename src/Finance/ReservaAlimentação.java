package Finance;

public class ReservaAlimentação extends Reserva {

    public ReservaAlimentação() {
        super();
    }

    public ReservaAlimentação(double fundo) {
        super(fundo);
    }

    @Override
    public void Deposito(double Deposito) {
        super.Deposito(Deposito);
    }

    @Override
    public void Retirado(double Retirado) {
        if (ReservaAlimentação.super.getFundo() - (Retirado) > 200) {
            double novovalor = getFundo() - Retirado;
            setFundo(novovalor);
            System.out.println("Retirada realizada com sucesso \n Novo valor disponivel R$ "+getFundo()+" Reais.");
        } else {
            System.out.println("Não foi possivel realizar a retirada, a reserva emergencial foi ativada.");
        }
    }

    @Override
    public void ExibirReserva() {
        {System.out.println("O saldo atual da reserva de Alimentação é de R$ " + super.getFundo() + " Reais");}
    }
}
