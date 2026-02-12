import Strategy.Attack.CastSpell;
import Strategy.Attack.ShootArrow;
import Strategy.Attack.SwingSword;
import Strategy.Defense.CreateMagic;
import Strategy.Defense.Dodge;
import Strategy.Defense.Shield;
import Strategy.DefenseStrategy;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class GameApp {
    public static void main(String[] args) {
        Character knight = new Character ("Knight",
                new SwingSword(),
                new ArrayList<>(Arrays.asList(new Shield(), new Dodge(), new CreateMagic()))
        );

        Character wizard = new Character("Wizard",
                new CastSpell(),
                new ArrayList<>(Arrays.asList(new CreateMagic()))
        );

        Character archer = new Character("Archer",
                new ShootArrow(),
                new ArrayList<>(Arrays.asList(new Dodge()))
        );

        System.out.println("--- KNIGHT ---");
        knight.attack();
        knight.defense();

        System.out.println("\n--- WIZARD ---");
        wizard.attack();
        wizard.defense();

        System.out.println("\n--- ARCHER ---");
        archer.attack();
        archer.defense();
    }
}
