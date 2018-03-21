package com.sj.dp.builderPattern.prototype;

/**
 * 抽象的形状
 * @author 孙建
 */
public abstract class Shape implements Cloneable{

	private String id;
	protected String type;
	
	/** 绘画方法 */
	public abstract void draw();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	/** 克隆方法  */
	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
