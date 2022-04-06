public class Funcionário {

    String nome;
    String CPF;
    String cargo;

    public Funcionário(String nome, String CPF, String cargo) {
        this.nome = nome;
        this.CPF = CPF;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
