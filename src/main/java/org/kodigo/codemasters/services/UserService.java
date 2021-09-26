package org.kodigo.codemasters.services;

import org.kodigo.codemasters.dto.LocalUser;
import org.kodigo.codemasters.dto.UserRegistrationForm;
import org.kodigo.codemasters.exception.UserAlreadyExistAuthenticationException;
import java.util.Map;

import org.springframework.security.oauth2.core.oidc.OidcIdToken;
import org.springframework.security.oauth2.core.oidc.OidcUserInfo;
import org.kodigo.codemasters.model.User;


/**
 *
 * @author Danny
 */
public interface UserService {

	public User registerNewUser(UserRegistrationForm UserRegistrationForm) throws UserAlreadyExistAuthenticationException;
	User findUserByEmail(String email);
	LocalUser processUserRegistration(String registrationId, Map<String, Object> attributes, OidcIdToken idToken, OidcUserInfo userInfo);
}
