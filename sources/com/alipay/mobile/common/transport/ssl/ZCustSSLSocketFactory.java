package com.alipay.mobile.common.transport.ssl;

import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ZCustSSLSocketFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f4132a = true;
    public static SSLSocketFactory b;

    public static SSLSocketFactory a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SSLSocketFactory) ipChange.ipc$dispatch("b1c7c784", new Object[0]);
        }
        try {
            SSLSocketFactory sSLSocketFactory = b;
            if (sSLSocketFactory != null) {
                return sSLSocketFactory;
            }
            synchronized (ZCustSSLSocketFactory.class) {
                SSLSocketFactory sSLSocketFactory2 = b;
                if (sSLSocketFactory2 != null) {
                    return sSLSocketFactory2;
                }
                b = ZSSLContextFactory.getSingletonSSLContext().getSocketFactory();
                LogCatUtil.info("ZCustSSLSocketFactory", "[getCustomSslSocketFactory] Use custom 'SSLSocketFactory'.");
                return b;
            }
        } catch (Throwable th) {
            f4132a = true;
            LogCatUtil.warn("ZCustSSLSocketFactory", "[getCustomSslSocketFactory]  Exception: " + th.toString() + ", will downgrade to 'DefaultSSLSocketFactory'", th);
            return HttpsURLConnection.getDefaultSSLSocketFactory();
        }
    }

    public static final SSLSocketFactory getSSLSocketFactory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SSLSocketFactory) ipChange.ipc$dispatch("8af93504", new Object[0]);
        }
        try {
            if (!f4132a) {
                return a();
            }
        } catch (Throwable th) {
            f4132a = true;
            LogCatUtil.warn("ZCustSSLSocketFactory", "getSSLSocketFactory Exception: " + th.toString() + ", will downgrade to 'DefaultSSLSocketFactory'", th);
        }
        return HttpsURLConnection.getDefaultSSLSocketFactory();
    }
}
