package com.taobao.android.detail.ttdetail.floatview;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.activity.BackEventCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.bridge.TTFloatViewWeexModule;
import com.taobao.android.detail.ttdetail.communication.ThreadMode;
import com.taobao.vessel.weex.VesselWeexView;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.bw7;
import tb.eo9;
import tb.gx9;
import tb.ntc;
import tb.q84;
import tb.ros;
import tb.t2o;
import tb.tgh;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TTVesselWeexViewDecorator implements ntc<eo9> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public FragmentManager c;
    public final VesselWeexView d;
    public ViewGroup e;
    public final FragmentActivity f;

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f6780a = new ArrayList();
    public boolean b = false;
    public String g = "";
    public final List<JSONObject> h = new ArrayList();
    public final Handler i = new Handler(Looper.getMainLooper());
    public final FragmentManager.OnBackStackChangedListener j = new FragmentManager.OnBackStackChangedListener() { // from class: com.taobao.android.detail.ttdetail.floatview.TTVesselWeexViewDecorator.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
        public /* synthetic */ void onBackStackChangeCancelled() {
            gx9.a(this);
        }

        @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
        public /* synthetic */ void onBackStackChangeCommitted(Fragment fragment, boolean z) {
            gx9.b(this, fragment, z);
        }

        @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
        public /* synthetic */ void onBackStackChangeProgressed(BackEventCompat backEventCompat) {
            gx9.c(this, backEventCompat);
        }

        @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
        public /* synthetic */ void onBackStackChangeStarted(Fragment fragment, boolean z) {
            gx9.d(this, fragment, z);
        }

        @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
        public void onBackStackChanged() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2062519", new Object[]{this});
            } else if (TTVesselWeexViewDecorator.a(TTVesselWeexViewDecorator.this).getBackStackEntryCount() == 0) {
                TTVesselWeexViewDecorator.this.n();
            } else {
                TTVesselWeexViewDecorator.this.m();
            }
        }
    };
    public final Runnable k = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TTVesselWeexViewDecorator.b(TTVesselWeexViewDecorator.this).clear();
            }
        }
    }

    static {
        t2o.a(912261795);
        t2o.a(912261362);
    }

    public TTVesselWeexViewDecorator(Activity activity, ze7 ze7Var) {
        this.d = new VesselWeexView(activity);
        this.f = (FragmentActivity) activity;
        g();
    }

    public static /* synthetic */ FragmentManager a(TTVesselWeexViewDecorator tTVesselWeexViewDecorator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentManager) ipChange.ipc$dispatch("a105aaa3", new Object[]{tTVesselWeexViewDecorator});
        }
        return tTVesselWeexViewDecorator.c;
    }

    public static /* synthetic */ List b(TTVesselWeexViewDecorator tTVesselWeexViewDecorator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4e36f95e", new Object[]{tTVesselWeexViewDecorator});
        }
        return tTVesselWeexViewDecorator.h;
    }

    public static /* synthetic */ void c(TTVesselWeexViewDecorator tTVesselWeexViewDecorator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2b7500a", new Object[]{tTVesselWeexViewDecorator});
        } else {
            tTVesselWeexViewDecorator.o();
        }
    }

    public static /* synthetic */ FragmentActivity d(TTVesselWeexViewDecorator tTVesselWeexViewDecorator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentActivity) ipChange.ipc$dispatch("83634d14", new Object[]{tTVesselWeexViewDecorator});
        }
        return tTVesselWeexViewDecorator.f;
    }

    public static /* synthetic */ String e(TTVesselWeexViewDecorator tTVesselWeexViewDecorator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50c30994", new Object[]{tTVesselWeexViewDecorator});
        }
        return tTVesselWeexViewDecorator.g;
    }

    public static /* synthetic */ void f(TTVesselWeexViewDecorator tTVesselWeexViewDecorator, Context context, String str, String str2, String str3, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22e61d2c", new Object[]{tTVesselWeexViewDecorator, context, str, str2, str3, map});
        } else {
            tTVesselWeexViewDecorator.u(context, str, str2, str3, map);
        }
    }

    @Override // tb.ntc
    public ThreadMode W2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadMode) ipChange.ipc$dispatch("e1b5ec98", new Object[]{this});
        }
        return ThreadMode.MainThread;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21f8b27c", new Object[]{this});
            return;
        }
        q84.i(this.f, eo9.class, this);
        if (this.c == null) {
            this.c = this.f.getSupportFragmentManager();
        }
        FragmentManager fragmentManager = this.c;
        if (fragmentManager != null) {
            fragmentManager.addOnBackStackChangedListener(this.j);
        }
        VesselWeexView vesselWeexView = this.d;
        if (vesselWeexView != null) {
            vesselWeexView.setOnLoadListener(new ros(this));
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        tgh.b("TTVesselWeexViewDecorator", "dismiss");
        VesselWeexView vesselWeexView = this.d;
        if (vesselWeexView != null) {
            vesselWeexView.setVisibility(8);
        }
    }

    public VesselWeexView i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VesselWeexView) ipChange.ipc$dispatch("19dd496d", new Object[]{this});
        }
        return this.d;
    }

    public ViewGroup j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("260a5a4", new Object[]{this});
        }
        ViewGroup viewGroup = this.e;
        if (viewGroup == null) {
            return this.d;
        }
        return viewGroup;
    }

    public void k(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bfbb5b6", new Object[]{this, str, jSONObject});
        } else if (this.d != null) {
            String str2 = str + "&_weexfloatParams=" + URLEncoder.encode(JSON.toJSONString(jSONObject)) + "&enableMulitMessageChannel=true";
            this.g = str2;
            this.d.loadUrl(str2, null);
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        tgh.b("TTVesselWeexViewDecorator", "onDestroy");
        r();
        ((ArrayList) this.f6780a).clear();
        VesselWeexView vesselWeexView = this.d;
        if (vesselWeexView != null) {
            vesselWeexView.onDestroy();
        }
        this.i.removeCallbacks(this.k);
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f98f9c6b", new Object[]{this});
            return;
        }
        this.b = true;
        h();
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cc32f06", new Object[]{this});
        } else if (this.b) {
            t();
            this.b = false;
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1635b0de", new Object[]{this});
        } else {
            this.i.postDelayed(this.k, 200L);
        }
    }

    public final void p(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3679f905", new Object[]{this, jSONObject});
            return;
        }
        try {
            Object obj = jSONObject.get("operate");
            if ((obj instanceof String) && TextUtils.equals((String) obj, "destroy")) {
                l();
            }
        } catch (Throwable th) {
            tgh.c("TTVesselWeexViewDecorator", "postOperate", th);
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("432a75df", new Object[]{this});
            return;
        }
        q84.m(this.f, this);
        VesselWeexView vesselWeexView = this.d;
        if (vesselWeexView != null) {
            vesselWeexView.setOnLoadListener(null);
        }
        FragmentManager fragmentManager = this.c;
        if (fragmentManager != null) {
            fragmentManager.removeOnBackStackChangedListener(this.j);
        }
    }

    public ViewGroup s(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("f90c7291", new Object[]{this, viewGroup});
        }
        this.e = viewGroup;
        return viewGroup;
    }

    public final void u(Context context, String str, String str2, String str3, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79e0ecff", new Object[]{this, context, str, str2, str3, map});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", str2);
        hashMap.put("errorMsg", str3);
        hashMap.put("url", str);
        bw7.b(hashMap, -800023, str3);
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        tgh.b("TTVesselWeexViewDecorator", "show");
        VesselWeexView vesselWeexView = this.d;
        if (vesselWeexView != null) {
            vesselWeexView.setVisibility(0);
        }
    }

    /* renamed from: q */
    public boolean y1(eo9 eo9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91d42891", new Object[]{this, eo9Var})).booleanValue();
        }
        tgh.b("TTVesselWeexViewDecorator", "receiveMessage channelId=" + eo9Var.a() + ", mParamUrl=" + this.g);
        if (!TTFloatViewWeexModule.generateChannelId(this.g).equals(eo9Var.a())) {
            return false;
        }
        p(eo9Var.b());
        return true;
    }
}
