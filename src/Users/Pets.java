package Users;

public class Pets {
    private String nome;
    private String raça;
    private int idade;

    public Pets (){}

    public Pets(String nome, String raça, int idade) {
        this.nome = nome;
        this.raça = raça;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Pets setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getRaça() {
        return raça;
    }

    public Pets setRaça(String raça) {
        this.raça = raça;
        return this;
    }

    public int getIdade() {
        return idade;
    }

    public Pets setIdade(int idade) {
        this.idade = idade;
        return this;
    }

    public void DadosPet (){
        System.out.println("\n ===============================================\n Nome do Pet: " + getNome() + "\n ==============================================="+" \n Idade do Pet: " + getIdade() + " Anos "+ "\n ==============================================="+"\n Raça do Pet: " +getRaça()+ "\n ===============================================");
    }
}
