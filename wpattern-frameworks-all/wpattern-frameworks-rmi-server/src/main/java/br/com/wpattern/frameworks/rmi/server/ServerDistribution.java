package br.com.wpattern.frameworks.rmi.server;

import javax.inject.Named;

import br.com.wpattern.frameworks.rmi.server.intefaces.IServerDistribution;

@Named
public class ServerDistribution implements IServerDistribution {

	@Override
	public void start() {
		System.out.println("Servidor iniciado!");
	}

}
