package Inheritance;

public class Main {
    public static void main(String[] args) {
        Box boxWithDefaultParameters = new Box();
        System.out.println("Box details with default parameters are :: " + "width => " + boxWithDefaultParameters.width
         + " height => " + boxWithDefaultParameters.height + " length  => " + boxWithDefaultParameters.length);


        Box boxWithAllParameters = new Box(12,10,13);
        System.out.println("Box details with all parameters are :: " + "width => " + boxWithAllParameters.width
                + " height => " + boxWithAllParameters.height + " length  => " + boxWithAllParameters.length);


        Box boxWithOneParameter = new Box(12);
        System.out.println("Cube Box details with just one parameters are :: " + "width => " + boxWithOneParameter.width
                + " height => " + boxWithOneParameter.height + " length  => " + boxWithOneParameter.length);


        Box oldBox = new Box(boxWithAllParameters);
        System.out.println("Box details with Box as parameters are :: " + "width => " + oldBox.width
                + " height => " + oldBox.height + " length  => " + oldBox.length);

        //Let's create the object of child class i.e. BoxWithWeight which has all 3 properties of parent and one property of its own
        BoxWithWeight boxWithWeight = new BoxWithWeight(10,12,10,99);
        System.out.println("Weight Box details with all 4  parameters are :: " + "width => " + boxWithWeight.width
                + " height => " + boxWithWeight.height + " length  => " + boxWithWeight.length + " weight =>" + boxWithWeight.weight);

        var BoxWithWeight = new BoxWithWeight(2000);
        System.out.println("Weight Box details with 1 weight parameter & default child Parameter are :: " +
                "width => " + BoxWithWeight.width + " height => " + BoxWithWeight.height + " length  => " +
                BoxWithWeight.length + " weight =>" + BoxWithWeight.weight);
/*
         Possible combination of object creation using Parent and Child class
              1.Parent objName = new Parent();  => Possible (Like in all above Examples)
              2.Parent objName = new Child();   => Possible
              3.Child objName  = new Child();   => Possible (Like in all above Examples)
              4.Child objName  = new Parent();   => Not Possible
         NOTE:
                * Whatever creation is Possible, needs their constructor in the respective class
                *** Always Reference Type should be Parent and Object Can be child (Vice Versa is not possible)
                *** And It can only return the properties of the Reference Type
*/
//        Let's create object of Child but using the Parent "Box" Class
        Box boxWithoutWeight = new BoxWithWeight(12,15,10,100);
//        Note: From Child Object,  we can call Parent Parameters i.e. height,length,width
        System.out.println(boxWithoutWeight.length);        // Possible
//        But we cannot call the Child Parameter i.e. weight
//        System.out.println(boxWithoutWeight.weight);      // Not Possible*/
//  Hence Considering the above scenario, the Better obj creation was :; Box boxWithoutWeight = new BoxWithWeight(12,15,10); No weight


//        BoxWithWeight boxWithWeight1 = new Box();
        /* This will throw an error because
        * 1. Object is of Type BoxWithWeight i.e. Child and hence it expects to give 4 parameters
        * 2. But Box(Parent) just knows maximum three parameters & it has no idea about weight Variable and
        * HENCE THE ABOVE WE CANNOT DO.*/

        System.out.println("--------------Multilevel Inheritance -----------------------------------------------------");
        BoxWithPrice boxWithJustPrice = new BoxWithPrice(1000);
        System.out.println("BoxWithPrice details with just price parameter are :: " + "width => " + boxWithJustPrice.width
                + " height => " + boxWithJustPrice.height + " length  => " + boxWithJustPrice.length +
                " price =>" + boxWithJustPrice.price + " weight =>" + boxWithJustPrice.weight);

        BoxWithPrice boxWithAllParentAndPrice = new BoxWithPrice(12,24,36,48,989);
        System.out.println("BoxWithPrice details with all 5 parameters are :: " + "width => " + boxWithAllParentAndPrice.width
                + " height => " + boxWithAllParentAndPrice.height + " length  => " + boxWithAllParentAndPrice.length +
                " price =>" + boxWithAllParentAndPrice.price + " weight =>" + boxWithAllParentAndPrice.weight);

        Box boxOne = new BoxWithPrice(989);
        System.out.println("The length is ::" + boxOne.length);
        //NOTE: Here The Reference Type is Box and so it can only return the Box Related property i.e l, width and height
    }

}
