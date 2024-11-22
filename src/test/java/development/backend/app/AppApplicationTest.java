package development.backend.app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class AppApplicationTest {

	@Test
	void contextLoads() {
		// Verificar que el contexto de Spring se carga correctamente.
		assertTrue(true, "El contexto de la aplicación se cargó exitosamente");
	}
}
