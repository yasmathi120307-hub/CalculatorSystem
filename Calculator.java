public abstract class Calculator implements CalculatorInterface{
    //Known
    private String calculatorId;
    private int result;
    //Unknown
    //private int[] num=new int[3];
    private int [] num;
    private UserInterface user;

    public String getCalculatorId() {
        return calculatorId;
    }

    public void setCalculatorId(String calculatorId) {
        this.calculatorId = calculatorId;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public UserInterface getUser() {
        return user;
    }

    public void setUser(UserInterface user) {
        this.user = user;
    }

    public int[] getNum() {
        return num;
    }

    public void setNum(int[] num) {
        this.num = num;
    }

    public void compute(){
        this.setResult(getNum()[0]*getNum()[1]*getNum()[2]);
        System.out.println("the final result");
        System.out.println(this.getResult());
    }

}