package restMainApplication.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class ReturnedObject {
	
	
	public ReturnedObject() {
		// TODO Auto-generated constructor stub
	}
	
	private String detail ;
	private int number1;
	private int number2;
	private int result;
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public int getNumber1() {
		return number1;
	}
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	public int getNumber2() {
		return number2;
	}
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public ReturnedObject(String detail, int number1, int number2, int result) {
		super();
		this.detail = detail;
		this.number1 = number1;
		this.number2 = number2;
		this.result = result;
	}
	
	
	@Override
	public String toString() {
		return "ReturnedObject [detail=" + detail + ", number1=" + number1 + ", number2=" + number2 + ", result="
				+ result + "]";
	}
	
	
	
	

}
