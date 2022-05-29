package oop.abstraction;

class Bow extends AbstractGameWeapon {
    private final int attackRange;

    public Bow(int dps, int price, int attackRange) {
        super(dps, price);
        this.attackRange = attackRange;
    }

    @Override
    public void Attack() {
        System.out.println("Bow deals " + getDps() + " from " + attackRange + " range.");
    }
}
