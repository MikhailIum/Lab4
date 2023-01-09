package equipment;
import word_formation.*;
public class Jumpsuit implements Parts{

    @Override
    public String get_name(Case word_case, Capital capital){
        if (word_case == Case.GENITIVE) {
            if (capital == Capital.LOW)
                return "космического комбинезона";
            if (capital == Capital.HIGH)
                return "Космического комбинезона";
        }
        if (word_case == Case.NOMINATIVE) {
            if (capital == Capital.LOW)
                return "космический комбинезон";
            if (capital == Capital.HIGH)
                return "Космический комбинезон";
        }
        return "";
    }

    private String contains(){
        Components connection = new Components("космопластмассой ", "no", "серебристого ", "no", "гибкой воздухонепроницаемой ");
        Components ring = new Components("металлических ", "колец ", "no", "no", "no");
        Components slab = new Components("no", "пластин", "no", connection.toString(), "no");
        return get_name(Case.NOMINATIVE, Capital.HIGH) + " сделан из " + ring.toString() + "и " + slab.toString() + ". ";
    }

    private String installed(){
        Backpack backpack = new Backpack("На спине " + get_name(Case.GENITIVE, Capital.LOW), " имеется ");
        Ventilation ventilation = new Ventilation(", в котором ", "размещены ");
        Flashlight flashlight = new Flashlight("на груди.", ", который укреплён ");
        Battery battery = new Battery(flashlight.toString());
        Hood hood = new Hood("автоматический складной ", "Над ранцем ", "размещен ");
        class Rucksack{
            class Item{

                Item(String name, int weight, String usage){
                    this.name = name;
                    this.weight = weight;
                    this.usage = usage;
                }
                String name;
                int weight;
                String usage;
            }
            Item item;
            Rucksack(){
                this.item = new Item("Зажигалка", 30, "Покурить нормальной сигареты");
            }


            @Override
            public String toString(){
                return "Нелишне упомянуть, что за спиной космического комбинезона имелся походный рюкзак.";
            }

        }

        Rucksack rucksack = new Rucksack();

        return backpack.toString() + ventilation.toString() + ", а также " + battery + "\n" + hood + "\n" + rucksack + "\n";
    }

    @Override
    public String toString(){

        return contains() + "\n" + installed();
    }

    @Override
    public boolean equals(Object obj) {
        return this.toString().equals(obj.toString());
    }

}
