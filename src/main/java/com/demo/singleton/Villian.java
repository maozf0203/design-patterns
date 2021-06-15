package com.demo.singleton;

/**
 * create by zfmao 2021/6/15 4:47 下午
 * 恶汉式单例模式(类加载时初始化)
 */
public class Villian {

    private static  InstanceBean instanceBean = new InstanceBean();

    private Villian(){

    }

    public InstanceBean getInstance(){
        return instanceBean;
    }
}
