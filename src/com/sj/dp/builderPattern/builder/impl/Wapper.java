package com.sj.dp.builderPattern.builder.impl;

import com.sj.dp.builderPattern.builder.Packing;

/**
 * 包装纸 - 包装类型
 * @author 孙建
 */
public class Wapper implements Packing{

	@Override
	public String pack() {
		return "wapper";
	}

}
