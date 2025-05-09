package com.taobao.android.purchase.aura.render.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lightbuy.performance.LightBuyStage;
import com.taobao.android.purchase.aura.annotation.TBBuyPageMode;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.aar;
import tb.ck;
import tb.g8r;
import tb.hog;
import tb.iog;
import tb.jud;
import tb.kud;
import tb.lql;
import tb.lud;
import tb.o9r;
import tb.p9r;
import tb.q8r;
import tb.q9r;
import tb.rl;
import tb.svd;
import tb.t2o;
import tb.u7r;
import tb.x9r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBBuyHalfScreenFragment extends Fragment implements jud, lud, kud {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f9224a;
    public final o9r c = o9r.c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends q9r {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ LinearLayout d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TBBuyHalfScreenFragment tBBuyHalfScreenFragment, Activity activity, LinearLayout linearLayout) {
            super(activity);
            this.d = linearLayout;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/aura/render/fragment/TBBuyHalfScreenFragment$1");
        }

        @Override // tb.q9r
        public ViewGroup j(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("1c098b1e", new Object[]{this, activity});
            }
            return this.d;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                u7r.b().a(TBBuyHalfScreenFragment.this.getActivity());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements svd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f9226a;

        public c(FragmentActivity fragmentActivity) {
            this.f9226a = fragmentActivity;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df18fa93", new Object[]{this});
            }
        }

        public void b(String str, List<rl> list, Map<String, String> map) {
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc47af4d", new Object[]{this, str, list, map});
                return;
            }
            hog.c().f(LightBuyStage.MTOP_REQ_END);
            p9r.a(this.f9226a, list);
            HashMap hashMap = new HashMap();
            hashMap.put("bundleUrl", str);
            if (TBBuyHalfScreenFragment.p2(TBBuyHalfScreenFragment.this)) {
                str2 = "fullScreen";
            } else {
                str2 = null;
            }
            hashMap.put("containerType", str2);
            g8r.b(this.f9226a, hashMap, new iog(this.f9226a));
            q8r.d("Light-Buy", lql.d(this.f9226a.getIntent()));
        }
    }

    static {
        t2o.a(708837538);
        t2o.a(708837428);
        t2o.a(708837430);
        t2o.a(708837429);
    }

    public static /* synthetic */ Object ipc$super(TBBuyHalfScreenFragment tBBuyHalfScreenFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1860817453:
                super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/aura/render/fragment/TBBuyHalfScreenFragment");
        }
    }

    public static /* synthetic */ boolean p2(TBBuyHalfScreenFragment tBBuyHalfScreenFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1759821a", new Object[]{tBBuyHalfScreenFragment})).booleanValue();
        }
        return tBBuyHalfScreenFragment.f9224a;
    }

    @Override // tb.lud
    public void Y2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee313163", new Object[]{this, new Boolean(z)});
        } else {
            this.c.Y2(z);
        }
    }

    @Override // tb.jud
    public void g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe7b3616", new Object[]{this, jSONObject});
        } else {
            this.c.g(jSONObject);
        }
    }

    @Override // tb.lud
    public String g1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1507e0c4", new Object[]{this});
        }
        return "native";
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        this.c.N1(getActivity(), i, i2, intent);
    }

    @Override // tb.kud
    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        getActivity().finish();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        View inflate = layoutInflater.inflate(R.layout.fragment_purchase_v2_halfscreen, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.purchase_skeleton);
        boolean equals = TBBuyPageMode.fullPageMode.equals(this.c.d());
        this.f9224a = equals;
        if (equals) {
            ((ViewGroup) inflate.findViewById(R.id.purchase_statusBar)).setVisibility(0);
        }
        new a(this, getActivity(), linearLayout).m();
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        aar.a(aar.f);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        this.c.V(getActivity());
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.c.t2(getActivity());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        x9r.e(getActivity(), new HashMap<String, String>() { // from class: com.taobao.android.purchase.aura.render.fragment.TBBuyHalfScreenFragment.2
            {
                put("renderContainer", "native");
            }
        });
        ck.g().f("TBBuyHalfScreenFragment onViewCreated", ck.b.b().l("TBBuyHalfScreenFragment").g("info", "TBBuyHalfScreenFragment onViewCreated").a());
        this.c.c1(getActivity(), (ViewGroup) view.findViewById(R.id.purchase_container));
        if (p9r.b(getActivity())) {
            this.c.m2();
        } else {
            r2(getActivity(), this.c);
        }
        this.c.lazyInit();
        View findViewById = view.findViewById(R.id.tbbuy_halfscreen_header_close);
        ViewProxy.setOnClickListener(findViewById, new b());
        if (this.f9224a) {
            findViewById.setVisibility(8);
        }
    }

    @Override // tb.lud
    public void q2(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76d933d", new Object[]{this, str, jSONObject});
        } else {
            this.c.q2(str, jSONObject);
        }
    }

    public final void r2(FragmentActivity fragmentActivity, o9r o9rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef1fd08b", new Object[]{this, fragmentActivity, o9rVar});
        } else {
            o9rVar.i(new c(fragmentActivity));
        }
    }
}
