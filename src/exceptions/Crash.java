package exceptions;
public class Crash extends Exception{

    public void result(){
        System.exit(0);
    }

    @Override
    public String getMessage() {
        return "Ракета разбилась о Луну. История окончена....";
    }
}
