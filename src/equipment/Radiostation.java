package equipment;
import java.util.Objects;
import word_formation.*;

public class Radiostation implements Device{
    String place;
    String connection;

    public Radiostation(String place, String connection){
        this.place = place;
        this.connection = connection;
    }

    @Override
    public String functionality() {
        return " с телефонным устройством, посредством которого можно было переговариваться в безвоздушном пространстве.";
    }

    @Override
    public String description() {
        return place + connection + get_name(Case.NOMINATIVE, Capital.LOW);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Radiostation that = (Radiostation) o;
        return Objects.equals(place, that.place) && Objects.equals(connection, that.connection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(place, connection);
    }

    @Override
    public String get_name(Case word_case, Capital capital) {
        if (word_case == Case.GENITIVE) {
            if (capital == Capital.LOW)
                return "радиостанции";
            if (capital == Capital.HIGH)
                return "Радиостанции";
        }
        if (word_case == Case.NOMINATIVE) {
            if (capital == Capital.LOW)
                return "радиостанция";
            if (capital == Capital.HIGH)
                return "Радиостанция";
        }
        return "";

    }

    @Override
    public String toString(){

        return description() + functionality();
    }

}
