public class City implements Comparable<City>{
    private String name;
    private int pop;

    public City(String name, int pop) {
        this.name = name;
        this.pop = pop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPop() {
        return pop;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", pop=" + pop +
                '}';
    }


    @Override
    public int compareTo(City o) {
        return Integer.compare(this.getPop(),o.getPop());
    }
}
