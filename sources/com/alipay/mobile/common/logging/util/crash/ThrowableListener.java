package com.alipay.mobile.common.logging.util.crash;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class ThrowableListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static ThrowableListener f4002a;

    public static void addThrowableListener(ThrowableListener throwableListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810ebb6a", new Object[]{throwableListener});
            return;
        }
        try {
            f4002a = throwableListener;
        } catch (Throwable unused) {
        }
    }

    public static void processThrowable(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a791ef62", new Object[]{str});
            return;
        }
        try {
            ThrowableListener throwableListener = f4002a;
            if (throwableListener != null) {
                throwableListener.onThrowable(str);
            }
        } catch (Throwable unused) {
        }
    }

    public abstract void onThrowable(String str);
}
