package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class amv implements wct {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final x0s f15861a;

    public amv(x0s x0sVar) {
        this.f15861a = x0sVar;
    }

    public final /* synthetic */ void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d34ab", new Object[]{this});
            return;
        }
        try {
            e7b.b(this.f15861a);
        } catch (Throwable th) {
            ehh.d(th);
        }
    }

    @Override // tb.wct
    public void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
        } else {
            suo.c(new Runnable() { // from class: tb.zlv
                @Override // java.lang.Runnable
                public final void run() {
                    amv.this.b();
                }
            }).d(suo.sScheduler).b();
        }
    }
}
