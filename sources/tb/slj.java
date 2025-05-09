package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class slj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<py> f28132a;

    static {
        t2o.a(729809466);
    }

    public slj(fnn fnnVar) {
        z4a containerType = fnnVar.getContainerType();
        ArrayList arrayList = new ArrayList();
        this.f28132a = arrayList;
        String str = containerType.c;
        String str2 = containerType.f32522a;
        arrayList.add(new ynf(str, str2));
        arrayList.add(new pof(containerType.c, str2));
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13be05ba", new Object[]{this, new Integer(i)});
            return;
        }
        Iterator it = ((ArrayList) this.f28132a).iterator();
        while (it.hasNext()) {
            py pyVar = (py) it.next();
            if (i == 0) {
                pyVar.c();
            } else {
                pyVar.n();
            }
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            a(4);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24224e7e", new Object[]{this});
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            a(0);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24c202c9", new Object[]{this});
        } else {
            a(0);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baeb4328", new Object[]{this});
        } else {
            a(4);
        }
    }
}
