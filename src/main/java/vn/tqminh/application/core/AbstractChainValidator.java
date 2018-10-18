package vn.tqminh.application.core;

public class AbstractChainValidator<T> {
	
	protected Validator<T> validator;
	
	protected void nextValidator(Validator<T> validator) {
		this.validator = validator;
	}
	
}
