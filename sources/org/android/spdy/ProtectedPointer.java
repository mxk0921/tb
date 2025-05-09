package org.android.spdy;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ProtectedPointer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long CLOSED = 3;
    private static final long INIT = 1;
    private static final long WAIT_CLOSE = 2;
    private Object data2protected;
    public a how2close;
    private AtomicLong referAndstatus = new AtomicLong(1);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface a {
        void close(Object obj);
    }

    public ProtectedPointer(Object obj) {
        this.data2protected = obj;
    }

    public void exit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81677ea5", new Object[]{this});
            return;
        }
        this.referAndstatus.addAndGet(-16L);
        if (this.referAndstatus.compareAndSet(2L, 3L)) {
            a aVar = this.how2close;
            if (aVar != null) {
                aVar.close(this.data2protected);
            }
            this.data2protected = null;
        }
    }

    public Object getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4ca84d6b", new Object[]{this});
        }
        return this.data2protected;
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        this.referAndstatus.incrementAndGet();
        if (this.referAndstatus.compareAndSet(2L, 3L)) {
            a aVar = this.how2close;
            if (aVar != null) {
                aVar.close(this.data2protected);
            }
            this.data2protected = null;
        }
    }

    public void setHow2close(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0e542bf", new Object[]{this, aVar});
        } else {
            this.how2close = aVar;
        }
    }

    public boolean enter() {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ccc95f63", new Object[]{this})).booleanValue();
        }
        do {
            j = this.referAndstatus.get();
            if (j == 3) {
                return false;
            }
        } while (!this.referAndstatus.compareAndSet(j, 16 + j));
        return true;
    }
}
