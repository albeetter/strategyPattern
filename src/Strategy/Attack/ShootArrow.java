package Strategy.Attack;

import Strategy.AttackStrategy;

public class ShootArrow implements AttackStrategy {
    public void attack() {
        System.out.println("Archer shoots an arrow!");
    }
}
