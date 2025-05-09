package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class mar implements ksb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final s65 f23894a;
    public a b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        void a(String str);

        void b(String str);

        void c(String str);

        void d(String str);

        void e(long j, long j2, long j3, Object obj, String str);

        void f(String str);

        void g(String str);

        void onError(int i, int i2, String str);

        void onPause(String str);

        void onStart(String str);
    }

    static {
        t2o.a(451936289);
        t2o.a(452985002);
    }

    public mar(Context context) {
        s65 s65Var = new s65(context);
        this.f23894a = s65Var;
        s65Var.i(this);
    }

    public long a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6365f098", new Object[]{this, str})).longValue();
        }
        s65 s65Var = this.f23894a;
        if (s65Var != null) {
            return s65Var.a(str);
        }
        return -1L;
    }

    public long b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e59f820f", new Object[]{this, str})).longValue();
        }
        s65 s65Var = this.f23894a;
        if (s65Var != null) {
            return s65Var.b(str);
        }
        return -1L;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5cd676c", new Object[]{this, str});
            return;
        }
        a aVar = this.b;
        if (aVar != null) {
            aVar.d(str);
        }
    }

    public void d(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("724a699a", new Object[]{this, new Integer(i), new Integer(i2), str});
            return;
        }
        a aVar = this.b;
        if (aVar != null) {
            aVar.onError(i, i2, str);
        }
    }

    public void e(long j, long j2, long j3, Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49df7f36", new Object[]{this, new Long(j), new Long(j2), new Long(j3), obj, str});
            return;
        }
        a aVar = this.b;
        if (aVar != null) {
            aVar.e(j, j2, j3, obj, str);
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a12b8ab0", new Object[]{this, str});
            return;
        }
        a aVar = this.b;
        if (aVar != null) {
            aVar.g(str);
        }
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb560aa8", new Object[]{this, str});
            return;
        }
        a aVar = this.b;
        if (aVar != null) {
            aVar.onPause(str);
        }
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd41f1d1", new Object[]{this, str});
            return;
        }
        a aVar = this.b;
        if (aVar != null) {
            aVar.c(str);
        }
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a1d9ccd", new Object[]{this, str});
            return;
        }
        a aVar = this.b;
        if (aVar != null) {
            aVar.f(str);
        }
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7775d5e1", new Object[]{this, str});
            return;
        }
        a aVar = this.b;
        if (aVar != null) {
            aVar.b(str);
        }
    }

    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44d765fc", new Object[]{this, str});
            return;
        }
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(str);
        }
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938ad014", new Object[]{this, str});
            return;
        }
        a aVar = this.b;
        if (aVar != null) {
            aVar.onStart(str);
        }
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8202e407", new Object[]{this, str});
            return;
        }
        s65 s65Var = this.f23894a;
        if (s65Var != null) {
            s65Var.d(str);
        }
    }

    public void n(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe686", new Object[]{this, str});
            return;
        }
        s65 s65Var = this.f23894a;
        if (s65Var != null) {
            s65Var.e(str);
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        s65 s65Var = this.f23894a;
        if (s65Var != null) {
            s65Var.f();
        }
    }

    public void p(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d3fade0", new Object[]{this, str, new Long(j)});
            return;
        }
        s65 s65Var = this.f23894a;
        if (s65Var != null) {
            s65Var.g(str, j);
        }
    }

    public void q(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae6f6ac4", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    public String r(String str, String str2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dfe2f75e", new Object[]{this, str, str2});
        }
        s65 s65Var = this.f23894a;
        if (s65Var != null) {
            return s65Var.h(str, str2);
        }
        return "";
    }

    public void s(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2046497d", new Object[]{this, str, new Boolean(z)});
            return;
        }
        s65 s65Var = this.f23894a;
        if (s65Var != null) {
            s65Var.j(str, z);
        }
    }

    public void t(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7481ba1a", new Object[]{this, str, new Boolean(z)});
            return;
        }
        s65 s65Var = this.f23894a;
        if (s65Var != null) {
            s65Var.k(str, z);
        }
    }

    public void u(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b7aa86", new Object[]{this, new Boolean(z)});
            return;
        }
        s65 s65Var = this.f23894a;
        if (s65Var != null) {
            s65Var.l(z);
        }
    }

    public void v(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bccbee5", new Object[]{this, str, new Long(j)});
            return;
        }
        s65 s65Var = this.f23894a;
        if (s65Var != null) {
            s65Var.m(str, j);
        }
    }

    public void w(String str, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27e97c6d", new Object[]{this, str, new Float(f), new Float(f2)});
            return;
        }
        s65 s65Var = this.f23894a;
        if (s65Var != null) {
            s65Var.n(str, f, f2);
        }
    }

    public void x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a37a973", new Object[]{this, str});
            return;
        }
        s65 s65Var = this.f23894a;
        if (s65Var != null) {
            s65Var.o(str);
        }
    }

    public void y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbe7513", new Object[]{this, str});
            return;
        }
        s65 s65Var = this.f23894a;
        if (s65Var != null) {
            s65Var.p(str);
        }
    }
}
