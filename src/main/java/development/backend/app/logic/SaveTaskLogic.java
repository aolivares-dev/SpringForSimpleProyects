package development.backend.app.logic;

import development.backend.app.adapter.service.TaskService;
import development.backend.app.enums.StatusEnum;
import development.backend.app.resources.response.TaskResponseDTO;
import development.backend.app.model.entity.Task;
import development.backend.app.resources.request.TaskRequestDTO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static development.backend.app.enums.MESSAGE_PREFIX.END_PROCESS;
import static development.backend.app.enums.MESSAGE_PREFIX.INIT_PROCESS;

@Slf4j
@AllArgsConstructor
@NoArgsConstructor
@Service
public class SaveTaskLogic {
	
	@Autowired
	protected TaskService taskService;
	
	protected TaskResponseDTO<Iterable<Task>> ListResponse = new TaskResponseDTO<>();
	protected TaskResponseDTO<Task> response = new TaskResponseDTO<>();
	
	public TaskResponseDTO<Task> handle(TaskRequestDTO<Task> request) {
		log.info(INIT_PROCESS.getMessage(), "createTask");
		response = new TaskResponseDTO<>();
		Task task = request.getBody();
		var serviceResponse = taskService.createTask(task);
		
		response.setStatus(StatusEnum.SUCCESS);
		response.setBody(serviceResponse);
		
		
		log.info(END_PROCESS.getMessage(), "createTask");
		return response;
	}
	
	public TaskResponseDTO<Iterable<Task>> getTasks() {
		log.info(INIT_PROCESS.getMessage(), "getTasks");
		
		var serviceResponse = taskService.getTasks();
		
		ListResponse.setBody(serviceResponse);
		ListResponse.setStatus(StatusEnum.SUCCESS);
		
		log.info(END_PROCESS.getMessage(), "getTasks");
		return ListResponse;
	}
	
	public TaskResponseDTO<Task> getTask(Long id) {
		log.info(INIT_PROCESS.getMessage(), "getTask");
		
		try {
			var serviceResponse = taskService.getTask(id);
			
			response.setStatus(StatusEnum.SUCCESS);
			response.setBody(serviceResponse);
		} catch (Exception e) {
			response.setStatus(StatusEnum.ERROR);
			response.setBody(null);
			log.error("Error: ", e);
		}
		
		log.info(END_PROCESS.getMessage(), "getTask");
		return response;
	}
}
