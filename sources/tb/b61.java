package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class b61 implements ogb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<lgb> f16200a = new CopyOnWriteArrayList();

    static {
        t2o.a(729810215);
        t2o.a(729810227);
    }

    @Override // tb.ogb
    public void a(lgb lgbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("269e5b08", new Object[]{this, lgbVar});
        } else {
            ((CopyOnWriteArrayList) this.f16200a).add(lgbVar);
        }
    }

    @Override // tb.ogb
    public void b(lgb lgbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7ff0205", new Object[]{this, lgbVar});
        } else {
            ((CopyOnWriteArrayList) this.f16200a).remove(lgbVar);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            ((CopyOnWriteArrayList) this.f16200a).clear();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5fdfe29", new Object[]{this});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16200a).iterator();
        while (it.hasNext()) {
            ((lgb) it.next()).onAppToBackground();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f0623c", new Object[]{this});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16200a).iterator();
        while (it.hasNext()) {
            ((lgb) it.next()).onAppToFront();
        }
    }
}
