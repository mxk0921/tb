package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alilive.adapter.business.BusinessInfo;
import com.alilive.adapter.business.BusinessUtil;
import com.alilive.adapter.business.FissionTcpParam;
import com.alipay.mobile.monitor.track.spm.merge.MergeUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.CalendarConfig;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.ItemInfo;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.business.MtopTbliveRecommendPopviewClickRequest;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.business.MtopTbliveRecommendPopviewClickResponse;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.business.MtopTbliveRecommendPopviewQueryResponse;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.business.MtopTbliveRecommendPopviewStatusResponse;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.android.tbsku.TBXSkuCore;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.VideoStatus;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.wu2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class amr implements b0d, ohd, s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EventType_SHOW_POPVIEW = "EventType_show_recommend_popview";
    public static final String TAG = amr.class.getSimpleName();
    public a2e F;
    public ub5 G;

    /* renamed from: a  reason: collision with root package name */
    public eon f15853a;
    public final Context b;
    public final ViewGroup c;
    public String e;
    public String f;
    public String g;
    public String h;
    public jim i;
    public final ux9 j;
    public final TBLiveDataModel k;
    public BaseFrame l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String s;
    public jw1 u;
    public CalendarConfig w;
    public ItemInfo x;
    public String y;
    public String q = "";
    public String r = "";
    public JSONObject t = new JSONObject();
    public boolean v = false;
    public int z = 10;
    public int A = 200;
    public int B = 0;
    public String C = null;
    public String D = null;
    public final Runnable E = new a();
    public final String d = String.valueOf(hashCode());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (amr.a(amr.this) >= amr.c(amr.this)) {
                amr.this.G();
                amr amrVar = amr.this;
                amr.k(amrVar, "query_timeout", amr.j(amrVar));
            } else if (amr.g(amr.this) != null && amr.h(amr.this) != null) {
                amr.g(amr.this).M(amr.h(amr.this).e, amr.i(amr.this), amr.b(amr.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f15855a;

        public b(boolean z) {
            this.f15855a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (amr.l(amr.this) != null) {
                amr.l(amr.this).removeAllViews();
            }
            if (amr.h(amr.this) != null) {
                amr.h(amr.this).z(0);
            }
            if (this.f15855a) {
                amr amrVar = amr.this;
                amr.m(amrVar, "", amr.j(amrVar), false, false, "close");
            }
            amr amrVar2 = amr.this;
            amr.n(amrVar2, amr.j(amrVar2));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f15856a;
        public final /* synthetic */ Runnable b;

        public c(View view, Runnable runnable) {
            this.f15856a = view;
            this.b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f15856a.post(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements wu2.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f15858a;

        public e(boolean z) {
            this.f15858a = z;
        }

        @Override // tb.wu2.c
        public void onError() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11bc4f70", new Object[]{this});
            } else if (this.f15858a) {
                b1u.b(amr.f(amr.this), "无权限，请添加日历权限");
            }
        }

        @Override // tb.wu2.c
        public void onSuccess(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b8f9489", new Object[]{this, new Boolean(z)});
                return;
            }
            if (amr.h(amr.this) != null) {
                amr.h(amr.this).d.put("hasCalendar", (Object) Boolean.valueOf(amr.e(amr.this, z)));
                amr.h(amr.this).D(false);
            }
            if (z) {
                b1u.b(amr.f(amr.this), "添加日历成功");
            } else if (this.f15858a) {
                b1u.b(amr.f(amr.this), "添加日历失败");
            }
            amr.this.W("item_right_popview_calendar_click", null);
        }
    }

    static {
        t2o.a(295699682);
        t2o.a(806355932);
        t2o.a(295699666);
        t2o.a(806355016);
    }

    public amr(Context context, ViewGroup viewGroup, ux9 ux9Var, TBLiveDataModel tBLiveDataModel, BaseFrame baseFrame, jim jimVar) {
        int i;
        this.b = context;
        this.i = jimVar;
        this.j = ux9Var;
        this.k = tBLiveDataModel;
        this.l = baseFrame;
        ViewGroup viewGroup2 = (ViewGroup) e9m.a(context, R.id.taolive_open_popview_frame);
        this.c = viewGroup2;
        if (viewGroup2 == null) {
            this.c = viewGroup;
        }
        ViewGroup viewGroup3 = this.c;
        if (viewGroup3 != null) {
            if (vc.i(context) || vc.e(context)) {
                i = hw0.i() - vc.b(context);
            } else {
                i = 0;
            }
            viewGroup3.setPadding(i, 0, 0, 0);
        }
    }

    public static String A(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4e28924c", new Object[]{str, str2, str3});
        }
        if (TextUtils.isEmpty(str)) {
            str = str2;
        }
        if (!TextUtils.isEmpty(str3)) {
            return str3;
        }
        return str;
    }

    public static JSONObject E(Uri uri) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c96b99e", new Object[]{uri});
        }
        JSONObject jSONObject = new JSONObject();
        String queryParameter = uri.getQueryParameter("huanduanParams");
        if (!TextUtils.isEmpty(queryParameter) && (split = queryParameter.split(",")) != null) {
            for (String str : split) {
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put(str, (Object) uri.getQueryParameter(str));
                }
            }
        }
        return jSONObject;
    }

    public static /* synthetic */ int a(amr amrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("218b13ce", new Object[]{amrVar})).intValue();
        }
        return amrVar.B;
    }

    public static /* synthetic */ int b(amr amrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e067e3d2", new Object[]{amrVar})).intValue();
        }
        int i = amrVar.B + 1;
        amrVar.B = i;
        return i;
    }

    public static /* synthetic */ int c(amr amrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40454b8f", new Object[]{amrVar})).intValue();
        }
        return amrVar.z;
    }

    public static /* synthetic */ void d(amr amrVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb05b49e", new Object[]{amrVar, str, str2});
        } else {
            amrVar.T(str, str2);
        }
    }

    public static /* synthetic */ boolean e(amr amrVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a43202b", new Object[]{amrVar, new Boolean(z)})).booleanValue();
        }
        amrVar.v = z;
        return z;
    }

    public static /* synthetic */ Context f(amr amrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("4678e704", new Object[]{amrVar});
        }
        return amrVar.b;
    }

    public static /* synthetic */ eon g(amr amrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eon) ipChange.ipc$dispatch("9f62e02d", new Object[]{amrVar});
        }
        return amrVar.f15853a;
    }

    public static /* synthetic */ jw1 h(amr amrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jw1) ipChange.ipc$dispatch("918b9f23", new Object[]{amrVar});
        }
        return amrVar.u;
    }

    public static /* synthetic */ String i(amr amrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e3fc3ba1", new Object[]{amrVar});
        }
        return amrVar.y;
    }

    public static /* synthetic */ ItemInfo j(amr amrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemInfo) ipChange.ipc$dispatch("de07c222", new Object[]{amrVar});
        }
        return amrVar.x;
    }

    public static /* synthetic */ void k(amr amrVar, String str, ItemInfo itemInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5c6847", new Object[]{amrVar, str, itemInfo});
        } else {
            amrVar.Y(str, itemInfo);
        }
    }

    public static /* synthetic */ ViewGroup l(amr amrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("bbba39b3", new Object[]{amrVar});
        }
        return amrVar.c;
    }

    public static /* synthetic */ void m(amr amrVar, String str, ItemInfo itemInfo, boolean z, boolean z2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c5b4ecf", new Object[]{amrVar, str, itemInfo, new Boolean(z), new Boolean(z2), str2});
        } else {
            amrVar.Q(str, itemInfo, z, z2, str2);
        }
    }

    public static /* synthetic */ void n(amr amrVar, ItemInfo itemInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cdaca6e", new Object[]{amrVar, itemInfo});
        } else {
            amrVar.O(itemInfo);
        }
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a8657af", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableSpmLiveSourceParamsRecommend", "true"));
    }

    public static String z(Uri uri, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d69bede5", new Object[]{uri, str});
        }
        return A(uri.getQueryParameter("itemIds"), uri.getQueryParameter(yj4.PARAM_SHAQRE_ITEM_ID), str);
    }

    public String B() {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d7740fc", new Object[]{this});
        }
        TBLiveDataModel tBLiveDataModel = this.k;
        if (tBLiveDataModel == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null) {
            return "";
        }
        return videoInfo.liveId;
    }

    public final HashMap<String, String> C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("a0686bd1", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        jw1 jw1Var = this.u;
        if (jw1Var != null) {
            hashMap.put("panel_type", jw1Var.e);
            hashMap.put("dx_template_name", this.u.g);
            hashMap.put("getDispatchItemID", w());
            Uri parse = Uri.parse(this.s);
            if (parse != null) {
                hashMap.put("getItemIds", z(parse, null));
            }
        }
        return hashMap;
    }

    public String D() {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8979324c", new Object[]{this});
        }
        TBLiveDataModel tBLiveDataModel = this.k;
        if (tBLiveDataModel == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null) {
            return "";
        }
        return videoInfo.recExtParams;
    }

    public String F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a592a696", new Object[]{this});
        }
        return this.d;
    }

    public void I(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18f3d09", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            J(z, z2, false);
        }
    }

    public void J(boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("605916eb", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        if (!z3) {
            a0(false);
        }
        p(z, new b(z2));
    }

    public final void L(BusinessInfo businessInfo, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("806a69b3", new Object[]{this, businessInfo, str, new Boolean(z)});
        } else if (businessInfo != null && businessInfo.tcp != null && !TextUtils.isEmpty(str)) {
            FissionTcpParam fissionTcpParam = businessInfo.tcp;
            fissionTcpParam.dataAttributes = BusinessUtil.c(this.j, fissionTcpParam.dataAttributes, str);
            if (!yga.O()) {
                return;
            }
            if (businessInfo.mIsJumpGoodsDetail) {
                businessInfo.tcp.dataAttributes.put("jumpTarget", "itemDetail");
            } else if (z) {
                businessInfo.tcp.dataAttributes.put("jumpTarget", TBXSkuCore.CONTAINER_TYPE_NEWBUY);
            }
        }
    }

    public final void M(BusinessInfo businessInfo) {
        TBLiveDataModel tBLiveDataModel;
        VideoInfo videoInfo;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea6f2237", new Object[]{this, businessInfo});
            return;
        }
        FissionTcpParam fissionTcpParam = businessInfo.tcp;
        if (!(fissionTcpParam == null || fissionTcpParam.context == null || (tBLiveDataModel = this.k) == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null || (jSONObject = videoInfo.tcpContext) == null || jSONObject.size() <= 0)) {
            for (String str : this.k.mVideoInfo.tcpContext.keySet()) {
                businessInfo.tcp.context.put(str, this.k.mVideoInfo.tcpContext.getString(str));
            }
        }
    }

    public final void O(ItemInfo itemInfo) {
        JSONObject jSONObject;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("850b0dfb", new Object[]{this, itemInfo});
        } else if (this.x != null && (jSONObject = itemInfo.item) != null) {
            String string = jSONObject.getString("id");
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("itemId", (Object) string);
                f3c h = this.j.h();
                ux9 ux9Var = this.j;
                if (ux9Var == null) {
                    str = null;
                } else {
                    str = ux9Var.C();
                }
                h.c("com.taobao.taolive.goods.preset.topitem", jSONObject2, str);
            }
        }
    }

    public final void P(b0d b0dVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a61853f", new Object[]{this, b0dVar, str, str2, str3});
            return;
        }
        eon eonVar = this.f15853a;
        if (eonVar != null) {
            eonVar.destroy();
        }
        eon eonVar2 = new eon(b0dVar);
        this.f15853a = eonVar2;
        eonVar2.L(B(), t(), this.n, this.p, this.e, this.f, this.q, this.r, this.t.toJSONString(), this.m, D(), str, str2, str3, false);
    }

    public final void Q(String str, ItemInfo itemInfo, boolean z, boolean z2, String str2) {
        jw1 jw1Var;
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb3d6b08", new Object[]{this, str, itemInfo, new Boolean(z), new Boolean(z2), str2});
            return;
        }
        jw1 jw1Var2 = this.u;
        if (jw1Var2 == null || jw1Var2.x() || (this.u.w() && z)) {
            BusinessInfo businessInfo = new BusinessInfo();
            if (!z || ((jw1Var = this.u) != null && !jw1Var.w())) {
                z3 = false;
            }
            businessInfo.mIsJumpGoodsDetail = z3;
            businessInfo.mJumpUrl = str;
            businessInfo.clickType = str2;
            businessInfo.actionSource = str2;
            jw1 jw1Var3 = this.u;
            if (jw1Var3 == null || jw1Var3.t()) {
                businessInfo.channel = "outsideItem";
            }
            if (itemInfo != null) {
                businessInfo.tcp = (FissionTcpParam) fkx.j(itemInfo.tcp, FissionTcpParam.class);
            }
            FissionTcpParam fissionTcpParam = businessInfo.tcp;
            if (fissionTcpParam == null) {
                FissionTcpParam fissionTcpParam2 = new FissionTcpParam();
                businessInfo.tcp = fissionTcpParam2;
                fissionTcpParam2.context = new HashMap();
                if ("close".equals(str2)) {
                    FissionTcpParam fissionTcpParam3 = businessInfo.tcp;
                    fissionTcpParam3.adUserId = "-1";
                    fissionTcpParam3.contentId = B();
                }
            } else if (fissionTcpParam.context == null) {
                fissionTcpParam.context = new HashMap();
            }
            FissionTcpParam fissionTcpParam4 = businessInfo.tcp;
            if (!(fissionTcpParam4 == null || fissionTcpParam4.context == null)) {
                if ("close".equals(str2)) {
                    FissionTcpParam fissionTcpParam5 = businessInfo.tcp;
                    fissionTcpParam5.scenceId = "";
                    fissionTcpParam5.tcpBid = "";
                } else {
                    M(businessInfo);
                }
                L(businessInfo, this.s, z2);
                businessInfo.tcp.context.put("outerAdUserParam", this.g);
                if (!TextUtils.isEmpty(this.h)) {
                    businessInfo.tcp.context.put(MergeUtil.KEY_RID, this.h);
                }
                businessInfo.tcp.context.put("livesource", this.e);
                businessInfo.tcp.context.put("entrylivesource", this.f);
                businessInfo.tcp.context.put("bizTraceId", v2s.o().u().getUserId() + "_" + businessInfo.tcp.adUserId + "_" + businessInfo.tcp.contentId + "_" + businessInfo.tcp.itemId + "_" + System.currentTimeMillis());
                businessInfo.tcp.context.put("switchIndex", this.m);
                businessInfo.tcp.context.put("spm-url", this.n);
                businessInfo.tcp.context.put("entryspm", this.p);
                if (x()) {
                    businessInfo.tcp.context.put("spm-cnt", this.o);
                    businessInfo.tcp.context.put("entryspmpre", up6.x(this.j));
                    businessInfo.tcp.context.put("entrylivesourcepre", up6.s(this.j));
                }
            }
            BusinessUtil.h((Activity) this.b, businessInfo);
            if (this.F != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add("liveToken=" + this.j.p());
                arrayList.add("actionSource=" + str2);
                arrayList.add("entryLiveSource=" + this.f);
                arrayList.add("liveSource=" + this.e);
                arrayList.add("context=" + fkx.i(businessInfo.tcp.context));
                arrayList.add("spm-cnt=" + this.o);
                arrayList.add("spm-url=" + this.n);
                this.F.c("outerTraceMonitor", (String[]) arrayList.toArray(new String[0]));
            }
        }
    }

    public void R(ub5 ub5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3adb84ce", new Object[]{this, ub5Var});
        } else {
            this.G = ub5Var;
        }
    }

    public void S(a2e a2eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("836064c9", new Object[]{this, a2eVar});
        } else {
            this.F = a2eVar;
        }
    }

    public final void T(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6a59c18", new Object[]{this, str, str2});
            return;
        }
        this.C = str;
        this.D = str2;
        jim jimVar = this.i;
        if (jimVar != null) {
            ((con) jimVar).a(C());
        }
        jw1 jw1Var = this.u;
        if (jw1Var != null) {
            jw1Var.j();
            this.u = null;
        }
        P(this, "1", "10", "{}");
    }

    public final void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fca733ff", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.c;
        if (viewGroup != null && this.f15853a != null) {
            viewGroup.removeCallbacks(this.E);
            this.c.postDelayed(this.E, this.A);
        }
    }

    public void W(String str, ItemInfo itemInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6ca005", new Object[]{this, str, itemInfo});
        } else {
            X(str, null, itemInfo);
        }
    }

    public final void Y(String str, ItemInfo itemInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f008895", new Object[]{this, str, itemInfo});
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("result=" + str);
        arrayList.add("successIndex=" + this.B);
        X("item_right_popview_query", arrayList, itemInfo);
    }

    public final void a0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27544d1b", new Object[]{this, new Boolean(z)});
            return;
        }
        cv1 f2 = vx9.f(this.j);
        if (f2 != null && f2.u != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", (Object) "dx");
            f2.u.c(this.C, this.D, z, jSONObject);
        }
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return "TBLiveRecommendPopViewManager";
    }

    public final void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e6a9f8e", new Object[]{this, new Boolean(z)});
        } else if (!this.v || z) {
            wu2.b(this.b, this.w, new e(z));
        }
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{EventType_SHOW_POPVIEW, "com.taobao.taolive.room.dxmanager.event.recommend_popview"};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        ux9 ux9Var = this.j;
        if (ux9Var == null) {
            return "";
        }
        return ux9Var.C();
    }

    @Override // tb.b0d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        if (netResponse != null) {
            arrayList.add("api=" + netResponse.getApi());
            arrayList.add("ret_msg=" + netResponse.getRetMsg());
            arrayList.add("ret_code=" + netResponse.getRetCode());
            if (MtopTbliveRecommendPopviewClickRequest.API_NAME_FINAL.equals(netResponse.getApi())) {
                igq.n().a("userPanelShowPoint");
                if (nh4.y0()) {
                    G();
                }
            } else {
                G();
            }
        }
        X("item_right_popview_request_error", arrayList, this.x);
    }

    @Override // tb.b0d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            onError(i, netResponse, obj);
        }
    }

    public final void p(boolean z, Runnable runnable) {
        jw1 jw1Var;
        View p;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e8d974", new Object[]{this, new Boolean(z), runnable});
        } else if (!z || (jw1Var = this.u) == null || !jw1Var.s() || (p = this.u.p()) == null) {
            runnable.run();
        } else {
            p.animate().scaleX(0.0f).scaleY(0.0f).translationX(p.getMeasuredWidth() / 2.0f).translationY((p.getMeasuredHeight() / 2.0f) - this.u.k()).withEndAction(new c(p, runnable)).setDuration(300L).start();
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69248f", new Object[]{this});
            return;
        }
        ItemInfo itemInfo = this.x;
        if (itemInfo != null && this.u != null) {
            if ("queryMtop".equals(itemInfo.actionType)) {
                eon eonVar = this.f15853a;
                if (eonVar != null) {
                    eonVar.K(this.u.e, this.x.backParams);
                    W(this.u.l(), this.x);
                }
            } else if ("goToDetail".equals(this.x.actionType)) {
                G();
                W(this.u.o(), this.x);
            } else if ("goToGoods".equals(this.x.actionType)) {
                U(this.x);
                W(this.u.o(), this.x);
            }
        }
    }

    public final void r(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45552356", new Object[]{this, str, str2});
            return;
        }
        Y(str, this.x);
        if (!TextUtils.isEmpty(str2)) {
            b1u.b(this.b, str2);
        }
        G();
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        J(false, false, true);
        eon eonVar = this.f15853a;
        if (eonVar != null) {
            eonVar.destroy();
        }
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
            viewGroup.removeCallbacks(this.E);
        }
        jw1 jw1Var = this.u;
        if (jw1Var != null) {
            jw1Var.j();
            this.u = null;
        }
        this.l = null;
        this.i = null;
        this.j.h().b(this);
    }

    public String t() {
        AccountInfo accountInfo;
        AccountInfo accountInfo2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("387f3cc7", new Object[]{this});
        }
        TBLiveDataModel tBLiveDataModel = this.k;
        if (tBLiveDataModel == null) {
            return "";
        }
        VideoInfo videoInfo = tBLiveDataModel.mVideoInfo;
        if (videoInfo != null && (accountInfo2 = videoInfo.broadCaster) != null) {
            return accountInfo2.accountId;
        }
        FandomInfo fandomInfo = tBLiveDataModel.mFandomInfo;
        if (fandomInfo == null || (accountInfo = fandomInfo.broadCaster) == null) {
            return "";
        }
        return accountInfo.accountId;
    }

    public CalendarConfig u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CalendarConfig) ipChange.ipc$dispatch("7254fec0", new Object[]{this});
        }
        return this.w;
    }

    public ub5 v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ub5) ipChange.ipc$dispatch("99953258", new Object[]{this});
        }
        return this.G;
    }

    public final String w() {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d3fe43b", new Object[]{this});
        }
        TBLiveDataModel tBLiveDataModel = this.k;
        if (tBLiveDataModel == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null) {
            return "";
        }
        return videoInfo.dispatchItemID;
    }

    public ux9 y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ux9) ipChange.ipc$dispatch("59d375df", new Object[]{this});
        }
        return this.j;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements ISmartLandingProxy.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.d
        public boolean onTaskActionListener(String str, String str2, JSONObject jSONObject, JSONArray jSONArray, JSONObject jSONObject2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fd5561e5", new Object[]{this, str, str2, jSONObject, jSONArray, jSONObject2})).booleanValue();
            }
            String str3 = amr.TAG;
            o3s.b(str3, "SmartLanding initRecommendPopview onTaskActionListener popId " + str2 + " actionData " + jSONObject);
            if (jSONObject == null) {
                return false;
            }
            amr.this.q = amr.A(jSONObject.getString("itemIds"), jSONObject.getString(yj4.PARAM_SHAQRE_ITEM_ID), jSONObject.getString("dispatchItemID"));
            amr.this.r = jSONObject.getString("shareType");
            amr.this.t = jSONObject.getJSONObject("huanduanParams");
            amr amrVar = amr.this;
            if (amrVar.t == null) {
                amrVar.t = new JSONObject();
            }
            amr.this.t.put("versionCode", (Object) "20240626");
            amr.d(amr.this, str, str2);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements wu2.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // tb.wu2.c
        public void onError() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11bc4f70", new Object[]{this});
            } else {
                b1u.b(amr.f(amr.this), "无权限，请添加日历权限");
            }
        }

        @Override // tb.wu2.c
        public void onSuccess(boolean z) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b8f9489", new Object[]{this, new Boolean(z)});
                return;
            }
            Context f = amr.f(amr.this);
            if (z) {
                str = "删除日历成功";
            } else {
                str = "删除日历失败";
            }
            b1u.b(f, str);
            if (amr.h(amr.this) != null) {
                amr.h(amr.this).y("hasCalendar", Boolean.valueOf(amr.e(amr.this, !z)));
                amr.h(amr.this).D(false);
            }
            amr.this.W("item_right_popview_calendar_click", null);
        }
    }

    public void G() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("997a9e3b", new Object[]{this});
            return;
        }
        ItemInfo itemInfo = this.x;
        if (!(itemInfo == null || (jSONObject = itemInfo.card) == null || !jSONObject.containsKey("detailUrl"))) {
            String string = this.x.card.getString("detailUrl");
            JSONObject jSONObject2 = this.x.item;
            if (jSONObject2 == null || !jSONObject2.getBooleanValue("enableSku")) {
                Q(string, this.x, true, false, "gotodetail");
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("itemId", this.x.item.getString("id"));
                hashMap.put("openFrom", "tblive");
                hashMap.put("bottomMode", "BUYNOW");
                if (this.x.item.containsKey("tradeParams")) {
                    hashMap.put("exParams", this.x.item.getJSONObject("tradeParams"));
                }
                jw1 jw1Var = this.u;
                if (jw1Var != null && jw1Var.w()) {
                    uir.a("taolivegoods", "openNewBuy", hashMap, this.b, null);
                }
                jw1 jw1Var2 = this.u;
                if (jw1Var2 != null && jw1Var2.x()) {
                    Q("", this.x, false, true, "gotodetail");
                }
            }
        }
        jw1 jw1Var3 = this.u;
        if (jw1Var3 != null && jw1Var3.v()) {
            I(false, false);
        }
    }

    public void K(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        ISmartLandingProxy.b bVar;
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a256f5d", new Object[]{this, str, str2, str3, str4, str5, str6, str7});
            return;
        }
        this.e = str4;
        this.f = str5;
        this.o = str6;
        this.m = str;
        this.n = str2;
        this.p = str3;
        this.s = str7;
        TBLiveDataModel tBLiveDataModel = this.k;
        if (!(tBLiveDataModel == null || (map = tBLiveDataModel.mInitParams) == null || TextUtils.isEmpty(map.get(yj4.PARAM_INTENT_URL)))) {
            this.s = this.k.mInitParams.get(yj4.PARAM_INTENT_URL);
        }
        if (!TextUtils.isEmpty(this.s)) {
            Uri parse = Uri.parse(this.s);
            if (parse != null) {
                this.q = z(parse, w());
                this.r = parse.getQueryParameter("shareType");
                this.g = parse.getQueryParameter("outerAdUserParam");
                this.h = parse.getQueryParameter(MergeUtil.KEY_RID);
                JSONObject E = E(parse);
                this.t = E;
                E.put("versionCode", (Object) "20240626");
            }
            this.j.h().a(this);
            cv1 f2 = vx9.f(this.j);
            if (f2 == null || (bVar = f2.u) == null) {
                T(null, null);
            } else {
                bVar.j(false, "dx", new d());
            }
        }
    }

    public final void U(ItemInfo itemInfo) {
        String str;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e183d47e", new Object[]{this, itemInfo});
        } else if (this.x != null) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject2 = itemInfo.card;
            String str2 = null;
            if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("actionData")) == null) {
                str = null;
            } else {
                hashMap.put("bizTopItemId", jSONObject.getString("itemId"));
                hashMap.put(yj4.PARAM_CATEGORY_ID, jSONObject.getString("pocketAnchorTab"));
                str = jSONObject.getString("glopenfrom");
            }
            if (TextUtils.isEmpty(str)) {
                str = "newUserBottomCard";
            }
            hashMap.put("glopenfrom", str);
            f3c h = this.j.h();
            ux9 ux9Var = this.j;
            if (ux9Var != null) {
                str2 = ux9Var.C();
            }
            h.c(uyg.EVENT_SHOW_GOODSPACKAGE, hashMap, str2);
            jw1 jw1Var = this.u;
            if (jw1Var != null && jw1Var.v()) {
                I(false, false);
            }
        }
    }

    public final void X(String str, ArrayList<String> arrayList, ItemInfo itemInfo) {
        JSONObject q;
        JSONObject jSONObject;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca18a215", new Object[]{this, str, arrayList, itemInfo});
        } else if (this.F != null && !TextUtils.isEmpty(str)) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("time=" + String.valueOf(System.currentTimeMillis()));
            arrayList2.add("panelTechType=dx");
            if (itemInfo == null || itemInfo.item == null) {
                arrayList2.add("restore_flag=1");
            } else {
                arrayList2.add("itemPrice=" + itemInfo.item.getString("itemPrice"));
                arrayList2.add("promotionPrice=" + itemInfo.item.getString("promotionPrice"));
                arrayList2.add("restore_flag=" + (TextUtils.equals(this.q, itemInfo.item.getString("id")) ? 1 : 0));
            }
            if (this.u != null) {
                arrayList2.add("popCode=" + this.u.f);
                arrayList2.add("typeName=" + this.u.h);
            }
            arrayList2.add("calendarStatus=" + this.v);
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
            }
            arrayList2.add("spm-cnt=" + this.o);
            arrayList2.add("spm-url=" + this.n);
            arrayList2.add("feeds_pos=1");
            arrayList2.add("page_mod=zhiboliveid");
            arrayList2.add("is_fp_mod=1");
            if (itemInfo == null || (jSONObject = itemInfo.logParams) == null) {
                jw1 jw1Var = this.u;
                if (!(jw1Var == null || (q = jw1Var.q()) == null)) {
                    for (String str2 : q.keySet()) {
                        arrayList2.add(str2 + "=" + q.getString(str2));
                    }
                }
            } else {
                for (String str3 : jSONObject.keySet()) {
                    arrayList2.add(str3 + "=" + itemInfo.logParams.getString(str3));
                }
            }
            TBLiveDataModel tBLiveDataModel = this.k;
            if (!(tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null)) {
                arrayList2.add("roomStatus=" + this.k.mVideoInfo.roomStatus);
            }
            ux9 ux9Var = this.j;
            if (!(ux9Var == null || ux9Var.x() == null)) {
                StringBuilder sb = new StringBuilder("isKandian=");
                if (VideoStatus.VIDEO_TIMESHIFT_STATUS != this.j.x().e()) {
                    z = false;
                }
                sb.append(z);
                arrayList2.add(sb.toString());
            }
            this.F.c(str, (String[]) arrayList2.toArray(new String[0]));
        }
    }

    public void Z(String str, ItemInfo itemInfo) {
        VideoInfo videoInfo;
        JSONObject q;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c792ba", new Object[]{this, str, itemInfo});
        } else if (this.F != null && !TextUtils.isEmpty(str)) {
            HashMap<String, String> hashMap = new HashMap<>();
            jw1 jw1Var = this.u;
            if (jw1Var != null) {
                hashMap.put("popCode", jw1Var.f);
                hashMap.put("typename", this.u.h);
            }
            hashMap.put("calendarStatus", String.valueOf(this.v));
            hashMap.put("time", String.valueOf(System.currentTimeMillis()));
            hashMap.put("panelTechType", "dx");
            hashMap.put("spm-cnt", this.o);
            hashMap.put("spm-url", this.n);
            hashMap.put("feeds_pos", "1");
            hashMap.put("page_mod", "zhiboliveid");
            hashMap.put("is_fp_mod", "1");
            if (itemInfo != null) {
                JSONObject jSONObject = itemInfo.item;
                if (jSONObject != null) {
                    hashMap.put("itemPrice", jSONObject.getString("itemPrice"));
                    hashMap.put("promotionPrice", itemInfo.item.getString("promotionPrice"));
                    hashMap.put("restore_flag", String.valueOf(TextUtils.equals(this.q, itemInfo.item.getString("id")) ? 1 : 0));
                }
                JSONObject jSONObject2 = itemInfo.logParams;
                if (jSONObject2 != null) {
                    hashMap.putAll(fxf.a(jSONObject2));
                } else {
                    jw1 jw1Var2 = this.u;
                    if (!(jw1Var2 == null || (q = jw1Var2.q()) == null)) {
                        hashMap.putAll(fxf.a(q));
                    }
                }
            } else {
                hashMap.put("restore_flag", "1");
            }
            TBLiveDataModel tBLiveDataModel = this.k;
            if (!(tBLiveDataModel == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null)) {
                hashMap.put("roomStatus", videoInfo.roomStatus);
            }
            ux9 ux9Var = this.j;
            if (!(ux9Var == null || ux9Var.x() == null)) {
                if (VideoStatus.VIDEO_TIMESHIFT_STATUS != this.j.x().e()) {
                    z = false;
                }
                hashMap.put("isKandian", String.valueOf(z));
            }
            this.F.b(str, hashMap);
        }
    }

    @Override // tb.b0d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        JSONObject data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        } else if (netBaseOutDo instanceof MtopTbliveRecommendPopviewQueryResponse) {
            N((MtopTbliveRecommendPopviewQueryResponse) netBaseOutDo);
        } else if (netBaseOutDo instanceof MtopTbliveRecommendPopviewClickResponse) {
            JSONObject data2 = ((MtopTbliveRecommendPopviewClickResponse) netBaseOutDo).getData();
            if (data2 != null && this.c != null) {
                if ("100".equals(data2.getString("code"))) {
                    r("click", data2.getString("text"));
                    return;
                }
                this.y = data2.getString("backParams");
                this.z = Math.max(Math.min(data2.getIntValue("count"), 20), 1);
                this.A = Math.max(Math.min(data2.getIntValue(Constants.Name.INTERVAL), 5000), 200);
                jw1 jw1Var = this.u;
                if (jw1Var != null) {
                    jw1Var.d.put("dx_buttonStatus", (Object) data2);
                }
                jw1 jw1Var2 = this.u;
                if (jw1Var2 != null) {
                    jw1Var2.D(false);
                }
                this.B = 0;
                V();
            }
        } else if ((netBaseOutDo instanceof MtopTbliveRecommendPopviewStatusResponse) && (data = ((MtopTbliveRecommendPopviewStatusResponse) netBaseOutDo).getData()) != null && this.c != null && this.u != null) {
            String string = data.getString(tl.KEY_STEP);
            String string2 = data.getString("text");
            if ("finish".equals(string)) {
                r(string, string2);
            } else if ("failed".equals(string)) {
                this.u.d.remove("dx_buttonStatus");
                this.u.D(false);
                r(string, string2);
            } else {
                V();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a4, code lost:
        if (r4.equals("taolive_speedbump_panel") == false) goto L_0x0077;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N(com.taobao.android.live.plugin.atype.flexalocal.recommendpop.business.MtopTbliveRecommendPopviewQueryResponse r10) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.amr.N(com.taobao.android.live.plugin.atype.flexalocal.recommendpop.business.MtopTbliveRecommendPopviewQueryResponse):void");
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        jw1 jw1Var;
        Object[] objArr;
        Object obj2;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (EventType_SHOW_POPVIEW.equals(str)) {
            if ((obj instanceof HashMap) && (obj2 = ((HashMap) obj).get("popviewTransParam")) != null) {
                JSONObject jSONObject = this.t;
                if (obj2 instanceof JSONObject) {
                    str2 = ((JSONObject) obj2).toJSONString();
                } else {
                    str2 = obj2.toString();
                }
                jSONObject.put("popviewTransParam", (Object) str2);
            }
            T(null, null);
        } else if ("com.taobao.taolive.room.dxmanager.event.recommend_popview".equals(str) && (obj instanceof uv5) && (jw1Var = this.u) != null) {
            uv5 uv5Var = (uv5) obj;
            ItemInfo n = jw1Var.n(uv5Var);
            this.x = n;
            if (n != null && (objArr = uv5Var.f29630a) != null && objArr.length >= 2) {
                if ("buttonAction".equals(objArr[1])) {
                    q();
                    return;
                }
                Object[] objArr2 = uv5Var.f29630a;
                if (objArr2.length > 2 && "goToDetail".equals(objArr2[1])) {
                    G();
                    W(this.u.o(), this.x);
                } else if ("close".equals(uv5Var.f29630a[1])) {
                    I(true, true);
                    W(this.u.m(), this.x);
                } else if ("detailButton".equals(uv5Var.f29630a[1])) {
                    G();
                    W(this.u.o(), this.x);
                } else if ("calendar_add".equals(uv5Var.f29630a[1])) {
                    o(true);
                } else if ("calendar_add_buy".equals(uv5Var.f29630a[1])) {
                    q();
                    o(false);
                } else if ("goToGoods".equals(uv5Var.f29630a[1])) {
                    U(this.x);
                    W(this.u.o(), this.x);
                } else {
                    Object[] objArr3 = uv5Var.f29630a;
                    if (objArr3.length > 2 && "calendar_add_goto_detail".equals(objArr3[1])) {
                        G();
                        o(false);
                        W(this.u.o(), this.x);
                    } else if ("calendar_remove".equals(uv5Var.f29630a[1])) {
                        wu2.g(this.b, this.w, new f());
                    }
                }
            }
        }
    }
}
