package com.ibm.shopping.beans;

public class Varient {
	private int varientId, ram, rom;
	
	public Varient() {
		
	}
	
	public Varient(int varientId, int ram, int rom) {
		this.varientId = varientId;
		this.ram = ram;
		this.rom = rom;
	}


	public int getVarientId() {
		return varientId;
	}

	public void setVarientId(int varientId) {
		this.varientId = varientId;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getRom() {
		return rom;
	}

	public void setRom(int rom) {
		this.rom = rom;
	}
	
}
