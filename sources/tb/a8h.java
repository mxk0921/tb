package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.a8h;
import tb.wd9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a8h implements wct {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final x0s f15593a;
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
                l1s.c().a("STAGE_ANR_HAPPENED_LAUNCH_SEND", "TCrash", a2.b());
                a8h.c(a8h.this).a(a2);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int b = new rgt(a8h.a(a8h.this).g(), a8h.a(a8h.this).h()).b(20);
            if (b > 0) {
                ehh.b("LocalFileTask", pg1.ATOM_EXT_del, "" + b);
            }
            wd9.a b8hVar = new wd9.a() { // from class: tb.b8h
                @Override // tb.wd9.a
                public final void accept(File file) {
                    a8h.b.this.b(file);
                }
            };
            wd9.a c8hVar = new wd9.a() { // from class: tb.c8h
                @Override // tb.wd9.a
                public final void accept(File file) {
                    kg9.f(file);
                }
            };
            File[] b2 = new agt(a8h.a(a8h.this)).b();
            File[] b3 = new q5v(a8h.a(a8h.this)).b();
            wd9.b(b2, b8hVar).a();
            wd9.b(b3, b8hVar).a();
            wd9.b(new s5v(a8h.a(a8h.this)).b(), c8hVar).a();
            if (tn8.a(a8h.a(a8h.this).g(), a8h.b(a8h.this).defaultValue())) {
                wd9.b(new xft(a8h.a(a8h.this)).b(), b8hVar).a();
                return;
            }
            wd9.b(new xft(a8h.a(a8h.this)).b(), b8hVar).a();
            wd9.b(new o5v(a8h.a(a8h.this)).b(), b8hVar).a();
        }
    }

    public a8h(x0s x0sVar, koq koqVar, r2o r2oVar) {
        this.f15593a = x0sVar;
        this.c = koqVar;
        this.b = r2oVar;
    }

    public static /* synthetic */ x0s a(a8h a8hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x0s) ipChange.ipc$dispatch("7beb59c1", new Object[]{a8hVar});
        }
        return a8hVar.f15593a;
    }

    public static /* synthetic */ koq b(a8h a8hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (koq) ipChange.ipc$dispatch("3a7d7ffa", new Object[]{a8hVar});
        }
        return a8hVar.c;
    }

    public static /* synthetic */ r2o c(a8h a8hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r2o) ipChange.ipc$dispatch("34434ba6", new Object[]{a8hVar});
        }
        return a8hVar.b;
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
