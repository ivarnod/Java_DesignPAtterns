package decorator;

public class NuttyDecorator extends AbstractIcecream {

	public NuttyDecorator(IceCreamDecorator decorator) {
		super(decorator);
	}
	
	@Override
	public String makeIcecream(){
		return decorator.makeIcecream()+addNuts();
	}
	
	public String addNuts(){
		return " + Nuttss...";
	}

}
