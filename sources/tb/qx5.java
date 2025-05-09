package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.ADaemon;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qx5 implements tvb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.tvb
    public void a(Runnable runnable, long... jArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2854be", new Object[]{this, runnable, jArr});
        } else {
            ADaemon.postMainLooper(runnable, jArr);
        }
    }
}
