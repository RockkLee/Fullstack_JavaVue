package idv.sheng.domain.request;

import lombok.Data;

@Data
public class LoginRequest {
	String login_signup_flag;
	String username;
	String password;
}
