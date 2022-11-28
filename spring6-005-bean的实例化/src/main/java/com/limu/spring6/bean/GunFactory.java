package com.limu.spring6.bean;

/**
 * 工厂方法模式中的具体工厂角色
 */
public class GunFactory {

    // 工厂方法模式中的具体工厂角色中的方法是：实例方法。
    public Gun get(){
        return new Gun();
    }
}
