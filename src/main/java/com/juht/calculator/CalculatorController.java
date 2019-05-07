package com.juht.calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
class CalculatorController {
	@Autowired
	private Calculator calculator;
	@RequestMapping("/sum")
		String Sum(@RequestParam("a") Integer a,
			   @RequestParam("b") Integer b) {
		return String.valueOf(calculator.sum(a,b));
	}
	@RequestMapping("/dif")
		String Dif(@RequestParam("a") Integer a,
			   @RequestParam("b") Integer b) {
		return String.valueOf(calculator.dif(a,b));
	}
}

