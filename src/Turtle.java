public class Turtle {
    String name = "";

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        turtle.setName("Arkadiy Ivanovich");
        System.out.println(turtle.name);
    }


}


