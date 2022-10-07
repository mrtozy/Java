package kodlama.Io.entities;

public class Kategori {
	private int id;
	private String kategoriAd;
	
	public Kategori() {
		
	}
	
	public Kategori(int id, String kategoriAd) {
		this.id = id;
		this.kategoriAd = kategoriAd;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getkategoriAd() {
		return kategoriAd;
	}

	public void setkategoriAd(String kategoriAd) {
		this.kategoriAd = kategoriAd;
	}
}
