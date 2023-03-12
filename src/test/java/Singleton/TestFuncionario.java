package Singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestFuncionario {
    @Test
    public void retornaNome(){
        Funcionario.getInstance().setNomeFuncionario("José");
        assertEquals("José", Funcionario.getInstance().getNomeFuncionario());
    }

    @Test
    public void retornaCargo(){
        Funcionario.getInstance().setCargoFuncionario("Desenvolvedor");
        assertEquals("Desenvolvedor", Funcionario.getInstance().getCargoFuncionario());
    }

    @Test
    public void retornaMostrarCargo(){
        Funcionario.getInstance().setCargoFuncionario("Desenvolvedor");
        assertEquals(
                "O cargo deste funcionário é " + Funcionario.getInstance().getCargoFuncionario(),
                Funcionario.getInstance().mostrarCargoFuncionario()
        );
    }
}
