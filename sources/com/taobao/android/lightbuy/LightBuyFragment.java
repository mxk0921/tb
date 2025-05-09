package com.taobao.android.lightbuy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lightbuy.message.module.LightBuyMUSModule;
import com.taobao.android.lightbuy.performance.LightBuyStage;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.android.weex_framework.common.MUSEventTarget;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.aar;
import tb.bbb;
import tb.ck;
import tb.cog;
import tb.eog;
import tb.hog;
import tb.jud;
import tb.kog;
import tb.kpc;
import tb.kud;
import tb.lud;
import tb.npc;
import tb.qbv;
import tb.r9r;
import tb.sxl;
import tb.t2o;
import tb.x9r;
import tb.zng;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LightBuyFragment extends Fragment implements jud, lud, npc, kud, bbb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ViewGroup f8230a;
    public FrameLayout c;
    public com.taobao.android.weex_framework.a d;
    public npc e;
    public WeexStateReceiver f;
    public c g;
    public String h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class WeexStateReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final View f8231a;

        static {
            t2o.a(708837388);
        }

        public WeexStateReceiver(View view) {
            this.f8231a = view;
        }

        public static /* synthetic */ Object ipc$super(WeexStateReceiver weexStateReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/lightbuy/LightBuyFragment$WeexStateReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if ("viewDidAppear".equals(intent.getAction()) && this.f8231a != null) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(50L);
                this.f8231a.startAnimation(alphaAnimation);
                this.f8231a.setVisibility(8);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (LightBuyFragment.this.getActivity() != null) {
                LightBuyFragment.this.getActivity().finish();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements kpc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(LightBuyFragment lightBuyFragment) {
        }

        @Override // tb.kpc
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final com.taobao.android.weex_framework.a f8233a;

        static {
            t2o.a(708837387);
        }

        public c(com.taobao.android.weex_framework.a aVar) {
            this.f8233a = aVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
            } else if (i != i5 || i2 != i6 || i3 != i7 || i4 != i8) {
                ck.g().e(" onLayoutChange ");
                this.f8233a.updateViewport();
            }
        }
    }

    static {
        t2o.a(708837383);
        t2o.a(708837428);
        t2o.a(708837430);
        t2o.a(982515990);
        t2o.a(708837429);
        t2o.a(81788949);
    }

    public static /* synthetic */ Object ipc$super(LightBuyFragment lightBuyFragment, String str, Object... objArr) {
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
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 462397159:
                super.onDestroyView();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 2127624665:
                super.onDetach();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/lightbuy/LightBuyFragment");
        }
    }

    @Override // tb.bbb
    public Intent A0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("dd388005", new Object[]{this});
        }
        return getActivity().getIntent();
    }

    public void A2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bad1cc", new Object[]{this});
        } else if (this.f != null) {
            LocalBroadcastManager.getInstance(getActivity()).unregisterReceiver(this.f);
        }
    }

    @Override // tb.lud
    public void Y2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee313163", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.bbb
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        } else {
            getActivity().getSupportFragmentManager().popBackStack();
        }
    }

    @Override // tb.jud
    public void g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe7b3616", new Object[]{this, jSONObject});
        }
    }

    @Override // tb.lud
    public String g1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1507e0c4", new Object[]{this});
        }
        return "weex";
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        com.taobao.android.weex_framework.a aVar = this.d;
        if (aVar != null) {
            aVar.onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
        } else {
            super.onAttach(context);
        }
    }

    @Override // tb.kud
    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        com.taobao.android.weex_framework.a aVar = this.d;
        if (aVar == null || !aVar.canGoBack()) {
            return false;
        }
        this.d.goBack();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        x9r.e(getActivity(), new HashMap<String, String>() { // from class: com.taobao.android.lightbuy.LightBuyFragment.1
            {
                put("renderContainer", "weex");
            }
        });
        LightBuyMUSModule.registerModule();
        Bundle arguments = getArguments();
        String string = arguments.getString("bundleUrl");
        this.h = arguments.getString("containerType");
        p2(getActivity(), string, this.h);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.c = frameLayout;
        frameLayout.setLayoutParams(layoutParams);
        this.d.registerRenderListener(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        if (this.f8230a == null) {
            ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.fragment_lightbuy_layout, viewGroup, false);
            this.f8230a = viewGroup2;
            LinearLayout linearLayout = (LinearLayout) viewGroup2.findViewById(R.id.purchase_skeleton);
            boolean equals = "fullScreen".equals(this.h);
            if (equals) {
                ((ViewGroup) this.f8230a.findViewById(R.id.purchase_statusBar)).setVisibility(0);
            }
            if (r9r.m(getActivity())) {
                linearLayout.addView(r9r.o(getActivity(), new a(), !equals));
            } else {
                this.f8230a.findViewById(R.id.title_action_bar).setVisibility(0);
                layoutInflater.inflate(R.layout.layout_purchase_skeleton, (ViewGroup) linearLayout, true);
            }
            ((FrameLayout) this.f8230a.findViewById(R.id.weex_container)).addView(this.c);
            if (zng.a()) {
                View findViewById = this.f8230a.findViewById(R.id.purchase_mask);
                findViewById.setVisibility(0);
                this.f = new WeexStateReceiver(findViewById);
            }
            View renderRoot = this.d.getRenderRoot();
            if (renderRoot.getParent() != null) {
                ViewParent parent = renderRoot.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(renderRoot);
                }
            }
            this.c.addView(renderRoot);
            u2();
        }
        return this.f8230a;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        r2();
        com.taobao.android.weex_framework.a aVar = this.d;
        if (aVar != null) {
            aVar.destroy();
        }
        cog.f().c(getContext());
        A2();
        aar.a(aar.e);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
        } else {
            super.onDestroyView();
        }
    }

    @Override // tb.npc
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
            return;
        }
        ck.g().d("onDestroyed");
        npc npcVar = this.e;
        if (npcVar != null) {
            npcVar.onDestroyed(mUSDKInstance);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
        } else {
            super.onDetach();
        }
    }

    @Override // tb.npc
    public void onJSException(com.taobao.android.weex_framework.a aVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c41b6de", new Object[]{this, aVar, new Integer(i), str});
            return;
        }
        ck.g().d("onJSException");
        npc npcVar = this.e;
        if (npcVar != null) {
            npcVar.onJSException(aVar, i, str);
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
        com.taobao.android.weex_framework.a aVar = this.d;
        if (aVar != null) {
            aVar.onActivityPause();
        }
        c cVar = this.g;
        if (cVar != null) {
            this.c.removeOnLayoutChangeListener(cVar);
        }
    }

    @Override // tb.npc
    public void onPrepareSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a2635b", new Object[]{this, aVar});
            return;
        }
        ck.g().d("onPrepareSuccess");
        npc npcVar = this.e;
        if (npcVar != null) {
            npcVar.onPrepareSuccess(aVar);
        }
    }

    @Override // tb.npc
    public void onRefreshFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0861e4", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        ck.g().d("onRefreshFailed");
        npc npcVar = this.e;
        if (npcVar != null) {
            npcVar.onRefreshFailed(aVar, i, str, z);
        }
    }

    @Override // tb.npc
    public void onRefreshSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
            return;
        }
        ck.g().d("onRefreshSuccess");
        npc npcVar = this.e;
        if (npcVar != null) {
            npcVar.onRefreshSuccess(aVar);
        }
    }

    @Override // tb.npc
    public void onRenderFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        ck.g().d("onRenderFailed");
        npc npcVar = this.e;
        if (npcVar != null) {
            npcVar.onRenderFailed(aVar, i, str, z);
        }
    }

    @Override // tb.npc
    public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
            return;
        }
        ck.g().d(sxl.RENDER_SUCCESS_TIME);
        npc npcVar = this.e;
        if (npcVar != null) {
            npcVar.onRenderSuccess(aVar);
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
        eog.d(getActivity().getIntent());
        com.taobao.android.weex_framework.a aVar = this.d;
        if (aVar != null) {
            aVar.onActivityResume();
            if (this.g == null) {
                this.g = new c(this.d);
            }
            this.c.addOnLayoutChangeListener(this.g);
        }
        aar.a(aar.d);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        com.taobao.android.weex_framework.a aVar = this.d;
        if (aVar != null) {
            aVar.onActivityStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        com.taobao.android.weex_framework.a aVar = this.d;
        if (aVar != null) {
            aVar.onActivityStop();
        }
    }

    @Override // tb.lud
    public void q2(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76d933d", new Object[]{this, str, jSONObject});
        }
    }

    public final void r2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfcc0ff6", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("context", (Object) getActivity());
        qbv.j().a(UltronTradeHybridStage.ON_CONTAINER_RESUME, "tabCart", jSONObject);
    }

    public final void s2(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("912fb6e2", new Object[]{this, context});
            return;
        }
        com.taobao.android.weex_framework.a aVar = this.d;
        if (aVar == null) {
            ck.g().f("rebindContext mWeex2Instance is null", ck.b.b().l("LightBuyFragment").i("LightBuy/common").g("info", "rebindContext mWeex2Instance is null").a());
        } else {
            aVar.resetContext(context);
        }
    }

    public void u2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfb846e5", new Object[]{this});
        } else if (this.f != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("viewDidAppear");
            intentFilter.addCategory("android.intent.category.DEFAULT");
            LocalBroadcastManager.getInstance(getActivity()).registerReceiver(this.f, intentFilter);
        }
    }

    public void v2(String str, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9581892e", new Object[]{this, str, jSONObject, new Boolean(z)});
            return;
        }
        this.d.initWithURL(Uri.parse(str));
        if (z) {
            jSONObject = null;
        }
        this.d.render(jSONObject, null);
    }

    public void z2(npc npcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("378ba2f6", new Object[]{this, npcVar});
        } else {
            this.e = npcVar;
        }
    }

    public final void p2(Context context, String str, String str2) {
        boolean z;
        String valueAsString;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("251cdd23", new Object[]{this, context, str, str2});
        } else if (str != null) {
            com.taobao.android.weex_framework.a a2 = kog.a(context, str);
            this.d = a2;
            if (a2 != null) {
                VariationSet activate = UTABTest.activate("LightBuy", "weex_preheat");
                Variation variation = activate.getVariation("enablePreheat");
                if (variation != null) {
                    z = variation.getValueAsBoolean(false);
                } else {
                    ck.g().f("lightBuy没有获取到实验信息", ck.b.b().i("LightBuy/preload").a());
                    z = false;
                }
                Variation variation2 = activate.getVariation("abinfo");
                if (!(variation2 == null || (valueAsString = variation2.getValueAsString(null)) == null)) {
                    hog.c().a("abTestInfo", valueAsString);
                    ck.g().f("lightBuy AB实验信息：".concat(valueAsString), ck.b.b().i("LightBuy/preload").a());
                }
            } else {
                ck.g().f("lightBuy没有获取到预热实例", ck.b.b().i("LightBuy/preload").a());
                hog.c().a("abTestInfo", "nullInstance");
                z = false;
            }
            if (str2 != null) {
                str = str + "&containerType=" + str2;
            }
            com.taobao.android.weex_framework.a aVar = this.d;
            if (aVar == null || !z) {
                if (aVar != null) {
                    aVar.destroy();
                }
                MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
                mUSInstanceConfig.B(true);
                mUSInstanceConfig.t(MUSInstanceConfig.MUSRenderType.MUSRenderTypeUnicorn);
                mUSInstanceConfig.y(MUSInstanceConfig.RenderMode.texture);
                mUSInstanceConfig.p(str);
                mUSInstanceConfig.v(false);
                mUSInstanceConfig.u(new b(this));
                hog.c().f(LightBuyStage.WEEX_INIT);
                this.d = com.taobao.android.weex_framework.b.f().c(getContext(), mUSInstanceConfig);
                v2(str, null, false);
                s2(context);
                return;
            }
            s2(context);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("lightbuyUrl", (Object) str);
            this.d.dispatchEvent(MUSEventTarget.MUS_DOCUMENT_TARGET, "preload.update", jSONObject);
        }
    }
}
