package com.loc;

import android.content.Context;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class bx {

    /* renamed from: a  reason: collision with root package name */
    private Context f5617a;
    private w b;
    private String c;

    public bx(Context context, w wVar, String str) {
        this.f5617a = context.getApplicationContext();
        this.b = wVar;
        this.c = str;
    }

    private static String a(Context context, w wVar, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("\"sdkversion\":\"");
            sb.append(wVar.c());
            sb.append("\",\"product\":\"");
            sb.append(wVar.a());
            sb.append("\",\"nt\":\"");
            sb.append(o.c(context));
            sb.append("\",\"details\":");
            sb.append(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return sb.toString();
    }

    public final byte[] a() {
        return x.a(a(this.f5617a, this.b, this.c));
    }
}
