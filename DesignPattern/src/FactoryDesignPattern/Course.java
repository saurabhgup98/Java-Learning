package FactoryDesignPattern;

import FactoryDesignPattern.modules.Module;

import java.util.ArrayList;
import java.util.List;

public abstract class Course {
    protected List<FactoryDesignPattern.modules.Module> modules = new ArrayList<>();

    public Course() {
        this.createCourse();
    }

    public abstract void createCourse();
    // Abstract Methods are declared in the Abstract Parent Classes and Implemented by Child Classes

    public List<Module> getModules(){return modules;};
}
