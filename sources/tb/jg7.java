package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.LiveEmbedType;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class jg7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f21984a;
    public final String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g = "false";
    public String h = "false";
    public String i;
    public LiveEmbedType j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public JSONObject p;
    public String q;
    public JSONObject r;
    public Map<String, String> s;
    public String t;

    static {
        t2o.a(806355993);
    }

    public jg7(String str, String str2) {
        this.f21984a = str;
        this.b = str2;
    }

    public jg7 A(LiveEmbedType liveEmbedType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jg7) ipChange.ipc$dispatch("9f66f528", new Object[]{this, liveEmbedType});
        }
        this.j = liveEmbedType;
        return this;
    }

    public jg7 B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jg7) ipChange.ipc$dispatch("ddee1318", new Object[]{this, str});
        }
        this.d = str;
        return this;
    }

    public jg7 C(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jg7) ipChange.ipc$dispatch("4e8e5788", new Object[]{this, jSONObject});
        }
        this.p = jSONObject;
        return this;
    }

    public jg7 D(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jg7) ipChange.ipc$dispatch("5b5735a5", new Object[]{this, str});
        }
        this.c = str;
        return this;
    }

    public void E(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("365a4c48", new Object[]{this, map});
        } else {
            this.s = map;
        }
    }

    public jg7 F(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jg7) ipChange.ipc$dispatch("d8e6c3a4", new Object[]{this, str});
        }
        this.i = str;
        return this;
    }

    public jg7 G(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jg7) ipChange.ipc$dispatch("379d59b0", new Object[]{this, str});
        }
        this.g = str;
        return this;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef0df7e8", new Object[]{this});
        }
        return this.b;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1db89666", new Object[]{this});
        }
        return this.f;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e27dc695", new Object[]{this});
        }
        return this.h;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("607204a", new Object[]{this});
        }
        return this.l;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad0b7ea", new Object[]{this});
        }
        return this.k;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2595acd7", new Object[]{this});
        }
        return this.o;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d7740fc", new Object[]{this});
        }
        return this.f21984a;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd7f76fc", new Object[]{this});
        }
        return this.e;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24c2e0af", new Object[]{this});
        }
        return this.q;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("adcf4be9", new Object[]{this});
        }
        return this.n;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e01b146", new Object[]{this});
        }
        return this.m;
    }

    public LiveEmbedType l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveEmbedType) ipChange.ipc$dispatch("99f773df", new Object[]{this});
        }
        return this.j;
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b140f9ed", new Object[]{this});
        }
        return this.d;
    }

    public JSONObject n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ee5b142b", new Object[]{this});
        }
        return this.p;
    }

    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67ffa", new Object[]{this});
        }
        return this.c;
    }

    public Map<String, String> p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1a884706", new Object[]{this});
        }
        if (this.s == null) {
            this.s = new HashMap();
        }
        return this.s;
    }

    public String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66e7cce1", new Object[]{this});
        }
        return this.i;
    }

    public String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e0323ed", new Object[]{this});
        }
        return this.g;
    }

    public jg7 s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jg7) ipChange.ipc$dispatch("e80caaa9", new Object[]{this, str});
        }
        this.f = str;
        return this;
    }

    public jg7 t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jg7) ipChange.ipc$dispatch("87e70b58", new Object[]{this, str});
        }
        this.h = str;
        return this;
    }

    public jg7 u(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jg7) ipChange.ipc$dispatch("18b411e4", new Object[]{this, str, str2});
        }
        this.k = str;
        this.l = str2;
        return this;
    }

    public jg7 v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jg7) ipChange.ipc$dispatch("77540502", new Object[]{this, str});
        }
        this.o = str;
        return this;
    }

    public jg7 w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jg7) ipChange.ipc$dispatch("164876a7", new Object[]{this, str});
        }
        this.e = str;
        return this;
    }

    public jg7 x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jg7) ipChange.ipc$dispatch("5d996fda", new Object[]{this, str});
        }
        this.q = str;
        return this;
    }

    public jg7 y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jg7) ipChange.ipc$dispatch("903abbac", new Object[]{this, str});
        }
        this.n = str;
        return this;
    }

    public jg7 z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jg7) ipChange.ipc$dispatch("e3beaf89", new Object[]{this, str});
        }
        this.m = str;
        return this;
    }
}
