package com.taobao.android.icart.weex.performance;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class CartWeexPerformance$appLauncherStartTime$2 extends Lambda implements d1a<Long> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ CartWeexPerformance this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartWeexPerformance$appLauncherStartTime$2(CartWeexPerformance cartWeexPerformance) {
        super(0);
        this.this$0 = cartWeexPerformance;
    }

    public static /* synthetic */ Object ipc$super(CartWeexPerformance$appLauncherStartTime$2 cartWeexPerformance$appLauncherStartTime$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/weex/performance/CartWeexPerformance$appLauncherStartTime$2");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Long, long] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Long, long] */
    @Override // tb.d1a
    public final Long invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7560ccf3", new Object[]{this})).longValue() : CartWeexPerformance.a(this.this$0);
    }
}
