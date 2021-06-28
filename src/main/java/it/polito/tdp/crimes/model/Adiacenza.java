package it.polito.tdp.crimes.model;

public class Adiacenza {
	
	private int district1;
	private int district2;
	private double weight;
	
	public Adiacenza(int district1, int district2, double weight) {
		super();
		this.district1 = district1;
		this.district2 = district2;
		this.weight = weight;
	}

	public int getDistrict1() {
		return district1;
	}

	public void setDistrict1(int district1) {
		this.district1 = district1;
	}

	public int getDistrict2() {
		return district2;
	}

	public void setDistrict2(int district2) {
		this.district2 = district2;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	

}
