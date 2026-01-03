public class User implements UserInterface {
    //Known
    private int[] num=new int[3];
    private String calculatorType;
    //Unknow
//    private String calculatorId;
//    private int result;
    private AdderInterface adder;
    private MultiplierInterface multiplier;

    public User(){
    }


    public String getCalculatorType() {
        return calculatorType;
    }

    public void setCalculatorType(String calculatorType) {
        this.calculatorType = calculatorType;
    }

    public int[] getNum() {
        return num;
    }

    public void setNum(int[] num) {
        this.num = num;
    }

    public AdderInterface getAdder() {
        return adder;
    }

    public void setAdder(AdderInterface adder) {
        this.adder = adder;
    }

    public MultiplierInterface getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(MultiplierInterface multiplier) {
        this.multiplier = multiplier;
    }
}