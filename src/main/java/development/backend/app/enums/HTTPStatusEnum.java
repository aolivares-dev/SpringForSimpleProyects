package development.backend.app.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;


@AllArgsConstructor
@Getter
public enum HTTPStatusEnum {
	SUCCESS("Success", HttpStatus.OK),
	ERROR("Error", HttpStatus.INTERNAL_SERVER_ERROR),
	NOT_FOUND("Not Found", HttpStatus.NOT_FOUND),
	NO_CONTENT("No Content", HttpStatus.NO_CONTENT),
	BAD_REQUEST("Bad Request", HttpStatus.BAD_REQUEST);
	
	private final String message;
	private final HttpStatus httpStatus;
}
