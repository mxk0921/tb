package tb;

import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ljt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ijt implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ vjt f21353a;
    public final /* synthetic */ ljt b;

    public ijt(ljt ljtVar, vjt vjtVar) {
        this.b = ljtVar;
        this.f21353a = vjtVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        ljt.a aVar = new ljt.a(this.b);
        ljt.a.a(aVar, this.f21353a);
        aVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
