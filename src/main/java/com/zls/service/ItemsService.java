package com.zls.service;

import java.util.List;

import com.zls.po.Items;
import com.zls.po.QueryVo;

public interface ItemsService {
	//��Ʒ��ѯ�б�
	public List<Items> findItemsList(QueryVo queryVo) throws Exception;

}
