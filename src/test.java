
public class test extends calc{
	
	public static int Test (String a, int n1, int n2) {
		float x = 0;
		if (a=="%"){
			x = calc.Percent(n1, n2);
		}
		if (a=="/"){
			x = calc.Divide(n1, n2);
		}
		if (a=="*"){
			x = calc.Multiply(n1, n2);
		}
		if (a=="-"){
			x = calc.Minus(n1, n2);
		}
		if (a=="+"){
			x = calc.Plus(n1, n2);
		}
		return (int) x;
		
	}
}
