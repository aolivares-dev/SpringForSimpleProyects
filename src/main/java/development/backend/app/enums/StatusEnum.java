package development.backend.app.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;


@AllArgsConstructor
@Getter
public enum StatusEnum {
	SUCCESS(1, "Success", HttpStatus.OK),
	ERROR(2, "Error", HttpStatus.INTERNAL_SERVER_ERROR),
	NOT_FOUND(3, "Not Found", HttpStatus.NOT_FOUND),
	NO_CONTENT(4, "No Content", HttpStatus.NO_CONTENT),
	BAD_REQUEST(5, "Bad Request", HttpStatus.BAD_REQUEST);

	private final int code;
	private final String description;
	private final HttpStatus httpStatus;
}
