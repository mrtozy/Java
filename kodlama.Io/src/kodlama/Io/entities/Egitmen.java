package kodlama.Io.entities;

public class Egitmen {
	private int id;
	private String ad;
	private String soyAd;
	private String mail;
	public Egitmen() {
		
	}
	
	public Egitmen(int id, String ad, String soyAd,String mail) {
		
		this.id = id;
		this.ad = ad;
		this.soyAd = soyAd;
		this.mail=mail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public String getSoyAd() {
		return soyAd;
	}

	public void setSoyAd(String soyAd) {
		this.soyAd = soyAd;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
}
