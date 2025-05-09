package com.huawei.hms.framework.network.grs.e;

import android.content.Context;
import android.content.pm.PackageManager;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.PLSharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c {
    private static final String b = "c";
    private static final Map<String, PLSharedPreferences> c = new ConcurrentHashMap(16);

    /* renamed from: a  reason: collision with root package name */
    private final PLSharedPreferences f5340a;

    public c(Context context, String str) {
        String packageName = context.getPackageName();
        Logger.d(b, "get pkgname from context is{%s}", packageName);
        Map<String, PLSharedPreferences> map = c;
        if (map.containsKey(str + packageName)) {
            this.f5340a = map.get(str + packageName);
        } else {
            PLSharedPreferences pLSharedPreferences = new PLSharedPreferences(context, str + packageName);
            this.f5340a = pLSharedPreferences;
            map.put(str + packageName, pLSharedPreferences);
        }
        a(context);
    }

    public String a(String str, String str2) {
        String string;
        PLSharedPreferences pLSharedPreferences = this.f5340a;
        if (pLSharedPreferences == null) {
            return str2;
        }
        synchronized (pLSharedPreferences) {
            string = this.f5340a.getString(str, str2);
        }
        return string;
    }

    public void b() {
        PLSharedPreferences pLSharedPreferences = this.f5340a;
        if (pLSharedPreferences != null) {
            synchronized (pLSharedPreferences) {
                this.f5340a.clear();
            }
        }
    }

    public Map<String, ?> a() {
        Map<String, ?> all;
        PLSharedPreferences pLSharedPreferences = this.f5340a;
        if (pLSharedPreferences == null) {
            return new HashMap();
        }
        synchronized (pLSharedPreferences) {
            all = this.f5340a.getAll();
        }
        return all;
    }

    public void b(String str, String str2) {
        PLSharedPreferences pLSharedPreferences = this.f5340a;
        if (pLSharedPreferences != null) {
            synchronized (pLSharedPreferences) {
                this.f5340a.putString(str, str2);
            }
        }
    }

    private void a(Context context) {
        String str = b;
        Logger.i(str, "ContextHolder.getAppContext() from GRS is:" + ContextHolder.getAppContext());
        if (ContextHolder.getAppContext() != null) {
            context = ContextHolder.getAppContext();
        }
        try {
            String l = Long.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionCode);
            String a2 = a("version", "");
            if (!l.equals(a2)) {
                Logger.i(str, "app version changed! old version{%s} and new version{%s}", a2, l);
                b();
                b("version", l);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Logger.w(b, "get app version failed and catch NameNotFoundException");
        }
    }

    public void a(String str) {
        PLSharedPreferences pLSharedPreferences = this.f5340a;
        if (pLSharedPreferences != null) {
            synchronized (pLSharedPreferences) {
                this.f5340a.remove(str);
            }
        }
    }
}
