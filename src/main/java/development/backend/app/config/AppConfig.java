package development.backend.app.config;
import development.backend.app.adapter.service.TaskService;
import development.backend.app.adapter.service.TaskServiceImpl;
import development.backend.app.model.repository.TaskRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
	@Bean
	@Primary
	public TaskService taskService(TaskRepository taskRepository) {
		return new TaskServiceImpl(taskRepository);
	}
}
