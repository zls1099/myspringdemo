package com.zls.mapper;

import java.util.List;

import com.zls.po.Items;
import com.zls.po.QueryVo;

public interface ItemsMapper {
	// ��Ʒ�б�
	public List<Items> findItemsList(QueryVo queryVo) throws Exception;
}
