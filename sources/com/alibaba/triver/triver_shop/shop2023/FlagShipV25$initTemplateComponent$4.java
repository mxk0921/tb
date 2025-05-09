package com.alibaba.triver.triver_shop.shop2023;

import android.view.View;
import com.alibaba.triver.triver_shop.newShop.view.component.nativeview.Shop2025HeaderNativeComponent;
import com.alibaba.triver.triver_shop.newShop.view.embed.EmbedShopLoftComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.ckf;
import tb.g1a;
import tb.kew;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class FlagShipV25$initTemplateComponent$4 extends Lambda implements g1a<Integer, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Ref$ObjectRef<Boolean> $lastMuteStatus;
    public final /* synthetic */ FlagShipV25 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlagShipV25$initTemplateComponent$4(FlagShipV25 flagShipV25, Ref$ObjectRef<Boolean> ref$ObjectRef) {
        super(1);
        this.this$0 = flagShipV25;
        this.$lastMuteStatus = ref$ObjectRef;
    }

    public static /* synthetic */ Object ipc$super(FlagShipV25$initTemplateComponent$4 flagShipV25$initTemplateComponent$4, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/FlagShipV25$initTemplateComponent$4");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Integer num) {
        invoke(num.intValue());
        return xhv.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(int i) {
        Ref$ObjectRef<Boolean> ref$ObjectRef;
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b945e4", new Object[]{this, new Integer(i)});
            return;
        }
        FlagShipV25 flagShipV25 = this.this$0;
        Shop2025HeaderNativeComponent q1 = FlagShipV25.q1(flagShipV25);
        if (q1 != null) {
            flagShipV25.S0(!q1.W(Integer.valueOf(i)));
            Shop2025HeaderNativeComponent q12 = FlagShipV25.q1(this.this$0);
            if (q12 != null) {
                if (q12.q0(Integer.valueOf(i))) {
                    View f1 = FlagShipV25.f1(this.this$0);
                    if (f1 != null) {
                        kew.g0(f1);
                        if (this.$lastMuteStatus.element == null && FlagShipV25.L1(this.this$0)) {
                            Ref$ObjectRef<Boolean> ref$ObjectRef2 = this.$lastMuteStatus;
                            EmbedShopLoftComponent n1 = FlagShipV25.n1(this.this$0);
                            ref$ObjectRef2.element = n1 == null ? 0 : Boolean.valueOf(n1.u());
                            EmbedShopLoftComponent n12 = FlagShipV25.n1(this.this$0);
                            if (n12 != null) {
                                n12.O(true);
                            }
                        }
                    } else {
                        ckf.y("bigCardTopBlackShadowBg");
                        throw null;
                    }
                } else {
                    View f12 = FlagShipV25.f1(this.this$0);
                    if (f12 != null) {
                        kew.B(f12);
                    } else {
                        ckf.y("bigCardTopBlackShadowBg");
                        throw null;
                    }
                }
                Shop2025HeaderNativeComponent q13 = FlagShipV25.q1(this.this$0);
                if (q13 == null) {
                    ckf.y("headerNativeComponent");
                    throw null;
                } else if (q13.Y(Integer.valueOf(i)) && FlagShipV25.z1(this.this$0) && (bool = (ref$ObjectRef = this.$lastMuteStatus).element) != null) {
                    FlagShipV25 flagShipV252 = this.this$0;
                    boolean booleanValue = bool.booleanValue();
                    EmbedShopLoftComponent n13 = FlagShipV25.n1(flagShipV252);
                    if (n13 != null) {
                        n13.O(booleanValue);
                    }
                    ref$ObjectRef.element = null;
                }
            } else {
                ckf.y("headerNativeComponent");
                throw null;
            }
        } else {
            ckf.y("headerNativeComponent");
            throw null;
        }
    }
}
