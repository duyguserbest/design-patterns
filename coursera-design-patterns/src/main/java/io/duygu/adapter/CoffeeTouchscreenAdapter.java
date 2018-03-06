package io.duygu.adapter;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

    private OldCoffeeMachine coffeeMachine;

    public CoffeeTouchscreenAdapter() {
        this.coffeeMachine = new OldCoffeeMachine();
    }

    public void chooseFirstSelection() {
        coffeeMachine.selectA();
    }

    public void chooseSecondSelection() {
        coffeeMachine.selectB();
    }
}
