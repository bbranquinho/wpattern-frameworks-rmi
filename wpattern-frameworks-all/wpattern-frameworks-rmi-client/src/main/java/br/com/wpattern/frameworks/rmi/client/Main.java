package br.com.wpattern.frameworks.rmi.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.wpattern.frameworks.rmi.client.interfaces.ICalculatorDistribution;

public class Main {

	private static final String RMI_CLIENT_CONTEXT = "/ctx-wpattern-frameworks-rmi-client.xml";

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(RMI_CLIENT_CONTEXT);

		ICalculatorDistribution serverDistribution = context.getBean(ICalculatorDistribution.class);

		serverDistribution.start();
	}

}
