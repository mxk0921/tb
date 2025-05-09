package com.alibaba.android.ultron.vfw.storage;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xii;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xii;", "invoke", "()Ltb/xii;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class TradeCache$memoryCache$2 extends Lambda implements d1a<xii> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TradeCache$memoryCache$2 INSTANCE = new TradeCache$memoryCache$2();

    public TradeCache$memoryCache$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(TradeCache$memoryCache$2 tradeCache$memoryCache$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/storage/TradeCache$memoryCache$2");
    }

    @Override // tb.d1a
    public final xii invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xii) ipChange.ipc$dispatch("e93a2076", new Object[]{this}) : xii.Companion.b();
    }
}
