package development.backend.app.adapter.service;

import development.backend.app.enums.MESSAGE_PREFIX;
import development.backend.app.model.entity.Task;
import development.backend.app.model.repository.TaskRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@AllArgsConstructor
public class TaskServiceImpl implements TaskService {

	@Autowired
	private TaskRepository taskRepository;

	@Override
	public Task createTask(Task task) {
		return taskRepository.save(task);
	}
	
	@Override
	public Task getTask(Long id) {
		log.info(MESSAGE_PREFIX.INIT_PROCESS.getMessage(), "getTask");
		
		Optional<Task> response = taskRepository.findById(id);
		
		if (response.isPresent()) {
			log.info(MESSAGE_PREFIX.END_PROCESS_WITH_RESULT.getMessage(), "getTask", response.get().getId());
			return response.get();
		}
		
		log.info(MESSAGE_PREFIX.END_PROCESS_WITH_RESULT.getMessage(), "getTask", "null");
		return null;
	}
	
	@Override
	public Iterable<Task> getTasks() {
		log.info(MESSAGE_PREFIX.INIT_PROCESS.getMessage(), "getTasks");
		
		return taskRepository.findAll();
	}
}
