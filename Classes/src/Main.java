
public class Main {

	public static void main(String[] args) {
		CustomerManager müşteriHizmetleri=new CustomerManager();
		CustomerManager müşteriHizmetleri2= new CustomerManager();
		müşteriHizmetleri=müşteriHizmetleri2;
		müşteriHizmetleri.Add();
		müşteriHizmetleri.Remove();
		müşteriHizmetleri.Update();

	}

}
