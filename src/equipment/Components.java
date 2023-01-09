package equipment;
import java.util.Objects;
import word_formation.*;

public class Components {
    String material;
    String shape;
    String color;
    String connection;
    String description;


    public Components(String material, String shape, String color, String connection, String description){
        this.material = material;
        this.description = description;
        this.shape = shape;
        this.color = color;
        this.connection = connection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Components that = (Components) o;
        return Objects.equals(material, that.material) && Objects.equals(shape, that.shape) && Objects.equals(color, that.color) && Objects.equals(connection, that.connection) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, shape, color, connection, description);
    }

    @Override
    public String toString(){
        String desc = "";
        if (!description.equals("no"))
            desc += description;
        if (!material.equals("no"))
            desc += material;
        if (!shape.equals("no"))
            desc += shape;
        if (!color.equals("no"))
            desc += color + "цвета";
        if (!connection.equals("no"))
            desc += ", соединенных " + connection;

        return desc;
    }

}
