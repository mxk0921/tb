package com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat;

import com.alipay.android.phone.mobilesdk.socketcraft.platform.PlatformUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SCLogCatFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static SCLogCatInterface f3760a;

    public static SCLogCatInterface getSCLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SCLogCatInterface) ipChange.ipc$dispatch("b3fae11b", new Object[0]);
        }
        SCLogCatInterface sCLogCatInterface = f3760a;
        if (sCLogCatInterface != null) {
            return sCLogCatInterface;
        }
        synchronized (SCLogCatFactory.class) {
            try {
                SCLogCatInterface sCLogCatInterface2 = f3760a;
                if (sCLogCatInterface2 != null) {
                    return sCLogCatInterface2;
                }
                if (!PlatformUtil.isAndroidPlatform()) {
                    f3760a = PlatformUtil.createJavaLogImpl();
                } else if (PlatformUtil.isAndroidMPaaSPlatform()) {
                    f3760a = PlatformUtil.createAndroidMPaaSLogImpl();
                } else {
                    f3760a = PlatformUtil.createAndroidLogImpl();
                }
                return f3760a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void setLogImpl(SCLogCatInterface sCLogCatInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e419d273", new Object[]{sCLogCatInterface});
        } else {
            f3760a = sCLogCatInterface;
        }
    }
}
