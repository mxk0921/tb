package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import tb.tit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class f94 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final boolean l = mve.a("enableSetTemplateType", true);

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f19112a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public DinamicTemplate j;
    public DXTemplateItem k;

    static {
        t2o.a(486539333);
    }

    public f94(JSONObject jSONObject) {
        this.f19112a = jSONObject;
        String string = jSONObject.getString("name");
        this.b = string;
        String string2 = jSONObject.getString("version");
        this.c = string2;
        String string3 = jSONObject.getString("url");
        this.d = string3;
        String string4 = jSONObject.getString("name_v2");
        this.e = string4;
        String string5 = jSONObject.getString("version_v2");
        this.f = string5;
        String string6 = jSONObject.getString("url_v2");
        this.g = string6;
        this.h = g(string3, string, string2) || g(string6, string4, string5);
        this.i = jSONObject.getBooleanValue("isEnableButter");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea414ee9", new Object[]{this});
        } else {
            this.f19112a.put(tit.a.S_T_DISABLE_DINAMICX3, (Object) Boolean.TRUE);
        }
    }

    public DinamicTemplate b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicTemplate) ipChange.ipc$dispatch("7043cd26", new Object[]{this});
        }
        DinamicTemplate dinamicTemplate = this.j;
        if (dinamicTemplate != null) {
            return dinamicTemplate;
        }
        if (g(this.d, this.b, this.c)) {
            return new DinamicTemplate();
        }
        DinamicTemplate dinamicTemplate2 = new DinamicTemplate();
        this.j = dinamicTemplate2;
        dinamicTemplate2.name = this.b;
        dinamicTemplate2.templateUrl = this.d;
        dinamicTemplate2.version = this.c;
        return dinamicTemplate2;
    }

    public DXTemplateItem c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("e3552b21", new Object[]{this});
        }
        DXTemplateItem dXTemplateItem = this.k;
        if (dXTemplateItem != null) {
            return dXTemplateItem;
        }
        if (g(this.d, this.b, this.c)) {
            DXTemplateItem dXTemplateItem2 = new DXTemplateItem();
            this.k = dXTemplateItem2;
            dXTemplateItem2.f7343a = this.b;
            dXTemplateItem2.b = l(this.c);
            DXTemplateItem dXTemplateItem3 = this.k;
            dXTemplateItem3.c = this.d;
            dXTemplateItem3.g = this.i;
            k(dXTemplateItem3);
            return this.k;
        } else if (!g(this.g, this.e, this.f)) {
            return new DXTemplateItem();
        } else {
            DXTemplateItem dXTemplateItem4 = new DXTemplateItem();
            this.k = dXTemplateItem4;
            dXTemplateItem4.f7343a = this.e;
            dXTemplateItem4.b = l(this.f);
            DXTemplateItem dXTemplateItem5 = this.k;
            dXTemplateItem5.c = this.g;
            dXTemplateItem5.g = this.i;
            k(dXTemplateItem5);
            return this.k;
        }
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8afad3e", new Object[]{this});
        }
        if (i()) {
            return c().f7343a;
        }
        return b().name;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c62d2fa", new Object[]{this});
        }
        if (i()) {
            return c().c;
        }
        return b().templateUrl;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba17df31", new Object[]{this});
        }
        if (i()) {
            return String.valueOf(c().b);
        }
        return b().version;
    }

    public final boolean g(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf70aa3", new Object[]{this, str, str2, str3})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || !str.endsWith(".zip") || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return false;
        }
        return true;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed4ea59d", new Object[]{this})).booleanValue();
        }
        return this.f19112a.getBooleanValue(tit.a.S_T_RECALCULATE_VIEW_TYPE);
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("366eb872", new Object[]{this})).booleanValue();
        }
        if (!this.f19112a.containsKey(tit.a.S_T_DISABLE_DINAMICX3) || !this.f19112a.getBooleanValue(tit.a.S_T_DISABLE_DINAMICX3)) {
            return this.h;
        }
        return false;
    }

    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47b5eb93", new Object[]{this, new Boolean(z)});
        } else {
            this.f19112a.put(tit.a.S_T_RECALCULATE_VIEW_TYPE, (Object) Boolean.valueOf(z));
        }
    }

    public final void k(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9f64c6", new Object[]{this, dXTemplateItem});
        } else if (l && dXTemplateItem != null) {
            dXTemplateItem.m(1);
        }
    }

    public final long l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("718dec6a", new Object[]{this, str})).longValue();
        }
        try {
            return Long.parseLong(str);
        } catch (Throwable th) {
            fve.c("CompatibleDinamicTemplate", "str2Num", th);
            return 0L;
        }
    }
}
