package com.xf.service.strategy;

import com.xf.service.strategy.payStrategy.PayStrategy;
import org.springframework.stereotype.Service;

/**
 * 策略-业务层
 */
@Service
public class PayService {

    private PayStrategy payStrategy;

    // 构造函数,传入具体的支付策略对象
    public PayService(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    // 获取对应支付策略的实现类
    public void setPayStrategy(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public String pay() {
        return this.payStrategy.pay();
    }
}
