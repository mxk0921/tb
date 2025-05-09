package com.taobao.android.weex_ability.page;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexErrorType;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex_ability.xr.XRInitializer;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.Map;
import tb.dde;
import tb.j6x;
import tb.lce;
import tb.pce;
import tb.q6x;
import tb.rrd;
import tb.t2o;
import tb.x8x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WeexContainerFragment extends Fragment implements j6x {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_BUNDLE_URL = "bundleUrl";
    public static final String KEY_CONFIG = "config";
    public static final String KEY_INIT_DATA = "initData";
    public static final String KEY_OPTIONS = "options";
    public static final String KEY_WLM_URL = "wlmUrl";
    public static final String MUS_NAVIGATION_ADAPTER = "ali_ms_navigation";
    public static final String TLOG_MODULE = "Weex/WeexFragment/";

    /* renamed from: a  reason: collision with root package name */
    public WeexInstance f9950a;
    public FrameLayout c;
    public FrameLayout d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public View.OnLayoutChangeListener i;
    public boolean j = false;
    public XRInitializer k;
    public dde l;
    public pce m;
    public j6x n;
    public lce o;

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
            if (WeexContainerFragment.p2(WeexContainerFragment.this) == 0 || WeexContainerFragment.s2(WeexContainerFragment.this) == 0) {
                WeexContainerFragment.r2(WeexContainerFragment.this, i3 - i);
                WeexContainerFragment.u2(WeexContainerFragment.this, i4 - i2);
                WeexContainerFragment.this.E2();
            }
            WeexContainerFragment weexContainerFragment = WeexContainerFragment.this;
            weexContainerFragment.d.removeOnLayoutChangeListener(WeexContainerFragment.v2(weexContainerFragment));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements rrd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f9952a;

        public b(WeexContainerFragment weexContainerFragment, boolean z) {
            this.f9952a = z;
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
            if (!this.f9952a) {
                return frameLayout;
            }
            frameLayout.setBackgroundColor(-1);
            View progressBar = new ProgressBar(context);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            progressBar.setLayoutParams(layoutParams);
            frameLayout.addView(progressBar);
            return frameLayout;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c implements XRInitializer.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<WeexContainerFragment> f9953a;
        public final JSONObject b;

        static {
            t2o.a(980418675);
            t2o.a(980418696);
        }

        public c(WeexContainerFragment weexContainerFragment, JSONObject jSONObject) {
            this.f9953a = new WeakReference<>(weexContainerFragment);
            this.b = jSONObject;
        }

        @Override // com.taobao.android.weex_ability.xr.XRInitializer.d
        public void a() {
            WeexInstance weexInstance;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b73e44bf", new Object[]{this});
                return;
            }
            WeexContainerFragment weexContainerFragment = this.f9953a.get();
            if (weexContainerFragment != null && (weexInstance = weexContainerFragment.f9950a) != null) {
                weexContainerFragment.H0(weexInstance, false, WeexErrorType.ERR_RENDER, "XR initialize failed");
            }
        }

        @Override // com.taobao.android.weex_ability.xr.XRInitializer.d
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2c6c7ef", new Object[]{this});
                return;
            }
            WeexContainerFragment weexContainerFragment = this.f9953a.get();
            if (weexContainerFragment != null) {
                weexContainerFragment.z2(weexContainerFragment.getContext(), this.b);
            }
        }
    }

    static {
        t2o.a(980418671);
        t2o.a(982515791);
    }

    public static WeexContainerFragment C2(String str, String str2, Map<String, String> map, JSONObject jSONObject, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexContainerFragment) ipChange.ipc$dispatch("f7282e7b", new Object[]{str, str2, map, jSONObject, map2});
        }
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
        WeexContainerFragment weexContainerFragment = new WeexContainerFragment();
        weexContainerFragment.setArguments(bundle);
        return weexContainerFragment;
    }

    public static /* synthetic */ Object ipc$super(WeexContainerFragment weexContainerFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/page/WeexContainerFragment");
        }
    }

    public static /* synthetic */ int p2(WeexContainerFragment weexContainerFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("35767df9", new Object[]{weexContainerFragment})).intValue();
        }
        return weexContainerFragment.h;
    }

    public static /* synthetic */ int r2(WeexContainerFragment weexContainerFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4db8c5ee", new Object[]{weexContainerFragment, new Integer(i)})).intValue();
        }
        weexContainerFragment.h = i;
        return i;
    }

    public static /* synthetic */ int s2(WeexContainerFragment weexContainerFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1137f9ba", new Object[]{weexContainerFragment})).intValue();
        }
        return weexContainerFragment.g;
    }

    public static /* synthetic */ int u2(WeexContainerFragment weexContainerFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea26c24d", new Object[]{weexContainerFragment, new Integer(i)})).intValue();
        }
        weexContainerFragment.g = i;
        return i;
    }

    public static /* synthetic */ View.OnLayoutChangeListener v2(WeexContainerFragment weexContainerFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnLayoutChangeListener) ipChange.ipc$dispatch("7e5c5ddb", new Object[]{weexContainerFragment});
        }
        return weexContainerFragment.i;
    }

    public void A2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5467727c", new Object[]{this});
            return;
        }
        WeexInstance weexInstance = this.f9950a;
        if (weexInstance != null) {
            weexInstance.destroy();
            this.f9950a = null;
        }
        FrameLayout frameLayout = this.d;
        if (frameLayout == null) {
            this.e = true;
            D2();
            return;
        }
        frameLayout.removeAllViews();
        D2();
    }

    public WeexInstance B2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("ded4f1a2", new Object[]{this});
        }
        return this.f9950a;
    }

    public final void D2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf8ae9b3", new Object[]{this});
        }
    }

    @Override // tb.j6x
    public void E1(WeexInstance weexInstance, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f794a71b", new Object[]{this, weexInstance, new Boolean(z)});
            return;
        }
        j6x j6xVar = this.n;
        if (j6xVar != null) {
            j6xVar.E1(weexInstance, z);
        }
    }

    public void E2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1fc864c", new Object[]{this});
        } else if (this.g != 0 && this.h != 0 && !this.j && this.f9950a != null && getActivity() != null) {
            this.f9950a.updateContainerSize(this.h, this.g);
            this.j = true;
        }
    }

    @Override // tb.j6x
    public void H0(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99cc9148", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
            return;
        }
        j6x j6xVar = this.n;
        if (j6xVar != null) {
            j6xVar.H0(weexInstance, z, weexErrorType, str);
        }
        A2();
    }

    @Override // tb.j6x
    public void I1(WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68c948df", new Object[]{this, weexInstance});
            return;
        }
        j6x j6xVar = this.n;
        if (j6xVar != null) {
            j6xVar.I1(weexInstance);
        }
    }

    public rrd J2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rrd) ipChange.ipc$dispatch("93eb3996", new Object[]{this, new Boolean(z)});
        }
        return new b(this, z);
    }

    @Override // tb.j6x
    public void K0(WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad8178b2", new Object[]{this, weexInstance});
            return;
        }
        j6x j6xVar = this.n;
        if (j6xVar != null) {
            j6xVar.K0(weexInstance);
        }
    }

    @Override // tb.j6x
    public void K1(WeexInstance weexInstance, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a414e261", new Object[]{this, weexInstance, new Boolean(z)});
            return;
        }
        j6x j6xVar = this.n;
        if (j6xVar != null) {
            j6xVar.K1(weexInstance, z);
        }
    }

    public final void K2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abfb5703", new Object[]{this});
            return;
        }
        WeexInstance weexInstance = this.f9950a;
        if (weexInstance != null) {
            weexInstance.destroy();
            this.f9950a = null;
        }
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            this.c = null;
        }
        XRInitializer xRInitializer = this.k;
        if (xRInitializer != null) {
            xRInitializer.d();
            this.k = null;
        }
        this.f = false;
    }

    public void M2(lce lceVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce706660", new Object[]{this, lceVar});
        } else {
            this.o = lceVar;
        }
    }

    public void N2(pce pceVar) {
        WeexInstance weexInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c815e890", new Object[]{this, pceVar});
            return;
        }
        this.m = pceVar;
        if (pceVar != null && (weexInstance = this.f9950a) != null && weexInstance.getExtend(q6x.class) != null) {
            ((q6x) this.f9950a.getExtend(q6x.class)).setGestureEventListener(pceVar);
        }
    }

    public void O2(dde ddeVar) {
        WeexInstance weexInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17d30c64", new Object[]{this, ddeVar});
            return;
        }
        this.l = ddeVar;
        if (ddeVar != null && (weexInstance = this.f9950a) != null && weexInstance.getExtend(q6x.class) != null) {
            ((q6x) this.f9950a.getExtend(q6x.class)).setWeexScrollListener(ddeVar);
        }
    }

    public void Q2(j6x j6xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49d4031d", new Object[]{this, j6xVar});
        } else {
            this.n = j6xVar;
        }
    }

    public void R2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfc2c5b6", new Object[]{this});
            return;
        }
        WeexInstance weexInstance = this.f9950a;
        if (weexInstance != null && weexInstance.getExtend(x8x.class) != null) {
            ((x8x) this.f9950a.getExtend(x8x.class)).updateViewport();
        }
    }

    @Override // tb.j6x
    public void d2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a7821b2", new Object[]{this, weexInstance, weexErrorType, str});
            return;
        }
        j6x j6xVar = this.n;
        if (j6xVar != null) {
            j6xVar.d2(weexInstance, weexErrorType, str);
        }
    }

    @Override // tb.j6x
    public void e2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52b846bb", new Object[]{this, weexInstance, weexErrorType, str});
            return;
        }
        j6x j6xVar = this.n;
        if (j6xVar != null) {
            j6xVar.e2(weexInstance, weexErrorType, str);
        }
    }

    @Override // tb.j6x
    public void l2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55726f6d", new Object[]{this, weexInstance, weexErrorType, str});
            return;
        }
        j6x j6xVar = this.n;
        if (j6xVar != null) {
            j6xVar.l2(weexInstance, weexErrorType, str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        WeexInstance weexInstance = this.f9950a;
        if (weexInstance != null) {
            weexInstance.onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        if (this.f) {
            return this.c;
        }
        this.f = true;
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.fragment_mus_page, viewGroup, false);
        this.c = frameLayout;
        FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(R.id.render_container);
        this.d = frameLayout2;
        a aVar = new a();
        this.i = aVar;
        frameLayout2.addOnLayoutChangeListener(aVar);
        z2(layoutInflater.getContext(), null);
        return frameLayout;
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
        } else {
            super.onDestroyView();
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
        WeexInstance weexInstance = this.f9950a;
        if (weexInstance != null) {
            weexInstance.onActivityPause();
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
        WeexInstance weexInstance = this.f9950a;
        if (weexInstance != null) {
            weexInstance.onActivityResume();
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
        WeexInstance weexInstance = this.f9950a;
        if (weexInstance != null) {
            weexInstance.onActivityStart();
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
        WeexInstance weexInstance = this.f9950a;
        if (weexInstance != null) {
            weexInstance.onActivityStop();
        }
    }

    @Override // tb.j6x
    public void z1(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bee002", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
            return;
        }
        j6x j6xVar = this.n;
        if (j6xVar != null) {
            j6xVar.z1(weexInstance, z, weexErrorType, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0157 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void z2(android.content.Context r14, com.alibaba.fastjson.JSONObject r15) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_ability.page.WeexContainerFragment.z2(android.content.Context, com.alibaba.fastjson.JSONObject):void");
    }
}
