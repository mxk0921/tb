package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import com.xiaomi.push.ae;
import com.xiaomi.push.ah;
import com.xiaomi.push.bg;
import com.xiaomi.push.p;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class by implements aq {

    /* renamed from: a  reason: collision with root package name */
    private static volatile by f15088a;

    /* renamed from: a  reason: collision with other field name */
    private long f1609a;

    /* renamed from: a  reason: collision with other field name */
    Context f1610a;

    /* renamed from: a  reason: collision with other field name */
    private SharedPreferences f1611a;

    /* renamed from: a  reason: collision with other field name */
    private volatile boolean f1613a = false;

    /* renamed from: a  reason: collision with other field name */
    private ConcurrentHashMap<String, a> f1612a = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static abstract class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        long f15089a;

        /* renamed from: a  reason: collision with other field name */
        String f1614a;

        public a(String str, long j) {
            this.f1614a = str;
            this.f15089a = j;
        }

        public abstract void a(by byVar);

        @Override // java.lang.Runnable
        public void run() {
            if (by.f15088a != null) {
                Context context = by.f15088a.f1610a;
                if (bg.d(context)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    SharedPreferences sharedPreferences = by.f15088a.f1611a;
                    if (currentTimeMillis - sharedPreferences.getLong(":ts-" + this.f1614a, 0L) > this.f15089a || ae.a(context)) {
                        SharedPreferences.Editor edit = by.f15088a.f1611a.edit();
                        p.a(edit.putLong(":ts-" + this.f1614a, System.currentTimeMillis()));
                        a(by.f15088a);
                    }
                }
            }
        }
    }

    private by(Context context) {
        this.f1610a = context.getApplicationContext();
        this.f1611a = context.getSharedPreferences("sync", 0);
    }

    public static by a(Context context) {
        if (f15088a == null) {
            synchronized (by.class) {
                try {
                    if (f15088a == null) {
                        f15088a = new by(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f15088a;
    }

    public String a(String str, String str2) {
        SharedPreferences sharedPreferences = this.f1611a;
        return sharedPreferences.getString(str + ":" + str2, "");
    }

    @Override // com.xiaomi.push.service.aq
    public void a() {
        if (!this.f1613a) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f1609a >= 3600000) {
                this.f1609a = currentTimeMillis;
                this.f1613a = true;
                ah.a(this.f1610a).a(new bz(this), (int) (Math.random() * 10.0d));
            }
        }
    }

    public void a(a aVar) {
        if (this.f1612a.putIfAbsent(aVar.f1614a, aVar) == null) {
            ah.a(this.f1610a).a(aVar, ((int) (Math.random() * 30.0d)) + 10);
        }
    }

    public void a(String str, String str2, String str3) {
        SharedPreferences.Editor edit = f15088a.f1611a.edit();
        p.a(edit.putString(str + ":" + str2, str3));
    }
}
