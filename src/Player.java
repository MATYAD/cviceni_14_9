
public class Player{
    private String name;
    private int maxHP;
    private int currentHP;
    private int power;

    private PropertyPrint print1 = new NumericalPrint();

    private PropertyPrint print2 = new PercentagePrint();

    public Player(String name, int maxHP, int currentHP, int power) {
        this.name = name;
        setCurrentHP(currentHP);
        setMaxHP(maxHP);
        setPower(power);
    }

    public void setPrinter(PropertyPrint print1){
        this.print1 = print1;
    }

    public void HpDown(int down){
        if (currentHP > 0 ){
            this.currentHP -= down;
        }else {
            currentHP=0;
        }
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
        if (maxHP > currentHP){
            this.maxHP = currentHP+5;
        }

        if (maxHP <= 0){
            this.maxHP = 10;
        }
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public void setCurrentHP(int currentHP) {
        if (currentHP <= 0){
            this.currentHP = 0;
        }else {
            this.currentHP = 5;
        }

    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if (power >= maxHP){
            this.power = 5;
        }else {
            this.power = power;
        }
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
