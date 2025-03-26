package AccessModifier.PackageOne;

import static AccessModifier.PackageOne.PackageOneNext.packageOnePrivateAccessModifier;
import static AccessModifier.PackageTwo.PackageTwoMain.publicAccessModifier;

public class PackageOneMain {
    public static void main(String[] args) {
        System.out.println("Hello to the Access Modifier concept");
        publicAccessModifier();
        packageOnePrivateAccessModifier();

        var obj = new LearnAccessModifier(10,20,30,40);

        System.out.println("public Variable Value:: " + obj.publicVariable);

        System.out.println("Package Private Value:: " + obj.packagePrivateVariable);

        //System.out.println(obj.privateVariable);
        // Above sout This will throw an error as it is trying to access Variable with Private access Modifier

    }
}
