package idv.sheng.domain.response;

import lombok.Data;

@Data
public class CommonResponse<T> {
	
	String description;
	
	String code;
	
	T data;

	public CommonResponse(T data){
		this.data = data;
	}

	public CommonResponse<T> success(){
		this.code = "200";
		this.description = "success";
		return this;
	}

	public CommonResponse<T> error(){
		this.code = "400";
		this.description = "error";
		return this;
	}
}

