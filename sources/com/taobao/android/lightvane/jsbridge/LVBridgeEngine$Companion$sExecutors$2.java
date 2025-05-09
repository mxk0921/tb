package com.taobao.android.lightvane.jsbridge;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.bfg;
import tb.cm8;
import tb.d1a;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/util/concurrent/ThreadPoolExecutor;", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class LVBridgeEngine$Companion$sExecutors$2 extends Lambda implements d1a<ThreadPoolExecutor> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final LVBridgeEngine$Companion$sExecutors$2 INSTANCE = new LVBridgeEngine$Companion$sExecutors$2();

    public LVBridgeEngine$Companion$sExecutors$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(LVBridgeEngine$Companion$sExecutors$2 lVBridgeEngine$Companion$sExecutors$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/lightvane/jsbridge/LVBridgeEngine$Companion$sExecutors$2");
    }

    @Override // tb.d1a
    public final ThreadPoolExecutor invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("94d634df", new Object[]{this});
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 3, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new bfg("GVBridgeEngine"));
        cm8.b(null, null, new LVBridgeEngine$Companion$sExecutors$2$1$1(threadPoolExecutor), 3, null);
        return threadPoolExecutor;
    }
}
