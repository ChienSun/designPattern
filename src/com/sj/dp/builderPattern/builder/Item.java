package com.sj.dp.builderPattern.builder;

/**
 * 食品
 * @author 孙建
 */
public interface Item {

	public String name();		 // 食品名称
	public Packing packing(); 	 // 打包
	public float price();		 // 价格
}
