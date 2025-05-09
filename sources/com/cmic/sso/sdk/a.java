package com.cmic.sso.sdk;

import com.mobile.auth.O000o;
import com.mobile.auth.O0O000o;
import com.mobile.auth.O0O0O;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<String, Object> f4615a;

    public a(int i) {
        this.f4615a = new ConcurrentHashMap<>(i);
    }

    public O0O000o a() {
        O0O000o o0O000o = (O0O000o) this.f4615a.get("logBean");
        return o0O000o != null ? o0O000o : new O0O000o();
    }

    public int b(String str, int i) {
        return (str == null || !this.f4615a.containsKey(str)) ? i : ((Integer) this.f4615a.get(str)).intValue();
    }

    public int c(String str) {
        return b(str, 0);
    }

    public void a(O000o o000o) {
        if (o000o != null) {
            this.f4615a.put("current_config", o000o);
        }
    }

    public long b(String str, long j) {
        return (str == null || !this.f4615a.containsKey(str)) ? j : ((Long) this.f4615a.get(str)).longValue();
    }

    public void a(O0O000o o0O000o) {
        if (o0O000o != null) {
            this.f4615a.put("logBean", o0O000o);
        }
    }

    public O000o b() {
        O000o o000o = (O000o) this.f4615a.get("current_config");
        if (o000o != null) {
            return o000o;
        }
        O0O0O.O000000o("UmcConfigBean为空", "请核查");
        return new O000o.O000000o().O000000o();
    }

    public void a(String str, int i) {
        if (str != null) {
            this.f4615a.put(str, Integer.valueOf(i));
        }
    }

    public String b(String str) {
        return b(str, "");
    }

    public void a(String str, long j) {
        if (str != null) {
            this.f4615a.put(str, Long.valueOf(j));
        }
    }

    public String b(String str, String str2) {
        return (str == null || !this.f4615a.containsKey(str)) ? str2 : (String) this.f4615a.get(str);
    }

    public void a(String str, String str2) {
        if (str != null && str2 != null) {
            this.f4615a.put(str, str2);
        }
    }

    public boolean b(String str, boolean z) {
        return (str == null || !this.f4615a.containsKey(str)) ? z : ((Boolean) this.f4615a.get(str)).booleanValue();
    }

    public void a(String str, boolean z) {
        if (str != null) {
            this.f4615a.put(str, Boolean.valueOf(z));
        }
    }

    public void a(String str, byte[] bArr) {
        if (str != null && bArr != null) {
            this.f4615a.put(str, bArr);
        }
    }

    public byte[] a(String str) {
        if (str != null) {
            return (byte[]) this.f4615a.get(str);
        }
        return null;
    }
}
