package com.huawei.hms.base.log;

import android.content.Context;
import android.util.Log;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class b {
    private String b;

    /* renamed from: a  reason: collision with root package name */
    private int f5284a = 4;
    private d c = new c();

    public void a(Context context, int i, String str) {
        this.f5284a = i;
        this.b = str;
        this.c.a(context, "HMSCore");
    }

    public void b(int i, String str, String str2, Throwable th) {
        try {
            if (a(i)) {
                e a2 = a(i, str, str2, th);
                d dVar = this.c;
                dVar.a(a2.c() + a2.a(), i, str, str2 + '\n' + Log.getStackTraceString(th));
            }
        } catch (OutOfMemoryError unused) {
            b();
        }
    }

    public d a() {
        return this.c;
    }

    public void a(d dVar) {
        this.c = dVar;
    }

    private void b() {
        try {
            Log.e("HMSSDK_LogAdaptor", "log happened OOM error.");
        } catch (Throwable unused) {
        }
    }

    public boolean a(int i) {
        return i >= this.f5284a;
    }

    public void a(int i, String str, String str2) {
        try {
            if (a(i)) {
                e a2 = a(i, str, str2, null);
                this.c.a(a2.c() + a2.a(), i, str, str2);
            }
        } catch (OutOfMemoryError unused) {
            b();
        }
    }

    public void a(String str, String str2) {
        try {
            e a2 = a(4, str, str2, null);
            this.c.a(a2.c() + '\n' + a2.a(), 4, str, str2);
        } catch (OutOfMemoryError unused) {
            b();
        }
    }

    private e a(int i, String str, String str2, Throwable th) {
        e eVar = new e(8, this.b, i, str);
        eVar.a((e) str2);
        eVar.a(th);
        return eVar;
    }
}
