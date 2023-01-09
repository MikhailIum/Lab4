package characters;

public class Dunno extends Character{

    public Dunno() {
        super("Незнайка", "small");
    }

    public void landing_phrase(boolean is_landing_successful){
        if (is_landing_successful){
            System.out.println("Посадка успешная! Уважаемые пассажиры, температура за бортом -23 градуса Цельсия, время 12:50. Благодарим Вас за выбор нашей космокомпании. " +
                    "\nПожалуйста, оставайтесь на своих местах до полной остановки ракеты!");
        }
    }

    @Override
    public void eat() {
        System.out.println("Незнайка съел 5 космических тюбиков.");
    }

    @Override
    public void hold_ones_arm(Character arm_owner) {
        this.is_holding_ones_arm = true;
        arm_owner.is_holding_ones_arm = true;

        System.out.println("Незнайка взял Пончика за руку.");
    }


}
