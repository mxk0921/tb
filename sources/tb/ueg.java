package tb;

import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ueg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f29325a;
    public final ajc b;
    public final Map<String, Object> c = new HashMap();
    public final ReentrantReadWriteLock d = new ReentrantReadWriteLock(true);

    static {
        t2o.a(507510806);
    }

    public ueg(Context context, ajc ajcVar) {
        this.f29325a = context;
        this.b = ajcVar;
    }

    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("928d7f7e", new Object[]{this, str, obj});
            return;
        }
        this.d.writeLock().lock();
        try {
            ((HashMap) this.c).put(str, obj);
        } finally {
            this.d.writeLock().unlock();
        }
    }

    public Object b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c82ca685", new Object[]{this, str});
        }
        Context a2 = zdg.a(this.f29325a);
        if (a2 == null) {
            return "null";
        }
        this.d.readLock().lock();
        try {
            Object obj = ((HashMap) this.c).get(str);
            if (obj == null) {
                this.d.writeLock().lock();
                try {
                    if (((HashMap) this.c).get(str) == null) {
                        tdg a3 = veg.a(str, a2, this.b);
                        if (a3 != null) {
                            ((HashMap) this.c).put(str, a3);
                            obj = a3;
                        }
                    } else {
                        obj = ((HashMap) this.c).get(str);
                    }
                    this.d.writeLock().unlock();
                } catch (Throwable th) {
                    this.d.writeLock().unlock();
                    throw th;
                }
            }
            return obj;
        } finally {
            this.d.readLock().unlock();
        }
    }

    public void c(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        this.d.readLock().lock();
        try {
            for (Object obj : ((HashMap) this.c).values()) {
                if (obj instanceof tdg) {
                    ((tdg) obj).onActivityResult(i, i2, intent);
                }
            }
        } finally {
            this.d.readLock().unlock();
        }
    }

    /* JADX WARN: Finally extract failed */
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.d.readLock().lock();
        try {
            for (Object obj : ((HashMap) this.c).values()) {
                if (obj instanceof tdg) {
                    ((tdg) obj).onDestroy();
                }
            }
            this.d.readLock().unlock();
            this.d.writeLock().lock();
            try {
                ((HashMap) this.c).clear();
            } finally {
                this.d.writeLock().unlock();
            }
        } catch (Throwable th) {
            this.d.readLock().unlock();
            throw th;
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        this.d.readLock().lock();
        try {
            for (Object obj : ((HashMap) this.c).values()) {
                if (obj instanceof tdg) {
                    ((tdg) obj).onPause();
                }
            }
        } finally {
            this.d.readLock().unlock();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        this.d.readLock().lock();
        try {
            for (Object obj : ((HashMap) this.c).values()) {
                if (obj instanceof tdg) {
                    ((tdg) obj).onResume();
                }
            }
        } finally {
            this.d.readLock().unlock();
        }
    }

    public void g(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bdb314f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.d.readLock().lock();
        try {
            for (Object obj : ((HashMap) this.c).values()) {
                if (obj instanceof tdg) {
                    ((tdg) obj).onScrollChanged(i, i2, i3, i4);
                }
            }
        } finally {
            this.d.readLock().unlock();
        }
    }
}
