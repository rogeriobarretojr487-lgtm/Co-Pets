package Finance;

public class ReservaEmergencial extends Reserva{
   public ReservaEmergencial(){
       super();
   }

    public ReservaEmergencial(double fundo) {
        super(fundo);
    }

    @Override
    public void Deposito(double deposito) {
        super.Deposito(deposito);
    }

    @Override
    public void Retirado(double retirado) {
        if (ReservaEmergencial.super.getFundo()-(retirado) > 1000){   double novoFundo = getFundo() - retirado;
            double novovalor = getFundo() - retirado;
            setFundo(novovalor);
            System.out.println("Retirada realizada com sucesso \n Novo valor disponivel R$ "+getFundo()+" Reais.");
        }
        else {
            System.out.println("Não foi possivel realizar a retirada, a reserva emergencial foi ativada.");
            }
        }

    @Override
    public void ExibirReserva()
    {System.out.println("O saldo atual da reserva emergencial é de R$ "+super.getFundo()+ " Reais");}
}
