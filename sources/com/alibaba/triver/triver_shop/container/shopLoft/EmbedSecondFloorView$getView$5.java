package com.alibaba.triver.triver_shop.container.shopLoft;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xhv;
import tb.xpd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class EmbedSecondFloorView$getView$5 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ EmbedSecondFloorView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbedSecondFloorView$getView$5(EmbedSecondFloorView embedSecondFloorView) {
        super(0);
        this.this$0 = embedSecondFloorView;
    }

    public static /* synthetic */ Object ipc$super(EmbedSecondFloorView$getView$5 embedSecondFloorView$getView$5, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/EmbedSecondFloorView$getView$5");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else if (this.this$0.e()) {
            xpd g = this.this$0.g();
            if (g != null) {
                g.willAppear();
            }
            xpd g2 = this.this$0.g();
            if (g2 != null) {
                g2.didAppear();
            }
            xpd g3 = this.this$0.g();
            if (g3 != null) {
                g3.play();
            }
        }
    }
}
