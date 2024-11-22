package development.backend.app.model.entity;

import lombok.Data;
import lombok.Builder;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Balance {
	private String clientID;
	private double balance;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
}
