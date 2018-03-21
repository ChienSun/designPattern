package com.sj.dp.builderPattern.singleton;

/**
 * 单例模式
 * @author 孙建
 */
public class SingleObject {

	private static SingleObject obj = new SingleObject();
	
	private SingleObject() {}
	
	public static SingleObject getInstance() {
		return obj;
	}
	
	public void showObj() {
		System.out.println(obj);
	}
}
