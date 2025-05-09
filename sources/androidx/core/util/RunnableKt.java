package androidx.core.util;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.ar4;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ltb/ar4;", "Ltb/xhv;", "Ljava/lang/Runnable;", "asRunnable", "(Ltb/ar4;)Ljava/lang/Runnable;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class RunnableKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final Runnable asRunnable(ar4<? super xhv> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("871c44cc", new Object[]{ar4Var});
        }
        return new ContinuationRunnable(ar4Var);
    }
}
