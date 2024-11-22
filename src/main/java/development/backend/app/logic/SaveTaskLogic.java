package development.backend.app.logic;

import development.backend.app.adapter.service.TaskService;
import development.backend.app.enums.StatusEnum;
import development.backend.app.model.RequestDTO;
import development.backend.app.model.TaskResponseDTO;
import development.backend.app.model.entity.Task;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import static development.backend.app.enums.MESSAGE_PREFIX.END_PROCESS;
import static development.backend.app.enums.MESSAGE_PREFIX.INIT_PROCESS;

@Slf4j
@AllArgsConstructor
public class SaveTaskLogic {

	protected TaskService taskService;

	public TaskResponseDTO<Task> Handle(RequestDTO<Task> request){
		log.info(INIT_PROCESS.getMessage(), "Handle");

		final var requestBody = request.getBody();

		var task = new Task();
		task.setPriority(requestBody.getPriority());
		task.setStatus(requestBody.getStatus());
		task.setDescription(requestBody.getDescription());
		task.setName(requestBody.getName());

		if (requestBody.getId() != null) {
			task.setId(requestBody.getId());
		}

		var serviceResponse = taskService.saveTask(task);

		var response = new TaskResponseDTO<Task>();
		response.setBody(serviceResponse);
		response.setStatus(StatusEnum.SUCCESS);

		log.info(END_PROCESS.getMessage(), "Handle");
		return response;
	}
}