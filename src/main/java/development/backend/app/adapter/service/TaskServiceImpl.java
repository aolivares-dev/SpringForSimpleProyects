package development.backend.app.adapter.service;

import development.backend.app.enums.MESSAGE_PREFIX;
import development.backend.app.model.entity.Task;
import development.backend.app.model.repository.TaskRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class TaskServiceImpl implements TaskService {

	@Autowired
	private TaskRepository taskRepository;

	@Override
	public Task saveTask(Task task) {
		log.info(MESSAGE_PREFIX.INIT_PROCESS.getMessage(), "saveTask");
		if (task.getId() != null) {
			log.info(MESSAGE_PREFIX.END_PROCESS_WITH_RESULT.getMessage(), "Update", task.getId());
		} else {
			log.info(MESSAGE_PREFIX.END_PROCESS.getMessage(), "Save");
		}
		return taskRepository.save(task);
	}
}
