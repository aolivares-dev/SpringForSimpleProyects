package development.backend.app.resources.response;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AllowedResponseDTO {
	public Boolean allowed;
}
