package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.pub.titlebar.PubTitleBar;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class t3n {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final Context f28471a;
    public final PubUserGuideModule b;
    public final JSONObject c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(845152320);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements u8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final b INSTANCE = new b();

        @Override // tb.u8
        public final void callback(String str, c8 c8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc026703", new Object[]{this, str, c8Var});
            } else {
                TMSLogger.f("userActiveIconChangeGuidePopup", ckf.p(str, c8Var));
            }
        }
    }

    static {
        t2o.a(845152319);
    }

    public t3n(Context context, PubUserGuideModule pubUserGuideModule, JSONArray jSONArray) {
        ckf.g(context, "mContext");
        ckf.g(pubUserGuideModule, "mUserGuideModule");
        this.f28471a = context;
        this.b = pubUserGuideModule;
        this.c = pubUserGuideModule.getUserActiveIconChangeGuidePopup();
    }

    public final boolean a() {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebbb9908", new Object[]{this})).booleanValue();
        }
        if (!(this.f28471a instanceof Activity)) {
            return false;
        }
        n9 n9Var = new n9();
        n9Var.i(this.f28471a);
        n9Var.m(((Activity) this.f28471a).getWindow().getDecorView());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "type", "showWeex2Pop");
        JSONObject jSONObject2 = new JSONObject();
        Uri.Builder buildUpon = ies.g(q9s.G3()).buildUpon();
        buildUpon.appendQueryParameter("appName", this.b.getDosaName());
        buildUpon.appendQueryParameter(MspFlybirdDefine.FLYBIRD_DIALOG_LOGO, this.b.getDosaLogo());
        buildUpon.appendQueryParameter("miniappId", this.b.getMiniappId());
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
        xhv xhvVar = xhv.INSTANCE;
        jSONObject2.put((JSONObject) h9.KEY_POP_CONFIG, (String) jSONObject3);
        jSONObject2.put((JSONObject) "popId", this.b.getMiniappId());
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put((JSONObject) "userActiveIconChangeGuidePopup", (String) this.c);
        jSONObject4.put((JSONObject) "popType", PubTitleBar.PUB_GUIDE_USER_ACTIVE_CUSTOM_REPLACE);
        Object expBuckets = this.b.getExpBuckets();
        if (expBuckets == null) {
            expBuckets = new String[0];
        }
        jSONObject4.put((JSONObject) "expBuckets", (String) expBuckets);
        if (((Activity) this.f28471a).getResources().getConfiguration().orientation != 2) {
            z = false;
        }
        jSONObject4.put((JSONObject) "landscape", (String) Boolean.valueOf(z));
        jSONObject2.put((JSONObject) "content", (String) jSONObject4);
        jSONObject.put((JSONObject) "params", (String) jSONObject2);
        new y7().b(new n8(jSONObject), n9Var, b.INSTANCE);
        return false;
    }

    public /* synthetic */ t3n(Context context, PubUserGuideModule pubUserGuideModule, JSONArray jSONArray, int i, a07 a07Var) {
        this(context, pubUserGuideModule, (i & 4) != 0 ? null : jSONArray);
    }
}
