class IntegerWrapper {
    private int value;

    public IntegerWrapper(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}

public class wdc {
    public static void main(String[] args){
        IntegerWrapper wrapperInt = new IntegerWrapper(42);
        System.out.println("Wrapped integer value: " + wrapperInt.getValue());

        Integer autoBoxedInt = 100;
        System.out.println("The autoBoxed value: " + autoBoxedInt);
    }
}