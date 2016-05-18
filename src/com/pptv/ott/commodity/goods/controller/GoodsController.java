package com.pptv.ott.commodity.goods.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pptv.ott.commodity.account.entity.Account;
import com.pptv.ott.commodity.account.service.AccountService;
import com.pptv.ott.commodity.dict.entity.Dict;
import com.pptv.ott.commodity.dict.service.DictService;
import com.pptv.ott.commodity.frame.filter.WebContext;
import com.pptv.ott.commodity.frame.utils.Const;
import com.pptv.ott.commodity.frame.utils.ValidatorUtils;
import com.pptv.ott.commodity.frame.utils.page.Pagination;
import com.pptv.ott.commodity.goods.entity.Goods;
import com.pptv.ott.commodity.goods.service.GoodsService;
import com.pptv.ott.commodity.role.entity.Role;
import com.pptv.ott.commodity.role.service.RoleService;



/**
 * 
 * @author yang
 * @version 2015-04-15 13:44:42
 * @see com.yang.spinach.account.web.Account
 */
@Controller
@RequestMapping(value = "/goods")
public class GoodsController {
	@Resource
	private GoodsService goodsService;

	@RequestMapping("get/{id}")
	@ResponseBody
	public Object get(@PathVariable Integer id) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put(Const.STATUS, -1);
		try {
			Goods a = goodsService.selectGoodsById(id);
			map.put(Const.STATUS, 1);
			map.put("data", a);
		} catch (Exception e) {
			e.printStackTrace();
			map.put(Const.MSG, Const.DEFAULT_ERROR);
		}
		return map;
	}

	@RequestMapping("/list")
	public String list(Goods goods, Pagination pagination,Model model) {
		List<Goods> list = goodsService.listPage(goods, pagination);
		WebContext.setAttribute("list", list);
		WebContext.setAttribute(Const.PAGINATION, pagination);
		return "/goods/list";
	}

	@RequiresPermissions("bus:goods:add")
	@RequestMapping("/add")
	public String add(Long id) {
		WebContext.setAttribute("id", id);
		return "/goods/add";
	}

	@RequestMapping("/save")
	@ResponseBody
	public Object save(Goods goods, Long roleId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put(Const.STATUS, -1);
		try {
			String message = ValidatorUtils.validate(goods);
			Integer i = 0;
			if (StringUtils.isBlank(message)) {
				if (goods.getId() != null && goods.getId() != 0) {
					Goods a = goodsService.selectByName(goods.getName(),goods.getId());
					if(a!=null){
						map.put(Const.MSG, "用户名已存在");
						return map;
					}
					i = goodsService.updateGoodsById(goods);
				} else {
					Goods a = goodsService.selectByName(goods.getName(),0);
					if(a!=null){
						map.put(Const.MSG, "用户名已存在");
						return map;
					}
					
					i = goodsService.saveGoods(goods);
				}
				if (i > 0) {
					map.put(Const.STATUS, 0);
					map.put(Const.MSG, "保存成功");
				}
			} else {
				map.put(Const.MSG, message);
			}
		} catch (Exception e) {
			e.printStackTrace();
			map.put(Const.MSG, Const.DEFAULT_ERROR);
		}
		return map;
	}
//
//	@RequestMapping("/editRole")
//	public String editRole(Long id) {
//		try {
//			Role role = new Role();
//			role.setDisabled(0);
//			Pagination p = new Pagination();
//			p.setRows(50);// 角色一般不会太多,50个应该足够了.........
//			List<Role> list = roleService.listPage(role, p);
//			List<Role> l = roleService.findByAccountId(id);
//			for (Role r : list) {
//				if (l.contains(r)) {
//					r.setChecked(Const.CHECKED);
//				}
//			}
//			WebContext.setAttribute("list", list);
//			WebContext.setAttribute("id", id);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return "/user/editRole";
//	}
//
//	@RequestMapping("/saveRole")
//	public String saveRole(Long id, Long[] rid) {
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put(Const.STATUS, -1);
//		try {
//			roleService.delRoleBYId(id);
//			roleService.bathSaveRole(rid, id);
//		} catch (Exception e) {
//			e.printStackTrace();
//			map.put(Const.MSG, Const.DEFAULT_ERROR);
//		}
//		return "redirect:/user/list";
//	}
}
