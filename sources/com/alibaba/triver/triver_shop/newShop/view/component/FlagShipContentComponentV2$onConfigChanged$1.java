package com.alibaba.triver.triver_shop.newShop.view.component;

import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.r54;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class FlagShipContentComponentV2$onConfigChanged$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ FlagShipContentComponentV2 this$0;

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.triver.triver_shop.newShop.view.component.FlagShipContentComponentV2$onConfigChanged$1$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements d1a<xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ FlagShipContentComponentV2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FlagShipContentComponentV2 flagShipContentComponentV2) {
            super(0);
            this.this$0 = flagShipContentComponentV2;
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/FlagShipContentComponentV2$onConfigChanged$1$1");
        }

        @Override // tb.d1a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            } else {
                ShopExtKt.V(FlagShipContentComponentV2.o1(this.this$0), FlagShipContentComponentV2.q1(this.this$0), FlagShipContentComponentV2.c1(this.this$0));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlagShipContentComponentV2$onConfigChanged$1(FlagShipContentComponentV2 flagShipContentComponentV2) {
        super(0);
        this.this$0 = flagShipContentComponentV2;
    }

    public static /* synthetic */ Object ipc$super(FlagShipContentComponentV2$onConfigChanged$1 flagShipContentComponentV2$onConfigChanged$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/FlagShipContentComponentV2$onConfigChanged$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            r54.E(new AnonymousClass1(this.this$0), 100L);
        }
    }
}
