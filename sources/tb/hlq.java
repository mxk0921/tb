package tb;

import com.alibaba.android.ultron.common.page.b;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class hlq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_ERROR_DISMISS = 2;
    public static final int TYPE_QUERY_PULL_REFRESH = 2;
    public static final int TYPE_QUERY_REQUEST = 1;

    /* renamed from: a  reason: collision with root package name */
    public final b f20732a;
    public q6h b;
    public pi8 c;

    static {
        t2o.a(153092111);
    }

    public hlq(b bVar) {
        this.f20732a = bVar;
        b();
    }

    public void a(int i) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f678b4a", new Object[]{this, new Integer(i)});
            return;
        }
        q6h q6hVar = this.b;
        if (q6hVar != null && (bVar = this.f20732a) != null) {
            q6hVar.a(bVar, bVar.e(), i);
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
        } else {
            this.b = new q6h();
        }
    }

    public void c(w6v w6vVar) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56be55d4", new Object[]{this, w6vVar});
            return;
        }
        pi8 pi8Var = this.c;
        if (pi8Var != null && (bVar = this.f20732a) != null) {
            pi8Var.a(bVar, bVar.e(), 1, w6vVar);
        }
    }

    public void d(w6v w6vVar) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37675f39", new Object[]{this, w6vVar});
            return;
        }
        pi8 pi8Var = this.c;
        if (pi8Var != null && (bVar = this.f20732a) != null) {
            pi8Var.a(bVar, bVar.e(), 2, w6vVar);
        }
    }

    public void e(pi8 pi8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba857e39", new Object[]{this, pi8Var});
        } else {
            this.c = pi8Var;
        }
    }

    public void f(int i) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fed99f3d", new Object[]{this, new Integer(i)});
            return;
        }
        q6h q6hVar = this.b;
        if (q6hVar != null && (bVar = this.f20732a) != null) {
            q6hVar.b(bVar, bVar.e(), i);
        }
    }
}
