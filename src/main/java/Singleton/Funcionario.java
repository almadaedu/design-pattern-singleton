package Singleton;

public class Funcionario {

    private Funcionario() {};
    private static Funcionario instance = new Funcionario();
    public static Funcionario getInstance() {
        return instance;
    }

    private String nome;
    private String cargo;

    public String getNomeFuncionario() {
        return nome;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nome = nomeFuncionario;
    }

    public String getCargoFuncionario() {
        return cargo;
    }

    public void setCargoFuncionario(String cargoFuncionario) {
        this.cargo = cargoFuncionario;
    }

    public String mostrarCargoFuncionario() {
        return "O cargo deste funcionário é " + this.cargo;
    }
}