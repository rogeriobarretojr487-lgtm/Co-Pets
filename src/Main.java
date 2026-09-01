import java.util.Scanner;

import Cadastro.Cadastro;
import Users.Tutor;
import Users.Pets;
import Finance.Reserva;
import Finance.ReservaEmergencial;
import Finance.ReservaSaude;
import Finance.ReservaAlimentação;
import Finance.ReservaBemEstar;

public class Main {
    public static void main(String [] args){
  Tutor Tutor = new Tutor();
  Pets Pet = new Pets();
  Scanner leitor = new Scanner(System.in);
  String painel;
  Cadastro Tabela = new Cadastro();
  ReservaBemEstar reservaBemEstar = new ReservaBemEstar();
  ReservaAlimentação reservaAlimentação = new ReservaAlimentação();
  ReservaSaude reservaSaude = new ReservaSaude();
  ReservaEmergencial reservaEmergencial = new ReservaEmergencial();

  do {
      Tabela.ExibirCadastro();
      painel = leitor.next() + leitor.nextLine();

      switch (painel){
          case "Cadastrar":
              System.out.println("Digite o nome completo do tutor: ");
              Tutor.setNome(leitor.next()+leitor.nextLine());
              System.out.println("Digite a  idade do tutor: ");
              Tutor.setIdade(leitor.nextInt());
              System.out.println("Digite o sexo do tutor: ");
              Tutor.setSexo(leitor.next()+leitor.nextLine());
              System.out.println("Digite a quantidade de pets do tutor: ");
              Tutor.setQtdPets(leitor.nextInt());
              break;

          case "Adicionar Pet":
              System.out.println("Digite o nome do pet: ");
              Pet.setNome(leitor.next() + leitor.nextLine());
              System.out.println("Digite a idade do pet: ");
              Pet.setIdade(leitor.nextInt());
              System.out.println("Digite a raça do pet: ");
              Pet.setRaça(leitor.next() + leitor.nextLine());
              break;

          case "Reservas":
              System.out.println("\n Reserva de saúde: ");
              reservaSaude.ExibirReserva();
              System.out.println("\n Reserva de bem estar: ");
              reservaBemEstar.ExibirReserva();
              System.out.println("\n Reserva emergencial: ");
              reservaEmergencial.ExibirReserva();
              System.out.println("\n Reserva de alimentação: ");
              reservaAlimentação.ExibirReserva();
              break;

          case "Saúde":
              System.out.println("Quanto deseja depositar? ");
              reservaSaude.Deposito(leitor.nextDouble());
              System.out.println("Desejar realizar uma retirada? \n (Digite Sim ou Não):  ");
              String RetiradaSaude = leitor.next() + leitor.nextLine();
              if (RetiradaSaude.equals("Sim")){
                  System.out.println("Digite o valor que deseja retirar da conta: ");
                  reservaSaude.Retirado(leitor.nextDouble());
              }
              else if (RetiradaSaude.equals("Não")){
                  System.out.println("Quem sabe na proxima. ");}
              break;

          case "Emergencial":
              System.out.println("Quanto deseja depositar? ");
              reservaEmergencial.Deposito(leitor.nextDouble());
              System.out.println("Desejar realizar uma retirada? \n (Digite Sim ou Não):  ");
              String RetiradaEmergencial = leitor.next() + leitor.nextLine();
              if (RetiradaEmergencial.equals("Sim")){
                  System.out.println("Digite o valor que deseja retirar da conta: ");
                  reservaEmergencial.Retirado(leitor.nextDouble());
              }
              else if (RetiradaEmergencial.equals("Não")){
                  System.out.println("Quem sabe na proxima. ");}
              break;

          case "Bem estar":
              System.out.println("Quanto deseja depositar? ");
              reservaBemEstar.Deposito(leitor.nextDouble());
              System.out.println("Desejar realizar uma retirada? \n (Digite Sim ou Não):  ");
              String RetiradaBemEstar = leitor.next() + leitor.nextLine();
              if (RetiradaBemEstar.equals("Sim")){
                  System.out.println("Digite o valor que deseja retirar da conta: ");
                  reservaBemEstar.Retirado(leitor.nextDouble());
              }
              else if (RetiradaBemEstar.equals("Não")){
                  System.out.println("Quem sabe na proxima. ");}
              break;

          case "Alimentação":
              System.out.println("Quanto deseja depositar? ");
              reservaAlimentação.Deposito(leitor.nextDouble());
              System.out.println("Desejar realizar uma retirada? \n (Digite Sim ou Não):  ");
              String RetiradaAlimentacao = leitor.next() + leitor.nextLine();
              if (RetiradaAlimentacao.equals("Sim")){
                  System.out.println("Digite o valor que deseja retirar da conta: ");
                  reservaAlimentação.Retirado(leitor.nextDouble());
              }
              else if (RetiradaAlimentacao.equals("Não")){
                  System.out.println("Quem sabe na proxima. ");}
              break;

          case "Exibir Tutor":
              Tutor.ExibirDados();
              break;

          case "Exibir Pet":
              Pet.DadosPet();
              break;

          case "Sair":
              System.out.println("Obrigado por utilizar o Co-Pets, até a proxima.");
              break;

          default:
              System.out.println ("Opção invalida, tente novamente.");

      }
  } while (!painel.equals("Sair"));
  leitor.close();
 }
}