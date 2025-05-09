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
import com.taobao.themis.pub_kit.guide.model.PubIconChangeGuidePopupModel;
import com.taobao.themis.pub_kit.guide.model.PubPropertiesFatigueModel;
import com.taobao.themis.pub_kit.guide.model.PubPropertiesModel;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class n3n {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final Context f24487a;
    public final PubUserGuideModule b;
    public final JSONObject c;
    public final String d;
    public final PubIconChangeGuidePopupModel e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(845152307);
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
                TMSLogger.f("iconChangeGuidePopup", ckf.p(str, c8Var));
            }
        }
    }

    static {
        t2o.a(845152306);
    }

    public n3n(Context context, PubUserGuideModule pubUserGuideModule, JSONArray jSONArray, JSONObject jSONObject, String str) {
        ckf.g(context, "mContext");
        ckf.g(pubUserGuideModule, "mUserGuideModule");
        ckf.g(str, "mTraceId");
        this.f24487a = context;
        this.b = pubUserGuideModule;
        this.c = jSONObject;
        this.d = str;
        this.e = pubUserGuideModule.getIconChangeGuidePopup();
    }

    public final void a(String str, String str2) {
        int i;
        int i2;
        int i3;
        int i4;
        q3n q3nVar;
        PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig;
        List<String> range;
        int i5;
        String fatigueCountValue;
        String fatigueDayValue;
        Map<String, String> bizFatigueModel;
        String str3;
        Map<String, String> bizFatigueModel2;
        String str4;
        Map<String, String> userFatigueModel;
        String str5;
        Map<String, String> userFatigueModel2;
        String str6;
        int i6 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("861cb3fd", new Object[]{this, str, str2});
            return;
        }
        PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel = this.e;
        if (pubIconChangeGuidePopupModel == null || (userFatigueModel2 = pubIconChangeGuidePopupModel.getUserFatigueModel()) == null || (str6 = userFatigueModel2.get("backFatigueDayValue")) == null) {
            i = 0;
        } else {
            i = Integer.parseInt(str6);
        }
        PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel2 = this.e;
        if (pubIconChangeGuidePopupModel2 == null || (userFatigueModel = pubIconChangeGuidePopupModel2.getUserFatigueModel()) == null || (str5 = userFatigueModel.get("backFatigueCountValue")) == null) {
            i2 = 0;
        } else {
            i2 = Integer.parseInt(str5);
        }
        PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel3 = this.e;
        if (pubIconChangeGuidePopupModel3 == null || (bizFatigueModel2 = pubIconChangeGuidePopupModel3.getBizFatigueModel()) == null || (str4 = bizFatigueModel2.get("backFatigueDayValue")) == null) {
            i3 = 0;
        } else {
            i3 = Integer.parseInt(str4);
        }
        PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel4 = this.e;
        if (pubIconChangeGuidePopupModel4 == null || (bizFatigueModel = pubIconChangeGuidePopupModel4.getBizFatigueModel()) == null || (str3 = bizFatigueModel.get("backFatigueCountValue")) == null) {
            i4 = 0;
        } else {
            i4 = Integer.parseInt(str3);
        }
        PubPropertiesModel properties = this.b.getProperties();
        if (properties == null || (totalGuidePopupUserFatigueConfig = properties.getTotalGuidePopupUserFatigueConfig()) == null || (range = totalGuidePopupUserFatigueConfig.getRange()) == null || !range.contains("iconChangeGuidePopup")) {
            q3nVar = null;
        } else {
            PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig2 = properties.getTotalGuidePopupUserFatigueConfig();
            if (totalGuidePopupUserFatigueConfig2 == null || (fatigueDayValue = totalGuidePopupUserFatigueConfig2.getFatigueDayValue()) == null) {
                i5 = 0;
            } else {
                i5 = Integer.parseInt(fatigueDayValue);
            }
            PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig3 = properties.getTotalGuidePopupUserFatigueConfig();
            if (!(totalGuidePopupUserFatigueConfig3 == null || (fatigueCountValue = totalGuidePopupUserFatigueConfig3.getFatigueCountValue()) == null)) {
                i6 = Integer.parseInt(fatigueCountValue);
            }
            q3nVar = new q3n(str2, i5, i6);
        }
        IpChange ipChange2 = r3n.$ipChange;
        r3n.a(this.f24487a, "iconChangeGuidePopup", new q3n(str, i3, i4), new q3n(str2, i, i2), q3nVar);
    }

    public final boolean d(String str, String str2) {
        int i;
        int i2;
        int i3;
        int i4;
        q3n q3nVar;
        PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig;
        List<String> range;
        int i5;
        String fatigueCountValue;
        String fatigueDayValue;
        Map<String, String> bizFatigueModel;
        String str3;
        Map<String, String> bizFatigueModel2;
        String str4;
        Map<String, String> userFatigueModel;
        String str5;
        Map<String, String> userFatigueModel2;
        String str6;
        int i6 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a90e5c0", new Object[]{this, str, str2})).booleanValue();
        }
        PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel = this.e;
        if (pubIconChangeGuidePopupModel == null || (userFatigueModel2 = pubIconChangeGuidePopupModel.getUserFatigueModel()) == null || (str6 = userFatigueModel2.get("backFatigueDayValue")) == null) {
            i = 0;
        } else {
            i = Integer.parseInt(str6);
        }
        PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel2 = this.e;
        if (pubIconChangeGuidePopupModel2 == null || (userFatigueModel = pubIconChangeGuidePopupModel2.getUserFatigueModel()) == null || (str5 = userFatigueModel.get("backFatigueCountValue")) == null) {
            i2 = 0;
        } else {
            i2 = Integer.parseInt(str5);
        }
        PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel3 = this.e;
        if (pubIconChangeGuidePopupModel3 == null || (bizFatigueModel2 = pubIconChangeGuidePopupModel3.getBizFatigueModel()) == null || (str4 = bizFatigueModel2.get("backFatigueDayValue")) == null) {
            i3 = 0;
        } else {
            i3 = Integer.parseInt(str4);
        }
        PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel4 = this.e;
        if (pubIconChangeGuidePopupModel4 == null || (bizFatigueModel = pubIconChangeGuidePopupModel4.getBizFatigueModel()) == null || (str3 = bizFatigueModel.get("backFatigueCountValue")) == null) {
            i4 = 0;
        } else {
            i4 = Integer.parseInt(str3);
        }
        PubPropertiesModel properties = this.b.getProperties();
        if (properties == null || (totalGuidePopupUserFatigueConfig = properties.getTotalGuidePopupUserFatigueConfig()) == null || (range = totalGuidePopupUserFatigueConfig.getRange()) == null || !range.contains("iconChangeGuidePopup")) {
            q3nVar = null;
        } else {
            PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig2 = properties.getTotalGuidePopupUserFatigueConfig();
            if (totalGuidePopupUserFatigueConfig2 == null || (fatigueDayValue = totalGuidePopupUserFatigueConfig2.getFatigueDayValue()) == null) {
                i5 = 0;
            } else {
                i5 = Integer.parseInt(fatigueDayValue);
            }
            PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig3 = properties.getTotalGuidePopupUserFatigueConfig();
            if (!(totalGuidePopupUserFatigueConfig3 == null || (fatigueCountValue = totalGuidePopupUserFatigueConfig3.getFatigueCountValue()) == null)) {
                i6 = Integer.parseInt(fatigueCountValue);
            }
            q3nVar = new q3n(str2, i5, i6);
        }
        IpChange ipChange2 = r3n.$ipChange;
        return r3n.d(this.f24487a, "iconChangeGuidePopup", new q3n(str, i3, i4), new q3n(str2, i, i2), q3nVar);
    }

    public final boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eb5780c", new Object[]{this, str, str2})).booleanValue();
        }
        ckf.g(str, "appId");
        ckf.g(str2, "userId");
        Context context = this.f24487a;
        if (!(context instanceof Activity) || ((Activity) context).isFinishing()) {
            TMSLogger.b("iconChangeGuidePopup", "environment illegality");
            return false;
        } else if (!d(str, str2)) {
            return true;
        } else {
            TMSLogger.b("iconChangeGuidePopup", "疲劳度受限");
            return false;
        }
    }

    public final boolean c(String str, String str2) {
        PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6a59c1c", new Object[]{this, str, str2})).booleanValue();
        }
        ckf.g(str, "appId");
        ckf.g(str2, "userId");
        if (!(this.f24487a instanceof Activity) || !b(str, str2) || (pubIconChangeGuidePopupModel = this.e) == null) {
            return false;
        }
        n9 n9Var = new n9();
        n9Var.i(this.f24487a);
        n9Var.m(((Activity) this.f24487a).getWindow().getDecorView());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "type", "showWeex2Pop");
        JSONObject jSONObject2 = new JSONObject();
        Uri.Builder buildUpon = ies.g(q9s.D3()).buildUpon();
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
        JSONObject jSONObject5 = new JSONObject();
        JSONObject newPopupData = pubIconChangeGuidePopupModel.getNewPopupData();
        Object obj = null;
        jSONObject5.put((JSONObject) "guidePopTitle", (String) (newPopupData == null ? null : newPopupData.get("strongGuidePopTitle")));
        JSONObject newPopupData2 = pubIconChangeGuidePopupModel.getNewPopupData();
        jSONObject5.put((JSONObject) "guidePopDesc", (String) (newPopupData2 == null ? null : newPopupData2.get("strongGuidePopDesc")));
        JSONObject newPopupData3 = pubIconChangeGuidePopupModel.getNewPopupData();
        jSONObject5.put((JSONObject) "successFloatWindowTitle", (String) (newPopupData3 == null ? null : newPopupData3.get("successFloatWindowTitle")));
        JSONObject newPopupData4 = pubIconChangeGuidePopupModel.getNewPopupData();
        jSONObject5.put((JSONObject) "successFloatWindowSubTitle", (String) (newPopupData4 == null ? null : newPopupData4.get("successFloatWindowSubTitle")));
        JSONObject newPopupData5 = pubIconChangeGuidePopupModel.getNewPopupData();
        jSONObject5.put((JSONObject) "successFloatWindowImage", (String) (newPopupData5 == null ? null : newPopupData5.get("successFloatWindowImage")));
        JSONObject newPopupData6 = pubIconChangeGuidePopupModel.getNewPopupData();
        if (newPopupData6 != null) {
            obj = newPopupData6.get("successFloatWindowsingleRawImage");
        }
        jSONObject5.put((JSONObject) "successFloatWindowSingleRawImage", (String) obj);
        jSONObject4.put((JSONObject) "recommendIconChangeGuidePopup", (String) jSONObject5);
        JSONObject jSONObject6 = this.c;
        if (jSONObject6 != null) {
            jSONObject4.put((JSONObject) "revisitIdentifyData", (String) jSONObject6);
        }
        jSONObject4.put((JSONObject) "popType", PubTitleBar.PUB_GUIDE_RECOMMEND_CUSTOM_REPLACE);
        Object expBuckets = this.b.getExpBuckets();
        if (expBuckets == null) {
            expBuckets = new String[0];
        }
        jSONObject4.put((JSONObject) "expBuckets", (String) expBuckets);
        if (((Activity) this.f24487a).getResources().getConfiguration().orientation != 2) {
            z = false;
        }
        jSONObject4.put((JSONObject) "landscape", (String) Boolean.valueOf(z));
        jSONObject2.put((JSONObject) "content", (String) jSONObject4);
        jSONObject.put((JSONObject) "params", (String) jSONObject2);
        String str3 = this.d;
        String d = mcs.d(str3);
        JSONObject jSONObject7 = new JSONObject();
        jSONObject7.put((JSONObject) "inputJson", (String) jSONObject);
        mcs.b("PubRecommendClient", mcs.EVENT_ON_SUCCESS, str3, d, jSONObject7);
        new y7().b(new n8(jSONObject), n9Var, b.INSTANCE);
        a(str, str2);
        return false;
    }
}
