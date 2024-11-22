package development.backend.app.logic;

import development.backend.app.adapter.service.TaskServiceImpl;
import development.backend.app.enums.StatusEnum;
import development.backend.app.model.TaskRequestDTO;
import development.backend.app.model.entity.Task;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SaveTaskLogicTest {

	@Mock
	private TaskServiceImpl taskService; // Mock del servicio

	@InjectMocks
	private SaveTaskLogic saveTaskLogic; // Inyección de dependencias en SaveTaskLogic

	private Task task;
	private TaskRequestDTO<Task> request;

	@BeforeEach
	void setUp() {
		// Configuración de un Task de ejemplo
		task = Task.builder()
			       //.id(1L)
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
	void handle() {
		// Configuración del comportamiento del mock
		when(taskService.saveTask(any(Task.class))).thenReturn(task);
		// Verifica la funcionalidad de SaveTaskLogic
		var logicResponse = saveTaskLogic.Handle(request);

		assertNotNull(logicResponse);
		assertEquals(task, logicResponse.getBody());
		assertEquals(StatusEnum.SUCCESS, logicResponse.getStatus());

		// Verifica que el repositorio fue llamado
		//verify(taskService, times(1)).saveTask(task);
	}
}
