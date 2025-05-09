package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ljn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ljn INSTANCE = new ljn();

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, ReentrantReadWriteLock> f23369a = new LinkedHashMap();

    static {
        t2o.a(106954776);
    }

    public final ReentrantReadWriteLock.ReadLock a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReentrantReadWriteLock.ReadLock) ipChange.ipc$dispatch("b2ff19fe", new Object[]{this, str});
        }
        ckf.g(str, "filePath");
        ReentrantReadWriteLock.ReadLock readLock = b(str).readLock();
        ckf.f(readLock, "getReadWriteLock(filePath).readLock()");
        return readLock;
    }

    public final ReentrantReadWriteLock b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReentrantReadWriteLock) ipChange.ipc$dispatch("99e3929a", new Object[]{this, str});
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) f23369a;
        Object obj = linkedHashMap.get(str);
        if (obj == null) {
            obj = new ReentrantReadWriteLock();
            linkedHashMap.put(str, obj);
        }
        return (ReentrantReadWriteLock) obj;
    }

    public final ReentrantReadWriteLock.WriteLock c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReentrantReadWriteLock.WriteLock) ipChange.ipc$dispatch("58ee972a", new Object[]{this, str});
        }
        ckf.g(str, "filePath");
        ReentrantReadWriteLock.WriteLock writeLock = b(str).writeLock();
        ckf.f(writeLock, "getReadWriteLock(filePath).writeLock()");
        return writeLock;
    }

    public final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("793d36e3", new Object[]{this, str});
            return;
        }
        ckf.g(str, "filePath");
        Map<String, ReentrantReadWriteLock> map = f23369a;
        ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) ((LinkedHashMap) map).get(str);
        if (reentrantReadWriteLock != null && !reentrantReadWriteLock.isWriteLocked() && reentrantReadWriteLock.getReadLockCount() == 0) {
            map.remove(str);
        }
    }
}
