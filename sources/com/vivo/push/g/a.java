package com.vivo.push.g;

import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static String[] f14608a = {"com.vivo.pushservice", "com.vivo.pushdemo.test", "com.vivo.sdk.test"};
    private ArrayList<String> b;

    /* compiled from: Taobao */
    /* renamed from: com.vivo.push.g.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class C0851a {

        /* renamed from: a  reason: collision with root package name */
        private static a f14609a = new a((byte) 0);
    }

    public /* synthetic */ a(byte b) {
        this();
    }

    public static a a() {
        return C0851a.f14609a;
    }

    public final boolean b() {
        ArrayList<String> arrayList = this.b;
        if (arrayList == null || arrayList.size() == 0) {
            return false;
        }
        return true;
    }

    private a() {
        this.b = null;
        this.b = new ArrayList<>();
    }
}
