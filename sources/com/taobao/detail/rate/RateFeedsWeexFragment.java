package com.taobao.detail.rate;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.UltronTradeHybridDialogFragment;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.ADaemon;
import com.taobao.detail.rate.RateFeedsFragment;
import com.taobao.detail.rate.model.RateInfo;
import com.taobao.detail.rate.model.RateInfoV2;
import com.taobao.detail.rate.vivid.utils.WeexUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.ahd;
import tb.ckf;
import tb.d1g;
import tb.dhn;
import tb.frn;
import tb.lnm;
import tb.n9l;
import tb.odg;
import tb.onm;
import tb.qbv;
import tb.qrf;
import tb.trt;
import tb.ufp;
import tb.uhn;
import tb.v7t;
import tb.vgn;
import tb.wt6;
import tb.xgn;
import tb.ykz;
import tb.zgn;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00052\u00020\u00012\u00020\u0002:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/taobao/detail/rate/RateFeedsWeexFragment;", "Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/widget/UltronTradeHybridDialogFragment;", "Ltb/ahd;", "<init>", "()V", "Companion", "a", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class RateFeedsWeexFragment extends UltronTradeHybridDialogFragment implements ahd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static String O = "Page_DetailComments2";
    public static String P = "a1z0b.11346571";
    public static final String TAG = "RateFeedsWeexFragment";
    public RateInfo E;
    public JSONObject F;
    public boolean G;
    public RateFeedsFragment.b H;
    public Integer K;
    public Integer M;
    public boolean N;
    public final Map<String, String> I = new LinkedHashMap();
    public String J = "false";
    public final String L = "recovery_params_is_pop";
    public final long S0 = 3000;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f36896c", new Object[]{this});
            }
            return RateFeedsWeexFragment.S3();
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f44a798e", new Object[]{this});
            }
            return RateFeedsWeexFragment.T3();
        }

        public final String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a3a8518b", new Object[]{this});
            }
            return RateFeedsWeexFragment.U3();
        }

        public final String d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("53e67f22", new Object[]{this});
            }
            return RateFeedsWeexFragment.V3();
        }

        public final String e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c02a3823", new Object[]{this});
            }
            return RateFeedsWeexFragment.W3();
        }

        public final String f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("29000150", new Object[]{this});
            }
            return RateFeedsWeexFragment.X3();
        }

        public final String g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("44ea2228", new Object[]{this});
            }
            return RateFeedsWeexFragment.Y3();
        }

        public final String h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("51812a0e", new Object[]{this});
            }
            return RateFeedsWeexFragment.Z3();
        }

        public final void i(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("de756e21", new Object[]{this, str});
                return;
            }
            ckf.g(str, "<set-?>");
            RateFeedsWeexFragment.a(str);
        }

        public final void j(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("46aa945c", new Object[]{this, str});
                return;
            }
            ckf.g(str, "<set-?>");
            RateFeedsWeexFragment.b(str);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final b INSTANCE = new b();

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ykz.Companion.a(null);
            }
        }
    }

    public RateFeedsWeexFragment() {
        d4();
    }

    public static final /* synthetic */ String S3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b299d75", new Object[0]);
        }
        return "bizName";
    }

    public static final /* synthetic */ String T3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98353213", new Object[0]);
        }
        return UltronWeex2DialogFragment.CONTAINER_BIZ_NAME;
    }

    public static final /* synthetic */ String U3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e3a42cf6", new Object[0]);
        }
        return UltronWeex2DialogFragment.CONTAINER_RES_ID;
    }

    public static final /* synthetic */ String V3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367f3a7f", new Object[0]);
        }
        return UltronWeex2DialogFragment.EXPECT_HEIGHT;
    }

    public static final /* synthetic */ String W3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b373ff5e", new Object[0]);
        }
        return UltronWeex2DialogFragment.EXPECT_WIDTH;
    }

    public static final /* synthetic */ String X3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5545c191", new Object[0]);
        }
        return UltronWeex2DialogFragment.IS_INSTANCE_REUSE;
    }

    public static final /* synthetic */ String Y3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4cb771b9", new Object[0]);
        }
        return "isPreRender";
    }

    public static final /* synthetic */ String Z3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4d53813", new Object[0]);
        }
        return UltronWeex2DialogFragment.WEEX2_URL;
    }

    public static final /* synthetic */ void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e038e92", new Object[]{str});
        } else {
            O = str;
        }
    }

    public static final /* synthetic */ void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b3ec0f7", new Object[]{str});
        } else {
            P = str;
        }
    }

    public static /* synthetic */ Object ipc$super(RateFeedsWeexFragment rateFeedsWeexFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2147180915:
                super.onSaveInstanceState((Bundle) objArr[0]);
                return null;
            case -1589549411:
                super.onAttach((Context) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/RateFeedsWeexFragment");
        }
    }

    @Override // tb.ahd
    public void F0(Integer num, Integer num2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52e42072", new Object[]{this, num, num2});
            return;
        }
        this.M = num;
        if (f4(num2)) {
            v7t.d(d1g.INSTANCE.a(), "onTabUnSelect");
            b4();
        }
    }

    @Override // tb.ahd
    public void K(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd092ef1", new Object[]{this, num});
        } else {
            this.K = num;
        }
    }

    @Override // tb.ahd
    public void P1(RateFeedsFragment.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2def2aab", new Object[]{this, bVar});
        } else {
            this.H = bVar;
        }
    }

    @Override // tb.ahd
    public void a0(lnm lnmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc6deefa", new Object[]{this, lnmVar});
        } else {
            ckf.g(lnmVar, "preRenderContext");
        }
    }

    public final void a4(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89b939af", new Object[]{this, bundle});
            return;
        }
        try {
            if (n9l.INSTANCE.c() && bundle != null) {
                bundle.getBoolean(this.L, true);
                if (this.N && this.F == null) {
                    vgn.g(true);
                    odg.c(TAG, "Recovery need remove");
                }
            }
        } catch (Exception e) {
            v7t.e(d1g.INSTANCE.a(), "Unexpected error during recovery: ".concat(e.getClass().getSimpleName()), e, new Object[0]);
        }
    }

    @Override // tb.ahd
    public void b2(Integer num, Integer num2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10984139", new Object[]{this, num, num2});
            return;
        }
        this.M = num;
        if (f4(num)) {
            v7t.d(d1g.INSTANCE.a(), "onTabSelect");
            if (num2 != null && num2.intValue() != -1) {
                c4();
            }
        }
    }

    public final void b4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd7d922c", new Object[]{this});
        } else if (getActivity() == null) {
        } else {
            if (ckf.b(this.J, "true")) {
                uhn.i(getActivity(), "Page_Detail", this.I);
            } else {
                uhn.i(getActivity(), O, this.I);
            }
        }
    }

    public final void c4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9693f165", new Object[]{this});
        } else if (getActivity() != null) {
            RateFeedsFragment.b bVar = this.H;
            if (bVar != null) {
                bVar.onShow();
            }
            uhn.h(getActivity(), O, this.I);
        }
    }

    @Override // tb.ahd
    public void d1(RateInfo rateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efa9ccb2", new Object[]{this, rateInfo});
            return;
        }
        if (!this.N) {
            frn.INSTANCE.a();
        }
        if (!this.G) {
            this.F = new zgn().a(rateInfo);
        }
        RateInfo c = wt6.Companion.c(rateInfo);
        this.E = c;
        if (c != null) {
            this.I.put("shop_id", c.getShopId());
            this.I.put("seller_id", c.getSellerId());
            this.I.put("item_id", c.getItemId());
            this.I.put("version", "rate2.0");
            this.I.put("spm-cnt", P);
            this.I.put("spm-url", qrf.m(c.getExParams(), "spm", ""));
            this.I.put("env_type", "weex");
            initParams();
        }
    }

    public final void d4() {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e3aeb05", new Object[]{this});
        } else if (xgn.INSTANCE.c()) {
            if (ufp.INSTANCE.a()) {
                i = 2;
            }
            ADaemon.boostCpu(i);
        }
    }

    public final boolean e4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de460eb0", new Object[]{this})).booleanValue();
        }
        if (g4()) {
            return ckf.b(this.K, this.M);
        }
        return true;
    }

    public final boolean f4(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d9dbb16", new Object[]{this, num})).booleanValue();
        }
        if (!g4() || !ckf.b(this.K, num)) {
            return false;
        }
        return true;
    }

    public final boolean g4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b30ac70", new Object[]{this})).booleanValue();
        }
        RateInfo rateInfo = this.E;
        return ckf.b(rateInfo != null ? rateInfo.openMode : null, dhn.POP_MULTI_TAB);
    }

    @Override // tb.ahd
    public Fragment getFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("34dee721", new Object[]{this});
        }
        return this;
    }

    public final boolean i4(JSONObject jSONObject, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa8a050d", new Object[]{this, jSONObject, str})).booleanValue();
        }
        if (jSONObject != null) {
            str2 = jSONObject.getString("invokeSource");
        } else {
            str2 = null;
        }
        if (str2 == null || !ckf.b(str, jSONObject.getString("invokeSource"))) {
            return false;
        }
        return true;
    }

    public final void j4(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d93d2518", new Object[]{this, jSONObject});
            return;
        }
        this.F = jSONObject;
        RateInfoV2 rateInfoV2 = (RateInfoV2) JSON.toJavaObject(jSONObject, RateInfoV2.class);
        wt6.a aVar = wt6.Companion;
        ckf.f(rateInfoV2, "rateInfoV2");
        d1(aVar.e(rateInfoV2));
    }

    public final void k4() {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2130122", new Object[]{this});
            return;
        }
        try {
            FragmentActivity activity = getActivity();
            Uri data = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getData();
            if (data != null) {
                String queryParameter = data.getQueryParameter("scm");
                if (!TextUtils.isEmpty(queryParameter)) {
                    this.I.put("scm-pre", queryParameter);
                }
                String queryParameter2 = data.getQueryParameter("spm");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    this.I.put("spm-pre", queryParameter2);
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.UltronTradeHybridDialogFragment, com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment, com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.TradeHybridBaseFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        JSONObject b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
            return;
        }
        ckf.g(context, "context");
        if (n9l.INSTANCE.c() && (b2 = frn.INSTANCE.b()) != null) {
            this.N = true;
            odg.c(TAG, "Recovery with params");
            j4(b2);
            WeexUtils.INSTANCE.b(b2, this, true);
        }
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        a4(bundle);
        k4();
        if (n9l.INSTANCE.l()) {
            trt.d(b.INSTANCE, this.S0);
        }
    }

    @Override // com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.UltronTradeHybridDialogFragment, com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment, androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        TranslateAnimation translateAnimation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("40dfa474", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
        }
        if (!onm.INSTANCE.b() || h4()) {
            return null;
        }
        if (z) {
            translateAnimation = new TranslateAnimation(2, 1.0f, 2, 0.0f, 2, 0.0f, 2, 0.0f);
        } else {
            translateAnimation = new TranslateAnimation(2, 0.0f, 2, 1.0f, 2, 0.0f, 2, 0.0f);
        }
        translateAnimation.setDuration(n9l.INSTANCE.G());
        translateAnimation.setFillAfter(true);
        translateAnimation.setInterpolator(new DecelerateInterpolator());
        return translateAnimation;
    }

    @Override // com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        RateFeedsFragment.b bVar = this.H;
        if (bVar != null) {
            bVar.onDismiss();
        }
        qbv j = qbv.j();
        ckf.f(j, "UltronTradeHybridManager.getInstance()");
        j.p().b("");
        if (n9l.INSTANCE.c() && !g4() && (jSONObject = this.F) != null) {
            frn.INSTANCE.c(jSONObject);
        }
    }

    @Override // com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment, com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.TradeHybridBaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        if (e4()) {
            b4();
        }
    }

    @Override // com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.UltronTradeHybridDialogFragment, com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment, androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        d1g d1gVar = d1g.INSTANCE;
        v7t.d(d1gVar.a(), "onResume.Start");
        if (e4()) {
            c4();
        }
        v7t.d(d1gVar.a(), "onResume.End");
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
            return;
        }
        ckf.g(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(this.L, h4());
    }

    @Override // tb.ahd
    public void s0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ce22d19", new Object[]{this, jSONObject});
            return;
        }
        this.G = true;
        j4(jSONObject);
    }

    public final boolean h4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78a30695", new Object[]{this})).booleanValue();
        }
        RateInfo rateInfo = this.E;
        String str = null;
        if (!ckf.b(rateInfo != null ? rateInfo.openMode : null, "pop")) {
            RateInfo rateInfo2 = this.E;
            if (rateInfo2 != null) {
                str = rateInfo2.openMode;
            }
            if (!ckf.b(str, dhn.POP_MULTI_TAB)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
        if (tb.ckf.b(r3, "0") != false) goto L_0x006a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void initParams() {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.detail.rate.RateFeedsWeexFragment.initParams():void");
    }
}
