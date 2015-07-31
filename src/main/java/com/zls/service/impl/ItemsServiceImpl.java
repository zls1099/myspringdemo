package com.zls.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zls.mapper.ItemsMapper;
import com.zls.po.Items;
import com.zls.service.ItemsService;

@Service
public class ItemsServiceImpl implements ItemsService {
	@Autowired
	private ItemsMapper itemsMapper;

	@Override
	public Items findItemsById(Integer id) throws Exception {
		return itemsMapper.findItemsById(id);
	}

}
