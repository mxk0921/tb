package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.pd9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class p1s implements r2o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final pd9 f25820a;
    public final x0s b;
    public final rgt c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
        boolean a(n1s n1sVar);
    }

    public p1s(x0s x0sVar, koq koqVar) {
        this(x0sVar, koqVar, null);
    }

    @Override // tb.r2o
    public void a(n1s n1sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b18fbd25", new Object[]{this, n1sVar});
            return;
        }
        File a2 = n1sVar.a();
        if (a2 == null || !a2.exists()) {
            ehh.b("FileSender", "invalid file");
        } else if (a2.length() <= 0) {
            ehh.b("FileSender", "empty file");
            kg9.f(a2);
        } else {
            b(c(n1sVar));
        }
    }

    public final void b(n1s n1sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1bc9e6f", new Object[]{this, n1sVar});
        } else {
            ((d1s) this.f25820a).m(n1sVar.a(), n1sVar.b(), new a(this, n1sVar));
        }
    }

    public final n1s c(n1s n1sVar) {
        File a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n1s) ipChange.ipc$dispatch("6aef9efa", new Object[]{this, n1sVar});
        }
        File a3 = n1sVar.a();
        if (this.c.c(a3) || a3.getName().startsWith("TCrash") || (a2 = m5v.a(this.b, a3, n1sVar.b())) == null) {
            return n1sVar;
        }
        return new n1s(a2, n1sVar.b());
    }

    public p1s(x0s x0sVar, koq koqVar, b bVar) {
        this.b = x0sVar;
        this.f25820a = new d1s(x0sVar, koqVar);
        this.c = new rgt(x0sVar.g(), x0sVar.h());
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements pd9.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n1s f25821a;

        public a(p1s p1sVar, n1s n1sVar) {
            this.f25821a = n1sVar;
        }

        public void a(File file, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d259a2a", new Object[]{this, file, new Boolean(z)});
                return;
            }
            m4s.b("FileSender", Boolean.valueOf(z), file.getAbsolutePath());
            if (z) {
                l1s.c().a("STAGE_ANR_HAPPENED_SEND_SUCC", "TCrash", this.f25821a.b());
                kg9.f(file);
                return;
            }
            l1s.c().a("STAGE_ANR_HAPPENED_SEND_FAIL", "TCrash", this.f25821a.b());
            ehh.b("send failed", file.getAbsolutePath());
        }
    }
}
