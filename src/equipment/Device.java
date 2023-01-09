package equipment;
import word_formation.*;
public interface Device {
    public String functionality();

    public String description();

    public String get_name(Case word_case, Capital capital);


}
