package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class nrv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_VALUE = "standard_version";
    public static final String SWITCHER_VERSION = "switcherVersion";
    public static final String USER_GROWTH_DAU = "UserGrowthDAU";

    /* renamed from: a  reason: collision with root package name */
    public String f24913a = os6.b("switcherVersion", "standard_version");
    public String b = kbq.c(m0b.c()).editionCode;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final nrv f24914a = new nrv();

        static {
            t2o.a(729809119);
        }

        public static /* synthetic */ nrv a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (nrv) ipChange.ipc$dispatch("c428a8f7", new Object[0]);
            }
            return f24914a;
        }
    }

    static {
        t2o.a(729809118);
    }

    public static nrv a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nrv) ipChange.ipc$dispatch("f99e0cbc", new Object[0]);
        }
        return a.a();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4f9af34", new Object[]{this});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("coldStart", (Object) this.f24913a);
            jSONObject.put(r4p.KEY_EDITION_CODE, (Object) this.b);
            r5a.h("Page_Home", 19999, USER_GROWTH_DAU, jSONObject);
        } catch (Exception unused) {
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3bb5480", new Object[]{this});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fromEditionCode", (Object) this.b);
            String str = kbq.c(m0b.c()).editionCode;
            this.b = str;
            jSONObject.put("toEditionCode", (Object) str);
            jSONObject.put("currentVersion", (Object) this.f24913a);
            r5a.h("Page_Home", 19999, USER_GROWTH_DAU, jSONObject);
        } catch (Exception unused) {
        }
    }

    public void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82ed953b", new Object[]{this, str, str2});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from", (Object) str);
            jSONObject.put("to", (Object) str2);
            jSONObject.put(r4p.KEY_EDITION_CODE, (Object) this.b);
            r5a.h("Page_Home", 19999, USER_GROWTH_DAU, jSONObject);
        } catch (Exception unused) {
        }
    }

    public void e(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14a94ff3", new Object[]{this, map});
        } else if (map != null) {
            map.put("switcherVersion", this.f24913a);
        }
    }

    public void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c51f0da", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            String string = jSONObject.getString("switcherVersion");
            if (TextUtils.isEmpty(string)) {
                string = "standard_version";
            }
            if (!string.equals(this.f24913a)) {
                d(this.f24913a, string);
                this.f24913a = string;
                os6.h("switcherVersion", string);
            }
        }
    }
}
