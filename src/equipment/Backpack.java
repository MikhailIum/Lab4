package equipment;
import java.util.Objects;
import word_formation.*;


public class Backpack implements Device{

    String place;
    String connection;

    public Backpack(String place, String connection){
        this.place = place;
        this.connection = connection;
    }

    @Override
    public String functionality() {
        return "";
    }

    @Override
    public String description() {
        return place + connection + get_name(Case.NOMINATIVE, Capital.LOW).toLowerCase();
    }

    @Override
    public String get_name(Case word_case, Capital capital) {
        if (word_case == Case.GENITIVE) {
            if (capital == Capital.LOW)
                return "ранца";
            if (capital == Capital.HIGH)
                return "Ранца";
        }
        if (word_case == Case.NOMINATIVE) {
            if (capital == Capital.LOW)
                return "ранец";
            if (capital == Capital.HIGH)
                return "Ранец";
        }
        return "";

    }

    @Override
    public String toString(){

        return description() + functionality();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Backpack backpack = (Backpack) o;
        return Objects.equals(place, backpack.place) && Objects.equals(connection, backpack.connection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(place, connection);
    }
}
