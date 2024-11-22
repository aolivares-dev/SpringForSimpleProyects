package development.backend.app.model;

import development.backend.app.enums.StatusEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TaskResponseDTO<T> extends RequestDTO<T> {
	private StatusEnum status;
}
