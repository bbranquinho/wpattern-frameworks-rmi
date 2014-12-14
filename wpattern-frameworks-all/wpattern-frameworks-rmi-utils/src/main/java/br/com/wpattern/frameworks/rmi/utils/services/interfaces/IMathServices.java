package br.com.wpattern.frameworks.rmi.utils.services.interfaces;

import br.com.wpattern.frameworks.rmi.utils.beans.CathetusBean;
import br.com.wpattern.frameworks.rmi.utils.beans.HypotenuseBean;

public interface IMathServices {

	public HypotenuseBean calculateHypotenuse(CathetusBean cathetus);

}
