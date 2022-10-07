package kodlama.Io.entities;

public class Kurs {
	private int id;
	private String kursAd;
	private double birimFiyati;
	
	public Kurs() {
		
	}
	
	public Kurs(int id, String kursAd, double birimFiyati) {
		this.id = id;
		this.kursAd = kursAd;
		this.birimFiyati = birimFiyati;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKursAd() {
		return kursAd;
	}

	public void setKursAd(String kursAd) {
		this.kursAd = kursAd;
	}

	public double getBirimFiyati() {
		return birimFiyati;
	}

	public void setBirimFiyati(double birimFiyati) {
		this.birimFiyati = birimFiyati;
	}


}
