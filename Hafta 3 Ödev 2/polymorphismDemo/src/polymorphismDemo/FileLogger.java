package polymorphismDemo;

public class FileLogger extends BaseLogger{
	public void log(String message) {
		System.out.println("Dosya Loglandı : " + message);
	}
}