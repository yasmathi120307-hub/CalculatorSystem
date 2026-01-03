public class Multiplier extends Calculator implements MultiplierInterface{
    public Multiplier(String calculatorId,UserInterface user){
        this.setCalculatorId(calculatorId);
        this.setUser(user);
        this.setNum(user.getNum());
    }


}