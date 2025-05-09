package com.alibaba.triver.triver_shop.newShop.view.component;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.kwj;
import tb.npp;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class DefaultShopV2$bottomBarComponent$1 extends Lambda implements g1a<Integer, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ DefaultShopV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultShopV2$bottomBarComponent$1(DefaultShopV2 defaultShopV2) {
        super(1);
        this.this$0 = defaultShopV2;
    }

    public static /* synthetic */ Object ipc$super(DefaultShopV2$bottomBarComponent$1 defaultShopV2$bottomBarComponent$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/DefaultShopV2$bottomBarComponent$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Integer num) {
        invoke(num.intValue());
        return xhv.INSTANCE;
    }

    public final void invoke(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b945e4", new Object[]{this, new Integer(i)});
            return;
        }
        npp.Companion.b(ckf.p("flag ship , bottom bar changed : ", Integer.valueOf(i)));
        kwj Z0 = DefaultShopV2.Z0(this.this$0);
        if (Z0 != null) {
            Z0.b(i, false);
        } else {
            ckf.y("bottomBarAndIndexNavManager");
            throw null;
        }
    }
}
