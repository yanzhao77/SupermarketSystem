package cn.bdqn.sys.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import cn.bdqn.sys.service.ISmbmsBillService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yanzhao
 * @since 2019-01-27
 */
@RestController
@RequestMapping("/sys/smbms-bill")
public class SmbmsBillController {

	private ISmbmsBillService ISmbmsBillService;
	@RequestMapping("/queryOrders")
	public void queryOrders() {

	}
}
