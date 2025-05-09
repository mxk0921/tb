package com.taobao.detail.rate;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.ADaemon;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.megadesign.dx.view.DisplayVideoView;
import com.taobao.detail.rate.model.RateInfo;
import com.taobao.detail.rate.model.RateInfoV2;
import com.taobao.detail.rate.model.itemrates.entity.RateKeyword;
import com.taobao.detail.rate.view.RateListOutlineView;
import com.taobao.detail.rate.vivid.ability.RegisterReceiverAbility;
import com.taobao.detail.rate.vivid.presenter.PreRequestPresenter;
import com.taobao.detail.rate.vivid.widget.RateRootFragment;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.a07;
import tb.ahd;
import tb.ckf;
import tb.d1a;
import tb.d1g;
import tb.dgn;
import tb.dhn;
import tb.dx1;
import tb.hr;
import tb.iqw;
import tb.jqw;
import tb.kqw;
import tb.lnm;
import tb.lqw;
import tb.n9l;
import tb.odg;
import tb.onm;
import tb.pg1;
import tb.pg7;
import tb.psn;
import tb.qrf;
import tb.tdf;
import tb.tgn;
import tb.trt;
import tb.ufp;
import tb.uhn;
import tb.v7t;
import tb.vgn;
import tb.wgn;
import tb.wt6;
import tb.xgn;
import tb.xhv;
import tb.y7;
import tb.yz3;
import tb.z1x;
import tb.zdf;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00062\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/taobao/detail/rate/RateFeedsFragment;", "Landroidx/fragment/app/Fragment;", "Ltb/jqw;", "Ltb/ahd;", "<init>", "()V", "Companion", "a", TplMsg.VALUE_T_NATIVE_RETURN, "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class RateFeedsFragment extends Fragment implements jqw, ahd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String K = "Page_DetailComments2";
    public static final String L = "a1z0b.11346571";
    public static final String TAG = "RateFeedsFragment";
    public PreRequestPresenter A;
    public pg7 B;
    public tgn C;
    public wgn D;
    public Integer E;
    public Integer F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;

    /* renamed from: a  reason: collision with root package name */
    public View f10334a;
    public RateRootFragment c;
    public RateListOutlineView d;
    public RateInfo e;
    public RateInfo f;
    public String j;
    public String k;
    public String l;
    public String n;
    public List<? extends RateKeyword> o;
    public JSONObject q;
    public b r;
    public String u;
    public y7 w;
    public lnm z;
    public final String g = "recovery_params";
    public final String h = Globals.getApplication().getString(R.string.rate_ask_default_text);
    public final String i = "https://gw.alicdn.com/tps/TB1J7X6KXXXXXc4XXXXXXXXXXXX-102-60.png";
    public JSONObject m = new JSONObject();
    public JSONArray p = new JSONArray();
    public String s = dx1.Companion.b(R.string.rate_filter_by_category);
    public final JSONObject t = new JSONObject();
    public final Map<String, String> v = new LinkedHashMap();
    public String x = "false";
    public RegisterReceiverAbility.a y = new RegisterReceiverAbility.a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5b2ca55a", new Object[]{this});
            }
            return RateFeedsFragment.p2();
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface b {
        void onDismiss();

        void onShow();
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Ref$ObjectRef b;

        public c(Ref$ObjectRef ref$ObjectRef) {
            this.b = ref$ObjectRef;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            RateFeedsFragment.u2(RateFeedsFragment.this, (DinamicXEngine) this.b.element);
            RateRootFragment s2 = RateFeedsFragment.s2(RateFeedsFragment.this);
            if (s2 != null) {
                s2.renderTemplate();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class d implements tgn.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d1a f10336a;

        public d(d1a d1aVar) {
            this.f10336a = d1aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [tb.dgn] */
        @Override // tb.tgn.c
        public void onFirstFrame() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99e6aa63", new Object[]{this});
                return;
            }
            d1a d1aVar = this.f10336a;
            if (d1aVar != null) {
                d1aVar = new dgn(d1aVar);
            }
            trt.c((Runnable) d1aVar);
        }
    }

    static {
        dx1.a aVar = dx1.Companion;
        aVar.b(R.string.rate_has_picture);
        aVar.b(R.string.rate_video);
    }

    public RateFeedsFragment() {
        B2();
    }

    public static /* synthetic */ Object ipc$super(RateFeedsFragment rateFeedsFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2147180915:
                super.onSaveInstanceState((Bundle) objArr[0]);
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/RateFeedsFragment");
        }
    }

    public static final /* synthetic */ String p2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3b912c7", new Object[0]);
        }
        return L;
    }

    public static final /* synthetic */ RateListOutlineView r2(RateFeedsFragment rateFeedsFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RateListOutlineView) ipChange.ipc$dispatch("75d21820", new Object[]{rateFeedsFragment});
        }
        return rateFeedsFragment.d;
    }

    public static final /* synthetic */ RateRootFragment s2(RateFeedsFragment rateFeedsFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RateRootFragment) ipChange.ipc$dispatch("b0f8db61", new Object[]{rateFeedsFragment});
        }
        return rateFeedsFragment.c;
    }

    public static final /* synthetic */ void u2(RateFeedsFragment rateFeedsFragment, DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6ad68fb", new Object[]{rateFeedsFragment, dinamicXEngine});
        } else {
            rateFeedsFragment.O2(dinamicXEngine);
        }
    }

    public final void A2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9693f165", new Object[]{this});
        } else if (getActivity() != null) {
            b bVar = this.r;
            if (bVar != null) {
                bVar.onShow();
            }
            uhn.h(getActivity(), K, this.v);
        }
    }

    public final void B2() {
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

    public final y7 C2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y7) ipChange.ipc$dispatch("d543e49c", new Object[]{this});
        }
        return this.w;
    }

    public final JSONObject D2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9478bcee", new Object[]{this});
        }
        RateInfo rateInfo = this.e;
        if (rateInfo != null) {
            return rateInfo.getDetailRate();
        }
        return null;
    }

    public final pg7 E2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pg7) ipChange.ipc$dispatch("6fb47e82", new Object[]{this});
        }
        return this.B;
    }

    @Override // tb.ahd
    public void F0(Integer num, Integer num2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52e42072", new Object[]{this, num, num2});
            return;
        }
        this.F = num;
        if (R2(num2)) {
            v7t.d(d1g.INSTANCE.a(), "onTabUnSelect");
            z2();
        }
    }

    public final wgn J2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wgn) ipChange.ipc$dispatch("41688864", new Object[]{this});
        }
        return this.D;
    }

    @Override // tb.ahd
    public void K(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd092ef1", new Object[]{this, num});
        } else {
            this.E = num;
        }
    }

    public final PreRequestPresenter K2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreRequestPresenter) ipChange.ipc$dispatch("378118f8", new Object[]{this});
        }
        return this.A;
    }

    public final tgn M2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tgn) ipChange.ipc$dispatch("f2f1eedc", new Object[]{this});
        }
        return this.C;
    }

    public final void N2(RateInfo rateInfo) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1c1502", new Object[]{this, rateInfo});
        } else if (rateInfo != null) {
            String questionText = rateInfo.getQuestionText();
            this.j = questionText;
            if (TextUtils.isEmpty(questionText)) {
                this.j = this.h;
            }
            this.k = rateInfo.getQuestionLink();
            if (TextUtils.isEmpty(rateInfo.getQuestionIcon())) {
                str = this.i;
            } else {
                str = rateInfo.getQuestionIcon();
            }
            this.l = str;
        }
    }

    public final void O2(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9551710d", new Object[]{this, dinamicXEngine});
            return;
        }
        c3();
        RateRootFragment rateRootFragment = this.c;
        if (rateRootFragment != null) {
            rateRootFragment.initDinamicX(dinamicXEngine, n9l.INSTANCE.r(), this.m, new DXRenderOptions.b());
        }
    }

    @Override // tb.ahd
    public void P1(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2def2aab", new Object[]{this, bVar});
        } else {
            this.r = bVar;
        }
    }

    public final boolean Q2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de460eb0", new Object[]{this})).booleanValue();
        }
        if (U2()) {
            return ckf.b(this.E, this.F);
        }
        return true;
    }

    public final boolean R2(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d9dbb16", new Object[]{this, num})).booleanValue();
        }
        if (!U2() || !ckf.b(this.E, num)) {
            return false;
        }
        return true;
    }

    public final boolean S2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2254f56", new Object[]{this})).booleanValue();
        }
        RateInfo rateInfo = this.e;
        if (rateInfo == null || rateInfo.getFoldFlag() != 1) {
            return false;
        }
        return true;
    }

    public final boolean T2() {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0dd9b95", new Object[]{this})).booleanValue();
        }
        RateInfo rateInfo = this.e;
        if (rateInfo != null) {
            num = Integer.valueOf(rateInfo.getInvokeSource());
        } else {
            num = null;
        }
        return TextUtils.equals(String.valueOf(num), PreRequestPresenter.SOURCE_RATE_HISTORY);
    }

    public final boolean U2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b30ac70", new Object[]{this})).booleanValue();
        }
        RateInfo rateInfo = this.e;
        return ckf.b(rateInfo != null ? rateInfo.openMode : null, dhn.POP_MULTI_TAB);
    }

    public final boolean X2(JSONObject jSONObject, String str) {
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

    @Override // tb.ahd
    public void a0(lnm lnmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc6deefa", new Object[]{this, lnmVar});
            return;
        }
        ckf.g(lnmVar, "preRenderContext");
        if (onm.INSTANCE.b()) {
            this.z = lnmVar;
        }
    }

    public final JSONObject a3() {
        JSONObject jSONObject;
        pg7 pg7Var;
        PreRequestPresenter preRequestPresenter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ce3360f1", new Object[]{this});
        }
        if (!this.I || (pg7Var = this.B) == null || (preRequestPresenter = this.A) == null || preRequestPresenter.j() == null) {
            jSONObject = null;
        } else {
            JSONObject j = preRequestPresenter.j();
            ckf.f(j, "presenter.requestResult");
            jSONObject = pg7Var.a(j);
        }
        wgn wgnVar = this.D;
        if (wgnVar != null) {
            wgnVar.j(jSONObject);
        }
        JSONObject l = qrf.l(this.m, "exParams");
        if (l != null && l.containsKey("rateType")) {
            Object obj = l.get("rateType");
            if (!(obj instanceof String)) {
                obj = null;
            }
            if (!TextUtils.isEmpty((String) obj)) {
                jSONObject = null;
            }
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("detailRate", (Object) jSONObject);
        xhv xhvVar = xhv.INSTANCE;
        jSONObject2.put("params", (Object) jSONObject3);
        return jSONObject2;
    }

    public final void c3() {
        boolean z;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b60fa98", new Object[]{this});
        } else if (n9l.INSTANCE.j()) {
            String m = qrf.m(this.m, "itemId", "");
            if (TextUtils.isEmpty(m) || TextUtils.equals(m, "0")) {
                RateInfo rateInfo = this.e;
                if (rateInfo != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (rateInfo == null || (str = rateInfo.openMode) == null) {
                    str = "default";
                }
                vgn.c(vgn.RATE_LIST_PARAMS_CODE, str, onm.INSTANCE.b(), "init null", this.J, z);
                odg.c(TAG, "RateInfo init = " + this.m.toJSONString());
            }
        }
    }

    public final void d3() {
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
                    this.v.put("scm-pre", queryParameter);
                }
                String queryParameter2 = data.getQueryParameter("spm");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    this.v.put("spm-pre", queryParameter2);
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // tb.ahd
    public Fragment getFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("34dee721", new Object[]{this});
        }
        return this;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        JSONObject detailRate;
        pg7 pg7Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        d1g d1gVar = d1g.INSTANCE;
        v7t.d(d1gVar.a(), "onCreate.Start");
        super.onCreate(bundle);
        v2(bundle);
        d3();
        if (!U2() && n9l.INSTANCE.W()) {
            RateInfo rateInfo = this.e;
            String str = null;
            Long valueOf = rateInfo != null ? Long.valueOf(rateInfo.getClickTimeMS()) : null;
            RateInfo rateInfo2 = this.e;
            Long valueOf2 = rateInfo2 != null ? Long.valueOf(rateInfo2.getNavTimeMS()) : null;
            RateInfo rateInfo3 = this.e;
            if (rateInfo3 != null) {
                str = rateInfo3.openMode;
            }
            this.D = new wgn(valueOf, valueOf2, str);
        }
        this.B = new pg7();
        RateInfo rateInfo4 = this.e;
        if (!(rateInfo4 == null || (detailRate = rateInfo4.getDetailRate()) == null || (pg7Var = this.B) == null)) {
            pg7Var.d(detailRate);
        }
        v7t.d(d1gVar.a(), "onCreate.End");
    }

    @Override // androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        TranslateAnimation translateAnimation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("40dfa474", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
        }
        if (!onm.INSTANCE.b() || W2()) {
            return null;
        }
        if (z) {
            translateAnimation = new TranslateAnimation(2, 1.0f, 2, 0.0f, 2, 0.0f, 2, 0.0f);
        } else {
            translateAnimation = new TranslateAnimation(2, 0.0f, 2, 1.0f, 2, 0.0f, 2, 0.0f);
        }
        translateAnimation.setDuration(n9l.INSTANCE.t());
        translateAnimation.setFillAfter(true);
        translateAnimation.setInterpolator(new DecelerateInterpolator());
        return translateAnimation;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        psn.INSTANCE.d();
        lqw.d().h(this);
        b bVar = this.r;
        if (bVar != null) {
            bVar.onDismiss();
        }
        this.y.b().j();
        DisplayVideoView.Companion.b(null);
        tgn tgnVar = this.C;
        if (tgnVar != null) {
            tgnVar.s();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        if (Q2()) {
            z2();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        d1g d1gVar = d1g.INSTANCE;
        v7t.d(d1gVar.a(), "onResume.Start");
        if (Q2()) {
            A2();
        }
        v7t.d(d1gVar.a(), "onResume.End");
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
            return;
        }
        ckf.g(bundle, "outState");
        super.onSaveInstanceState(bundle);
        RateInfo rateInfo = this.f;
        if (rateInfo != null) {
            String jSONString = JSON.toJSONString(rateInfo);
            ckf.f(jSONString, "JSONObject.toJSONString(it)");
            bundle.putString(this.g, jSONString);
        }
    }

    public final void v2(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa7ef867", new Object[]{this, bundle});
            return;
        }
        try {
            if (n9l.INSTANCE.c() && bundle != null) {
                String string = bundle.getString(this.g);
                if (string != null) {
                    RateInfo rateInfo = (RateInfo) JSON.toJavaObject(JSON.parseObject(string), RateInfo.class);
                    if (rateInfo != null) {
                        d1(rateInfo);
                    }
                    odg.c(TAG, "Recovery with params");
                    return;
                }
                vgn.g(false);
                odg.c(RateFeedsWeexFragment.TAG, "Recovery need remove");
                xhv xhvVar = xhv.INSTANCE;
            }
        } catch (Exception e) {
            v7t.e(d1g.INSTANCE.a(), "Unexpected error during recovery: ".concat(e.getClass().getSimpleName()), e, new Object[0]);
        }
    }

    public final void z2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd7d922c", new Object[]{this});
        } else if (getActivity() == null) {
        } else {
            if (ckf.b(this.x, "true")) {
                uhn.i(getActivity(), "Page_Detail", this.v);
            } else {
                uhn.i(getActivity(), K, this.v);
            }
        }
    }

    @Override // tb.ahd
    public void b2(Integer num, Integer num2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10984139", new Object[]{this, num, num2});
            return;
        }
        this.F = num;
        if (R2(num)) {
            if (num != null && num.intValue() >= 0 && !this.G) {
                Long valueOf = Long.valueOf(System.currentTimeMillis());
                Long valueOf2 = Long.valueOf(System.currentTimeMillis());
                RateInfo rateInfo = this.e;
                String str = null;
                this.C = new tgn(this, valueOf, valueOf2, rateInfo != null ? rateInfo.openMode : null);
                if (n9l.INSTANCE.W()) {
                    RateInfo rateInfo2 = this.e;
                    Long valueOf3 = rateInfo2 != null ? Long.valueOf(rateInfo2.getClickTimeMS()) : null;
                    RateInfo rateInfo3 = this.e;
                    Long valueOf4 = rateInfo3 != null ? Long.valueOf(rateInfo3.getNavTimeMS()) : null;
                    RateInfo rateInfo4 = this.e;
                    if (rateInfo4 != null) {
                        str = rateInfo4.openMode;
                    }
                    this.D = new wgn(valueOf3, valueOf4, str);
                }
            }
            this.G = true;
            v7t.d(d1g.INSTANCE.a(), "onTabSelect");
            if (num2 != null && num2.intValue() != -1) {
                A2();
            }
        }
    }

    @Override // tb.jqw
    public kqw onEvent(int i, iqw iqwVar, Object... objArr) {
        hr d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kqw) ipChange.ipc$dispatch("75ee5a2a", new Object[]{this, new Integer(i), iqwVar, objArr});
        }
        ckf.g(objArr, "p2");
        if (i == 3005) {
            Object obj = objArr[0];
            if (obj instanceof String) {
                JSONObject parseObject = JSON.parseObject((String) obj);
                ckf.f(parseObject, "JSON.parseObject(p2[0] as String?)");
                Object obj2 = parseObject.get("param");
                if (!(obj2 instanceof JSONObject)) {
                    obj2 = null;
                }
                JSONObject jSONObject = (JSONObject) obj2;
                if (jSONObject != null && ckf.b("taobao_rate_list", jSONObject.get("bizId"))) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put((JSONObject) "data", (String) jSONObject);
                    y7 y7Var = this.w;
                    if (!(y7Var == null || (d2 = y7Var.d()) == null)) {
                        d2.b("AR_MAKE_UP_COMPLETED", jSONObject2);
                    }
                }
            }
        }
        return null;
    }

    public final boolean W2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78a30695", new Object[]{this})).booleanValue();
        }
        RateInfo rateInfo = this.e;
        String str = null;
        if (!ckf.b(rateInfo != null ? rateInfo.openMode : null, "pop")) {
            RateInfo rateInfo2 = this.e;
            if (rateInfo2 != null) {
                str = rateInfo2.openMode;
            }
            if (!ckf.b(str, dhn.POP_MULTI_TAB)) {
                return false;
            }
        }
        return true;
    }

    public final void b3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("452dae76", new Object[]{this});
        } else if (n9l.INSTANCE.k()) {
            vgn.e(vgn.RATE_LIST_RATE_INFO_CODE);
            odg.c(TAG, "setRateInfo, RateInfo init = " + this.m.toJSONString());
        }
    }

    @Override // tb.ahd
    public void d1(RateInfo rateInfo) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efa9ccb2", new Object[]{this, rateInfo});
            return;
        }
        v7t.d(d1g.INSTANCE.a(), "setRateInfo.Start");
        if (rateInfo == null) {
            b3();
        }
        this.f = rateInfo;
        this.J = true;
        RateInfo c2 = wt6.Companion.c(rateInfo);
        this.e = c2;
        if (c2 != null) {
            this.v.put("shop_id", c2.getShopId());
            this.v.put("seller_id", c2.getSellerId());
            this.v.put("item_id", c2.getItemId());
            this.v.put("version", "rate2.0");
            this.v.put("spm-cnt", L);
            this.v.put("spm-url", qrf.m(c2.getExParams(), "spm", ""));
            N2(c2);
            String selectTag = c2.getSelectTag();
            if (selectTag != null && selectTag.length() != 0 && c2.getRateKeywordList() != null) {
                this.n = c2.getSelectTag();
                List<RateKeyword> rateKeywordList = c2.getRateKeywordList();
                ckf.f(rateKeywordList, "it.rateKeywordList");
                if (!rateKeywordList.isEmpty()) {
                    int size = rateKeywordList.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        RateKeyword rateKeyword = rateKeywordList.get(i);
                        if (ckf.b(this.n, rateKeyword.getWord())) {
                            c2.setExpression(rateKeyword.getAttribute());
                            if (rateKeyword.getRateType() != 100) {
                                c2.setRateType(String.valueOf(rateKeyword.getRateType()));
                            }
                        } else {
                            i++;
                        }
                    }
                }
            }
            this.o = c2.getRateKeywordList();
            String skuVids = c2.getSkuVids();
            JSONObject skuInfo = c2.getSkuInfo();
            String str = null;
            if (skuInfo != null && (skuInfo.getJSONArray("props") instanceof JSONArray)) {
                JSONArray jSONArray = skuInfo.getJSONArray("props");
                this.p = jSONArray;
                if (jSONArray != null) {
                    Iterator<Integer> it = yz3.j(jSONArray).iterator();
                    while (((zdf) it).hasNext()) {
                        int nextInt = ((tdf) it).nextInt();
                        JSONArray jSONArray2 = this.p;
                        JSONObject jSONObject = jSONArray2 != null ? jSONArray2.getJSONObject(nextInt) : null;
                        if (jSONObject != null) {
                            JSONArray jSONArray3 = jSONObject.getJSONArray(pg1.ATOM_values);
                            ckf.f(jSONArray3, "array");
                            int size2 = jSONArray3.size();
                            int i2 = 0;
                            while (true) {
                                if (i2 < size2) {
                                    JSONObject jSONObject2 = jSONArray3.getJSONObject(i2);
                                    String string = jSONObject2.getString(MspEventTypes.ACTION_STRING_VID);
                                    String string2 = jSONObject2.getString("name");
                                    if (skuVids != null && ckf.b(skuVids, string)) {
                                        this.t.put((JSONObject) "vids", string);
                                        this.t.put((JSONObject) "name", string2);
                                        this.u = string2;
                                        this.s = dx1.Companion.b(R.string.rate_selected_rate);
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        }
                    }
                }
            }
            this.m.put((JSONObject) "skuVids", c2.getSkuVids());
            this.m.put((JSONObject) z1x.PRE_RENDER, "false");
            this.q = c2.getItemInfo();
            if (!U2()) {
                RateInfo rateInfo2 = this.e;
                Long valueOf = rateInfo2 != null ? Long.valueOf(rateInfo2.getClickTimeMS()) : null;
                RateInfo rateInfo3 = this.e;
                Long valueOf2 = rateInfo3 != null ? Long.valueOf(rateInfo3.getNavTimeMS()) : null;
                RateInfo rateInfo4 = this.e;
                if (rateInfo4 != null) {
                    str = rateInfo4.openMode;
                }
                this.C = new tgn(this, valueOf, valueOf2, str);
            }
            xgn xgnVar = xgn.INSTANCE;
            this.H = xgnVar.k();
            if (!xgnVar.l() && !xgnVar.d()) {
                z = false;
            }
            this.I = z;
            if (this.H) {
                this.A = new PreRequestPresenter(z, false, this.C);
            }
            initParams();
            if (this.H) {
                PreRequestPresenter preRequestPresenter = this.A;
                if (preRequestPresenter != null) {
                    preRequestPresenter.p(this.m);
                }
                PreRequestPresenter preRequestPresenter2 = this.A;
                if (preRequestPresenter2 != null) {
                    preRequestPresenter2.o();
                }
            }
        }
        v7t.d(d1g.INSTANCE.a(), "setRateInfo.End");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
        if (tb.ckf.b(r4 != null ? r4.getItemId() : null, "0") != false) goto L_0x006a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void initParams() {
        /*
            Method dump skipped, instructions count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.detail.rate.RateFeedsFragment.initParams():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v17, types: [com.taobao.android.dinamicx.DinamicXEngine, T] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View onCreateView(android.view.LayoutInflater r6, android.view.ViewGroup r7, android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.detail.rate.RateFeedsFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // tb.ahd
    public void s0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ce22d19", new Object[]{this, jSONObject});
            return;
        }
        d1g d1gVar = d1g.INSTANCE;
        String a2 = d1gVar.a();
        odg.c(a2, "setRateInfoV2.start, info:" + jSONObject);
        RateInfoV2 rateInfoV2 = (RateInfoV2) JSON.toJavaObject(jSONObject, RateInfoV2.class);
        wt6.a aVar = wt6.Companion;
        ckf.f(rateInfoV2, "rateInfoV2");
        RateInfo e = aVar.e(rateInfoV2);
        odg.c(d1gVar.a(), "setRateInfoV2.end.");
        d1(e);
    }
}
