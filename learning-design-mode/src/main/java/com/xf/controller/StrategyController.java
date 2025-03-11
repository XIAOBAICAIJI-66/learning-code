package com.xf.controller;

import cn.hutool.extra.spring.SpringUtil;
import com.xf.service.strategy.PayService;
import com.xf.service.strategy.payStrategy.PayStrategy;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 策略类控制器
 */
@RestController
@RequestMapping("/strategy")
public class StrategyController {

    @Resource
    private PayService payService;

    /**
     * 策略模式来完成支付
     * @param payType 用什么支付
     * @return
     */
    @RequestMapping("/pay")
    public String pay(@RequestParam("payType") String payType) {
        // 根据payType选择不同的支付策略类
        PayStrategy payStrategy = (PayStrategy) SpringUtil.getBean(payType);
        // 根据支付策略类获取对应的支付服务类
        payService.setPayStrategy(payStrategy);
        return payService.pay();
    }
}
