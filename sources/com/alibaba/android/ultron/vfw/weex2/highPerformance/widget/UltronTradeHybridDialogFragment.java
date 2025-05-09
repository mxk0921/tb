package com.alibaba.android.ultron.vfw.weex2.highPerformance.widget;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.animation.Animation;
import com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.factory.TradeHybridDataFactory;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.factory.TradeHybridInstanceFactory;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridInstanceRenderMode;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridPreRenderRecyclePolicy;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.config.WeexApmCustomData;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.common.MUSEventTarget;
import com.taobao.tao.Globals;
import com.ut.mini.UTAnalytics;
import java.util.Map;
import java.util.Set;
import tb.c2v;
import tb.cbv;
import tb.dbv;
import tb.hav;
import tb.ibv;
import tb.lbv;
import tb.mbv;
import tb.npc;
import tb.obv;
import tb.qbv;
import tb.t2o;
import tb.tvh;
import tb.v9v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UltronTradeHybridDialogFragment extends UltronWeex2DialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final qbv A;
    public final cbv B;
    public String C;
    public JSONObject D;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements npc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.npc
        public void onDestroyed(MUSDKInstance mUSDKInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
            } else {
                hav.g("UltronTradeHybridDialogFragment", "loadImmediateCreatedInstance:", "9 - onDestroyed");
            }
        }

        @Override // tb.npc
        public void onJSException(com.taobao.android.weex_framework.a aVar, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c41b6de", new Object[]{this, aVar, new Integer(i), str});
                return;
            }
            if (("7 - onJSException,errorType:" + i + " errorMsg:" + str) == null) {
                str = "";
            }
            hav.g("UltronTradeHybridDialogFragment", "loadImmediateCreatedInstance:", str);
            UltronTradeHybridDialogFragment ultronTradeHybridDialogFragment = UltronTradeHybridDialogFragment.this;
            lbv.j(ultronTradeHybridDialogFragment, UltronTradeHybridDialogFragment.J3(ultronTradeHybridDialogFragment), "onJSException");
        }

        @Override // tb.npc
        public void onPrepareSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("27a2635b", new Object[]{this, aVar});
            } else {
                hav.g("UltronTradeHybridDialogFragment", "loadImmediateCreatedInstance:", "2 - onPrepareSuccess");
            }
        }

        @Override // tb.npc
        public void onRefreshFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0861e4", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
                return;
            }
            if (("6 - onRefreshFailed,errorType:" + i + " errorMsg:" + str) == null) {
                str2 = "";
            } else {
                str2 = str + " fatal:" + z;
            }
            hav.g("UltronTradeHybridDialogFragment", "loadImmediateCreatedInstance:", str2);
            UltronTradeHybridDialogFragment ultronTradeHybridDialogFragment = UltronTradeHybridDialogFragment.this;
            lbv.j(ultronTradeHybridDialogFragment, UltronTradeHybridDialogFragment.I3(ultronTradeHybridDialogFragment), "onRefreshFailed");
        }

        @Override // tb.npc
        public void onRefreshSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
            } else {
                hav.g("UltronTradeHybridDialogFragment", "loadImmediateCreatedInstance:", "5 - onRefreshSuccess");
            }
        }

        @Override // tb.npc
        public void onRenderFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
                return;
            }
            if (("4 - onRenderFailed,errorType:" + i + " errorMsg:" + str) == null) {
                str2 = "";
            } else {
                str2 = str + " fatal:" + z;
            }
            hav.g("UltronTradeHybridDialogFragment", "loadImmediateCreatedInstance:", str2);
            UltronTradeHybridDialogFragment ultronTradeHybridDialogFragment = UltronTradeHybridDialogFragment.this;
            lbv.j(ultronTradeHybridDialogFragment, UltronTradeHybridDialogFragment.H3(ultronTradeHybridDialogFragment), "onRenderFailed");
        }

        @Override // tb.npc
        public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
            } else {
                hav.g("UltronTradeHybridDialogFragment", "loadImmediateCreatedInstance:", "3 - onRenderSuccess");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b extends UltronWeex2DialogFragment.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(157286953);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/weex2/highPerformance/widget/UltronTradeHybridDialogFragment$Builder");
        }

        /* renamed from: k */
        public UltronTradeHybridDialogFragment a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UltronTradeHybridDialogFragment) ipChange.ipc$dispatch("b88ca96c", new Object[]{this});
            }
            UltronTradeHybridDialogFragment ultronTradeHybridDialogFragment = new UltronTradeHybridDialogFragment();
            ultronTradeHybridDialogFragment.y3(this.d);
            Bundle bundle = new Bundle();
            bundle.putString("bizName", this.f2363a);
            bundle.putString(UltronWeex2DialogFragment.CONTAINER_BIZ_NAME, this.b);
            bundle.putString(UltronWeex2DialogFragment.WEEX2_URL, this.c);
            bundle.putBoolean("isPreRender", this.e);
            bundle.putBoolean(UltronWeex2DialogFragment.IS_INSTANCE_REUSE, this.f);
            bundle.putInt(UltronWeex2DialogFragment.CONTAINER_RES_ID, this.g);
            bundle.putInt(UltronWeex2DialogFragment.EXPECT_WIDTH, this.h);
            bundle.putInt(UltronWeex2DialogFragment.EXPECT_HEIGHT, this.i);
            ultronTradeHybridDialogFragment.setArguments(bundle);
            ultronTradeHybridDialogFragment.init();
            return ultronTradeHybridDialogFragment;
        }

        /* renamed from: l */
        public b b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("9110858d", new Object[]{this, str});
            }
            this.f2363a = str;
            return this;
        }

        /* renamed from: m */
        public b c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("ffc8cf50", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        /* renamed from: n */
        public b d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("865cf500", new Object[]{this, new Integer(i)});
            }
            this.g = i;
            return this;
        }

        /* renamed from: o */
        public b e(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("8d08be3a", new Object[]{this, new Integer(i)});
            }
            this.i = i;
            return this;
        }

        /* renamed from: p */
        public b f(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("cabf3191", new Object[]{this, new Integer(i)});
            }
            this.h = i;
            return this;
        }

        /* renamed from: q */
        public b g(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("4f9e0eb0", new Object[]{this, new Boolean(z)});
            }
            this.f = z;
            return this;
        }

        /* renamed from: r */
        public b h(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("e1fd35b6", new Object[]{this, new Boolean(z)});
            }
            this.e = z;
            return this;
        }

        /* renamed from: s */
        public b i(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c25bc4ea", new Object[]{this, aVar});
            }
            this.d = aVar;
            return this;
        }

        /* renamed from: t */
        public b j(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("62050af1", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }
    }

    static {
        t2o.a(157286951);
    }

    public UltronTradeHybridDialogFragment() {
        qbv j = qbv.j();
        this.A = j;
        this.B = j.h();
    }

    public static /* synthetic */ String H3(UltronTradeHybridDialogFragment ultronTradeHybridDialogFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3103f430", new Object[]{ultronTradeHybridDialogFragment});
        }
        return ultronTradeHybridDialogFragment.g;
    }

    public static /* synthetic */ String I3(UltronTradeHybridDialogFragment ultronTradeHybridDialogFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7db21db1", new Object[]{ultronTradeHybridDialogFragment});
        }
        return ultronTradeHybridDialogFragment.g;
    }

    public static /* synthetic */ String J3(UltronTradeHybridDialogFragment ultronTradeHybridDialogFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca604732", new Object[]{ultronTradeHybridDialogFragment});
        }
        return ultronTradeHybridDialogFragment.g;
    }

    public static /* synthetic */ Object ipc$super(UltronTradeHybridDialogFragment ultronTradeHybridDialogFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1589549411:
                super.onAttach((Context) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case 1088398452:
                return super.onCreateAnimation(((Number) objArr[0]).intValue(), ((Boolean) objArr[1]).booleanValue(), ((Number) objArr[2]).intValue());
            case 1554821038:
                super.J2();
                return null;
            case 2127624665:
                super.onDetach();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/weex2/highPerformance/widget/UltronTradeHybridDialogFragment");
        }
    }

    @Override // com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment
    public void J2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cacafae", new Object[]{this});
        } else if (!TextUtils.equals(lbv.e(this.g, "reuseTradeHybridContainer"), "true")) {
            super.J2();
        }
    }

    public final void K3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("825cc488", new Object[]{this});
        } else {
            this.D = null;
        }
    }

    public final void L3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9403f94b", new Object[]{this});
        } else if (TradeHybridDataFactory.INSTANCE.v(this.g)) {
            TradeHybridDataFactory.f(this.g);
        }
    }

    public final void N3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("621e8a39", new Object[]{this});
        } else if (TextUtils.isEmpty(this.g)) {
            hav.g("UltronTradeHybridDialogFragment", "loadImmediateCreatedInstance:", "mWeex2Url is empty");
        } else {
            com.taobao.android.weex_framework.a aVar = this.c;
            if (aVar == null) {
                hav.g("UltronTradeHybridDialogFragment", "loadImmediateCreatedInstance:", "mWeex2Instance is null");
                return;
            }
            if (aVar.isRenderCalled()) {
                this.c.refresh(this.D, null);
            } else {
                this.c.initWithURL(Uri.parse(this.g));
                this.c.render(this.D, null);
            }
            K3();
            this.c.registerRenderListener(new a());
            hav.g("UltronTradeHybridDialogFragment", "loadImmediateCreatedInstance:", "preRender is FALSE");
        }
    }

    public final boolean O3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66ebb280", new Object[]{this})).booleanValue();
        }
        if (!(getActivity() instanceof UltronTradeHybridActivity)) {
            return false;
        }
        return ((UltronTradeHybridActivity) getActivity()).y3();
    }

    public void Q3(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f51bcf7d", new Object[]{this, jSONObject});
        } else {
            this.D = jSONObject;
        }
    }

    public final void R3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caba8108", new Object[]{this});
            return;
        }
        try {
            if (!mbv.a(this.g, dbv.PRE_RENDER_URL_PAY_SUCCESS) && !mbv.a(this.g, dbv.PRE_RENDER_URL_RATE_LIST) && !mbv.a(this.g, dbv.PRE_RENDER_URL_REFUND_DETAIL_POP)) {
                return;
            }
            com.taobao.android.weex_framework.a aVar = this.c;
            if ((aVar instanceof tvh) && ((tvh) aVar).j() != null) {
                String e = lbv.e(this.g, "tradeHybridStartTime");
                if (TextUtils.isEmpty(e)) {
                    e = lbv.e(this.g, "jt_pt_navStartTime");
                }
                if (TextUtils.isEmpty(e)) {
                    hav.g("UltronTradeHybridDialogFragment", "updateRUM:", "startTime invalid!");
                    return;
                }
                long parseLong = Long.parseLong(e);
                WeexApmCustomData weexApmCustomData = new WeexApmCustomData();
                weexApmCustomData.setWxCustomStartTimeStamp(parseLong);
                ((tvh) this.c).j().setWeexApmCustomData(weexApmCustomData);
            }
        } catch (Throwable th) {
            hav.g("UltronTradeHybridDialogFragment", "updateRUM:", "throwable: " + th.toString());
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1860bf96", new Object[]{this});
            return;
        }
        try {
            if (!(getActivity() == null || getArguments() == null || TextUtils.isEmpty(getArguments().getString("url")))) {
                String string = getArguments().getString("url");
                if (lbv.q(string) && UltronTradeHybridSwitcherHelper.r()) {
                    lbv.r(this, string, getArguments());
                    y3(com.alibaba.android.ultron.vfw.weex2.a.g().d(getActivity(), string, UltronTradeHybridInstanceRenderMode.UNSPECIFIC));
                    this.e = "stdPopEmbedPage";
                    this.f = "stdPopEmbedPage";
                    this.g = string;
                    this.k = -1;
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment
    public void doDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e637df6", new Object[]{this});
            return;
        }
        L3();
        M3();
    }

    @Override // com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment, androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("40dfa474", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
        }
        if (TextUtils.isEmpty(this.g)) {
            return super.onCreateAnimation(i, z, i2);
        }
        Uri parse = Uri.parse(this.g);
        if (!TextUtils.equals(parse.getQueryParameter("skipEnterAnimation"), "true") && !TextUtils.equals(parse.getQueryParameter("animated"), "NO") && !O3()) {
            return super.onCreateAnimation(i, z, i2);
        }
        return null;
    }

    @Override // com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        c2v.d orNewUTPageStateObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
            return;
        }
        if (O3() && (orNewUTPageStateObject = c2v.getInstance().getOrNewUTPageStateObject(getActivity())) != null && !TextUtils.isEmpty(this.C)) {
            orNewUTPageStateObject.mSpmCnt = this.C;
        }
        K3();
        super.onDetach();
    }

    @Override // com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment, androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (O3()) {
            c2v.d orNewUTPageStateObject = c2v.getInstance().getOrNewUTPageStateObject(getActivity());
            if (orNewUTPageStateObject != null) {
                String e = lbv.e(this.g, "tradeHybridContainerSpmCnt");
                if (!TextUtils.isEmpty(e)) {
                    orNewUTPageStateObject.mSpmCnt = e;
                }
            } else {
                return;
            }
        }
        R3();
    }

    @Override // com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment
    public void y3(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bfb82b2", new Object[]{this, aVar});
            return;
        }
        if (this.c != null) {
            C2();
        }
        this.c = aVar;
    }

    @Override // com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment, com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.TradeHybridBaseFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Map<String, String> pageAllProperties;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
            return;
        }
        if (O3() && (pageAllProperties = UTAnalytics.getInstance().getDefaultTracker().getPageAllProperties(getActivity())) != null && !pageAllProperties.isEmpty()) {
            String str = pageAllProperties.get("tradeHybridContainerSpmCnt");
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            this.C = str;
        }
        c();
        super.onAttach(context);
        k3(context);
        if (this.i) {
            P3();
            return;
        }
        N3();
        String str2 = this.g;
        obv.i(false, str2, "OnError: mbPreRender is false, isFoldDevice: " + this.x);
    }

    public final void M3() {
        com.taobao.android.weex_framework.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e31293b6", new Object[]{this});
        } else if (TradeHybridInstanceFactory.INSTANCE.o(this.g)) {
            TradeHybridInstanceFactory.q(TradeHybridDataFactory.r(this.g));
            C2();
        } else {
            mbv b2 = this.B.b(this.g);
            if (b2 == null || TextUtils.isEmpty(b2.f)) {
                hav.g("UltronTradeHybridDialogFragment", "doDestroy:", "recyclePolicy invalid");
                C2();
                return;
            }
            String str = b2.f;
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -224113450:
                    if (str.equals(UltronTradeHybridPreRenderRecyclePolicy.DESTROY_REBUILD)) {
                        c = 0;
                        break;
                    }
                    break;
                case 3387192:
                    if (str.equals("none")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1082880659:
                    if (str.equals("recycle")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_HYBRID_CONTAINER, "forceDestroyRebuildInstance", false) && !this.i) {
                        C2();
                        return;
                    } else if (!d3() || (aVar = this.c) == null || !(aVar.getTag("tradeHostFragment") instanceof UltronWeex2DialogFragment)) {
                        C2();
                        if (Globals.getApplication() == null || !v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_HYBRID_CONTAINER, "destroyRebuildByApplicationContext", true)) {
                            this.A.e(getContext(), b2.b);
                            return;
                        } else {
                            this.A.e(Globals.getApplication(), b2.b);
                            return;
                        }
                    } else {
                        ((UltronWeex2DialogFragment) this.c.getTag("tradeHostFragment")).B2();
                        return;
                    }
                case 1:
                    C2();
                    return;
                case 2:
                    return;
                default:
                    C2();
                    return;
            }
        }
    }

    public final void P3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bba77783", new Object[]{this});
        } else if (TextUtils.isEmpty(this.g)) {
            String str = this.g;
            obv.i(false, str, "OnError: mWeex2Url is empty, isFoldDevice: " + this.x);
        } else if (this.c == null) {
            String str2 = this.g;
            obv.i(false, str2, "OnError: mWeex2Instance is null, isFoldDevice: " + this.x);
        } else {
            Uri parse = Uri.parse(this.g);
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames == null) {
                String str3 = this.g;
                obv.i(false, str3, "OnError: queryKeys is null, isFoldDevice: " + this.x);
                return;
            }
            JSONObject jSONObject = new JSONObject();
            for (String str4 : queryParameterNames) {
                if (!TextUtils.isEmpty(str4)) {
                    String queryParameter = parse.getQueryParameter(str4);
                    if (!TextUtils.isEmpty(queryParameter)) {
                        if (TextUtils.equals(str4, "preRequestStorageKey")) {
                            JSONObject f = this.A.q().f(queryParameter);
                            if (f == null) {
                                f = new JSONObject();
                            }
                            jSONObject.put("responseData", (Object) f);
                        } else {
                            jSONObject.put(str4, (Object) queryParameter);
                        }
                    }
                }
            }
            String str5 = this.g;
            obv.i(true, str5, "OnSuccess!, isFoldDevice: " + this.x);
            jSONObject.put("tradeHybridDeviceLevel", (Object) ibv.a());
            this.c.dispatchEvent(MUSEventTarget.MUS_DOCUMENT_TARGET, "preload.update", jSONObject);
            hav.d("UltronTradeHybridDialogFragment.sendPreRenderMessageToWeex2V2", "preRender is TRUE");
        }
    }
}
