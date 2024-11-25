package development.backend.app.resources.response;

import development.backend.app.resources.request.GenericRequestDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GenericResponseDTO<T> extends GenericRequestDTO<T> {
	private StatusResponseDTO status;
}
