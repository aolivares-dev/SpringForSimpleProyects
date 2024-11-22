package development.backend.app.adapter.service;


import development.backend.app.model.entity.Task;
import org.springframework.stereotype.Service;

@Service
public interface TaskService {
	Task createTask(Task task);
	
	Task getTask(Long id);
	
	Iterable<Task> getTasks();
}
