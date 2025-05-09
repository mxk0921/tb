package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class dk implements sbb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<sbb> f17876a = new ArrayList();
    public vn b;

    static {
        t2o.a(79691907);
        t2o.a(79691904);
        t2o.a(79691903);
    }

    @Override // tb.sbb
    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            e(str, (ag) null);
        }
    }

    @Override // tb.sbb
    public void e(String str, ag agVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf9df276", new Object[]{this, str, agVar});
            return;
        }
        g(str, agVar);
        Iterator it = ((ArrayList) this.f17876a).iterator();
        while (it.hasNext()) {
            try {
                ((sbb) it.next()).e(str, agVar);
            } catch (Exception e) {
                rbb g = ck.g();
                g.f("Debug类型日志调用报错:" + e.getMessage(), ck.b.b().l("AURALoggerV2").a());
            }
        }
    }

    @Override // tb.sbb
    public void f(String str, ag agVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d89f4415", new Object[]{this, str, agVar});
            return;
        }
        g(str, agVar);
        Iterator it = ((ArrayList) this.f17876a).iterator();
        while (it.hasNext()) {
            try {
                ((sbb) it.next()).f(str, agVar);
            } catch (Exception unused) {
            }
        }
    }

    public final void g(String str, ag agVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf002c68", new Object[]{this, str, agVar});
        } else if (((ArrayList) this.f17876a).isEmpty()) {
            if (this.b == null) {
                this.b = new vn();
            }
            this.b.f(str, agVar);
        }
    }

    public void h(sbb sbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9852990", new Object[]{this, sbbVar});
        } else if (sbbVar != null && !((ArrayList) this.f17876a).contains(sbbVar)) {
            Iterator it = ((ArrayList) this.f17876a).iterator();
            while (it.hasNext()) {
                if (sbbVar.getClass() == ((sbb) it.next()).getClass()) {
                    return;
                }
            }
            ((ArrayList) this.f17876a).add(sbbVar);
        }
    }

    @Override // tb.sbb
    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            f(str, ck.b.b().a());
        }
    }

    @Override // tb.sbb
    public void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{this, str, str2});
            return;
        }
        ck.b b = ck.b.b();
        f(str2, b.i("AURA/" + str).a());
    }
}
