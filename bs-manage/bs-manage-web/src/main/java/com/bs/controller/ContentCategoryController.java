package com.bs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bs.common.bean.EUTreeNode;
import com.bs.common.bean.ResponseResultJson;
import com.bs.service.ContentCategoryService;


@Controller

@RequestMapping("/content/category")
public class ContentCategoryController {

	@Autowired
	private ContentCategoryService  contentCategoryService;
	
	/**
	 * 获取内容分类列表
	 * @param parentId
	 * @return
	 */
	@RequestMapping("/getContentCategoryList")
    @ResponseBody
	public List<EUTreeNode> getContentCategoryList(@RequestParam(value="id",defaultValue="0")Long parentId){
		List<EUTreeNode> list = contentCategoryService.getCategoryList(parentId);
		return list;
	}
	
	/**
	 * 添加内容分类
	 * @param parentId
	 * @param name
	 * @return
	 */
	@RequestMapping("/createContentCategory")
	@ResponseBody
	public ResponseResultJson createContentCategory(Long parentId, String name) {
		ResponseResultJson result = contentCategoryService.insertContentCategory(parentId, name);
		return result;
	}

}
