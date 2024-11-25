package development.backend.app.resources.response;

import development.backend.app.enums.HTTPStatusEnum;
import development.backend.app.resources.request.GenericRequestDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TaskResponseDTO<T> extends GenericRequestDTO<T> {
	private HTTPStatusEnum status;
}
