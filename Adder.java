public class Adder extends Calculator implements AdderInterface{
    public Adder(String calculatorId,UserInterface user){
        this.setCalculatorId(calculatorId);
        this.setUser(user);
        this.setNum(user.getNum());
    }
    @Override
    public void compute(){
        this.setResult(getNum()[0]+getNum()[1]+getNum()[2]);
        System.out.println("the final result");
        System.out.println(this.getResult());
    }
}
