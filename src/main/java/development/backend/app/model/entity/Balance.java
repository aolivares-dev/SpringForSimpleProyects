package development.backend.app.model.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long balanceID;
	private String clientID;
	private double balance;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
}
