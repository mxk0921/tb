package com.alibaba.wireless.security.framework;

import com.alibaba.wireless.security.framework.utils.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static String h = "version";
    private static String i = "lib_dep_version";
    private static String j = "lib_dep_arch";
    private static String k = "target_plugin";
    private static String l = "sg_version";

    /* renamed from: a  reason: collision with root package name */
    private volatile JSONObject f3413a;
    private boolean b = true;
    private int c = 0;
    private boolean d = true;
    private String e = "";
    private boolean f = true;
    private String g = "";

    static {
        t2o.a(659554327);
    }

    public b(JSONObject jSONObject) {
        this.f3413a = jSONObject;
    }

    public static b a(File file) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("5fd6c77e", new Object[]{file});
        }
        if (file == null) {
            return null;
        }
        if (file.exists()) {
            try {
                String a2 = a.a(file);
                if (a2 == null || a2.length() <= 0) {
                    return null;
                }
                jSONObject = new JSONObject(a2);
                if (!"1.0".equals(jSONObject.getString(h))) {
                    return null;
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return new b(jSONObject);
    }

    public int b() {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        if (this.b) {
            try {
                i2 = Integer.parseInt(a().getString(i));
            } catch (Exception unused) {
                i2 = 0;
            }
            this.c = i2;
            this.b = false;
        }
        return this.c;
    }

    public String c() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        if (this.d) {
            try {
                str = a().getString(j);
            } catch (Exception unused) {
                str = "";
            }
            this.e = str;
            this.d = false;
        }
        return this.e;
    }

    public HashMap<String, String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("9d11238e", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            JSONObject jSONObject = a().getJSONObject(l);
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }

    public String e() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        if (this.f) {
            try {
                str = a().getString(k);
            } catch (Exception unused) {
                str = "";
            }
            this.g = str;
            this.f = false;
        }
        return this.g;
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        try {
            return a().getString(str);
        } catch (Exception unused) {
            return "";
        }
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("69129956", new Object[]{this}) : this.f3413a;
    }
}
