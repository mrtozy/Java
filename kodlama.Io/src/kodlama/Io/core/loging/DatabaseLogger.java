package kodlama.Io.core.loging;

public class DatabaseLogger implements ILogger{

	@Override
	public void log(String data) {
		// TODO Auto-generated method stub
		System.out.println("Veritabanına loglandı "+ data);
	}

}
