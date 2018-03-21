package com.sj.dp.builderPattern.builder.impl;

import java.util.ArrayList;
import java.util.List;

import com.sj.dp.builderPattern.builder.Item;

/**
 * 套餐
 * @author 孙建
 */
public class Meal {

	// 套餐产品列表
	private List<Item> itemList = new ArrayList<Item>();
	
	// 添加产品
	public void addItem(Item item) {
		itemList.add(item);
	}
	
	// 获取总价格
	public float getCost() {
		float cost = 0.0F;
		for (Item item : itemList) {
			cost += item.price();
		}
		return cost;
	}
	
	// 展示套餐信息
	public void showItems() {
		for (Item item : itemList) {
			System.out.print("item：" + item.name());
			System.out.print("，packing：" + item.packing().pack());
			System.out.println("，price：" + item.price());
		}
	}
}
