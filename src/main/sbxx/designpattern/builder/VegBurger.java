package main.sbxx.designpattern.builder;

/**
 * @author Dair
 * @since
 */
public class VegBurger extends Burger{
	@Override
	public String name() {
		return "VegBurger";
	}
	
	@Override
	public float price() {
		return 2.5f;
	}
}
