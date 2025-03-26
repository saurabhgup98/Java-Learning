package AccessModifier.PackageOne;

public class LearnAccessModifierSubclassSamePackage extends LearnAccessModifier {

    public LearnAccessModifierSubclassSamePackage(int publicVariable, int privateVariable, int packagePrivateVariable, int protectedVariable) {
        super(publicVariable, privateVariable, packagePrivateVariable, protectedVariable);
    }

    public static void main(String[] args) {
        var obj = new LearnAccessModifier(11,12,13,14);

        System.out.println("public Variable Value:: " + obj.publicVariable);
        System.out.println("Package Private Variable Value:: " + obj.packagePrivateVariable);
        System.out.println("Protected Variable Value:: " + obj.protectedVariable);

//        System.out.println(obj.privateVariable);
//          Above sout will throw an error as we are trying to access the Variable with Private Access Modifier which
//          Can only be accessed in the same class where it is declared ie. LearnAccessModifier Class
    }
}
