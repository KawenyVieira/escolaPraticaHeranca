public abstract class Pessoa {
    //Clase principal ou raiz, abstrata ou seja nao ser instanciada

    private String nome;
    private int idade;
    private String sexo;

    // metodos em comum
    public void fazerAniversario(){
        this.idade ++;
        System.out.println("A idade atual de " + this.nome +" é "+this.idade);
    }

    //metodos especiais

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
