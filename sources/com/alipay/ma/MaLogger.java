package com.alipay.ma;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MaLogger {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile MaEngineLogger f3858a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface MaEngineLogger {
        void d(String str, String str2);

        void e(String str, String str2);

        void e(String str, String str2, Throwable th);

        void i(String str, String str2);

        boolean isDebuggable();

        void v(String str, String str2);

        void w(String str, String str2);
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
            return;
        }
        try {
            if (f3858a != null) {
                f3858a.d(str, str2);
            }
        } catch (Exception unused) {
        }
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
            return;
        }
        try {
            if (f3858a != null) {
                f3858a.e(str, str2);
            }
        } catch (Exception unused) {
        }
    }

    public static void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e38e584", new Object[]{str, str2});
            return;
        }
        try {
            if (f3858a != null) {
                f3858a.i(str, str2);
            }
        } catch (Exception unused) {
        }
    }

    public static boolean isDebuggable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4500e523", new Object[0])).booleanValue();
        }
        return false;
    }

    public static void registerLogger(MaEngineLogger maEngineLogger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2126ca85", new Object[]{maEngineLogger});
        } else {
            f3858a = maEngineLogger;
        }
    }

    public static void unRegisterLogger() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19f34393", new Object[0]);
        } else {
            f3858a = null;
        }
    }

    public static void v(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("625b1491", new Object[]{str, str2});
        } else if (f3858a != null) {
            f3858a.v(str, str2);
        }
    }

    public static void w(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefb3f92", new Object[]{str, str2});
            return;
        }
        try {
            if (f3858a != null) {
                f3858a.w(str, str2);
            }
        } catch (Exception unused) {
        }
    }

    public static void e(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c9407f", new Object[]{str, th});
            return;
        }
        try {
            if (f3858a != null && th != null) {
                f3858a.e(str, th.getMessage());
            }
        } catch (Exception unused) {
        }
    }

    public static void e(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{str, str2, th});
            return;
        }
        try {
            if (f3858a != null && th != null) {
                MaEngineLogger maEngineLogger = f3858a;
                maEngineLogger.e(str, str2 + ":" + th.getMessage());
            }
        } catch (Exception unused) {
        }
    }
}
