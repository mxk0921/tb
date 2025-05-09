package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.n1d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class l1d implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n1d.a f23051a;

    public l1d(n1d.a aVar) {
        this.f23051a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            n1d.a(this.f23051a);
        }
    }
}
