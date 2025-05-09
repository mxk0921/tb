package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import tb.bkn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class etm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Deque<atm> f18808a = new ArrayDeque();
    public a b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
    }

    static {
        t2o.a(912262206);
    }

    public synchronized boolean a() {
        boolean z = false;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("80e44576", new Object[]{this})).booleanValue();
            }
            if (((ArrayDeque) this.f18808a).size() >= 2) {
                z = true;
            }
            return z;
        }
    }

    public synchronized boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("401ab552", new Object[]{this, str})).booleanValue();
        }
        Iterator it = ((ArrayDeque) this.f18808a).iterator();
        while (it.hasNext()) {
            if (((atm) it.next()).b(str)) {
                return true;
            }
        }
        return false;
    }

    public void e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c02c5b95", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    public synchronized void b(atm atmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6ac2f76", new Object[]{this, atmVar});
        } else if (atmVar != null) {
            if (((ArrayDeque) this.f18808a).size() < 2) {
                tgh.b("PreloadTaskExecutor", "进入执行任务队列");
                ((ArrayDeque) this.f18808a).add(atmVar);
                atmVar.a();
            }
        }
    }

    public synchronized void c(atm atmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3362c9f3", new Object[]{this, atmVar});
        } else if (!((ArrayDeque) this.f18808a).remove(atmVar)) {
            tgh.b("PreloadTaskExecutor", "任务删除出错");
        } else {
            while (((ArrayDeque) this.f18808a).size() < 2) {
                a aVar = this.b;
                if (aVar != null) {
                    atm a2 = ((bkn.a) aVar).a();
                    if (a2 == null) {
                        tgh.b("PreloadTaskExecutor", "准备队列中没有可执行的任务");
                        return;
                    }
                    tgh.b("PreloadTaskExecutor", "从准备队列中获取任务并执行");
                    ((ArrayDeque) this.f18808a).add(a2);
                    a2.a();
                } else {
                    return;
                }
            }
        }
    }
}
