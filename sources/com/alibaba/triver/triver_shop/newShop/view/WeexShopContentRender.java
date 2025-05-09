package com.alibaba.triver.triver_shop.newShop.view;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import tb.a07;
import tb.ckf;
import tb.fop;
import tb.g1a;
import tb.grp;
import tb.kew;
import tb.njg;
import tb.npp;
import tb.quw;
import tb.t2o;
import tb.ups;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class WeexShopContentRender extends BaseShopContentRender {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final grp<WeexShopContentRender> k = new grp<>(3);
    public final ups g;
    public final Context h;
    public WXSDKInstance i;
    public final njg j = kotlin.a.b(new WeexShopContentRender$rootContainer$2(this));

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(766509783);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements WXSDKManager.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.weex.WXSDKManager.a
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4e0fc68", new Object[]{this, str, str2});
                return;
            }
            npp.a aVar = npp.Companion;
            aVar.b("weex init failed : " + ((Object) str) + ", " + ((Object) str2));
            kew.a(WeexShopContentRender.w(WeexShopContentRender.this), ShopExtKt.u(WeexShopContentRender.v(WeexShopContentRender.this)));
        }

        @Override // com.taobao.weex.WXSDKManager.a
        public void onInitSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb2dd3fb", new Object[]{this});
            }
        }
    }

    static {
        t2o.a(766509782);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeexShopContentRender(ups upsVar, Context context) {
        super(context, upsVar);
        ckf.g(upsVar, "tabBarItemDataModel");
        ckf.g(context, "context");
        this.g = upsVar;
        this.h = context;
    }

    public static /* synthetic */ Object ipc$super(WeexShopContentRender weexShopContentRender, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/WeexShopContentRender");
        }
    }

    public static final /* synthetic */ Context v(WeexShopContentRender weexShopContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("7b074b5e", new Object[]{weexShopContentRender});
        }
        return weexShopContentRender.h;
    }

    public static final /* synthetic */ FrameLayout w(WeexShopContentRender weexShopContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("846a43b7", new Object[]{weexShopContentRender});
        }
        return weexShopContentRender.x();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void destroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a84ec6", new Object[]{this});
            return;
        }
        super.destroyView();
        x().removeAllViews();
        WXSDKInstance wXSDKInstance = this.i;
        if (wXSDKInstance != null) {
            wXSDKInstance.destroy();
        }
        this.i = null;
        k.j(this);
    }

    @Override // tb.wpd
    public View getContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        kew.h(x());
        kew.Y(x());
        return x();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void j() {
        ShopDataParser.ShopViewContext m1;
        g1a<Boolean, xhv> i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f8288af", new Object[]{this});
            return;
        }
        super.j();
        ShopDataParser o = this.g.o();
        if (!(o == null || (m1 = o.m1()) == null || (i = m1.i()) == null)) {
            i.invoke(Boolean.FALSE);
        }
        if (this.i == null) {
            t();
            WXSDKInstance b2 = fop.b(this.h, this.g.n(), null, this.g.k(), 4, null);
            this.i = b2;
            ckf.d(b2);
            b2.i1(new b());
            FrameLayout x = x();
            WXSDKInstance wXSDKInstance = this.i;
            ckf.d(wXSDKInstance);
            View containerView = wXSDKInstance.getContainerView();
            ckf.f(containerView, "instance!!.containerView");
            kew.a(x, containerView);
        }
        k.a(this);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void k() {
        ShopDataParser.ShopViewContext m1;
        g1a<Boolean, xhv> i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("345056d6", new Object[]{this});
            return;
        }
        super.k();
        ShopDataParser o = this.g.o();
        if (o != null && (m1 = o.m1()) != null && (i = m1.i()) != null) {
            i.invoke(Boolean.TRUE);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender
    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbd89bae", new Object[]{this})).booleanValue();
        }
        if (!this.g.v() && this.i != null) {
            return true;
        }
        return false;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void onPause() {
        Object obj;
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        WXSDKInstance wXSDKInstance = this.i;
        if (wXSDKInstance != null) {
            wXSDKInstance.onActivityPause();
        }
        WXSDKInstance wXSDKInstance2 = this.i;
        if (wXSDKInstance2 != null) {
            try {
                if (((ConcurrentHashMap) wXSDKInstance2.E().d).containsKey(quw.KEY_PAGE_STAGES_INTERACTION_TM) && (l = (Long) ((ConcurrentHashMap) wXSDKInstance2.E().d).get(quw.KEY_PAGE_STAGES_INTERACTION_TM)) != null) {
                    s(Long.valueOf(l.longValue()));
                }
                obj = Result.m1108constructorimpl(xhv.INSTANCE);
            } catch (Throwable th) {
                obj = Result.m1108constructorimpl(kotlin.b.a(th));
            }
            Result.m1107boximpl(obj);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void onResume() {
        WXSDKInstance wXSDKInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (this.g.y(this.h) && (wXSDKInstance = this.i) != null) {
            wXSDKInstance.onActivityResume();
        }
    }

    public final FrameLayout x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("69e8e0c9", new Object[]{this});
        }
        return (FrameLayout) this.j.getValue();
    }
}
