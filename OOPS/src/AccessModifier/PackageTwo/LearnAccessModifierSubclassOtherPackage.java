package AccessModifier.PackageTwo;

import AccessModifier.PackageOne.LearnAccessModifier;

public class LearnAccessModifierSubclassOtherPackage extends LearnAccessModifier {
    public LearnAccessModifierSubclassOtherPackage(int publicVariable, int privateVariable, int packagePrivateVariable, int protectedVariable) {
        super(publicVariable, privateVariable, packagePrivateVariable, protectedVariable);
    }

    public void accessProtectedVariable() {
        // Accessing the protected variable from the superclass
        System.out.println("Accessing Protected Variable in Subclass: " + protectedVariable);
    }

    public static void main(String[] args) {
        var obj = new LearnAccessModifierSubclassOtherPackage(11,12,13,14);
        System.out.println("public Variable Value:: " + obj.publicVariable);
        // Accessing protected variable using the subclass context
        obj.accessProtectedVariable();

//        System.out.println(obj.privateVariable);
//        System.out.println(obj.packagePrivateVariable);
    }
}
