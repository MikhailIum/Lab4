package word_formation;
public enum Capital {
    LOW{
        public Capital opposite(){
            return HIGH;
        }
    },
    HIGH{
        public Capital opposite(){
            return LOW;
        }
    };

     public abstract Capital opposite();
}
