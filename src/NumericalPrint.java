public class NumericalPrint implements PropertyPrint{


    @Override
    public String complexPrint(int property, int max) {
        return String.format("%d/%d", property,max);
    }

    @Override
    public String simplePrint(int property) {
        return String.valueOf(property);
    }
}
