package com.alipay.mobile.common.amnet.service.ipcservice;

import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.httpdns.AlipayHttpDnsClient;
import com.alipay.mobile.common.transport.httpdns.ipc.UpdateDnsService;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class UpdateDnsServiceImpl implements UpdateDnsService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.transport.httpdns.ipc.UpdateDnsService
    public void notifyUpdateDns(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42e53f36", new Object[]{this, new Boolean(z)});
            return;
        }
        LogCatUtil.debug("UpdateDnsServiceImpl", "notifyUpdateDns,firstUpdate=[" + z + "]");
        if (!z || !AlipayHttpDnsClient.getDnsClient().isInit() || System.currentTimeMillis() - AlipayHttpDnsClient.getDnsClient().getInitTime() >= TransportConfigureManager.getInstance().getLongValue(TransportConfigureItem.HTTPDNS_REQUEST_INTERVAL)) {
            AlipayHttpDnsClient.getDnsClient().refreshAll();
        } else {
            LogCatUtil.info("UpdateDnsServiceImpl", "notifyUpdateDns ,(System.currentTimeMillis() - reqLastTime) < 10m, return.");
        }
    }
}
