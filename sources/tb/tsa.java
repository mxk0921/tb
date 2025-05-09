package tb;

import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class tsa implements juo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f28931a = new Handler();

    @Override // tb.juo
    public void a(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc2af728", new Object[]{this, runnable, new Long(j)});
        } else if (j <= 0) {
            this.f28931a.post(runnable);
        } else {
            this.f28931a.postDelayed(runnable, j);
        }
    }
}
