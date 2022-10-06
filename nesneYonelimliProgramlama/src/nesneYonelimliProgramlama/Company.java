package nesneYonelimliProgramlama;

public class Company extends Customer {
	private String companyName;
    private String taxNumber;

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}
    
    public String getCompanyName() {
        return companyName;
    }
	
	public String getTaxNumber() {
		return taxNumber;
	}
}