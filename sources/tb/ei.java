package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ei {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<ci, AtomicInteger> f18589a = new HashMap();
    public final ReentrantReadWriteLock b = new ReentrantReadWriteLock(true);

    static {
        t2o.a(79691860);
    }

    public void a(ci ciVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4d8d5fa", new Object[]{this, ciVar});
        } else if (ciVar == null) {
            ck.g().e("AURADynamicFeatureInstallerQueue.add:bundleInfo is null");
        } else {
            try {
                this.b.writeLock().lock();
                for (ci ciVar2 : ((HashMap) this.f18589a).keySet()) {
                    if (ciVar2 != null && ci.a(ciVar2, ciVar)) {
                        return;
                    }
                }
                ((HashMap) this.f18589a).put(ciVar, new AtomicInteger(2));
            } finally {
                this.b.writeLock().unlock();
            }
        }
    }

    public int b(ci ciVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("da6da226", new Object[]{this, ciVar})).intValue();
        }
        if (ciVar == null) {
            ck.g().e("AURADynamicFeatureInstallerQueue.queryStatus:bundleInfo is null");
            return 0;
        }
        try {
            this.b.readLock().lock();
            for (Map.Entry entry : ((HashMap) this.f18589a).entrySet()) {
                if (!(entry == null || entry.getKey() == null || !ci.a((ci) entry.getKey(), ciVar))) {
                    AtomicInteger atomicInteger = (AtomicInteger) entry.getValue();
                    if (atomicInteger != null) {
                        i = atomicInteger.get();
                    }
                    return i;
                }
            }
            return 0;
        } finally {
            this.b.readLock().unlock();
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39af3815", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            ck.g().e("AURADynamicFeatureInstallerQueue.remove:artifactId is null");
        } else {
            try {
                this.b.writeLock().lock();
                for (ci ciVar : ((HashMap) this.f18589a).keySet()) {
                    if (ciVar != null && TextUtils.equals(ciVar.f17067a, str)) {
                        ((HashMap) this.f18589a).remove(ciVar);
                        return;
                    }
                }
            } finally {
                this.b.writeLock().unlock();
            }
        }
    }

    public void d(ci ciVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("806397dd", new Object[]{this, ciVar});
        } else if (ciVar == null) {
            ck.g().e("AURADynamicFeatureInstallerQueue.remove:bundleInfo is null");
        } else {
            try {
                this.b.writeLock().lock();
                for (ci ciVar2 : ((HashMap) this.f18589a).keySet()) {
                    if (ciVar2 != null && ci.a(ciVar2, ciVar)) {
                        ((HashMap) this.f18589a).remove(ciVar2);
                        return;
                    }
                }
            } finally {
                this.b.writeLock().unlock();
            }
        }
    }

    public void e(ci ciVar, int i) {
        AtomicInteger atomicInteger;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85cd0e0f", new Object[]{this, ciVar, new Integer(i)});
        } else if (ciVar == null) {
            ck.g().e("AURADynamicFeatureInstallerQueue.updateStatus:bundleInfo is null");
        } else if (i == 2 || i == 3 || i == 4) {
            try {
                this.b.writeLock().lock();
                for (Map.Entry entry : ((HashMap) this.f18589a).entrySet()) {
                    if (!(entry == null || entry.getKey() == null || !ci.a((ci) entry.getKey(), ciVar))) {
                        if (entry.getValue() == null) {
                            atomicInteger = new AtomicInteger();
                        } else {
                            atomicInteger = (AtomicInteger) entry.getValue();
                        }
                        atomicInteger.set(i);
                        this.b.writeLock().unlock();
                        return;
                    }
                }
                this.b.writeLock().unlock();
            } catch (Throwable th) {
                this.b.writeLock().unlock();
                throw th;
            }
        } else {
            ck.g().e("AURADynamicFeatureInstallerQueue.updateStatus:not right status");
        }
    }
}
