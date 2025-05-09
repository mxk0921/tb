package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.utils.PopConst;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class o0z {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final o0z INSTANCE = new o0z();

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, ReentrantReadWriteLock> f25071a = new ConcurrentHashMap<>();

    static {
        t2o.a(598737174);
    }

    public final ReentrantReadWriteLock a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReentrantReadWriteLock) ipChange.ipc$dispatch("413f603d", new Object[]{this, str});
        }
        ckf.g(str, PopConst.BRIDGE_KEY_BUSINESS_ID);
        ConcurrentHashMap<String, ReentrantReadWriteLock> concurrentHashMap = f25071a;
        ReentrantReadWriteLock reentrantReadWriteLock = concurrentHashMap.get(str);
        if (reentrantReadWriteLock != null) {
            return reentrantReadWriteLock;
        }
        ReentrantReadWriteLock reentrantReadWriteLock2 = new ReentrantReadWriteLock();
        concurrentHashMap.put(str, reentrantReadWriteLock2);
        return reentrantReadWriteLock2;
    }
}
