package strategyPattern;

public class StrategyPatternDemo {
	   public static void main(String[] args) {
	      Context context = new Context(new AddStrategy());		
	      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

	      context = new Context(new SubStrategy());		
	      System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

	      context = new Context(new MultyplyStrategy());		
	      System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	   }
	}
