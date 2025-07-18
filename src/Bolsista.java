public class Bolsista extends Aluno{
    private float bolsa;
    private boolean statusBolsa;

    //metodos especificos da classe
    public void renovarBolsa(){
        if (statusBolsa) {
            System.out.println("renovada a bolsa de " +this.bolsa+"% do aluno "+ this.getNome());
        }else {
            System.out.println("Bolsa do aluno "+ this.getNome()+ " nao foi renovada");
        }
    }

    //metodos get e set
    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    public boolean isStatusBolsa() {
        return statusBolsa;
    }

    public void setStatusBolsa(boolean statusBolsa) {
        this.statusBolsa = statusBolsa;
    }
}
