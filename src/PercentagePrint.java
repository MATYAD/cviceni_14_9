public class PercentagePrint implements PropertyPrint{
    @Override
    public String complexPrint(int property, int max) {
        return new String(String.valueOf(property*100/max));
    }

    @Override
    public String simplePrint(int property) {
        return String.valueOf(property);
    }
}
