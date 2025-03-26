package AccessModifier.PackageOne;

public class LearnAccessModifier {

    private int privateVariable;
    public int publicVariable;
    int packagePrivateVariable;
    protected int protectedVariable;

    public LearnAccessModifier(int publicVariable, int privateVariable, int packagePrivateVariable, int protectedVariable) {
        this.publicVariable = publicVariable;
        this.privateVariable = privateVariable;
        this.packagePrivateVariable = packagePrivateVariable;
        this.protectedVariable= protectedVariable;
    }

    public void display() {
        System.out.println("Protected Variable in A: " + protectedVariable);
    }
}
