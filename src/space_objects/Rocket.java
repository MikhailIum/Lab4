package space_objects;
import characters.Character;
import exceptions.ArmHolding;
import exceptions.Crash;

import java.util.ArrayList;

public class Rocket {
    private int distance_moon;
    public Door door;
    public Rocket(boolean is_opened, int distance_moon){
        this.distance_moon = distance_moon;
        this.door = new Door(is_opened);
    }

    public int getDistance_moon(){
        return distance_moon;
    }

    public void setDistance_moon(int distance_moon, Moon moon) throws Crash {
        this.distance_moon = distance_moon;
        if (this.distance_moon < 0) throw new Crash();
        if (this.distance_moon == 0) moon.setRocketLanded();
    }

    public void open_second_door(ArrayList<Character> characters) {
        new Door(true){
            private boolean button;
            @Override
            public void change_button_status(ArrayList<Character> characters){
                button = !button;
                if (button) System.out.println("Открылось лишь крошечное отверстие, имевшееся в двери. Пространство внутри шлюза соединилось с наружным безвоздушным пространством, и воздух, находившийся в шлюзовой камере, со свистом начал вырываться на свободу." +
                "\nСо временем воздух окончательно вышел из шлюзовой камеры, и наружная дверь автоматически отворилась.");
            }
            {
                System.out.println("Теперь от лунного мира наших путешественников отделяла лишь одна дверь. Друзья нажали на кнопку.");
            }
        }.change_button_status(characters);
    }


    public class Door {
        private boolean button;
        private Door(boolean is_opened){
            button = is_opened;
        }

        public boolean get_button_status(){
            return button;
        }

        public void change_button_status(ArrayList<Character> characters) throws ArmHolding {
            for (Character character: characters){
                if (!character.is_holding_ones_arm) {
                    throw new ArmHolding();
                }
            }
            button = !button;
            if (button) System.out.println("Дверь открывается!");
            else System.out.println("Дверь закрывается!");
        }

    }

}
