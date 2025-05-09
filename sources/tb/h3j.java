package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class h3j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f20391a;
    public String b;
    public String c;
    public String d;
    public DXTemplateItem e;
    public boolean f;
    public boolean g;
    public int h;

    static {
        t2o.a(745537939);
    }

    public h3j(int i) {
        this.h = i;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6db7474", new Object[]{this});
        }
        return this.c;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a89802ec", new Object[]{this});
        }
        return this.d;
    }

    public final DXTemplateItem c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("6de329f4", new Object[]{this});
        }
        return this.e;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69464571", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("872577a7", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8cdd20c", new Object[]{this});
        }
        return this.b;
    }

    public final JSONObject g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6d23a08d", new Object[]{this});
        }
        return this.f20391a;
    }

    public final int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53100555", new Object[]{this})).intValue();
        }
        return this.h;
    }

    public final void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4932fbea", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public final void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6aae90a", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public final void k(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45622520", new Object[]{this, dXTemplateItem});
        } else {
            this.e = dXTemplateItem;
        }
    }

    public final void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b19277b", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public final void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9460c905", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public final void n(Float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("473364b4", new Object[]{this, f});
        }
    }

    public final void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7d5f6ea", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public final void p(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea5bbc97", new Object[]{this, jSONObject});
        } else {
            this.f20391a = jSONObject;
        }
    }

    public final void q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45c7b355", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }
}
