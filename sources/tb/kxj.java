package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.ADaemon;
import com.taobao.android.detail2.core.framework.data.model.CardInnerCommonNode;
import com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder;
import com.taobao.android.detail2.core.framework.view.frameanim.NewDetailMaskFrameLayout;
import com.taobao.android.detail2.core.optimize.preload.NavPreRequestManager;
import com.taobao.android.purchase.preload.TBBuyPreloadScene;
import com.taobao.android.weex.WeexEventTarget;
import com.taobao.android.weex.WeexValue;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import java.util.HashMap;
import tb.b6x;
import tb.hsm;
import tb.r19;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class kxj implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_EXTRA_ENABLE_TRANSITION = "extraEnableTransition";
    public static final String KEY_EXTRA_ENABLE_TRA_STYLE_DATA = "extraEnableTraStyleData";
    public static final String KEY_EXTRA_FRAME_ANIM_HIT_FIXED = "extraFrameAnimHitFixed";
    public static final String KEY_EXTRA_FRAME_ANIM_ND_REASON = "extraFrameAnimNdReason";
    public static final String KEY_EXTRA_FRAME_ANIM_REASON = "extraFrameAnimReason";
    public static final String KEY_EXTRA_FRAME_ANIM_TYPE = "extraFrameAnimType";
    public static final String KEY_LOW_BATTERY_ND_QUICK_JUMP = "lowBatteryNdQuickJump";
    public static final String KEY_NAV_HIT_TOP_SPEED_FIRST_PIC = "navHitTopSpeedFirstPic";
    public static final String KEY_NAV_LONG_TOKEN = "NewDetailLongToken";
    public static final String KEY_ON_NAV_HIT_PRE_CACHE_DATA = "onNavHitPreCacheData";
    public static final String KEY_REAL_HIT_MASK_FRAME_ANIM = "realHitMaskFrameAnim";
    public static boolean f = true;

    /* renamed from: a  reason: collision with root package name */
    public boolean f22985a;
    public boolean b;
    public boolean c;
    public volatile long d = -1;
    public boolean e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Intent f22988a;
        public final /* synthetic */ Intent b;

        public b(Intent intent, Intent intent2) {
            this.f22988a = intent;
            this.b = intent2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Bundle extras;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (r19.v()) {
                r19.f1(this.f22988a, true);
            } else {
                if (!r19.L0() && (extras = this.f22988a.getExtras()) != null) {
                    try {
                        this.b.putExtras(extras);
                    } catch (Exception e) {
                        txj.f(txj.TAG_TIP, "realIntent.putExtras 异常。", e);
                        if (gxj.b()) {
                            throw new RuntimeException(e);
                        }
                    }
                }
                r19.e1();
            }
        }
    }

    static {
        t2o.a(352321590);
        t2o.a(578814049);
    }

    public static /* synthetic */ long a(kxj kxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6352f2c6", new Object[]{kxjVar})).longValue();
        }
        return kxjVar.d;
    }

    public static /* synthetic */ void b(kxj kxjVar, Intent intent, Intent intent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68f347cd", new Object[]{kxjVar, intent, intent2});
        } else {
            kxjVar.i(intent, intent2);
        }
    }

    public static /* synthetic */ boolean c(kxj kxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64efefd8", new Object[]{kxjVar})).booleanValue();
        }
        return kxjVar.c;
    }

    public static /* synthetic */ void d(kxj kxjVar, Context context, Intent intent, String str, efj efjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d83c653", new Object[]{kxjVar, context, intent, str, efjVar});
        } else {
            kxjVar.u(context, intent, str, efjVar);
        }
    }

    public static void e(Uri uri, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("806f4abe", new Object[]{uri, intent});
        } else if (uri != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter(nj7.LARGE_SCREEN_STYLE_KEY, "fullscreen");
            intent.setData(buildUpon.build());
        }
    }

    public static JSONObject n(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2dd326da", new Object[]{intent});
        }
        if (intent == null) {
            return null;
        }
        String b2 = o8n.b(intent);
        if (!ynm.n(intent)) {
            return ynm.m(ynm.i(ynm.k(intent), ynm.c(intent)), ynm.j(intent), TBBuyPreloadScene.NAV);
        }
        return ynm.g(ynm.a(b2, ynm.c(intent)), TBBuyPreloadScene.NAV);
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d66f4c9e", new Object[]{this});
        } else if (B()) {
            r19.T("oldNav");
            r19.V("oldNav");
            r19.U();
        }
    }

    public boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("243dfd00", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecec1439", new Object[]{this});
            return;
        }
        this.f22985a = false;
        this.b = false;
        this.c = false;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8fdc57b", new Object[]{this});
        } else if (this.e) {
            i1d.a();
        }
    }

    public boolean g(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b18e197", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        o2r.a("NewDetailInnerNavProcessor_process");
        boolean w = w(intent, zmjVar);
        o2r.b();
        return w;
    }

    public final void i(Intent intent, Intent intent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c58675f", new Object[]{this, intent, intent2});
        } else {
            r19.d0().post(new b(intent, intent2));
        }
    }

    public final TaobaoImageUrlStrategy.ImageBlur k(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaobaoImageUrlStrategy.ImageBlur) ipChange.ipc$dispatch("78a12236", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("detailInfo");
        if (jSONObject4 == null || (jSONObject2 = jSONObject4.getJSONObject("biz")) == null || (jSONObject3 = jSONObject2.getJSONObject("feature")) == null) {
            return null;
        }
        String string = jSONObject3.getString("openImmediatelyBlur");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return (TaobaoImageUrlStrategy.ImageBlur) Enum.valueOf(TaobaoImageUrlStrategy.ImageBlur.class, string);
        } catch (Exception unused) {
            q0j.p(q0j.SCENE_OPEN_IMMEDIATELY, q0j.ERROR_CODE_OPEN_IMMEDIATELY_BLUR_PARSE_ERROR, "解析高斯模糊参数出错", null);
            return null;
        }
    }

    public final void l(Context context, com.taobao.android.detail2.core.framework.data.global.a aVar, ue7 ue7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73df46ec", new Object[]{this, context, aVar, ue7Var});
            return;
        }
        o2r.a("doOptimizeWhenHitOpenImmed");
        v(aVar, context);
        pnm.a().e(aVar);
        pnm.a().g(aVar);
        NavPreRequestManager.l().A(context, aVar, ue7Var);
        o2r.b();
    }

    public final void m(Context context, Intent intent, com.taobao.android.detail2.core.framework.data.global.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70955a5", new Object[]{this, context, intent, aVar});
            return;
        }
        v(aVar, context);
        pnm.a().e(aVar);
        pnm.a().g(aVar);
        NavPreRequestManager.l().x(context, intent, aVar);
        C(aVar, context);
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "NewDetailInnerNavProcessor";
    }

    public final void o(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cb94ac3", new Object[]{this, intent});
            return;
        }
        long W = r19.W();
        if (intent != null) {
            intent.putExtra(KEY_NAV_LONG_TOKEN, W);
        }
        this.d = W;
    }

    public void p(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48b53780", new Object[]{this, intent});
            return;
        }
        Uri data = intent.getData();
        if (data != null) {
            try {
                data.getQueryParameter("newDetailChannel");
            } catch (Exception e) {
                gxj.a("ND基本参数获取失败。", e);
            }
        }
        this.e = intent.getBooleanExtra("lowBatteryNdQuickJump", false);
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        return r(intent, zmjVar);
    }

    public boolean r(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("daeaf054", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        r19.W0();
        o(intent);
        String valueOf = String.valueOf(this.d);
        txj.e(txj.TAG_TIP, "ndNavToken:" + valueOf);
        nyj.z().C(valueOf, null, Long.valueOf(intent.getLongExtra("NAV_TO_URL_START_TIME", 0L)));
        boolean g = g(intent, zmjVar);
        nyj.z().q(valueOf, "biz_nav", g);
        nyj.z().b(valueOf, "biz_nav_after");
        return g;
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean w(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d14676ea", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        p(intent);
        h();
        x(intent, zmjVar, new efj<>());
        return true;
    }

    public boolean x(Intent intent, zmj zmjVar, efj<JSONObject, JSONObject> efjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("136cf1d6", new Object[]{this, intent, zmjVar, efjVar})).booleanValue();
        }
        return y(intent, zmjVar, efjVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends r19.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22986a;
        public final /* synthetic */ Intent b;
        public final /* synthetic */ Intent c;
        public final /* synthetic */ zmj d;
        public final /* synthetic */ gmh e;
        public final /* synthetic */ String f;
        public final /* synthetic */ efj g;

        /* compiled from: Taobao */
        /* renamed from: tb.kxj$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class RunnableC0975a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0975a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Bundle extras;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (r19.v()) {
                    r19.f1(a.this.b, true);
                } else {
                    if (!r19.L0() && (extras = a.this.b.getExtras()) != null) {
                        try {
                            a.this.c.putExtras(extras);
                        } catch (Exception e) {
                            qyj.a("fastRealIntentPutExtraError", "errorMsg:" + e.getMessage());
                            txj.c(txj.TAG_TIP, "runTask with error. taskName: " + a.this.c(), e);
                            gxj.a("fastRealIntentPutExtraError", e);
                        }
                    }
                    r19.e1();
                }
            }
        }

        public a(String str, Intent intent, Intent intent2, zmj zmjVar, gmh gmhVar, String str2, efj efjVar) {
            this.f22986a = str;
            this.b = intent;
            this.c = intent2;
            this.d = zmjVar;
            this.e = gmhVar;
            this.f = str2;
            this.g = efjVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/NewDetailInnerNavProcessor$1");
        }

        @Override // tb.r19.e
        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d0a42b93", new Object[]{this});
            }
            return "preInitIoInfoTask";
        }

        @Override // tb.r19.e
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9425d337", new Object[]{this});
                return;
            }
            String e = nyj.z().e(this.f22986a, "preloadResources");
            if (kxj.a(kxj.this) < r19.W()) {
                txj.e(txj.TAG_TIP, "preloadResources>> 命中了 Weex、Sp 异步加载。当前跳转被其它跳转替代。不再执行后续逻辑。。");
                kxj.b(kxj.this, this.b, this.c);
                nyj.z().u(this.f22986a, e, "preloadResources", false);
                return;
            }
            Context d = this.d.d();
            nyj.z().d(this.f22986a, "bindCpuForNd", e);
            kxj.this.f();
            nyj.z().t(this.f22986a, "bindCpuForNd", true, e);
            kxj kxjVar = kxj.this;
            if (kxjVar.e) {
                gmh.h(kxj.a(kxjVar), this.e);
                nyj.z().d(this.f22986a, "startBatterHelper", e);
                this.e.i(kxj.c(kxj.this));
                nyj.z().t(this.f22986a, "startBatterHelper", true, e);
            }
            nyj.z().d(this.f22986a, "callPreloadResources", e);
            kxj.d(kxj.this, d, this.b, this.f, this.g);
            nyj.z().t(this.f22986a, "callPreloadResources", true, e);
            r19.d0().post(new RunnableC0975a());
            nyj.z().u(this.f22986a, e, "preloadResources", true);
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab16dbe1", new Object[]{this});
        } else if (this.e) {
            o2r.a("t_nd_boostCpu");
            try {
                ADaemon.boostCpu(1);
            } catch (Throwable th) {
                gxj.a("boostCpu 异常。", th);
            }
            o2r.b();
        }
    }

    public boolean y(Intent intent, zmj zmjVar, efj<JSONObject, JSONObject> efjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fa64535", new Object[]{this, intent, zmjVar, efjVar})).booleanValue();
        }
        A();
        r19.V0();
        Uri data = intent.getData();
        e(data, intent);
        txj.e(txj.TAG_TIP, "appendNdParamsToIntentUri , 已提前处理。");
        if (r19.t0()) {
            s(intent, zmjVar, efjVar);
        }
        if (r19.r0()) {
            mqj.m(null, true);
        }
        txj.e(txj.TAG_RENDER, "用户点击");
        intent.putExtra("enableTppUpdate", true);
        Context d = zmjVar.d();
        D();
        if (!r19.H0()) {
            j(intent, zmjVar);
        }
        if (!r19.t0()) {
            u(d, intent, null, null);
        }
        z(intent, zmjVar, efjVar, data, d);
        return true;
    }

    public final void C(com.taobao.android.detail2.core.framework.data.global.a aVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d4b4b6e", new Object[]{this, aVar, context});
        } else if (!aVar.M().b(aVar.R().x)) {
            txj.e(txj.TAG_RENDER, "sendSimpleDeliverDataToWeex isEnableAllOptimize 关闭 return");
        } else if (aVar.Y() == null) {
            txj.e(txj.TAG_RENDER, "sendSimpleDeliverDataToWeex 透传数据为空 return");
        } else if (!aVar.N().t0()) {
            txj.e(txj.TAG_RENDER, "sendSimpleDeliverDataToWeex orange开关关闭 return");
        } else {
            ue7 a2 = vnj.a(aVar);
            ygj.f(aVar.B(), a2);
            String F0 = a2.F0();
            if (TextUtils.isEmpty(F0)) {
                txj.e(txj.TAG_RENDER, "sendSimpleDeliverDataToWeex mainpicWeexOriginUrl为空 return");
                return;
            }
            CardInnerCommonNode cardInnerCommonNode = a2.o0;
            if (cardInnerCommonNode == null || cardInnerCommonNode.dataContext == null) {
                txj.e(txj.TAG_RENDER, "sendSimpleDeliverDataToWeex 相关数据为空 return");
                return;
            }
            if (r19.q0()) {
                mqj.n(F0, null);
            }
            b6x.a k = syj.k(context, F0);
            if (k == null) {
                k = syj.e(context, F0, a2.o0.dataContext);
            } else {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("detailDataRefresh", (Object) a2.o0.dataContext);
                WeexValue b2 = com.taobao.android.weex.b.e().b(jSONObject);
                if (r19.I0()) {
                    k.d(WeexEventTarget.BODY_TARGET, "newdetailcallback", b2);
                    txj.e(txj.TAG_TIP, "v2-NavUseOldOptimizeKeyForWeex");
                } else if (!r19.o()) {
                    k.d(WeexEventTarget.BODY_TARGET, "optimizenewdetailcallback", b2);
                } else if (syj.b(ywj.i(ywj.i(a2.o0.dataContext, "context"), "preloadPassParams"), a2)) {
                    k.d(WeexEventTarget.BODY_TARGET, "optimizenewdetailcallback", b2);
                } else {
                    k.d(WeexEventTarget.BODY_TARGET, "newdetailcallback", b2);
                    txj.e(txj.TAG_TIP, "align-v2-NavUseOldOptimizeKeyForWeex");
                }
            }
            if (k != null) {
                k.c("hasSendDeliverWhenNavNew", aVar.B() + x3w.k0);
                StringBuilder sb = new StringBuilder("saveMusResult url: ");
                sb.append(F0);
                txj.e(txj.TAG_TIP, sb.toString());
                syj.l(k, F0);
                txj.e(txj.TAG_RENDER, "nav阶段提前发送simpleDeliver数据成功new");
                a2.o0(System.currentTimeMillis(), false);
                this.f22985a = true;
            }
        }
    }

    public final void j(Intent intent, zmj zmjVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a15312b", new Object[]{this, intent, zmjVar});
            return;
        }
        try {
            if (byj.H0()) {
                if (!Boolean.TRUE.equals(Boolean.valueOf(intent.getBooleanExtra("extraEnableTransition", false)))) {
                    txj.e(txj.TAG_FAST_ANIM, "一跳未传递无极缩放标识。");
                    intent.putExtra("extraFrameAnimNdReason", "noAnimFlag");
                } else if (NewDetailMaskFrameLayout.checkHasMaskFrameAnimParams(zmjVar.a())) {
                    this.c = true;
                    intent.putExtra("extraFrameAnimNdReason", "animSuccess-WithFlag");
                } else {
                    txj.e(txj.TAG_FAST_ANIM, "一跳虽然传递了无极缩放标识，但是未传递坐标参数。");
                    StringBuilder sb = new StringBuilder("noAnimExtra:null-");
                    if (zmjVar.a() != null) {
                        z = false;
                    }
                    sb.append(z);
                    intent.putExtra("extraFrameAnimNdReason", sb.toString());
                }
            }
        } catch (Throwable th) {
            txj.f(txj.TAG_FAST_ANIM, "未知异常。 无极缩放动画 , Orange 数据初始化失败。", th);
            intent.putExtra("extraFrameAnimNdReason", "errorCheck:" + th.getCause());
        }
    }

    public final boolean q(Intent intent) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("701764cd", new Object[]{this, intent})).booleanValue();
        }
        JSONObject f2 = ynm.f(ynm.a(o8n.b(intent), ynm.c(intent)), TBBuyPreloadScene.NAV);
        if (f2 != null) {
            JSONObject jSONObject4 = f2.getJSONObject("mainPicNative");
            if (jSONObject4 != null) {
                String string = jSONObject4.getString("url");
                String string2 = jSONObject4.getString("dimension");
                if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                    return true;
                }
            }
            return false;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return false;
        }
        String string3 = extras.getString(fnm.KEY_TARGET_PARAMS);
        if (TextUtils.isEmpty(string3)) {
            return false;
        }
        try {
            jSONObject = JSON.parseObject(string3);
        } catch (Exception e) {
            txj.f(txj.TAG_RENDER, "isSimpleDeliverDataPicValid 解析数据失败", e);
            jSONObject = null;
        }
        if (!(jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("simpleDeliverData")) == null || (jSONObject3 = jSONObject2.getJSONObject("mainPicNative")) == null)) {
            String string4 = jSONObject3.getString("url");
            String string5 = jSONObject3.getString("dimension");
            if (!TextUtils.isEmpty(string4) && !TextUtils.isEmpty(string5)) {
                return true;
            }
        }
        return false;
    }

    public final String t(JSONObject jSONObject, Intent intent, Context context, com.taobao.android.detail2.core.framework.data.global.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c59215be", new Object[]{this, jSONObject, intent, context, aVar});
        }
        o2r.a("preSendDataToWeexNewForAsyncV2_DetailCardItemNode");
        ue7 ue7Var = new ue7(aVar);
        ue7Var.j0(jSONObject, false, this.c || r19.X0(), false);
        ue7Var.z = false;
        ue7Var.f31127a = 0;
        ue7Var.F = true;
        ue7Var.I = true;
        ue7Var.b("nativeHalfGuide", Boolean.valueOf(aVar.J0(0, ue7Var.b)));
        aVar.m0(ue7Var);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("cardnum", (Object) String.valueOf(0));
        ue7Var.b(VerticalAbsViewHolder.KEY_CARD_EXTRA_DATA, jSONObject2);
        o2r.b();
        ygj.g(aVar.B(), ue7Var);
        com.taobao.android.detail2.core.optimize.preload.a.i(aVar, ue7Var, false);
        hsm.i(context, ue7Var);
        l(context, aVar, ue7Var);
        HashMap hashMap = new HashMap();
        hashMap.put("entryNDNum", String.valueOf(zgj.f32756a));
        q0j.g("eventProcess", q0j.UMBRELLA_TAG_WEEX_OPEN_IMMEDIATELY_PRE_SEND_DATA_REQUEST, hashMap);
        String F0 = ue7Var.F0();
        if (TextUtils.isEmpty(F0)) {
            q0j.s("new_detail异常", q0j.SCENE_WEEX_CONTAINER, q0j.ERROR_CODE_NAV_NO_MAIN_NULL, "Nav阶段预创建Weex时无有效WeexUrl", aVar.T());
            return aVar.B();
        }
        if (r19.q0()) {
            mqj.n(F0, null);
        }
        b6x.a f2 = syj.f(context, F0);
        if (f2 == null) {
            return aVar.B();
        }
        f2.c("hasSendDataWhenNav", "true");
        q0j.g("eventProcess", q0j.UMBRELLA_TAG_WEEX_OPEN_IMMEDIATELY_PRE_SEND_DATA_SUCCESS, hashMap);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("detailDataRefresh", (Object) ue7Var.o0.dataContext);
        WeexValue b2 = com.taobao.android.weex.b.e().b(jSONObject3);
        wxj.a(String.valueOf(this.d));
        if (r19.I0()) {
            f2.d(WeexEventTarget.BODY_TARGET, "newdetailcallback", b2);
            txj.e(txj.TAG_TIP, "v2-NavUseOldOptimizeKeyForWeex");
        } else if (!r19.o()) {
            f2.d(WeexEventTarget.BODY_TARGET, "optimizenewdetailcallback", b2);
        } else if (syj.b(ywj.i(ywj.i(ue7Var.o0.dataContext, "context"), "preloadPassParams"), ue7Var)) {
            f2.d(WeexEventTarget.BODY_TARGET, "optimizenewdetailcallback", b2);
        } else {
            f2.d(WeexEventTarget.BODY_TARGET, "newdetailcallback", b2);
            txj.e(txj.TAG_TIP, "align-v2-NavUseOldOptimizeKeyForWeex");
        }
        txj.e(txj.TAG_TIP, "saveMusResult url: " + F0);
        syj.l(f2, F0);
        txj.e(txj.TAG_RENDER, "nav阶段提前发送数据成功new");
        ue7Var.o0(System.currentTimeMillis(), false);
        this.f22985a = true;
        return aVar.B();
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [S, com.alibaba.fastjson.JSONObject] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(android.content.Context r8, android.content.Intent r9, java.lang.String r10, tb.efj<com.alibaba.fastjson.JSONObject, com.alibaba.fastjson.JSONObject> r11) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            java.lang.String r2 = "new_detail提示"
            java.lang.String r3 = "preloadResources"
            java.lang.String r4 = "preSendDataToWeexNew sjs:"
            com.android.alibaba.ip.runtime.IpChange r5 = tb.kxj.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x0027
            java.lang.String r2 = "37e05245"
            r3 = 5
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r7
            r3[r0] = r8
            r8 = 2
            r3[r8] = r9
            r8 = 3
            r3[r8] = r10
            r8 = 4
            r3[r8] = r11
            r5.ipc$dispatch(r2, r3)
            return
        L_0x0027:
            tb.o2r.a(r3)     // Catch: all -> 0x003b
            java.lang.String r5 = "preloadResources>> 实际开始执行。。 "
            tb.txj.e(r2, r5)     // Catch: all -> 0x003b
            if (r10 != 0) goto L_0x003e
            java.util.UUID r5 = java.util.UUID.randomUUID()     // Catch: all -> 0x003b
            java.lang.String r5 = r5.toString()     // Catch: all -> 0x003b
            goto L_0x003f
        L_0x003b:
            r8 = move-exception
            goto L_0x00d1
        L_0x003e:
            r5 = r10
        L_0x003f:
            if (r10 != 0) goto L_0x004d
            java.lang.String r10 = "NewDetailToken"
            r9.putExtra(r10, r5)     // Catch: all -> 0x003b
            com.taobao.android.detail2.core.optimize.preload.NavPreRequestManager r10 = com.taobao.android.detail2.core.optimize.preload.NavPreRequestManager.l()     // Catch: all -> 0x003b
            r10.v(r5)     // Catch: all -> 0x003b
        L_0x004d:
            java.lang.String r10 = "preloadResources_NewDetailFeedsConfig"
            tb.o2r.a(r10)     // Catch: all -> 0x003b
            com.taobao.android.detail2.core.framework.data.global.a r10 = new com.taobao.android.detail2.core.framework.data.global.a     // Catch: all -> 0x003b
            r10.<init>(r9)     // Catch: all -> 0x003b
            tb.o2r.b()     // Catch: all -> 0x003b
            tb.ygj.e(r5, r10)     // Catch: all -> 0x003b
            if (r11 == 0) goto L_0x0069
            F r5 = r11.f18531a     // Catch: all -> 0x003b
            if (r5 == 0) goto L_0x0069
            F r11 = r11.f18531a     // Catch: all -> 0x003b
            com.alibaba.fastjson.JSONObject r11 = (com.alibaba.fastjson.JSONObject) r11     // Catch: all -> 0x003b
            goto L_0x0072
        L_0x0069:
            com.alibaba.fastjson.JSONObject r5 = n(r9)     // Catch: all -> 0x003b
            if (r11 == 0) goto L_0x0071
            r11.b = r5     // Catch: all -> 0x003b
        L_0x0071:
            r11 = r5
        L_0x0072:
            if (r11 != 0) goto L_0x007b
            r7.m(r8, r9, r10)     // Catch: all -> 0x003b
            tb.o2r.b()
            return
        L_0x007b:
            r7.b = r0     // Catch: all -> 0x003b
            boolean r5 = tb.r19.t0()     // Catch: all -> 0x003b
            if (r5 == 0) goto L_0x0088
            java.lang.String r9 = r7.t(r11, r9, r8, r10)     // Catch: all -> 0x003b
            goto L_0x00a4
        L_0x0088:
            java.lang.String r9 = "weex_sync_delete_code"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: all -> 0x003b
            r10.<init>(r4)     // Catch: all -> 0x003b
            java.lang.String r4 = tb.r19.Y()     // Catch: all -> 0x003b
            r10.append(r4)     // Catch: all -> 0x003b
            java.lang.String r10 = r10.toString()     // Catch: all -> 0x003b
            tb.qyj.a(r9, r10)     // Catch: all -> 0x003b
            long r9 = r7.d     // Catch: all -> 0x003b
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch: all -> 0x003b
        L_0x00a4:
            boolean r10 = r7.f22985a     // Catch: all -> 0x003b
            if (r10 == 0) goto L_0x00b3
            boolean r10 = r7.c     // Catch: all -> 0x003b
            if (r10 == 0) goto L_0x00b3
            boolean r10 = tb.byj.S0()     // Catch: all -> 0x003b
            if (r10 == 0) goto L_0x00b3
            goto L_0x00b4
        L_0x00b3:
            r0 = 0
        L_0x00b4:
            tb.otm r10 = new tb.otm     // Catch: all -> 0x003b
            r10.<init>()     // Catch: all -> 0x003b
            tb.ygj.h(r9, r10)     // Catch: all -> 0x003b
            com.alibaba.fastjson.JSONObject r9 = r11.getJSONObject(r3)     // Catch: all -> 0x003b
            com.taobao.tao.util.TaobaoImageUrlStrategy$ImageBlur r11 = r7.k(r11)     // Catch: all -> 0x003b
            tb.hsm.g(r10, r8, r9, r11, r0)     // Catch: all -> 0x003b
            java.lang.String r8 = "preloadResources>> 实际执行结束，未发生异常。 "
            tb.txj.e(r2, r8)     // Catch: all -> 0x003b
        L_0x00cd:
            tb.o2r.b()
            goto L_0x00e2
        L_0x00d1:
            java.lang.String r9 = "openImmediately"
            java.lang.String r10 = "20705"
            java.lang.String r10 = tb.q0j.k(r10)     // Catch: all -> 0x00e3
            java.lang.String r11 = "点击时预加载资源异常"
            r0 = 0
            tb.q0j.n(r9, r10, r11, r0, r8)     // Catch: all -> 0x00e3
            goto L_0x00cd
        L_0x00e2:
            return
        L_0x00e3:
            r8 = move-exception
            tb.o2r.b()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.kxj.u(android.content.Context, android.content.Intent, java.lang.String, tb.efj):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0041 A[Catch: all -> 0x002f, TryCatch #1 {all -> 0x002f, blocks: (B:6:0x0024, B:8:0x0028, B:15:0x0033, B:17:0x0037, B:19:0x003d, B:21:0x0041, B:22:0x0047, B:24:0x004d, B:28:0x0057, B:30:0x005d, B:32:0x006c, B:35:0x007c, B:37:0x0084, B:39:0x008a, B:41:0x0093, B:42:0x0097, B:44:0x009d, B:46:0x00a3, B:47:0x00a7, B:49:0x00ac, B:51:0x00be, B:53:0x00c6, B:55:0x00ca, B:57:0x00d6, B:59:0x00da, B:63:0x00e0, B:67:0x0102, B:69:0x0108, B:64:0x00ed, B:66:0x00f1), top: B:72:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d A[Catch: all -> 0x002f, TryCatch #1 {all -> 0x002f, blocks: (B:6:0x0024, B:8:0x0028, B:15:0x0033, B:17:0x0037, B:19:0x003d, B:21:0x0041, B:22:0x0047, B:24:0x004d, B:28:0x0057, B:30:0x005d, B:32:0x006c, B:35:0x007c, B:37:0x0084, B:39:0x008a, B:41:0x0093, B:42:0x0097, B:44:0x009d, B:46:0x00a3, B:47:0x00a7, B:49:0x00ac, B:51:0x00be, B:53:0x00c6, B:55:0x00ca, B:57:0x00d6, B:59:0x00da, B:63:0x00e0, B:67:0x0102, B:69:0x0108, B:64:0x00ed, B:66:0x00f1), top: B:72:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0108 A[Catch: all -> 0x002f, TRY_LEAVE, TryCatch #1 {all -> 0x002f, blocks: (B:6:0x0024, B:8:0x0028, B:15:0x0033, B:17:0x0037, B:19:0x003d, B:21:0x0041, B:22:0x0047, B:24:0x004d, B:28:0x0057, B:30:0x005d, B:32:0x006c, B:35:0x007c, B:37:0x0084, B:39:0x008a, B:41:0x0093, B:42:0x0097, B:44:0x009d, B:46:0x00a3, B:47:0x00a7, B:49:0x00ac, B:51:0x00be, B:53:0x00c6, B:55:0x00ca, B:57:0x00d6, B:59:0x00da, B:63:0x00e0, B:67:0x0102, B:69:0x0108, B:64:0x00ed, B:66:0x00f1), top: B:72:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v13, types: [F, com.alibaba.fastjson.JSONObject] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(android.content.Intent r7, tb.zmj r8, tb.efj<com.alibaba.fastjson.JSONObject, com.alibaba.fastjson.JSONObject> r9, android.net.Uri r10, android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.kxj.z(android.content.Intent, tb.zmj, tb.efj, android.net.Uri, android.content.Context):void");
    }

    public final void v(com.taobao.android.detail2.core.framework.data.global.a aVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1f5cd5f", new Object[]{this, aVar, context});
            return;
        }
        s0m.B().T(hsm.d(context, aVar.e0(), aVar.n1())).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, hsm.PHENIX_PLAVEHOLDER_PIC_BIZ_CODE).heightScale(aVar.n1()).fetch();
        if (!"false".equals(aVar.Z().getString("enableBlurImage"))) {
            s0m.B().T(hsm.j(context, aVar.e0())).bitmapProcessors(true, new yf2(context, aVar.N().x(), 2)).fetch();
        }
        if ("video".equals(aVar.d0())) {
            e95.a(context, aVar.f0(), hsm.a(), ((int) aVar.c0()) * 1000, new hsm.b(aVar.f0()));
        }
        txj.e(txj.TAG_RENDER, "preloadTargetPic: " + aVar.e0() + ", preloadTargetVideoId: " + aVar.f0());
    }

    public final void s(Intent intent, zmj zmjVar, efj<JSONObject, JSONObject> efjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb31c9f", new Object[]{this, intent, zmjVar, efjVar});
            return;
        }
        String valueOf = String.valueOf(this.d);
        String e = nyj.z().e(valueOf, "preInitIoInfoTask");
        intent.putExtra(cxj.NAV_TOKEN, valueOf);
        nyj.z().N(valueOf, "preInitIoInfoTask", Boolean.TRUE);
        nyj.z().d(valueOf, "preInitParseThread", e);
        NavPreRequestManager.l().v(valueOf);
        nyj.z().t(valueOf, "preInitParseThread", true, e);
        nyj.z().d(valueOf, "intentDataCopy", e);
        Intent intent2 = r19.L0() ? intent : (Intent) intent.clone();
        nyj.z().t(valueOf, "intentDataCopy", true, e);
        mqj.l(new a(valueOf, intent2, intent, zmjVar, gmh.a(), valueOf, efjVar));
        nyj.z().u(valueOf, e, "preInitIoInfoTask", true);
    }
}
