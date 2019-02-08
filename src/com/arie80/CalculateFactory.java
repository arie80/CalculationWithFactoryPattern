package com.arie80;

public class CalculateFactory {
	public Calculate getCalculation(String type) {
		Calculate obj = null;

		switch (type.toLowerCase()) {
			case "add" :
				obj = new Add();
				break;
			case "divide" :
				obj = new divide();
				break;
			case "substract" :
				obj = new substract();
				break;
			default:
				break;
			}
		return obj;
	}
}
