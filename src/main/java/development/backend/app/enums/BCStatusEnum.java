package development.backend.app.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;


@AllArgsConstructor
@Getter
public enum BCStatusEnum {
	SUCCESS("TXN-000", "Success", HttpStatus.OK),
	ERROR("TXN-001", "Error", HttpStatus.INTERNAL_SERVER_ERROR),
	NOT_FOUND("TXN-002", "Not Found", HttpStatus.NOT_FOUND),
	NO_CONTENT("TXN-003", "No Content", HttpStatus.NO_CONTENT),
	BAD_REQUEST("TXN-004", "Bad Request", HttpStatus.BAD_REQUEST);

	public final String code;
	public final String description;
	public final HttpStatus httpStatus;
}
