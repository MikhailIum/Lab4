package equipment;
import java.util.Objects;
import word_formation.*;

public class Ventilation implements Device{
    String connection;
    String place;

    public Ventilation(String place, String connection){
        this.connection = connection;
        this.place = place;
    }

    @Override
    public String functionality() {
        return "";
    }

    @Override
    public String description() {
        return place + connection + get_name(Case.NOMINATIVE, Capital.LOW);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ventilation that = (Ventilation) o;
        return Objects.equals(connection, that.connection) && Objects.equals(place, that.place);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connection, place);
    }

    @Override
    public String get_name(Case word_case, Capital capital) {
        if (word_case == Case.GENITIVE) {
            if (capital == Capital.LOW)
                return "воздухоочистительного и вентеляционнного устройства";
            if (capital == Capital.HIGH)
                return "Воздухоочистительного и вентеляционнного устройства";
        }
        if (word_case == Case.NOMINATIVE) {
            if (capital == Capital.LOW)
                return "воздухоочистительное и вентеляционнное устройство";
            if (capital == Capital.HIGH)
                return "Воздухоочистительное и вентеляционнное устройство";
        }
        return "";
    }

    @Override
    public String toString(){

        return description() + functionality();
    }

}
