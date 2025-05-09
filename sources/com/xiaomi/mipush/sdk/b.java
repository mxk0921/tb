package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.taobao.weex.common.WXConfig;
import com.xiaomi.push.g;
import com.xiaomi.push.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f14725a;

    /* renamed from: a  reason: collision with other field name */
    private Context f693a;

    /* renamed from: a  reason: collision with other field name */
    private a f694a;

    /* renamed from: a  reason: collision with other field name */
    String f695a;

    /* renamed from: a  reason: collision with other field name */
    private Map<String, a> f696a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with other field name */
        private Context f697a;

        /* renamed from: a  reason: collision with other field name */
        public String f698a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;

        /* renamed from: a  reason: collision with other field name */
        public boolean f699a = true;

        /* renamed from: b  reason: collision with other field name */
        public boolean f700b = false;

        /* renamed from: a  reason: collision with root package name */
        public int f14726a = 1;

        public a(Context context) {
            this.f697a = context;
        }

        public static a a(Context context, String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                a aVar = new a(context);
                aVar.f698a = jSONObject.getString("appId");
                aVar.b = jSONObject.getString("appToken");
                aVar.c = jSONObject.getString("regId");
                aVar.d = jSONObject.getString("regSec");
                aVar.f = jSONObject.getString(WXConfig.devId);
                aVar.e = jSONObject.getString("vName");
                aVar.f699a = jSONObject.getBoolean("valid");
                aVar.f700b = jSONObject.getBoolean("paused");
                aVar.f14726a = jSONObject.getInt("envType");
                aVar.g = jSONObject.getString("regResource");
                return aVar;
            } catch (Throwable th) {
                com.xiaomi.channel.commonutils.logger.b.a(th);
                return null;
            }
        }

        public void b() {
            this.f699a = false;
            b.a(this.f697a).edit().putBoolean("valid", this.f699a).commit();
        }

        public void c(String str, String str2, String str3) {
            this.f698a = str;
            this.b = str2;
            this.g = str3;
        }

        private String a() {
            Context context = this.f697a;
            return g.m702a(context, context.getPackageName());
        }

        public void b(String str, String str2, String str3) {
            this.c = str;
            this.d = str2;
            this.f = i.h(this.f697a);
            this.e = a();
            this.f699a = true;
            this.h = str3;
            SharedPreferences.Editor edit = b.a(this.f697a).edit();
            edit.putString("regId", str);
            edit.putString("regSec", str2);
            edit.putString(WXConfig.devId, this.f);
            edit.putString("vName", a());
            edit.putBoolean("valid", true);
            edit.putString("appRegion", str3);
            edit.commit();
        }

        public static String a(a aVar) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("appId", aVar.f698a);
                jSONObject.put("appToken", aVar.b);
                jSONObject.put("regId", aVar.c);
                jSONObject.put("regSec", aVar.d);
                jSONObject.put(WXConfig.devId, aVar.f);
                jSONObject.put("vName", aVar.e);
                jSONObject.put("valid", aVar.f699a);
                jSONObject.put("paused", aVar.f700b);
                jSONObject.put("envType", aVar.f14726a);
                jSONObject.put("regResource", aVar.g);
                return jSONObject.toString();
            } catch (Throwable th) {
                com.xiaomi.channel.commonutils.logger.b.a(th);
                return null;
            }
        }

        /* renamed from: a  reason: collision with other method in class */
        public void m465a() {
            b.a(this.f697a).edit().clear().commit();
            this.f698a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.f = null;
            this.e = null;
            this.f699a = false;
            this.f700b = false;
            this.h = null;
            this.f14726a = 1;
        }

        public void a(int i) {
            this.f14726a = i;
        }

        public void a(String str, String str2) {
            this.c = str;
            this.d = str2;
            this.f = i.h(this.f697a);
            this.e = a();
            this.f699a = true;
        }

        public void a(String str, String str2, String str3) {
            this.f698a = str;
            this.b = str2;
            this.g = str3;
            SharedPreferences.Editor edit = b.a(this.f697a).edit();
            edit.putString("appId", this.f698a);
            edit.putString("appToken", str2);
            edit.putString("regResource", str3);
            edit.commit();
        }

        public void a(boolean z) {
            this.f700b = z;
        }

        /* renamed from: a  reason: collision with other method in class */
        public boolean m466a() {
            return m467a(this.f698a, this.b);
        }

        /* renamed from: a  reason: collision with other method in class */
        public boolean m467a(String str, String str2) {
            boolean equals = TextUtils.equals(this.f698a, str);
            boolean equals2 = TextUtils.equals(this.b, str2);
            boolean isEmpty = TextUtils.isEmpty(this.c);
            boolean z = !isEmpty;
            boolean isEmpty2 = TextUtils.isEmpty(this.d);
            boolean z2 = !isEmpty2;
            boolean z3 = false;
            boolean z4 = TextUtils.isEmpty(i.b(this.f697a)) || TextUtils.equals(this.f, i.h(this.f697a)) || TextUtils.equals(this.f, i.g(this.f697a));
            if (equals && equals2 && !isEmpty && !isEmpty2 && z4) {
                z3 = true;
            }
            if (!z3) {
                com.xiaomi.channel.commonutils.logger.b.e("register invalid, aid=" + equals + ";atn=" + equals2 + ";rid=" + z + ";rse=" + z2 + ";did=" + z4);
            }
            return z3;
        }
    }

    private b(Context context) {
        this.f693a = context;
        c();
    }

    public int a() {
        return this.f694a.f14726a;
    }

    public String b() {
        return this.f694a.b;
    }

    /* renamed from: c  reason: collision with other method in class */
    public String m460c() {
        return this.f694a.c;
    }

    public String d() {
        return this.f694a.d;
    }

    public String e() {
        return this.f694a.g;
    }

    public String f() {
        return this.f694a.h;
    }

    public static SharedPreferences a(Context context) {
        return context.getSharedPreferences("mipush", 0);
    }

    private void c() {
        this.f694a = new a(this.f693a);
        this.f696a = new HashMap();
        SharedPreferences a2 = a(this.f693a);
        this.f694a.f698a = a2.getString("appId", null);
        this.f694a.b = a2.getString("appToken", null);
        this.f694a.c = a2.getString("regId", null);
        this.f694a.d = a2.getString("regSec", null);
        this.f694a.f = a2.getString(WXConfig.devId, null);
        if (!TextUtils.isEmpty(this.f694a.f) && i.a(this.f694a.f)) {
            this.f694a.f = i.h(this.f693a);
            a2.edit().putString(WXConfig.devId, this.f694a.f).commit();
        }
        this.f694a.e = a2.getString("vName", null);
        this.f694a.f699a = a2.getBoolean("valid", true);
        this.f694a.f700b = a2.getBoolean("paused", false);
        this.f694a.f14726a = a2.getInt("envType", 1);
        this.f694a.g = a2.getString("regResource", null);
        this.f694a.h = a2.getString("appRegion", null);
    }

    /* renamed from: b  reason: collision with other method in class */
    public void m458b() {
        this.f694a.b();
    }

    /* renamed from: d  reason: collision with other method in class */
    public boolean m462d() {
        return !TextUtils.isEmpty(this.f694a.f698a) && !TextUtils.isEmpty(this.f694a.b) && !TextUtils.isEmpty(this.f694a.c) && !TextUtils.isEmpty(this.f694a.d);
    }

    /* renamed from: e  reason: collision with other method in class */
    public boolean m463e() {
        return this.f694a.f700b;
    }

    /* renamed from: f  reason: collision with other method in class */
    public boolean m464f() {
        return !this.f694a.f699a;
    }

    public a a(String str) {
        if (this.f696a.containsKey(str)) {
            return this.f696a.get(str);
        }
        String str2 = "hybrid_app_info_" + str;
        SharedPreferences a2 = a(this.f693a);
        if (!a2.contains(str2)) {
            return null;
        }
        a a3 = a.a(this.f693a, a2.getString(str2, ""));
        this.f696a.put(str2, a3);
        return a3;
    }

    public void b(String str) {
        this.f696a.remove(str);
        a(this.f693a).edit().remove("hybrid_app_info_" + str).commit();
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m461c() {
        return this.f694a.m466a();
    }

    /* renamed from: a  reason: collision with other method in class */
    public static b m452a(Context context) {
        if (f14725a == null) {
            synchronized (b.class) {
                try {
                    if (f14725a == null) {
                        f14725a = new b(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14725a;
    }

    public void b(String str, String str2, String str3) {
        this.f694a.b(str, str2, str3);
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m453a() {
        return this.f694a.f698a;
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m459b() {
        if (this.f694a.m466a()) {
            return true;
        }
        com.xiaomi.channel.commonutils.logger.b.m410a("Don't send message before initialization succeeded!");
        return false;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m454a() {
        this.f694a.m465a();
    }

    public void a(int i) {
        this.f694a.a(i);
        a(this.f693a).edit().putInt("envType", i).commit();
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m455a(String str) {
        SharedPreferences.Editor edit = a(this.f693a).edit();
        edit.putString("vName", str);
        edit.commit();
        this.f694a.e = str;
    }

    public void a(String str, a aVar) {
        this.f696a.put(str, aVar);
        String a2 = a.a(aVar);
        a(this.f693a).edit().putString("hybrid_app_info_" + str, a2).commit();
    }

    public void a(String str, String str2, String str3) {
        this.f694a.a(str, str2, str3);
    }

    public void a(boolean z) {
        this.f694a.a(z);
        a(this.f693a).edit().putBoolean("paused", z).commit();
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m456a() {
        Context context = this.f693a;
        return !TextUtils.equals(g.m702a(context, context.getPackageName()), this.f694a.e);
    }

    public boolean a(String str, String str2) {
        return this.f694a.m467a(str, str2);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m457a(String str, String str2, String str3) {
        a a2 = a(str3);
        return a2 != null && TextUtils.equals(str, a2.f698a) && TextUtils.equals(str2, a2.b);
    }
}
