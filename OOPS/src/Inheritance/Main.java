package Inheritance;

public class Main {
    public static void main(String[] args) {
        Box boxWithDefaultParameters = new Box();
        System.out.println("Box details with default parameters are :: " + "width => " + boxWithDefaultParameters.width
         + " height => " + boxWithDefaultParameters.height + " length  => " + boxWithDefaultParameters.length);
        Box cube = new Box(12);
        System.out.println("Cube Box details with just one parameters are :: " + "width => " + cube.width
                + " height => " + cube.height + " length  => " + cube.length);
        Box boxThree = new Box(12,10,13);
        System.out.println("Box details with all parameters are :: " + "width => " + boxThree.width
                + " height => " + boxThree.height + " length  => " + boxThree.length);
        Box oldBox = new Box(boxThree);
        System.out.println("Box details with Box as parameters are :: " + "width => " + oldBox.width
                + " height => " + oldBox.height + " length  => " + oldBox.length);
        BoxWithWeight boxWithWeight = new BoxWithWeight(10,12,10,99);
        System.out.println("Weight Box details with all 4  parameters are :: " + "width => " + boxWithWeight.width
                + " height => " + boxWithWeight.height + " length  => " + boxWithWeight.length + " weight =>" + boxWithWeight.weight );

        // Note: From Child we can call Parent Parameters like boxWithWeight calls height,length,width from parent but
        //                                                      boxThree, oldBox etc cannot call weight

        Box boxWithoutWeight = new BoxWithWeight(12,15,10,100);
/*        System.out.println(boxWithoutWeight.length); // Possible
        System.out.println(boxWithoutWeight.weight); // Not Possible*/

        // Note: boxWithoutWeight its Datatype is Box(which is parent of BoxWithWeight) & hence it can access properties
        //       of Box & not Child ie BoxWithWeight

//        BoxWithWeight boxWithWeight1 = new Box();
        /* This will throw an error because
        * 1. Object is of Type weightWithBox and hence it needs to give 4 parameters
        * 2. But Box just knows maximum three parameters & it has no idea about weight Variable and
        * HENCE THE ABOVE WE CANNOT DO.*/
    }

}
