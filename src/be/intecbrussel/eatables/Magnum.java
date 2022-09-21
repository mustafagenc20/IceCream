package be.intecbrussel.eatables;

public class Magnum implements Eatable {
    private MagnumType type;

    public Magnum(){
        this(MagnumType.MILKCHOCOLATE);
    }

    public Magnum(MagnumType type){
        this.type = type;
    }

    public void eat(){
        System.out.println("You eat " + this.type);
    }

    public MagnumType getType() {
        return this.type;
    }

    public enum MagnumType {
        MILKCHOCOLATE(1),
        WHITECHOCOLATE(0.75),
        BLACCHOCOLATE(1.25),
        ALPINENUTS(1.5),
        ROMATICSTRAWBERRIES(1.5);

        private double value;

        MagnumType(double value){
            this.value = value;
        }

        public double getValue() {
            return value;
        }
    }
}
