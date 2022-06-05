package in.com.app.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Person {

	@NotNull
	@Size(min = 4, max = 8)
	private String name;

	@NotNull
	@Min(18)
	private Integer age;
}
