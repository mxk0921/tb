package com.xiaomi.push;

import android.content.Context;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
class aw {

    /* renamed from: a  reason: collision with root package name */
    static int f14765a;

    public static ar a(Context context) {
        if (j.m868a()) {
            f14765a = 1;
            return new av(context);
        } else if (ao.a(context)) {
            f14765a = 2;
            return new ao(context);
        } else if (ay.a(context)) {
            f14765a = 4;
            return new ay(context);
        } else if (bc.a(context)) {
            f14765a = 5;
            return new bc(context);
        } else if (au.a(context)) {
            f14765a = 3;
            return new as(context);
        } else {
            f14765a = 0;
            return new bb();
        }
    }
}
