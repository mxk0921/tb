package com.alibaba.wireless.security.middletierplugin.open.fc;

import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;

/* renamed from: com.alibaba.wireless.security.middletierplugin.open.fc.е  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0142 {

    /* renamed from: а  reason: contains not printable characters */
    private static ISecurityGuardPlugin f235;

    /* renamed from: а  reason: contains not printable characters */
    public static void m145(int i) {
        try {
            f235.getRouter().doCommand(13501, Integer.valueOf(i));
        } catch (Exception unused) {
        }
    }

    /* renamed from: б  reason: contains not printable characters */
    public static void m146(ISecurityGuardPlugin iSecurityGuardPlugin) {
        f235 = iSecurityGuardPlugin;
    }
}
