public interface UserInterface {
    public String getCalculatorType();
    public void setCalculatorType(String calculatorType);
    public int[] getNum();
    public void setNum(int[] num);
    public AdderInterface getAdder();
    public void setAdder(AdderInterface adder);
    public MultiplierInterface getMultiplier();
    public void setMultiplier(MultiplierInterface multiplier);
}
