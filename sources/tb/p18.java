package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class p18 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final DXTemplateItem f25809a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;

    static {
        t2o.a(786432168);
    }

    public p18(String str, long j, String str2) {
        ckf.g(str, "pName");
        ckf.g(str2, "pUrl");
        this.c = true;
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        dXTemplateItem.f7343a = str;
        dXTemplateItem.b = j;
        dXTemplateItem.c = str2;
        xhv xhvVar = xhv.INSTANCE;
        this.f25809a = dXTemplateItem;
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c20c76dd", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2564eee4", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b9c80d6", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public final DXTemplateItem d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("ccf841d5", new Object[]{this});
        }
        return this.f25809a;
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e83db617", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public final void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7531059", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public final void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16ae9927", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public final void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d698568", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public final void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbf0e14e", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public p18(JSONObject jSONObject) {
        this.c = true;
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        JSONObject f = vwf.f(jSONObject, "template", null);
        if (f != null) {
            dXTemplateItem.f7343a = f.getString("name");
            Long l = f.getLong("version");
            ckf.f(l, "it.getLong(\"version\")");
            dXTemplateItem.b = l.longValue();
            dXTemplateItem.c = f.getString("url");
        }
        xhv xhvVar = xhv.INSTANCE;
        this.f25809a = dXTemplateItem;
        this.c = vwf.b(jSONObject, "sharedEngine", true);
        JSONObject f2 = vwf.f(jSONObject, "engineConfig", null);
        if (f2 != null) {
            this.d = ckf.b("useCache", vwf.g(f2, "downgradeType", null));
            this.e = vwf.b(f2, "enableStrategy", false);
        }
        this.b = ckf.b("downloadFirst", vwf.g(jSONObject, x96.REFRESH_TYPE, null));
    }
}
