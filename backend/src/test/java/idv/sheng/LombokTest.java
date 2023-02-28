package idv.sheng;

import idv.sheng.domain.response.CommonResponse;

public class LombokTest {
	public static void main(String[] args) {
		CommonResponse<String> comRes = new CommonResponse<String>("StringObject");
		comRes.setCode("200");
		System.out.println(comRes.getCode());
	}
}
