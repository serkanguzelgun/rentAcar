package kodlama.io.rentACar.core.utilities.exceptions;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ValidaitonProblemDetails extends ProblemDetails {
	private Map<String, String> validationErrors;
}
