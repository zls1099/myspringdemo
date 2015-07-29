package com.zls.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.zls.mapper.ItemsMapper;
import com.zls.po.Items;

public class ItemController implements Controller {
	@Autowired
	private ItemsMapper itemsMapper;

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// ��Ʒ��Ϣ�б�
		List<Items> itemsList = itemsMapper.findItemsList(null);
		// ����ModelAndView
		ModelAndView modelView = new ModelAndView();
		// �൱ ��request��setAttribut����jspҳ����ͨ��itemsListȡ����
		modelView.addObject("itemsList", itemsList);
		// ָ����ͼ
		modelView.setViewName("items/itemsList");
		
		return modelView;
	}

}
