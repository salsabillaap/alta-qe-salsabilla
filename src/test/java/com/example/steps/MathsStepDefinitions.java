package com.example.steps;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;

import com.example.BaseTest;
import com.example.app.Calculator;
import com.example.app.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;

public class MathsStepDefinitions extends BaseTest {

    @When("fill angka {string} field with {int}")
    public void fillAngkaSatuFieldWith(String type, int angka) {
        if (type.equalsIgnoreCase("satu")){
            calculatorPage.inputAngkaSatu(angka);
        } else {
            calculatorPage.inputAngkaDua(angka);
        }
    }

    @And("I operate angka satu and dua use {string}")
    public void iOperateAngkaSatuAndDuaUse(String opr) {
        calculatorPage.clickChooseOpr();
        calculatorPage.chooseOpr(opr);
    }
    @And("user click equals button")
    public void userClickEqualsButton() {
        calculatorPage.clickEquals();
    }

    @Then("the {int} should be appeared")
    public void theShouldBeAppeared(int expectedHasil) {
        int actualHasil= Integer.parseInt(calculatorPage.getResult().replaceAll("Hasil : ", ""));
        assertThat(expectedHasil).isEqualTo(actualHasil);
    }

    @When("user not fill all the fields")
    public void userNotFillAllTheFields() {
    }

    @Then("equals button cant be clicked")
    public void equalsButtonCantBeClicked() {
        calculatorPage.checkEqualsButton();
    }

    @When("user fill angka {string} with {string}")
    public void userFillAngkaWith(String str, String nmb) {
        if (str.equalsIgnoreCase("satu")){
            calculatorPage.inputNegativeAngkaSatu(nmb);
        } else {
            calculatorPage.inputNegativeAngkaDua(nmb);
        }
    }

    @Then("field {string} can't be input with alphabet")
    public void fieldCanTBeInputWithAlphabet(String arg0) {
        String actual;
        if(arg0.equalsIgnoreCase("satu")){
            actual = calculatorPage.getValueFieldAngkaSatu();
        } else{
            actual = calculatorPage.getValueFieldAngkaDua();
        }
        assertFalse(actual.matches("^[a-zA-Z]*$"));
    }
}
