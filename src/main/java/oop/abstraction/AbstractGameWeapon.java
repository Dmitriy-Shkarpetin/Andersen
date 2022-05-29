package oop.abstraction;

public abstract class AbstractGameWeapon {
	private int dps;
	private int price;

	public AbstractGameWeapon(int dps, int price) {
		this.dps = dps;
		this.price = price;
	}

	public int getDps() {
		return dps;
	}

	public abstract void Attack();
}


