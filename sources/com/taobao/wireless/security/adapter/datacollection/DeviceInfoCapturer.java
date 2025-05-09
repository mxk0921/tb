package com.taobao.wireless.security.adapter.datacollection;

import android.content.Context;
import com.alibaba.wireless.security.mainplugin.SecurityGuardMainPlugin;
import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import com.taobao.orange.OConstant;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class DeviceInfoCapturer {

    /* renamed from: а  reason: contains not printable characters */
    private static final String f566 = "1";

    /* renamed from: б  reason: contains not printable characters */
    private static final String f567 = "0";

    /* renamed from: в  reason: contains not printable characters */
    private static final int f568 = 0;

    /* renamed from: г  reason: contains not printable characters */
    private static final int f569 = 104;

    /* renamed from: д  reason: contains not printable characters */
    private static final int f570 = 105;

    /* renamed from: е  reason: contains not printable characters */
    private static final int f571 = 109;

    /* renamed from: ж  reason: contains not printable characters */
    private static final int f572 = 122;

    /* renamed from: з  reason: contains not printable characters */
    private static final int f573 = 123;

    /* renamed from: и  reason: contains not printable characters */
    private static final int f574 = 126;

    /* renamed from: й  reason: contains not printable characters */
    private static final int f575 = 130;

    /* renamed from: к  reason: contains not printable characters */
    private static final int f576 = 135;

    /* renamed from: л  reason: contains not printable characters */
    private static final int f577 = 146;

    /* renamed from: м  reason: contains not printable characters */
    private static final int f578 = 147;

    /* renamed from: н  reason: contains not printable characters */
    private static Context f579 = null;

    /* renamed from: о  reason: contains not printable characters */
    private static C0811 f580 = null;

    /* renamed from: п  reason: contains not printable characters */
    private static SecurityGuardMainPlugin f581 = null;

    /* renamed from: р  reason: contains not printable characters */
    private static volatile boolean f582 = false;

    /* renamed from: с  reason: contains not printable characters */
    private static Object f583 = null;

    /* renamed from: ё  reason: contains not printable characters */
    private static final int f584 = 121;

    private DeviceInfoCapturer() {
    }

    public static String doCommandForString(int i) {
        if (!f582) {
            synchronized (f583) {
                if (!f582) {
                    C0817.m387(f579);
                    C0812.m376(f579);
                    C0818.m389(f579);
                    f582 = true;
                }
            }
        }
        String str = null;
        if (i == 0) {
            str = C0817.m386("android.hardware.wifi") ? "1" : "0";
        } else if (i == 126) {
            str = m364();
        } else if (i == 130) {
            str = C0812.m373();
        } else if (i == 135) {
            str = C0818.m388();
        } else if (i == f577) {
            str = C0812.m375();
        } else if (i != f578) {
            switch (i) {
                case 121:
                    str = m363();
                    break;
                case 122:
                    str = C0817.m385();
                    break;
                case 123:
                    str = C0817.m384();
                    break;
                default:
                    return str;
            }
        } else {
            str = m362();
        }
        return str;
    }

    public static void initialize(ISecurityGuardPlugin iSecurityGuardPlugin, C0811 r1) {
        SecurityGuardMainPlugin securityGuardMainPlugin = (SecurityGuardMainPlugin) iSecurityGuardPlugin;
        f581 = securityGuardMainPlugin;
        f579 = securityGuardMainPlugin.getContext();
        f580 = r1;
        f583 = new Object();
    }

    /* renamed from: а  reason: contains not printable characters */
    private static String m362() {
        Method declaredMethod;
        try {
            Class<?> cls = Class.forName(OConstant.REFLECT_SECURITYGUARD);
            if (cls == null || (declaredMethod = cls.getDeclaredMethod("getGlobalUserData", new Class[0])) == null) {
                return null;
            }
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: б  reason: contains not printable characters */
    private static String m363() {
        C0811 r0 = f580;
        if (r0 != null) {
            return r0.m369();
        }
        return null;
    }

    /* renamed from: в  reason: contains not printable characters */
    private static String m364() {
        C0811 r0 = f580;
        if (r0 != null) {
            return r0.m370(64);
        }
        return null;
    }
}
