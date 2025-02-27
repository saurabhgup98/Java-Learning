package AccessModifier.PackageOne;

import static AccessModifier.PackageOne.PackageOneNext.packageOnePrivateAccessModifier;
import static AccessModifier.PackageTwo.PackageTwoMain.publicAccessModifier;

public class PackageOneMain {
    public static void main(String[] args) {
        System.out.println("Hello to the Access Modifier concept");
        publicAccessModifier();
        packageOnePrivateAccessModifier();
    }
}
