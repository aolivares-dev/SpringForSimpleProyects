package development.backend.app.utils.async;

import org.junit.jupiter.api.Test;

public class Async {
	@Test
	void run() {
		Runnable runnable = () -> {
			System.out.println("Hello from thread: " + Thread.currentThread().getName());
		};
		new Thread(runnable).start();
	}
}
