package com.xiaomi.push;

import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gr implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public static String f14914a = "wcc-ml-test10.bj";
    public static String b;

    /* renamed from: a  reason: collision with other field name */
    private int f1079a;

    /* renamed from: a  reason: collision with other field name */
    private gu f1080a;

    /* renamed from: a  reason: collision with other field name */
    private boolean f1081a = gq.f1064a;

    /* renamed from: b  reason: collision with other field name */
    private boolean f1082b = true;
    private String c;
    private String d;
    private String e;

    public gr(Map<String, Integer> map, int i, String str, gu guVar) {
        a(map, i, str, guVar);
    }

    /* renamed from: a  reason: collision with other method in class */
    public int mo744a() {
        return this.f1079a;
    }

    public String b() {
        return this.e;
    }

    public String c() {
        if (this.d == null) {
            this.d = a();
        }
        return this.d;
    }

    public static final String a() {
        String str = b;
        return str != null ? str : aa.m481a() ? "sandbox.xmpush.xiaomi.com" : aa.b() ? "10.38.162.35" : "app.chat.xiaomi.net";
    }

    public void b(String str) {
        this.e = str;
    }

    public void c(String str) {
        this.d = str;
    }

    public static final void a(String str) {
        if (!aa.b()) {
            b = str;
        }
    }

    private void a(Map<String, Integer> map, int i, String str, gu guVar) {
        this.f1079a = i;
        this.c = str;
        this.f1080a = guVar;
    }

    public void a(boolean z) {
        this.f1081a = z;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m745a() {
        return this.f1081a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public byte[] m746a() {
        return null;
    }
}
