package development.backend.app.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class RequestDTO<T> {

	@JsonProperty("body")
	private T body;
}