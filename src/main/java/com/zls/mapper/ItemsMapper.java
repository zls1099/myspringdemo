package com.zls.mapper;

import org.springframework.stereotype.Component;

import com.zls.po.Items;

@Component
public interface ItemsMapper {
	// ��Ʒ�б�
	public Items findItemsById(Integer id) throws Exception;
}
