package development.backend.app.adapter.service;

import development.backend.app.resources.request.TransactionRequestDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/execute-transaction")
public class ExecuteTransactionController {
	@PostMapping
	public void executeTransaction(@RequestBody TransactionRequestDTO request) {
	
	}
}
