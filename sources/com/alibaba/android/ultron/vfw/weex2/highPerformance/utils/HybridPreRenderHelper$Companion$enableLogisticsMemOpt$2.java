package com.alibaba.android.ultron.vfw.weex2.highPerformance.utils;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.v9v;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class HybridPreRenderHelper$Companion$enableLogisticsMemOpt$2 extends Lambda implements d1a<Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final HybridPreRenderHelper$Companion$enableLogisticsMemOpt$2 INSTANCE = new HybridPreRenderHelper$Companion$enableLogisticsMemOpt$2();

    public HybridPreRenderHelper$Companion$enableLogisticsMemOpt$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(HybridPreRenderHelper$Companion$enableLogisticsMemOpt$2 hybridPreRenderHelper$Companion$enableLogisticsMemOpt$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/weex2/highPerformance/utils/HybridPreRenderHelper$Companion$enableLogisticsMemOpt$2");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Boolean, boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Boolean, boolean] */
    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Boolean invoke2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7560cd03", new Object[]{this})).booleanValue() : v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_ORDER_LIST, "enableLogisticsLimitCache", false);
    }
}
