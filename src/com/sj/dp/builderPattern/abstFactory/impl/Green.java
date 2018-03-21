package com.sj.dp.builderPattern.abstFactory.impl;

import com.sj.dp.builderPattern.abstFactory.Color;

/**
 * 绿色
 * @author 孙建
 */
public class Green implements Color{

	@Override
	public void fill() {
		System.out.println("fill绿色");
	}

}
