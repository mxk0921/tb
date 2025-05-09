package com.alibaba.triver.triver_shop.newShop.view.embed;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.shopLoft.EmbedSecondFloorView;
import com.alibaba.triver.triver_shop.container.shopLoft.ShopLiveOpenCardView;
import com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftViewManager;
import com.alibaba.triver.triver_shop.newShop.ClickView;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopDXEngine;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.a1v;
import tb.brf;
import tb.ckf;
import tb.d1a;
import tb.jpu;
import tb.kew;
import tb.khu;
import tb.npp;
import tb.r54;
import tb.t2o;
import tb.u1a;
import tb.vu3;
import tb.xhv;
import tb.xpd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class EmbedShopLoftComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FragmentActivity f3254a;
    public final ShopDataParser b;
    public final View c;
    public final EmbedSecondFloorView d;
    public String e;
    public final HashMap<String, String> f;
    public final TUrlImageView g;
    public final TUrlImageView h;
    public final TUrlImageView i;
    public final View j;
    public final FrameLayout k;
    public final ClickView l;
    public final FrameLayout m;
    public final FrameLayout n;
    public boolean o;
    public final boolean q;
    public boolean s;
    public boolean t;
    public JSONObject w;
    public final boolean x;
    public d1a<xhv> y;
    public Integer z;
    public boolean p = true;
    public boolean r = true;
    public int u = -1;
    public double v = -1.0d;

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.triver.triver_shop.newShop.view.embed.EmbedShopLoftComponent$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements u1a<String, JSONObject, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass1(EmbedShopLoftComponent embedShopLoftComponent) {
            super(2, embedShopLoftComponent, EmbedShopLoftComponent.class, "processEvent", "processEvent(Ljava/lang/String;Lcom/alibaba/fastjson/JSONObject;)V", 0);
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/embed/EmbedShopLoftComponent$1");
        }

        @Override // tb.u1a
        public /* bridge */ /* synthetic */ xhv invoke(String str, JSONObject jSONObject) {
            invoke2(str, jSONObject);
            return xhv.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe686b07", new Object[]{this, str, jSONObject});
            } else {
                EmbedShopLoftComponent.n((EmbedShopLoftComponent) this.receiver, str, jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class LifeCycle implements LifecycleObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ EmbedShopLoftComponent f3255a;

        static {
            t2o.a(766510071);
        }

        public LifeCycle(EmbedShopLoftComponent embedShopLoftComponent) {
            ckf.g(embedShopLoftComponent, "this$0");
            this.f3255a = embedShopLoftComponent;
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public final void onDestroyed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf354a81", new Object[]{this});
                return;
            }
            EmbedShopLoftComponent.c(this.f3255a).getLifecycle().removeObserver(this);
            EmbedShopLoftComponent embedShopLoftComponent = this.f3255a;
            try {
                embedShopLoftComponent.v().onWebViewPause();
                embedShopLoftComponent.v().onDetachedToWebView();
                embedShopLoftComponent.v().onDestroy();
                Result.m1108constructorimpl(xhv.INSTANCE);
            } catch (Throwable th) {
                Result.m1108constructorimpl(kotlin.b.a(th));
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        public final void onPaused() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c47335f4", new Object[]{this});
                return;
            }
            try {
                this.f3255a.v().onWebViewPause();
                Result.m1108constructorimpl(xhv.INSTANCE);
            } catch (Throwable th) {
                Result.m1108constructorimpl(kotlin.b.a(th));
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        public final void onResume() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
                return;
            }
            EmbedShopLoftComponent embedShopLoftComponent = this.f3255a;
            try {
                if (EmbedShopLoftComponent.d(embedShopLoftComponent)) {
                    EmbedShopLoftComponent.o(embedShopLoftComponent, false);
                    return;
                }
                EmbedShopLoftComponent.a(embedShopLoftComponent);
                if (!embedShopLoftComponent.w()) {
                    embedShopLoftComponent.v().onWebViewResume();
                    TUrlImageView m = EmbedShopLoftComponent.m(embedShopLoftComponent);
                    if (m != null) {
                        m.setImageUrl(EmbedShopLoftComponent.g(embedShopLoftComponent));
                    } else {
                        ckf.y("videoShopBigCardPlayButton");
                        throw null;
                    }
                }
                Result.m1108constructorimpl(xhv.INSTANCE);
            } catch (Throwable th) {
                Result.m1108constructorimpl(kotlin.b.a(th));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            if (EmbedShopLoftComponent.j(EmbedShopLoftComponent.this)) {
                EmbedShopLoftComponent.this.v().onWebViewPause();
                TUrlImageView m = EmbedShopLoftComponent.m(EmbedShopLoftComponent.this);
                if (m != null) {
                    m.setImageUrl(EmbedShopLoftComponent.h(EmbedShopLoftComponent.this));
                } else {
                    ckf.y("videoShopBigCardPlayButton");
                    throw null;
                }
            } else {
                EmbedShopLoftComponent.this.v().onWebViewResume();
                TUrlImageView m2 = EmbedShopLoftComponent.m(EmbedShopLoftComponent.this);
                if (m2 != null) {
                    m2.setImageUrl(EmbedShopLoftComponent.g(EmbedShopLoftComponent.this));
                } else {
                    ckf.y("videoShopBigCardPlayButton");
                    throw null;
                }
            }
            EmbedShopLoftComponent embedShopLoftComponent = EmbedShopLoftComponent.this;
            EmbedShopLoftComponent.q(embedShopLoftComponent, true ^ EmbedShopLoftComponent.j(embedShopLoftComponent));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface c extends xpd.a.AbstractC1101a {
        boolean b();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class d implements xpd.a.AbstractC1101a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final FrameLayout f3258a;

        static {
            t2o.a(766510069);
            t2o.a(766509128);
        }

        public d(EmbedShopLoftComponent embedShopLoftComponent, FrameLayout frameLayout) {
            ckf.g(embedShopLoftComponent, "this$0");
            ckf.g(frameLayout, "errorLayout");
            this.f3258a = frameLayout;
        }

        @Override // tb.xpd.a.AbstractC1101a
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cbc7dbde", new Object[]{this});
            }
        }

        public final FrameLayout e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FrameLayout) ipChange.ipc$dispatch("cb7f4a56", new Object[]{this});
            }
            return this.f3258a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class e implements xpd.a.AbstractC1101a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ShopDataParser f3259a;

        static {
            t2o.a(766510070);
            t2o.a(766509128);
        }

        public e(EmbedShopLoftComponent embedShopLoftComponent, ShopDataParser shopDataParser) {
            ckf.g(embedShopLoftComponent, "this$0");
            ckf.g(shopDataParser, "shopData");
            this.f3259a = shopDataParser;
        }

        @Override // tb.xpd.a.AbstractC1101a
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cbc7dbde", new Object[]{this});
            }
        }

        public final ShopDataParser e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ShopDataParser) ipChange.ipc$dispatch("16b01ba5", new Object[]{this});
            }
            return this.f3259a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class f implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                EmbedShopLoftComponent.b(EmbedShopLoftComponent.this);
            }
        }
    }

    static {
        t2o.a(766510063);
    }

    public static final /* synthetic */ void a(EmbedShopLoftComponent embedShopLoftComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f79c22cd", new Object[]{embedShopLoftComponent});
        } else {
            embedShopLoftComponent.s();
        }
    }

    public static final /* synthetic */ boolean b(EmbedShopLoftComponent embedShopLoftComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f25cba7b", new Object[]{embedShopLoftComponent})).booleanValue();
        }
        return embedShopLoftComponent.t();
    }

    public static final /* synthetic */ FragmentActivity c(EmbedShopLoftComponent embedShopLoftComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentActivity) ipChange.ipc$dispatch("1f5acda0", new Object[]{embedShopLoftComponent});
        }
        return embedShopLoftComponent.f3254a;
    }

    public static final /* synthetic */ boolean d(EmbedShopLoftComponent embedShopLoftComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff8cf391", new Object[]{embedShopLoftComponent})).booleanValue();
        }
        return embedShopLoftComponent.r;
    }

    public static final /* synthetic */ String e(EmbedShopLoftComponent embedShopLoftComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c157f30c", new Object[]{embedShopLoftComponent});
        }
        embedShopLoftComponent.getClass();
        return "https://img.alicdn.com/imgextra/i2/O1CN01MjPYDx1UZFJkTfcBp_!!6000000002531-2-tps-84-84.png";
    }

    public static final /* synthetic */ String f(EmbedShopLoftComponent embedShopLoftComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f446ff18", new Object[]{embedShopLoftComponent});
        }
        embedShopLoftComponent.getClass();
        return "https://img.alicdn.com/imgextra/i2/O1CN01zVTotk27Y7MByXQuJ_!!6000000007808-2-tps-84-84.png";
    }

    public static final /* synthetic */ String g(EmbedShopLoftComponent embedShopLoftComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b9bbb1d", new Object[]{embedShopLoftComponent});
        }
        embedShopLoftComponent.getClass();
        return "https://gw.alicdn.com/imgextra/i1/O1CN01E4EwcN1YAkSpyXsPj_!!6000000003019-2-tps-120-120.png";
    }

    public static final /* synthetic */ String h(EmbedShopLoftComponent embedShopLoftComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a494b767", new Object[]{embedShopLoftComponent});
        }
        embedShopLoftComponent.getClass();
        return "https://gw.alicdn.com/imgextra/i1/O1CN01lH9Tut1nGtxfZ004N_!!6000000005063-54-tps-72-72.apng";
    }

    public static final /* synthetic */ boolean i(EmbedShopLoftComponent embedShopLoftComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86abedd9", new Object[]{embedShopLoftComponent})).booleanValue();
        }
        return embedShopLoftComponent.o;
    }

    public static final /* synthetic */ boolean j(EmbedShopLoftComponent embedShopLoftComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d9f38f4", new Object[]{embedShopLoftComponent})).booleanValue();
        }
        return embedShopLoftComponent.p;
    }

    public static final /* synthetic */ ShopDataParser k(EmbedShopLoftComponent embedShopLoftComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDataParser) ipChange.ipc$dispatch("68790486", new Object[]{embedShopLoftComponent});
        }
        return embedShopLoftComponent.b;
    }

    public static final /* synthetic */ TUrlImageView l(EmbedShopLoftComponent embedShopLoftComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("893a3816", new Object[]{embedShopLoftComponent});
        }
        return embedShopLoftComponent.i;
    }

    public static final /* synthetic */ TUrlImageView m(EmbedShopLoftComponent embedShopLoftComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("886ebd5b", new Object[]{embedShopLoftComponent});
        }
        return embedShopLoftComponent.h;
    }

    public static final /* synthetic */ void n(EmbedShopLoftComponent embedShopLoftComponent, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e3bc021", new Object[]{embedShopLoftComponent, str, jSONObject});
        } else {
            embedShopLoftComponent.D(str, jSONObject);
        }
    }

    public static final /* synthetic */ void o(EmbedShopLoftComponent embedShopLoftComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d55d33f3", new Object[]{embedShopLoftComponent, new Boolean(z)});
        } else {
            embedShopLoftComponent.r = z;
        }
    }

    public static final /* synthetic */ void p(EmbedShopLoftComponent embedShopLoftComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb179213", new Object[]{embedShopLoftComponent, new Boolean(z)});
        } else {
            embedShopLoftComponent.o = z;
        }
    }

    public static final /* synthetic */ void q(EmbedShopLoftComponent embedShopLoftComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c28daa58", new Object[]{embedShopLoftComponent, new Boolean(z)});
        } else {
            embedShopLoftComponent.p = z;
        }
    }

    public static final /* synthetic */ void r(EmbedShopLoftComponent embedShopLoftComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24464536", new Object[]{embedShopLoftComponent, new Boolean(z)});
        } else {
            embedShopLoftComponent.M(z);
        }
    }

    public final boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17b0421b", new Object[]{this})).booleanValue();
        }
        return this.x;
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("354151f6", new Object[]{this});
            return;
        }
        String uri = ShopExtKt.v(this.b, this.e, this.w).toString();
        ckf.f(uri, "getSecondFloorJumpUrl(shopData, playerViewToken, liveTransParams).toString()");
        Object p2 = this.b.p2("live");
        JSONObject jSONObject = p2 instanceof JSONObject ? (JSONObject) p2 : null;
        if (jSONObject != null) {
            for (Map.Entry entry : jSONObject.entrySet()) {
                uri = uri + '&' + entry.getKey() + '=' + entry.getValue();
            }
        }
        khu.h(this.f3254a, uri);
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        this.d.onWebViewPause();
        this.t = true;
    }

    public final void D(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("512c8b4", new Object[]{this, str, jSONObject});
        } else if (ckf.b("message", str)) {
            if (!(jSONObject == null || (jSONObject4 = jSONObject.getJSONObject("params")) == null || (string = jSONObject4.getString("playerViewToken")) == null)) {
                K(string);
            }
            if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("params")) != null && (jSONObject3 = jSONObject2.getJSONObject("liveTransParams")) != null) {
                I(jSONObject3);
            }
        }
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        this.d.onWebViewResume();
        s();
        this.t = false;
    }

    public final void F(double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fa8ca66", new Object[]{this, new Double(d2)});
        } else {
            this.v = d2;
        }
    }

    public final void G(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ade7f01", new Object[]{this, new Integer(i)});
            return;
        }
        TUrlImageView tUrlImageView = this.g;
        if (tUrlImageView != null) {
            kew.U(tUrlImageView, i);
            FrameLayout frameLayout = this.m;
            if (frameLayout != null) {
                kew.U(frameLayout, i);
            } else {
                ckf.y("shopLoftContentLayout");
                throw null;
            }
        } else {
            ckf.y("videoShopBigCardPullDownImage");
            throw null;
        }
    }

    public final void H(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ac8f26c", new Object[]{this, new Integer(i)});
        } else {
            this.u = i;
        }
    }

    public final void I(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73b93249", new Object[]{this, jSONObject});
        } else {
            this.w = jSONObject;
        }
    }

    public final void J(d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba485e95", new Object[]{this, d1aVar});
        } else {
            this.y = d1aVar;
        }
    }

    public final void K(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ba1fb82", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public final void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e380e0f", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.i;
        if (tUrlImageView != null) {
            kew.g0(tUrlImageView);
        } else {
            ckf.y("videoShopBigCardMuteButton");
            throw null;
        }
    }

    public final void M(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3580e549", new Object[]{this, new Boolean(z)});
        } else if (this.x) {
            this.b.Q0().c(z);
        } else {
            this.b.Q0().d(z);
        }
    }

    public final void N(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f6c616", new Object[]{this, new Integer(i)});
        } else {
            this.z = Integer.valueOf(i);
        }
    }

    public final void O(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e160672", new Object[]{this, new Boolean(z)});
            return;
        }
        this.o = z;
        M(z);
        if (!z) {
            TUrlImageView tUrlImageView = this.i;
            if (tUrlImageView != null) {
                tUrlImageView.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01zVTotk27Y7MByXQuJ_!!6000000007808-2-tps-84-84.png");
            } else {
                ckf.y("videoShopBigCardMuteButton");
                throw null;
            }
        } else {
            TUrlImageView tUrlImageView2 = this.i;
            if (tUrlImageView2 != null) {
                tUrlImageView2.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01MjPYDx1UZFJkTfcBp_!!6000000002531-2-tps-84-84.png");
            } else {
                ckf.y("videoShopBigCardMuteButton");
                throw null;
            }
        }
        this.d.l(z);
    }

    public final boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73ba639c", new Object[]{this})).booleanValue();
        }
        return this.o;
    }

    public final EmbedSecondFloorView v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EmbedSecondFloorView) ipChange.ipc$dispatch("68248b4e", new Object[]{this});
        }
        return this.d;
    }

    public final boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7886a22b", new Object[]{this})).booleanValue();
        }
        return this.t;
    }

    public final View x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.c;
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39eb3394", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.i;
        if (tUrlImageView != null) {
            kew.C(tUrlImageView);
        } else {
            ckf.y("videoShopBigCardMuteButton");
            throw null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            if (EmbedShopLoftComponent.i(EmbedShopLoftComponent.this)) {
                EmbedShopLoftComponent.this.v().l(false);
                TUrlImageView l = EmbedShopLoftComponent.l(EmbedShopLoftComponent.this);
                if (l != null) {
                    l.setImageUrl(EmbedShopLoftComponent.f(EmbedShopLoftComponent.this));
                } else {
                    ckf.y("videoShopBigCardMuteButton");
                    throw null;
                }
            } else {
                EmbedShopLoftComponent.this.v().l(true);
                TUrlImageView l2 = EmbedShopLoftComponent.l(EmbedShopLoftComponent.this);
                if (l2 != null) {
                    l2.setImageUrl(EmbedShopLoftComponent.e(EmbedShopLoftComponent.this));
                } else {
                    ckf.y("videoShopBigCardMuteButton");
                    throw null;
                }
            }
            EmbedShopLoftComponent embedShopLoftComponent = EmbedShopLoftComponent.this;
            EmbedShopLoftComponent.p(embedShopLoftComponent, true ^ EmbedShopLoftComponent.i(embedShopLoftComponent));
            EmbedShopLoftComponent embedShopLoftComponent2 = EmbedShopLoftComponent.this;
            EmbedShopLoftComponent.r(embedShopLoftComponent2, EmbedShopLoftComponent.i(embedShopLoftComponent2));
            ShopExtKt.e0(EmbedShopLoftComponent.i(EmbedShopLoftComponent.this));
        }
    }

    public EmbedShopLoftComponent(FragmentActivity fragmentActivity, ShopDataParser shopDataParser, ShopDXEngine shopDXEngine) {
        String str;
        String json;
        boolean z = false;
        ckf.g(fragmentActivity, "context");
        ckf.g(shopDataParser, "shopData");
        ckf.g(shopDXEngine, "shopDXEngine");
        this.f3254a = fragmentActivity;
        this.b = shopDataParser;
        LifeCycle lifeCycle = new LifeCycle(this);
        View K = kew.K(fragmentActivity, R.layout.view_video_shop_big_card);
        ckf.d(K);
        this.c = K;
        boolean z2 = true;
        this.o = true;
        if (shopDataParser.Q2()) {
            this.q = true;
        }
        npp.Companion.g("firstFollowGlobalMute", Boolean.valueOf(this.q));
        JSONObject c1 = shopDataParser.c1();
        String N0 = shopDataParser.N0();
        String str2 = "";
        N0 = N0 == null ? str2 : N0;
        if (shopDataParser.H1()) {
            JSONObject d2 = shopDataParser.O0().d();
            if (d2 == null || (str = brf.d(d2, "sceneId")) == null) {
                str = str2;
            }
        } else {
            str = brf.d(c1, "sceneId");
        }
        Pair a2 = jpu.a("sellerId", N0);
        Pair a3 = jpu.a("contentId", brf.d(c1, "id"));
        Pair a4 = jpu.a("contentType", str);
        if (shopDataParser.H1() || shopDataParser.w1()) {
            if (!shopDataParser.a3()) {
                JSONObject d3 = shopDataParser.O0().d();
                str2 = "{}";
                if (!(d3 == null || (json = d3.toString()) == null)) {
                    str2 = json;
                }
            } else if (c1 != null) {
                str2 = c1.toJSONString();
            }
        } else if (c1 != null) {
            str2 = c1.toJSONString();
        }
        this.f = kotlin.collections.a.i(a2, a3, a4, jpu.a("contentData", str2));
        this.x = (ckf.b(ShopLoftViewManager.getTypeFromSceneId(str), ShopLoftViewManager.TYPE_LIVE) || shopDataParser.O0().q()) ? true : z;
        ShopExtKt.v0();
        EmbedSecondFloorView embedSecondFloorView = new EmbedSecondFloorView();
        this.d = embedSecondFloorView;
        embedSecondFloorView.x(shopDataParser);
        if (shopDataParser.w1()) {
            embedSecondFloorView.r(true);
        }
        embedSecondFloorView.w(fragmentActivity);
        embedSecondFloorView.onCreate(new HashMap());
        embedSecondFloorView.s(new AnonymousClass1(this));
        fragmentActivity.getLifecycle().addObserver(lifeCycle);
        View findViewById = K.findViewById(R.id.view_video_shop_big_card_loft_content_container);
        ckf.f(findViewById, "rootLayout.findViewById(R.id.view_video_shop_big_card_loft_content_container)");
        this.m = (FrameLayout) findViewById;
        View findViewById2 = K.findViewById(R.id.view_video_shop_big_card_error_container);
        ckf.f(findViewById2, "rootLayout.findViewById(R.id.view_video_shop_big_card_error_container)");
        this.n = (FrameLayout) findViewById2;
        View findViewById3 = K.findViewById(R.id.view_video_shop_big_card_play_button);
        ckf.f(findViewById3, "rootLayout.findViewById(R.id.view_video_shop_big_card_play_button)");
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById3;
        this.h = tUrlImageView;
        View findViewById4 = K.findViewById(R.id.view_video_shop_big_card_mute_button);
        ckf.f(findViewById4, "rootLayout.findViewById(R.id.view_video_shop_big_card_mute_button)");
        TUrlImageView tUrlImageView2 = (TUrlImageView) findViewById4;
        this.i = tUrlImageView2;
        View findViewById5 = K.findViewById(R.id.view_video_shop_big_card_content);
        ckf.f(findViewById5, "rootLayout.findViewById(R.id.view_video_shop_big_card_content)");
        this.k = (FrameLayout) findViewById5;
        View findViewById6 = K.findViewById(R.id.view_video_shop_big_card_click_area);
        ckf.f(findViewById6, "rootLayout.findViewById(R.id.view_video_shop_big_card_click_area)");
        this.l = (ClickView) findViewById6;
        View findViewById7 = K.findViewById(R.id.view_video_shop_big_card_pull_down_text_layout);
        ckf.f(findViewById7, "rootLayout.findViewById(R.id.view_video_shop_big_card_pull_down_text_layout)");
        this.j = findViewById7;
        View findViewById8 = K.findViewById(R.id.view_video_shop_big_card_pull_down_img);
        ckf.f(findViewById8, "rootLayout.findViewById(R.id.view_video_shop_big_card_pull_down_img)");
        TUrlImageView tUrlImageView3 = (TUrlImageView) findViewById8;
        this.g = tUrlImageView3;
        View findViewById9 = K.findViewById(R.id.view_bigCard_container_default_bottom_black_shadow);
        if (findViewById9 != null && shopDataParser.b2()) {
            kew.B(findViewById9);
        }
        tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01E4EwcN1YAkSpyXsPj_!!6000000003019-2-tps-120-120.png");
        tUrlImageView.setOnClickListener(new a());
        if (r54.x(fragmentActivity)) {
            kew.B(tUrlImageView);
        }
        if (this.q && shopDataParser.P0().c()) {
            z2 = shopDataParser.Q0().a();
        }
        this.o = z2;
        tUrlImageView2.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01MjPYDx1UZFJkTfcBp_!!6000000002531-2-tps-84-84.png");
        if (!this.o) {
            tUrlImageView2.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01zVTotk27Y7MByXQuJ_!!6000000007808-2-tps-84-84.png");
        }
        tUrlImageView2.setOnClickListener(new b());
        embedSecondFloorView.l(this.o);
        kew.C(findViewById7);
        kew.C(tUrlImageView3);
    }

    public final void s() {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b323719a", new Object[]{this});
            return;
        }
        if (this.b.P0().c()) {
            if (this.x) {
                z = this.b.Q0().a();
            } else {
                z = this.b.Q0().b();
            }
        }
        this.o = z;
        if (!z) {
            TUrlImageView tUrlImageView = this.i;
            if (tUrlImageView != null) {
                tUrlImageView.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01zVTotk27Y7MByXQuJ_!!6000000007808-2-tps-84-84.png");
            } else {
                ckf.y("videoShopBigCardMuteButton");
                throw null;
            }
        } else {
            TUrlImageView tUrlImageView2 = this.i;
            if (tUrlImageView2 != null) {
                tUrlImageView2.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01MjPYDx1UZFJkTfcBp_!!6000000002531-2-tps-84-84.png");
            } else {
                ckf.y("videoShopBigCardMuteButton");
                throw null;
            }
        }
        this.d.l(this.o);
    }

    public final void z() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (!this.s) {
            this.s = true;
            int i2 = this.u;
            if (i2 == -1) {
                npp.Companion.b("innerPaddingBottom = -1");
            } else {
                this.f.put("paddingBottom", String.valueOf(i2));
            }
            double d2 = this.v;
            if (d2 > vu3.b.GEO_NOT_SUPPORT) {
                this.f.put("aspectRatio", String.valueOf(d2));
            }
            if (this.b.d0() != 0) {
                this.d.t(false);
            }
            this.d.f().c(e.class.getName(), new e(this, this.b));
            xpd.a f2 = this.d.f();
            String name = d.class.getName();
            FrameLayout frameLayout = this.n;
            if (frameLayout != null) {
                f2.c(name, new d(this, frameLayout));
                npp.a aVar = npp.Companion;
                aVar.b(ckf.p("aspectRatio = ", Double.valueOf(this.v)));
                View view = this.d.getView(-1, -1, "", "", this.f);
                if (view != null) {
                    FrameLayout frameLayout2 = this.k;
                    if (frameLayout2 != null) {
                        kew.a(frameLayout2, view);
                    } else {
                        ckf.y("contentView");
                        throw null;
                    }
                }
                this.d.onAttachedToWebView();
                this.d.onWebViewResume();
                aVar.g("ShopLoftMute", Boolean.valueOf(this.o));
                this.d.l(this.o);
                if (this.d.i()) {
                    TUrlImageView tUrlImageView = this.i;
                    if (tUrlImageView != null) {
                        ViewGroup.LayoutParams layoutParams = tUrlImageView.getLayoutParams();
                        if (layoutParams != null && (layoutParams instanceof ConstraintLayout.LayoutParams)) {
                            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                            layoutParams2.topToTop = -1;
                            Integer num = this.z;
                            if (num == null) {
                                i = kew.P(90) + this.b.O0().l().a();
                            } else {
                                i = num.intValue();
                            }
                            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = i;
                            TUrlImageView tUrlImageView2 = this.i;
                            if (tUrlImageView2 != null) {
                                tUrlImageView2.setLayoutParams(layoutParams);
                            } else {
                                ckf.y("videoShopBigCardMuteButton");
                                throw null;
                            }
                        }
                        if (this.b.G1() && !this.b.b2()) {
                            TUrlImageView tUrlImageView3 = new TUrlImageView(this.f3254a);
                            tUrlImageView3.setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01QPEYM81GLanLU4ceH_!!6000000000606-54-tps-164-380.apng");
                            tUrlImageView3.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            tUrlImageView3.setSkipAutoSize(true);
                            ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(kew.P(50), kew.P(188));
                            TUrlImageView tUrlImageView4 = this.i;
                            if (tUrlImageView4 != null) {
                                layoutParams3.bottomToTop = tUrlImageView4.getId();
                                layoutParams3.endToEnd = 0;
                                ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin = kew.p(16);
                                ((ViewGroup) this.c).addView(tUrlImageView3, layoutParams3);
                            } else {
                                ckf.y("videoShopBigCardMuteButton");
                                throw null;
                            }
                        }
                    } else {
                        ckf.y("videoShopBigCardMuteButton");
                        throw null;
                    }
                }
                if (this.d.g() instanceof ShopLiveOpenCardView) {
                    TUrlImageView tUrlImageView5 = this.i;
                    if (tUrlImageView5 != null) {
                        kew.U(tUrlImageView5, kew.p(280));
                        this.d.v(new EmbedShopLoftComponent$init$4(this));
                    } else {
                        ckf.y("videoShopBigCardMuteButton");
                        throw null;
                    }
                } else {
                    ClickView clickView = this.l;
                    if (clickView != null) {
                        clickView.setOnClickListener(new f());
                    } else {
                        ckf.y("clickArea");
                        throw null;
                    }
                }
                if (!this.d.j() && !this.d.k()) {
                    TUrlImageView tUrlImageView6 = this.i;
                    if (tUrlImageView6 != null) {
                        kew.C(tUrlImageView6);
                        TUrlImageView tUrlImageView7 = this.h;
                        if (tUrlImageView7 != null) {
                            kew.C(tUrlImageView7);
                        } else {
                            ckf.y("videoShopBigCardPlayButton");
                            throw null;
                        }
                    } else {
                        ckf.y("videoShopBigCardMuteButton");
                        throw null;
                    }
                }
                if (this.b.H1() || this.b.w1()) {
                    ShopDataParser shopDataParser = this.b;
                    a1v.d(shopDataParser, "Page_Shop_New_livecard", kotlin.collections.a.k(jpu.a("feed_id", shopDataParser.O0().f()), jpu.a("identityCode", this.b.s0())));
                }
                if (this.b.b2()) {
                    TUrlImageView tUrlImageView8 = this.i;
                    if (tUrlImageView8 != null) {
                        kew.U(tUrlImageView8, kew.v(102));
                    } else {
                        ckf.y("videoShopBigCardMuteButton");
                        throw null;
                    }
                }
            } else {
                ckf.y("shopLoftErrorLayout");
                throw null;
            }
        }
    }

    public final boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("176d45c8", new Object[]{this})).booleanValue();
        }
        if (this.t) {
            return true;
        }
        if (this.b.w1()) {
            ShopDataParser shopDataParser = this.b;
            a1v.c(shopDataParser, "Page_Shop_New_livecard", kotlin.collections.a.k(jpu.a("feed_id", shopDataParser.O0().f()), jpu.a("identityCode", this.b.s0())), null, 8, null);
        } else {
            ShopDataParser shopDataParser2 = this.b;
            Pair a2 = jpu.a("identityCode", shopDataParser2.s0());
            JSONObject c1 = this.b.c1();
            a1v.c(shopDataParser2, "Page_Shop_newstructure_livecard_click", kotlin.collections.a.k(a2, jpu.a("sceneId", c1 == null ? null : c1.getString("sceneId"))), null, 8, null);
        }
        xpd.a.AbstractC1101a a3 = this.d.f().a(c.class.getName());
        if (a3 != null && (a3 instanceof c) && ((c) a3).b()) {
            return true;
        }
        if ((this.b.H1() || this.d.i()) && this.b.O0().q()) {
            d1a<xhv> d1aVar = this.y;
            if (d1aVar != null) {
                d1aVar.invoke();
            }
            return true;
        } else if (this.y == null || !this.b.a3() || !this.b.Y1()) {
            B();
            return false;
        } else {
            d1a<xhv> d1aVar2 = this.y;
            if (d1aVar2 != null) {
                d1aVar2.invoke();
            }
            return true;
        }
    }
}
