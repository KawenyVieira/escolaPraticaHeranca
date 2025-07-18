public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    //metodos especificos da classe
    public void cancelarMatricula(){
        System.out.println(getNome() +" do curso "+ this.curso +", cancelou matricula");
    }

    //metodos get e set
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
