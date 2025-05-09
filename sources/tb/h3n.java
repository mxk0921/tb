package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.pub_kit.guide.model.PubPropertiesFatigueModel;
import com.taobao.themis.pub_kit.guide.model.PubPropertiesModel;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class h3n {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final Context f20394a;
    public final PubUserGuideModule b;
    public volatile boolean c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(845152301);
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
                TMSLogger.f("operateGuide", ckf.p(str, c8Var));
            }
        }
    }

    static {
        t2o.a(845152300);
    }

    public h3n(Context context, PubUserGuideModule pubUserGuideModule) {
        ckf.g(context, "mContext");
        ckf.g(pubUserGuideModule, "mUserGuideModule");
        this.f20394a = context;
        this.b = pubUserGuideModule;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f3be536", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public final void a(String str, String str2) {
        PubPropertiesFatigueModel operateGuideBizFatigueConfig;
        String fatigueCountValue;
        PubPropertiesFatigueModel operateGuideBizFatigueConfig2;
        String fatigueDayValue;
        PubPropertiesFatigueModel operateGuideUserFatigueConfig;
        String fatigueCountValue2;
        PubPropertiesFatigueModel operateGuideUserFatigueConfig2;
        String fatigueDayValue2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("861cb3fd", new Object[]{this, str, str2});
            return;
        }
        PubPropertiesModel properties = this.b.getProperties();
        int parseInt = (properties == null || (operateGuideUserFatigueConfig2 = properties.getOperateGuideUserFatigueConfig()) == null || (fatigueDayValue2 = operateGuideUserFatigueConfig2.getFatigueDayValue()) == null) ? 0 : Integer.parseInt(fatigueDayValue2);
        int parseInt2 = (properties == null || (operateGuideUserFatigueConfig = properties.getOperateGuideUserFatigueConfig()) == null || (fatigueCountValue2 = operateGuideUserFatigueConfig.getFatigueCountValue()) == null) ? 0 : Integer.parseInt(fatigueCountValue2);
        int parseInt3 = (properties == null || (operateGuideBizFatigueConfig2 = properties.getOperateGuideBizFatigueConfig()) == null || (fatigueDayValue = operateGuideBizFatigueConfig2.getFatigueDayValue()) == null) ? 0 : Integer.parseInt(fatigueDayValue);
        if (!(properties == null || (operateGuideBizFatigueConfig = properties.getOperateGuideBizFatigueConfig()) == null || (fatigueCountValue = operateGuideBizFatigueConfig.getFatigueCountValue()) == null)) {
            i = Integer.parseInt(fatigueCountValue);
        }
        IpChange ipChange2 = r3n.$ipChange;
        r3n.b(this.f20394a, "operateGuide", new q3n(str, parseInt3, i), new q3n(str2, parseInt, parseInt2), null, 16, null);
    }

    public final boolean e(String str, String str2) {
        PubPropertiesFatigueModel operateGuideBizFatigueConfig;
        String fatigueCountValue;
        PubPropertiesFatigueModel operateGuideBizFatigueConfig2;
        String fatigueDayValue;
        PubPropertiesFatigueModel operateGuideUserFatigueConfig;
        String fatigueCountValue2;
        PubPropertiesFatigueModel operateGuideUserFatigueConfig2;
        String fatigueDayValue2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a90e5c0", new Object[]{this, str, str2})).booleanValue();
        }
        PubPropertiesModel properties = this.b.getProperties();
        int parseInt = (properties == null || (operateGuideUserFatigueConfig2 = properties.getOperateGuideUserFatigueConfig()) == null || (fatigueDayValue2 = operateGuideUserFatigueConfig2.getFatigueDayValue()) == null) ? 0 : Integer.parseInt(fatigueDayValue2);
        int parseInt2 = (properties == null || (operateGuideUserFatigueConfig = properties.getOperateGuideUserFatigueConfig()) == null || (fatigueCountValue2 = operateGuideUserFatigueConfig.getFatigueCountValue()) == null) ? 0 : Integer.parseInt(fatigueCountValue2);
        int parseInt3 = (properties == null || (operateGuideBizFatigueConfig2 = properties.getOperateGuideBizFatigueConfig()) == null || (fatigueDayValue = operateGuideBizFatigueConfig2.getFatigueDayValue()) == null) ? 0 : Integer.parseInt(fatigueDayValue);
        if (!(properties == null || (operateGuideBizFatigueConfig = properties.getOperateGuideBizFatigueConfig()) == null || (fatigueCountValue = operateGuideBizFatigueConfig.getFatigueCountValue()) == null)) {
            i = Integer.parseInt(fatigueCountValue);
        }
        IpChange ipChange2 = r3n.$ipChange;
        return r3n.e(this.f20394a, "operateGuide", new q3n(str, parseInt3, i), new q3n(str2, parseInt, parseInt2), null, 16, null);
    }

    public final boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eb5780c", new Object[]{this, str, str2})).booleanValue();
        }
        ckf.g(str, "appId");
        ckf.g(str2, "userId");
        Context context = this.f20394a;
        if (!(context instanceof Activity) || ((Activity) context).isFinishing()) {
            TMSLogger.b("operateGuide", "context is not Activity or context is Finishing");
            return false;
        } else if (!q9s.X1()) {
            TMSLogger.b("operateGuide", "开关关闭");
            return false;
        } else if (this.c) {
            TMSLogger.b("operateGuide", "has displayed");
            return false;
        } else if (!e(str, str2)) {
            return true;
        } else {
            TMSLogger.b("operateGuide", "疲劳度受限");
            return false;
        }
    }

    public final boolean d(String str, String str2, int i, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11b80a69", new Object[]{this, str, str2, new Integer(i), jSONObject})).booleanValue();
        }
        ckf.g(str, "appId");
        ckf.g(str2, "userId");
        if (!b(str, str2)) {
            return false;
        }
        this.c = true;
        n9 n9Var = new n9();
        n9Var.i(this.f20394a);
        n9Var.m(((Activity) this.f20394a).getWindow().getDecorView());
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put((JSONObject) "type", "showWeex2Pop");
        JSONObject jSONObject5 = new JSONObject();
        Uri.Builder buildUpon = ies.g(q9s.C3()).buildUpon();
        buildUpon.appendQueryParameter("miniappId", this.b.getMiniappId());
        jSONObject5.put((JSONObject) "url", (String) buildUpon.build());
        JSONObject jSONObject6 = new JSONObject();
        jSONObject6.put((JSONObject) "gravity", "center");
        Boolean bool = Boolean.TRUE;
        jSONObject6.put((JSONObject) "tapEnable", (String) bool);
        jSONObject6.put((JSONObject) "pushType", "outterJump");
        jSONObject6.put((JSONObject) "maxHeight", (String) 1);
        jSONObject6.put((JSONObject) "originHeight", (String) 1);
        jSONObject6.put((JSONObject) "useViewMode", (String) bool);
        jSONObject6.put((JSONObject) hij.KEY_CORNER_RADIUS, (String) Float.valueOf(0.0f));
        xhv xhvVar = xhv.INSTANCE;
        jSONObject5.put((JSONObject) h9.KEY_POP_CONFIG, (String) jSONObject6);
        jSONObject5.put((JSONObject) "popId", this.b.getMiniappId());
        JSONObject jSONObject7 = new JSONObject();
        jSONObject7.put((JSONObject) "type", (String) Integer.valueOf(i));
        Object expBuckets = this.b.getExpBuckets();
        if (expBuckets == null) {
            expBuckets = new String[0];
        }
        jSONObject7.put((JSONObject) "expBuckets", (String) expBuckets);
        if (((Activity) this.f20394a).getResources().getConfiguration().orientation == 2) {
            z = true;
        }
        jSONObject7.put((JSONObject) "landscape", (String) Boolean.valueOf(z));
        if (!(jSONObject == null || (jSONObject3 = jSONObject.getJSONObject("backHomeFrame")) == null)) {
            jSONObject7.put((JSONObject) "backHomeFrame", (String) jSONObject3);
        }
        if (!(jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("addIconFrame")) == null)) {
            jSONObject7.put((JSONObject) "addIconFrame", (String) jSONObject2);
        }
        jSONObject5.put((JSONObject) "content", (String) jSONObject7);
        jSONObject4.put((JSONObject) "params", (String) jSONObject5);
        new y7().b(new n8(jSONObject4), n9Var, b.INSTANCE);
        a(str, str2);
        return true;
    }
}
