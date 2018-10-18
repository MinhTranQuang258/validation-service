package vn.tqminh.application.core;

public interface Validator<T> {

	void nextValidator(Validator<T> validator);
	
	void validate(T object);
	
}
