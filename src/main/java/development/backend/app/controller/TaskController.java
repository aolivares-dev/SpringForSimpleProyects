package development.backend.app.controller;

import development.backend.app.adapter.service.TaskService;
import development.backend.app.enums.MESSAGE_PREFIX;
import development.backend.app.logic.SaveTaskLogic;
import development.backend.app.model.TaskRequestDTO;
import development.backend.app.model.TaskResponseDTO;
import development.backend.app.model.entity.Task;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@Slf4j
@RestController
@RequestMapping("/api/v1/task")
@RequiredArgsConstructor
public class TaskController {

	private TaskService taskService;

	private SaveTaskLogic logic;

	// Endpoint para crear una nueva tarea
	@PostMapping
	public ResponseEntity<TaskResponseDTO<Task>> createTask(@RequestBody HttpEntity<TaskRequestDTO<Task>> request) {

		log.info(MESSAGE_PREFIX.INIT_PROCESS.getMessage(), "createTask");
		if(Objects.isNull(request.getBody())){
			return ResponseEntity.badRequest().build();
		}

		log.info(MESSAGE_PREFIX.END_PROCESS.getMessage(), request.getBody().getBody().toString());

		return ResponseEntity.ok(logic.Handle(request.getBody()));
	}


}