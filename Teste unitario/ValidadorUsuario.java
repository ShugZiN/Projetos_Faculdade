import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidadorUsuario {

    public boolean validarNomeUsuario(String nome) {
        return nome != null && nome.length() >= 3 && nome.length() <= 20;
    }

    public boolean validarEmail(String email) {
        return email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
    }

    public boolean validarSenha(String senha) {
        return senha != null
                && senha.length() >= 8
                && senha.matches(".*[A-Za-z].*")
                && senha.matches(".*\\d.*");
    }
}

// CLASSE DE TESTE

class ValidadorUsuarioTest {

    private ValidadorUsuario validador;

    @BeforeEach
    void setUp() {
        validador = new ValidadorUsuario();
    }

    // TESTES DE NOME

    @Test
    void testNomeValido() {
        assertTrue(validador.validarNomeUsuario("Otavio"));
        assertTrue(validador.validarNomeUsuario("Manu"));
    }

    @Test
    void testNomeMuitoCurto() {
        assertFalse(validador.validarNomeUsuario("Al"));
    }

    @Test
    void testNomeMuitoLongo() {
        assertFalse(validador.validarNomeUsuario("NomeMuitoGrandeExcedendoLimite"));
    }

    @Test
    void testNomeNulo() {
        assertFalse(validador.validarNomeUsuario(null));
    }

    // TESTES DOS EMAIL

    @Test
    void testEmailValido() {
        assertTrue(validador.validarEmail("teste@email.com"));
        assertTrue(validador.validarEmail("user123@gmail.com"));
    }

    @Test
    void testEmailSemArroba() {
        assertFalse(validador.validarEmail("testeemail.com"));
    }

    @Test
    void testEmailSemDominio() {
        assertFalse(validador.validarEmail("teste@"));
    }

    @Test
    void testEmailNulo() {
        assertFalse(validador.validarEmail(null));
    }

    // TESTES DAS SENHA

    @Test
    void testSenhaValida() {
        assertTrue(validador.validarSenha("Senha123"));
        assertTrue(validador.validarSenha("abc12345"));
    }

    @Test
    void testSenhaMuitoCurta() {
        assertFalse(validador.validarSenha("Ab1"));
    }

    @Test
    void testSenhaSemNumero() {
        assertFalse(validador.validarSenha("SomenteLetras"));
    }

    @Test
    void testSenhaSemLetra() {
        assertFalse(validador.validarSenha("12345678"));
    }

    @Test
    void testSenhaNula() {
        assertFalse(validador.validarSenha(null));
    }
}
