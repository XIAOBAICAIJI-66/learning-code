package com.xf.service.strategy.payStrategy;

import org.springframework.stereotype.Service;

@Service("WECHATPAY")
public class WechatPayService implements PayStrategy {

    @Override
    public String pay() {
        return "微信支付";
    }
}
