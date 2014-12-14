package br.com.wpattern.frameworks.rmi.utils.beans;

import br.com.wpattern.frameworks.rmi.utils.BaseBean;

public class CathetusBean extends BaseBean {

	private static final long serialVersionUID = -1412717524611091038L;

	private final double cathetusA;

	private final double cathetusB;

	public CathetusBean(double cathetusA, double cathetusB) {
		this.cathetusA = cathetusA;
		this.cathetusB = cathetusB;
	}

	public double getCathetusA() {
		return this.cathetusA;
	}

	public double getCathetusB() {
		return this.cathetusB;
	}

}
