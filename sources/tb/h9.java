package tb;

import android.app.Activity;
import android.app.ActivityGroup;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBAutoSizeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class h9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_LANDSCAPE_DRAWER = "defaultLandscapeDrawer";
    public static final String KEY_BIZ_ID = "bizId";
    public static final String KEY_CONTENT = "content";
    public static final String KEY_EXT_CONFIG = "extConfig";
    public static final String KEY_NAME_SPACE = "namespace";
    public static final String KEY_POP_CONFIG = "popConfig";
    public static final String KEY_POP_ID = "popId";
    public static final String KEY_POP_URL = "url";
    public static final String PAD_FULL_SCREEN_DRAWER = "padFullScreen";

    /* renamed from: a  reason: collision with root package name */
    public e9 f20479a;
    public e9 b;
    public e9 c;
    public final String d;
    public String e;
    public final String f;
    public JSONObject g;
    public final JSONObject h;
    public final JSONObject i;
    public String j;
    public boolean k;

    static {
        t2o.a(336592995);
    }

    public h9(JSONObject jSONObject) {
        this.i = jSONObject;
        this.f20479a = e9.c0(vwf.f(jSONObject, KEY_POP_CONFIG, null));
        String g = vwf.g(jSONObject, "popId", null);
        this.d = g;
        if (TextUtils.isEmpty(g)) {
            this.d = String.valueOf(System.currentTimeMillis());
        }
        String g2 = vwf.g(jSONObject, "url", "");
        this.e = g2;
        this.e = hp6.b(g2, vwf.f(jSONObject, "queryParams", null));
        this.f = vwf.g(jSONObject, "bizId", "");
        this.j = vwf.g(jSONObject, "namespace", null);
        this.g = vwf.f(jSONObject, "content", null);
        this.h = vwf.f(jSONObject, KEY_EXT_CONFIG, null);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("51290782", new Object[]{this});
        }
        return this.e;
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cf36e223", new Object[]{this});
        }
        return this.i;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b2ed0b7", new Object[]{this})).booleanValue();
        }
        if (this.k || "activity".equals(this.f20479a.u())) {
            return true;
        }
        return false;
    }

    public void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f49a788", new Object[]{this, context});
        } else if (this.f20479a.w()) {
            e9 e9Var = this.f20479a;
            this.c = e9Var;
            e9 e9Var2 = (e9) e9Var.clone();
            this.b = e9Var2;
            e9Var2.u0("right|bottom");
            this.b.y0(10000);
            this.b.A0(10000);
            String str = "noAnimation";
            if (!str.equals(this.b.U())) {
                e9 e9Var3 = this.b;
                if (!d() || !this.f20479a.E()) {
                    str = "rightInOut";
                }
                e9Var3.C0(str);
            }
            if (!TextUtils.isEmpty(this.b.O())) {
                e9 e9Var4 = this.b;
                e9Var4.C0(e9Var4.O());
            }
            this.b.o0(0);
            this.b.p0(DEFAULT_LANDSCAPE_DRAWER);
            if ((!d() || !TextUtils.isEmpty(this.e)) && this.f20479a.Q() != 10000) {
                this.b.y0(Math.max(10000 - ((gxv.g(context) * 10000) / Math.min(TBAutoSizeConfig.x().B(context), TBAutoSizeConfig.x().H(context))), this.f20479a.Q()));
            }
            if (!this.b.E() || !this.k) {
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if ((activity.getParent() instanceof ActivityGroup) && "com.taobao.android.tbabilitykit.pop.StdPopActivityGroup".equals(activity.getParent().getClass().getName()) && !d()) {
                        this.b.z0(10000);
                        this.b.B0(10000);
                        return;
                    }
                }
                if (this.f20479a.Q() == 10000 && this.f20479a.R() == 10000 && !this.b.s()) {
                    this.b.y0(this.f20479a.Q());
                    this.b.A0(this.f20479a.S());
                    this.b.p0("");
                    this.b.C0(this.f20479a.U());
                    this.b.u0(this.f20479a.N());
                } else if (!this.b.f0() || this.b.s()) {
                    this.b.z0(5000);
                    this.b.B0(5000);
                } else {
                    this.b.y0(this.f20479a.Q());
                    this.b.A0(this.f20479a.S());
                    this.b.p0("");
                    this.b.C0(this.f20479a.U());
                    this.b.u0(this.f20479a.N());
                }
            } else {
                this.b.z0(10000);
                this.b.B0(10000);
            }
        }
    }

    public void e(boolean z, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14b52d1a", new Object[]{this, new Boolean(z), context});
            return;
        }
        iih iihVar = iih.INSTANCE;
        iihVar.a("stdPopTag", "switchPopConfig isPortrait = " + z);
        if (z) {
            e9 e9Var = this.c;
            if (e9Var != null) {
                this.f20479a = e9Var;
            }
        } else if (gxv.m(context, false)) {
            e9 e9Var2 = this.b;
            if (e9Var2 != null) {
                this.f20479a = e9Var2;
            }
        } else {
            e9 e9Var3 = this.c;
            if (e9Var3 != null) {
                this.f20479a = e9Var3;
            }
        }
    }
}
