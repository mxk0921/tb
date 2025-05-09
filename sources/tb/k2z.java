package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.foundation.components.async_image.AsyncImageDefinesKt;
import com.taobao.android.nanocompose.foundation.components.text.TextDefinesKt;
import com.taobao.android.nanocompose.foundation.condtion.ProviderKt;
import com.taobao.android.nanocompose.runtime.component_descriptor.ComponentDescriptorParameters;
import com.taobao.android.nanocompose.runtime.component_descriptor.InnerComponentProviderKt;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class k2z {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final lbz<i2z> f22370a = new lbz<>(128);
    public final ReentrantReadWriteLock b = new ReentrantReadWriteLock();

    static {
        t2o.a(598737246);
    }

    public k2z() {
        a(InnerComponentProviderKt.g());
        a(InnerComponentProviderKt.e());
        a(InnerComponentProviderKt.f());
        a(InnerComponentProviderKt.b());
        a(TextDefinesKt.a());
        a(InnerComponentProviderKt.a());
        a(AsyncImageDefinesKt.a());
        a(ProviderKt.b());
        a(ProviderKt.a());
    }

    public final i2z c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i2z) ipChange.ipc$dispatch("705320e", new Object[]{this, new Integer(i)});
        }
        ReentrantReadWriteLock.ReadLock readLock = this.b.readLock();
        readLock.lock();
        try {
            return this.f22370a.f(i);
        } finally {
            readLock.unlock();
        }
    }

    public final void a(j2z j2zVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1c9fc04", new Object[]{this, j2zVar});
            return;
        }
        ckf.g(j2zVar, "provider");
        ReentrantReadWriteLock reentrantReadWriteLock = this.b;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            ComponentDescriptorParameters b = j2zVar.b();
            if (!this.f22370a.e(b.a())) {
                this.f22370a.l(b.a(), j2zVar.a().invoke(b));
                return;
            }
            throw new RuntimeException("ComponentDescriptorRegistry: Attempt to register two component descriptors with the same component id");
        } finally {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    public final void b(List<j2z> list) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17a3a318", new Object[]{this, list});
            return;
        }
        ckf.g(list, "providers");
        ReentrantReadWriteLock reentrantReadWriteLock = this.b;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            int size = list.size() - 1;
            if (size >= 0) {
                int i3 = 0;
                while (true) {
                    int i4 = i3 + 1;
                    j2z j2zVar = list.get(i3);
                    ComponentDescriptorParameters b = j2zVar.b();
                    if (!this.f22370a.e(b.a())) {
                        this.f22370a.l(b.a(), j2zVar.a().invoke(b));
                        if (i4 > size) {
                            break;
                        }
                        i3 = i4;
                    } else {
                        throw new RuntimeException("ComponentDescriptorRegistry: Attempt to register two component descriptors with the same component id");
                    }
                }
            }
            xhv xhvVar = xhv.INSTANCE;
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        } catch (Throwable th) {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }
}
