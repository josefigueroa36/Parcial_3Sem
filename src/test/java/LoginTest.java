import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

	Login login  = new Login();
	
	@Test
	void testIngresoCorrecto() {
		assertTrue(login.Ingresar("admin", "admin"));
	}
	
	@Test
	void testUsuarioInconrrecto() {
		assertFalse(login.Ingresar("Admin", "admin"), "Usuario Incorrecto");
	}
	
	@Test
	void testContraseniaIncorrecta() {
		assertFalse(login.Ingresar("admin", "442200"), "Contraseña Incorrecta");
	}
	
	@Test
	void testIngresoIncorrecto() {
		assertFalse(login.Ingresar("Admin", "442200"), "Usuario y Contraseña incorrectos");
	}
	
	
	
}
