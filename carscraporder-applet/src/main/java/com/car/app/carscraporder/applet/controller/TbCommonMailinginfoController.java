package com.car.app.carscraporder.applet.controller;

import javax.servlet.http.HttpServletRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.car.app.carscarporder.web.service.TbCommonMailinginfoService;
import com.car.app.carscraporder.applet.threadlocal.UserUtil;
import com.car.app.carscraporder.bo.ClientBO;
import com.car.app.carscraporder.pojo.TbCommonMailinginfo;
import com.car.app.common.bean.PageResult;
import com.car.app.common.bean.ResultBean;
import com.car.app.common.exception.DataException;

@Controller
@RequestMapping(value="/commonMailing")
@Api(value = "commonMailing-API",tags={"常用收件人"})
public class TbCommonMailinginfoController {
	
	
	@Autowired
	private TbCommonMailinginfoService tbCommonMailinginfoService;
	
	
	/**
	 * 
	 * @param page
	 * @param rows
	 * @param paramter
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "获取常用收件人分页列表",notes = "获取常用收件人分页列表")
	public ResultBean<PageResult> getCompanyList(
			@ApiParam(name = "page", value = "分页参数页码",required = true)
			@RequestParam(value="page",required = true,defaultValue="1")Integer page,
			@ApiParam(name = "rows", value = "分页参数每页数据条数",required = true)
			@RequestParam(value="rows",required = true,defaultValue="10")Integer rows,
			TbCommonMailinginfo paramter, HttpServletRequest request) throws Exception{
		     
		    ClientBO user = UserUtil.getUser();
            if(user==null){
   	            throw new DataException("未登录系统");
             } 
             paramter.setClientid(user.getId());
		     return new ResultBean(tbCommonMailinginfoService.queryPageListByWhere(page, rows, paramter));
		
		
	}

}
