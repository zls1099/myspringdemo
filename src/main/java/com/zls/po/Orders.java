package com.zls.po;

import java.io.Serializable;
import java.util.Date;

/**
 * ������orders
 * ��¼���û������Ķ���
 * �����û�:users_id(���)
 * ������
 * ����ʱ��
 * ����״̬ 
 * @author liangshen_zhou
 *
 */
public class Orders implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8862365184678910678L;
	
	private Integer id;
    private Integer userId;
    private String number;
    private Date createtime;
    private String note;
    
	public Orders() {
		super();
	}
	
	public Orders(Integer id, Integer userId, String number, Date createtime,
			String note) {
		super();
		this.id = id;
		this.userId = userId;
		this.number = number;
		this.createtime = createtime;
		this.note = note;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
}
