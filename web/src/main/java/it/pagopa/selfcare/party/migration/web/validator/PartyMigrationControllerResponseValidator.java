package it.pagopa.selfcare.party.migration.web.validator;

import it.pagopa.selfcare.commons.web.validator.ControllerResponseValidator;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.Validator;

@Aspect
@Component
public class PartyMigrationControllerResponseValidator extends ControllerResponseValidator {

    @Autowired
    public PartyMigrationControllerResponseValidator(Validator validator) {
        super(validator);
    }

    @Override
    @Pointcut("execution(* it.pagopa.selfcare.party.migration.web.controller.*.*(..))")
    public void controllersPointcut() {
        // Do nothing because is a pointcut
    }

}
