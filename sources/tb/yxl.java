package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class yxl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<g8d> f32408a;

    static {
        t2o.a(491782537);
    }

    public yxl(cfc cfcVar) {
        ArrayList arrayList = new ArrayList();
        this.f32408a = arrayList;
        arrayList.add(new e69(cfcVar));
        arrayList.add(new b69(cfcVar));
        arrayList.add(new yn4(cfcVar));
        arrayList.add(new o0o(cfcVar));
        if (!zn4.a(cfcVar.getContainerType().getContainerId())) {
            arrayList.add(new n7p(cfcVar));
        }
        if (vxl.b().q()) {
            arrayList.add(new k7n(cfcVar));
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15fa750a", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.f32408a).iterator();
        while (it.hasNext()) {
            ((g8d) it.next()).a();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b331456a", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.f32408a).iterator();
        while (it.hasNext()) {
            ((g8d) it.next()).stopTrace();
        }
    }
}
