package com.hollischuang.pattern.Proxy;

/**
 * @author ckia
 * @title: ProxyImage
 * @projectName DesignPattern
 * @description: TODO
 * @date 19-6-6下午10:37
 */
public class ProxyImage implements Image{

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}