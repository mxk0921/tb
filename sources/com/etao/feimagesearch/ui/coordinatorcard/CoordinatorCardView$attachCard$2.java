package com.etao.feimagesearch.ui.coordinatorcard;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CoordinatorCardView$attachCard$2 extends Lambda implements u1a<Integer, String, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final CoordinatorCardView$attachCard$2 INSTANCE = new CoordinatorCardView$attachCard$2();

    public CoordinatorCardView$attachCard$2() {
        super(2);
    }

    public static /* synthetic */ Object ipc$super(CoordinatorCardView$attachCard$2 coordinatorCardView$attachCard$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/ui/coordinatorcard/CoordinatorCardView$attachCard$2");
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Integer num, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("795a6ae2", new Object[]{this, num, str});
        }
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(Integer num, String str) {
        invoke2(num, str);
        return xhv.INSTANCE;
    }
}
