package com.taobao.android.lightvane.jsbridge;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()Ltb/xhv;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class LVBridgeEngine$Companion$sExecutors$2$1$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ThreadPoolExecutor $this_apply;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LVBridgeEngine$Companion$sExecutors$2$1$1(ThreadPoolExecutor threadPoolExecutor) {
        super(0);
        this.$this_apply = threadPoolExecutor;
    }

    public static /* synthetic */ Object ipc$super(LVBridgeEngine$Companion$sExecutors$2$1$1 lVBridgeEngine$Companion$sExecutors$2$1$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/lightvane/jsbridge/LVBridgeEngine$Companion$sExecutors$2$1$1");
    }

    @Override // tb.d1a
    public final xhv invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("c1e1c5fe", new Object[]{this});
        }
        ThreadPoolExecutor threadPoolExecutor = this.$this_apply;
        if (!(threadPoolExecutor instanceof ThreadPoolExecutor)) {
            threadPoolExecutor = null;
        }
        if (threadPoolExecutor == null) {
            return null;
        }
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return xhv.INSTANCE;
    }
}
