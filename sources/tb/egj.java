package tb;

import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class egj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f18561a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;

    static {
        t2o.a(745537715);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a374fa17", new Object[]{this});
        }
        return this.l;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4e97051e", new Object[]{this});
        }
        return this.i;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7f81b26", new Object[]{this});
        }
        return this.n;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cdb4062f", new Object[]{this});
        }
        return this.k;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("83cb630b", new Object[]{this});
        }
        return this.m;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e15adaa", new Object[]{this});
        }
        return this.j;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dda4cf7f", new Object[]{this});
        }
        return this.c;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6dd84abe", new Object[]{this});
        }
        String str = this.b;
        if (str == null) {
            return "";
        }
        return str;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c3dd81e2", new Object[]{this});
        }
        return this.h;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("384fe6b3", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.g)) {
            return "https://tb.cn/x/nsz/";
        }
        return this.g;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("57079ef2", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.e)) {
            return Localization.q(R.string.setting_homepage_title);
        }
        return this.e;
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this});
        }
        String str = this.f18561a;
        if (str == null) {
            return "";
        }
        return str;
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3bd52bc", new Object[]{this});
        }
        return this.f;
    }

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e5c2793b", new Object[]{this});
        }
        String str = this.d;
        if (str == null) {
            return "";
        }
        return str;
    }

    public void o(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("714986ed", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            this.f18561a = jSONObject.getString("nick");
            r(jSONObject);
            s(jSONObject);
            p(jSONObject);
            q(jSONObject);
        }
    }

    public final void p(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54713fb3", new Object[]{this, jSONObject});
            return;
        }
        this.b = null;
        this.c = null;
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject(LoggingSPCache.STORAGE_LANGUAGE)) != null) {
            this.b = jSONObject2.getString("text");
            this.c = jSONObject2.getString("url");
        }
    }

    public final void q(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc8ab20a", new Object[]{this, jSONObject});
            return;
        }
        this.l = null;
        this.i = null;
        this.h = null;
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("message")) != null) {
            this.h = jSONObject2.getString("url");
            this.l = jSONObject2.getString("heightIcon");
            this.i = jSONObject2.getString("lightIcon");
        }
    }

    public final void r(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5019e81b", new Object[]{this, jSONObject});
            return;
        }
        this.e = null;
        this.g = null;
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("settingButton")) != null) {
            this.e = jSONObject2.getString("text");
            this.g = jSONObject2.getString("url");
            this.n = jSONObject2.getString("heightIcon");
            this.k = jSONObject2.getString("lightIcon");
        }
    }

    public final void s(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2de7db0", new Object[]{this, jSONObject});
            return;
        }
        this.d = null;
        this.f = null;
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("customerService")) != null) {
            this.d = jSONObject2.getString("text");
            this.f = jSONObject2.getString("url");
            this.m = jSONObject2.getString("heightIcon");
            this.j = jSONObject2.getString("lightIcon");
        }
    }
}
