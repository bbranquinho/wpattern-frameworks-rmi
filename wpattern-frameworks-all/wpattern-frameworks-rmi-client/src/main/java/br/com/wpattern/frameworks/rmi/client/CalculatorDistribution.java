package br.com.wpattern.frameworks.rmi.client;

import javax.inject.Inject;
import javax.inject.Named;
import javax.swing.JOptionPane;

import br.com.wpattern.frameworks.rmi.client.interfaces.ICalculatorDistribution;
import br.com.wpattern.frameworks.rmi.utils.beans.CathetusBean;
import br.com.wpattern.frameworks.rmi.utils.beans.HypotenuseBean;
import br.com.wpattern.frameworks.rmi.utils.services.interfaces.IMathServices;

@Named
public class CalculatorDistribution implements ICalculatorDistribution {

	@Inject
	private IMathServices mathServices;

	@Override
	public void start() {
		System.out.println("Cliente iniciado!");

		HypotenuseBean hypotenuse;
		double cathetusA, cathetusB;
		boolean calculateHypotenuse = true;

		while (calculateHypotenuse) {
			cathetusA = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do cateto A: "));
			cathetusB = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do cateto B: "));

			hypotenuse = this.mathServices.calculateHypotenuse(new CathetusBean(cathetusA, cathetusB));
			JOptionPane.showMessageDialog(null, "Resultado do cálculo da hipotenusa: " + hypotenuse.getHypotenuse());

			String result = JOptionPane.showInputDialog("Deseja calcular mais uma hipotenusa (s, n)?");

			if (!result.equals("s") && !result.equals("S")) {
				calculateHypotenuse = false;
			}
		}

	}

}
