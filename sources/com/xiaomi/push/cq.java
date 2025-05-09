package com.xiaomi.push;

import java.net.InetSocketAddress;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class cq {

    /* renamed from: a  reason: collision with root package name */
    private int f14809a;

    /* renamed from: a  reason: collision with other field name */
    private String f810a;

    public cq(String str, int i) {
        this.f810a = str;
        this.f14809a = i;
    }

    public int a() {
        return this.f14809a;
    }

    public String toString() {
        if (this.f14809a <= 0) {
            return this.f810a;
        }
        return this.f810a + ":" + this.f14809a;
    }

    public static cq a(String str, int i) {
        int lastIndexOf = str.lastIndexOf(":");
        if (lastIndexOf != -1) {
            str = str.substring(0, lastIndexOf);
            try {
                int parseInt = Integer.parseInt(str.substring(lastIndexOf + 1));
                if (parseInt > 0) {
                    i = parseInt;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return new cq(str, i);
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m561a() {
        return this.f810a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static InetSocketAddress m560a(String str, int i) {
        cq a2 = a(str, i);
        return new InetSocketAddress(a2.m561a(), a2.a());
    }
}
