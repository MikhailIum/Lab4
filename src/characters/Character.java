package characters;

import equipment.Helmet;
import equipment.Jumpsuit;
import equipment.Spaceboots;
import equipment.Spacesuit;

import java.util.Objects;

public abstract class Character {
    String name;
    String size;
    int weight;

    public boolean is_holding_ones_arm;

    public Spacesuit spacesuit;

    Character(String name, String size){
        this.name = name;
        this.size = size;
        this.is_holding_ones_arm = false;
        if (Objects.equals(this.size, "big")){
            weight = 30;
        }
        else if (Objects.equals(this.size, "small")) weight = 20;
        else weight = 10;
    }


    public String get_name(){
        return name;
    }
    public String getSize(){
        return size;
    }

    public int get_weight(){
        return weight;
    }

    abstract public void eat();

    public void find_suit(){
        this.spacesuit = new Spacesuit(new Jumpsuit(), new Helmet(), new Spaceboots(), this.getSize());
    }

    abstract public void hold_ones_arm(Character arm_owner);


}
