package androidx.core.os;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class HandlerKt$postDelayed$runnable$1 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ d1a<xhv> $action;

    public HandlerKt$postDelayed$runnable$1(d1a<xhv> d1aVar) {
        this.$action = d1aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            this.$action.invoke();
        }
    }
}
