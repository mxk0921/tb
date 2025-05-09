package tb;

import android.text.TextUtils;
import com.alipay.mobile.common.logging.util.avail.ExceptionData;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.n1s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class xz0 implements aqk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final b f31732a;
    public final x0s b;
    public final koq c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        void action();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final File f31733a;

        public c(File file) {
            this.f31733a = file;
        }

        public final String a(File file, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("cd5a2b76", new Object[]{this, file, str});
            }
            v0s v0sVar = new v0s();
            v0sVar.d(xz0.a(xz0.this), str, "anr").b("traces starts.\n").e(file).b("traces end.\n").h().l();
            return v0sVar.toString();
        }

        @Override // tb.xz0.a
        public void action() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e4ef7bd", new Object[]{this});
                return;
            }
            String a2 = n1s.a.a(xz0.a(xz0.this), "anr", "scan");
            File file = new File(new rgt(xz0.a(xz0.this).g(), xz0.a(xz0.this).h()).e(), a2);
            kg9.g(file, a(this.f31733a, a2));
            xz0.b(xz0.this, file);
        }
    }

    public xz0(x0s x0sVar, koq koqVar, b bVar) {
        this.b = x0sVar;
        this.c = koqVar;
        this.f31732a = bVar;
    }

    public static /* synthetic */ x0s a(xz0 xz0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x0s) ipChange.ipc$dispatch("46e1b0e", new Object[]{xz0Var});
        }
        return xz0Var.b;
    }

    public static /* synthetic */ void b(xz0 xz0Var, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcc39eb9", new Object[]{xz0Var, file});
        } else {
            xz0Var.d(file);
        }
    }

    public static /* synthetic */ koq c(xz0 xz0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (koq) ipChange.ipc$dispatch("307188e", new Object[]{xz0Var});
        }
        return xz0Var.c;
    }

    public final void d(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71d4391", new Object[]{this, file});
            return;
        }
        b bVar = this.f31732a;
        if (bVar != null) {
            ((q0s) bVar).a(file, true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final File f31734a;

        public d(File file) {
            this.f31734a = file;
        }

        public static /* synthetic */ void a(d dVar, boolean z, String str) {
            dVar.b(z, str);
        }

        @Override // tb.xz0.a
        public void action() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e4ef7bd", new Object[]{this});
            } else {
                ea7.b(xz0.a(xz0.this), xz0.c(xz0.this)).f(new yz0(this));
            }
        }

        public final /* synthetic */ void b(boolean z, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b94f3358", new Object[]{this, new Boolean(z), str});
                return;
            }
            l1s.c().a("AnrCompletedAction", ExceptionData.TYPE_ANR, str);
            if (z) {
                m4s.b("AnrCompletedAction", "my process anr", str);
                db.a(this.f31734a, str);
                xz0.b(xz0.this, this.f31734a);
            } else {
                m4s.b("AnrCompletedAction", "other process anr", str);
                kg9.c(this.f31734a);
            }
            bgg.b(xz0.a(xz0.this)).a();
        }
    }

    @Override // tb.aqk
    public void onCompleted(String str) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d93484bd", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            ehh.b("AnrCompletedAction", "path is null");
        } else {
            File file = new File(str);
            b bVar = this.f31732a;
            if (bVar != null) {
                ((q0s) bVar).a(file, false);
            }
            if (str.endsWith("traces.txt")) {
                aVar = new c(file);
            } else {
                aVar = new d(file);
            }
            aVar.action();
        }
    }
}
