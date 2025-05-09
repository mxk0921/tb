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
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.container.TriverFragment;
import com.alibaba.triver.kit.api.appmonitor.LaunchMonitorData;
import com.alibaba.triver.kit.api.utils.AppManagerUtils;
import com.alibaba.triver.triver_render.render.a;
import com.alibaba.triver.triver_shop.newShop.NativeShopActivity;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Result;
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
import tb.npp;
import tb.ogg;
import tb.pg1;
import tb.pks;
import tb.qks;
import tb.r54;
import tb.t2o;
import tb.ups;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class MiniAppShopContentRender extends BaseShopContentRender {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ups g;
    public final Context h;
    public final Fragment i;
    public final FrameLayout j;
    public final FrameLayout k;
    public Fragment l;
    public final ArrayList<Runnable> m = new ArrayList<>();
    public boolean n;
    public final View o;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class FragmentLifeCycleObserver implements LifecycleObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f3126a;
        public final /* synthetic */ MiniAppShopContentRender b;

        static {
            t2o.a(766509648);
        }

        public FragmentLifeCycleObserver(MiniAppShopContentRender miniAppShopContentRender) {
            ckf.g(miniAppShopContentRender, "this$0");
            this.b = miniAppShopContentRender;
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        public final void onStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            } else if (!this.f3126a) {
                this.f3126a = true;
                MiniAppShopContentRender.x(this.b);
                App L = this.b.L();
                JSONObject jSONObject = null;
                if (L != null) {
                    ShopDataParser o = MiniAppShopContentRender.D(this.b).o();
                    L.putStringValue(mop.KEY_ENABLE_NEW_START_AC_LOGIC, o == null ? null : Boolean.valueOf(o.a0()).toString());
                }
                App L2 = this.b.L();
                if (L2 != null) {
                    ShopDataParser o2 = MiniAppShopContentRender.D(this.b).o();
                    if (o2 != null) {
                        jSONObject = o2.J0();
                    }
                    L2.putJsonValue("shopFetchData", jSONObject);
                }
                MiniAppShopContentRender.F(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class a implements dqp.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(766509649);
            t2o.a(766510157);
        }

        public a(MiniAppShopContentRender miniAppShopContentRender) {
            ckf.g(miniAppShopContentRender, "this$0");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements com.alibaba.triver.triver_render.render.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef<jwk> f3132a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements jwk.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ a.a f3133a;

            public a(a.a aVar) {
                this.f3133a = aVar;
            }

            @Override // tb.jwk.a
            public boolean a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("8682cdb2", new Object[]{this})).booleanValue();
                }
                a.a aVar = this.f3133a;
                if (aVar == null) {
                    return false;
                }
                return aVar.a();
            }
        }

        public b(Ref$ObjectRef<jwk> ref$ObjectRef) {
            this.f3132a = ref$ObjectRef;
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("da2b03ee", new Object[]{this})).booleanValue();
            }
            jwk jwkVar = this.f3132a.element;
            if (jwkVar == null) {
                return false;
            }
            return jwkVar.a();
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9daca77a", new Object[]{this});
                return;
            }
            jwk jwkVar = this.f3132a.element;
            if (jwkVar != null) {
                jwkVar.b();
            }
        }

        public void c(a.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("afd802ae", new Object[]{this, aVar});
                return;
            }
            jwk jwkVar = this.f3132a.element;
            if (jwkVar != null) {
                jwkVar.c(new a(aVar));
            }
        }
    }

    static {
        t2o.a(766509643);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppShopContentRender(ups upsVar, Context context, Fragment fragment) {
        super(context, upsVar);
        ShopDataParser o;
        ckf.g(upsVar, "tabBarItemDataModel");
        ckf.g(context, "context");
        ckf.g(fragment, "outFragment");
        this.g = upsVar;
        this.h = context;
        this.i = fragment;
        a aVar = new a(this);
        this.j = new FrameLayout(context);
        Bundle bundle = null;
        View inflate = LayoutInflater.from(context).inflate(R.layout.view_fragment_continer, (ViewGroup) null);
        ckf.f(inflate, "from(context).inflate(R.layout.view_fragment_continer, null)");
        this.o = inflate;
        View findViewById = inflate.findViewById(R.id.view_inner_fragment_container);
        ckf.f(findViewById, "fragmentContainer.findViewById<FrameLayout>(R.id.view_inner_fragment_container)");
        this.k = (FrameLayout) findViewById;
        String n = upsVar.n();
        if (n != null) {
            String g = qks.g(qks.m(n));
            if (pks.v(n) && (o = upsVar.o()) != null) {
                Map b2 = pks.b(n);
                bundle = b2 != null ? r54.W(b2) : bundle;
                bundle = bundle == null ? new Bundle() : bundle;
                bundle.putString("ori_url", n);
                AppManagerUtils.setSessionId(g, bundle);
                dqp.a(upsVar.o(), o.T0(), b2, bundle, aVar, false);
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("navigationBarTextStyle", pg1.ATOM_EXT_black);
            bundle2.putBoolean("enableWebViewCompatInViewPager", true);
            bundle2.putInt("subPageContainerId", R.id.shop_view_auth_page_new);
            AppManagerUtils.setSessionId(g, bundle2);
            MiniAppShopContentRender$1$afterInitAction$1 miniAppShopContentRender$1$afterInitAction$1 = new MiniAppShopContentRender$1$afterInitAction$1(this, n, bundle2);
            aqp.a aVar2 = aqp.Companion;
            if (!aVar2.v0()) {
                return;
            }
            if (aVar2.h()) {
                r54.P("initTRiver", new MiniAppShopContentRender$1$2(this, miniAppShopContentRender$1$afterInitAction$1));
                return;
            }
            khu.j(context);
            miniAppShopContentRender$1$afterInitAction$1.invoke();
        }
    }

    public static final /* synthetic */ View A(MiniAppShopContentRender miniAppShopContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2dd8ce7", new Object[]{miniAppShopContentRender});
        }
        return miniAppShopContentRender.o;
    }

    public static final /* synthetic */ boolean B(MiniAppShopContentRender miniAppShopContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5b4b4fe", new Object[]{miniAppShopContentRender})).booleanValue();
        }
        return miniAppShopContentRender.n;
    }

    public static final /* synthetic */ FrameLayout C(MiniAppShopContentRender miniAppShopContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("7fd3372d", new Object[]{miniAppShopContentRender});
        }
        return miniAppShopContentRender.j;
    }

    public static final /* synthetic */ ups D(MiniAppShopContentRender miniAppShopContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ups) ipChange.ipc$dispatch("e1d41329", new Object[]{miniAppShopContentRender});
        }
        return miniAppShopContentRender.g;
    }

    public static final /* synthetic */ void E(MiniAppShopContentRender miniAppShopContentRender, String str, String str2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e59c7b6", new Object[]{miniAppShopContentRender, str, str2, map});
        } else {
            miniAppShopContentRender.M(str, str2, map);
        }
    }

    public static final /* synthetic */ void F(MiniAppShopContentRender miniAppShopContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bc3ff47", new Object[]{miniAppShopContentRender});
        } else {
            miniAppShopContentRender.N();
        }
    }

    public static final /* synthetic */ void G(MiniAppShopContentRender miniAppShopContentRender, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bf80d54", new Object[]{miniAppShopContentRender, fragment});
        } else {
            miniAppShopContentRender.l = fragment;
        }
    }

    public static /* synthetic */ Object ipc$super(MiniAppShopContentRender miniAppShopContentRender, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/MiniAppShopContentRender");
        }
    }

    public static final /* synthetic */ void v(MiniAppShopContentRender miniAppShopContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28e36249", new Object[]{miniAppShopContentRender});
        } else {
            miniAppShopContentRender.I();
        }
    }

    public static final /* synthetic */ void w(MiniAppShopContentRender miniAppShopContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4517dfc", new Object[]{miniAppShopContentRender});
        } else {
            miniAppShopContentRender.J();
        }
    }

    public static final /* synthetic */ void x(MiniAppShopContentRender miniAppShopContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6dbe54a", new Object[]{miniAppShopContentRender});
        } else {
            miniAppShopContentRender.K();
        }
    }

    public static final /* synthetic */ Context y(MiniAppShopContentRender miniAppShopContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("d5ae32fb", new Object[]{miniAppShopContentRender});
        }
        return miniAppShopContentRender.h;
    }

    public static final /* synthetic */ ArrayList z(MiniAppShopContentRender miniAppShopContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("61c4b7f1", new Object[]{miniAppShopContentRender});
        }
        return miniAppShopContentRender.m;
    }

    public final void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab4089e3", new Object[]{this});
            return;
        }
        this.i.getChildFragmentManager().beginTransaction().add(this.k.getId(), this.l).commitAllowingStateLoss();
        this.n = true;
    }

    public final void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("513bee52", new Object[]{this});
        } else if (r54.e(this.i)) {
            H();
        } else {
            r54.F(new MiniAppShopContentRender$addFragmentSafely$1(this));
        }
    }

    public final void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca357dc5", new Object[]{this});
            return;
        }
        TriverFragment triverFragment = this.l;
        if (triverFragment instanceof TriverFragment) {
            triverFragment.v2(new TriverFragment.d() { // from class: com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender$addShowErrorListener$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* compiled from: Taobao */
                /* renamed from: com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender$addShowErrorListener$1$1  reason: invalid class name */
                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
                public static final class AnonymousClass1 extends Lambda implements d1a<xhv> {
                    public static volatile transient /* synthetic */ IpChange $ipChange;
                    public final /* synthetic */ String $code;
                    public final /* synthetic */ Map<String, String> $extra;
                    public final /* synthetic */ String $msg;
                    public final /* synthetic */ MiniAppShopContentRender this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(MiniAppShopContentRender miniAppShopContentRender, String str, String str2, Map<String, String> map) {
                        super(0);
                        this.this$0 = miniAppShopContentRender;
                        this.$code = str;
                        this.$msg = str2;
                        this.$extra = map;
                    }

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/MiniAppShopContentRender$addShowErrorListener$1$1");
                    }

                    @Override // tb.d1a
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                        } else {
                            MiniAppShopContentRender.E(this.this$0, this.$code, this.$msg, this.$extra);
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
                    r54.C(new AnonymousClass1(MiniAppShopContentRender.this, str, str2, map));
                }
            });
        }
    }

    public final App L() {
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
                App L = L();
                if (!(L == null || (n = ogg.n(L)) == null)) {
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
                Result.m1108constructorimpl(kotlin.b.a(th));
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
            obj = Result.m1108constructorimpl(kotlin.b.a(th));
        }
        Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
        if (th2 != null) {
            npp.Companion.d(th2);
        }
        this.n = false;
    }

    @Override // tb.wpd
    public View getContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        kew.h(this.j);
        return this.j;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f8288af", new Object[]{this});
        } else {
            super.j();
        }
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
    /* JADX WARN: Type inference failed for: r2v17, types: [tb.jwk, T] */
    public final void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b9793", new Object[]{this});
            return;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Context context = this.h;
        if (context instanceof NativeShopActivity) {
            ref$ObjectRef.element = ((NativeShopActivity) context).O4(this.g.k());
        } else {
            ShopDataParser o = this.g.o();
            ref$ObjectRef.element = o == null ? 0 : o.C0(this.g.k());
        }
        ShopDataParser o2 = this.g.o();
        if (o2 != null && o2.N1()) {
            jwk jwkVar = (jwk) ref$ObjectRef.element;
            if (jwkVar != null) {
                jwkVar.d(true);
            }
        } else {
            jwk jwkVar2 = (jwk) ref$ObjectRef.element;
            if (jwkVar2 != null) {
                jwkVar2.d(ckf.b(this.g.k(), mop.KEY_SHOP_INDEX));
            }
        }
        App L = L();
        if (L != null) {
            L.setData(com.alibaba.triver.triver_render.render.a.class, new b(ref$ObjectRef));
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
                kew.a(this.j, shopWrapWebView);
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
