package nesneYonelimliProgramlama;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
        customer.setId(1);
        customer.setCity("Ankara");

        CustomerManager customerManager = new CustomerManager(customer, new TeacherCreditManager());
        customerManager.save();
        customerManager.delete();
        customerManager.giveCredit();

        Company company = new Company();
        company.setId(100);
        company.setCompanyName("şirket");
        company.setTaxNumber("1595964995");

        CustomerManager customerManager2 = new CustomerManager(company, new MilitaryCreditManager());
        customerManager2.giveCredit();

        Person person = new Person();
        person.setFirstName("ahmet");
        person.setLastName("mehmet");
        person.setNationalIdentity("4846248648");

       

	}

}
