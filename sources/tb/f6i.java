package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class f6i {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Set<String> j = a();

    /* renamed from: a  reason: collision with root package name */
    public String f19049a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Map<String, String> f;
    public Map<String, Object> g;
    public boolean h;
    public String i;

    static {
        t2o.a(404750650);
    }

    public static Set<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("a0177257", new Object[0]);
        }
        HashSet hashSet = new HashSet();
        hashSet.add(oeh.SDKTYPE);
        hashSet.add("PAGE");
        hashSet.add(oeh.ARG1);
        hashSet.add(oeh.ARG2);
        hashSet.add(oeh.ARG3);
        hashSet.add(oeh.ARGS);
        hashSet.add(oeh.EVENTID);
        hashSet.add("_priority");
        return hashSet;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cd957182", new Object[]{this});
        }
        return this.c;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65717033", new Object[]{this});
        }
        return this.b;
    }

    public Map<String, Object> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2c12549e", new Object[]{this});
        }
        return this.g;
    }

    public Map<String, String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f5d2a108", new Object[]{this});
        }
        Map<String, String> map = this.f;
        if (map == null || ((HashMap) map).size() == 0) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : ((HashMap) this.f).entrySet()) {
            if (!j.contains(entry.getKey())) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            String str = "";
            if (TextUtils.equals((CharSequence) entry.getKey(), oeh.ARG2)) {
                if (entry.getValue() != null) {
                    str = (String) entry.getValue();
                }
                hashMap.put("bx_arg2", str);
            } else if (TextUtils.equals((CharSequence) entry.getKey(), oeh.ARG3)) {
                if (entry.getValue() != null) {
                    str = (String) entry.getValue();
                }
                hashMap.put("bx_arg3", str);
            }
        }
        return hashMap;
    }

    public JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("44a56ddd", new Object[]{this});
        }
        return null;
    }

    public Map<String, Object> g() {
        HashMap<String, String> p;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("29ee409", new Object[]{this});
        }
        if (!this.h) {
            return this.g;
        }
        if (this.f != null) {
            HashMap hashMap = new HashMap();
            String str = (String) ((HashMap) this.f).get(oeh.ARGS);
            if (!TextUtils.isEmpty(str) && (p = hqv.p(str, ",", "=", true)) != null) {
                hashMap.putAll(p);
            }
            for (Map.Entry entry : ((HashMap) this.f).entrySet()) {
                if (!j.contains(entry.getKey())) {
                    hashMap.put(entry.getKey(), entry.getValue());
                }
            }
            this.g = hashMap;
        }
        if (this.g == null) {
            this.g = new HashMap();
        }
        if (!TextUtils.isEmpty(this.d)) {
            this.g.put("bx_arg2", this.d);
        }
        if (!TextUtils.isEmpty(this.e)) {
            this.g.put("bx_arg3", this.e);
        }
        return this.g;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a7731e3", new Object[]{this});
        }
        return this.f19049a;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3139e888", new Object[]{this});
        }
        return this.i;
    }
}
