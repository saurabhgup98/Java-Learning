package AccessModifier.PackageTwo;

import AccessModifier.PackageOne.LearnAccessModifier;

public class PackageTwoMain {
    public static void publicAccessModifier(){
        System.out.println("-----------------------Learn Access Modifier-----------------------------------------------");
        var obj = new LearnAccessModifier(10,20,30,40);
        // Note:    We can see the Import Statement to import "LearnAccessModifier Class:
        //          Because the LearnAccessModifier Class is in other Package
        // Hence:       Any Class outside of Current Package will be imported
        //              i.e. It first searches for class in same/Current Package and then Subsequent Packages


        System.out.println("public Variable Value:: " + obj.publicVariable);

//        System.out.println("Package Private Variable Value:: " + obj.packagePrivateVariable);
//        Above sout will throw an error because it is trying to access "Package private variable" from other package
//        i.e.packagePrivateVariable is in "PackageOne" and We are trying to access it from file in PackageTwo

//        System.out.println(obj.privateVariable);
//         Above sout will throw an error because it is trying to access "private variable" which can only be
//         accessed from the LearnAccessModifier Class
    }
}
