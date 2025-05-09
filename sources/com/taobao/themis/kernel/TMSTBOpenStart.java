package com.taobao.themis.kernel;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMSTBOpenStart {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final ReentrantReadWriteLock lock;
    private static final ReentrantReadWriteLock.ReadLock readLock;
    private static volatile boolean sIsTBOpenStart = false;
    private static final ReentrantReadWriteLock.WriteLock writeLock;

    static {
        t2o.a(839909409);
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        lock = reentrantReadWriteLock;
        writeLock = reentrantReadWriteLock.writeLock();
        readLock = reentrantReadWriteLock.readLock();
    }

    public static boolean getIsTBOpenStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1af9fdd5", new Object[0])).booleanValue();
        }
        ReentrantReadWriteLock.ReadLock readLock2 = readLock;
        readLock2.lock();
        try {
            boolean z = sIsTBOpenStart;
            readLock2.unlock();
            return z;
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
    }

    public static void setIsTBOpenStart(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db71f12f", new Object[]{new Boolean(z)});
            return;
        }
        ReentrantReadWriteLock.WriteLock writeLock2 = writeLock;
        writeLock2.lock();
        try {
            sIsTBOpenStart = z;
            writeLock2.unlock();
        } catch (Throwable th) {
            writeLock.unlock();
            throw th;
        }
    }
}
