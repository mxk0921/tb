package com.taobao.themis.pub_kit.guide;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.utils.CommonExtKt;
import com.taobao.themis.pub_kit.guide.model.PubIconChangeGuidePopupModel;
import com.taobao.themis.pub_kit.guide.model.PubPropertiesFatigueModel;
import com.taobao.themis.pub_kit.guide.model.PubPropertiesModel;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import tb.a07;
import tb.ckf;
import tb.h9;
import tb.n9;
import tb.nbf;
import tb.ner;
import tb.q3n;
import tb.q9s;
import tb.r3n;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class PubIconChangeGuide {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final Context f13725a;
    public final PubUserGuideModule b;
    public final JSONArray c;
    public volatile boolean d;
    public final PubIconChangeGuidePopupModel e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/pub_kit/guide/PubIconChangeGuide$PubIconChangeGuideType;", "", "(Ljava/lang/String;I)V", "ICON_CHANGE_STRONG_GUIDE", "ICON_CHANGE_STRONG_GUIDE_API", "themis_pub_kit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class PubIconChangeGuideType extends Enum<PubIconChangeGuideType> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final PubIconChangeGuideType ICON_CHANGE_STRONG_GUIDE = new PubIconChangeGuideType("ICON_CHANGE_STRONG_GUIDE", 0);
        public static final PubIconChangeGuideType ICON_CHANGE_STRONG_GUIDE_API = new PubIconChangeGuideType("ICON_CHANGE_STRONG_GUIDE_API", 1);
        private static final /* synthetic */ PubIconChangeGuideType[] $VALUES = $values();

        private static final /* synthetic */ PubIconChangeGuideType[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (PubIconChangeGuideType[]) ipChange.ipc$dispatch("cc3fdd9b", new Object[0]) : new PubIconChangeGuideType[]{ICON_CHANGE_STRONG_GUIDE, ICON_CHANGE_STRONG_GUIDE_API};
        }

        private PubIconChangeGuideType(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(PubIconChangeGuideType pubIconChangeGuideType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub_kit/guide/PubIconChangeGuide$PubIconChangeGuideType");
        }

        public static PubIconChangeGuideType valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("a6662050", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(PubIconChangeGuideType.class, str);
            }
            return (PubIconChangeGuideType) valueOf;
        }

        public static PubIconChangeGuideType[] values() {
            Object clone;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                clone = ipChange.ipc$dispatch("1927f3f", new Object[0]);
            } else {
                clone = $VALUES.clone();
            }
            return (PubIconChangeGuideType[]) clone;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(845152294);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f13726a;
        public final String b;

        static {
            t2o.a(845152296);
        }

        public b(int i, String str) {
            ckf.g(str, "msg");
            this.f13726a = i;
            this.b = str;
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("480bb15d", new Object[]{this})).intValue();
            }
            return this.f13726a;
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a817838e", new Object[]{this});
            }
            return this.b;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f13726a == bVar.f13726a && ckf.b(this.b, bVar.b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return (this.f13726a * 31) + this.b.hashCode();
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "ShowIconChangeGuideResult(code=" + this.f13726a + ", msg=" + this.b + ')';
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(845152297);
            int[] iArr = new int[PubIconChangeGuideType.values().length];
            iArr[PubIconChangeGuideType.ICON_CHANGE_STRONG_GUIDE.ordinal()] = 1;
            iArr[PubIconChangeGuideType.ICON_CHANGE_STRONG_GUIDE_API.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        t2o.a(845152293);
    }

    public PubIconChangeGuide(Context context, PubUserGuideModule pubUserGuideModule, JSONArray jSONArray) {
        ckf.g(context, "mContext");
        ckf.g(pubUserGuideModule, "mUserGuideModel");
        this.f13725a = context;
        this.b = pubUserGuideModule;
        this.c = jSONArray;
        this.e = pubUserGuideModule.getIconChangeGuidePopup();
    }

    public static final /* synthetic */ Context a(PubIconChangeGuide pubIconChangeGuide) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("6e79e3f8", new Object[]{pubIconChangeGuide});
        }
        return pubIconChangeGuide.f13725a;
    }

    public static /* synthetic */ b g(PubIconChangeGuide pubIconChangeGuide, PubIconChangeGuideType pubIconChangeGuideType, String str, String str2, int i, String str3, String str4, int i2, Object obj) {
        String str5;
        String str6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("933cd90f", new Object[]{pubIconChangeGuide, pubIconChangeGuideType, str, str2, new Integer(i), str3, str4, new Integer(i2), obj});
        }
        if ((i2 & 16) != 0) {
            str5 = null;
        } else {
            str5 = str3;
        }
        if ((i2 & 32) != 0) {
            str6 = null;
        } else {
            str6 = str4;
        }
        return pubIconChangeGuide.f(pubIconChangeGuideType, str, str2, i, str5, str6);
    }

    public final void b(String str, String str2) {
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
        r3n.a(this.f13725a, "iconChangeGuidePopup", new q3n(str, i3, i4), new q3n(str2, i, i2), q3nVar);
    }

    public final String e(String str, String str2, String str3, int i, String str4, String str5, String str6, JSONObject jSONObject) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e40620d", new Object[]{this, str, str2, str3, new Integer(i), str4, str5, str6, jSONObject});
        }
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null) {
            return null;
        }
        Uri.Builder buildUpon = parse.buildUpon();
        if (!TextUtils.isEmpty(str2)) {
            buildUpon = buildUpon.appendQueryParameter("appName", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            buildUpon = buildUpon.appendQueryParameter("miniappId", str3);
        }
        Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("guideType", String.valueOf(i));
        if (!TextUtils.isEmpty(str4)) {
            appendQueryParameter = appendQueryParameter.appendQueryParameter("icon", str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            appendQueryParameter = appendQueryParameter.appendQueryParameter("strongGuidePopTitle", str5);
        }
        if (!TextUtils.isEmpty(str6)) {
            appendQueryParameter = appendQueryParameter.appendQueryParameter("strongGuidePopDesc", str6);
        }
        if (jSONObject != null) {
            appendQueryParameter = appendQueryParameter.appendQueryParameter("newPopupData", jSONObject.toJSONString());
        }
        return appendQueryParameter.appendQueryParameter("isNewMiniAppReplace", "true").build().toString();
    }

    public final b h(String str, int i, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("f887c31a", new Object[]{this, str, new Integer(i), str2, str3});
        }
        TMSLogger.f("iconChangeGuidePopup", "showICONChangeStrongGuideByAPI");
        PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel = this.e;
        String str4 = null;
        String icon = pubIconChangeGuidePopupModel == null ? null : pubIconChangeGuidePopupModel.getIcon();
        PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel2 = this.e;
        if (pubIconChangeGuidePopupModel2 != null) {
            str4 = pubIconChangeGuidePopupModel2.getName();
        }
        return d(str4, str, i, icon, str2, str3, null);
    }

    public final boolean j(String str, String str2) {
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
        return r3n.d(this.f13725a, "iconChangeGuidePopup", new q3n(str, i3, i4), new q3n(str2, i, i2), q3nVar);
    }

    public final b c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("aa1649f4", new Object[]{this, str, str2});
        }
        ckf.g(str, "appId");
        ckf.g(str2, "userId");
        Context context = this.f13725a;
        if (!(context instanceof Activity) || ((Activity) context).isFinishing()) {
            TMSLogger.b("iconChangeGuidePopup", "environment illegality");
            return new b(4, "environment illegality");
        } else if (this.d) {
            TMSLogger.b("iconChangeGuidePopup", "已展示过添加Icon弹窗");
            return new b(100, "已展示过添加Icon弹窗");
        } else if (!j(str, str2)) {
            return new b(0, "success");
        } else {
            TMSLogger.b("iconChangeGuidePopup", "疲劳度受限");
            return new b(101, "疲劳度受限");
        }
    }

    public final b f(PubIconChangeGuideType pubIconChangeGuideType, String str, String str2, int i, String str3, String str4) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("d7d2763c", new Object[]{this, pubIconChangeGuideType, str, str2, new Integer(i), str3, str4});
        }
        ckf.g(pubIconChangeGuideType, "type");
        ckf.g(str, "userId");
        ckf.g(str2, "appId");
        b c2 = c(str2, str);
        if (c2.a() != 0) {
            return c2;
        }
        int i2 = c.$EnumSwitchMapping$0[pubIconChangeGuideType.ordinal()];
        if (i2 == 1) {
            bVar = i(str2);
        } else if (i2 == 2) {
            bVar = h(str2, i, str3, str4);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (bVar.a() == 0) {
            this.d = true;
            b(str2, str);
        }
        return bVar;
    }

    public final b i(String str) {
        String guideType;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("adbfac40", new Object[]{this, str});
        }
        TMSLogger.f("iconChangeGuidePopup", "showICONChangeStrongGuideByContainer");
        PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel = this.e;
        JSONObject jSONObject = null;
        String icon = pubIconChangeGuidePopupModel == null ? null : pubIconChangeGuidePopupModel.getIcon();
        PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel2 = this.e;
        String name = pubIconChangeGuidePopupModel2 == null ? null : pubIconChangeGuidePopupModel2.getName();
        PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel3 = this.e;
        String strongGuidePopTitle = pubIconChangeGuidePopupModel3 == null ? null : pubIconChangeGuidePopupModel3.getStrongGuidePopTitle();
        PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel4 = this.e;
        String strongGuidePopDesc = pubIconChangeGuidePopupModel4 == null ? null : pubIconChangeGuidePopupModel4.getStrongGuidePopDesc();
        try {
            PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel5 = this.e;
            if (!(pubIconChangeGuidePopupModel5 == null || (guideType = pubIconChangeGuidePopupModel5.getGuideType()) == null)) {
                i = Integer.parseInt(guideType);
            }
            PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel6 = this.e;
            if (pubIconChangeGuidePopupModel6 != null) {
                jSONObject = pubIconChangeGuidePopupModel6.getNewPopupData();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (i >= 2) {
            return d(name, str, i, icon, strongGuidePopTitle, strongGuidePopDesc, jSONObject);
        }
        TMSLogger.b("iconChangeGuidePopup", "参数有误");
        return new b(2, "参数有误");
    }

    public /* synthetic */ PubIconChangeGuide(Context context, PubUserGuideModule pubUserGuideModule, JSONArray jSONArray, int i, a07 a07Var) {
        this(context, pubUserGuideModule, (i & 4) != 0 ? null : jSONArray);
    }

    public final b d(String str, String str2, int i, String str3, String str4, String str5, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("44a449fe", new Object[]{this, str, str2, new Integer(i), str3, str4, str5, jSONObject});
        }
        n9 n9Var = new n9();
        n9Var.i(this.f13725a);
        n9Var.m(((Activity) this.f13725a).getWindow().getDecorView());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "type", "showWeex2Pop");
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put((JSONObject) "url", e(q9s.p3(), str, str2, i, str3, str4, str5, jSONObject));
        jSONObject3.put((JSONObject) "popId", str2);
        jSONObject3.put((JSONObject) "animation", nbf.STDPOP_ANIMATION_BOTTOM);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put((JSONObject) "gravity", "center");
        jSONObject4.put((JSONObject) "tapEnable", (String) Boolean.FALSE);
        jSONObject4.put((JSONObject) "pushType", "outterJump");
        if (q9s.P0(str2)) {
            jSONObject4.put((JSONObject) "maxHeight", (String) Double.valueOf(0.95d));
            jSONObject4.put((JSONObject) "maxWidth", (String) Double.valueOf(0.4d));
        } else {
            jSONObject4.put((JSONObject) "maxHeight", (String) Double.valueOf(0.6d));
            jSONObject4.put((JSONObject) "maxWidth", (String) Double.valueOf(0.8d));
        }
        jSONObject4.put((JSONObject) "useViewMode", (String) Boolean.TRUE);
        jSONObject3.put((JSONObject) h9.KEY_POP_CONFIG, (String) jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put((JSONObject) "popType", ner.l(this.c, "iconChangeGuidePopup"));
        Object expBuckets = this.b.getExpBuckets();
        if (expBuckets == null) {
            expBuckets = new String[0];
        }
        jSONObject5.put((JSONObject) "expBuckets", (String) expBuckets);
        jSONObject5.put((JSONObject) "landscape", (String) Boolean.valueOf(this.f13725a.getResources().getConfiguration().orientation == 2));
        jSONObject3.put((JSONObject) "content", (String) jSONObject5);
        xhv xhvVar = xhv.INSTANCE;
        jSONObject2.put((JSONObject) "params", (String) jSONObject3);
        TMSLogger.a("iconChangeGuidePopup", jSONObject2.toJSONString());
        CommonExtKt.q(new PubIconChangeGuide$doShowICONChangeStrongGuide$1(this, jSONObject2, n9Var), 500L);
        return new b(0, "success");
    }
}
