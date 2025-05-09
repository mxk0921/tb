package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class gr2 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ hr2 f20176a;
    public final /* synthetic */ d1a<xhv> b;

    public gr2(hr2 hr2Var, d1a<xhv> d1aVar) {
        this.b = d1aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (hr2.a(null)) {
            hr2.c(null, true);
            hr2.b(null);
            this.b.invoke();
        }
    }
}
