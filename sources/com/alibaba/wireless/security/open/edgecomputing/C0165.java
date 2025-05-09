package com.alibaba.wireless.security.open.edgecomputing;

import android.content.Context;
import com.alibaba.wireless.security.framework.IRouterComponent;
import com.alibaba.wireless.security.mainplugin.SecurityGuardMainPlugin;

/* renamed from: com.alibaba.wireless.security.open.edgecomputing.б  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0165 {

    /* renamed from: а  reason: contains not printable characters */
    public static Context f350;

    /* renamed from: б  reason: contains not printable characters */
    public static IRouterComponent f351;

    /* renamed from: в  reason: contains not printable characters */
    private static SecurityGuardMainPlugin f352;

    /* renamed from: а  reason: contains not printable characters */
    public static Context m219() {
        return f350;
    }

    /* renamed from: б  reason: contains not printable characters */
    public static SecurityGuardMainPlugin m220() {
        return f352;
    }

    /* renamed from: в  reason: contains not printable characters */
    public static IRouterComponent m221() {
        return f351;
    }

    /* renamed from: г  reason: contains not printable characters */
    public static void m222(Context context, IRouterComponent iRouterComponent, SecurityGuardMainPlugin securityGuardMainPlugin) {
        f350 = context;
        f351 = iRouterComponent;
        f352 = securityGuardMainPlugin;
    }
}
