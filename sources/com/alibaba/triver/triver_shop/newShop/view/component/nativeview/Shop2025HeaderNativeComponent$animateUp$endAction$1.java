package com.alibaba.triver.triver_shop.newShop.view.component.nativeview;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Shop2025HeaderNativeComponent$animateUp$endAction$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ d1a<xhv> $animateEndCallback;
    public final /* synthetic */ Shop2025HeaderNativeComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Shop2025HeaderNativeComponent$animateUp$endAction$1(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent, d1a<xhv> d1aVar) {
        super(0);
        this.this$0 = shop2025HeaderNativeComponent;
        this.$animateEndCallback = d1aVar;
    }

    public static /* synthetic */ Object ipc$super(Shop2025HeaderNativeComponent$animateUp$endAction$1 shop2025HeaderNativeComponent$animateUp$endAction$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/nativeview/Shop2025HeaderNativeComponent$animateUp$endAction$1");
    }

    @Override // tb.d1a
    public final xhv invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("c1e1c5fe", new Object[]{this});
        }
        Shop2025HeaderNativeComponent.A(this.this$0, Shop2025HeaderNativeComponent.Companion.a());
        d1a<xhv> d1aVar = this.$animateEndCallback;
        if (d1aVar == null) {
            return null;
        }
        d1aVar.invoke();
        return xhv.INSTANCE;
    }
}
