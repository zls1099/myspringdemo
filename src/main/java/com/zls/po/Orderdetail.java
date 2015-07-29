package com.zls.po;

/**
 * ������ϸ��orderdetail
 * ��¼���û�������Ϣ
 * ����������orders_id�������
 * ��Ʒid:items_id�������
 * ��Ʒ����
 * ��Ʒ����۸�
 * @author liangshen_zhou
 *
 */
public class Orderdetail {

	private Integer id;
    private Integer ordersId;
    private Integer itemsId;
    private Integer itemsNum;
    
	public Orderdetail() {
		super();
	}

	public Orderdetail(Integer id, Integer ordersId, Integer itemsId,
			Integer itemsNum) {
		super();
		this.id = id;
		this.ordersId = ordersId;
		this.itemsId = itemsId;
		this.itemsNum = itemsNum;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrdersId() {
		return ordersId;
	}

	public void setOrdersId(Integer ordersId) {
		this.ordersId = ordersId;
	}

	public Integer getItemsId() {
		return itemsId;
	}

	public void setItemsId(Integer itemsId) {
		this.itemsId = itemsId;
	}

	public Integer getItemsNum() {
		return itemsNum;
	}

	public void setItemsNum(Integer itemsNum) {
		this.itemsNum = itemsNum;
	}

}
