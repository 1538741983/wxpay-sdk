package com.github.wxpay.sdk;

/**
 * 域名信息
 */
public class DomainInfo {
    /**
     * 域名
     */
    public String domain;
    /**
     * 该域名是否为主域名。例如:api.mch.weixin.qq.com为主域名
     */
    public boolean primaryDomain;

    /**
     * 域名信息
     *
     * @param domain        域名。例如:api.mch.weixin.qq.com
     * @param primaryDomain 该域名是否为主域名。例如:api.mch.weixin.qq.com为主域名
     */
    public DomainInfo(String domain, boolean primaryDomain) {
        this.domain = domain;
        this.primaryDomain = primaryDomain;
    }

    @Override
    public String toString() {
        return String.format("DomainInfo{domain='%s', primaryDomain=%s}", domain, primaryDomain);
    }
}