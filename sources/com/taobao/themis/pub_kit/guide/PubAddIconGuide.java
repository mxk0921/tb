package com.taobao.themis.pub_kit.guide;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.pub_kit.guide.model.PubAddIconTipsModel;
import com.taobao.themis.pub_kit.guide.model.PubPropertiesFatigueModel;
import com.taobao.themis.pub_kit.guide.model.PubPropertiesModel;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import tb.a07;
import tb.ckf;
import tb.ies;
import tb.jpu;
import tb.q3n;
import tb.q9s;
import tb.r3n;
import tb.t2o;
import tb.tm2;
import tb.u3n;
import tb.uem;
import tb.v3n;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class PubAddIconGuide {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final Context f13721a;
    public final PubUserGuideModule b;
    public final PopupWindow c;
    public final PubAddIconTipsModel d;
    public final AtomicBoolean e;
    public final b f;
    public final JSONArray g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/pub_kit/guide/PubAddIconGuide$PubAddIconGuideType;", "", "(Ljava/lang/String;I)V", "DETAIL_FAVOR_TIPS", "DETAIL_BOTTOM_TIPS", "themis_pub_kit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class PubAddIconGuideType extends Enum<PubAddIconGuideType> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final PubAddIconGuideType DETAIL_FAVOR_TIPS = new PubAddIconGuideType("DETAIL_FAVOR_TIPS", 0);
        public static final PubAddIconGuideType DETAIL_BOTTOM_TIPS = new PubAddIconGuideType("DETAIL_BOTTOM_TIPS", 1);
        private static final /* synthetic */ PubAddIconGuideType[] $VALUES = $values();

        private static final /* synthetic */ PubAddIconGuideType[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (PubAddIconGuideType[]) ipChange.ipc$dispatch("20deb825", new Object[0]) : new PubAddIconGuideType[]{DETAIL_FAVOR_TIPS, DETAIL_BOTTOM_TIPS};
        }

        private PubAddIconGuideType(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(PubAddIconGuideType pubAddIconGuideType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub_kit/guide/PubAddIconGuide$PubAddIconGuideType");
        }

        public static PubAddIconGuideType valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("9ac6669a", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(PubAddIconGuideType.class, str);
            }
            return (PubAddIconGuideType) valueOf;
        }

        public static PubAddIconGuideType[] values() {
            Object clone;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                clone = ipChange.ipc$dispatch("eaa464c9", new Object[0]);
            } else {
                clone = $VALUES.clone();
            }
            return (PubAddIconGuideType[]) clone;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(845152275);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void onDismiss();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(845152278);
            int[] iArr = new int[PubAddIconGuideType.values().length];
            iArr[PubAddIconGuideType.DETAIL_FAVOR_TIPS.ordinal()] = 1;
            iArr[PubAddIconGuideType.DETAIL_BOTTOM_TIPS.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements uem.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.uem.b
        public void a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30005e67", new Object[]{this, str, str2, str3});
                return;
            }
            ckf.g(str, "popIndexId");
            ckf.g(str2, "protocol");
            ckf.g(str3, "curUri");
            TMSLogger.b("addIconTips", "doShowAddIconTipsBottom success");
        }

        @Override // tb.uem.b
        public void b(String str, boolean z, boolean z2, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e12c310", new Object[]{this, str, new Boolean(z), new Boolean(z2), str2, str3});
            } else {
                TMSLogger.b("addIconTips", "Close AddIconTipsBottom");
            }
        }

        @Override // tb.uem.b
        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("42b06e87", new Object[]{this, str});
                return;
            }
            ckf.g(str, "reason");
            TMSLogger.b("addIconTips", ckf.p("doShowAddIconTipsBottom error: ", str));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        public e(String str) {
            this.b = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            b b = PubAddIconGuide.b(PubAddIconGuide.this);
            if (b != null) {
                b.onDismiss();
            }
            PubAddIconGuide.c(PubAddIconGuide.this).dismiss();
            PubAddIconGuide.d(PubAddIconGuide.this, this.b);
        }
    }

    static {
        t2o.a(845152274);
    }

    public PubAddIconGuide(Context context, PubUserGuideModule pubUserGuideModule) {
        ckf.g(context, "mContext");
        ckf.g(pubUserGuideModule, "mUserGuideModule");
        this.f13721a = context;
        this.b = pubUserGuideModule;
        this.c = new PopupWindow(context);
        this.d = pubUserGuideModule.getAddIconTips();
        this.e = new AtomicBoolean(false);
    }

    public static final /* synthetic */ Context a(PubAddIconGuide pubAddIconGuide) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("234bfcf3", new Object[]{pubAddIconGuide});
        }
        return pubAddIconGuide.f13721a;
    }

    public static final /* synthetic */ b b(PubAddIconGuide pubAddIconGuide) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("b724187", new Object[]{pubAddIconGuide});
        }
        return pubAddIconGuide.f;
    }

    public static final /* synthetic */ PopupWindow c(PubAddIconGuide pubAddIconGuide) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopupWindow) ipChange.ipc$dispatch("3098e0b", new Object[]{pubAddIconGuide});
        }
        return pubAddIconGuide.c;
    }

    public static final /* synthetic */ void d(PubAddIconGuide pubAddIconGuide, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("102815ce", new Object[]{pubAddIconGuide, str});
        } else {
            pubAddIconGuide.n(str);
        }
    }

    public final void e(String str, String str2) {
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
        PubAddIconTipsModel pubAddIconTipsModel = this.d;
        if (pubAddIconTipsModel == null || (userFatigueModel2 = pubAddIconTipsModel.getUserFatigueModel()) == null || (str6 = userFatigueModel2.get("fatigueDayValue")) == null) {
            i = 0;
        } else {
            i = Integer.parseInt(str6);
        }
        PubAddIconTipsModel pubAddIconTipsModel2 = this.d;
        if (pubAddIconTipsModel2 == null || (userFatigueModel = pubAddIconTipsModel2.getUserFatigueModel()) == null || (str5 = userFatigueModel.get("fatigueCountValue")) == null) {
            i2 = 0;
        } else {
            i2 = Integer.parseInt(str5);
        }
        PubAddIconTipsModel pubAddIconTipsModel3 = this.d;
        if (pubAddIconTipsModel3 == null || (bizFatigueModel2 = pubAddIconTipsModel3.getBizFatigueModel()) == null || (str4 = bizFatigueModel2.get("fatigueDayValue")) == null) {
            i3 = 0;
        } else {
            i3 = Integer.parseInt(str4);
        }
        PubAddIconTipsModel pubAddIconTipsModel4 = this.d;
        if (pubAddIconTipsModel4 == null || (bizFatigueModel = pubAddIconTipsModel4.getBizFatigueModel()) == null || (str3 = bizFatigueModel.get("fatigueCountValue")) == null) {
            i4 = 0;
        } else {
            i4 = Integer.parseInt(str3);
        }
        PubPropertiesModel properties = this.b.getProperties();
        if (properties == null || (totalGuidePopupUserFatigueConfig = properties.getTotalGuidePopupUserFatigueConfig()) == null || (range = totalGuidePopupUserFatigueConfig.getRange()) == null || !range.contains("addIconTips")) {
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
        r3n.a(this.f13721a, "addIconTips", new q3n(str, i3, i4), new q3n(str2, i, i2), q3nVar);
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (this.c.isShowing()) {
            b bVar = this.f;
            if (bVar != null) {
                bVar.onDismiss();
            }
            this.c.dismiss();
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
        } else if (this.c.isShowing()) {
            b bVar = this.f;
            if (bVar != null) {
                bVar.onDismiss();
            }
            this.c.dismiss();
        }
    }

    public final boolean m(String str, String str2) {
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
        PubAddIconTipsModel pubAddIconTipsModel = this.d;
        if (pubAddIconTipsModel == null || (userFatigueModel2 = pubAddIconTipsModel.getUserFatigueModel()) == null || (str6 = userFatigueModel2.get("fatigueDayValue")) == null) {
            i = 0;
        } else {
            i = Integer.parseInt(str6);
        }
        PubAddIconTipsModel pubAddIconTipsModel2 = this.d;
        if (pubAddIconTipsModel2 == null || (userFatigueModel = pubAddIconTipsModel2.getUserFatigueModel()) == null || (str5 = userFatigueModel.get("fatigueCountValue")) == null) {
            i2 = 0;
        } else {
            i2 = Integer.parseInt(str5);
        }
        PubAddIconTipsModel pubAddIconTipsModel3 = this.d;
        if (pubAddIconTipsModel3 == null || (bizFatigueModel2 = pubAddIconTipsModel3.getBizFatigueModel()) == null || (str4 = bizFatigueModel2.get("fatigueDayValue")) == null) {
            i3 = 0;
        } else {
            i3 = Integer.parseInt(str4);
        }
        PubAddIconTipsModel pubAddIconTipsModel4 = this.d;
        if (pubAddIconTipsModel4 == null || (bizFatigueModel = pubAddIconTipsModel4.getBizFatigueModel()) == null || (str3 = bizFatigueModel.get("fatigueCountValue")) == null) {
            i4 = 0;
        } else {
            i4 = Integer.parseInt(str3);
        }
        PubPropertiesModel properties = this.b.getProperties();
        if (properties == null || (totalGuidePopupUserFatigueConfig = properties.getTotalGuidePopupUserFatigueConfig()) == null || (range = totalGuidePopupUserFatigueConfig.getRange()) == null || !range.contains("addIconTips")) {
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
        return r3n.d(this.f13721a, "addIconTips", new q3n(str, i3, i4), new q3n(str2, i, i2), q3nVar);
    }

    public final boolean f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eb5780c", new Object[]{this, str, str2})).booleanValue();
        }
        ckf.g(str, "appId");
        ckf.g(str2, "userId");
        Context context = this.f13721a;
        if (!(context instanceof Activity) || ((Activity) context).isFinishing()) {
            TMSLogger.b("addIconTips", "environment illegality");
            return false;
        } else if (this.e.get()) {
            TMSLogger.b("addIconTips", "已经展示过");
            return false;
        } else if (!m(str, str2)) {
            return true;
        } else {
            TMSLogger.b("addIconTips", "Beyond fatigue");
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r4 == null) goto L_0x0065;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
        if (r4 == null) goto L_0x0065;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(java.lang.String r9, android.view.View r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.pub_kit.guide.PubAddIconGuide.i(java.lang.String, android.view.View, java.lang.String, java.lang.String):boolean");
    }

    public final boolean h(Activity activity) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("252e7ef2", new Object[]{this, activity})).booleanValue();
        }
        if (!q9s.m2()) {
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "popId", this.b.getMiniappId());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "appName", this.b.getDosaName());
        jSONObject2.put((JSONObject) MspFlybirdDefine.FLYBIRD_DIALOG_LOGO, this.b.getDosaLogo());
        jSONObject2.put((JSONObject) "miniappId", this.b.getMiniappId());
        jSONObject2.put((JSONObject) "userActiveIconChangeGuidePopup", (String) this.b.getUserActiveIconChangeGuidePopup());
        jSONObject2.put((JSONObject) "addIconToast", (String) this.b.getAddIconTips());
        jSONObject2.put((JSONObject) "popType", "addIconToast");
        Object expBuckets = this.b.getExpBuckets();
        if (expBuckets == null) {
            expBuckets = new String[0];
        }
        jSONObject2.put((JSONObject) "expBuckets", (String) expBuckets);
        if (activity.getResources().getConfiguration().orientation == 2) {
            z = true;
        }
        jSONObject2.put((JSONObject) "landscape", (String) Boolean.valueOf(z));
        xhv xhvVar = xhv.INSTANCE;
        jSONObject.put((JSONObject) "content", (String) jSONObject2);
        uem.m(ies.g(q9s.INSTANCE.B3()).buildUpon().build().toString(), jSONObject.toString()).j(new d()).l();
        return true;
    }

    public final boolean k(View view, PubAddIconGuideType pubAddIconGuideType, String str, String str2) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f05f87b", new Object[]{this, view, pubAddIconGuideType, str, str2})).booleanValue();
        }
        ckf.g(pubAddIconGuideType, "type");
        ckf.g(str, "appId");
        ckf.g(str2, "userId");
        if (view == null) {
            TMSLogger.b("addIconTips", "parent is null");
            return false;
        } else if (!f(str, str2)) {
            return false;
        } else {
            int i = c.$EnumSwitchMapping$0[pubAddIconGuideType.ordinal()];
            if (i == 1) {
                Pair a2 = jpu.a("miniapp_id", str);
                v3n.b("Page_Miniapp_Show-GuideTipsDetail", kotlin.collections.a.j(a2, jpu.a("spm", "MiniApp_" + str + ".pages_Page_MiniApp.GuideTipsDetail.d")));
                o(str);
                z = i(str, view, null, null);
            } else if (i == 2) {
                z = h((Activity) this.f13721a);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (z) {
                this.e.set(true);
                e(str, str2);
            }
            return z;
        }
    }

    public final boolean l(View view, PubAddIconGuideType pubAddIconGuideType, String str, String str2, String str3, String str4) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18d07e0f", new Object[]{this, view, pubAddIconGuideType, str, str2, str3, str4})).booleanValue();
        }
        ckf.g(pubAddIconGuideType, "type");
        ckf.g(str, "appId");
        ckf.g(str2, "userId");
        if (view == null) {
            TMSLogger.b("addIconTips", "parent is null");
            return false;
        } else if (!f(str, str2)) {
            return false;
        } else {
            int i = c.$EnumSwitchMapping$0[pubAddIconGuideType.ordinal()];
            if (i == 1) {
                Pair a2 = jpu.a("miniapp_id", str);
                v3n.b("Page_Miniapp_Show-GuideTipsDetail", kotlin.collections.a.j(a2, jpu.a("spm", "MiniApp_" + str + ".pages_Page_MiniApp.GuideTipsDetail.d")));
                o(str);
                z = i(str, view, str3, str4);
            } else if (i == 2) {
                z = h((Activity) this.f13721a);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (z) {
                this.e.set(true);
                e(str, str2);
            }
            return z;
        }
    }

    public final void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e114acec", new Object[]{this, str});
        } else {
            v3n.a("Page_MiniApp_Button-Guidetip", kotlin.collections.a.k(jpu.a("miniapp_id", str), jpu.a("spm", "Page_MiniApp.1.Tip.2"), jpu.a(tm2.HOME_BUCKETS, u3n.a(this.b))));
        }
    }

    public final void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a11bae2", new Object[]{this, str});
        } else {
            v3n.b("Page_MiniApp_Show-Guidetip", kotlin.collections.a.k(jpu.a("miniapp_id", str), jpu.a("spm", "Page_MiniApp.1.Tip.1"), jpu.a(tm2.HOME_BUCKETS, u3n.a(this.b))));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PubAddIconGuide(Context context, PubUserGuideModule pubUserGuideModule, JSONArray jSONArray, b bVar) {
        this(context, pubUserGuideModule);
        ckf.g(context, "context");
        ckf.g(pubUserGuideModule, "module");
        ckf.g(bVar, "dismissedCallback");
        this.g = jSONArray;
        this.f = bVar;
    }
}
