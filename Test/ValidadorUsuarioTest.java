
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorUsuarioTest {
    // arrange - Preparação da classe a ser testada
    private final ValidadorUsuario usuario = new ValidadorUsuario();

    @Test
    void TesteNomeCurto(){
        assertFalse(usuario.validarSenha("ya"));

    }
    @Test
    void TesteEmailSemArroba(){
        assertTrue(usuario.validarEmail("otaviano@sil.com.br"));
    }
    @Test
    void TesteSenha(){
        assertTrue(usuario.validarEmail("Aasaqqweq*12"));
    }
}
