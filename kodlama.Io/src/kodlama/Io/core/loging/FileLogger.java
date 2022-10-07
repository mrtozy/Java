package kodlama.Io.core.loging;

public class FileLogger implements ILogger{

	@Override
	public void log(String data) {
		// TODO Auto-generated method stub
		System.out.println("Dosyaya loglandı "+ data);
	}

}
