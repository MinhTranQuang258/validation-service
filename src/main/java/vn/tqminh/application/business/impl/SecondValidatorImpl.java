package vn.tqminh.application.business.impl;

import vn.tqminh.application.business.SecondValidator;
import vn.tqminh.application.core.AbstractChainValidator;
import vn.tqminh.application.core.Validator;
import vn.tqminh.domain.business.Test;

public class SecondValidatorImpl extends AbstractChainValidator<Test> implements SecondValidator{

	@Override
	public void validate(Test object) {
		
	}

	@Override
	public void nextValidator(Validator<Test> validator) {
		super.nextValidator(validator);
	}

}
