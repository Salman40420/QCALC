package com.crio.qcalc;

// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		// SpringApplication.run(QcalcApplication.class, args);
		// StandardCalculator calc = new StandardCalculator();
		// calc.add(Double.MAX_VALUE, Double.MAX_VALUE);
		// double res = calc.getResult();
		// System.out.println(res);

		
		LogicCalculator calc = new LogicCalculator();
		calc.OR(8, 6);
		calc.printResult();

	}
}
