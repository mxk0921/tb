package com.taobao.android.weex_ability.page;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.xr.XRInitializer;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import tb.awh;
import tb.dde;
import tb.dwh;
import tb.fxh;
import tb.kpc;
import tb.kq2;
import tb.lce;
import tb.npc;
import tb.rrd;
import tb.swh;
import tb.t2o;
import tb.w6a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WeexFragment extends Fragment implements npc, kpc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FRAGMENT_TAG = "ali_mus_fragment_tag";
    public static final String KEY_BUNDLE_URL = "bundleUrl";
    public static final String KEY_CONFIG = "config";
    public static final String KEY_INIT_DATA = "initData";
    public static final String KEY_OPTIONS = "options";
    public static final String KEY_WLM_URL = "wlmUrl";
    public static final String MUS_NAVIGATION_ADAPTER = "ali_ms_navigation";
    public static final String WEEX_POP_ID = "wx_popId";

    /* renamed from: a  reason: collision with root package name */
    public FrameLayout f9954a;
    public FrameLayout c;
    public com.taobao.android.weex_framework.a d;
    public Object e;
    public npc f;
    public dde g;
    public w6a h;
    public lce i;
    public boolean j;
    public boolean k;
    public c l;
    public String m;
    public int n;
    public int o;
    public View.OnLayoutChangeListener p;
    public XRInitializer r;
    public String t;
    public boolean q = false;
    public int s = -1;
    public boolean u = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                return;
            }
            WeexFragment weexFragment = WeexFragment.this;
            if (weexFragment.o == 0 || weexFragment.n == 0) {
                weexFragment.o = i3 - i;
                weexFragment.n = i4 - i2;
                weexFragment.E2();
            }
            WeexFragment weexFragment2 = WeexFragment.this;
            weexFragment2.c.removeOnLayoutChangeListener(weexFragment2.p);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements rrd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f9956a;

        public b(WeexFragment weexFragment, boolean z) {
            this.f9956a = z;
        }

        @Override // tb.rrd
        public void a(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("62e134d1", new Object[]{this, runnable});
            } else {
                runnable.run();
            }
        }

        @Override // tb.rrd
        public View b(Context context, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("399b915d", new Object[]{this, context, bundle});
            }
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            if (!this.f9956a) {
                return frameLayout;
            }
            frameLayout.setBackgroundColor(-1);
            return frameLayout;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface c {
        void onDowngrade();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d implements XRInitializer.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<WeexFragment> f9957a;
        public final JSONObject b;

        static {
            t2o.a(980418680);
            t2o.a(980418696);
        }

        public d(WeexFragment weexFragment, JSONObject jSONObject) {
            this.f9957a = new WeakReference<>(weexFragment);
            this.b = jSONObject;
        }

        @Override // com.taobao.android.weex_ability.xr.XRInitializer.d
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b73e44bf", new Object[]{this});
                return;
            }
            WeexFragment weexFragment = this.f9957a.get();
            if (weexFragment != null) {
                weexFragment.onRenderFailed(null, 2, "XR initialize failed", true);
            }
        }

        @Override // com.taobao.android.weex_ability.xr.XRInitializer.d
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2c6c7ef", new Object[]{this});
                return;
            }
            WeexFragment weexFragment = this.f9957a.get();
            if (weexFragment != null) {
                weexFragment.r2(weexFragment.getContext(), this.b);
            }
        }
    }

    static {
        t2o.a(980418676);
        t2o.a(982515990);
        t2o.a(982515989);
    }

    public static WeexFragment B2(String str, String str2, Map<String, String> map, JSONObject jSONObject, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexFragment) ipChange.ipc$dispatch("c8142eba", new Object[]{str, str2, map, jSONObject, map2});
        }
        long currentTimeMillis = System.currentTimeMillis();
        Bundle bundle = new Bundle();
        bundle.putString("wlmUrl", str);
        bundle.putString("bundleUrl", str2);
        if (jSONObject != null) {
            bundle.putSerializable("initData", jSONObject);
        }
        if (map2 != null) {
            bundle.putString("options", JSON.toJSONString(map2));
        }
        if (map != null) {
            bundle.putString("config", JSON.toJSONString(map));
        }
        WeexFragment weexFragment = new WeexFragment();
        weexFragment.setArguments(bundle);
        weexFragment.D2(str, str2, currentTimeMillis);
        return weexFragment;
    }

    public static /* synthetic */ Object ipc$super(WeexFragment weexFragment, String str, Object... objArr) {
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
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/page/WeexFragment");
        }
    }

    public int A2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("35319dbd", new Object[]{this})).intValue();
        }
        return this.s;
    }

    public final void C2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf8ae9b3", new Object[]{this});
            return;
        }
        c cVar = this.l;
        if (cVar != null) {
            cVar.onDowngrade();
        }
    }

    public void D2(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e5b41c1", new Object[]{this, str, str2, new Long(j)});
        } else {
            this.m = str2;
        }
    }

    public void E2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1fc864c", new Object[]{this});
        } else if (this.n != 0 && this.o != 0 && !this.q && this.d != null && getActivity() != null) {
            float m = fxh.m(getActivity(), this.o);
            float m2 = fxh.m(getActivity(), this.n);
            this.d.addInstanceEnv("containerWidth", String.valueOf(m));
            this.d.addInstanceEnv("containerHeight", String.valueOf(m2));
            this.d.setConstrainedSize(new kq2(this.o, this.n));
            this.q = true;
        }
    }

    public rrd J2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rrd) ipChange.ipc$dispatch("93eb3996", new Object[]{this, new Boolean(z)});
        }
        return new b(this, z);
    }

    public final void K2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abfb5703", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.a aVar = this.d;
        if (aVar != null) {
            aVar.destroy();
            this.d = null;
        }
        FrameLayout frameLayout = this.f9954a;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            this.f9954a = null;
        }
        XRInitializer xRInitializer = this.r;
        if (xRInitializer != null) {
            xRInitializer.d();
            this.r = null;
        }
        this.k = false;
    }

    public final void M2(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9fb3548", new Object[]{this, mUSDKInstance});
        }
    }

    public void N2(lce lceVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce706660", new Object[]{this, lceVar});
        } else {
            this.i = lceVar;
        }
    }

    public void O2(w6a w6aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41769c1", new Object[]{this, w6aVar});
            return;
        }
        this.h = w6aVar;
        com.taobao.android.weex_framework.a aVar = this.d;
        if (aVar != null) {
            aVar.setGestureStateListener(w6aVar);
        }
    }

    public void Q2(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5b1ce3c", new Object[]{this, obj});
            return;
        }
        this.e = obj;
        com.taobao.android.weex_framework.a aVar = this.d;
        if (aVar != null) {
            aVar.setTag("ali_ms_navigation", obj);
        }
    }

    public void R2(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ade0451", new Object[]{this, cVar});
        } else {
            this.l = cVar;
        }
    }

    public void S2(dde ddeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17d30c64", new Object[]{this, ddeVar});
            return;
        }
        this.g = ddeVar;
        com.taobao.android.weex_framework.a aVar = this.d;
        if (aVar != null) {
            aVar.setWeexScrollListener(ddeVar);
        }
    }

    public void T2(npc npcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6adff9a", new Object[]{this, npcVar});
        } else {
            this.f = npcVar;
        }
    }

    public Map<String, Object> U2(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("15026c6e", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        return hashMap;
    }

    public void W2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfc2c5b6", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.a aVar = this.d;
        if (aVar != null) {
            aVar.updateViewport();
        }
    }

    @Override // tb.kpc
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
        } else if (view != null) {
            view.setFitsSystemWindows(false);
            this.c.addView(view, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    public String getBundleUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dee20482", new Object[]{this});
        }
        return this.m;
    }

    public String getOriginalUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cd9dbb51", new Object[]{this});
        }
        return getArguments().getString("wlmUrl");
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
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        K2();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            return;
        }
        super.onDestroyView();
        K2();
    }

    @Override // tb.npc
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
            return;
        }
        M2(mUSDKInstance);
        npc npcVar = this.f;
        if (npcVar != null) {
            npcVar.onDestroyed(mUSDKInstance);
        }
    }

    @Override // tb.npc
    public void onJSException(com.taobao.android.weex_framework.a aVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c41b6de", new Object[]{this, aVar, new Integer(i), str});
            return;
        }
        npc npcVar = this.f;
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
    }

    @Override // tb.npc
    public void onPrepareSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a2635b", new Object[]{this, aVar});
            return;
        }
        npc npcVar = this.f;
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
        npc npcVar = this.f;
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
        System.currentTimeMillis();
        npc npcVar = this.f;
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
        this.s = i;
        this.t = str;
        s2();
        npc npcVar = this.f;
        if (npcVar != null) {
            npcVar.onRenderFailed(aVar, i, str, z);
        }
        String originalUrl = getOriginalUrl();
        if (originalUrl != null) {
            try {
                Uri parse = Uri.parse(originalUrl);
                if (awh.f(parse)) {
                    originalUrl = parse.buildUpon().clearQuery().toString();
                }
            } catch (Exception e) {
                dwh.i(e);
            }
            swh.a().c(originalUrl);
        }
    }

    @Override // tb.npc
    public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
            return;
        }
        npc npcVar = this.f;
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
        com.taobao.android.weex_framework.a aVar = this.d;
        if (aVar != null) {
            aVar.onActivityResume();
        }
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

    public void p2(int i, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f24c7ca", new Object[]{this, new Integer(i), str, jSONObject});
            return;
        }
        com.taobao.android.weex_framework.a aVar = this.d;
        if (aVar != null) {
            aVar.fireEvent(i, str, jSONObject);
        }
    }

    public void s2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5467727c", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.a aVar = this.d;
        if (aVar != null) {
            aVar.destroy();
            this.d = null;
        }
        FrameLayout frameLayout = this.c;
        if (frameLayout == null) {
            this.j = true;
            C2();
            return;
        }
        frameLayout.removeAllViews();
        C2();
    }

    public void u2(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63f0e3fb", new Object[]{this, str, jSONObject});
            return;
        }
        com.taobao.android.weex_framework.a aVar = this.d;
        if (aVar != null) {
            aVar.sendInstanceMessage(str, jSONObject);
        }
    }

    public com.taobao.android.weex_framework.a v2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.a) ipChange.ipc$dispatch("e88d359f", new Object[]{this});
        }
        return this.d;
    }

    public String z2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("93497721", new Object[]{this});
        }
        return this.t;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        if (this.k) {
            return this.f9954a;
        }
        this.k = true;
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.fragment_mus_page, viewGroup, false);
        this.f9954a = frameLayout;
        FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(R.id.render_container);
        this.c = frameLayout2;
        a aVar = new a();
        this.p = aVar;
        frameLayout2.addOnLayoutChangeListener(aVar);
        try {
            String path = Uri.parse(this.m).getPath();
            if (path != null && !path.startsWith("/muise_scan_dev") && !path.startsWith("/muise_dev")) {
                path.startsWith("/muise_scan");
            }
            if (Uri.parse(this.m).getQueryParameter("wx_popId") != null) {
                r2(layoutInflater.getContext(), null);
                return frameLayout;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        r2(layoutInflater.getContext(), null);
        return frameLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0228  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void r2(android.content.Context r24, com.alibaba.fastjson.JSONObject r25) {
        /*
            Method dump skipped, instructions count: 625
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_ability.page.WeexFragment.r2(android.content.Context, com.alibaba.fastjson.JSONObject):void");
    }
}
