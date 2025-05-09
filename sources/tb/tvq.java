package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class tvq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<a> f28991a = new CopyOnWriteArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
        void a(int i, String str, String str2, String str3, String str4);

        void b(int i, String str, String str2, String str3, String str4);
    }

    static {
        t2o.a(628097066);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a55d0f9b", new Object[]{this, aVar});
        } else {
            ((CopyOnWriteArrayList) this.f28991a).add(aVar);
        }
    }

    public void b(int i, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce30ce7a", new Object[]{this, new Integer(i), str, str2, str3, str4});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f28991a).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(i, str, str2, str3, str4);
        }
    }

    public void c(int i, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb35873", new Object[]{this, new Integer(i), str, str2, str3, str4});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f28991a).iterator();
        while (it.hasNext()) {
            ((a) it.next()).b(i, str, str2, str3, str4);
        }
    }
}
