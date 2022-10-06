package nesneYonelimliProgramlama;

public class TeacherCreditManager extends BaseCreditManager implements ICreditManager{
	
    @Override
    public void calculate() {
        System.out.println("öğretmen  kredisi başlatıldı");
    }
}