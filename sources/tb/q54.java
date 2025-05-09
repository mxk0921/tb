package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.npp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class q54 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d1a<xhv> f26511a;
    public final /* synthetic */ String b;

    public q54(d1a<xhv> d1aVar, String str) {
        this.f26511a = d1aVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        ltt lttVar = new ltt();
        d1a<xhv> d1aVar = this.f26511a;
        if (d1aVar != null) {
            d1aVar.invoke();
        }
        npp.a aVar = npp.Companion;
        aVar.b("shopAsyncTask : " + ((Object) this.b) + " , cost : " + lttVar.a());
    }
}
