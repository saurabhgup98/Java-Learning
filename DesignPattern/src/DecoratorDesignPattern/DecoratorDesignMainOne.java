//package DecoratorDesignPattern;
//
////abstract class BasePizza {
////    public abstract int cost();
////}
////
////class FarmHouse extends BasePizza{
////
////    @Override
////    public int cost(){
////        return 200;
////    }
////}
////
////class Margarita extends BasePizza {
////
////    @Override
////    public int cost(){
////        return 100;
////    }
////}
////
////class VegDelight extends BasePizza{
////
////    @Override
////    public int cost(){
////        return 120;
////    }
////}
////
////abstract class ToppingDecorator extends BasePizza{
////
////}
////
////class ExtraCheese extends ToppingDecorator{
////
////    BasePizza basePizza;
////
////    public ExtraCheese(BasePizza basePizza){
////        this.basePizza = basePizza;
////    }
////
////    @Override
////    public int cost(){
////        return basePizza.cost() + 30;
////    }
////}
////
////class Mushrooms extends ToppingDecorator{
////    BasePizza basePizza;
////
////    Mushrooms(BasePizza basePizza){
////        this.basePizza = basePizza;
////    }
////
////    @Override
////    public int cost(){
////        return basePizza.cost() + 20;
////    }
////}
//
//public class DecoratorDesignMainOne {
//    public static void main(String[] args) {
//        //Let's Take Margaretha with extra Cheese
////        Margarita margarita = new Margarita();
////        System.out.println(new ExtraCheese(margarita).cost());
//    }
//
//
//}
