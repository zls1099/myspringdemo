package com.zls.mapper;

import org.springframework.stereotype.Component;

import com.zls.po.Items;

@Component
public interface ItemsMapper {
	// 商品列表
	public Items findItemsById(Integer id) throws Exception;
}
