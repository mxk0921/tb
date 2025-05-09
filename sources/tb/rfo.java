package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.roman.BuiltinFallbackMatcher;
import com.taobao.android.weex_framework.module.builtin.WXStorageModule;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class rfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final dal f27345a;
    public final aoq b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final rfo f27346a = new rfo();

        static {
            t2o.a(993001939);
        }

        public static /* synthetic */ rfo a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rfo) ipChange.ipc$dispatch("e4481262", new Object[0]);
            }
            return f27346a;
        }
    }

    static {
        t2o.a(993001937);
    }

    public static rfo b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rfo) ipChange.ipc$dispatch("65b61c3d", new Object[0]);
        }
        return b.a();
    }

    public final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5bc989fa", new Object[]{this, str});
        }
        bpl<String, Integer> b2 = BuiltinFallbackMatcher.b(str);
        if (b2 != null) {
            e(str, "fallback", b2.b.intValue());
            return b2.f16534a;
        }
        e(str, "fail", -1);
        return null;
    }

    public String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb14aefb", new Object[]{this, str, str2});
        }
        String d = d(str, str2);
        if (TextUtils.isEmpty(d)) {
            return a(str);
        }
        return d;
    }

    public final String d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b188de83", new Object[]{this, str, str2});
        }
        bpl<String, Integer> e = this.f27345a.e(str, str2);
        bpl<String, Integer> c = this.b.c(str);
        if (e == null && c == null) {
            return null;
        }
        if (e == null) {
            e(str, WXStorageModule.NAME, c.b.intValue());
            return c.f16534a;
        } else if (c == null) {
            e(str, "orange", e.b.intValue());
            return e.f16534a;
        } else if (e.b.intValue() >= c.b.intValue()) {
            e(str, "orange", e.b.intValue());
            return e.f16534a;
        } else {
            e(str, WXStorageModule.NAME, c.b.intValue());
            return c.f16534a;
        }
    }

    public final void e(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a477dfd", new Object[]{this, str, str2, new Integer(i)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pageKey", (Object) str);
        jSONObject.put("configSource", (Object) str2);
        jSONObject.put("configVersion", (Object) String.valueOf(i));
        AppMonitor.Counter.commit("tbsearch", "roman_page_version", jSONObject.toString(), 1.0d);
    }

    public void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("482a0cbe", new Object[]{this, jSONObject});
            return;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            JSONObject jSONObject2 = (JSONObject) entry.getValue();
            hashMap.put(entry.getKey(), bpl.a(jSONObject2.getString("url"), jSONObject2.getInteger("version")));
        }
        this.b.d(hashMap);
    }

    public rfo() {
        this.f27345a = new dal();
        this.b = new aoq();
    }
}
