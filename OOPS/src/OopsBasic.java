class ParentClass{
    int parentVarOne;
    int parentVarTwo;

    public ParentClass(int parentVarOne, int parentVarTwo) {
        this.parentVarOne = parentVarOne;
        this.parentVarTwo = parentVarTwo;
    }

    public ParentClass(int parentVarTwo) {
        this.parentVarTwo = parentVarTwo;
    }

    public ParentClass() {
    }

    public ParentClass(boolean parentVarOneProvided, int value) {
        if (parentVarOneProvided) {
            this.parentVarOne = value;
        } else {
            this.parentVarTwo = value;
        }
    }
}

public class OopsBasic {
    public static void main(String[] args) {
        var objWithAllParameters = new ParentClass(10,20);
        System.out.println("All Args Constructor parentVarOne:: " + objWithAllParameters.parentVarOne + " parentVarTwo:: " +
                objWithAllParameters.parentVarTwo);

        var objWithNoParameters = new ParentClass();
        System.out.println("No args Constructor => parentVarOne:: " + objWithNoParameters.parentVarOne + " parentVarTwo:: " +
                objWithNoParameters.parentVarTwo);

        var objWithOneParameter = new ParentClass(100);
        System.out.println("constructor with 2nd value as attribute => parentVarOne:: " +
                objWithOneParameter.parentVarOne + " parentVarTwo:: " + objWithOneParameter.parentVarTwo);
//        Since we cannot provide key and value inside the constructor, so constructor expects one value
//          how compiler will know is it first attribute or 2nd. Hence we can create constructor with either of two values

        var customObjWithBooleanAndOneValue = new ParentClass(true, 3000);
        System.out.println("Custom constructor with boolean and one value => parentVarOne:: " +
                customObjWithBooleanAndOneValue.parentVarOne + " parentVarTwo:: " +
                customObjWithBooleanAndOneValue.parentVarTwo);
    }

}
