/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.codemasters.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.kodigo.codemasters.dto.UserRegistrationForm;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, UserRegistrationForm> {

    @Override
    public boolean isValid(final UserRegistrationForm user, final ConstraintValidatorContext context) {
            return user.getPassword().equals(user.getMatchingPassword());
    }

}