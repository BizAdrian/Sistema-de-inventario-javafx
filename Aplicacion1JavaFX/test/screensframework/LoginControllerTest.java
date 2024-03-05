package screensframework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginControllerTest {

    private LoginController loginController;

    @BeforeEach
    public void setUp() {
        loginController = new LoginController();
    }

    @Test
    public void testValidarVacios() {
        // Prueba cuando el campo está vacío
        assertFalse(loginController.validation.validarVacios("", "USUARIO"));

        // Prueba cuando el campo no está vacío
        assertTrue(loginController.validation.validarVacios("usuario123", "USUARIO"));
    }

    @Test
    public void testValidarMaximo() {
        // Prueba cuando el campo excede la longitud máxima
        assertFalse(loginController.validation.validarMaximo("usuario12345678901234567890", "USUARIO", 20, 2));

        // Prueba cuando el campo cumple con la longitud máxima
        assertTrue(loginController.validation.validarMaximo("usuario123", "USUARIO", 20, 2));
    }

    @Test
    public void testIniciarSesionUsuarioValido() {
        // Simulamos que existe un usuario válido en la base de datos
        boolean existeUsuario = true;

        // Llamamos al método iniciarSesion
        loginController.tfUsuario.setText("usuarioValido");
        loginController.tfPass.setText("contrasenaValida");
        loginController.iniciarSesion(null);

        // Verificamos que se haya limpiado el campo de usuario y contraseña
        assertEquals("", loginController.tfUsuario.getText());
        assertEquals("", loginController.tfPass.getText());
    }

    @Test
    public void testIniciarSesionUsuarioNoRegistrado() {
        // Simulamos que no existe el usuario en la base de datos
        boolean existeUsuario = false;

        // Llamamos al método iniciarSesion
        loginController.tfUsuario.setText("usuarioNoRegistrado");
        loginController.tfPass.setText("contrasenaInvalida");
        loginController.iniciarSesion(null);

        // Verificamos que los campos no se hayan limpiado (usuario no registrado)
        assertNotEquals("", loginController.tfUsuario.getText());
        assertNotEquals("", loginController.tfPass.getText());
    }
}
