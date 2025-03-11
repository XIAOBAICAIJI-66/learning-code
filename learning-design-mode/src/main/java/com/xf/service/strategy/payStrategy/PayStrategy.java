package com.xf.service.strategy.payStrategy;

/**
 * 支付策略接口
 * 需要设置一个默认的注入策略
 */
public interface PayStrategy {
    String pay();
}
