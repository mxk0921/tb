package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class c61 implements pgb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<mgb> f16886a;

    static {
        t2o.a(486539718);
        t2o.a(488636463);
    }

    @Override // tb.pgb
    public void a(mgb mgbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9bf924f", new Object[]{this, mgbVar});
            return;
        }
        List<mgb> list = this.f16886a;
        if (list != null) {
            ((CopyOnWriteArrayList) list).remove(mgbVar);
        }
    }

    @Override // tb.pgb
    public void b(mgb mgbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5ddbd2c", new Object[]{this, mgbVar});
            return;
        }
        if (this.f16886a == null) {
            this.f16886a = new CopyOnWriteArrayList();
        }
        this.f16886a.add(mgbVar);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5fdfe29", new Object[]{this});
            return;
        }
        List<mgb> list = this.f16886a;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                ((mgb) it.next()).onAppToBackground();
            }
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f0623c", new Object[]{this});
            return;
        }
        List<mgb> list = this.f16886a;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                ((mgb) it.next()).onAppToFront();
            }
        }
    }
}
