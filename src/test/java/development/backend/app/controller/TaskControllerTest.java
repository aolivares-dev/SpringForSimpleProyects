package development.backend.app.controller;

import development.backend.app.adapter.service.TaskService;
import development.backend.app.adapter.service.TaskServiceImpl;
import development.backend.app.enums.StatusEnum;
import development.backend.app.logic.SaveTaskLogic;
import development.backend.app.resources.request.TaskRequestDTO;
import development.backend.app.resources.response.TaskResponseDTO;
import development.backend.app.model.entity.Task;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TaskControllerTest {

	@Mock
	private TaskService taskLogic; // Inyección de dependencias en SaveTaskLogic

	@InjectMocks
	private TaskController taskController;

	private Task task;

	private TaskRequestDTO<Task> request;

	@BeforeEach
	void setUp() {
		// Configuración de un Task de ejemplo
		task = Task.builder()
			       .name("Normal Name")
			       .status(1)
			       .priority(1)
			       .description("descricion sjak")
			       .build();

		// Configuración de un TaskRequestDTO de ejemplo
		request = new TaskRequestDTO<>();
		request.setBody(task);

	}

	@Test
	void createTask() {
		// Crear el objeto esperado
		var expected = new TaskResponseDTO<Task>();
		expected.setBody(task);
		expected.setStatus(StatusEnum.SUCCESS);

		// Configurar el comportamiento de los mocks
		when(taskLogic.createTask(request.getBody())).thenReturn(expected.getBody()); // Uso correcto de `when`

		// Crear la request simulada
		var mockRequestController = request;

		// Ejecutar la lógica a probar
		var response = taskController.createTask(mockRequestController);

		// Validar el resultado
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertNotNull(response.getBody());
		assertEquals(expected.getBody(), response.getBody().getBody());
	}


}
