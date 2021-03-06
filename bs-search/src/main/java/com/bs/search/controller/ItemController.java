package com.bs.search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bs.common.bean.ResponseResultJson;
import com.bs.search.service.ItemService;

@Controller
@RequestMapping("/manager")
public class ItemController {

	@Autowired
	private ItemService itemService;
	/**
	 * 导入商品数据到索引库
	 */
	@RequestMapping("/importall")
	@ResponseBody
	public ResponseResultJson importAllItems() {
		ResponseResultJson result = itemService.importAllItems();
		return result;
	}
}
