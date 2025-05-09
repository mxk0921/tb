package tb;

import android.content.Context;
import android.content.Intent;
import android.taobao.windvane.extra.performance2.IPerformance;
import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class esw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f18798a;
    public final IWVWebView b;
    public final IPerformance c;
    public final Map<String, Object> d;
    public final ReentrantReadWriteLock e;

    static {
        t2o.a(989856234);
    }

    public esw(Context context, IWVWebView iWVWebView) {
        this.f18798a = null;
        this.b = null;
        this.c = null;
        this.d = new HashMap();
        this.e = new ReentrantReadWriteLock(true);
        this.f18798a = context;
        this.b = iWVWebView;
    }

    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("928d7f7e", new Object[]{this, str, obj});
            return;
        }
        this.e.writeLock().lock();
        try {
            ((HashMap) this.d).put(str, obj);
        } finally {
            this.e.writeLock().unlock();
        }
    }

    public Object b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c82ca685", new Object[]{this, str});
        }
        Context a2 = xpw.a(this.f18798a);
        if (a2 == null) {
            return "null";
        }
        this.e.readLock().lock();
        try {
            Object obj = ((HashMap) this.d).get(str);
            if (obj == null) {
                this.e.writeLock().lock();
                try {
                    if (((HashMap) this.d).get(str) == null) {
                        kpw a3 = fsw.a(str, a2, this.b, this.c);
                        if (a3 != null) {
                            ((HashMap) this.d).put(str, a3);
                            obj = a3;
                        }
                    } else {
                        obj = ((HashMap) this.d).get(str);
                    }
                    this.e.writeLock().unlock();
                } catch (Throwable th) {
                    this.e.writeLock().unlock();
                    throw th;
                }
            }
            return obj;
        } finally {
            this.e.readLock().unlock();
        }
    }

    public void c(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        this.e.readLock().lock();
        try {
            for (Object obj : ((HashMap) this.d).values()) {
                if (obj instanceof kpw) {
                    ((kpw) obj).onActivityResult(i, i2, intent);
                }
            }
        } finally {
            this.e.readLock().unlock();
        }
    }

    /* JADX WARN: Finally extract failed */
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.e.readLock().lock();
        try {
            for (Object obj : ((HashMap) this.d).values()) {
                if (obj instanceof kpw) {
                    ((kpw) obj).onDestroy();
                }
            }
            this.e.readLock().unlock();
            this.e.writeLock().lock();
            try {
                ((HashMap) this.d).clear();
            } finally {
                this.e.writeLock().unlock();
            }
        } catch (Throwable th) {
            this.e.readLock().unlock();
            throw th;
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        this.e.readLock().lock();
        try {
            for (Object obj : ((HashMap) this.d).values()) {
                if (obj instanceof kpw) {
                    ((kpw) obj).onPause();
                }
            }
        } finally {
            this.e.readLock().unlock();
        }
    }

    public void f(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
            return;
        }
        this.e.readLock().lock();
        try {
            for (Object obj : ((HashMap) this.d).values()) {
                if (obj instanceof kpw) {
                    ((kpw) obj).onRequestPermissionsResult(i, strArr, iArr);
                }
            }
        } finally {
            this.e.readLock().unlock();
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        this.e.readLock().lock();
        try {
            for (Object obj : ((HashMap) this.d).values()) {
                if (obj instanceof kpw) {
                    ((kpw) obj).onResume();
                }
            }
        } finally {
            this.e.readLock().unlock();
        }
    }

    public void h(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bdb314f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.e.readLock().lock();
        try {
            for (Object obj : ((HashMap) this.d).values()) {
                if (obj instanceof kpw) {
                    ((kpw) obj).onScrollChanged(i, i2, i3, i4);
                }
            }
        } finally {
            this.e.readLock().unlock();
        }
    }

    public esw(Context context, IWVWebView iWVWebView, IPerformance iPerformance) {
        this(context, iWVWebView);
        this.c = iPerformance;
    }
}
