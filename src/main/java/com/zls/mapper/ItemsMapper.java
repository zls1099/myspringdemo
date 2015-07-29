package com.zls.mapper;

import java.util.List;

import com.zls.po.Items;
import com.zls.po.QueryVo;

public interface ItemsMapper {
	// 商品列表
	public List<Items> findItemsList(QueryVo queryVo) throws Exception;
}
