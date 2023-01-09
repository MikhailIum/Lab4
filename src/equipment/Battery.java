package equipment;
import java.util.Objects;
import word_formation.*;

public class Battery implements Device{
    String charging_device;


    public Battery(String charging_device){
        this.charging_device = charging_device;
    }

    @Override
    public String functionality() {
        return ", питающая током " + charging_device;
    }

    @Override
    public String description() {
        return get_name(Case.NOMINATIVE, Capital.LOW);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Battery battery = (Battery) o;
        return Objects.equals(charging_device, battery.charging_device);
    }

    @Override
    public int hashCode() {
        return Objects.hash(charging_device);
    }

    @Override
    public String get_name(Case word_case, Capital capital) {
        if (word_case == Case.GENITIVE) {
            if (capital == Capital.LOW)
                return "электробатареи";
            if (capital == Capital.HIGH)
                return "Электробатарея";
        }
        if (word_case == Case.NOMINATIVE) {
            if (capital == Capital.LOW)
                return "электробатарея";
            if (capital == Capital.HIGH)
                return "Электробатарея";
        }
        return "";

    }

    @Override
    public String toString(){

        return description() + functionality();
    }

}
