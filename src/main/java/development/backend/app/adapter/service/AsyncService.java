package development.backend.app.adapter.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Slf4j
@Service
public class AsyncService {

	@Async("taskExecutor")
	public CompletableFuture<String> performAsyncTask() {
		log.info("Inicio de tarea asíncrona...");
		try {
			Thread.sleep(3000); // Simula un proceso largo
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		log.info("Fin de tarea asíncrona.");
		return CompletableFuture.completedFuture("Tarea completada");
	}
}
