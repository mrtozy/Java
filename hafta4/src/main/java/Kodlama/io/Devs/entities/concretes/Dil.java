package Kodlama.io.Devs.entities.concretes;

public class Dil {
	private int id;
	private String dil;
	public Dil() {
		
	}
	public Dil(int id, String dil) {
	
		this.id = id;
		this.dil = dil;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDil() {
		return dil;
	}
	public void setDil(String dil) {
		this.dil = dil;
	}
}
