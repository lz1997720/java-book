package com.store.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.store.dto.ShoppingDTO;
import com.store.mapper.GoodsMapper;
import com.store.mapper.UserMapper;
import com.store.model.Shopping;
import com.store.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.store.service.ShoppingService;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

@Controller
@RequestMapping(value = "/mystore")
public class ShoppingController {
	
	@Autowired
	private ShoppingService shoppingService;
	@Autowired
	private GoodsMapper goodsMapper;
	@Autowired
	private UserService userService;
	@Autowired
	private UserMapper userMapper;

	@RequestMapping(value = "/shopping", method = RequestMethod.GET)
	public String getShopping(HttpServletRequest req, HttpServletResponse resp,ModelMap model) {
		String name = (String) req.getSession().getAttribute("name");
		int userId = userMapper.selectUserId(name);
		if("".equals(name) || name == null){
			return "redirect:login";
		}else{
			//List<ShoppingDTO> l = shoppingService.selectShopping(userId);
			model.addAttribute("total",shoppingService.total(userId));
			model.addAttribute("num",shoppingService.getNum(userId));
			model.addAttribute("shoppings",shoppingService.selectShopping(userId));
			return "shopping";
		}
	}

	@RequestMapping(value = "/addToCar", method = RequestMethod.GET)
	public String addToCar(HttpServletRequest req, HttpServletResponse resp, ModelMap model) throws UnsupportedEncodingException {
		int goodsId = Integer.parseInt(req.getParameter("getI"));
		String name = (String) req.getSession().getAttribute("name");
		shoppingService.buyGoods(goodsId,name);
		return "redirect:shopping";
	}
	
	@RequestMapping(value = "/delshopping", method = RequestMethod.GET)
	public String delShopping(HttpServletRequest req, HttpServletResponse resp) {
		int id = Integer.parseInt(req.getParameter("getT"));
		shoppingService.delShopping(id);
		return "redirect:shopping";
	}
}
