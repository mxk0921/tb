package com.taobao.android.detail.ttdetail.animation.priceAnimation;

import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0;
import tb.dun;
import tb.xyf;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 16})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final /* synthetic */ class PriceAnimationLayout$clearAllState$5 extends MutablePropertyReference0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public PriceAnimationLayout$clearAllState$5(PriceAnimationLayout priceAnimationLayout) {
        super(priceAnimationLayout);
    }

    public static /* synthetic */ Object ipc$super(PriceAnimationLayout$clearAllState$5 priceAnimationLayout$clearAllState$5, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/animation/priceAnimation/PriceAnimationLayout$clearAllState$5");
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0
    public Object get() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6352d3f5", new Object[]{this});
        }
        return PriceAnimationLayout.access$getMPriceTail$p((PriceAnimationLayout) this.receiver);
    }

    @Override // kotlin.jvm.internal.CallableReference, tb.vyf
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "mPriceTail";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public xyf getOwner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xyf) ipChange.ipc$dispatch("71b3b10f", new Object[]{this});
        }
        return dun.b(PriceAnimationLayout.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public String getSignature() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f15da37", new Object[]{this});
        }
        return "getMPriceTail()Landroid/widget/TextView;";
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0
    public void set(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6236785", new Object[]{this, obj});
        } else {
            PriceAnimationLayout.access$setMPriceTail$p((PriceAnimationLayout) this.receiver, (TextView) obj);
        }
    }
}
