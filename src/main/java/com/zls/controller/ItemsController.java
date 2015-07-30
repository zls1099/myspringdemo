package com.zls.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.zls.mapper.ItemsMapper;
import com.zls.po.Items;

public class ItemsController implements Controller {
	@Autowired
	private ItemsMapper itemsMapper;

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// 商品信息列表
		List<Items> itemsList = new ArrayList<>();
		Items items = itemsMapper.findItemsById(1);
		itemsList.add(items);
		
		// 返回ModelAndView
		ModelAndView modelView = new ModelAndView();
		// 相当 于request的setAttribut，在jsp页面中通过itemsList取数据
		modelView.addObject("itemsList", itemsList);
		// 指定视图
		modelView.setViewName("items/itemsList");
		
		return modelView;
	}

}
