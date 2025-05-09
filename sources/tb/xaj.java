package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xaj implements vwc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<uwc> f31248a = new CopyOnWriteArrayList();

    static {
        t2o.a(729810216);
        t2o.a(729810228);
    }

    @Override // tb.vwc
    public void a(uwc uwcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65f02b0c", new Object[]{this, uwcVar});
        } else {
            ((CopyOnWriteArrayList) this.f31248a).remove(uwcVar);
        }
    }

    @Override // tb.vwc
    public void b(uwc uwcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfca694f", new Object[]{this, uwcVar});
        } else {
            ((CopyOnWriteArrayList) this.f31248a).add(uwcVar);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            ((CopyOnWriteArrayList) this.f31248a).clear();
        }
    }

    public void d(String str, kkc kkcVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6124a9c8", new Object[]{this, str, kkcVar, new Integer(i)});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f31248a).iterator();
        while (it.hasNext()) {
            ((uwc) it.next()).selectMultiTab(str, kkcVar, i);
        }
    }
}
