package development.backend.app.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class GenericEntityDTO implements Serializable {

	@Serial
	private static final long serialVersionUID = 440486875159331423L;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	private String name;
	private String description;
	private String status;
	private String createdBy;
	private String updatedBy;
	private String createdAt;
	private String updatedAt;

}
