package vn.tqminh.application.business.impl;

import vn.tqminh.application.business.FirstValidator;
import vn.tqminh.application.core.AbstractChainValidator;
import vn.tqminh.application.core.Validator;
import vn.tqminh.domain.business.Test;

public class FirstValidatorImpl extends AbstractChainValidator<Test> implements FirstValidator{

	@Override
	public void validate(Test object) {
		
	}

	@Override
	public void nextValidator(Validator<Test> validator) {
		super.nextValidator(validator);
	}
}
