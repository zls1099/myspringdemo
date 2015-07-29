package com.zls.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.zls.mapper.ItemsMapper;
import com.zls.po.Items;
import com.zls.po.QueryVo;
import com.zls.service.ItemsService;

public class ItemsServiceImpl implements ItemsService {
	@Autowired
	private ItemsMapper itemsMapper;

	@Override
	public List<Items> findItemsList(QueryVo queryVo) throws Exception {
		return itemsMapper.findItemsList(queryVo);
	}

}
