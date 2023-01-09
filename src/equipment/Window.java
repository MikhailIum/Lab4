package equipment;
import java.util.Objects;
import word_formation.*;

public class Window implements Device {
    String place;
    String connection;
    String desc;

    public Window(String place, String connection, String desc){
        this.place = place;
        this.connection = connection;
        this.desc = desc;
    }

    @Override
    public String functionality() {
        return "";
    }

    @Override
    public String description() {
        Helmet helmet = new Helmet();
        return place + helmet.get_name(Case.GENITIVE, Capital.LOW) + connection + get_name(Case.NOMINATIVE, Capital.LOW) + desc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Window window = (Window) o;
        return Objects.equals(place, window.place) && Objects.equals(connection, window.connection) && Objects.equals(desc, window.desc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(place, connection, desc);
    }

    @Override
    public String get_name(Case word_case, Capital capital) {
        if (word_case == Case.GENITIVE) {
            if (capital == Capital.LOW)
                return "иллюминатора";
            if (capital == Capital.HIGH)
                return "Иллюминатора";
        }
        if (word_case == Case.NOMINATIVE) {
            if (capital == Capital.LOW)
                return "иллюминатор";
            if (capital == Capital.HIGH)
                return "Иллюминатор";
        }
        return "";

    }

    @Override
    public String toString(){

        return description() + functionality();
    }

}
