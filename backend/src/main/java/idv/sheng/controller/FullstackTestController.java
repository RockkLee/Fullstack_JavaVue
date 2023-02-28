package idv.sheng.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.encoder.EchoEncoder;
import idv.sheng.domain.request.LoginRequest;
import idv.sheng.domain.response.CommonResponse;
import idv.sheng.domain.vo.LoginVo;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api")
public class FullstackTestController {
	
	@GetMapping("/echo")
	public String echo(String echo) {
		return echo;
	}
	
	@PostMapping("/post/login_signup")
	public CommonResponse<LoginVo> login(LoginRequest loginReq) {
		return new CommonResponse<LoginVo>(new LoginVo()).success();
	}
	
}
