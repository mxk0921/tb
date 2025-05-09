package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.i0s;
import tb.wd9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class i0s implements wct {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final x0s f21023a;
    public final r2o b;
    public final koq c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("583b5c78", new Object[]{this, file});
                return;
            }
            n1s a2 = o1s.a(file);
            if (a2 != null) {
                l1s.c().a("STAGE_ANR_HAPPENED_LAUNCH_SEND", "TCrash2", a2.b());
                i0s.b(i0s.this).a(a2);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                wd9.b(new f1s(i0s.a(i0s.this)).b(), new wd9.a() { // from class: tb.j0s
                    @Override // tb.wd9.a
                    public final void accept(File file) {
                        i0s.b.this.b(file);
                    }
                }).a();
            }
        }
    }

    public i0s(x0s x0sVar, koq koqVar, r2o r2oVar) {
        this.f21023a = x0sVar;
        this.c = koqVar;
        this.b = r2oVar;
    }

    public static /* synthetic */ x0s a(i0s i0sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x0s) ipChange.ipc$dispatch("fd19416", new Object[]{i0sVar});
        }
        return i0sVar.f21023a;
    }

    public static /* synthetic */ r2o b(i0s i0sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r2o) ipChange.ipc$dispatch("e072570e", new Object[]{i0sVar});
        }
        return i0sVar.b;
    }

    @Override // tb.wct
    public void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
        } else {
            suo.c(new b()).d(suo.sScheduler).b();
        }
    }
}
