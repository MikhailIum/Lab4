package equipment;
import java.util.Objects;
import word_formation.*;

public class Hood implements Device{
    String desc;
    String place;
    String connection;


    public Hood(String desc, String place, String connection){
        this.desc = desc;
        this.connection = connection;
        this.place = place;
    }

    @Override
    public String functionality() {
        return ", раскрывающийся в случае надобности на манер крыльев.";
    }

    @Override
    public String description() {
        return place + connection + desc + get_name(Case.NOMINATIVE, Capital.LOW);
    }

    @Override
    public String get_name(Case word_case, Capital capital) {
        if (word_case == Case.GENITIVE) {
            if (capital == Capital.LOW)
                return "капюшон-парашюта";
            if (capital == Capital.HIGH)
                return "Капюшон-парашюта";
        }
        if (word_case == Case.NOMINATIVE) {
            if (capital == Capital.LOW)
                return "капюшон-парашют";
            if (capital == Capital.HIGH)
                return "Капюшон-парашют";
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
        Hood hood = (Hood) o;
        return Objects.equals(desc, hood.desc) && Objects.equals(place, hood.place) && Objects.equals(connection, hood.connection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desc, place, connection);
    }
}
