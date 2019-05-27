/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author gadisa
 */
public class EnhancedCoffeeMachine  {
    private CoffeeMachine coffeeMachine;
    public EnhancedCoffeeMachine(CoffeeMachine coffeeMachine){
        this.coffeeMachine  = coffeeMachine;
    
    }
    
    public void makeLargeCoffee(){
    System.out.println("Enhanced: Making large coffee");
    }
    public void makeCoffeWithMilk(){
        System.out.println("---------------------------------------");
        System.out.println("Enhanced: Making coffee with milk");
        coffeeMachine.makeSmallCoffee();
        System.out.println("---------------------------------------");
        addMilk();
    }
    public void makeSmallCoffee(){
    coffeeMachine.makeSmallCoffee();
    }
    private void addMilk(){
    System.out.println("Enhanced: Adding milk");
    }
    
}
