package characters;


public class Roly_Poly extends Character{
    public Roly_Poly() {
        super("Пончик", "big");
    }

    @Override
    public void eat() {
        System.out.println("Пончик съел 20 космических тюбиков и 40 семян из мешка, где спал.");
        this.weight += 5;
    }

    @Override
    public void hold_ones_arm(Character arm_owner) {
        this.is_holding_ones_arm = true;
        arm_owner.is_holding_ones_arm = true;

        System.out.println("Пончик взял Незнайку за руку.");
    }
}
