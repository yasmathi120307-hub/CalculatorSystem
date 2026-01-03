public interface CalculatorInterface {
    public String getCalculatorId();
    public void setCalculatorId(String calculatorId);
    public int getResult();
    public void setResult(int result);
    public UserInterface getUser();
    public void setUser(UserInterface user);
    public int[] getNum();
    public void setNum(int[] num);
    public void compute();
}
