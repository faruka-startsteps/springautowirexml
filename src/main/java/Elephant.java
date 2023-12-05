public class Elephant {

    private String name;
    private Color colorr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColorr() {
        return colorr;
    }

    public void setColorr(Color colorr) {
        this.colorr= colorr;
    }

    @Override
    public String toString() {
        return "The " + name + " has " + colorr.toString();
    }
}
