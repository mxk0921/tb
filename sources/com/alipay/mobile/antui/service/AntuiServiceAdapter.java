package com.alipay.mobile.antui.service;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AntuiServiceAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile IAntuiLogger f3879a;
    public static volatile IAntuiKeyboardConfig b;
    public static volatile IAntuiSwitch c;

    public static IAntuiKeyboardConfig getAntuiKeyboardConfig() {
        if (b == null) {
            synchronized (AntuiServiceAdapter.class) {
                try {
                    if (b == null) {
                        b = (IAntuiKeyboardConfig) AntuiKeyboardConfigImpl.class.newInstance();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public static IAntuiLogger getAntuiLogger() {
        if (f3879a == null) {
            synchronized (AntuiServiceAdapter.class) {
                try {
                    if (f3879a == null) {
                        f3879a = (IAntuiLogger) AntuiLoggerImpl.class.newInstance();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f3879a;
    }

    public static IAntuiSwitch getAntuiSwitch() {
        if (c == null) {
            synchronized (AntuiServiceAdapter.class) {
                try {
                    if (c == null) {
                        c = (IAntuiSwitch) AntuiSwitchImpl.class.newInstance();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }
}
