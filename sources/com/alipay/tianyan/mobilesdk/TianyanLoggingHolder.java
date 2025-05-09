package com.alipay.tianyan.mobilesdk;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.tianyan.mobilesdk.TianyanLoggingDelegator;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TianyanLoggingHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static TianyanLoggingHolder INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public TianyanLoggingDelegator.LoggingHttpClientGetter f4547a;

    public static synchronized TianyanLoggingHolder getInstance() {
        synchronized (TianyanLoggingHolder.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TianyanLoggingHolder) ipChange.ipc$dispatch("1bff0643", new Object[0]);
            }
            if (INSTANCE == null) {
                INSTANCE = new TianyanLoggingHolder();
            }
            return INSTANCE;
        }
    }

    public TianyanLoggingDelegator.LoggingHttpClientGetter getLoggingHttpClientGetter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TianyanLoggingDelegator.LoggingHttpClientGetter) ipChange.ipc$dispatch("b2707a0f", new Object[]{this});
        }
        return this.f4547a;
    }

    public void setLoggingHttpClientGetter(TianyanLoggingDelegator.LoggingHttpClientGetter loggingHttpClientGetter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5d3a709", new Object[]{this, loggingHttpClientGetter});
        } else {
            this.f4547a = loggingHttpClientGetter;
        }
    }
}
