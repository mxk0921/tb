package com.alibaba.triver.triver_shop.newShop.view;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.alibaba.ariver.integration.RVMain;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.npp;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class MiniAppShopContentRender$1$afterInitAction$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Bundle $bundle;
    public final /* synthetic */ String $miniAppUrl;
    public final /* synthetic */ MiniAppShopContentRender this$0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements RVMain.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MiniAppShopContentRender f3124a;

        public a(MiniAppShopContentRender miniAppShopContentRender) {
            this.f3124a = miniAppShopContentRender;
        }

        public final void a(Fragment fragment) {
            Lifecycle lifecycle;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a37f72a", new Object[]{this, fragment});
                return;
            }
            MiniAppShopContentRender.G(this.f3124a, fragment);
            if (!(fragment == null || (lifecycle = fragment.getLifecycle()) == null)) {
                lifecycle.addObserver(new MiniAppShopContentRender.FragmentLifeCycleObserver(this.f3124a));
            }
            MiniAppShopContentRender.w(this.f3124a);
            MiniAppShopContentRender.v(this.f3124a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppShopContentRender$1$afterInitAction$1(MiniAppShopContentRender miniAppShopContentRender, String str, Bundle bundle) {
        super(0);
        this.this$0 = miniAppShopContentRender;
        this.$miniAppUrl = str;
        this.$bundle = bundle;
    }

    public static /* synthetic */ Object ipc$super(MiniAppShopContentRender$1$afterInitAction$1 miniAppShopContentRender$1$afterInitAction$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/MiniAppShopContentRender$1$afterInitAction$1");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c5  */
    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void invoke2() {
        /*
            r7 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender$1$afterInitAction$1.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0012
            java.lang.String r3 = "7560ccff"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r7
            r2.ipc$dispatch(r3, r1)
            return
        L_0x0012:
            com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender r2 = r7.this$0
            tb.ups r2 = com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender.D(r2)
            boolean r2 = r2.B()
            if (r2 == 0) goto L_0x0031
            com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender r2 = r7.this$0
            tb.ups r2 = com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender.D(r2)
            com.alibaba.triver.triver_shop.newShop.data.ShopDataParser r2 = r2.o()
            if (r2 != 0) goto L_0x002c
        L_0x002a:
            r2 = 0
            goto L_0x0042
        L_0x002c:
            int r2 = r2.r0()
            goto L_0x0042
        L_0x0031:
            com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender r2 = r7.this$0
            tb.ups r2 = com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender.D(r2)
            com.alibaba.triver.triver_shop.newShop.data.ShopDataParser r2 = r2.o()
            if (r2 != 0) goto L_0x003e
            goto L_0x002a
        L_0x003e:
            int r2 = r2.D0()
        L_0x0042:
            if (r2 != 0) goto L_0x005c
            tb.npp$a r2 = tb.npp.Companion
            java.lang.String r3 = "mini app content render : maxHeight 0"
            r2.b(r3)
            com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender r2 = r7.this$0
            android.widget.FrameLayout r2 = com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender.C(r2)
            com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender r3 = r7.this$0
            android.view.View r3 = com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender.A(r3)
            tb.kew.a(r2, r3)
            goto L_0x008a
        L_0x005c:
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = -1
            r3.<init>(r4, r2)
            com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender r4 = r7.this$0
            android.view.View r4 = com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender.A(r4)
            r4.setLayoutParams(r3)
            com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender r4 = r7.this$0
            android.widget.FrameLayout r4 = com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender.C(r4)
            com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender r5 = r7.this$0
            android.view.View r5 = com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender.A(r5)
            r4.addView(r5, r3)
            tb.npp$a r3 = tb.npp.Companion
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r4 = "mini app content render : maxHeight "
            java.lang.String r2 = tb.ckf.p(r4, r2)
            r3.b(r2)
        L_0x008a:
            com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender r2 = r7.this$0
            android.content.Context r2 = com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender.y(r2)
            java.lang.String r3 = r7.$miniAppUrl
            android.net.Uri r3 = android.net.Uri.parse(r3)
            android.os.Bundle r4 = r7.$bundle
            com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender$1$afterInitAction$1$a r5 = new com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender$1$afterInitAction$1$a
            com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender r6 = r7.this$0
            r5.<init>(r6)
            com.alibaba.ariver.integration.RVMain$f r5 = (com.alibaba.ariver.integration.RVMain.f) r5
            tb.tgu.d(r2, r3, r4, r0, r5)
            com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender r0 = r7.this$0
            tb.ups r0 = com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender.D(r0)
            com.alibaba.triver.triver_shop.newShop.data.ShopDataParser r0 = r0.o()
            if (r0 != 0) goto L_0x00b1
            goto L_0x00b8
        L_0x00b1:
            boolean r0 = r0.N1()
            if (r0 != r1) goto L_0x00b8
            goto L_0x00de
        L_0x00b8:
            com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender r0 = r7.this$0
            tb.ups r0 = com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender.D(r0)
            com.alibaba.triver.triver_shop.newShop.data.ShopDataParser r0 = r0.o()
            if (r0 != 0) goto L_0x00c5
            goto L_0x00df
        L_0x00c5:
            boolean r0 = r0.J1()
            if (r0 != r1) goto L_0x00df
            com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender r0 = r7.this$0
            tb.ups r0 = com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender.D(r0)
            com.alibaba.triver.triver_shop.newShop.data.ShopDataParser r0 = r0.o()
            if (r0 != 0) goto L_0x00d8
            goto L_0x00df
        L_0x00d8:
            boolean r0 = r0.h2()
            if (r0 != 0) goto L_0x00df
        L_0x00de:
            return
        L_0x00df:
            com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender r0 = r7.this$0
            android.widget.FrameLayout r0 = com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender.C(r0)
            com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender$1$afterInitAction$1$b r1 = new com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender$1$afterInitAction$1$b
            com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender r2 = r7.this$0
            r1.<init>(r2)
            r0.addOnLayoutChangeListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender$1$afterInitAction$1.invoke2():void");
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f3125a;
        public final /* synthetic */ MiniAppShopContentRender b;

        public b(MiniAppShopContentRender miniAppShopContentRender) {
            this.b = miniAppShopContentRender;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                return;
            }
            this.f3125a++;
            int i10 = MiniAppShopContentRender.A(this.b).getLayoutParams().height;
            if (this.f3125a < 3 || i10 == -1) {
                ShopDataParser o = MiniAppShopContentRender.D(this.b).o();
                if (o != null) {
                    i9 = o.r0();
                }
                if (i9 > 0 && i10 != i9) {
                    npp.Companion.b(ckf.p("mini app content render : get new max content height : ", Integer.valueOf(i9)));
                    MiniAppShopContentRender.A(this.b).setLayoutParams(new FrameLayout.LayoutParams(-1, i9));
                    return;
                }
                return;
            }
            npp.Companion.b(ckf.p("mini app content render : last height : ", Integer.valueOf(i10)));
            MiniAppShopContentRender.C(this.b).removeOnLayoutChangeListener(this);
        }
    }
}
