package com.zls.service;

import java.util.List;

import com.zls.po.Items;
import com.zls.po.QueryVo;

public interface ItemsService {
	//商品查询列表
	public List<Items> findItemsList(QueryVo queryVo) throws Exception;

}
