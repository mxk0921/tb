package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class l1m implements r8d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<r8d> f23056a;
    public final Lock b;
    public final Lock c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final l1m f23057a = new l1m();

        public static /* synthetic */ l1m a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (l1m) ipChange.ipc$dispatch("844b9a0a", new Object[0]);
            }
            return f23057a;
        }
    }

    public static l1m b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l1m) ipChange.ipc$dispatch("fa47cac5", new Object[0]);
        }
        return b.a();
    }

    public void a(r8d r8dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9d776bd", new Object[]{this, r8dVar});
            return;
        }
        this.c.lock();
        if (r8dVar != null) {
            try {
                if (!((ArrayList) this.f23056a).contains(r8dVar)) {
                    ((ArrayList) this.f23056a).add(r8dVar);
                }
            } finally {
                this.c.unlock();
            }
        }
    }

    public void c(r8d r8dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("372fecfa", new Object[]{this, r8dVar});
            return;
        }
        this.c.lock();
        try {
            ((ArrayList) this.f23056a).remove(r8dVar);
        } finally {
            this.c.unlock();
        }
    }

    @Override // tb.r8d
    public void onCancel(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74e88eb1", new Object[]{this, str, str2, map});
            return;
        }
        this.b.lock();
        try {
            Iterator it = ((ArrayList) this.f23056a).iterator();
            while (it.hasNext()) {
                ((r8d) it.next()).onCancel(str, str2, map);
            }
        } finally {
            this.b.unlock();
        }
    }

    @Override // tb.r8d
    public void onError(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b0e3681", new Object[]{this, str, str2, map});
            return;
        }
        this.b.lock();
        try {
            Iterator it = ((ArrayList) this.f23056a).iterator();
            while (it.hasNext()) {
                ((r8d) it.next()).onError(str, str2, map);
            }
        } finally {
            this.b.unlock();
        }
    }

    @Override // tb.r8d
    public void onEvent(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12b3d9af", new Object[]{this, str, str2, map});
            return;
        }
        this.b.lock();
        try {
            Iterator it = ((ArrayList) this.f23056a).iterator();
            while (it.hasNext()) {
                ((r8d) it.next()).onEvent(str, str2, map);
            }
        } finally {
            this.b.unlock();
        }
    }

    @Override // tb.r8d
    public void onFinished(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dc51179", new Object[]{this, str, str2, map});
            return;
        }
        this.b.lock();
        try {
            Iterator it = ((ArrayList) this.f23056a).iterator();
            while (it.hasNext()) {
                ((r8d) it.next()).onFinished(str, str2, map);
            }
        } finally {
            this.b.unlock();
        }
    }

    @Override // tb.r8d
    public void onRequest(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e10f665a", new Object[]{this, str, str2, map});
            return;
        }
        this.b.lock();
        try {
            Iterator it = ((ArrayList) this.f23056a).iterator();
            while (it.hasNext()) {
                ((r8d) it.next()).onRequest(str, str2, map);
            }
        } finally {
            this.b.unlock();
        }
    }

    public l1m() {
        this.f23056a = new ArrayList(2);
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.b = reentrantReadWriteLock.readLock();
        this.c = reentrantReadWriteLock.writeLock();
    }
}
