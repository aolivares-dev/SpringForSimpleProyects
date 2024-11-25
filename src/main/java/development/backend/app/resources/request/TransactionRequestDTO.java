package development.backend.app.resources.request;

import development.backend.app.model.entity.Account;
import development.backend.app.model.entity.Profile;
import development.backend.app.model.entity.Transaction;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionRequestDTO {
	private Profile profile;
	private Account debitAccount;
	private Account creditAccount;
	private Transaction transaction;
}
