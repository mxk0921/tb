package com.vivo.push.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    protected Context f14664a;
    private String b;
    private volatile SharedPreferences c;
    private HashMap<String, String> d = new HashMap<>();
    private HashMap<String, Long> e = new HashMap<>();
    private HashMap<String, Integer> f = new HashMap<>();
    private HashMap<String, Boolean> g = new HashMap<>();

    public final void a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.b = str;
            this.c = context.getSharedPreferences(str, 0);
            this.f14664a = context;
            List<String> b = b("local_iv");
            if (b == null || b.size() < 4) {
                u.a("BaseSharePreference", " initSecureCode error list is null ");
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("com.vivo.push.secure_sub_iv", b.get(1));
            hashMap.put("com.vivo.push.secure_sub_key", b.get(2));
            hashMap.put("com.vivo.push.secure_cache_iv", b.get(3));
            hashMap.put("com.vivo.push.secure_cache_key", b.get(0));
            a(hashMap);
            return;
        }
        throw new RuntimeException("sharedFileName can't be null");
    }

    public final String b(String str, String str2) {
        String str3 = this.d.get(str);
        if (str3 != null) {
            return str3;
        }
        b();
        if (this.c != null) {
            str3 = this.c.getString(str, str2);
            if (!TextUtils.isEmpty(str3) && !str3.equals(str2)) {
                this.d.put(str, str3);
            }
        }
        return str3;
    }

    public final int b(String str, int i) {
        Integer num = this.f.get(str);
        if (num != null) {
            return num.intValue();
        }
        b();
        if (this.c != null) {
            num = Integer.valueOf(this.c.getInt(str, i));
            if (!num.equals(Integer.valueOf(i))) {
                this.f.put(str, num);
            }
        }
        return num.intValue();
    }

    public final void a(String str, String str2) {
        this.d.put(str, str2);
        b();
        if (this.c != null) {
            SharedPreferences.Editor edit = this.c.edit();
            edit.putString(str, str2);
            a(edit);
        }
    }

    public final long b(String str, long j) {
        Long l = this.e.get(str);
        if (l != null) {
            return l.longValue();
        }
        b();
        if (this.c != null) {
            l = Long.valueOf(this.c.getLong(str, j));
            if (!l.equals(Long.valueOf(j))) {
                this.e.put(str, l);
            }
        }
        return l.longValue();
    }

    private void a(Map<String, String> map) {
        if (map.size() > 0) {
            b();
            if (this.c != null) {
                SharedPreferences.Editor edit = this.c.edit();
                for (String str : map.keySet()) {
                    String str2 = map.get(str);
                    this.d.put(str, str2);
                    edit.putString(str, str2);
                }
                a(edit);
            }
        }
    }

    private synchronized void b() {
        try {
            if (this.c == null) {
                Context context = this.f14664a;
                if (context != null) {
                    this.c = context.getSharedPreferences(this.b, 0);
                } else {
                    throw new RuntimeException("SharedPreferences is not init", new Throwable());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private List<String> b(String str) {
        Object a2;
        String[] split;
        if (this.f14664a == null) {
            u.c("BaseSharePreference", " parsLocalIv error mContext is null ");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            Context context = this.f14664a;
            a2 = ag.a(context, context.getPackageName(), str);
        } catch (Exception e) {
            u.c("BaseSharePreference", " parsLocalIv error e =" + e.getMessage());
            e.printStackTrace();
        }
        if (a2 == null) {
            return null;
        }
        String str2 = new String(Base64.decode(a2.toString(), 2));
        if (!TextUtils.isEmpty(str2) && (split = str2.split(",#@")) != null && split.length >= 4) {
            for (String str3 : split) {
                arrayList.add(str3.replace(",#@", ""));
            }
            if (arrayList.size() >= 4) {
                return arrayList;
            }
        }
        return null;
    }

    public final void a(String str, int i) {
        this.f.put(str, Integer.valueOf(i));
        b();
        if (this.c != null) {
            SharedPreferences.Editor edit = this.c.edit();
            edit.putInt(str, i);
            a(edit);
        }
    }

    public final void a(String str, long j) {
        this.e.put(str, Long.valueOf(j));
        b();
        if (this.c != null) {
            SharedPreferences.Editor edit = this.c.edit();
            edit.putLong(str, j);
            a(edit);
        }
    }

    public final void a(String str) {
        this.e.remove(str);
        this.f.remove(str);
        this.g.remove(str);
        this.d.remove(str);
        b();
        if (this.c != null) {
            SharedPreferences.Editor edit = this.c.edit();
            if (this.c.contains(str)) {
                edit.remove(str);
                a(edit);
            }
        }
    }

    public static void a(SharedPreferences.Editor editor) {
        if (editor != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                editor.apply();
            } else {
                editor.commit();
            }
        }
    }

    public final void a() {
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.d.clear();
        b();
        if (this.c != null) {
            SharedPreferences.Editor edit = this.c.edit();
            edit.clear();
            a(edit);
        }
    }
}
