package com.alibaba.android.ultron.vfw.weex2.highPerformance.factory;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class TradeHybridDataFactory$hitRequestPathList$2 extends Lambda implements d1a<List<? extends String>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TradeHybridDataFactory$hitRequestPathList$2 INSTANCE = new TradeHybridDataFactory$hitRequestPathList$2();

    public TradeHybridDataFactory$hitRequestPathList$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(TradeHybridDataFactory$hitRequestPathList$2 tradeHybridDataFactory$hitRequestPathList$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/weex2/highPerformance/factory/TradeHybridDataFactory$hitRequestPathList$2");
    }

    @Override // tb.d1a
    public final List<? extends String> invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4c3f8768", new Object[]{this}) : TradeHybridDataFactory.a(TradeHybridDataFactory.INSTANCE);
    }
}
