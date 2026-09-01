package Users;

public class Tutor{
    private String nome;
    private int idade;
    private String sexo;
    private int qtdPets;

    public Tutor (){};

    public Tutor (String nome, int idade, String sexo, int qtdPets) {
        this.idade = idade;
        this.nome = nome;
        this.sexo = sexo;
        this.qtdPets = qtdPets;

    }

    public String getNome() {

        return nome;
    }

    public Tutor setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public int getIdade() {
        return idade;
    }

    public Tutor setIdade(int idade) {
        this.idade = idade;
        return this;
    }

    public String getSexo() {
        return sexo;
    }

    public Tutor setSexo(String sexo) {
        this.sexo = sexo;
        return this;
    }

    public int getQtdPets() {
        return qtdPets;
    }

    public Tutor setQtdPets(int qtdPets) {
        this.qtdPets = qtdPets;
        return this;
    }

    public void ExibirDados (){
       System.out.println("\n =============================================== \n Nome do Tutor: " + getNome() + "\n ==============================================="+" \n Idade do Tutor: " + getIdade() + " Anos "+"\n ==============================================="+"\n Sexo do tutor: " +getSexo()+ "\n ==============================================="+"\n Quantidade de pets do Tutor: " +getQtdPets()+ "\n ===============================================");
    }

}
