public class Eagle{
    private String breed;
    private boolean canSwim;

    public void fly(){
        System.out.println("Fly");
    }

    private void eat(){
        System.out.println("eat");
    }

    @Deprecated
    public void dummy(){
        System.out.println("dummy");
    }
}
