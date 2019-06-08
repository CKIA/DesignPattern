package com.hollischuang.pattern.Proxy;

/**
 * @author ckia
 * @title: RealImage
 * @projectName DesignPattern
 * @description: TODO
 * @date 19-6-6下午10:37
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}