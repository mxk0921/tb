package tb;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlinx.coroutines.internal.ExceptionsConstructorKt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class pyw extends wy4 {
    public static final pyw INSTANCE = new pyw();

    /* renamed from: a  reason: collision with root package name */
    public static final ReentrantReadWriteLock f26405a = new ReentrantReadWriteLock();
    public static final WeakHashMap<Class<? extends Throwable>, g1a<Throwable, Throwable>> b = new WeakHashMap<>();

    @Override // tb.wy4
    public g1a<Throwable, Throwable> a(Class<? extends Throwable> cls) {
        int i;
        g1a<Throwable, Throwable> b2;
        ReentrantReadWriteLock reentrantReadWriteLock = f26405a;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        WeakHashMap<Class<? extends Throwable>, g1a<Throwable, Throwable>> weakHashMap = b;
        try {
            g1a<Throwable, Throwable> g1aVar = weakHashMap.get(cls);
            if (g1aVar != null) {
                return g1aVar;
            }
            ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
            int i2 = 0;
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                i = reentrantReadWriteLock.getReadHoldCount();
            } else {
                i = 0;
            }
            for (int i3 = 0; i3 < i; i3++) {
                readLock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                g1a<Throwable, Throwable> g1aVar2 = weakHashMap.get(cls);
                if (g1aVar2 != null) {
                    return g1aVar2;
                }
                b2 = ExceptionsConstructorKt.b(cls);
                weakHashMap.put(cls, b2);
                while (i2 < i) {
                    readLock2.lock();
                    i2++;
                }
                writeLock.unlock();
                return b2;
            } finally {
                while (i2 < i) {
                    readLock2.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        } finally {
            readLock.unlock();
        }
    }
}
