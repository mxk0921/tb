package com.alipay.auth.mobile.common;

import com.alipay.auth.mobile.api.IAlipayAuthMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Properties;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MonitorAlipayAuth {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static MonitorAlipayAuth f3787a;

    public static synchronized MonitorAlipayAuth getInstance() {
        synchronized (MonitorAlipayAuth.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MonitorAlipayAuth) ipChange.ipc$dispatch("3b29df9e", new Object[0]);
            }
            if (f3787a == null) {
                f3787a = new MonitorAlipayAuth();
            }
            return f3787a;
        }
    }

    public void monitorAlipayAuth(IAlipayAuthMonitor iAlipayAuthMonitor, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5eb7487", new Object[]{this, iAlipayAuthMonitor, str});
        } else {
            monitorAlipayAuth(iAlipayAuthMonitor, str, null);
        }
    }

    public void monitorAlipayAuth(IAlipayAuthMonitor iAlipayAuthMonitor, String str, Properties properties) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bc63043", new Object[]{this, iAlipayAuthMonitor, str, properties});
        } else if (iAlipayAuthMonitor != null) {
            try {
                iAlipayAuthMonitor.monitorAliayAuth(str, properties);
            } catch (Throwable th) {
                LoggerUtils.e("MonitorAlipayAuth", "monitorAlipayAuth", th);
            }
        }
    }
}
