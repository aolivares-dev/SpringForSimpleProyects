package development.backend.app.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long clientID;
	private String name;
	private String email;
	private Long profileID;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
}
