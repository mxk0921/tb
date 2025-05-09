package tb;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.alibaba.ability.impl.stdpop.StdPopAbility;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.render.FragmentContainer;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dxcontainerview.DXContainerView;
import com.taobao.android.nav.Nav;
import com.taobao.android.stdpop.api.PopGravity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class plq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f26161a;
    public float b;
    public boolean c;
    public zfm d;
    public String e;
    public PopGravity f;
    public String g;
    public String h;
    public Integer i;
    public Integer j;
    public String k;
    public f28 l;
    public final String m;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a implements u8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ mlq f26162a;

        public a(mlq mlqVar) {
            this.f26162a = mlqVar;
        }

        @Override // tb.u8
        public final void callback(String str, c8<Object> c8Var) {
            mlq mlqVar;
            mlq mlqVar2;
            mlq mlqVar3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc026703", new Object[]{this, str, c8Var});
            } else if (str != null) {
                int hashCode = str.hashCode();
                JSONObject jSONObject = null;
                if (hashCode != -2134841305) {
                    if (hashCode != -1351896231) {
                        if (hashCode == 295869492 && str.equals("onBlockBackDismissed") && (mlqVar3 = this.f26162a) != null) {
                            Object a2 = c8Var != null ? c8Var.a() : null;
                            if (a2 instanceof JSONObject) {
                                jSONObject = a2;
                            }
                            mlqVar3.a((JSONObject) jSONObject);
                        }
                    } else if (str.equals("onClose") && (mlqVar2 = this.f26162a) != null) {
                        Object a3 = c8Var != null ? c8Var.a() : null;
                        if (a3 instanceof JSONObject) {
                            jSONObject = a3;
                        }
                        mlqVar2.b((JSONObject) jSONObject);
                    }
                } else if (str.equals("onPopAppear") && (mlqVar = this.f26162a) != null) {
                    Object a4 = c8Var != null ? c8Var.a() : null;
                    if (a4 instanceof JSONObject) {
                        jSONObject = a4;
                    }
                    mlqVar.c(jSONObject);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Activity b;

        public b(Activity activity) {
            this.b = activity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                olq.a(this.b, plq.a(plq.this));
            }
        }
    }

    static {
        t2o.a(786432029);
    }

    public plq() {
        this(null, 1, null);
    }

    public static final /* synthetic */ String a(plq plqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("147f9b", new Object[]{plqVar});
        }
        return plqVar.m;
    }

    public static /* synthetic */ wbm d(plq plqVar, Context context, JSONObject jSONObject, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wbm) ipChange.ipc$dispatch("694c61f8", new Object[]{plqVar, context, jSONObject, new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            jSONObject = null;
        }
        return plqVar.c(context, jSONObject);
    }

    public static /* synthetic */ void y(plq plqVar, Context context, String str, mlq mlqVar, JSONObject jSONObject, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("638cdf0d", new Object[]{plqVar, context, str, mlqVar, jSONObject, new Integer(i), obj});
            return;
        }
        if ((i & 8) != 0) {
            jSONObject = null;
        }
        plqVar.x(context, str, mlqVar, jSONObject);
    }

    public final u8 b(mlq mlqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u8) ipChange.ipc$dispatch("19535beb", new Object[]{this, mlqVar});
        }
        return new a(mlqVar);
    }

    public final wbm c(Context context, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wbm) ipChange.ipc$dispatch("6e5c1176", new Object[]{this, context, jSONObject});
        }
        wbm b2 = new wbm(this.m, Float.valueOf(this.b), this.g, jSONObject).b(this.f26161a, this.k, this.h);
        boolean z = this.c;
        boolean l = gxv.l(context);
        Integer num = this.j;
        wbm e = b2.e(z, l, Integer.valueOf(num != null ? num.intValue() : 300));
        zfm zfmVar = this.d;
        PopGravity popGravity = this.f;
        Integer num2 = this.i;
        if (context instanceof Activity) {
            str = "view";
        } else {
            str = "activity";
        }
        return e.g(zfmVar, popGravity, num2, str);
    }

    public final Integer e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("844f908f", new Object[]{this});
        }
        return this.i;
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b8f1723", new Object[]{this});
        }
        return this.m;
    }

    public final void g(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e6fb795", new Object[]{this, context, new Boolean(z)});
            return;
        }
        ckf.g(context, "ctx");
        olq.b(context, this.m, z);
    }

    public final boolean h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b25ab373", new Object[]{this, str})).booleanValue();
        }
        if (str == null || str.length() == 0) {
            return false;
        }
        return DXContainerView.isDXUrl(str);
    }

    public final void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29247c64", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public final void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef8887dd", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public final void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabb1c2f", new Object[]{this, str});
        } else {
            this.k = str;
        }
    }

    public final void l(f28 f28Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eb1ccfb", new Object[]{this, f28Var});
        } else {
            this.l = f28Var;
        }
    }

    public final void m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e7a76c1", new Object[]{this, new Integer(i)});
        } else {
            this.j = Integer.valueOf(i);
        }
    }

    public final void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c80f9f9", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public final void o(PopGravity popGravity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc712862", new Object[]{this, popGravity});
        } else {
            this.f = popGravity;
        }
    }

    public final void p(zfm zfmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f56b20c2", new Object[]{this, zfmVar});
        } else {
            this.d = zfmVar;
        }
    }

    public final void q(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fff43450", new Object[]{this, new Float(f)});
        } else {
            this.b = f;
        }
    }

    public final void r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40fb2baf", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public final void s(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1732083", new Object[]{this, num});
        } else {
            this.i = num;
        }
    }

    public final void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else {
            this.f26161a = str;
        }
    }

    public final zao u(Activity activity, Fragment fragment, mlq mlqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zao) ipChange.ipc$dispatch("af2d967e", new Object[]{this, activity, fragment, mlqVar});
        }
        ckf.g(activity, "act");
        ckf.g(fragment, "fragment");
        FragmentContainer fragmentContainer = new FragmentContainer();
        fragmentContainer.p2(fragment);
        wbm d = d(this, activity, null, 2, null).d(this.e);
        if (!TextUtils.isEmpty(this.f26161a)) {
            fragmentContainer.s2(this.f26161a);
            d.i(null);
        }
        fragmentContainer.r2(new b(activity));
        return olq.g(activity, fragmentContainer, d.a(), mlqVar);
    }

    public final void w(Context context, String str, mlq mlqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10b44ae7", new Object[]{this, context, str, mlqVar});
        } else {
            y(this, context, str, mlqVar, null, 8, null);
        }
    }

    public final void x(Context context, String str, mlq mlqVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ad528e9", new Object[]{this, context, str, mlqVar, jSONObject});
            return;
        }
        ckf.g(context, "context");
        ckf.g(str, "url");
        boolean b2 = com.taobao.android.weex.b.d().b(str);
        wbm h = c(context, jSONObject).h(str);
        if (h(str)) {
            z(h, context, str, mlqVar);
            return;
        }
        if (!b2) {
            Intent intentForUri = Nav.from(context).intentForUri(str);
            ckf.f(intentForUri, "Nav.from(context).intentForUri(url)");
            ComponentName component = intentForUri.getComponent();
            if (!ckf.b(component != null ? component.getClassName() : null, "com.taobao.browser.BrowserActivity")) {
                iih.INSTANCE.a("stdPopTag", "showSinglePanel url error: ".concat(str));
                return;
            }
        }
        A(h, context, mlqVar, b2);
    }

    public plq(JSONObject jSONObject) {
        PopGravity popGravity;
        float f = 0.75f;
        this.b = 0.75f;
        this.m = String.valueOf(System.currentTimeMillis());
        if (jSONObject != null) {
            String string = jSONObject.getString("title");
            this.f26161a = string == null ? "" : string;
            Float f2 = jSONObject.getFloat("height");
            this.b = f2 != null ? f2.floatValue() : f;
            JSONObject jSONObject2 = jSONObject.getJSONObject("margins");
            ckf.f(jSONObject2, "it.getJSONObject(\"margins\")");
            Float f3 = jSONObject2.getFloat("left");
            float f4 = 0.0f;
            float floatValue = f3 != null ? f3.floatValue() : 0.0f;
            Float f5 = jSONObject2.getFloat("top");
            float floatValue2 = f5 != null ? f5.floatValue() : 0.0f;
            Float f6 = jSONObject2.getFloat("right");
            float floatValue3 = f6 != null ? f6.floatValue() : 0.0f;
            Float f7 = jSONObject2.getFloat("bottom");
            this.d = new zfm(floatValue, floatValue2, floatValue3, f7 != null ? f7.floatValue() : f4);
            this.k = jSONObject.getString("contentColor");
            String string2 = jSONObject.getString("gravity");
            this.f = (string2 == null || (popGravity = PopGravity.valueOf(string2)) == null) ? PopGravity.BOTTOM : popGravity;
        }
    }

    public final void A(wbm wbmVar, Context context, mlq mlqVar, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b7ab1c9", new Object[]{this, wbmVar, context, mlqVar, new Boolean(z)});
            return;
        }
        n9 n9Var = new n9();
        n9Var.i(context);
        JSONObject jSONObject = new JSONObject(2);
        if (z) {
            str = "showWeex2Pop";
        } else {
            str = StdPopAbility.API_H5;
        }
        jSONObject.put("type", (Object) str);
        jSONObject.put("params", (Object) wbmVar.a());
        xhv xhvVar = xhv.INSTANCE;
        n8 n8Var = new n8(jSONObject);
        k9 k9Var = new k9();
        k9Var.v(new mpt());
        ye2.h(k9Var, new h9(n8Var.h()), n8Var, n9Var, b(mlqVar));
    }

    public final zao v(Context context, View view, mlq mlqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zao) ipChange.ipc$dispatch("e1a77dbe", new Object[]{this, context, view, mlqVar});
        }
        ckf.g(context, "context");
        ckf.g(view, "contentView");
        String str = null;
        wbm d = d(this, context, null, 2, null);
        JSONObject jSONObject = new JSONObject(2);
        jSONObject.put("params", (Object) d.a());
        xhv xhvVar = xhv.INSTANCE;
        n8 n8Var = new n8(jSONObject);
        n9 n9Var = new n9();
        n9Var.i(context);
        k9 k9Var = new k9();
        k9Var.v(new ij0(view));
        c8 h = ye2.h(k9Var, new a9(n8Var.h()), n8Var, n9Var, b(mlqVar));
        zao zaoVar = new zao();
        if (h instanceof b8) {
            b8 b8Var = (b8) h;
            a8 a2 = b8Var.a();
            zaoVar.b = a2 != null ? String.valueOf(a2.a()) : null;
            a8 a3 = b8Var.a();
            if (a3 != null) {
                str = a3.b();
            }
            zaoVar.c = str;
            zaoVar.f32653a = false;
        } else {
            zaoVar.f32653a = true;
        }
        return zaoVar;
    }

    public final void z(wbm wbmVar, Context context, String str, mlq mlqVar) {
        DinamicXEngine a2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c81d27", new Object[]{this, wbmVar, context, str, mlqVar});
            return;
        }
        tk6 tk6Var = new tk6();
        String str2 = this.g;
        if (str2 == null) {
            str2 = "stdPop";
        }
        zq zqVar = new zq(str2, "AbilityKit");
        DinamicXEngine dinamicXEngine = null;
        y7 y7Var = new y7(zqVar, null);
        tk6Var.i(context);
        tk6Var.g(y7Var);
        f28 f28Var = this.l;
        if (!(f28Var == null || (a2 = f28Var.a()) == null)) {
            q9 q9Var = new q9();
            q9Var.b(a2);
            tk6Var.j(q9Var);
        }
        JSONObject jSONObject = new JSONObject(2);
        jSONObject.put("type", (Object) StdPopAbility.API_STD_DX);
        f28 f28Var2 = this.l;
        jSONObject.put("params", (Object) wbmVar.f(f28Var2 != null && f28Var2.d()).a());
        xhv xhvVar = xhv.INSTANCE;
        n8 n8Var = new n8(jSONObject);
        if (abl.m()) {
            k9 k9Var = new k9();
            k9Var.v(new h38());
            p4r p4rVar = new p4r(n8Var.h());
            p18 p18Var = p4rVar.l;
            f28 f28Var3 = this.l;
            if (f28Var3 != null) {
                dinamicXEngine = f28Var3.a();
            }
            if (dinamicXEngine == null) {
                z = false;
            }
            p18Var.i(z);
            ye2.h(k9Var, p4rVar, n8Var, tk6Var, b(mlqVar));
            return;
        }
        Uri parse = Uri.parse(str);
        try {
            wbmVar.c(parse.getQueryParameter("name"), parse.getQueryParameter("version"), parse.getQueryParameter("url"));
        } catch (Exception unused) {
            iih iihVar = iih.INSTANCE;
            iihVar.a("stdPopTag", "showSinglePanel parse dxInfo error: " + str);
            xhv xhvVar2 = xhv.INSTANCE;
        }
        p4r p4rVar2 = new p4r(n8Var.h());
        p18 p18Var2 = p4rVar2.l;
        f28 f28Var4 = this.l;
        p18Var2.g(f28Var4 != null && f28Var4.b());
        p18 p18Var3 = p4rVar2.l;
        f28 f28Var5 = this.l;
        p18Var3.f(f28Var5 != null && f28Var5.e());
        p18 p18Var4 = p4rVar2.l;
        f28 f28Var6 = this.l;
        p18Var4.h(f28Var6 != null && f28Var6.c());
        p18 p18Var5 = p4rVar2.l;
        f28 f28Var7 = this.l;
        if (f28Var7 != null) {
            dinamicXEngine = f28Var7.a();
        }
        if (dinamicXEngine == null) {
            z = false;
        }
        p18Var5.i(z);
        ye2.g(p4rVar2, new q4r(), n8Var, tk6Var, b(mlqVar));
    }

    public /* synthetic */ plq(JSONObject jSONObject, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : jSONObject);
    }
}
