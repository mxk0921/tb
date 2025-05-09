package com.alipay.mobile.common.logging.strategy;

import com.alipay.mobile.common.logging.util.config.GrayScaleUtils;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class GlobalLogConfigService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static GlobalLogConfigService f3982a;

    public static GlobalLogConfigService a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GlobalLogConfigService) ipChange.ipc$dispatch("f65e036d", new Object[0]);
        }
        GlobalLogConfigService globalLogConfigService = f3982a;
        if (globalLogConfigService != null) {
            return globalLogConfigService;
        }
        synchronized (GlobalLogConfigService.class) {
            try {
                GlobalLogConfigService globalLogConfigService2 = f3982a;
                if (globalLogConfigService2 != null) {
                    return globalLogConfigService2;
                }
                GlobalLogConfigService globalLogConfigService3 = new GlobalLogConfigService();
                f3982a = globalLogConfigService3;
                return globalLogConfigService3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        try {
            return GrayScaleUtils.getStringSwitch("groupTag", "");
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        try {
            return GrayScaleUtils.getGrayScaleSwitch("loglenlimit", true);
        } catch (Throwable unused) {
            return true;
        }
    }
}
