package org.hamza.model;

/**
 * 
 * @author Hamza
 *
 * Class to manage errors
 * 
 */
public class Error {

	private String type;
	private String msg;
	
	/**
	 * Constructors
	 */
	
	public Error() {
		type = "error";
		msg = "";
	}
	
	public Error(String type, String msg) {
		super();
		this.type = type;
		this.msg = msg;
	}
	
	/**
	 * to String method
	 */
	@Override
	public String toString() {
		return "Error [type=" + type + ", msg=" + msg + "]";
	}

	
	/**
	 * getters && setters
	 * 
	 */

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
