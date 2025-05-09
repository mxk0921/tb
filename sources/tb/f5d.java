package tb;

import android.net.Uri;
import android.os.IBinder;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.exception.IPCException;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class f5d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String e = f5d.class.getSimpleName();
    public static volatile f5d f = null;

    /* renamed from: a  reason: collision with root package name */
    public final ReferenceQueue<Object> f19023a = new ReferenceQueue<>();
    public final ReferenceQueue<Object> b = new ReferenceQueue<>();
    public final ReferenceQueue<Object> c = new ReferenceQueue<>();
    public final ConcurrentHashMap<PhantomReference<Object>, String> d = new ConcurrentHashMap<>();

    static {
        t2o.a(393216096);
    }

    public static f5d b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f5d) ipChange.ipc$dispatch("41e476a2", new Object[0]);
        }
        if (f == null) {
            synchronized (f5d.class) {
                try {
                    if (f == null) {
                        f = new f5d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f;
    }

    public final ReferenceQueue<Object> c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReferenceQueue) ipChange.ipc$dispatch("9ab2b751", new Object[]{this, obj});
        }
        if (obj instanceof Uri) {
            return this.b;
        }
        return this.c;
    }

    public final /* synthetic */ void d(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51bafb0f", new Object[]{this, obj});
        } else {
            e(obj);
        }
    }

    public final void e(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b05ef2f6", new Object[]{this, obj});
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        ReferenceQueue<Object> c = c(obj);
        synchronized (this.f19023a) {
            while (true) {
                try {
                    PhantomReference phantomReference = (PhantomReference) c.poll();
                    if (phantomReference != null) {
                        String remove = this.d.remove(phantomReference);
                        if (remove != null) {
                            arrayList.add(remove);
                        }
                        if (arrayList.size() > 100) {
                            f(obj, arrayList);
                            arrayList.clear();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        f(obj, arrayList);
    }

    public final void f(Object obj, ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4cd368e", new Object[]{this, obj, arrayList});
        } else if (arrayList != null && !arrayList.isEmpty()) {
            try {
                if (obj instanceof IBinder) {
                    ui3.a((IBinder) obj).c(arrayList);
                } else if (obj instanceof Uri) {
                    ui3.b((Uri) obj).d(arrayList);
                }
            } catch (IPCException e2) {
                b5d.h(e, "[recycle][recycleClient]", e2, new Object[0]);
            }
        }
    }

    public void g(final Object obj, String str, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("857fb32c", new Object[]{this, obj, str, obj2});
            return;
        }
        this.d.put(new PhantomReference<>(obj2, c(obj)), str);
        g5d.b(false, false, new Runnable() { // from class: tb.e5d
            @Override // java.lang.Runnable
            public final void run() {
                f5d.this.d(obj);
            }
        });
    }
}
