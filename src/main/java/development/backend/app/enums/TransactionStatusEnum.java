package development.backend.app.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TransactionStatusEnum {
	
	PENDING("001", "Transaction is pending"),
	
	COMPLETED("002", "Transaction is completed"),
	
	CANCELED("003", "Transaction is canceled"),
	
	FAILED("004", "Transaction is failed");
	
	private final String code;
	private final String message;
	
}
