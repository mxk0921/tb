package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ydp implements juo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.juo
    public void a(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc2af728", new Object[]{this, runnable, new Long(j)});
        } else if (j > 0) {
            v9a.c().a().schedule(runnable, j, TimeUnit.MILLISECONDS);
        } else {
            v9a.c().a().execute(runnable);
        }
    }
}
