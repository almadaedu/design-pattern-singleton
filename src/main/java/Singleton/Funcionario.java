package Singleton;

public class Funcionario {

    private Funcionario() {};
    private static Funcionario instance = new Funcionario();
    public static Funcionario getInstance() {
        return instance;
    }

    private String nomeFuncionario;
    private String cargoFuncionario;

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getCargoFuncionario() {
        return cargoFuncionario;
    }

    public void setCargoFuncionario(String cargoFuncionario) {
        this.cargoFuncionario = cargoFuncionario;
    }

    public String mostrarCargoFuncionario() {
        return "O cargo deste funcionário é " + this.cargoFuncionario;
    }
}