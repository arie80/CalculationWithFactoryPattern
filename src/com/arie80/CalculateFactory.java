package com.arie80;

public class CalculateFactory {
	public Calculate getCalculation(String type) {
		Calculate obj = null;

		switch (type.toLowerCase()) {
			case "add" :
				obj = new Add();
				break;
			case "divide" :
				obj = new Divide();
				break;
			case "substract" :
				obj = new Substract();
				break;
			default:
				break;
			}
		return obj;
	}
}
