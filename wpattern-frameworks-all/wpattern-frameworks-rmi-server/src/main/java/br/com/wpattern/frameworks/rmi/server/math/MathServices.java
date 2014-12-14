package br.com.wpattern.frameworks.rmi.server.math;

import javax.inject.Named;

import br.com.wpattern.frameworks.rmi.utils.beans.CathetusBean;
import br.com.wpattern.frameworks.rmi.utils.beans.HypotenuseBean;
import br.com.wpattern.frameworks.rmi.utils.services.interfaces.IMathServices;

@Named
public class MathServices implements IMathServices {

	@Override
	public HypotenuseBean calculateHypotenuse(CathetusBean cathetus) {
		double cathetusA = cathetus.getCathetusA();
		double cathetusB = cathetus.getCathetusB();
		double hypotenuse =  Math.sqrt(Math.pow(cathetusA, 2.0) + Math.pow(cathetusB, 2.0));

		System.out.println("Valor da hipotenusa calculada: " + hypotenuse);

		return new HypotenuseBean(hypotenuse);
	}

}
