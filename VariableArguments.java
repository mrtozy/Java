public class Variable Arguments {

   public static void main(String[] args) {
int sonuc = variableArguments(2,3,6,8);
		
System.out.println("sonuc: "+sonuc);
		
	}
public static int variableArguments(int... numbers) {
		int total = 0;
		for(int number:numbers) {
			total+=number;
		}
		return total;
	}

}
