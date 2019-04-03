package facadePattern;

public class TestFacade {

	public static void main(String[] args) {
		FacadeShapeMaker facadeShapeMaker = new FacadeShapeMaker();
		
		facadeShapeMaker.drawCircle();
		facadeShapeMaker.drawSquare();
		facadeShapeMaker.drawRectangle();
	}

}
