package com.alibaba.triver.triver_shop.newShop.view;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import tb.ckf;
import tb.jwk;
import tb.k9x;
import tb.kew;
import tb.l9x;
import tb.m9x;
import tb.npp;
import tb.t2o;
import tb.ups;
import tb.yes;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class WeexV2WidgetGroupContentRender extends BaseShopContentRender {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Context g;
    public final ups h;
    public final WeexV2WidgetGroupContentRender$rootView$1 i;
    public yes j;
    public WeexInstance k;
    public boolean l;

    static {
        t2o.a(766509788);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.alibaba.triver.triver_shop.newShop.view.WeexV2WidgetGroupContentRender$rootView$1] */
    public WeexV2WidgetGroupContentRender(final Context context, ups upsVar) {
        super(context, upsVar);
        ckf.g(context, "context");
        ckf.g(upsVar, "tabBarItemDataModel");
        this.g = context;
        this.h = upsVar;
        this.i = new FrameLayout(context) { // from class: com.alibaba.triver.triver_shop.newShop.view.WeexV2WidgetGroupContentRender$rootView$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(WeexV2WidgetGroupContentRender$rootView$1 weexV2WidgetGroupContentRender$rootView$1, String str, Object... objArr) {
                if (str.hashCode() == 2075560917) {
                    return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/WeexV2WidgetGroupContentRender$rootView$1");
            }

            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
                }
                if (kew.G(motionEvent) || kew.D(motionEvent)) {
                    WeexV2WidgetGroupContentRender.w(WeexV2WidgetGroupContentRender.this, false);
                }
                return super.dispatchTouchEvent(motionEvent);
            }
        };
    }

    public static /* synthetic */ Object ipc$super(WeexV2WidgetGroupContentRender weexV2WidgetGroupContentRender, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.onResume();
            return null;
        } else if (hashCode == 1065519279) {
            super.j();
            return null;
        } else if (hashCode == 1890078406) {
            super.destroyView();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/triver/triver_shop/newShop/view/WeexV2WidgetGroupContentRender");
        }
    }

    public static final /* synthetic */ boolean v(WeexV2WidgetGroupContentRender weexV2WidgetGroupContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45f12bc4", new Object[]{weexV2WidgetGroupContentRender})).booleanValue();
        }
        return weexV2WidgetGroupContentRender.l;
    }

    public static final /* synthetic */ void w(WeexV2WidgetGroupContentRender weexV2WidgetGroupContentRender, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35376a88", new Object[]{weexV2WidgetGroupContentRender, new Boolean(z)});
        } else {
            weexV2WidgetGroupContentRender.l = z;
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void destroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a84ec6", new Object[]{this});
            return;
        }
        super.destroyView();
        yes yesVar = this.j;
        if (yesVar != null) {
            yesVar.e();
        }
    }

    @Override // tb.wpd
    public View getContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        kew.h(this.i);
        kew.Y(this.i);
        return this.i;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f8288af", new Object[]{this});
            return;
        }
        super.j();
        if (this.j == null) {
            x();
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        yes yesVar = this.j;
        if (yesVar != null) {
            yesVar.j();
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        yes yesVar = this.j;
        if (yesVar != null) {
            yesVar.k();
        }
    }

    public final void x() {
        jwk C0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ab121b8", new Object[]{this});
            return;
        }
        String n = this.h.n();
        if (n == null) {
            npp.Companion.b("WeexV2WidgetGroupContentRender bundle url is null");
            return;
        }
        ShopDataParser o = this.h.o();
        if (!(o == null || (C0 = o.C0(this.h.k())) == null)) {
            C0.c(new k9x(this));
        }
        yes yesVar = new yes((Activity) this.g, n, new l9x());
        this.j = yesVar;
        this.k = yesVar.i();
        yes yesVar2 = this.j;
        ckf.d(yesVar2);
        yesVar2.m(new m9x(this));
        WeexV2WidgetGroupContentRender$rootView$1 weexV2WidgetGroupContentRender$rootView$1 = this.i;
        yes yesVar3 = this.j;
        ckf.d(yesVar3);
        weexV2WidgetGroupContentRender$rootView$1.addView(yesVar3.h());
        yes yesVar4 = this.j;
        ckf.d(yesVar4);
        yesVar4.l(null);
    }
}
