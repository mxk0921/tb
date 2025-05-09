package androidx.lifecycle;

import androidx.arch.core.executor.ArchTaskExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0001¨\u0006\u0002"}, d2 = {"isMainThread", "", "lifecycle-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class LifecycleRegistry_androidKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final boolean isMainThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83ffd3f8", new Object[0])).booleanValue();
        }
        return ArchTaskExecutor.getInstance().isMainThread();
    }
}
