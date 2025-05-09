package tb;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class rfl implements p4d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<q4d> f27343a = new CopyOnWriteArrayList();

    static {
        t2o.a(729810217);
        t2o.a(729810229);
    }

    @Override // tb.p4d
    public void a(q4d q4dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccc4d184", new Object[]{this, q4dVar});
        } else {
            ((CopyOnWriteArrayList) this.f27343a).remove(q4dVar);
        }
    }

    @Override // tb.p4d
    public void b(q4d q4dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d762dd87", new Object[]{this, q4dVar});
        } else {
            ((CopyOnWriteArrayList) this.f27343a).add(q4dVar);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            ((CopyOnWriteArrayList) this.f27343a).clear();
        }
    }

    public void d(String str, Intent intent, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fba38277", new Object[]{this, str, intent, str2});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f27343a).iterator();
        while (it.hasNext()) {
            ((q4d) it.next()).onOutLink(str, intent, str2);
        }
    }
}
