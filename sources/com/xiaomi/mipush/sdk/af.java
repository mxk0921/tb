package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class af {

    /* renamed from: a  reason: collision with root package name */
    private static volatile af f14710a;

    /* renamed from: a  reason: collision with other field name */
    private Context f671a;

    /* renamed from: a  reason: collision with other field name */
    private List<x> f672a = new ArrayList();

    private af(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f671a = applicationContext;
        if (applicationContext == null) {
            this.f671a = context;
        }
    }

    public int a(String str) {
        synchronized (this.f672a) {
            try {
                x xVar = new x();
                xVar.f713a = str;
                if (this.f672a.contains(xVar)) {
                    for (x xVar2 : this.f672a) {
                        if (xVar2.equals(xVar)) {
                            return xVar2.f14743a;
                        }
                    }
                }
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(String str) {
        synchronized (this.f672a) {
            try {
                x xVar = new x();
                xVar.f713a = str;
                if (this.f672a.contains(xVar)) {
                    Iterator<x> it = this.f672a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        x next = it.next();
                        if (xVar.equals(next)) {
                            xVar = next;
                            break;
                        }
                    }
                }
                xVar.f14743a++;
                this.f672a.remove(xVar);
                this.f672a.add(xVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(String str) {
        synchronized (this.f672a) {
            try {
                x xVar = new x();
                xVar.f713a = str;
                if (this.f672a.contains(xVar)) {
                    this.f672a.remove(xVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static af a(Context context) {
        if (f14710a == null) {
            synchronized (af.class) {
                try {
                    if (f14710a == null) {
                        f14710a = new af(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14710a;
    }

    public synchronized String a(au auVar) {
        return this.f671a.getSharedPreferences("mipush_extra", 0).getString(auVar.name(), "");
    }

    public synchronized void a(au auVar, String str) {
        SharedPreferences sharedPreferences = this.f671a.getSharedPreferences("mipush_extra", 0);
        sharedPreferences.edit().putString(auVar.name(), str).apply();
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m432a(String str) {
        synchronized (this.f672a) {
            try {
                x xVar = new x();
                xVar.f14743a = 0;
                xVar.f713a = str;
                if (this.f672a.contains(xVar)) {
                    this.f672a.remove(xVar);
                }
                this.f672a.add(xVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m433a(String str) {
        synchronized (this.f672a) {
            try {
                x xVar = new x();
                xVar.f713a = str;
                return this.f672a.contains(xVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
