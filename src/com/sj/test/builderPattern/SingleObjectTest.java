package com.sj.test.builderPattern;

import com.sj.dp.builderPattern.singleton.SingleObject;

/**
 * 单例测试
 * @author 孙建
 */
public class SingleObjectTest {

	public static void main(String[] args) {
		SingleObject so = SingleObject.getInstance();
		so.showObj();
		
		SingleObject so2 = SingleObject.getInstance();
		so2.showObj();
	}
}
