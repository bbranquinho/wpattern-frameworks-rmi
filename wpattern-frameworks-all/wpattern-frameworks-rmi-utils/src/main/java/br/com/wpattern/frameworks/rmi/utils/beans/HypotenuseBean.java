package br.com.wpattern.frameworks.rmi.utils.beans;

import br.com.wpattern.frameworks.rmi.utils.BaseBean;

public class HypotenuseBean extends BaseBean {

	private static final long serialVersionUID = -8144398593955774955L;

	private final double hypotenuse;

	public HypotenuseBean(double hypotenuse) {
		this.hypotenuse = hypotenuse;
	}

	public double getHypotenuse() {
		return this.hypotenuse;
	}

}
