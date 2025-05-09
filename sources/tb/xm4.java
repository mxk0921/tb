package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.iqb;
import tb.jm4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xm4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<iqb.a> f31468a;

    static {
        t2o.a(486539609);
    }

    public void a(iqb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8c63cf3", new Object[]{this, aVar});
            return;
        }
        if (this.f31468a == null) {
            this.f31468a = new CopyOnWriteArrayList();
        }
        this.f31468a.add(aVar);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        List<iqb.a> list = this.f31468a;
        if (list != null) {
            list.clear();
            this.f31468a = null;
        }
    }

    public void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f15d4294", new Object[]{this, context});
            return;
        }
        List<iqb.a> list = this.f31468a;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                ((iqb.a) it.next()).b(context);
            }
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb3cb3e6", new Object[]{this});
            return;
        }
        List<iqb.a> list = this.f31468a;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                iqb.a aVar = (iqb.a) it.next();
                eve.c("notifyCreateContainerEnd", aVar.getClass().getName());
                aVar.c();
                eve.b("notifyCreateContainerEnd", aVar.getClass().getName());
            }
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("209c9a5a", new Object[]{this});
            return;
        }
        List<iqb.a> list = this.f31468a;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                iqb.a aVar = (iqb.a) it.next();
                eve.c("notifyCreateContainerEnd", aVar.getClass().getName());
                if (aVar instanceof jm4.a) {
                    aVar.a();
                } else {
                    aVar.c();
                }
                eve.b("notifyCreateContainerEnd", aVar.getClass().getName());
            }
        }
    }

    public void f(iqb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb950956", new Object[]{this, aVar});
            return;
        }
        List<iqb.a> list = this.f31468a;
        if (list != null) {
            list.remove(aVar);
        }
    }
}
