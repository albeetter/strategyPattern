import Strategy.AttackStrategy;
import Strategy.DefenseStrategy;

import java.util.ArrayList;
import java.util.List;

public class Character {
    private String type;
    private AttackStrategy attackStrategy;
    private List<DefenseStrategy> defenseStrategies;

    public Character(String type, AttackStrategy attackStrategy,  List<DefenseStrategy> defenseStrategies) {
        this.type = type;
        this.attackStrategy = attackStrategy;
        this.defenseStrategies = defenseStrategies;
    }

    public void attack() {
        attackStrategy.attack();
    }

    public void defense() {
        for (DefenseStrategy defenseStrategy : defenseStrategies) {
            defenseStrategy.defense();
        }
    }
}