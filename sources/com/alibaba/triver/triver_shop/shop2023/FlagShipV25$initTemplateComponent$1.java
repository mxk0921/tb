package com.alibaba.triver.triver_shop.shop2023;

import android.widget.TextView;
import com.alibaba.triver.triver_shop.newShop.view.component.nativeview.Shop2025HeaderNativeComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.kew;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class FlagShipV25$initTemplateComponent$1 extends Lambda implements g1a<Integer, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ FlagShipV25 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlagShipV25$initTemplateComponent$1(FlagShipV25 flagShipV25) {
        super(1);
        this.this$0 = flagShipV25;
    }

    public static /* synthetic */ Object ipc$super(FlagShipV25$initTemplateComponent$1 flagShipV25$initTemplateComponent$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/FlagShipV25$initTemplateComponent$1");
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
        int w1 = FlagShipV25.w1(this.this$0);
        Shop2025HeaderNativeComponent q1 = FlagShipV25.q1(this.this$0);
        if (q1 == null) {
            ckf.y("headerNativeComponent");
            throw null;
        } else if (i < w1 + q1.d0()) {
            TextView P2 = this.this$0.P2();
            if (P2 != null) {
                kew.C(P2);
            }
        } else {
            TextView P22 = this.this$0.P2();
            if (P22 != null) {
                kew.g0(P22);
            }
            Shop2025HeaderNativeComponent q12 = FlagShipV25.q1(this.this$0);
            if (q12 != null) {
                TextView P23 = this.this$0.P2();
                if (P23 != null) {
                    P23.setTranslationY((i - q12.i0()) - (q12.d0() - q12.c0()));
                    return;
                }
                return;
            }
            ckf.y("headerNativeComponent");
            throw null;
        }
    }
}
