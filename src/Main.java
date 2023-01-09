import characters.*;
import characters.Character;
import exceptions.*;
import space_objects.*;

import java.util.ArrayList;



public class Main {
    public static void main(String[] args) throws Crash, ArmHolding {

        Moon moon = new Moon();
        System.out.println("Пончик и Незнайка приближаются к Луне.");
        double G = 1.02;
        ArrayList<Character> characters = new ArrayList<>();
        Roly_Poly rolyPoly = new Roly_Poly();
        characters.add(rolyPoly);
        Rocket rocket = new Rocket(false, 70000);
        for (;G < 1.62; G += 0.1){
            rocket.setDistance_moon(rocket.getDistance_moon() - 10000, moon);
            System.out.println("Вес Пончика: " + Math.round(rolyPoly.get_weight() * G) + "; Расстояние до Луны: " + rocket.getDistance_moon());
        }
        System.out.println("Ему было все сложнее двигаться, но он всё же добрался до иллюминатора и увидел следующее:\n" + moon);
        try {
            rocket.setDistance_moon(rocket.getDistance_moon() - 10000 * (int)(Math.random() + 1.2), moon);
        } catch (Crash cr){
            System.out.println(cr.getMessage());
            cr.result();
        }
        System.out.println("\nПроизошел толчок.");
        Dunno dunno = new Dunno();
        characters.add(dunno);
        System.out.println("Незнайка подпрыгнул и прокричал:");
        dunno.landing_phrase(true);
        System.out.println("Обменявшись любезностями, друзья спустились в пищевой отсек.");
        for (Character character: characters){
            character.eat();
        }
        System.out.println("Наевшись, друзья поднялись в отсек, где хранились космические скафандры. \n");
        for (Character character: characters){
            character.find_suit();
        }
        if (dunno.spacesuit.equals(rolyPoly.spacesuit)) {
            System.out.println(dunno.spacesuit);
        }
        if (dunno.spacesuit.hashCode() == rolyPoly.spacesuit.hashCode()){
            System.out.println("Как они смогли вдвоем влезть в один скафандр!?!?!?");
        } else {
            System.out.println("Разница между скафандрами лишь в размере: \n" +
                    "На Незнайке: " + dunno.spacesuit.size + "\n" +
                    "На Пончике: " + rolyPoly.spacesuit.size + "\n");
        }
        System.out.println("Одевшись в космические скафандры и проверив работу радиотелефонной связи, наши путешественники спустились в хвостовую часть ракеты и очутились перед дверью шлюза.");
        if (rocket.door.get_button_status()){
            throw new DoorChecker();
        } else {
            try{
                rocket.door.change_button_status(characters);
            } catch (ArmHolding ex){
                System.out.println(ex.getMessage());
                if (Math.random() > 0.5){
                    dunno.hold_ones_arm(rolyPoly);
                } else rolyPoly.hold_ones_arm(dunno);
            } finally {
                rocket.door.change_button_status(characters);
                System.out.println("Друзья шагнули вперед и оказались в шлюзовой камере.");
                rocket.door.change_button_status(characters);
            }
        }
        rocket.open_second_door(characters);
        ArmHolding.ok(characters);
        System.out.println("\n" + moon);
        Moon.Crystal crystal = new Moon.Crystal(Math.random() * 39 + 1);


        System.out.println("\nСолнечный свет преломлялся в гранях этих кристаллов, благодаря чему они сверкали всеми цветами радуги.");
        System.out.println("Cвет попадает на кристалл под углом " + crystal.get_angle() + " градусов.");
        crystal.dispersion();




    }


}
