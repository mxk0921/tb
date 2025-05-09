package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bt {

    /* renamed from: a  reason: collision with root package name */
    private static volatile bt f14786a;

    /* renamed from: a  reason: collision with other field name */
    private Context f773a;

    private bt(Context context) {
        this.f773a = context;
    }

    public synchronized long a(String str, String str2, long j) {
        try {
        } catch (Throwable unused) {
            return j;
        }
        return this.f773a.getSharedPreferences(str, 4).getLong(str2, j);
    }

    public static bt a(Context context) {
        if (f14786a == null) {
            synchronized (bt.class) {
                try {
                    if (f14786a == null) {
                        f14786a = new bt(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14786a;
    }

    public synchronized String a(String str, String str2, String str3) {
        try {
        } catch (Throwable unused) {
            return str3;
        }
        return this.f773a.getSharedPreferences(str, 4).getString(str2, str3);
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized void m524a(String str, String str2, long j) {
        SharedPreferences.Editor edit = this.f773a.getSharedPreferences(str, 4).edit();
        edit.putLong(str2, j);
        edit.commit();
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized void m525a(String str, String str2, String str3) {
        SharedPreferences.Editor edit = this.f773a.getSharedPreferences(str, 4).edit();
        edit.putString(str2, str3);
        edit.commit();
    }
}
