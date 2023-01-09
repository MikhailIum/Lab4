package space_objects;
public class Moon {

    private boolean isRocketLanded;

    public Moon(){
        isRocketLanded = false;
    }

    void setRocketLanded(){
        isRocketLanded = true;
    }

    @Override
    public String toString(){
        if (!isRocketLanded)
            return "Теперь луна уже не казалась пепельно-серой, какой кажется нам с земли, а была серебристо-белой. " +
                "\nВ разные стороны тянулись красивые горы, между которыми сверкали, залитые ярким солнечным светом, " +
                "\nлунные долины. Среди долин во многих местах виднелись огромные каменные глыбы. Некоторые из них были четырехугольной формы и своим видом напоминали большие дома. " +
                "\nОсобенно много таких камней было у подножья скалистых гор, поэтому казалось, что вдоль горных хребтов расположились лунные города, населенные лунными жителями.";
        else return "Друзья вышли из шлюзокамеры и, спустившись по лестничке, очутились на поверхности Луны. " +
                "\nКартина, открывшаяся перед их глазами, привела их в трепет и восхищение. " +
                "\nВнизу, у самых ног путешественников, расстилалась равнина, напоминавшая неподвижно застывшую поверхность моря с неглубокими впадинами и отлого поднимающимися буграми. " +
                "\nКак и обычная морская вода, эта волнистая, как бы внезапно окаменевшая поверхность Луны была зеленовато-голубого, или, как его принято называть, аквамаринового цвета. " +
                "\nВдали, позади этой зыбкой на вид поверхности, возвышались холмы. Они были желтые, словно песчаные. За холмами громоздились ярко-красные горы. " +
                "\nОни, словно языки застывшего пламени, взмывали кверху. По правую руку, невдалеке от наших путешественников, были такие же огненно-красные горы. " +
                "\nОни как бы вздымались со дна окаменевшего моря и тянулись своими заостренными верхушками к небу. Обернувшись назад. Незнайка и Пончик увидели вдали горы, имевшие более смутные очертания. " +
                "\nКазалось, они были словно из ваты и по своему виду напоминали лежавшие на Земле облака. На их вершинах и склонах, будто фантастические стеклянные замки, торчали гигантские кристаллы, напоминавшие по форме кристаллы горного хрусталя.";
    }

    public static class Crystal{
        final static double n_red = 1.5145;
        final static double n_orange = 1.5160;
        final static double n_yellow = 1.5170;
        final static double n_green = 1.5191;
        final static double n_cyan = 1.5215;
        final static double n_blue = 1.5235;
        final static double n_purple = 1.5318;
        private double angle;

        public Crystal(double angle){
            this.angle = Math.toRadians(angle);
        }

        public int get_angle(){
            return (int)Math.toDegrees(angle);
        }

        public void dispersion(){
            System.out.println("Красный цвет выходит под углом " + Math.toDegrees(Math.asin(n_red * Math.sin(angle))) + " градусов.");
            System.out.println("Оранжевый цвет выходит под углом " + Math.toDegrees(Math.asin(n_orange * Math.sin(angle))) + " градусов.");
            System.out.println("Желтый цвет выходит под углом " + Math.toDegrees(Math.asin(n_yellow * Math.sin(angle))) + " градусов.");
            System.out.println("Зеленый цвет выходит под углом " + Math.toDegrees(Math.asin(n_green * Math.sin(angle))) + " градусов.");
            System.out.println("Голубой цвет выходит под углом " + Math.toDegrees(Math.asin(n_cyan * Math.sin(angle))) + " градусов.");
            System.out.println("Синий цвет выходит под углом " + Math.toDegrees(Math.asin(n_blue * Math.sin(angle))) + " градусов.");
            System.out.println("Фиолетовый цвет выходит под углом " + Math.toDegrees(Math.asin(n_purple * Math.sin(angle))) + " градусов.");
        }
    }


}
