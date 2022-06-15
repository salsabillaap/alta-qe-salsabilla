package alterra.step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefs {
    int firstnum, secondnum;
    String operator;
    @When("I want to count {int} and {int}")
    public void iWantToCountAnd(int arg0, int arg1) {
        firstnum = arg0;
        secondnum = arg1;
    }

    @And("I am using {string} operator")
    public void iAmUsingOperator(String arg0) {
        operator = arg0;
    }

    @Then("I receive {int} from this count")
    public void iReceiveFromThisCount(int arg0) {
        switch (operator){
            case "+" :
                if (firstnum + secondnum == arg0){
                    System.out.println("Result: " + (firstnum+secondnum) + " Sesuai");
                } else{
                    System.out.println("Tidak sesuai");
                }
                break;
            case "-" :
                if (firstnum - secondnum == arg0){
                    System.out.println("Result: " + (firstnum-secondnum) + " Sesuai");
                } else{
                    System.out.println("Tidak sesuai");
                }
                break;
            case "*" :
                if (firstnum * secondnum == arg0){
                    System.out.println("Result: " + (firstnum*secondnum) + " Sesuai");
                } else{
                    System.out.println("Tidak sesuai");
                }
                break;
            case "/" :
                if (firstnum / secondnum == arg0){
                    System.out.println("Result: " + (firstnum/secondnum) + " Sesuai");
                } else{
                    System.out.println("Tidak sesuai");
                }
                break;
            default:
                System.out.println("Tidak sesuai");
                break;
        }
    }
}
