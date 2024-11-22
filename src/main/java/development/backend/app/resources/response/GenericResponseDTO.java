package development.backend.app.resources.response;

import development.backend.app.resources.request.GeneriicRequestDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GenericResponseDTO<T> extends GeneriicRequestDTO<T> {
	private StatusResponseDTO status;
}
