package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class pj8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<b> f26122a = new CopyOnWriteArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {
        public static final pj8 INSTANCE = new pj8();

        static {
            t2o.a(944767222);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void x0(String str, jxk jxkVar);
    }

    static {
        t2o.a(944767221);
    }

    public static pj8 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pj8) ipChange.ipc$dispatch("f026d663", new Object[0]);
        }
        return a.INSTANCE;
    }

    public synchronized void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ddd39fa", new Object[]{this, bVar});
            return;
        }
        if (!((CopyOnWriteArrayList) this.f26122a).contains(bVar)) {
            ((CopyOnWriteArrayList) this.f26122a).add(bVar);
        }
    }

    public synchronized void c(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efdd7af7", new Object[]{this, bVar});
        } else {
            ((CopyOnWriteArrayList) this.f26122a).remove(bVar);
        }
    }

    public synchronized void d(String str, jxk jxkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("979203fa", new Object[]{this, str, jxkVar});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f26122a).iterator();
        while (it.hasNext()) {
            ((b) it.next()).x0(str, jxkVar);
        }
    }
}
