package www.kjfl.com.pingtai.util;

import www.kjfl.com.pingtai.bean.Useres;

import java.io.Serializable;

public class Result implements Serializable{

	private boolean success;//返回结果
	private String message;//返回信息
	private Useres useres;//用户信息 方便登入时返回用户信息

	public Result() {
	}

	public Result(boolean success, String message, Useres useres) {
		this.success = success;
		this.message = message;
		this.useres = useres;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Useres getUseres() {
		return useres;
	}

	public void setUseres(Useres useres) {
		this.useres = useres;
	}
}
