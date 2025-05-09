package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class j5j implements hwc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public hwc f21772a;
    public final Lock b;
    public final Lock c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final j5j f21773a = new j5j();

        public static /* synthetic */ j5j a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (j5j) ipChange.ipc$dispatch("c438ca84", new Object[0]);
            }
            return f21773a;
        }
    }

    public static j5j a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j5j) ipChange.ipc$dispatch("43e61669", new Object[0]);
        }
        return b.a();
    }

    @Override // tb.hwc
    public void b(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27fb3a9b", new Object[]{this, str, map});
            return;
        }
        this.b.lock();
        try {
            hwc hwcVar = this.f21772a;
            if (hwcVar != null) {
                hwcVar.b(str, map);
            }
        } finally {
            this.b.unlock();
        }
    }

    public void c(hwc hwcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fc8f2c0", new Object[]{this, hwcVar});
            return;
        }
        this.c.lock();
        try {
            if (this.f21772a == null) {
                this.f21772a = hwcVar;
            }
        } finally {
            this.c.unlock();
        }
    }

    public j5j() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.b = reentrantReadWriteLock.readLock();
        this.c = reentrantReadWriteLock.writeLock();
    }
}
