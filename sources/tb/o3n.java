package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.widget.PopupWindow;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class o3n {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final Context f25126a;
    public final JSONObject b;
    public volatile boolean c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(845152318);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(845152316);
    }

    public o3n(Context context, JSONObject jSONObject) {
        ckf.g(context, "mContext");
        this.f25126a = context;
        this.b = jSONObject;
        new PopupWindow(context);
    }

    public final void a(String str, String str2) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("861cb3fd", new Object[]{this, str, str2});
            return;
        }
        JSONObject jSONObject = this.b;
        JSONObject jSONObject2 = jSONObject == null ? null : jSONObject.getJSONObject("userFatigueModel");
        int intValue = jSONObject2 == null ? 0 : jSONObject2.getIntValue("fatigueDayValue");
        if (jSONObject2 != null) {
            i = jSONObject2.getIntValue("fatigueCountValue");
        }
        r3n.a(this.f25126a, "revisitPopupByReturn", null, new q3n(str2, intValue, i), null);
    }

    public final boolean e(String str, String str2) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a90e5c0", new Object[]{this, str, str2})).booleanValue();
        }
        JSONObject jSONObject = this.b;
        JSONObject jSONObject2 = jSONObject == null ? null : jSONObject.getJSONObject("userFatigueModel");
        int intValue = jSONObject2 == null ? 0 : jSONObject2.getIntValue("fatigueDayValue");
        if (jSONObject2 != null) {
            i = jSONObject2.getIntValue("fatigueCountValue");
        }
        return r3n.d(this.f25126a, "revisitPopupByReturn", null, new q3n(str2, intValue, i), null);
    }

    public final boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eb5780c", new Object[]{this, str, str2})).booleanValue();
        }
        ckf.g(str, "appId");
        ckf.g(str2, "userId");
        Context context = this.f25126a;
        if (!(context instanceof Activity) || ((Activity) context).isFinishing()) {
            TMSLogger.b("revisitPopupByReturn", "environment illegality");
            return false;
        } else if (this.b == null) {
            TMSLogger.b("revisitPopupByReturn", "mRevisitGuideModel is null");
            return false;
        } else if (this.c) {
            TMSLogger.b("revisitPopupByReturn", "has displayed");
            return false;
        } else if (!e(str, str2)) {
            return true;
        } else {
            TMSLogger.b("revisitPopupByReturn", "Beyond fatigue");
            return false;
        }
    }

    public final boolean d(String str, String str2, String str3, String str4, String str5, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a2fa9a9", new Object[]{this, str, str2, str3, str4, str5, u8Var})).booleanValue();
        }
        ckf.g(str, "appId");
        ckf.g(str2, "userId");
        if (!q9s.m2() || !b(str, str2)) {
            return false;
        }
        boolean c = c(str3, str4, str5, u8Var);
        if (c) {
            this.c = true;
            a(str, str2);
        }
        return c;
    }

    public final boolean c(String str, String str2, String str3, u8 u8Var) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("284646e5", new Object[]{this, str, str2, str3, u8Var})).booleanValue();
        }
        if (!(this.f25126a instanceof Activity)) {
            return false;
        }
        n9 n9Var = new n9();
        n9Var.i(this.f25126a);
        n9Var.m(((Activity) this.f25126a).getWindow().getDecorView());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "type", "showWeex2Pop");
        JSONObject jSONObject2 = new JSONObject();
        Uri.Builder buildUpon = ies.g(q9s.INSTANCE.H3()).buildUpon();
        buildUpon.appendQueryParameter("appName", str);
        buildUpon.appendQueryParameter(MspFlybirdDefine.FLYBIRD_DIALOG_LOGO, str2);
        buildUpon.appendQueryParameter("miniappId", str3);
        jSONObject2.put((JSONObject) "url", (String) buildUpon.build());
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put((JSONObject) "gravity", "center");
        Boolean bool = Boolean.TRUE;
        jSONObject3.put((JSONObject) "tapEnable", (String) bool);
        jSONObject3.put((JSONObject) "pushType", "outterJump");
        jSONObject3.put((JSONObject) "maxHeight", (String) 1);
        jSONObject3.put((JSONObject) "originHeight", (String) 1);
        jSONObject3.put((JSONObject) "useViewMode", (String) bool);
        jSONObject3.put((JSONObject) "animation", nbf.STDPOP_ANIMATION_BOTTOM);
        jSONObject3.put((JSONObject) hij.KEY_CORNER_RADIUS, (String) Float.valueOf(0.0f));
        jSONObject3.put((JSONObject) "shouldBlockClose", (String) bool);
        jSONObject2.put((JSONObject) h9.KEY_POP_CONFIG, (String) jSONObject3);
        jSONObject2.put((JSONObject) "popId", str3);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put((JSONObject) "beforeBackRevisitEducation", (String) this.b);
        jSONObject4.put((JSONObject) "popType", "beforeBackRevisitEducation");
        if (((Activity) this.f25126a).getResources().getConfiguration().orientation == 2) {
            z = true;
        }
        jSONObject4.put((JSONObject) "landscape", (String) Boolean.valueOf(z));
        jSONObject2.put((JSONObject) "content", (String) jSONObject4);
        xhv xhvVar = xhv.INSTANCE;
        jSONObject.put((JSONObject) "params", (String) jSONObject2);
        new y7().b(new n8(jSONObject), n9Var, u8Var);
        return true;
    }
}
