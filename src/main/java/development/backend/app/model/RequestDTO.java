package development.backend.app.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class RequestDTO<T> {
	private T body;
}
