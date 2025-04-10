package Inheritance.multileveli;

import Inheritance.Box;

/**
 * This Class is Created to learn Multilevel IInheritance
 * This Extends Box Class which is Parent to BoxWithWeight and Now we should make it current class Parent also
 */
public class MetalBoxWithoutPrice extends Box {

    String metal;

    public MetalBoxWithoutPrice(String metal) {
        this.metal = metal;
    }

    public MetalBoxWithoutPrice(double width, double height, double length, String metal) {
        super(width, height, length);
        this.metal = metal;
    }
}