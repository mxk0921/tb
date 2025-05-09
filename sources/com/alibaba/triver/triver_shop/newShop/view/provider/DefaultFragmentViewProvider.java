package com.alibaba.triver.triver_shop.newShop.view.provider;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.alibaba.triver.triver_shop.newShop.data.NativeShopRenderContainerType;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.view.AllItemsContentRender;
import com.alibaba.triver.triver_shop.newShop.view.H5ShopContentRender;
import com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender;
import com.alibaba.triver.triver_shop.newShop.view.NewMiniAppContentRender;
import com.alibaba.triver.triver_shop.newShop.view.SubscribeViewContentRender;
import com.alibaba.triver.triver_shop.newShop.view.Tab3LiveContentRender;
import com.alibaba.triver.triver_shop.newShop.view.WeexShopContentRender;
import com.alibaba.triver.triver_shop.newShop.view.WeexV2WidgetGroupContentRender;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Result;
import kotlin.b;
import tb.c8c;
import tb.ckf;
import tb.i9x;
import tb.khu;
import tb.npp;
import tb.t2o;
import tb.ups;
import tb.wpd;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DefaultFragmentViewProvider implements c8c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ups f3270a;
    public wpd b;
    public boolean c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(766510113);
            int[] iArr = new int[NativeShopRenderContainerType.values().length];
            iArr[NativeShopRenderContainerType.TYPE_LIVE.ordinal()] = 1;
            iArr[NativeShopRenderContainerType.TYPE_ALL_ITEMS.ordinal()] = 2;
            iArr[NativeShopRenderContainerType.TYPE_WEEX_V2.ordinal()] = 3;
            iArr[NativeShopRenderContainerType.TYPE_WEEX.ordinal()] = 4;
            iArr[NativeShopRenderContainerType.TYPE_H5.ordinal()] = 5;
            iArr[NativeShopRenderContainerType.TYPE_SUBSCRIBE.ordinal()] = 6;
            iArr[NativeShopRenderContainerType.TYPE_MINI_APP.ordinal()] = 7;
            iArr[NativeShopRenderContainerType.TYPE_WIDGET.ordinal()] = 8;
            iArr[NativeShopRenderContainerType.TYPE_WEEX_V2_WIDGET.ordinal()] = 9;
            iArr[NativeShopRenderContainerType.TYPE_UNKNOWN.ordinal()] = 10;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        t2o.a(766510112);
        t2o.a(766510108);
    }

    public DefaultFragmentViewProvider(ups upsVar) {
        this.f3270a = upsVar;
    }

    public static final /* synthetic */ wpd f(DefaultFragmentViewProvider defaultFragmentViewProvider, ups upsVar, Context context, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wpd) ipChange.ipc$dispatch("2b7aa21e", new Object[]{defaultFragmentViewProvider, upsVar, context, fragment});
        }
        return defaultFragmentViewProvider.h(upsVar, context, fragment);
    }

    public static final /* synthetic */ ups g(DefaultFragmentViewProvider defaultFragmentViewProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ups) ipChange.ipc$dispatch("ad9bf7af", new Object[]{defaultFragmentViewProvider});
        }
        return defaultFragmentViewProvider.f3270a;
    }

    @Override // tb.c8c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccb1a91f", new Object[]{this});
            return;
        }
        c8c.a.e(this);
        wpd wpdVar = this.b;
        if (wpdVar != null) {
            wpdVar.k();
        }
        this.c = false;
    }

    @Override // tb.c8c
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c0f96ed4", new Object[]{this})).intValue();
        }
        return c8c.a.a(this);
    }

    @Override // tb.c8c
    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f15f3f8", new Object[]{this, new Integer(i)});
        } else {
            c8c.a.f(this, i);
        }
    }

    @Override // tb.c8c
    public void e() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22cc24e6", new Object[]{this});
            return;
        }
        c8c.a.d(this);
        wpd wpdVar = this.b;
        if (wpdVar != null) {
            wpdVar.j();
        }
        if (this.b == null) {
            z = true;
        }
        this.c = z;
    }

    public final wpd h(ups upsVar, Context context, Fragment fragment) {
        ShopDataParser o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wpd) ipChange.ipc$dispatch("3f45a7b", new Object[]{this, upsVar, context, fragment});
        }
        ShopDataParser o2 = upsVar.o();
        if ((o2 != null && o2.G1()) || ((o = upsVar.o()) != null && o.H1())) {
            return new NewMiniAppContentRender(upsVar, context, fragment);
        }
        return new MiniAppShopContentRender(upsVar, context, fragment);
    }

    public final wpd i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wpd) ipChange.ipc$dispatch("354168c2", new Object[]{this});
        }
        return this.b;
    }

    public final void j(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c682d848", new Object[]{this, new Float(f)});
            return;
        }
        wpd i = i();
        if (i != null) {
            i.h(f);
        }
    }

    @Override // tb.c8c
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            return;
        }
        wpd wpdVar = this.b;
        if (wpdVar != null) {
            wpdVar.destroyView();
        }
        this.b = null;
    }

    @Override // tb.c8c
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        c8c.a.b(this);
        wpd wpdVar = this.b;
        if (wpdVar != null) {
            wpdVar.onPause();
        }
    }

    @Override // tb.c8c
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        c8c.a.c(this);
        wpd wpdVar = this.b;
        if (wpdVar != null) {
            wpdVar.onResume();
        }
    }

    @Override // tb.c8c
    public View b(Context context, Fragment fragment) {
        Object obj;
        ShopDataParser.d I0;
        ShopDataParser o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("dab1df30", new Object[]{this, context, fragment});
        }
        ckf.g(fragment, "outerFragment");
        if (context == null) {
            return null;
        }
        ups upsVar = this.f3270a;
        if (upsVar == null) {
            return new FrameLayout(context);
        }
        NativeShopRenderContainerType f = upsVar.f();
        if (ckf.b(this.f3270a.k(), "dongtai")) {
            f = NativeShopRenderContainerType.TYPE_SUBSCRIBE;
        }
        switch (a.$EnumSwitchMapping$0[f.ordinal()]) {
            case 1:
                this.b = new Tab3LiveContentRender(context, this.f3270a, false, false, 12, null);
                break;
            case 2:
                ShopDataParser o2 = this.f3270a.o();
                AllItemsContentRender a2 = (o2 == null || (I0 = o2.I0()) == null) ? null : I0.a();
                if (a2 != null) {
                    ShopDataParser o3 = this.f3270a.o();
                    ShopDataParser.d I02 = o3 == null ? null : o3.I0();
                    if (I02 != null) {
                        I02.b(null);
                    }
                }
                if (a2 == null) {
                    a2 = new AllItemsContentRender(context, this.f3270a);
                }
                this.b = a2;
                break;
            case 3:
                this.b = new i9x(context, this.f3270a);
                break;
            case 4:
                this.b = new WeexShopContentRender(this.f3270a, context);
                break;
            case 5:
                ups upsVar2 = this.f3270a;
                this.b = new H5ShopContentRender(upsVar2, upsVar2.n(), context, false, 8, null);
                break;
            case 6:
                try {
                    this.b = new SubscribeViewContentRender(this.f3270a, context);
                    obj = Result.m1108constructorimpl(xhv.INSTANCE);
                } catch (Throwable th) {
                    obj = Result.m1108constructorimpl(b.a(th));
                }
                Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
                if (th2 == null) {
                    th2 = null;
                } else {
                    npp.Companion.c("catching block has error", th2);
                }
                if (th2 != null) {
                    npp.Companion.b("create subscribe content view failed");
                    break;
                }
                break;
            case 7:
                if (!this.f3270a.A()) {
                    if (khu.g()) {
                        this.b = h(this.f3270a, context, fragment);
                        break;
                    } else {
                        ups upsVar3 = this.f3270a;
                        this.b = new H5ShopContentRender(upsVar3, upsVar3.g(), context, true);
                        npp.Companion.b("mini app sdk not init ,downgrade to h5");
                        if (this.f3270a.B() && (o = this.f3270a.o()) != null) {
                            o.Y2("shopIndexDowngradeByRemoteTRiver", Boolean.TRUE);
                            break;
                        }
                    }
                } else {
                    this.b = new RemoteClassDelegateContentRender(context, this.f3270a, new DefaultFragmentViewProvider$getFragmentView$3(this, context, fragment), new DefaultFragmentViewProvider$getFragmentView$4(this, context));
                    break;
                }
                break;
            case 8:
                this.b = new RemoteClassDelegateContentRender(context, this.f3270a, new DefaultFragmentViewProvider$getFragmentView$5(context, this), new DefaultFragmentViewProvider$getFragmentView$6(this, context));
                break;
            case 9:
                this.b = new WeexV2WidgetGroupContentRender(context, this.f3270a);
                break;
        }
        if (this.c) {
            e();
        }
        wpd wpdVar = this.b;
        if (wpdVar == null) {
            return null;
        }
        return wpdVar.getContentView();
    }
}
