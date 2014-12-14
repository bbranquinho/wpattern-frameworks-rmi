package br.com.wpattern.frameworks.rmi.server;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.wpattern.frameworks.rmi.server.intefaces.IServerDistribution;

public class Main {

	private static final String RMI_SERVER_CONTEXT = "/ctx-wpattern-frameworks-rmi-server.xml";

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(RMI_SERVER_CONTEXT);

		IServerDistribution serverDistribution = context.getBean(IServerDistribution.class);

		serverDistribution.start();
	}
}
