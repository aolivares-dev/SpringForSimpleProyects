package development.backend.app.controller;

import development.backend.app.adapter.service.AsyncService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;
@Slf4j
@RestController
@RequestMapping("/api")
public class AsyncController {

	@Autowired
	private AsyncService myAsyncService;

	@GetMapping("/executeAsync")
	public String executeAsync() {
		CompletableFuture<String> result = myAsyncService.performAsyncTask();
		log.info("Método de controlador ha terminado su ejecución y ha devuelto el control al hilo principal.");
		return "Petición aceptada. Se ha iniciado una tarea asíncrona.";
	}
}