package com.taobao.android.weex_framework;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.g4;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import tb.dn2;
import tb.dwh;
import tb.t2o;
import tb.vvh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile String f9969a;
    public volatile String b;
    public volatile String c;
    public volatile String d;
    public volatile boolean e;
    public volatile int f;

    static {
        t2o.a(982516031);
    }

    public c() {
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("68545a99", new Object[]{this});
        }
        return b(false);
    }

    public JSONObject b(boolean z) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c23f4d9b", new Object[]{this, new Boolean(z)});
        }
        JSONObject jSONObject = new JSONObject();
        String e = e();
        String i = i();
        if (z) {
            str = k();
        } else {
            str = o();
        }
        if (z) {
            str2 = j();
        } else {
            str2 = n();
        }
        String f = f();
        String m = m();
        String h = h();
        String d = d();
        if (!TextUtils.isEmpty(e)) {
            jSONObject.put(MUSAppMonitor.BUNDLE_URL, (Object) e);
        }
        if (i != null) {
            jSONObject.put("page_name", (Object) i);
        }
        if (str != null) {
            jSONObject.put(MUSAppMonitor.T_ITEM_TYPE, (Object) str);
        }
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put(MUSAppMonitor.SCRIPT_URL, (Object) str2);
        }
        if (f != null) {
            jSONObject.put(MUSAppMonitor.BYTECODE, (Object) f);
        }
        if (!TextUtils.isEmpty(m)) {
            jSONObject.put("sversion", (Object) m);
        }
        if (h != null) {
            jSONObject.put(MUSAppMonitor.MUISE_SDK_VERSION, (Object) h);
        }
        if (d != null) {
            jSONObject.put(MUSAppMonitor.ALIMUISE_SDK_VERSION, (Object) d);
        }
        return jSONObject;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a8938206", new Object[]{this});
        }
        return null;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("61c5e8d0", new Object[]{this});
        }
        try {
            return vvh.d(g4.a.f2721a, "alimusVersion");
        } catch (Exception e) {
            dwh.i(e);
            return "[ERR_GET]";
        }
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dee20482", new Object[]{this});
        }
        return this.f9969a;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("291c074e", new Object[]{this});
        }
        return null;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cd985600", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7863eebe", new Object[]{this});
        }
        return dn2.VERSION_NAME_VALUE;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        return this.b;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("816dba67", new Object[]{this});
        }
        return this.d;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eef22daa", new Object[]{this});
        }
        return this.c;
    }

    public MUSInstanceConfig.MUSRenderType l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSInstanceConfig.MUSRenderType) ipChange.ipc$dispatch("f3977c21", new Object[]{this});
        }
        return null;
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("82f9ab7e", new Object[]{this});
        }
        try {
            return vvh.d("app", "serverVersion");
        } catch (Exception e) {
            dwh.i(e);
            return "[ERR_GET]";
        }
    }

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aace99cb", new Object[]{this});
        }
        if (!this.e) {
            return this.d;
        }
        if (this.c == null) {
            return null;
        }
        return "prebuild://" + this.c;
    }

    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18530d0e", new Object[]{this});
        }
        if (!this.e) {
            return this.c;
        }
        if (this.c == null) {
            return null;
        }
        return this.c + "/prebuild";
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ded021e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f9c479c", new Object[]{this, str});
        } else {
            this.f9969a = str;
        }
    }

    public void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a5935cd", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cd1cf40", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31425b73", new Object[]{this, str});
            return;
        }
        try {
            this.d = Uri.parse(str).buildUpon().clearQuery().build().toString();
        } catch (Throwable unused) {
            dwh.v(MUSAppMonitor.LOG_TAG);
            this.d = str;
        }
    }

    public void u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("744c5090", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public c(String str, String str2) {
        this.f9969a = str;
        this.d = str2;
    }

    public c(String str, String str2, String str3, String str4) {
        this.f9969a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public c(c cVar, String str, String str2) {
        String str3 = "";
        this.f9969a = cVar != null ? cVar.f9969a : str3;
        this.b = cVar != null ? cVar.b : str3;
        this.f = cVar != null ? cVar.g() : 0;
        this.c = str2;
        this.d = str;
    }
}
