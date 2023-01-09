package equipment;
import java.util.Objects;
import word_formation.*;

public class Flashlight implements Device{
    String place;
    String connection;


    public Flashlight(String place, String connection){
        this.place = place;
        this.connection = connection;
    }

    @Override
    public String functionality() {
        return "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flashlight that = (Flashlight) o;
        return Objects.equals(place, that.place) && Objects.equals(connection, that.connection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(place, connection);
    }

    @Override
    public String description() {
        return get_name(Case.NOMINATIVE, Capital.LOW) + connection + place;
    }

    @Override
    public String get_name(Case word_case, Capital capital) {
        if (word_case == Case.GENITIVE) {
            if (capital == Capital.LOW)
                return "электрического фонаря";
            if (capital == Capital.HIGH)
                return "Электрического фонаря";
        }
        if (word_case == Case.NOMINATIVE) {
            if (capital == Capital.LOW)
                return "электрический фонарь";
            if (capital == Capital.HIGH)
                return "Электрический фонарь";
        }
        return "";

    }

    @Override
    public String toString(){

        return description() + functionality();
    }

}
