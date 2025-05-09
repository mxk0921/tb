package com.alibaba.triver.triver_shop.newShop.view;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;
import tb.d1a;
import tb.ork;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopIndexNavCycleComponent$init$tryToCreateRecyclerView$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ List<String> $dataList;
    public final /* synthetic */ boolean $flagShipNewStyle;
    public final /* synthetic */ boolean $hasBigCard;
    public final /* synthetic */ ork $onItemClickListener;
    public final /* synthetic */ PerceptionSizeFrameLayout $perceptionLayout;
    public final /* synthetic */ Ref$IntRef $recycleViewOuterHeight;
    public final /* synthetic */ Ref$IntRef $recycleViewOuterWidth;
    public final /* synthetic */ ShopDataParser $shopData;
    public final /* synthetic */ Ref$IntRef $twoTextWidth;
    public final /* synthetic */ ShopIndexNavCycleComponent this$0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PerceptionSizeFrameLayout f3151a;
        public final /* synthetic */ RecyclerView b;
        public final /* synthetic */ int c;
        public final /* synthetic */ Ref$IntRef d;

        public a(PerceptionSizeFrameLayout perceptionSizeFrameLayout, RecyclerView recyclerView, int i, Ref$IntRef ref$IntRef) {
            this.f3151a = perceptionSizeFrameLayout;
            this.b = recyclerView;
            this.c = i;
            this.d = ref$IntRef;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f3151a.addView(this.b, this.c, this.d.element);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopIndexNavCycleComponent$init$tryToCreateRecyclerView$1(Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, Ref$IntRef ref$IntRef3, boolean z, ShopIndexNavCycleComponent shopIndexNavCycleComponent, Context context, List<String> list, ork orkVar, boolean z2, ShopDataParser shopDataParser, PerceptionSizeFrameLayout perceptionSizeFrameLayout) {
        super(0);
        this.$recycleViewOuterHeight = ref$IntRef;
        this.$recycleViewOuterWidth = ref$IntRef2;
        this.$twoTextWidth = ref$IntRef3;
        this.$flagShipNewStyle = z;
        this.this$0 = shopIndexNavCycleComponent;
        this.$context = context;
        this.$dataList = list;
        this.$onItemClickListener = orkVar;
        this.$hasBigCard = z2;
        this.$shopData = shopDataParser;
        this.$perceptionLayout = perceptionSizeFrameLayout;
    }

    public static /* synthetic */ Object ipc$super(ShopIndexNavCycleComponent$init$tryToCreateRecyclerView$1 shopIndexNavCycleComponent$init$tryToCreateRecyclerView$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/ShopIndexNavCycleComponent$init$tryToCreateRecyclerView$1");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
        if ((r10 - (r6 * r5)) >= (r4 + (r3 / 2))) goto L_0x004b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
        if ((r10 - (r6 * r5)) >= (r4 + (r3 / 2))) goto L_0x004b;
     */
    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void invoke2() {
        /*
            r16 = this;
            r0 = r16
            r1 = 0
            r2 = 1
            com.android.alibaba.ip.runtime.IpChange r3 = com.alibaba.triver.triver_shop.newShop.view.ShopIndexNavCycleComponent$init$tryToCreateRecyclerView$1.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0014
            java.lang.String r4 = "7560ccff"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r0
            r3.ipc$dispatch(r4, r2)
            return
        L_0x0014:
            kotlin.jvm.internal.Ref$IntRef r3 = r0.$recycleViewOuterHeight
            int r3 = r3.element
            if (r3 == 0) goto L_0x00c4
            kotlin.jvm.internal.Ref$IntRef r3 = r0.$recycleViewOuterWidth
            int r3 = r3.element
            if (r3 == 0) goto L_0x00c4
            kotlin.jvm.internal.Ref$IntRef r3 = r0.$twoTextWidth
            int r3 = r3.element
            if (r3 != 0) goto L_0x0028
            goto L_0x00c4
        L_0x0028:
            r3 = 27
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r3 = tb.kew.p(r3)
            kotlin.jvm.internal.Ref$IntRef r4 = r0.$twoTextWidth
            int r4 = r4.element
            int r5 = r4 + r3
            kotlin.jvm.internal.Ref$IntRef r6 = r0.$recycleViewOuterWidth
            int r10 = r6.element
            int r6 = r10 / r5
            boolean r7 = r0.$flagShipNewStyle
            if (r7 == 0) goto L_0x004d
            int r7 = r6 * r5
            int r7 = r10 - r7
            int r3 = r3 / 2
            int r4 = r4 + r3
            if (r7 < r4) goto L_0x005c
        L_0x004b:
            int r6 = r6 + r2
            goto L_0x005c
        L_0x004d:
            r7 = 5
            if (r6 < r7) goto L_0x0052
            r6 = 5
            goto L_0x005c
        L_0x0052:
            int r7 = r6 * r5
            int r7 = r10 - r7
            int r3 = r3 / 2
            int r4 = r4 + r3
            if (r7 < r4) goto L_0x005c
            goto L_0x004b
        L_0x005c:
            int r6 = r6 * r5
            com.alibaba.triver.triver_shop.newShop.view.ShopIndexNavCycleComponent r7 = r0.this$0
            android.content.Context r8 = r0.$context
            java.util.List<java.lang.String> r9 = r0.$dataList
            kotlin.jvm.internal.Ref$IntRef r3 = r0.$recycleViewOuterHeight
            int r11 = r3.element
            tb.ork r12 = r0.$onItemClickListener
            androidx.recyclerview.widget.RecyclerView r3 = com.alibaba.triver.triver_shop.newShop.view.ShopIndexNavCycleComponent.a(r7, r8, r9, r10, r11, r12)
            com.alibaba.triver.triver_shop.newShop.view.ShopIndexNavCycleComponent r4 = r0.this$0
            boolean r5 = r0.$hasBigCard
            com.alibaba.triver.triver_shop.newShop.data.ShopDataParser r7 = r0.$shopData
            com.alibaba.triver.triver_shop.newShop.view.PerceptionSizeFrameLayout r15 = r0.$perceptionLayout
            kotlin.jvm.internal.Ref$IntRef r14 = r0.$recycleViewOuterHeight
            com.alibaba.triver.triver_shop.newShop.view.ShopIndexNavCycleComponent.g(r4, r3)
            com.alibaba.triver.triver_shop.newShop.view.ShopIndexNavCycleComponent$b r8 = com.alibaba.triver.triver_shop.newShop.view.ShopIndexNavCycleComponent.e(r4)
            r8.q(r5)
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            boolean r5 = r7.K1()
            if (r5 != 0) goto L_0x0090
            boolean r5 = r7.L1()
            if (r5 == 0) goto L_0x0091
        L_0x0090:
            r1 = 1
        L_0x0091:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r7.O1()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r7.g()
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r1)
            r9 = 0
            r12 = 0
            r1 = 18
            r2 = 0
            r7 = r4
            r5 = r14
            r14 = r1
            r1 = r15
            r15 = r2
            com.alibaba.triver.triver_shop.newShop.view.ShopIndexNavCycleComponent.o(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            androidx.recyclerview.widget.RecyclerView r2 = com.alibaba.triver.triver_shop.newShop.view.ShopIndexNavCycleComponent.c(r4)
            if (r2 != 0) goto L_0x00b9
            goto L_0x00bc
        L_0x00b9:
            tb.kew.T(r2)
        L_0x00bc:
            com.alibaba.triver.triver_shop.newShop.view.ShopIndexNavCycleComponent$init$tryToCreateRecyclerView$1$a r2 = new com.alibaba.triver.triver_shop.newShop.view.ShopIndexNavCycleComponent$init$tryToCreateRecyclerView$1$a
            r2.<init>(r1, r3, r6, r5)
            r1.post(r2)
        L_0x00c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.newShop.view.ShopIndexNavCycleComponent$init$tryToCreateRecyclerView$1.invoke2():void");
    }
}
