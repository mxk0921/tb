package com.alibaba.android.ultron.vfw.weex2.highPerformance.factory;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/alibaba/fastjson/JSONObject;", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class TradeHybridDataFactory$hitRequestQueryMap$2 extends Lambda implements d1a<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TradeHybridDataFactory$hitRequestQueryMap$2 INSTANCE = new TradeHybridDataFactory$hitRequestQueryMap$2();

    public TradeHybridDataFactory$hitRequestQueryMap$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(TradeHybridDataFactory$hitRequestQueryMap$2 tradeHybridDataFactory$hitRequestQueryMap$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/weex2/highPerformance/factory/TradeHybridDataFactory$hitRequestQueryMap$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final JSONObject invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("3153bc1f", new Object[]{this}) : TradeHybridDataFactory.b(TradeHybridDataFactory.INSTANCE);
    }
}
