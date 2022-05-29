package oop.abstraction;

public class Sword extends AbstractGameWeapon {
	private final int weaponLength;

	public Sword(int dps,int price, int weaponLength) {
		super(dps, price);
		this.weaponLength = weaponLength;
	}

	@Override
	public void Attack() {
		System.out.println("Sword deals " + getDps() + " from " + weaponLength + " range.");
	}
}