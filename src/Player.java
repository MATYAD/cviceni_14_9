public class Player {
    private String name;
    private int maxHP = 100;
    private int currentHP;
    private int power;

    public Player(String name, int maxHP, int currentHP, int power) {
        this.name = name;
        this.maxHP = maxHP;
        this.currentHP = currentHP;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public void setCurrentHP(int currentHP) {
        this.currentHP = maxHP;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", maxHP=" + maxHP +
                ", currentHP=" + currentHP +
                ", power=" + power +
                '}';
    }
}
