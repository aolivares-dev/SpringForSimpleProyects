package development.backend.app.adapter.service;

import development.backend.app.model.entity.Task;
import development.backend.app.model.repository.TaskRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TaskServiceImplTest {

	@Mock
	private TaskRepository taskRepository;

	@InjectMocks
	private TaskServiceImpl taskService;

	private Task taskModel;

	@BeforeEach
	void setUp() {
		taskModel = Task.builder().id(1L).name("Normal Name").status(1).priority(1).description("descricion sjak").build();

		when(taskRepository.save(any())).thenReturn(taskModel);
	}

	@Test
	void saveTask() {

		var response = taskService.saveTask(taskModel);

		Assertions.assertNotNull(response);

		assertEquals(response.getName(), taskModel.getName());
	}
}
