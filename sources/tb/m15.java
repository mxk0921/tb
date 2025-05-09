package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.trace.d;
import com.taobao.monitor.impl.trace.j;
import com.taobao.monitor.procedure.IPage;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class m15 implements IPage.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cll f23710a;
    public final d b;
    public boolean c = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            jn1 a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            IPage.a n = m15.b(m15.this).n();
            if (n != null && (a2 = n.a(m15.b(m15.this))) != null && a2.a() > 0.7f) {
                zzb<?> a3 = ic.a(ic.PAGE_RENDER_DISPATCHER);
                if (a3 instanceof j) {
                    ((j) a3).e(m15.b(m15.this), a2.b());
                }
            }
        }
    }

    public m15(cll cllVar) {
        this.f23710a = cllVar;
        zzb<?> a2 = ic.a(ic.CUSTOM_PAGE_LIFECYCLE_DISPATCHER);
        if (a2 instanceof d) {
            this.b = (d) a2;
        }
    }

    public static /* synthetic */ cll b(m15 m15Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cll) ipChange.ipc$dispatch("e670367", new Object[]{m15Var});
        }
        return m15Var.f23710a;
    }

    @Override // com.taobao.monitor.procedure.IPage.d
    public void a(String str, String str2, Map<String, Object> map) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b560120", new Object[]{this, str, str2, map});
            return;
        }
        nca.s.b(this.f23710a.o());
        if (!yq7.c(this.b)) {
            this.f23710a.a0(str);
            this.f23710a.d0(str2);
            if (this.f23710a.v() > 0) {
                j = this.f23710a.v();
            } else {
                j = out.a();
            }
            this.f23710a.Z(j);
            this.b.f(this.f23710a, map, j);
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e634ca04", new Object[]{this});
        } else {
            w9a.g().f().post(new a());
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("687ed20f", new Object[]{this});
        } else {
            c();
        }
    }

    @Override // com.taobao.monitor.procedure.IPage.d
    public void onPageDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ceb4d93", new Object[]{this});
        } else if (!yq7.c(this.b)) {
            this.b.g(this.f23710a, out.a());
        }
    }

    @Override // com.taobao.monitor.procedure.IPage.d
    public void onPageDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6518a43c", new Object[]{this});
            return;
        }
        if (!yq7.c(this.b)) {
            this.b.h(this.f23710a, out.a());
        }
        hy9.a().f(this.f23710a);
        if (o48.s) {
            c();
        }
    }

    @Override // com.taobao.monitor.procedure.IPage.d
    public void onPageAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1800bf4a", new Object[]{this});
            return;
        }
        if (this.c) {
            this.f23710a.d().onStage("pageStructureTime", out.a());
        }
        if (this.c) {
            new jj9(this.f23710a).e();
        }
        if (!yq7.c(this.b)) {
            this.b.e(this.f23710a, out.a());
        }
        hy9.a().c(this.f23710a);
        this.c = false;
    }
}
