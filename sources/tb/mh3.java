package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class mh3<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<sdd> f24038a = new ArrayList();

    static {
        t2o.a(479199263);
    }

    public void a(sdd<? extends T> sddVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f98d9a", new Object[]{this, sddVar});
        } else {
            ((ArrayList) this.f24038a).add(sddVar);
        }
    }

    public boolean b(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a9e11d6", new Object[]{this, t})).booleanValue();
        }
        Iterator it = ((ArrayList) this.f24038a).iterator();
        while (it.hasNext()) {
            if (((sdd) it.next()).a(t)) {
                return true;
            }
        }
        return false;
    }
}
