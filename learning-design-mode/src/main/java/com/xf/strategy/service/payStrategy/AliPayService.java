package com.xf.strategy.service.payStrategy;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service("ALIPAY")
public class AliPayService implements PayStrategy {
    @Override
    public String pay() {
        return "支付宝支付";
    }
}
