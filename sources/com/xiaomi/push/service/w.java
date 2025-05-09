package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.push.bm;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class w {

    /* renamed from: a  reason: collision with root package name */
    private static w f15132a;

    /* renamed from: a  reason: collision with other field name */
    private Context f1660a;

    /* renamed from: a  reason: collision with other field name */
    private List<String> f1661a = new ArrayList();
    private final List<String> b = new ArrayList();
    private final List<String> c = new ArrayList();

    private w(Context context) {
        String[] split;
        String[] split2;
        String[] split3;
        Context applicationContext = context.getApplicationContext();
        this.f1660a = applicationContext;
        if (applicationContext == null) {
            this.f1660a = context;
        }
        SharedPreferences sharedPreferences = this.f1660a.getSharedPreferences("mipush_app_info", 0);
        for (String str : sharedPreferences.getString("unregistered_pkg_names", "").split(",")) {
            if (TextUtils.isEmpty(str)) {
                this.f1661a.add(str);
            }
        }
        for (String str2 : sharedPreferences.getString("disable_push_pkg_names", "").split(",")) {
            if (!TextUtils.isEmpty(str2)) {
                this.b.add(str2);
            }
        }
        for (String str3 : sharedPreferences.getString("disable_push_pkg_names_cache", "").split(",")) {
            if (!TextUtils.isEmpty(str3)) {
                this.c.add(str3);
            }
        }
    }

    public static w a(Context context) {
        if (f15132a == null) {
            f15132a = new w(context);
        }
        return f15132a;
    }

    public void b(String str) {
        synchronized (this.b) {
            try {
                if (!this.b.contains(str)) {
                    this.b.add(str);
                    this.f1660a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names", bm.a(this.b, ",")).commit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(String str) {
        synchronized (this.c) {
            try {
                if (!this.c.contains(str)) {
                    this.c.add(str);
                    this.f1660a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names_cache", bm.a(this.c, ",")).commit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(String str) {
        synchronized (this.f1661a) {
            try {
                if (this.f1661a.contains(str)) {
                    this.f1661a.remove(str);
                    this.f1660a.getSharedPreferences("mipush_app_info", 0).edit().putString("unregistered_pkg_names", bm.a(this.f1661a, ",")).commit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(String str) {
        synchronized (this.b) {
            try {
                if (this.b.contains(str)) {
                    this.b.remove(str);
                    this.f1660a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names", bm.a(this.b, ",")).commit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(String str) {
        synchronized (this.c) {
            try {
                if (this.c.contains(str)) {
                    this.c.remove(str);
                    this.f1660a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names_cache", bm.a(this.c, ",")).commit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(String str) {
        synchronized (this.f1661a) {
            try {
                if (!this.f1661a.contains(str)) {
                    this.f1661a.add(str);
                    this.f1660a.getSharedPreferences("mipush_app_info", 0).edit().putString("unregistered_pkg_names", bm.a(this.f1661a, ",")).commit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m1102b(String str) {
        boolean contains;
        synchronized (this.b) {
            contains = this.b.contains(str);
        }
        return contains;
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m1103c(String str) {
        boolean contains;
        synchronized (this.c) {
            contains = this.c.contains(str);
        }
        return contains;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m1101a(String str) {
        boolean contains;
        synchronized (this.f1661a) {
            contains = this.f1661a.contains(str);
        }
        return contains;
    }
}
