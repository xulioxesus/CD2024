Se necesita desarrollar una clase llamada ValidadorContraseña, que verifique si una contraseña cumple con los siguientes criterios:

    Debe tener al menos 8 caracteres.
    Debe contener al menos una letra mayúscula.
    Debe contener al menos una letra minúscula.
    Debe contener al menos un número.
    Debe contener al menos un carácter especial (!@#$%^&*).

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorContraseñaTest {

    @Test
    void testContraseñaDebeTenerAlMenosOchoCaracteres() {
        ValidadorContraseña validador = new ValidadorContraseña();
        assertFalse(validador.esValida("Ab1!")); // Demasiado corta
        assertTrue(validador.esValida("Abcd123!")); // Cumple con la longitud
    }
}
```