package FactoryDesignPattern;

public class Demo {
    public static void main(String[] args) {
        Course hldCourse = CourseFactory.getCourse("HLD");
        Course lldCourse = CourseFactory.getCourse("LLD");

        assert hldCourse != null;
        System.out.println("HLD Modules:: " + hldCourse.modules);
        assert lldCourse != null;
        System.out.println("LLD Modules:: " + lldCourse.modules);

    }
}
