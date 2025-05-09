package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class qtj implements a0d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a0d f26921a;
    public final Lock b;
    public final Lock c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final qtj f26922a = new qtj();

        public static /* synthetic */ qtj a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qtj) ipChange.ipc$dispatch("662bfaf6", new Object[0]);
            }
            return f26922a;
        }
    }

    public static qtj b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qtj) ipChange.ipc$dispatch("4ddee8f1", new Object[0]);
        }
        return b.a();
    }

    @Override // tb.a0d
    public void a(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c969558", new Object[]{this, str, str2, map});
            return;
        }
        this.b.lock();
        try {
            a0d a0dVar = this.f26921a;
            if (a0dVar != null) {
                a0dVar.a(str, str2, map);
            }
        } finally {
            this.b.unlock();
        }
    }

    @Override // tb.a0d
    public void c(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88a02c03", new Object[]{this, str, map});
            return;
        }
        this.b.lock();
        try {
            a0d a0dVar = this.f26921a;
            if (a0dVar != null) {
                a0dVar.c(str, map);
            }
        } finally {
            this.b.unlock();
        }
    }

    public void d(a0d a0dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa7ca072", new Object[]{this, a0dVar});
            return;
        }
        this.c.lock();
        try {
            if (this.f26921a == null) {
                this.f26921a = a0dVar;
            }
        } finally {
            this.c.unlock();
        }
    }

    @Override // tb.a0d
    public void onEvent(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12b3d9af", new Object[]{this, str, str2, map});
            return;
        }
        this.b.lock();
        try {
            a0d a0dVar = this.f26921a;
            if (a0dVar != null) {
                a0dVar.onEvent(str, str2, map);
            }
        } finally {
            this.b.unlock();
        }
    }

    @Override // tb.a0d
    public void onRequest(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e10f665a", new Object[]{this, str, str2, map});
            return;
        }
        this.b.lock();
        try {
            a0d a0dVar = this.f26921a;
            if (a0dVar != null) {
                a0dVar.onRequest(str, str2, map);
            }
        } finally {
            this.b.unlock();
        }
    }

    public qtj() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.b = reentrantReadWriteLock.readLock();
        this.c = reentrantReadWriteLock.writeLock();
    }
}
