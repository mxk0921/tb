package com.alibaba.triver.triver_shop.shop2023;

import com.alibaba.triver.triver_shop.shop2023.template.Shop2023BaseTemplateComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.dnp;
import tb.g1a;
import tb.kew;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Default2023Shop$initTemplateComponent$6$1 extends Lambda implements g1a<Shop2023BaseTemplateComponent, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Default2023Shop this$0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Shop2023BaseTemplateComponent f3286a;
        public final /* synthetic */ Default2023Shop b;

        public a(Shop2023BaseTemplateComponent shop2023BaseTemplateComponent, Default2023Shop default2023Shop) {
            this.f3286a = shop2023BaseTemplateComponent;
            this.b = default2023Shop;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            kew.e(this.f3286a.d(), 0);
            Default2023Shop.w1(this.b).h(0);
            dnp B1 = Default2023Shop.B1(this.b);
            if (B1 != null) {
                B1.I();
            }
            Default2023Shop.U1(this.b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Default2023Shop$initTemplateComponent$6$1(Default2023Shop default2023Shop) {
        super(1);
        this.this$0 = default2023Shop;
    }

    public static /* synthetic */ Object ipc$super(Default2023Shop$initTemplateComponent$6$1 default2023Shop$initTemplateComponent$6$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/Default2023Shop$initTemplateComponent$6$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Shop2023BaseTemplateComponent shop2023BaseTemplateComponent) {
        invoke2(shop2023BaseTemplateComponent);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Shop2023BaseTemplateComponent shop2023BaseTemplateComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd72914", new Object[]{this, shop2023BaseTemplateComponent});
            return;
        }
        ckf.g(shop2023BaseTemplateComponent, AdvanceSetting.NETWORK_TYPE);
        Default2023Shop default2023Shop = this.this$0;
        a aVar = new a(shop2023BaseTemplateComponent, default2023Shop);
        if (Default2023Shop.t1(default2023Shop) || Default2023Shop.g1(this.this$0) || Default2023Shop.N1(this.this$0)) {
            Default2023Shop.W1(this.this$0, aVar);
        } else {
            aVar.run();
        }
    }
}
