package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.TabManager;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeSelectedContainerFragment;
import com.taobao.login4android.api.Login;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.tmall.android.dai.DAI;
import com.tmall.android.dai.DAICallback;
import com.tmall.android.dai.DAIError;
import java.util.HashMap;
import java.util.Map;
import tb.b0h;
import tb.b4b;
import tb.bg6;
import tb.bjr;
import tb.c2h;
import tb.d9m;
import tb.fe6;
import tb.he6;
import tb.j5h;
import tb.lrq;
import tb.mw5;
import tb.myg;
import tb.nvs;
import tb.nwg;
import tb.p9m;
import tb.qw0;
import tb.r0h;
import tb.rzb;
import tb.s8d;
import tb.sj7;
import tb.t2o;
import tb.wca;
import tb.wl7;
import tb.yl7;
import tb.zuc;
import tb.zzg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class HomeSelectedFragment extends HomeFollowDXFragment implements myg.a, Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String a0 = HomeSelectedFragment.class.getSimpleName();
    public boolean E;
    public boolean F;
    public com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.a M;
    public TUrlImageView N;
    public FrameLayout O;
    public TUrlImageView P;
    public TUrlImageView Q;
    public JSONArray R;
    public JSONObject S;
    public myg T;
    public TUrlImageView U;
    public Handler W;
    public boolean Y;
    public volatile boolean Z;
    public int z;
    public int A = -1;
    public final String B = "faxianMainRecycler2024";
    public final String C = "faxian_tabPage_appear";
    public boolean D = true;
    public final String G = "https://gw.alicdn.com/imgextra/i1/O1CN01D9oU4f1FasYACOdKo_!!6000000000504-2-tps-750-673.png";
    public String H = "";
    public String I = "";
    public boolean J = true;
    public boolean K = false;
    public int L = 0;
    public final String V = "https://gw.alicdn.com/imgextra/i1/O1CN01BdNaMb1g5jEp4wlAl_!!6000000004091-0-tps-750-192.jpg";
    public BroadcastReceiver X = new BroadcastReceiver() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedFragment.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/fragment/selected/HomeSelectedFragment$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null && !lrq.a(intent.getAction())) {
                try {
                    if (intent.getAction().equals("com.taobao.taolive.room.service.VisitedList")) {
                        HomeSelectedFragment.p3(HomeSelectedFragment.this, JSON.parseArray(intent.getStringExtra("feedList")));
                    }
                } catch (Exception e2) {
                    String access$100 = HomeSelectedFragment.access$100();
                    r0h.c(access$100, "login receive exp. Action: " + intent.getAction(), e2);
                }
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements DAICallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.tmall.android.dai.DAICallback
        public void onError(DAIError dAIError) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("326e086b", new Object[]{this, dAIError});
                return;
            }
            if (HomeSelectedFragment.q3(HomeSelectedFragment.this) != null) {
                HomeSelectedFragment.q3(HomeSelectedFragment.this).removeCallbacksAndMessages(null);
            }
            HomeSelectedFragment.s3(HomeSelectedFragment.this, null);
        }

        @Override // com.tmall.android.dai.DAICallback
        public void onSuccess(Object... objArr) {
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f85dc9a6", new Object[]{this, objArr});
                return;
            }
            if (HomeSelectedFragment.q3(HomeSelectedFragment.this) != null) {
                HomeSelectedFragment.q3(HomeSelectedFragment.this).removeCallbacksAndMessages(null);
            }
            if (!HomeSelectedFragment.r3(HomeSelectedFragment.this)) {
                if (objArr != null && objArr.length > 0) {
                    Object obj2 = objArr[0];
                    if ((obj2 instanceof HashMap) && (obj = ((Map) obj2).get("result")) != null) {
                        String obj3 = obj.toString();
                        if (!lrq.a(obj3)) {
                            try {
                                JSONObject parseObject = JSON.parseObject(obj3);
                                if (parseObject.get("content") != null) {
                                    HomeSelectedFragment.s3(HomeSelectedFragment.this, parseObject.getJSONObject("content"));
                                    return;
                                }
                            } catch (Exception unused) {
                                TLog.loge(HomeSelectedFragment.access$100(), "json parse.");
                            }
                        }
                    }
                }
                HomeSelectedFragment.s3(HomeSelectedFragment.this, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements zuc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.zuc
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4942848", new Object[]{this, str});
                return;
            }
            DinamicXEngine dinamicEngine = HomeSelectedFragment.t3(HomeSelectedFragment.this).q().getDinamicSdkManager().getDinamicEngine();
            if (dinamicEngine != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("mockUserId", (Object) str);
                dinamicEngine.r("channel_faxian_update_userId_debug", HomeSelectedFragment.this.u, jSONObject, null, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            r0h.b("TaoLiveHomepage", "NewChannelCommercialCard bg download failed");
            if (HomeSelectedFragment.v3(HomeSelectedFragment.this) < 3) {
                HomeSelectedFragment.u3(HomeSelectedFragment.this).setImageUrl(HomeSelectedFragment.x3(HomeSelectedFragment.this));
            } else {
                HomeSelectedFragment.u3(HomeSelectedFragment.this).setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01j32P8U26dmiZXwscZ_!!6000000007685-0-tps-750-720.jpg");
                HomeSelectedFragment.y3(HomeSelectedFragment.this).v(true);
                HomeSelectedFragment.y3(HomeSelectedFragment.this).t(false);
                HomeSelectedFragment.this.N3(true);
                HomeSelectedFragment.z3(HomeSelectedFragment.this, true);
            }
            HomeSelectedFragment.w3(HomeSelectedFragment.this);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements rzb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.rzb
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd6216d0", new Object[]{this, view});
            } else {
                HomeSelectedFragment.this.getClass();
            }
        }

        @Override // tb.rzb
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a14aabed", new Object[]{this});
            } else {
                HomeSelectedFragment.this.getClass();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements wl7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // tb.wl7
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67253d14", new Object[]{this});
                return;
            }
            HomeSelectedFragment.this.getClass();
            r0h.b("TaoLiveHomepage", "HomeFollowDXFragment renderDXContainer error");
        }

        @Override // tb.wl7
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fc7a84f", new Object[]{this});
                return;
            }
            HomeSelectedFragment.this.getClass();
            r0h.b("TaoLiveHomepage", "HomeFollowDXFragment renderDXContainer success");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements yl7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g(HomeSelectedFragment homeSelectedFragment) {
        }

        @Override // tb.yl7
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edfb8375", new Object[]{this});
            }
        }

        @Override // tb.yl7
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ac1a9ba", new Object[]{this});
            }
        }
    }

    static {
        t2o.a(310378849);
        t2o.a(310378557);
    }

    public static /* synthetic */ int A3(HomeSelectedFragment homeSelectedFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c5f670a", new Object[]{homeSelectedFragment})).intValue();
        }
        return homeSelectedFragment.A;
    }

    public static /* synthetic */ int B3(HomeSelectedFragment homeSelectedFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b9f1d17d", new Object[]{homeSelectedFragment, new Integer(i)})).intValue();
        }
        homeSelectedFragment.A = i;
        return i;
    }

    public static /* synthetic */ int C3(HomeSelectedFragment homeSelectedFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d6ba18b", new Object[]{homeSelectedFragment})).intValue();
        }
        return homeSelectedFragment.z;
    }

    public static /* synthetic */ int D3(HomeSelectedFragment homeSelectedFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fa6ce71c", new Object[]{homeSelectedFragment, new Integer(i)})).intValue();
        }
        homeSelectedFragment.z = i;
        return i;
    }

    public static HomeSelectedFragment H3(Bundle bundle, b0h b0hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HomeSelectedFragment) ipChange.ipc$dispatch("b4446cd1", new Object[]{bundle, b0hVar});
        }
        HomeSelectedFragment homeSelectedFragment = new HomeSelectedFragment();
        homeSelectedFragment.setArguments(bundle);
        homeSelectedFragment.f3(b0hVar);
        return homeSelectedFragment;
    }

    public static /* synthetic */ String access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return a0;
    }

    public static /* synthetic */ Object ipc$super(HomeSelectedFragment homeSelectedFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1990827289:
                super.W2();
                return null;
            case -1665651870:
                super.v2((View) objArr[0]);
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1418964012:
                super.d3();
                return null;
            case -682455317:
                super.j3();
                return null;
            case 303778162:
                super.T2();
                return null;
            case 999033108:
                super.U2();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1345585887:
                super.b3();
                return null;
            case 1474137431:
                super.i3(((Boolean) objArr[0]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/fragment/selected/HomeSelectedFragment");
        }
    }

    public static /* synthetic */ JSONArray p3(HomeSelectedFragment homeSelectedFragment, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("5503ed65", new Object[]{homeSelectedFragment, jSONArray});
        }
        homeSelectedFragment.R = jSONArray;
        return jSONArray;
    }

    public static /* synthetic */ Handler q3(HomeSelectedFragment homeSelectedFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("22ffb508", new Object[]{homeSelectedFragment});
        }
        return homeSelectedFragment.W;
    }

    public static /* synthetic */ boolean r3(HomeSelectedFragment homeSelectedFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3eb6783", new Object[]{homeSelectedFragment})).booleanValue();
        }
        return homeSelectedFragment.Z;
    }

    public static /* synthetic */ void s3(HomeSelectedFragment homeSelectedFragment, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eb2d8f0", new Object[]{homeSelectedFragment, jSONObject});
        } else {
            homeSelectedFragment.I3(jSONObject);
        }
    }

    public static /* synthetic */ b0h t3(HomeSelectedFragment homeSelectedFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b0h) ipChange.ipc$dispatch("f4484bf6", new Object[]{homeSelectedFragment});
        }
        return homeSelectedFragment.p;
    }

    public static /* synthetic */ TUrlImageView u3(HomeSelectedFragment homeSelectedFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("6c934c2a", new Object[]{homeSelectedFragment});
        }
        return homeSelectedFragment.N;
    }

    public static /* synthetic */ int v3(HomeSelectedFragment homeSelectedFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d82e7d06", new Object[]{homeSelectedFragment})).intValue();
        }
        return homeSelectedFragment.L;
    }

    public static /* synthetic */ int w3(HomeSelectedFragment homeSelectedFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d985b30e", new Object[]{homeSelectedFragment})).intValue();
        }
        int i = homeSelectedFragment.L;
        homeSelectedFragment.L = 1 + i;
        return i;
    }

    public static /* synthetic */ String x3(HomeSelectedFragment homeSelectedFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d83ad78c", new Object[]{homeSelectedFragment});
        }
        return homeSelectedFragment.H;
    }

    public static /* synthetic */ com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.a y3(HomeSelectedFragment homeSelectedFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.a) ipChange.ipc$dispatch("317b4c85", new Object[]{homeSelectedFragment});
        }
        return homeSelectedFragment.M;
    }

    public static /* synthetic */ boolean z3(HomeSelectedFragment homeSelectedFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7976fbc0", new Object[]{homeSelectedFragment, new Boolean(z)})).booleanValue();
        }
        homeSelectedFragment.K = z;
        return z;
    }

    public final void E3(TUrlImageView tUrlImageView, boolean z, String str) {
        float f2;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eabffdb", new Object[]{this, tUrlImageView, new Boolean(z), str});
            return;
        }
        if (!z || TextUtils.isEmpty(str)) {
            z2 = false;
        }
        if (z2) {
            tUrlImageView.setImageUrl(str);
        }
        ViewPropertyAnimator animate = tUrlImageView.animate();
        if (z2) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        animate.alpha(f2).setDuration(250L).withEndAction(new b4b(this, z2, tUrlImageView)).start();
    }

    public final void F3(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2cbb452", new Object[]{this, jSONArray});
        } else if (this.u != null && jSONArray != null && jSONArray.size() > 0) {
            r0h.b("TaoLiveHomepage", "delayWriteImageCache start");
            this.u.postDelayed(new c(jSONArray), 2000L);
        }
    }

    public final HomeSelectedContainerFragment G3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HomeSelectedContainerFragment) ipChange.ipc$dispatch("aeb4c492", new Object[]{this});
        }
        if (getParentFragment() instanceof HomeSelectedContainerFragment) {
            return (HomeSelectedContainerFragment) getParentFragment();
        }
        return new HomeSelectedContainerFragment();
    }

    public final void I3(JSONObject jSONObject) {
        b0h b0hVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a04c58c", new Object[]{this, jSONObject});
        } else if (this.T != null && this.S != null && (b0hVar = this.p) != null && b0hVar.q() != null && this.u != null) {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("feedList", (Object) this.R);
            jSONObject2.put("tppParam", (Object) JSON.toJSONString(jSONObject3));
            jSONObject2.put("sessionId", (Object) wca.b());
            jSONObject2.put("userId", (Object) Login.getUserId());
            jSONObject2.putAll(this.S);
            if (jSONObject != null) {
                jSONObject2.put("walleResponseInfo", (Object) jSONObject);
            }
            this.p.q().getDinamicSdkManager().getDinamicEngine().r("faxian_insertCardBackFromLiveRoom", this.u, jSONObject2, null, null);
            this.S = null;
            this.R = null;
        }
    }

    public final void J3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a25ca2de", new Object[]{this});
        } else if (nvs.w() && this.M != null) {
            O3(0);
            com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.a aVar = this.M;
            aVar.C(800, 0, aVar.n());
        }
    }

    public final void K3(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f68065b", new Object[]{this, new Boolean(z)});
            return;
        }
        DXRootView dXRootView = this.u;
        if (dXRootView != null && dXRootView.getExpandWidgetNode() != null) {
            DXWidgetNode queryWidgetNodeByUserId = this.u.getExpandWidgetNode().queryWidgetNodeByUserId(this.B);
            if (queryWidgetNodeByUserId instanceof DXRecyclerLayout) {
                DXWidgetNode queryWidgetNodeByUserId2 = ((DXRecyclerLayout) queryWidgetNodeByUserId).queryWidgetNodeByUserId("live_JellyMarquee");
                if (queryWidgetNodeByUserId2 instanceof bg6) {
                    DXEvent dXEvent = new DXEvent(20002L);
                    HashMap hashMap = new HashMap();
                    hashMap.put("isAppear", mw5.G(z));
                    dXEvent.setArgs(hashMap);
                    queryWidgetNodeByUserId2.postEvent(dXEvent);
                }
            }
        }
    }

    public void L3(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6ac5534", new Object[]{this, new Boolean(z)});
        } else {
            this.Y = z;
        }
    }

    public final void M3() {
        final DXRecyclerLayout dXRecyclerLayout;
        RecyclerView j0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b22eea4e", new Object[]{this});
            return;
        }
        DXRootView dXRootView = this.u;
        if (dXRootView != null && dXRootView.getExpandWidgetNode() != null) {
            DXWidgetNode queryWidgetNodeByUserId = this.u.getExpandWidgetNode().queryWidgetNodeByUserId(this.B);
            if ((queryWidgetNodeByUserId instanceof DXRecyclerLayout) && (j0 = (dXRecyclerLayout = (DXRecyclerLayout) queryWidgetNodeByUserId).j0()) != null) {
                j0.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedFragment.9
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass9 r5, String str, Object... objArr) {
                        int hashCode = str.hashCode();
                        if (hashCode == -1177043419) {
                            super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                            return null;
                        } else if (hashCode == 1361287682) {
                            super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                            return null;
                        } else {
                            int hashCode2 = str.hashCode();
                            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/fragment/selected/HomeSelectedFragment$9");
                        }
                    }

                    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                            return;
                        }
                        super.onScrollStateChanged(recyclerView, i);
                        DXWidgetNode queryWidgetNodeByUserId2 = dXRecyclerLayout.queryWidgetNodeByUserId("live_JellyMarquee");
                        if (queryWidgetNodeByUserId2 instanceof bg6) {
                            DXEvent dXEvent = new DXEvent(20001L);
                            HashMap hashMap = new HashMap();
                            hashMap.put("newState", mw5.K(i));
                            dXEvent.setArgs(hashMap);
                            queryWidgetNodeByUserId2.postEvent(dXEvent);
                        }
                    }

                    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                            return;
                        }
                        super.onScrolled(recyclerView, i, i2);
                        if (!(dXRecyclerLayout.j0() == null || HomeSelectedFragment.A3(HomeSelectedFragment.this) != -1 || (findViewHolderForAdapterPosition = dXRecyclerLayout.j0().findViewHolderForAdapterPosition(2)) == null || HomeSelectedFragment.this.w == null)) {
                            Rect rect = new Rect();
                            findViewHolderForAdapterPosition.itemView.getGlobalVisibleRect(rect);
                            HomeSelectedFragment homeSelectedFragment = HomeSelectedFragment.this;
                            HomeSelectedFragment.B3(homeSelectedFragment, rect.top - qw0.d(homeSelectedFragment.getContext(), HomeSelectedFragment.this.w.getInteger("stautsNavHeight").intValue()));
                        }
                        HomeSelectedFragment homeSelectedFragment2 = HomeSelectedFragment.this;
                        HomeSelectedFragment.D3(homeSelectedFragment2, HomeSelectedFragment.C3(homeSelectedFragment2) + i2);
                        if (HomeSelectedFragment.y3(HomeSelectedFragment.this) != null) {
                            HomeSelectedFragment.y3(HomeSelectedFragment.this).C(800, HomeSelectedFragment.C3(HomeSelectedFragment.this), HomeSelectedFragment.y3(HomeSelectedFragment.this).n());
                        }
                    }
                });
            }
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeFollowDXFragment, com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public String N2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fbf611af", new Object[]{this});
        }
        return a0;
    }

    public void N3(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10e1d343", new Object[]{this, new Boolean(z)});
        } else {
            G3().Y3(z);
        }
    }

    public void O3(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6d75df2", new Object[]{this, new Integer(i)});
        } else {
            this.z = i;
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeFollowDXFragment, com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedBaseFragment, com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void T2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("121b4972", new Object[]{this});
            return;
        }
        super.T2();
        if (TextUtils.equals(this.h, "jingxuan")) {
            K3(true);
        }
        N3(this.Y);
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeFollowDXFragment, com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void U2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b8c0914", new Object[]{this});
            return;
        }
        super.U2();
        if (TextUtils.equals(this.h, "jingxuan")) {
            K3(false);
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void W2() {
        b0h b0hVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("895662e7", new Object[]{this});
            return;
        }
        super.W2();
        if (this.u != null && (b0hVar = this.p) != null && b0hVar.q() != null && this.p.q().getDinamicSdkManager() != null) {
            c2h.a(this.p.q().getDinamicSdkManager().getDinamicEngine(), "faxian_disaAppear", this.u, null);
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeFollowDXFragment, com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void d3() {
        com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab6c53d4", new Object[]{this});
            return;
        }
        super.d3();
        if (!nvs.B() && (aVar = this.M) != null && this.E && !this.K) {
            aVar.A(false);
            if (this.M.h() != null) {
                this.M.h().setAlpha(0.0f);
            }
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedBaseFragment
    public void g3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede548eb", new Object[]{this});
            return;
        }
        DXRootView dXRootView = this.u;
        if (!(dXRootView == null || dXRootView.getExpandWidgetNode() == null)) {
            DXWidgetNode queryWidgetNodeByUserId = this.u.getExpandWidgetNode().queryWidgetNodeByUserId(k3());
            if (queryWidgetNodeByUserId instanceof DXRecyclerLayout) {
                DXRecyclerLayout dXRecyclerLayout = (DXRecyclerLayout) queryWidgetNodeByUserId;
                DXRecyclerLayout Z = dXRecyclerLayout.Z();
                if (dXRecyclerLayout.j0() != null) {
                    dXRecyclerLayout.j0().scrollToPosition(0);
                }
                if (!(Z == null || Z.j0() == null)) {
                    Z.c1(false, 0);
                    Z.l0().v();
                    n3();
                }
            }
        }
        J3();
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeFollowDXFragment, com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedBaseFragment, com.taobao.live.home.view.BaseLiveRecyclerFragment
    public int getLayoutId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf537e55", new Object[]{this})).intValue();
        }
        return -1;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeFollowDXFragment, com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedBaseFragment
    public void h3() {
        RecyclerView j0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aafec08d", new Object[]{this});
            return;
        }
        DXRootView dXRootView = this.u;
        if (dXRootView != null) {
            JSONObject data = dXRootView.getData();
            DinamicXEngine dinamicEngine = this.p.q().getDinamicSdkManager().getDinamicEngine();
            if (dinamicEngine != null && this.u.getExpandWidgetNode() != null && getContext() != null) {
                int i = qw0.i((Activity) getContext());
                if (nvs.T()) {
                    i = qw0.i((Activity) getContext()) - sj7.c;
                }
                if (data != null) {
                    dinamicEngine.I0(this.u.getExpandWidgetNode(), 0, new DXWidgetRefreshOption.a().d(true).c(1).f(TBAutoSizeConfig.x().H(getContext())).e(i).g(false).a());
                }
                if (nvs.R()) {
                    DXWidgetNode queryWidgetNodeByUserId = this.u.getExpandWidgetNode().queryWidgetNodeByUserId(k3());
                    if (queryWidgetNodeByUserId instanceof DXRecyclerLayout) {
                        DXRecyclerLayout dXRecyclerLayout = (DXRecyclerLayout) queryWidgetNodeByUserId;
                        DXRecyclerLayout Z = dXRecyclerLayout.Z();
                        if (dXRecyclerLayout.j0() != null) {
                            dXRecyclerLayout.j0().scrollToPosition(0);
                        }
                        if (Z != null && (j0 = Z.j0()) != null) {
                            j0.scrollToPosition(0);
                        }
                    }
                }
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        if (message.what == 100) {
            this.Z = true;
            I3(null);
        }
        return false;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedBaseFragment
    public void i3(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57dd8d57", new Object[]{this, new Boolean(z)});
        } else {
            super.i3(z);
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeFollowDXFragment
    public void j3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7528eeb", new Object[]{this});
            return;
        }
        super.j3();
        M3();
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeFollowDXFragment
    public String k3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ebaa97e", new Object[]{this});
        }
        return this.B;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeFollowDXFragment
    public String l3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("26e4135b", new Object[]{this});
        }
        return this.C;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2, com.taobao.live.home.view.BaseLiveRecyclerFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.home_select_follow_fragment_flexalocal, (ViewGroup) null);
        this.W = new Handler(this);
        if (inflate != null) {
            this.c = (ViewGroup) inflate.findViewById(R.id.live_home_select_container_dx);
            this.O = (FrameLayout) inflate.findViewById(R.id.live_top_atmosphere_layout);
            this.P = (TUrlImageView) inflate.findViewById(R.id.live_top_atmosphere_front);
            this.Q = (TUrlImageView) inflate.findViewById(R.id.live_top_atmosphere_next);
            TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.live_top_background);
            this.N = tUrlImageView;
            tUrlImageView.setWhenNullClearImg(false);
            TUrlImageView tUrlImageView2 = (TUrlImageView) inflate.findViewById(R.id.live_top_nav_back);
            this.U = tUrlImageView2;
            tUrlImageView2.setWhenNullClearImg(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.U.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = Math.max(this.p.j, 0) + this.p.k;
            }
            this.U.setLayoutParams(layoutParams);
            this.U.setImageUrl(this.V);
        }
        com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.a aVar = G3().G;
        this.M = aVar;
        if (aVar != null) {
            aVar.u(inflate);
            this.M.w(this.U);
        }
        if (qw0.p()) {
            d9m.j().createDebugPanel(getContext(), (ViewGroup) inflate, new b(), false);
        }
        if (this.X != null) {
            LocalBroadcastManager.getInstance(getContext()).registerReceiver(this.X, new IntentFilter("com.taobao.taolive.room.service.VisitedList"));
        }
        return inflate;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeFollowDXFragment, com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2, com.taobao.live.home.view.BaseLiveRecyclerFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (this.X != null) {
            LocalBroadcastManager.getInstance(getContext()).unregisterReceiver(this.X);
            this.X = null;
        }
        if (qw0.p()) {
            d9m.j().destroyDebugPanel(getContext());
        }
    }

    @Override // tb.myg.a
    public void p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("620c3118", new Object[]{this, new Integer(i)});
            return;
        }
        com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.a aVar = this.M;
        if (aVar != null) {
            aVar.B(800, i);
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeFollowDXFragment, com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedBaseFragment, com.taobao.live.home.view.BaseLiveRecyclerFragment
    public void v2(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cb82b62", new Object[]{this, view});
        } else {
            super.v2(view);
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeFollowDXFragment, com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void b3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("503402df", new Object[]{this});
            return;
        }
        super.b3();
        bjr.d().c(zzg.PLAY_PAGEID, false);
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeFollowDXFragment
    public void o3() {
        b0h b0hVar;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3983348d", new Object[]{this});
            return;
        }
        TabManager.TabUp tabUp = this.t;
        if (tabUp == null || tabUp.container == null) {
            r0h.b(a0, "mTabUp == null || mTabUp.container == null");
        } else if (this.w != null && this.c != null && (b0hVar = this.p) != null && b0hVar.q() != null) {
            this.c.removeAllViews();
            if (!this.p.w || !nvs.t()) {
                r0h.b("TaoLiveHomepage", "HomeSelectedFragment renderDXContainer createDX");
                this.u = this.p.q().getDinamicSdkManager().createDX(getContext(), this.t.container.getString("name"), new f());
            } else {
                r0h.b("TaoLiveHomepage", "HomeSelectedFragment renderDXContainer preCreateDX");
                this.u = this.p.q().getDinamicSdkManager().preCreateDX(getContext(), this.t.container.getString("name"), new e());
            }
            r0h.b("TaoLiveHomepage", "HomeSelectedFragment renderDXContainer 1");
            if (this.u != null) {
                r0h.b("TaoLiveHomepage", "HomeSelectedFragment renderDXContainer render start");
                myg mygVar = new myg();
                this.T = mygVar;
                mygVar.l(this);
                if (this.w.get("stautsNavHeight") instanceof Integer) {
                    this.T.o(this.w.getInteger("stautsNavHeight").intValue());
                }
                if (this.w.get("height") instanceof Float) {
                    this.T.k(this.w.getFloat("height").floatValue());
                }
                if (this.w.get("bottomBarHeight") instanceof Float) {
                    this.T.j(this.w.getFloat("bottomBarHeight").floatValue());
                }
                z = this.p.q().getDinamicSdkManager().renderDX(getContext(), this.u, this.w, new DXRenderOptions.b().E(this.T).q(), new g(this));
            } else {
                z = false;
            }
            r0h.b("TaoLiveHomepage", "HomeSelectedFragment renderDXContainer 2");
            if (z) {
                r0h.b("TaoLiveHomepage", "HomeFollowDXFragment renderFollowDXContainer render success");
                this.c.addView(this.u);
                this.c.setVisibility(0);
            }
            r0h.b("TaoLiveHomepage", "HomeFollowDXFragment renderDXContainer 3");
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (nvs.W()) {
            this.Z = false;
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("feedList", (Object) this.R);
            hashMap.put("tppParam", JSON.toJSONString(jSONObject));
            hashMap.put("sessionId", wca.b());
            hashMap.put("userId", Login.getUserId());
            JSONObject jSONObject2 = this.S;
            if (jSONObject2 != null) {
                hashMap.putAll(jSONObject2);
            }
            DAI.runComputeByAlias("Page_TaoLiveHome#backCard", hashMap, new a());
            Handler handler = this.W;
            if (handler != null) {
                handler.sendEmptyMessageDelayed(100, nvs.t0());
                return;
            }
            return;
        }
        I3(null);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONArray f8869a;

        public c(JSONArray jSONArray) {
            this.f8869a = jSONArray;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray();
                DXWidgetNode queryWidgetNodeByUserId = HomeSelectedFragment.this.u.getExpandWidgetNode().queryWidgetNodeByUserId(HomeSelectedFragment.this.k3());
                if (queryWidgetNodeByUserId instanceof DXRecyclerLayout) {
                    DXRecyclerLayout Z = ((DXRecyclerLayout) queryWidgetNodeByUserId).Z();
                    int min = Math.min(6, this.f8869a.size());
                    if (!(Z == null || Z.b0() == null || Z.b0().k() == null || Z.b0().k().size() <= min)) {
                        RecyclerView j0 = Z.j0();
                        int i2 = 0;
                        while (i2 < min) {
                            JSONObject jSONObject = this.f8869a.getJSONObject(i2);
                            if (jSONObject != null) {
                                JSONArray jSONArray2 = jSONObject.getJSONArray("cardData");
                                if (jSONArray2 != null) {
                                    if (!(jSONArray2.size() == 0 || j0.findViewHolderForAdapterPosition(i2) == null)) {
                                        DXWidgetNode dXWidgetNode = Z.b0().k().get(i2);
                                        if (dXWidgetNode != null) {
                                            String[] split = nvs.q0().split(",");
                                            int length = split.length;
                                            DXWidgetNode dXWidgetNode2 = null;
                                            int i3 = 0;
                                            while (true) {
                                                if (i3 >= length) {
                                                    Z = Z;
                                                    break;
                                                }
                                                String str = split[i3];
                                                if (!lrq.a(str)) {
                                                    Z = Z;
                                                    if (dXWidgetNode.getChildAt(0) != null) {
                                                        dXWidgetNode2 = dXWidgetNode.getChildAt(0).queryWidgetNodeByUserId(str);
                                                    }
                                                    if (dXWidgetNode2 != null && dXWidgetNode2.getVisibility() == 0) {
                                                        break;
                                                    }
                                                } else {
                                                    Z = Z;
                                                }
                                                i3++;
                                            }
                                            if (dXWidgetNode2 != null) {
                                                int width = dXWidgetNode2.getWidth();
                                                int height = dXWidgetNode2.getHeight();
                                                String str2 = "";
                                                if (dXWidgetNode2 instanceof DXImageWidgetNode) {
                                                    str2 = ((DXImageWidgetNode) dXWidgetNode2).getImageUrl();
                                                } else if (dXWidgetNode2 instanceof he6) {
                                                    str2 = ((he6) dXWidgetNode2).u();
                                                } else if (dXWidgetNode2 instanceof fe6) {
                                                    str2 = ((fe6) dXWidgetNode2).v();
                                                }
                                                if (width > 0 && height > 0 && !lrq.a(str2)) {
                                                    JSONObject jSONObject2 = new JSONObject();
                                                    jSONObject2.put("imageUrl", (Object) str2);
                                                    jSONObject2.put("width", (Object) Integer.valueOf(width));
                                                    jSONObject2.put("height", (Object) Integer.valueOf(height));
                                                    jSONArray.add(jSONObject2);
                                                }
                                            }
                                            i = 1;
                                            i2 += i;
                                        }
                                    }
                                }
                                Z = Z;
                                i = 1;
                                i2 += i;
                            }
                            Z = Z;
                            i = 1;
                            i2 += i;
                        }
                    }
                }
                if (HomeSelectedFragment.u3(HomeSelectedFragment.this) != null && !lrq.a(HomeSelectedFragment.u3(HomeSelectedFragment.this).getImageUrl()) && HomeSelectedFragment.u3(HomeSelectedFragment.this).getVisibility() == 0) {
                    int width2 = HomeSelectedFragment.u3(HomeSelectedFragment.this).getWidth();
                    int height2 = HomeSelectedFragment.u3(HomeSelectedFragment.this).getHeight();
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("imageUrl", (Object) HomeSelectedFragment.u3(HomeSelectedFragment.this).getImageUrl());
                    jSONObject3.put("width", (Object) Integer.valueOf(width2));
                    jSONObject3.put("height", (Object) Integer.valueOf(height2));
                    jSONArray.add(jSONObject3);
                }
                nwg.e(Globals.getApplication(), "jingxuanFirstPageImageSp", JSON.toJSONString(jSONArray));
                r0h.b("TaoLiveHomepage", "delayWriteImageCache success");
            } catch (Exception unused) {
                r0h.b("TaoLiveHomepage", "delayWriteImageCache error");
            }
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeFollowDXFragment, tb.nlc
    public void onLiveEvent(String str, Object obj) {
        String str2;
        JSONObject jSONObject;
        TUrlImageView tUrlImageView;
        JSONObject jSONObject2;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d9ef1c", new Object[]{this, str, obj});
        } else if (str.equals("com.taobao.taolive.faxian.scrollOuterToTop")) {
            DXWidgetNode queryWidgetNodeByUserId = this.u.getExpandWidgetNode().queryWidgetNodeByUserId(k3());
            if (queryWidgetNodeByUserId instanceof DXRecyclerLayout) {
                DXRecyclerLayout dXRecyclerLayout = (DXRecyclerLayout) queryWidgetNodeByUserId;
                if (dXRecyclerLayout.j0() != null) {
                    if (this.A == -1 && (findViewHolderForAdapterPosition = dXRecyclerLayout.j0().findViewHolderForAdapterPosition(2)) != null) {
                        Rect rect = new Rect();
                        findViewHolderForAdapterPosition.itemView.getGlobalVisibleRect(rect);
                        this.A = rect.top - qw0.d(getContext(), this.w.getInteger("stautsNavHeight").intValue());
                    }
                    this.z = this.A;
                    dXRecyclerLayout.c1(false, 2);
                }
            }
        } else if (j5h.a("com.taobao.taolive.faxian.first_page", str)) {
            r0h.b("TaoLiveHomepage", "TaoLiveHomepageProcessor lazyLoadData");
            J3();
            this.I = "";
            this.M.v(false);
            this.M.t(false);
            if (this.M != null && (obj instanceof JSONObject)) {
                JSONObject jSONObject3 = (JSONObject) obj;
                String string = jSONObject3.getString("type");
                JSONObject jSONObject4 = jSONObject3.getJSONObject("data");
                JSONArray jSONArray = new JSONArray();
                if (!(jSONObject4 == null || jSONObject4.getJSONObject("data") == null)) {
                    boolean U = nvs.U();
                    JSONArray jSONArray2 = jSONObject4.getJSONObject("data").getJSONArray("cardList");
                    if (jSONArray2 != null && jSONArray2.size() == 3) {
                        JSONObject jSONObject5 = jSONArray2.getJSONObject(0);
                        if (jSONObject5 != null) {
                            this.H = jSONObject5.getString("background");
                            JSONArray jSONArray3 = jSONObject5.getJSONArray("cardTypes");
                            if (!(this.O == null || (tUrlImageView = this.N) == null)) {
                                tUrlImageView.setImageUrl("");
                                this.E = false;
                                if (getContext() != null) {
                                    this.N.getLayoutParams().height = sj7.b(getContext(), 336.0f);
                                    this.O.getLayoutParams().height = sj7.b(getContext(), 336.0f);
                                    this.N.setTranslationY(0.0f);
                                }
                                if (jSONArray3 != null && jSONArray3.contains("newChannelCommercialCard")) {
                                    boolean a2 = qw0.a();
                                    this.M.v(true);
                                    this.M.t(true);
                                    if (jSONObject5.getJSONArray("cardData") != null && jSONObject5.getJSONArray("cardData").size() > 0) {
                                        JSONObject jSONObject6 = jSONObject5.getJSONArray("cardData").getJSONObject(0);
                                        if (jSONObject6.getJSONArray("cardData") != null && jSONObject6.getJSONArray("cardData").size() > 0) {
                                            JSONObject jSONObject7 = jSONObject6.getJSONArray("cardData").getJSONObject(0);
                                            String string2 = jSONObject7.getString("backgroundPicUrl");
                                            this.H = string2;
                                            if (!TextUtils.isEmpty(string2)) {
                                                this.O.setVisibility(8);
                                                this.N.setVisibility(0);
                                                if (getContext() != null) {
                                                    this.N.getLayoutParams().height = (qw0.l() * 720) / 750;
                                                    this.N.setTranslationY(Math.min((((-qw0.l()) * 12) / 750) + (sj7.i(getContext()) != 0 ? sj7.i(getContext()) - 104 : 0), 0));
                                                }
                                                if ((TextUtils.isEmpty(string) || !string.equals("cache")) && !this.F) {
                                                    this.F = true;
                                                    JSONObject jSONObject8 = jSONObject7.getJSONObject("showMaidian");
                                                    if (jSONObject8 != null) {
                                                        p9m.f(jSONObject8.getString("name"), jSONObject8.getString("params"));
                                                    }
                                                }
                                                this.E = true;
                                            }
                                            if (!TextUtils.isEmpty(this.H)) {
                                                if (!"true".equals(jSONObject7.getString("isGIF")) || a2) {
                                                    this.N.setSkipAutoSize(false);
                                                } else {
                                                    this.N.setSkipAutoSize(true);
                                                }
                                                this.K = false;
                                                if (!nvs.V() || !U || !string.equals("cache") || !qw0.a()) {
                                                    this.N.setImageUrl(this.H);
                                                } else {
                                                    this.N.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01j32P8U26dmiZXwscZ_!!6000000007685-0-tps-750-720.jpg");
                                                }
                                                this.N.failListener(new d());
                                            }
                                        }
                                    }
                                } else if (jSONArray3 == null || !jSONArray3.contains("liveSmartIsLandCard")) {
                                    this.O.setVisibility(8);
                                    if (!lrq.a(this.H)) {
                                        this.N.setImageUrl(this.H);
                                        this.M.v(true);
                                    } else {
                                        this.N.setImageUrl(this.G);
                                    }
                                } else {
                                    this.O.setVisibility(0);
                                    if (!((!nvs.v0() || jSONObject5.getJSONArray("cardData") == null || jSONObject5.getJSONArray("cardData").size() <= 0 || (jSONObject2 = jSONObject5.getJSONArray("cardData").getJSONObject(0)) == null || !(jSONObject2.get("newSmartIsland") instanceof String)) ? false : Boolean.parseBoolean(jSONObject2.getString("newSmartIsland"))) || TextUtils.isEmpty(this.H)) {
                                        this.N.setImageUrl(this.G);
                                    } else {
                                        this.N.setImageUrl(this.H);
                                    }
                                }
                            }
                            boolean a3 = lrq.a(this.H);
                            this.J = a3;
                            if (this.s) {
                                N3(a3);
                            }
                        }
                        if (!TextUtils.isEmpty(string) && !string.equals("cache") && (jSONObject = jSONArray2.getJSONObject(2)) != null && jSONObject.getJSONArray("cardData") != null && jSONObject.getJSONArray("cardData").size() > 0) {
                            int size = jSONObject.getJSONArray("cardData").size();
                            JSONArray jSONArray4 = jSONObject.getJSONArray("cardData");
                            if (nvs.v() && U) {
                                F3(jSONArray4);
                            }
                            for (int i = 0; i < size && i < 6; i++) {
                                JSONObject jSONObject9 = jSONArray4.getJSONObject(i);
                                if (!(jSONObject9.getJSONArray("cardData") == null || jSONObject9.getJSONArray("cardData").size() <= 0 || jSONObject9.getJSONArray("cardData").getJSONObject(0) == null || jSONObject9.getJSONArray("cardData").getJSONObject(0).getJSONObject("accountInfo") == null)) {
                                    JSONObject jSONObject10 = jSONObject9.getJSONArray("cardData").getJSONObject(0).getJSONObject("accountInfo");
                                    JSONObject jSONObject11 = new JSONObject();
                                    jSONObject11.put("accountId", (Object) jSONObject10.getString("accountId"));
                                    jSONObject11.put("feedId", (Object) jSONObject10.getString("feedId"));
                                    jSONArray.add(jSONObject11);
                                }
                            }
                        }
                    }
                    b0h b0hVar = this.p;
                    if (b0hVar != null) {
                        b0hVar.x(jSONArray);
                    }
                }
            }
        } else if (j5h.a(bg6.EVENT_TAOLIVE_FAXIAN_TOP_MARQUEE_BACKGROUND, str)) {
            FrameLayout frameLayout = this.O;
            if (frameLayout == null || frameLayout.getVisibility() != 8 || !this.E) {
                if (obj instanceof String) {
                    str2 = (String) obj;
                } else {
                    str2 = "";
                }
                if (lrq.a(str2)) {
                    str2 = this.H;
                }
                if (lrq.a(str2) || lrq.a(this.I) || !this.I.equals(str2)) {
                    this.I = str2;
                    if (!(this.P == null || this.Q == null)) {
                        if (!lrq.a(str2)) {
                            this.M.v(true);
                            if (this.D) {
                                E3(this.P, true, str2);
                                E3(this.Q, false, "");
                            } else {
                                E3(this.Q, true, str2);
                                E3(this.P, false, "");
                            }
                        } else {
                            this.M.v(false);
                            E3(this.P, false, "");
                            E3(this.Q, false, "");
                        }
                        this.J = lrq.a(str2);
                        if ("jingxuan".equals(this.h)) {
                            G3().Y3(this.J);
                        }
                        this.D = !this.D;
                    }
                }
            }
        } else if (j5h.a("com.taobao.taolive.faxian.insertCard", str) && (obj instanceof JSONObject)) {
            this.S = (JSONObject) obj;
        }
    }
}
