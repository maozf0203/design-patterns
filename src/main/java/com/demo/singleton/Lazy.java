package com.demo.singleton;

/**
 * create by zfmao 2021/6/15 4:01 下午
 * 懒汉式单例(使用时再进行加载)
 */
public class Lazy {
    private static volatile InstanceBean instanceBean = null;

    private static final Object lockObject =  new Object();

    private Lazy(){

    }

    public InstanceBean getInstance(){
        if (instanceBean == null){
            synchronized (lockObject){
                if (instanceBean == null){
                    instanceBean = new InstanceBean();
                }
            }
        }
    return instanceBean;
    }
}
