package com.alipay.mobile.common.transportext.biz.httpdns;

import com.alipay.mobile.common.transport.httpdns.AlipayHttpDnsClient;
import com.alipay.mobile.common.transport.httpdns.ipc.MainProcReloadDnsService;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.SharedPreUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;
import tb.xti;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MainProcReloadDnsServiceImpl implements MainProcReloadDnsService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        boolean booleanData = SharedPreUtils.getBooleanData(TransportEnvUtil.getContext(), xti.AREA_OVERSEA);
        LogCatUtil.debug("MainProcReloadDnsServiceImpl", "notifyReloadOversea,oversea=[" + booleanData + "]");
        MiscUtils.setOversea(booleanData);
    }

    @Override // com.alipay.mobile.common.transport.httpdns.ipc.MainProcReloadDnsService
    public void notifyReloadDns() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8108c8e", new Object[]{this});
            return;
        }
        AlipayHttpDnsClient.getDnsClient().reloadDns();
        LogCatUtil.info("MainProcReloadDnsServiceImpl", "notifyReloadDns ");
        a();
    }
}
