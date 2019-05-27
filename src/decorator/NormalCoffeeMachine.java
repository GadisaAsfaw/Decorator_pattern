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
public class NormalCoffeeMachine implements CoffeeMachine {

    @Override
    public void makeSmallCoffee() {
        
        System.out.println("Normal : Making small coffe");
          }

    @Override
    public void makeLargeCoffee() {
        System.out.println("Normal: Making large coffee");
        }
    
}
