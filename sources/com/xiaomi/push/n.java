package com.xiaomi.push;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private static volatile n f15002a;

    /* renamed from: a  reason: collision with other field name */
    private Context f1479a;

    /* renamed from: a  reason: collision with other field name */
    private Handler f1480a = new Handler(Looper.getMainLooper());

    /* renamed from: a  reason: collision with other field name */
    private Map<String, Map<String, String>> f1481a = new HashMap();

    private n(Context context) {
        this.f1479a = context;
    }

    private synchronized void b(String str, String str2, String str3) {
        try {
            if (this.f1481a == null) {
                this.f1481a = new HashMap();
            }
            Map<String, String> map = this.f1481a.get(str);
            if (map == null) {
                map = new HashMap<>();
            }
            map.put(str2, str3);
            this.f1481a.put(str, map);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static n a(Context context) {
        if (f15002a == null) {
            synchronized (n.class) {
                try {
                    if (f15002a == null) {
                        f15002a = new n(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f15002a;
    }

    private synchronized String a(String str, String str2) {
        if (this.f1481a != null && !TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str2)) {
                try {
                    Map<String, String> map = this.f1481a.get(str);
                    if (map == null) {
                        return "";
                    }
                    return map.get(str2);
                } catch (Throwable unused) {
                    return "";
                }
            }
        }
        return "";
    }

    public synchronized String a(String str, String str2, String str3) {
        String a2 = a(str, str2);
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        return this.f1479a.getSharedPreferences(str, 4).getString(str2, str3);
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized void m962a(String str, String str2, String str3) {
        b(str, str2, str3);
        this.f1480a.post(new o(this, str, str2, str3));
    }
}
