package com.taobao.android.purchase;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.buy.toggle.AliBuyPerfSwitcher;
import com.taobao.android.purchase.aura.annotation.TBBuyPageMode;
import com.taobao.android.purchase.aura.notification.TBBuyBroadcastReceiver;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment;
import com.taobao.taobao.R;
import com.taobao.uikit.animation.api.PlaceHolderProvider;
import java.util.Map;
import tb.a8r;
import tb.al;
import tb.bbb;
import tb.ck;
import tb.ef1;
import tb.f8r;
import tb.guk;
import tb.hh;
import tb.jud;
import tb.lbj;
import tb.lud;
import tb.mud;
import tb.nud;
import tb.o9r;
import tb.q8r;
import tb.q9r;
import tb.rbb;
import tb.t2o;
import tb.y8r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBBuyMainFragment extends SupportSecondaryBaseFragment implements mud, jud, lud, bbb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public FragmentActivity f9215a;
    public TBBuyBroadcastReceiver c;
    public nud d;
    public OnScreenChangedListener e;
    public long f;
    public q9r g;
    public final boolean h = y8r.f("enableSurfaceViewAnima", true);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends q9r {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(TBBuyMainFragment tBBuyMainFragment, Activity activity) {
            super(activity);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/TBBuyMainFragment$1");
        }

        @Override // tb.q9r
        public ViewGroup j(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("1c098b1e", new Object[]{this, activity});
            }
            return (ViewGroup) activity.findViewById(R.id.purchase_surface_skeleton);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements PlaceHolderProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.uikit.animation.api.PlaceHolderProvider
        public Bitmap onPreloadPlaceHolder() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("77c9e2ee", new Object[]{this});
            }
            return TBBuyMainFragment.p2(TBBuyMainFragment.this).i();
        }

        @Override // com.taobao.uikit.animation.api.PlaceHolderProvider
        public Bitmap onProvidePlaceHolder() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("da338756", new Object[]{this});
            }
            return TBBuyMainFragment.p2(TBBuyMainFragment.this).i();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements OnScreenChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
            guk.a(this, activity, i, configuration);
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public void onScreenChanged(int i, Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
            } else {
                TBBuyMainFragment.r2(TBBuyMainFragment.this).Y2(false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f9218a;

        public d(TBBuyMainFragment tBBuyMainFragment, Activity activity) {
            this.f9218a = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                hh.d(this.f9218a);
            }
        }
    }

    static {
        t2o.a(708837421);
        t2o.a(708837431);
        t2o.a(708837428);
        t2o.a(708837430);
        t2o.a(81788949);
    }

    public static /* synthetic */ Object ipc$super(TBBuyMainFragment tBBuyMainFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
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
            case 1088398452:
                return super.onCreateAnimation(((Number) objArr[0]).intValue(), ((Boolean) objArr[1]).booleanValue(), ((Number) objArr[2]).intValue());
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1860817453:
                super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/TBBuyMainFragment");
        }
    }

    public static /* synthetic */ q9r p2(TBBuyMainFragment tBBuyMainFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q9r) ipChange.ipc$dispatch("f2bd9a43", new Object[]{tBBuyMainFragment});
        }
        return tBBuyMainFragment.g;
    }

    public static /* synthetic */ nud r2(TBBuyMainFragment tBBuyMainFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nud) ipChange.ipc$dispatch("77b79cf0", new Object[]{tBBuyMainFragment});
        }
        return tBBuyMainFragment.d;
    }

    @Override // tb.bbb
    public Intent A0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("dd388005", new Object[]{this});
        }
        Object obj = getArguments().get("originActivityIntent");
        if (obj instanceof Intent) {
            return (Intent) obj;
        }
        return null;
    }

    @Override // tb.mud
    public String I2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18a6fdb1", new Object[]{this});
        }
        return TBBuyPageMode.fullPageMode;
    }

    @Override // tb.lud
    public void Y2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee313163", new Object[]{this, new Boolean(z)});
            return;
        }
        nud nudVar = this.d;
        if (nudVar != null) {
            ((o9r) nudVar).Y2(z);
        }
    }

    @Override // tb.bbb
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        } else if (!al.n("purchase", "onBack")) {
            finish();
        }
    }

    @Override // tb.jud
    public void g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe7b3616", new Object[]{this, jSONObject});
            return;
        }
        nud nudVar = this.d;
        if (nudVar != null) {
            ((o9r) nudVar).g(jSONObject);
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

    @Override // com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment
    public PlaceHolderProvider getPlaceHolderProvider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PlaceHolderProvider) ipChange.ipc$dispatch("d8f17d0c", new Object[]{this});
        }
        return new b();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment
    public boolean isFragmentAsyncAnimNeeded(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88d0725d", new Object[]{this, context})).booleanValue();
        }
        return this.h;
    }

    @Override // tb.mud
    public Map<String, String> l1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8e8b1035", new Object[]{this});
        }
        return f8r.b(this.f9215a.getIntent());
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "TBBuyMainFragment";
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        nud nudVar = this.d;
        if (nudVar != null) {
            ((o9r) nudVar).N1(this.f9215a, i, i2, intent);
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment
    public boolean onBackPressedSupport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6048655e", new Object[]{this})).booleanValue();
        }
        return al.n("purchase", "onBack");
    }

    @Override // com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment, com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        hh.f20632a = false;
        this.f9215a = getActivity();
        this.f = System.currentTimeMillis();
        AliBuyPerfSwitcher.updatePerfSwitch("enableFragmentPerf", true);
        this.d = o9r.c();
        if (this.h) {
            this.g = new a(this, this.f9215a);
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("40dfa474", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
        }
        if (this.h) {
            return super.onCreateAnimation(i, z, i2);
        }
        if (z) {
            return null;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 1.0f, 2, 0.0f, 2, 0.0f);
        translateAnimation.setDuration(300L);
        return translateAnimation;
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        if (AliBuyPerfSwitcher.enablePreloadView()) {
            view = ef1.i(this.f9215a, R.layout.activity_purchase_v2);
        } else {
            view = layoutInflater.inflate(R.layout.activity_purchase_v2, viewGroup, false);
        }
        if (this.h) {
            view.findViewById(R.id.purchase_skeleton).setVisibility(8);
        }
        return view;
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        nud nudVar = this.d;
        if (nudVar != null) {
            ((o9r) nudVar).F(this.f9215a);
        }
        TBBuyBroadcastReceiver tBBuyBroadcastReceiver = this.c;
        if (tBBuyBroadcastReceiver != null) {
            tBBuyBroadcastReceiver.d();
        }
        q9r q9rVar = this.g;
        if (q9rVar != null) {
            q9rVar.h();
        }
        if (this.e != null) {
            TBAutoSizeConfig.x().h0(this.e);
        }
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment, com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        nud nudVar = this.d;
        if (nudVar != null) {
            ((o9r) nudVar).V(this.f9215a);
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment, com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        nud nudVar = this.d;
        if (nudVar != null) {
            ((o9r) nudVar).t2(this.f9215a);
        }
        q8r.b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        Intent h = hh.h(this.f9215a);
        if (h != null) {
            h.putExtra("NEW_BUY_ON_CREATE_TIME", this.f);
        } else {
            q8r.a("EMPTY_INTENT_FORM_(onViewCreated)", "intent is empty");
        }
        nud nudVar = this.d;
        if (nudVar != null) {
            FragmentActivity fragmentActivity = this.f9215a;
            ((o9r) nudVar).c1(fragmentActivity, (ViewGroup) fragmentActivity.findViewById(R.id.purchase_container));
        }
        v2();
        z2();
    }

    @Override // tb.lud
    public void q2(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76d933d", new Object[]{this, str, jSONObject});
            return;
        }
        nud nudVar = this.d;
        if (nudVar != null) {
            ((o9r) nudVar).q2(str, jSONObject);
        }
    }

    public final void s2(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c61fc383", new Object[]{this, activity});
            return;
        }
        View findViewById = activity.findViewById(R.id.btn_back);
        if (findViewById == null) {
            ck.g().f("找不到id为R.id.btn_back的View", ck.b.b().l("TBBuyMainFragment").a());
        } else {
            ViewProxy.setOnClickListener(findViewById, new d(this, activity));
        }
    }

    public final void u2(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe40713c", new Object[]{this, fragmentActivity});
            return;
        }
        this.e = new c();
        TBAutoSizeConfig.x().d0(this.e);
    }

    public final void v2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7facea9c", new Object[]{this});
            return;
        }
        TBBuyBroadcastReceiver tBBuyBroadcastReceiver = new TBBuyBroadcastReceiver(this.f9215a, TBBuyPageMode.fullPageMode);
        this.c = tBBuyBroadcastReceiver;
        tBBuyBroadcastReceiver.a();
        if (a8r.b(this.f9215a)) {
            ck.g().d("当前进入大屏模式");
            u2(this.f9215a);
        }
        s2(this.f9215a);
        nud nudVar = this.d;
        if (nudVar != null) {
            ((o9r) nudVar).P0(this.f9215a);
        }
        nud nudVar2 = this.d;
        if (nudVar2 != null) {
            ((o9r) nudVar2).m2();
            ((o9r) this.d).lazyInit();
        }
        q9r q9rVar = this.g;
        if (q9rVar != null) {
            q9rVar.m();
        }
    }

    public final void z2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6150b4d", new Object[]{this});
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            boolean o = Localization.o();
            rbb g = ck.g();
            g.d("Localization.isI18nEdition() = " + o);
            if (o) {
                lbj.a((TextView) activity.findViewById(R.id.title), (ImageView) activity.findViewById(R.id.btn_back));
                lbj.b(this.f9215a);
                ck.g().d("当前环境进入多语言，执行下单页Title改动和黑名单操作");
                return;
            }
            return;
        }
        ck.g().e("TBBuyMainFragment设置多语言UI没拿到Activity");
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        return i == 4 && al.n("purchase", "onBack");
    }
}
