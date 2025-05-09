package com.xiaomi.push;

import android.content.Context;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class dk {

    /* renamed from: a  reason: collision with root package name */
    private static cz f14826a;

    /* renamed from: a  reason: collision with other field name */
    private static da f841a;

    public static void a(Context context) {
        a("onSendMsg");
        if (m589b(context)) {
            dn.a(context, System.currentTimeMillis(), m588a(context));
        }
    }

    public static void b(Context context) {
        a("onReceiveMsg");
        if (m589b(context)) {
            dn.b(context, System.currentTimeMillis(), m588a(context));
        }
    }

    public static void c(Context context) {
        a("onPing");
        if (m589b(context)) {
            dn.c(context, System.currentTimeMillis(), m588a(context));
        }
    }

    public static void d(Context context) {
        a("onPong");
        if (m589b(context)) {
            dn.d(context, System.currentTimeMillis(), m588a(context));
        }
    }

    public static void a(Context context, gq gqVar) {
        if (m589b(context)) {
            if (f14826a == null) {
                f14826a = new cz(context);
            }
            if (f841a == null) {
                f841a = new da(context);
            }
            cz czVar = f14826a;
            gqVar.a(czVar, czVar);
            da daVar = f841a;
            gqVar.b(daVar, daVar);
            a("startStats");
        }
    }

    public static void b(Context context, gq gqVar) {
        cz czVar = f14826a;
        if (czVar != null) {
            gqVar.a(czVar);
            f14826a = null;
        }
        da daVar = f841a;
        if (daVar != null) {
            gqVar.b(daVar);
            f841a = null;
        }
        a("stopStats");
    }

    public static void a(String str) {
        cy.a("Push-PowerStats", str);
    }

    /* renamed from: b  reason: collision with other method in class */
    private static boolean m589b(Context context) {
        return cy.a(context);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m588a(Context context) {
        return i.m781b(context);
    }
}
