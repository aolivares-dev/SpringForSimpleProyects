package development.backend.app.controller;

import development.backend.app.adapter.service.TaskService;
import development.backend.app.enums.MESSAGE_PREFIX;
import development.backend.app.enums.StatusEnum;
import development.backend.app.logic.SaveTaskLogic;
import development.backend.app.resources.request.TaskRequestDTO;
import development.backend.app.resources.response.TaskResponseDTO;
import development.backend.app.model.entity.Task;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/task")
@RequiredArgsConstructor
public class TaskController {
	@Autowired
	private TaskService logic;
	
	private final TaskResponseDTO<Task> response = new TaskResponseDTO<>();
	
	@PostMapping
	public ResponseEntity<TaskResponseDTO<Task>> createTask(@RequestBody TaskRequestDTO<Task> request) {
		
		log.info(MESSAGE_PREFIX.INIT_PROCESS.getMessage(), "createTask");
		
		var task = logic.createTask(request.getBody());
		
		response.setBody(task);
		response.setStatus(StatusEnum.SUCCESS);
		
		log.info(MESSAGE_PREFIX.END_PROCESS.getMessage(), "createTask");
		
		return ResponseEntity.ok(response);
	}
}
