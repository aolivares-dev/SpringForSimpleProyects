package development.backend.app.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum MESSAGE_PREFIX {
	INIT_PROCESS("Init process for: {}"),
	EXCEPTION("Exception for: {}"),
	END_PROCESS("End process for: {}"),
	END_PROCESS_WITH_RESULT("End process for: {} with result: {}");

	private final String message;
}
