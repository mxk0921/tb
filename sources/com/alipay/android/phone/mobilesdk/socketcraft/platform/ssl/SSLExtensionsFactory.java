package com.alipay.android.phone.mobilesdk.socketcraft.platform.ssl;

import com.alipay.android.phone.mobilesdk.socketcraft.integrated.ssl.MPaaSSSLExtensions;
import com.alipay.android.phone.mobilesdk.socketcraft.platform.PlatformUtil;
import com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SSLExtensionsFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static SSLExtensions f3762a;

    public static final SSLExtensions getInstance() {
        SSLExtensions sSLExtensions = f3762a;
        if (sSLExtensions != null) {
            return sSLExtensions;
        }
        synchronized (SSLExtensions.class) {
            try {
                if (PlatformUtil.isAndroidMPaaSPlatform()) {
                    f3762a = (SSLExtensions) MPaaSSSLExtensions.class.newInstance();
                    SCLogCatUtil.info("SSLExtensionsFactory", "New instance ok, class: com.alipay.android.phone.mobilesdk.socketcraft.integrated.ssl.MPaaSSSLExtensions");
                }
                if (f3762a == null) {
                    f3762a = new DefaultSSLExtensions();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3762a;
    }
}
