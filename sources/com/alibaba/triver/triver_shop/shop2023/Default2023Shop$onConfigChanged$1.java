package com.alibaba.triver.triver_shop.shop2023;

import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.r54;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Default2023Shop$onConfigChanged$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Default2023Shop this$0;

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.triver.triver_shop.shop2023.Default2023Shop$onConfigChanged$1$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements d1a<xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Default2023Shop this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Default2023Shop default2023Shop) {
            super(0);
            this.this$0 = default2023Shop;
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/Default2023Shop$onConfigChanged$1$1");
        }

        @Override // tb.d1a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                return;
            }
            Default2023Shop.h2(this.this$0);
            ShopExtKt.V(Default2023Shop.J1(this.this$0), Default2023Shop.C1(this.this$0), Default2023Shop.D1(this.this$0), Default2023Shop.B1(this.this$0), Default2023Shop.F1(this.this$0));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Default2023Shop$onConfigChanged$1(Default2023Shop default2023Shop) {
        super(0);
        this.this$0 = default2023Shop;
    }

    public static /* synthetic */ Object ipc$super(Default2023Shop$onConfigChanged$1 default2023Shop$onConfigChanged$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/Default2023Shop$onConfigChanged$1");
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
