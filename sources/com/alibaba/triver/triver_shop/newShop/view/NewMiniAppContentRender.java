package com.alibaba.triver.triver_shop.newShop.view;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.integration.RVMain;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.container.TriverFragment;
import com.alibaba.triver.kit.api.appmonitor.LaunchMonitorData;
import com.alibaba.triver.kit.api.utils.AppManagerUtils;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.view.NewMiniAppContentRender;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Result;
import kotlin.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.aqp;
import tb.brf;
import tb.ckf;
import tb.d1a;
import tb.dqp;
import tb.jpu;
import tb.jwk;
import tb.kew;
import tb.khu;
import tb.mop;
import tb.njg;
import tb.npp;
import tb.ogg;
import tb.pg1;
import tb.pks;
import tb.qks;
import tb.r54;
import tb.t2o;
import tb.tgu;
import tb.u0k;
import tb.ups;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class NewMiniAppContentRender extends BaseShopContentRender {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ups g;
    public final Context h;
    public final Fragment i;
    public FrameLayout k;
    public Fragment l;
    public boolean n;
    public boolean o;
    public View q;
    public final njg j = kotlin.a.b(new NewMiniAppContentRender$rootLayout$2(this));
    public final ArrayList<Runnable> m = new ArrayList<>();
    public final a p = new a(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class FragmentLifeCycleObserver implements LifecycleObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f3134a;
        public final /* synthetic */ NewMiniAppContentRender b;

        static {
            t2o.a(766509664);
        }

        public FragmentLifeCycleObserver(NewMiniAppContentRender newMiniAppContentRender) {
            ckf.g(newMiniAppContentRender, "this$0");
            this.b = newMiniAppContentRender;
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        public final void onStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            } else if (!this.f3134a) {
                this.f3134a = true;
                NewMiniAppContentRender.x(this.b);
                App K = this.b.K();
                JSONObject jSONObject = null;
                if (K != null) {
                    ShopDataParser o = NewMiniAppContentRender.B(this.b).o();
                    K.putStringValue(mop.KEY_ENABLE_NEW_START_AC_LOGIC, o == null ? null : Boolean.valueOf(o.a0()).toString());
                }
                App K2 = this.b.K();
                if (K2 != null) {
                    ShopDataParser o2 = NewMiniAppContentRender.B(this.b).o();
                    if (o2 != null) {
                        jSONObject = o2.J0();
                    }
                    K2.putJsonValue("shopFetchData", jSONObject);
                }
                NewMiniAppContentRender.D(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class a implements dqp.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(766509665);
            t2o.a(766510157);
        }

        public a(NewMiniAppContentRender newMiniAppContentRender) {
            ckf.g(newMiniAppContentRender, "this$0");
        }
    }

    static {
        t2o.a(766509663);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewMiniAppContentRender(ups upsVar, Context context, Fragment fragment) {
        super(context, upsVar);
        ckf.g(upsVar, "tabBarItemDataModel");
        ckf.g(context, "context");
        ckf.g(fragment, "outFragment");
        this.g = upsVar;
        this.h = context;
        this.i = fragment;
        npp.Companion.b("use new mini app content render");
    }

    public static final /* synthetic */ boolean A(NewMiniAppContentRender newMiniAppContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbe93e06", new Object[]{newMiniAppContentRender})).booleanValue();
        }
        return newMiniAppContentRender.n;
    }

    public static final /* synthetic */ ups B(NewMiniAppContentRender newMiniAppContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ups) ipChange.ipc$dispatch("13ad4921", new Object[]{newMiniAppContentRender});
        }
        return newMiniAppContentRender.g;
    }

    public static final /* synthetic */ void C(NewMiniAppContentRender newMiniAppContentRender, String str, String str2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebce57d0", new Object[]{newMiniAppContentRender, str, str2, map});
        } else {
            newMiniAppContentRender.M(str, str2, map);
        }
    }

    public static final /* synthetic */ void D(NewMiniAppContentRender newMiniAppContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22d0f615", new Object[]{newMiniAppContentRender});
        } else {
            newMiniAppContentRender.N();
        }
    }

    public static final /* synthetic */ void E(NewMiniAppContentRender newMiniAppContentRender, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41305b58", new Object[]{newMiniAppContentRender, fragment});
        } else {
            newMiniAppContentRender.l = fragment;
        }
    }

    public static /* synthetic */ Object ipc$super(NewMiniAppContentRender newMiniAppContentRender, String str, Object... objArr) {
        switch (str.hashCode()) {
            case 797441118:
                super.onPause();
                return null;
            case 877680342:
                super.k();
                return null;
            case 1065519279:
                super.j();
                return null;
            case 1890078406:
                super.destroyView();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/NewMiniAppContentRender");
        }
    }

    public static final /* synthetic */ void v(NewMiniAppContentRender newMiniAppContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce982ad3", new Object[]{newMiniAppContentRender});
        } else {
            newMiniAppContentRender.G();
        }
    }

    public static final /* synthetic */ void w(NewMiniAppContentRender newMiniAppContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edee4cc0", new Object[]{newMiniAppContentRender});
        } else {
            newMiniAppContentRender.H();
        }
    }

    public static final /* synthetic */ void x(NewMiniAppContentRender newMiniAppContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbf2c3b2", new Object[]{newMiniAppContentRender});
        } else {
            newMiniAppContentRender.I();
        }
    }

    public static final /* synthetic */ Context y(NewMiniAppContentRender newMiniAppContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("28d804d1", new Object[]{newMiniAppContentRender});
        }
        return newMiniAppContentRender.h;
    }

    public static final /* synthetic */ ArrayList z(NewMiniAppContentRender newMiniAppContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("9b88b51f", new Object[]{newMiniAppContentRender});
        }
        return newMiniAppContentRender.m;
    }

    public final void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab4089e3", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.k;
        if (frameLayout != null) {
            this.i.getChildFragmentManager().beginTransaction().add(frameLayout.getId(), this.l).commitAllowingStateLoss();
            this.n = true;
        }
    }

    public final void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("513bee52", new Object[]{this});
        } else if (r54.e(this.i)) {
            F();
        } else {
            r54.F(new NewMiniAppContentRender$addFragmentSafely$1(this));
        }
    }

    public final void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca357dc5", new Object[]{this});
            return;
        }
        TriverFragment triverFragment = this.l;
        if (triverFragment instanceof TriverFragment) {
            triverFragment.v2(new TriverFragment.d() { // from class: com.alibaba.triver.triver_shop.newShop.view.NewMiniAppContentRender$addShowErrorListener$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* compiled from: Taobao */
                /* renamed from: com.alibaba.triver.triver_shop.newShop.view.NewMiniAppContentRender$addShowErrorListener$1$1  reason: invalid class name */
                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
                public static final class AnonymousClass1 extends Lambda implements d1a<xhv> {
                    public static volatile transient /* synthetic */ IpChange $ipChange;
                    public final /* synthetic */ String $code;
                    public final /* synthetic */ Map<String, String> $extra;
                    public final /* synthetic */ String $msg;
                    public final /* synthetic */ NewMiniAppContentRender this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(NewMiniAppContentRender newMiniAppContentRender, String str, String str2, Map<String, String> map) {
                        super(0);
                        this.this$0 = newMiniAppContentRender;
                        this.$code = str;
                        this.$msg = str2;
                        this.$extra = map;
                    }

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/NewMiniAppContentRender$addShowErrorListener$1$1");
                    }

                    @Override // tb.d1a
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                        } else {
                            NewMiniAppContentRender.C(this.this$0, this.$code, this.$msg, this.$extra);
                        }
                    }
                }

                public final void a(String str, String str2, Map<String, String> map) {
                    String str3;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("818010f3", new Object[]{this, str, str2, map});
                        return;
                    }
                    npp.a aVar = npp.Companion;
                    StringBuilder sb = new StringBuilder("NativeShop render Error onMiniAppError : code = ");
                    sb.append((Object) str);
                    sb.append(", msg = ");
                    sb.append((Object) str2);
                    sb.append(", extra = ");
                    if (map == null) {
                        str3 = null;
                    } else {
                        str3 = r54.X(map);
                    }
                    sb.append((Object) str3);
                    aVar.b(sb.toString());
                    r54.C(new AnonymousClass1(NewMiniAppContentRender.this, str, str2, map));
                }
            });
        }
    }

    public final App K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (App) ipChange.ipc$dispatch("896ff571", new Object[]{this});
        }
        TriverFragment triverFragment = this.l;
        if (triverFragment instanceof TriverFragment) {
            return triverFragment.u2();
        }
        return null;
    }

    public final FrameLayout L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("30af2510", new Object[]{this});
        }
        return (FrameLayout) this.j.getValue();
    }

    public final void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba39c1d0", new Object[]{this});
            return;
        }
        Iterator<Runnable> it = this.m.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.m.clear();
    }

    public final void O() {
        xhv xhvVar;
        LaunchMonitorData n;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c06aa2", new Object[]{this});
            return;
        }
        ShopDataParser o = this.g.o();
        if (o != null) {
            String k = this.g.k();
            try {
                App K = K();
                if (!(K == null || (n = ogg.n(K)) == null)) {
                    Map data = n.getData();
                    ckf.f(data, "launchMonitorData.data");
                    for (Map.Entry entry : data.entrySet()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append((Object) k);
                        sb.append('_');
                        sb.append(entry.getKey());
                        o.Y2(sb.toString(), entry.getValue());
                        if (ckf.b(entry.getKey(), "uc_t2_time")) {
                            s(entry.getValue());
                        }
                    }
                    JSONObject performanceMarks = n.getPerformanceMarks();
                    ckf.f(performanceMarks, "launchMonitorData.performanceMarks");
                    for (Map.Entry<String, Object> entry2 : performanceMarks.entrySet()) {
                        o.Y2("js_" + ((Object) k) + '_' + ((Object) entry2.getKey()), entry2.getValue());
                    }
                }
                Uri parse = Uri.parse(this.g.n());
                String queryParameter = parse.getQueryParameter("_ariver_appid");
                if (queryParameter != null) {
                    o.Y2(ckf.p(this.g.k(), "_appId"), queryParameter);
                }
                String queryParameter2 = parse.getQueryParameter("templateId");
                if (queryParameter2 == null) {
                    xhvVar = null;
                } else {
                    o.Y2(ckf.p(this.g.k(), "_templateId"), queryParameter2);
                    xhvVar = xhv.INSTANCE;
                }
                Result.m1108constructorimpl(xhvVar);
            } catch (Throwable th) {
                Result.m1108constructorimpl(b.a(th));
            }
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void destroyView() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a84ec6", new Object[]{this});
            return;
        }
        super.destroyView();
        try {
            Fragment fragment = this.l;
            if (fragment != null) {
                this.i.getChildFragmentManager().beginTransaction().remove(fragment).commitAllowingStateLoss();
            }
            this.l = null;
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(b.a(th));
        }
        Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
        if (th2 != null) {
            npp.Companion.d(th2);
        }
        this.o = false;
        this.n = false;
    }

    @Override // tb.wpd
    public View getContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        kew.h(L());
        return L();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f8288af", new Object[]{this});
            return;
        }
        super.j();
        J();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("345056d6", new Object[]{this});
            return;
        }
        super.k();
        O();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender
    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbd89bae", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        O();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b9793", new Object[]{this});
            return;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ShopDataParser o = this.g.o();
        ref$ObjectRef.element = o == null ? 0 : o.C0(this.g.k());
        ShopDataParser o2 = this.g.o();
        if (o2 != null && o2.N1()) {
            jwk jwkVar = (jwk) ref$ObjectRef.element;
            if (jwkVar != null) {
                jwkVar.d(true);
            }
        } else {
            ShopDataParser o3 = this.g.o();
            if (o3 != null && o3.H1()) {
                jwk jwkVar2 = (jwk) ref$ObjectRef.element;
                if (jwkVar2 != null) {
                    jwkVar2.d(true);
                }
            } else {
                jwk jwkVar3 = (jwk) ref$ObjectRef.element;
                if (jwkVar3 != null) {
                    jwkVar3.d(ckf.b(this.g.k(), mop.KEY_SHOP_INDEX));
                }
            }
        }
        App K = K();
        if (K != null) {
            K.setData(com.alibaba.triver.triver_render.render.a.class, new u0k(ref$ObjectRef));
        }
    }

    public final void J() {
        ShopDataParser o;
        ShopDataParser o2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49350b35", new Object[]{this});
        } else if (!this.o) {
            this.o = true;
            Bundle bundle = null;
            View inflate = LayoutInflater.from(this.h).inflate(R.layout.view_fragment_continer, (ViewGroup) null);
            this.q = inflate;
            this.k = inflate == null ? null : (FrameLayout) inflate.findViewById(R.id.view_inner_fragment_container);
            String n = this.g.n();
            if (n != null) {
                String g = qks.g(qks.m(n));
                if (pks.v(n) && (o2 = this.g.o()) != null) {
                    Map b = pks.b(n);
                    if (b != null) {
                        bundle = r54.W(b);
                    }
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    bundle.putString("ori_url", n);
                    AppManagerUtils.setSessionId(g, bundle);
                    dqp.a(this.g.o(), o2.T0(), b, bundle, this.p, false);
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("navigationBarTextStyle", pg1.ATOM_EXT_black);
                bundle2.putBoolean("enableWebViewCompatInViewPager", true);
                bundle2.putString("disableBrandZoneTitleBar", "true");
                bundle2.putInt("subPageContainerId", R.id.shop_view_auth_page_new);
                if (this.g.B() && (o = this.g.o()) != null && o.i2()) {
                    bundle2.putInt("backgroundColor", -16777216);
                }
                AppManagerUtils.setSessionId(g, bundle2);
                if (aqp.Companion.v0()) {
                    khu.j(this.h);
                }
                View view = this.q;
                if (view != null) {
                    kew.a(L(), view);
                }
                tgu.d(this.h, Uri.parse(n), bundle2, 0, new RVMain.f() { // from class: com.alibaba.triver.triver_shop.newShop.view.NewMiniAppContentRender$createMiniApp$3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* compiled from: Taobao */
                    /* renamed from: com.alibaba.triver.triver_shop.newShop.view.NewMiniAppContentRender$createMiniApp$3$1  reason: invalid class name */
                    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
                    public static final class AnonymousClass1 extends Lambda implements d1a<xhv> {
                        public static volatile transient /* synthetic */ IpChange $ipChange;
                        public final /* synthetic */ Runnable $action;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(Runnable runnable) {
                            super(0);
                            this.$action = runnable;
                        }

                        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                            str.hashCode();
                            int hashCode = str.hashCode();
                            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/NewMiniAppContentRender$createMiniApp$3$1");
                        }

                        @Override // tb.d1a
                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                            } else {
                                this.$action.run();
                            }
                        }
                    }

                    /* compiled from: Taobao */
                    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
                    public static final class a implements Runnable {
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        /* renamed from: a  reason: collision with root package name */
                        public final /* synthetic */ NewMiniAppContentRender f3141a;
                        public final /* synthetic */ Fragment b;

                        public a(NewMiniAppContentRender newMiniAppContentRender, Fragment fragment) {
                            this.f3141a = newMiniAppContentRender;
                            this.b = fragment;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            Lifecycle lifecycle;
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            NewMiniAppContentRender.E(this.f3141a, this.b);
                            Fragment fragment = this.b;
                            if (!(fragment == null || (lifecycle = fragment.getLifecycle()) == null)) {
                                lifecycle.addObserver(new NewMiniAppContentRender.FragmentLifeCycleObserver(this.f3141a));
                            }
                            NewMiniAppContentRender.w(this.f3141a);
                            NewMiniAppContentRender.v(this.f3141a);
                        }
                    }

                    public final void a(Fragment fragment) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7a37f72a", new Object[]{this, fragment});
                            return;
                        }
                        a aVar = new a(NewMiniAppContentRender.this, fragment);
                        if (aqp.Companion.B0()) {
                            r54.H(new AnonymousClass1(aVar));
                        } else {
                            aVar.run();
                        }
                    }
                });
            }
        }
    }

    public final void M(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba095a0d", new Object[]{this, str, str2, map});
            return;
        }
        String g = this.g.g();
        if (g != null) {
            if (aqp.Companion.f0()) {
                ShopWrapWebView shopWrapWebView = new ShopWrapWebView(this.h);
                shopWrapWebView.setEnableCompatInViewPager(true);
                shopWrapWebView.render(g);
                kew.a(L(), shopWrapWebView);
            }
            npp.a aVar = npp.Companion;
            aVar.b(((Object) this.g.k()) + "_onMiniAppErrorDowngradeToH5 , url = " + g);
        }
        ShopDataParser o = this.g.o();
        if (o != null) {
            o.Y2(ckf.p(this.g.k(), "_onMiniAppErrorDowngradeToH5"), Long.valueOf(System.currentTimeMillis()));
        }
        ShopDataParser o2 = this.g.o();
        if (o2 != null) {
            o2.Y2(ckf.p(this.g.k(), "_onMiniAppErrorInfo"), brf.a(jpu.a("code", str), jpu.a("msg", str2), jpu.a("extra", map == null ? null : r54.X(map))));
        }
    }
}
