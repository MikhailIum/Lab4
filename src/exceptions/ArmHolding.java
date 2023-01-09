package exceptions;
import characters.Character;

import java.util.ArrayList;

public class ArmHolding extends Exception{

    public static void ok(ArrayList<Character> characters){
        for (Character character: characters){
            character.is_holding_ones_arm = false;
        }
    }

    @Override
    public String getMessage() {
        return "Никто не держится за руки! Дверь так не откроется...";
    }
}
