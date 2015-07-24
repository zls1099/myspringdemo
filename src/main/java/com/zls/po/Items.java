package com.zls.po;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品信息：items
 * 记录了所有商品信息
 * 商品id：id（主键）
 * 商品名称：
 * 商品介绍
 * 商品价格
 * @author liangshen_zhou
 *
 */
public class Items implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8031898689424059457L;
	
	private Integer id;
	private String name;
	private Float price;
	private String pic;
	private Date createtime;
	private String detail;
	
	public Items() {
		super();
	}

	public Items(Integer id, String name, Float price, String pic,
			Date createtime, String detail) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.pic = pic;
		this.createtime = createtime;
		this.detail = detail;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
}
