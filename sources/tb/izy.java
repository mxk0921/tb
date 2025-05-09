package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.resource_loader.template.TemplateItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class izy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantReadWriteLock f21671a = new ReentrantReadWriteLock();
    public final List<l5z> b = new ArrayList();
    public final List<l5z> c = new ArrayList();

    static {
        t2o.a(598737181);
    }

    public final List<TemplateItem> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("47b4e56e", new Object[]{this});
        }
        ReentrantReadWriteLock.ReadLock readLock = this.f21671a.readLock();
        ckf.f(readLock, "mutex.readLock()");
        readLock.lock();
        try {
            List<l5z> list = this.c;
            ArrayList arrayList = new ArrayList(zz3.q(list, 10));
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                arrayList.add(((l5z) it.next()).c());
            }
            return arrayList;
        } finally {
            readLock.unlock();
        }
    }

    public final List<l5z> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a69374d7", new Object[]{this});
        }
        ReentrantReadWriteLock.ReadLock readLock = this.f21671a.readLock();
        ckf.f(readLock, "mutex.readLock()");
        readLock.lock();
        try {
            return i04.B0(this.b);
        } finally {
            readLock.unlock();
        }
    }
}
