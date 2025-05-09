package com.alipay.mobile.common.transport;

import android.content.Context;
import com.alipay.mobile.common.transport.http.inner.CoreHttpManager;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.alipay.mobile.common.transport.utils.inner.NetSdkConstants;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AlipayNetStarter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static AlipayNetStarter f4044a;

    public static AlipayNetStarter getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlipayNetStarter) ipChange.ipc$dispatch("2dc824d3", new Object[0]);
        }
        AlipayNetStarter alipayNetStarter = f4044a;
        if (alipayNetStarter != null) {
            return alipayNetStarter;
        }
        synchronized (AlipayNetStarter.class) {
            try {
                AlipayNetStarter alipayNetStarter2 = f4044a;
                if (alipayNetStarter2 != null) {
                    return alipayNetStarter2;
                }
                AlipayNetStarter alipayNetStarter3 = new AlipayNetStarter();
                f4044a = alipayNetStarter3;
                return alipayNetStarter3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String getNetSDKVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2fa8ab14", new Object[]{this});
        }
        return NetSdkConstants.NET_SDK_VERSION;
    }

    public void initNetwork(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e852ae3", new Object[]{this, context});
            return;
        }
        if (context == null) {
            try {
                LogCatUtil.debug("AlipayNetStarter", "initNetwork context is null");
                context = TransportEnvUtil.getContext();
            } catch (Throwable th) {
                LogCatUtil.error("AlipayNetStarter", "initNetwork ex=" + th.toString());
                return;
            }
        }
        CoreHttpManager.getInstance(context);
    }
}
