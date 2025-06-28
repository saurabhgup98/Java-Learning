package FactoryDesignPattern;

import FactoryDesignPattern.modules.DemoModule;
import FactoryDesignPattern.modules.IntroModule;
import FactoryDesignPattern.modules.SummaryModule;

public class LLD extends Course{
    @Override
    public void createCourse() {
        modules.add(new IntroModule());
        modules.add(new DemoModule());
        modules.add(new SummaryModule());
    }
}