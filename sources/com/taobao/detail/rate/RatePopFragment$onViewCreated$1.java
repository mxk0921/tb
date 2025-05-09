package com.taobao.detail.rate;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.hhn;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "position", "Ltb/hhn;", "item", "Ltb/xhv;", "invoke", "(ILtb/hhn;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class RatePopFragment$onViewCreated$1 extends Lambda implements u1a<Integer, hhn, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ RatePopFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatePopFragment$onViewCreated$1(RatePopFragment ratePopFragment) {
        super(2);
        this.this$0 = ratePopFragment;
    }

    public static /* synthetic */ Object ipc$super(RatePopFragment$onViewCreated$1 ratePopFragment$onViewCreated$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/RatePopFragment$onViewCreated$1");
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(Integer num, hhn hhnVar) {
        invoke(num.intValue(), hhnVar);
        return xhv.INSTANCE;
    }

    public final void invoke(int i, hhn hhnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20349fe9", new Object[]{this, new Integer(i), hhnVar});
            return;
        }
        ckf.g(hhnVar, "item");
        RatePopFragment.access$dealItemClick(this.this$0, i, hhnVar);
    }
}
