package equipment;
import word_formation.*;
public class Spaceboots extends Boots implements Parts{


    @Override
    public String get_name(Case word_case, Capital capital){
        if (word_case == Case.GENITIVE) {
            if (capital == Capital.LOW)
                return "космических сапог";
            if (capital == Capital.HIGH)
                return "Космических сапог";
        }
        if (word_case == Case.NOMINATIVE) {
            if (capital == Capital.LOW)
                return "космические сапоги";
            if (capital == Capital.HIGH)
                return "Космические сапоги";
        }
        return "";
    }


    @Override
    public String toString(){
        Components substance = new Components("специального теплоизолирующего ", "вещества.", "no", "no", "подошвы их сделаны из ");

        return get_name(Case.NOMINATIVE, Capital.HIGH) + " почти ничем не отличаются от обычных сапог, но " + substance.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return this.toString().equals(obj.toString());
    }

}
