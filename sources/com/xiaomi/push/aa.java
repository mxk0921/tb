package com.xiaomi.push;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class aa {

    /* renamed from: a  reason: collision with root package name */
    private static int f14747a;

    /* renamed from: a  reason: collision with other field name */
    public static final String f717a;

    /* renamed from: a  reason: collision with other field name */
    public static boolean f718a;

    static {
        String str;
        int i;
        if (ad.f14748a) {
            str = "ONEBOX";
        } else {
            str = "@SHIP.TO.2A2FE0D7@";
        }
        f717a = str;
        f718a = false;
        f14747a = 1;
        if (str.equalsIgnoreCase("SANDBOX")) {
            i = 2;
        } else if (str.equalsIgnoreCase("ONEBOX")) {
            i = 3;
        } else {
            f14747a = 1;
            return;
        }
        f14747a = i;
    }

    public static int a() {
        return f14747a;
    }

    public static boolean b() {
        if (f14747a == 3) {
            return true;
        }
        return false;
    }

    public static void a(int i) {
        f14747a = i;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m481a() {
        return f14747a == 2;
    }
}
