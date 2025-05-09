package com.alibaba.android.ultron.vfw.weex2.highPerformance.themis;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridPreRenderRecyclePolicy;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.TradeHybridBaseFragment;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.themis.external.embed.TMSEmbed;
import com.taobao.themis.external.embed.TMSEmbedSolutionType;
import com.taobao.themis.external.embed.WebStartParams;
import com.taobao.themis.kernel.extension.page.rum.TMSEmbedPresentModeType;
import com.taobao.themis.kernel.extension.page.rum.TMSRumTarget;
import com.ut.mini.UTAnalytics;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.a07;
import tb.ckf;
import tb.dbv;
import tb.f7l;
import tb.hav;
import tb.i2c;
import tb.jpu;
import tb.kzw;
import tb.l2e;
import tb.lqb;
import tb.mbv;
import tb.mgw;
import tb.nbv;
import tb.pbe;
import tb.qbv;
import tb.qxq;
import tb.ssq;
import tb.sxl;
import tb.t2o;
import tb.v3i;
import tb.v9v;
import tb.wsq;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00042\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/themis/TradeHybridTMSFragment;", "Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/widget/TradeHybridBaseFragment;", "<init>", "()V", "Companion", "a", TplMsg.VALUE_T_NATIVE_RETURN, "ultron-view-kit_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class TradeHybridTMSFragment extends TradeHybridBaseFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TMS_BIZ_NAME = "tmsBizName";
    public static final String TMS_CONTAINER_RES_ID = "tmsContainerResId";
    public static final String TMS_FRAGMENT_TAG = "tmsFragmentTag";
    public static final String TMS_SCENE_NAME = "tmsSceneName";
    public TMSEmbed c;
    public ViewGroup d;
    public int e = -1;
    public String f = "";
    public String g = "";
    public String h = "";
    public boolean i;
    public long j;
    public boolean k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(157286896);
        }

        public a() {
        }

        @JvmStatic
        public final TradeHybridTMSFragment a(Bundle bundle) {
            String str;
            String string;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TradeHybridTMSFragment) ipChange.ipc$dispatch("80600a7d", new Object[]{this, bundle});
            }
            TradeHybridTMSFragment tradeHybridTMSFragment = new TradeHybridTMSFragment();
            String str2 = "";
            if (bundle == null || (str = bundle.getString(TradeHybridTMSFragment.TMS_BIZ_NAME)) == null) {
                str = str2;
            }
            TradeHybridTMSFragment.v2(tradeHybridTMSFragment, str);
            if (!(bundle == null || (string = bundle.getString(TradeHybridTMSFragment.TMS_SCENE_NAME)) == null)) {
                str2 = string;
            }
            TradeHybridTMSFragment.A2(tradeHybridTMSFragment, str2);
            TradeHybridTMSFragment.z2(tradeHybridTMSFragment, bundle != null ? bundle.getInt(TradeHybridTMSFragment.TMS_CONTAINER_RES_ID) : -1);
            return tradeHybridTMSFragment;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static abstract class b {

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class a extends b {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final Integer f2374a;
            public final Integer b;
            public final Intent c;

            static {
                t2o.a(157286898);
            }

            public a(Integer num, Integer num2, Intent intent) {
                super(null);
                this.f2374a = num;
                this.b = num2;
                this.c = intent;
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/weex2/highPerformance/themis/TradeHybridTMSFragment$HostLifeCycle$OnActivityResult");
            }

            public final Intent a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Intent) ipChange.ipc$dispatch("78f0a48c", new Object[]{this});
                }
                return this.c;
            }

            public final Integer b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Integer) ipChange.ipc$dispatch("7e649b54", new Object[]{this});
                }
                return this.f2374a;
            }

            public final Integer c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Integer) ipChange.ipc$dispatch("8fe0838e", new Object[]{this});
                }
                return this.b;
            }

            public boolean equals(Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
                }
                if (this != obj) {
                    if (obj instanceof a) {
                        a aVar = (a) obj;
                        if (!ckf.b(this.f2374a, aVar.f2374a) || !ckf.b(this.b, aVar.b) || !ckf.b(this.c, aVar.c)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                int i;
                int i2;
                int i3 = 0;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
                }
                Integer num = this.f2374a;
                if (num != null) {
                    i = num.hashCode();
                } else {
                    i = 0;
                }
                int i4 = i * 31;
                Integer num2 = this.b;
                if (num2 != null) {
                    i2 = num2.hashCode();
                } else {
                    i2 = 0;
                }
                int i5 = (i4 + i2) * 31;
                Intent intent = this.c;
                if (intent != null) {
                    i3 = intent.hashCode();
                }
                return i5 + i3;
            }

            public String toString() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
                }
                return "OnActivityResult(requestCode=" + this.f2374a + ", resultCode=" + this.b + ", data=" + this.c + f7l.BRACKET_END_STR;
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.alibaba.android.ultron.vfw.weex2.highPerformance.themis.TradeHybridTMSFragment$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class C0079b extends b {
            public static final C0079b INSTANCE = new C0079b();

            static {
                t2o.a(157286899);
            }

            public C0079b() {
                super(null);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class c extends b {
            public static final c INSTANCE = new c();

            static {
                t2o.a(157286900);
            }

            public c() {
                super(null);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class d extends b {
            public static final d INSTANCE = new d();

            static {
                t2o.a(157286901);
            }

            public d() {
                super(null);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class e extends b {
            public static final e INSTANCE = new e();

            static {
                t2o.a(157286902);
            }

            public e() {
                super(null);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class f extends b {
            public static final f INSTANCE = new f();

            static {
                t2o.a(157286903);
            }

            public f() {
                super(null);
            }
        }

        static {
            t2o.a(157286897);
        }

        public b() {
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c extends TMSEmbed.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class a implements lqb.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // tb.lqb.a
            public final void onClose() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e155e360", new Object[]{this});
                } else {
                    TradeHybridTMSFragment.D2(TradeHybridTMSFragment.this, false, 1, null);
                }
            }
        }

        public c(String str, JSONObject jSONObject) {
            this.b = str;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -1799497502:
                    super.c((String) objArr[0], (String) objArr[1]);
                    return null;
                case -936190188:
                    super.m();
                    return null;
                case -799572052:
                    super.d();
                    return null;
                case -302283915:
                    super.n();
                    return null;
                case 396799279:
                    return new Boolean(super.b(((Boolean) objArr[0]).booleanValue(), (String) objArr[1], (String) objArr[2]));
                case 940156793:
                    super.f();
                    return null;
                case 1131744663:
                    super.e();
                    return null;
                case 2123836685:
                    super.l((String) objArr[0], (String) objArr[1]);
                    return null;
                default:
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/weex2/highPerformance/themis/TradeHybridTMSFragment$initTMSEmbed$$inlined$apply$lambda$1");
            }
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public boolean b(boolean z, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("17a6ad2f", new Object[]{this, new Boolean(z), str, str2})).booleanValue();
            }
            ckf.g(str, "errorCode");
            ckf.g(str2, "errorMsg");
            hav.g("TradeHybridTMSFragment", "displayTMSContainer:", "onDowngrade, errorCode: " + str + ", errorMsg: " + str2);
            TradeHybridTMSFragment.u2(TradeHybridTMSFragment.this, this.b, "onDowngrade");
            return super.b(z, str, str2);
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void c(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94bdd8e2", new Object[]{this, str, str2});
                return;
            }
            ckf.g(str, "errorCode");
            ckf.g(str2, "errorMsg");
            hav.g("TradeHybridTMSFragment", "displayTMSContainer:", "onJSException, errorCode: " + str + ", errorMsg: " + str2);
            TradeHybridTMSFragment.u2(TradeHybridTMSFragment.this, this.b, "onJSException");
            super.c(str, str2);
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void d() {
            lqb lqbVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0577fac", new Object[]{this});
                return;
            }
            hav.g("TradeHybridTMSFragment", "displayTMSContainer:", sxl.LAUNCHER_FINISH_TIME);
            super.d();
            TMSEmbed r2 = TradeHybridTMSFragment.r2(TradeHybridTMSFragment.this);
            if (r2 != null && (lqbVar = (lqb) r2.g(lqb.class)) != null) {
                lqbVar.n1(new a());
            }
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43750d97", new Object[]{this});
                return;
            }
            hav.g("TradeHybridTMSFragment", "displayTMSContainer:", sxl.LAUNCHER_START_TIME);
            super.e();
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3809a779", new Object[]{this});
                return;
            }
            hav.g("TradeHybridTMSFragment", "displayTMSContainer:", "onPop");
            super.f();
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void l(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e972d0d", new Object[]{this, str, str2});
                return;
            }
            ckf.g(str, "errorCode");
            ckf.g(str2, "errorMsg");
            hav.g("TradeHybridTMSFragment", "displayTMSContainer:", "onRenderFailed, errorCode: " + str + ", errorMsg: " + str2);
            TradeHybridTMSFragment.u2(TradeHybridTMSFragment.this, this.b, "onRenderFailed");
            super.l(str, str2);
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c832df14", new Object[]{this});
                return;
            }
            hav.g("TradeHybridTMSFragment", "displayTMSContainer:", sxl.RENDER_START_TIME);
            super.m();
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edfb8375", new Object[]{this});
                return;
            }
            hav.g("TradeHybridTMSFragment", "displayTMSContainer:", sxl.RENDER_SUCCESS_TIME);
            super.n();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class d implements kzw {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        public d(String str, JSONObject jSONObject) {
            this.b = str;
        }

        @Override // tb.kzw
        public void a(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("321c63f8", new Object[]{this, str, new Integer(i), str2});
                return;
            }
            TradeHybridTMSFragment.u2(TradeHybridTMSFragment.this, this.b, "onWebHttpError");
            if (str != null) {
                TradeHybridTMSFragment.s2(TradeHybridTMSFragment.this, str, i);
            }
            hav.g("TradeHybridTMSFragment", "onReceiveError:", "onWebHttpError, errorCode: " + i + ", errorMsg: " + str2 + ", errorUrl: " + str + ", ");
        }
    }

    static {
        t2o.a(157286895);
    }

    public static final /* synthetic */ void A2(TradeHybridTMSFragment tradeHybridTMSFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc35cb59", new Object[]{tradeHybridTMSFragment, str});
        } else {
            tradeHybridTMSFragment.g = str;
        }
    }

    public static /* synthetic */ void D2(TradeHybridTMSFragment tradeHybridTMSFragment, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8460c44d", new Object[]{tradeHybridTMSFragment, new Boolean(z), new Integer(i), obj});
            return;
        }
        if ((i & 1) != 0) {
            z = false;
        }
        tradeHybridTMSFragment.C2(z);
    }

    public static /* synthetic */ void K2(TradeHybridTMSFragment tradeHybridTMSFragment, Activity activity, String str, JSONObject jSONObject, FragmentManager fragmentManager, Fragment fragment, boolean z, int i, Object obj) {
        Fragment fragment2;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14ec21ed", new Object[]{tradeHybridTMSFragment, activity, str, jSONObject, fragmentManager, fragment, new Boolean(z), new Integer(i), obj});
            return;
        }
        if ((i & 16) != 0) {
            fragment2 = null;
        } else {
            fragment2 = fragment;
        }
        if ((i & 32) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        tradeHybridTMSFragment.J2(activity, str, jSONObject, fragmentManager, fragment2, z2);
    }

    @JvmStatic
    public static final TradeHybridTMSFragment M2(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TradeHybridTMSFragment) ipChange.ipc$dispatch("80600a7d", new Object[]{bundle});
        }
        return Companion.a(bundle);
    }

    public static /* synthetic */ Object ipc$super(TradeHybridTMSFragment tradeHybridTMSFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1589549411:
                super.onAttach((Context) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 2127624665:
                super.onDetach();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/weex2/highPerformance/themis/TradeHybridTMSFragment");
        }
    }

    public static final /* synthetic */ TMSEmbed r2(TradeHybridTMSFragment tradeHybridTMSFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSEmbed) ipChange.ipc$dispatch("46e3c968", new Object[]{tradeHybridTMSFragment});
        }
        return tradeHybridTMSFragment.c;
    }

    public static final /* synthetic */ void s2(TradeHybridTMSFragment tradeHybridTMSFragment, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3009450e", new Object[]{tradeHybridTMSFragment, str, new Integer(i)});
        } else {
            tradeHybridTMSFragment.R2(str, i);
        }
    }

    public static final /* synthetic */ void u2(TradeHybridTMSFragment tradeHybridTMSFragment, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10a94171", new Object[]{tradeHybridTMSFragment, str, str2});
        } else {
            tradeHybridTMSFragment.S2(str, str2);
        }
    }

    public static final /* synthetic */ void v2(TradeHybridTMSFragment tradeHybridTMSFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43f79fe0", new Object[]{tradeHybridTMSFragment, str});
        } else {
            tradeHybridTMSFragment.f = str;
        }
    }

    public static final /* synthetic */ void z2(TradeHybridTMSFragment tradeHybridTMSFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23bd2ca1", new Object[]{tradeHybridTMSFragment, new Integer(i)});
        } else {
            tradeHybridTMSFragment.e = i;
        }
    }

    public final boolean O2(Integer num, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fde41d72", new Object[]{this, num, keyEvent})).booleanValue();
        }
        if (!this.i || num == null || num.intValue() != 4) {
            return false;
        }
        D2(this, false, 1, null);
        return true;
    }

    public final void Q2(b bVar) {
        TMSEmbed tMSEmbed;
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f705200", new Object[]{this, bVar});
            return;
        }
        ckf.g(bVar, "hostLifeCycle");
        if (bVar instanceof b.e) {
            TMSEmbed tMSEmbed2 = this.c;
            if (tMSEmbed2 != null) {
                tMSEmbed2.n();
            }
        } else if (bVar instanceof b.d) {
            TMSEmbed tMSEmbed3 = this.c;
            if (tMSEmbed3 != null) {
                tMSEmbed3.m();
            }
        } else if (bVar instanceof b.c) {
            TMSEmbed tMSEmbed4 = this.c;
            if (tMSEmbed4 != null) {
                tMSEmbed4.k();
            }
        } else if (bVar instanceof b.f) {
            TMSEmbed tMSEmbed5 = this.c;
            if (tMSEmbed5 != null) {
                tMSEmbed5.o();
            }
        } else if (bVar instanceof b.C0079b) {
            TMSEmbed tMSEmbed6 = this.c;
            if (tMSEmbed6 != null) {
                tMSEmbed6.d();
            }
        } else if ((bVar instanceof b.a) && (tMSEmbed = this.c) != null) {
            b.a aVar = (b.a) bVar;
            Integer b2 = aVar.b();
            if (b2 != null) {
                i = b2.intValue();
            } else {
                i = 0;
            }
            Integer c2 = aVar.c();
            if (c2 != null) {
                i2 = c2.intValue();
            }
            tMSEmbed.l(i, i2, aVar.a());
        }
    }

    public final void S2(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae63f4", new Object[]{this, str, str2});
        } else {
            nbv.a(nbv.a.a("TMSError").success(false).message(String.format("%s - %s", Arrays.copyOf(new Object[]{str2, str}, 2))).sampling(1.0f));
        }
    }

    public final void U2(String str) {
        i2c i2cVar;
        i2c i2cVar2;
        String queryParameter;
        Long o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4819058c", new Object[]{this, str});
            return;
        }
        try {
            if (str.length() != 0) {
                Uri parse = Uri.parse(str);
                long longValue = (parse == null || (queryParameter = parse.getQueryParameter("jt_pt_navStartTime")) == null || (o = ssq.o(queryParameter)) == null) ? 0L : o.longValue();
                TMSEmbed tMSEmbed = this.c;
                if (!(tMSEmbed == null || (i2cVar2 = (i2c) tMSEmbed.g(i2c.class)) == null)) {
                    i2cVar2.S(v3i.f(jpu.a("topic", dbv.BIZ_REFUND_DETAIL)), TMSRumTarget.STANDARD);
                }
                TMSEmbed tMSEmbed2 = this.c;
                if (tMSEmbed2 != null && (i2cVar = (i2c) tMSEmbed2.g(i2c.class)) != null) {
                    i2cVar.M(v3i.f(jpu.a("userActionStart", Long.valueOf(longValue))), TMSRumTarget.STANDARD);
                }
            }
        } catch (Throwable th) {
            hav.d("TradeHybridTMSFragment", "rum error! " + th);
        }
    }

    @Override // com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.TradeHybridBaseFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
            return;
        }
        super.onAttach(context);
        W2(true);
        UTAnalytics instance = UTAnalytics.getInstance();
        ckf.f(instance, "UTAnalytics.getInstance()");
        instance.getDefaultTracker().pageDisAppear(getActivity());
        this.k = false;
    }

    @Override // androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("40dfa474", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
        }
        long j = 250;
        if (z) {
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
            translateAnimation.setDuration(250L);
            return translateAnimation;
        }
        TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 1.0f, 1, 0.0f, 1, 0.0f);
        if (this.k) {
            j = 0;
        }
        translateAnimation2.setDuration(j);
        return translateAnimation2;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View h;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        ckf.g(layoutInflater, "inflater");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            FrameLayout frameLayout = new FrameLayout(activity);
            this.d = frameLayout;
            int e = mgw.e(activity);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
            if (e > 0) {
                i = e;
            }
            marginLayoutParams.topMargin = i;
            xhv xhvVar = xhv.INSTANCE;
            frameLayout.setLayoutParams(marginLayoutParams);
            frameLayout.setBackgroundColor(-1);
            TMSEmbed tMSEmbed = this.c;
            if (!(tMSEmbed == null || (h = tMSEmbed.h()) == null)) {
                ViewParent parent = h.getParent();
                if (!(parent instanceof ViewGroup)) {
                    parent = null;
                }
                ViewGroup viewGroup2 = (ViewGroup) parent;
                if (viewGroup2 != null) {
                    viewGroup2.removeView(h);
                }
                frameLayout.addView(h);
            }
        }
        return this.d;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        Q2(b.C0079b.INSTANCE);
        if (!UltronTradeHybridSwitcherHelper.e(this.g, this.f)) {
            hav.g("TradeHybridTMSFragment", "onDestroy:", "switcher is off, " + this.g + " - " + this.f);
            return;
        }
        String str = this.f;
        if (str == null || str.length() == 0) {
            hav.g("TradeHybridTMSFragment", "onDestroy:", "tmsBizName is NullOrEmpty");
            return;
        }
        qbv j = qbv.j();
        ckf.f(j, "UltronTradeHybridManager.getInstance()");
        mbv d2 = j.h().d(this.h);
        if (d2 == null || TextUtils.isEmpty(d2.f)) {
            hav.g("TradeHybridTMSFragment", "onDestroy:", "preRenderModel is invalid");
            return;
        }
        String str2 = d2.f;
        if (str2.hashCode() == -224113450 && str2.equals(UltronTradeHybridPreRenderRecyclePolicy.DESTROY_REBUILD)) {
            qbv j2 = qbv.j();
            ckf.f(j2, "UltronTradeHybridManager.getInstance()");
            JSONObject t = j2.n().t(this.f);
            qbv j3 = qbv.j();
            ckf.f(j3, "UltronTradeHybridManager.getInstance()");
            j3.n().w(d2, t);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
            return;
        }
        super.onDetach();
        W2(false);
        UTAnalytics instance = UTAnalytics.getInstance();
        ckf.f(instance, "UTAnalytics.getInstance()");
        instance.getDefaultTracker().pageAppearDonotSkip(getActivity());
    }

    @Override // com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.TradeHybridBaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        UTAnalytics instance = UTAnalytics.getInstance();
        ckf.f(instance, "UTAnalytics.getInstance()");
        instance.getDefaultTracker().pageDisAppear(getActivity());
        Q2(b.c.INSTANCE);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        UTAnalytics instance = UTAnalytics.getInstance();
        ckf.f(instance, "UTAnalytics.getInstance()");
        instance.getDefaultTracker().pageAppearDonotSkip(getActivity());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        Q2(b.e.INSTANCE);
    }

    @Override // com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.TradeHybridBaseFragment
    public String p2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72d4e50f", new Object[]{this});
        }
        String str = this.h;
        if (str == null || str.length() == 0) {
            return "";
        }
        return this.h;
    }

    public final void C2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e676dac", new Object[]{this, new Boolean(z)});
            return;
        }
        FragmentActivity activity = getActivity();
        if (!(activity instanceof FragmentActivity) || activity.getSupportFragmentManager() == null) {
            hav.g("TradeHybridTMSFragment", "dismissByTMSHost:", "activity is not FragmentActivity");
        } else if (!(activity instanceof l2e) && !(qxq.h(activity.getSupportFragmentManager()) instanceof l2e)) {
            hav.g("TradeHybridTMSFragment", "dismissByTMSHost:", "ITradeHybridTMSHost is invalid");
        } else if (!B2(activity)) {
            hav.g("TradeHybridTMSFragment", "dismissByTMSHost:", "container is invalid");
        } else {
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            TradeHybridTMSFragment tradeHybridTMSFragment = null;
            Fragment findFragmentByTag = supportFragmentManager != null ? supportFragmentManager.findFragmentByTag(TMS_FRAGMENT_TAG) : null;
            if (findFragmentByTag instanceof TradeHybridTMSFragment) {
                tradeHybridTMSFragment = findFragmentByTag;
            }
            TradeHybridTMSFragment tradeHybridTMSFragment2 = tradeHybridTMSFragment;
            if (z) {
                try {
                    this.k = true;
                } catch (Throwable th) {
                    String str = this.h;
                    if (str == null) {
                        str = "";
                    }
                    S2(str, "dismissByTMSHost" + th);
                    return;
                }
            }
            if (tradeHybridTMSFragment2 != null) {
                tradeHybridTMSFragment2.dismissAllowingStateLoss();
            }
        }
    }

    public final void J2(Activity activity, String str, JSONObject jSONObject, FragmentManager fragmentManager, Fragment fragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7022748c", new Object[]{this, activity, str, jSONObject, fragmentManager, fragment, new Boolean(z)});
            return;
        }
        try {
            N2(activity, str, jSONObject);
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            if (z && fragment != null) {
                beginTransaction.remove(fragment);
            }
            beginTransaction.add(this.e, this, TMS_FRAGMENT_TAG);
            if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_COMMON_CONTAINER, "enableAddTMSFragmentNow", false)) {
                beginTransaction.commitNowAllowingStateLoss();
            } else {
                beginTransaction.commitAllowingStateLoss();
            }
            this.j = System.currentTimeMillis();
            this.h = str;
            T2(false, str);
        } catch (Throwable th) {
            hav.g("TradeHybridTMSFragment", "displayFragment:", "error: " + th);
        }
    }

    public final void N2(Activity activity, String str, JSONObject jSONObject) {
        TMSEmbed tMSEmbed;
        pbe pbeVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c00d167e", new Object[]{this, activity, str, jSONObject});
            return;
        }
        TMSEmbed tMSEmbed2 = new TMSEmbed(activity, TMSEmbedSolutionType.WEB_SINGLE_PAGE);
        this.c = tMSEmbed2;
        tMSEmbed2.r(new c(str, jSONObject));
        WebStartParams webStartParams = new WebStartParams();
        webStartParams.setEmbedType(TMSEmbedPresentModeType.PAGE);
        webStartParams.setUrl(str);
        if (jSONObject != null) {
            webStartParams.setInitData(jSONObject);
        }
        xhv xhvVar = xhv.INSTANCE;
        tMSEmbed2.i(webStartParams);
        tMSEmbed2.u();
        U2(str);
        if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_THEMIS, "redirectByWebError", true) && (tMSEmbed = this.c) != null && (pbeVar = (pbe) tMSEmbed.g(pbe.class)) != null) {
            pbeVar.f1(new d(str, jSONObject));
        }
    }

    public final void T2(boolean z, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e012943d", new Object[]{this, new Boolean(z), str});
            return;
        }
        float d2 = v9v.d(UltronTradeHybridSwitcherHelper.ORANGE_KEY_THEMIS, "tmsPVSampling", 0.01f);
        Uri parse = Uri.parse(str);
        if (parse == null || (str2 = parse.getPath()) == null) {
            str2 = "default";
        }
        if (z) {
            nbv.a(nbv.a.a("PVOfTMS").branchEntry(true).message(str2).sampling(d2));
        } else {
            nbv.a(nbv.a.a("PVOfTMS").branch(1).message(str2).sampling(d2));
        }
    }

    public final void W2(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("615e5c59", new Object[]{this, new Boolean(z)});
        } else if (this.e == -1) {
            hav.g("TradeHybridTMSFragment", "switchFragmentContainerState:", "tmsContainerResId is invalid, state: " + z);
        } else {
            FragmentActivity activity = getActivity();
            View view = null;
            View findViewById = activity != null ? activity.findViewById(this.e) : null;
            if (findViewById instanceof View) {
                view = findViewById;
            }
            if (view != null) {
                if (!z) {
                    i = 8;
                }
                view.setVisibility(i);
                this.i = z;
            }
        }
    }

    public final boolean B2(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9dffe07", new Object[]{this, fragmentActivity})).booleanValue();
        }
        if (!v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_COMMON_CONTAINER, "tryCheckTMSFragmentContainerValid", false)) {
            return true;
        }
        View findViewById = fragmentActivity.findViewById(this.e);
        if (!(findViewById instanceof View)) {
            findViewById = null;
        }
        if (findViewById != null) {
            return true;
        }
        nbv.a(nbv.a.a("tmsFragmentAddedCatch").success(false).message("checkFragmentContainerValid - container is null!").sampling(v9v.d(UltronTradeHybridSwitcherHelper.ORANGE_KEY_COMMON_CONTAINER, "tryCheckTMSFragmentContainerValid", 1.0f)));
        return false;
    }

    public final void R2(String str, int i) {
        String str2 = "https://web.m.taobao.com/app/mtb/refund-pha/detail?bizOrderId=%s&disputeId=%s&type=%s";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52ef5d2b", new Object[]{this, str, new Integer(i)});
        } else if (str.length() == 0 || !v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_THEMIS, "redirectByWebError", true)) {
            hav.g("TradeHybridTMSFragment", "redirectByWebError:", "switcher is off, url:" + str);
        } else if ((!wsq.O(str, "aserver=true", false, 2, null) || i == 200) && i != 400 && i != 403 && i != 408 && i != 500 && i != 502 && i != 503 && i != 504) {
            hav.g("TradeHybridTMSFragment", "redirectByWebError", "ignore errorCode: " + i + ", url: " + str);
        } else if (mbv.a(str, dbv.TMS_PRE_RENDER_URL_REFUND_DETAIL) || mbv.a(str, dbv.TMS_PRE_RENDER_URL_REFUND_DETAIL_ASERVER)) {
            try {
                Uri parse = Uri.parse(str);
                String queryParameter = parse.getQueryParameter("bizOrderId");
                String queryParameter2 = parse.getQueryParameter("disputeId");
                String queryParameter3 = parse.getQueryParameter("type");
                if (!(queryParameter == null || queryParameter.length() == 0 || queryParameter2 == null || queryParameter2.length() == 0 || queryParameter3 == null || queryParameter3.length() == 0)) {
                    String g = v9v.g(UltronTradeHybridSwitcherHelper.ORANGE_KEY_THEMIS, "redirectUrlOfRefundDetail", str2);
                    if (g != null) {
                        str2 = g;
                    }
                    C2(true);
                    FragmentActivity activity = getActivity();
                    if (activity != null) {
                        Nav.from(activity).disableTransition().toUri(String.format(str2, Arrays.copyOf(new Object[]{queryParameter, queryParameter2, queryParameter3}, 3)).concat("&isRefund4Degrade=true&nextPageAnimation=false&redirectFrom=trade"));
                        return;
                    }
                    return;
                }
                hav.g("TradeHybridTMSFragment", "redirectByWebError", "params is lack");
            } catch (Throwable th) {
                hav.g("TradeHybridTMSFragment", "redirectByWebError:", "redirect throwable: " + th);
            }
        } else {
            hav.g("TradeHybridTMSFragment", "redirectByWebError", "ignore errorUrl: " + str);
        }
    }

    public final boolean E2(Activity activity, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9dcadce8", new Object[]{this, activity, str, jSONObject})).booleanValue();
        }
        if (str == null || str.length() == 0) {
            hav.g("TradeHybridTMSFragment", "displayTMSContainer:", "pageUrl is NullOrEmpty");
            return false;
        }
        T2(true, str);
        if (this.e == -1) {
            hav.g("TradeHybridTMSFragment", "displayTMSContainer:", "tmsContainerResId is invalid");
            return false;
        }
        if (activity instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) activity;
            if (fragmentActivity.getSupportFragmentManager() != null) {
                if ((activity instanceof l2e) || (qxq.h(fragmentActivity.getSupportFragmentManager()) instanceof l2e)) {
                    FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                    Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(TMS_FRAGMENT_TAG);
                    if (findFragmentByTag == null && v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_COMMON_CONTAINER, "enableFindTMSFragmentById", false)) {
                        findFragmentByTag = supportFragmentManager.findFragmentById(this.e);
                        StringBuilder sb = new StringBuilder("hit! findTMSFragmentById valid? ");
                        sb.append(findFragmentByTag != null);
                        hav.g("TradeHybridTMSFragment", "displayTMSContainer:", sb.toString());
                    }
                    if (!B2(fragmentActivity)) {
                        return false;
                    }
                    boolean z = findFragmentByTag != null;
                    boolean z2 = System.currentTimeMillis() - this.j < ((long) 500);
                    if (isAdded() || this.i || z || z2) {
                        String str2 = "tmsFragment already displayed, isAdded:" + isAdded() + ", hasDisplayed:" + this.i + ", fragmentNotNull:" + z + ", displayTooFast:" + z2 + ", pageUrl:" + str;
                        hav.g("TradeHybridTMSFragment", "displayTMSContainer:", str2);
                        nbv.a(nbv.a.a("tmsFragmentAddedCatch").success(false).message("errorMsg: " + str2).sampling(0.01f));
                        if (!this.i && z && !z2 && UltronTradeHybridSwitcherHelper.q(supportFragmentManager, true)) {
                            J2(activity, str, jSONObject, supportFragmentManager, findFragmentByTag, true);
                        }
                        return true;
                    }
                    K2(this, activity, str, jSONObject, supportFragmentManager, null, false, 48, null);
                    return true;
                }
                hav.g("TradeHybridTMSFragment", "displayTMSContainer:", "ITradeHybridTMSHost is invalid");
                return false;
            }
        }
        hav.g("TradeHybridTMSFragment", "displayTMSContainer:", "activity is not FragmentActivity");
        return false;
    }
}
