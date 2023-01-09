package equipment;
import word_formation.*;
public class Helmet implements Parts{

    @Override
    public String get_name(Case word_case, Capital capital){
        if (word_case == Case.GENITIVE) {
            if (capital == Capital.LOW)
                return "герметического шлема";
            if (capital == Capital.HIGH)
                return "Герметического шлема";
        }
        if (word_case == Case.NOMINATIVE) {
            if (capital == Capital.LOW)
                return "герметический шлем";
            if (capital == Capital.HIGH)
                return "Герметический шлем";
        }
        return "";
    }

    @Override
    public String toString(){
        Components material = new Components("жёсткой ","космопластмассы, окованной нержавеющей сталью.", "no", "no", "сделан из ");
        Window window = new Window("В передней части ", " имеется ", " из небьющегося стекла, ");
        Radiostation radiostation = new Radiostation("внутри же ", "размещена ");

        return get_name(Case.NOMINATIVE, Capital.HIGH) + " надевается на голову и " + material + "\n" + window.toString() + radiostation.toString() + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        return this.toString().equals(obj.toString());
    }

}
