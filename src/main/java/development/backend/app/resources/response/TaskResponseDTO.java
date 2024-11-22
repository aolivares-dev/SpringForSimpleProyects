package development.backend.app.resources.response;

import development.backend.app.enums.StatusEnum;
import development.backend.app.resources.request.GeneriicRequestDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TaskResponseDTO<T> extends GeneriicRequestDTO<T> {
	private StatusEnum status;
}
