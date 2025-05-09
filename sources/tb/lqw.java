package tb;

import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class lqw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int e = 1;
    public static final int f = -1;
    public static volatile lqw g;

    /* renamed from: a  reason: collision with root package name */
    public final List<jqw> f23522a;
    public final List<jqw> b;
    public final List<jqw> c;
    public final boolean d;

    static {
        t2o.a(989856390);
    }

    public lqw() {
        boolean z = vpw.commonConfig.o1;
        this.d = z;
        RVLLevel rVLLevel = RVLLevel.Error;
        lcn.f(rVLLevel, "WVEventService", "WVEventService useNewOnEvent=" + z);
        if (z) {
            this.f23522a = new CopyOnWriteArrayList();
            this.b = new CopyOnWriteArrayList();
            this.c = new CopyOnWriteArrayList();
            return;
        }
        this.f23522a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public static lqw d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lqw) ipChange.ipc$dispatch("aeaa9e9b", new Object[0]);
        }
        if (g == null) {
            synchronized (lqw.class) {
                try {
                    if (g == null) {
                        g = new lqw();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g;
    }

    public static kqw i(List<jqw> list, int i, iqw iqwVar, Object... objArr) {
        kqw onEvent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kqw) ipChange.ipc$dispatch("3d960203", new Object[]{list, new Integer(i), iqwVar, objArr});
        }
        if (list == null) {
            return null;
        }
        for (jqw jqwVar : list) {
            if (!(jqwVar == null || (onEvent = jqwVar.onEvent(i, iqwVar, objArr)) == null || !onEvent.f22859a)) {
                return onEvent;
            }
        }
        return null;
    }

    public synchronized void c(jqw jqwVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbb90167", new Object[]{this, jqwVar, new Integer(i)});
            return;
        }
        v7t.l("WVEventService", "addEventListener " + jqwVar);
        if (jqwVar != null) {
            if (i == e) {
                if (!this.f23522a.contains(jqwVar)) {
                    this.f23522a.add(jqwVar);
                }
            } else if (i == 0) {
                this.b.add(jqwVar);
            } else if (i == f) {
                this.c.add(jqwVar);
            }
        }
    }

    public kqw f(int i, IWVWebView iWVWebView, String str, Object... objArr) {
        kqw a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kqw) ipChange.ipc$dispatch("cac05b79", new Object[]{this, new Integer(i), iWVWebView, str, objArr});
        }
        if (this.d) {
            return a(i, iWVWebView, str, objArr);
        }
        synchronized (this) {
            a2 = a(i, iWVWebView, str, objArr);
        }
        return a2;
    }

    public kqw g(int i, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kqw) ipChange.ipc$dispatch("9ca57267", new Object[]{this, new Integer(i), objArr});
        }
        return f(i, null, null, objArr);
    }

    public synchronized void h(jqw jqwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c088903f", new Object[]{this, jqwVar});
            return;
        }
        v7t.l("WVEventService", "removeEventListener " + jqwVar);
        if (jqwVar != null) {
            int indexOf = this.b.indexOf(jqwVar);
            if (-1 != indexOf) {
                this.b.remove(indexOf);
            }
            int indexOf2 = this.f23522a.indexOf(jqwVar);
            if (-1 != indexOf2) {
                this.f23522a.remove(indexOf2);
            }
            int indexOf3 = this.c.indexOf(jqwVar);
            if (-1 != this.c.indexOf(jqwVar)) {
                this.c.remove(indexOf3);
            }
        }
    }

    public kqw a(int i, IWVWebView iWVWebView, String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kqw) ipChange.ipc$dispatch("f16fd436", new Object[]{this, new Integer(i), iWVWebView, str, objArr});
        }
        iqw iqwVar = new iqw(iWVWebView, str);
        kqw i2 = i(this.f23522a, i, iqwVar, objArr);
        if (i2 != null) {
            return i2;
        }
        kqw i3 = i(this.b, i, iqwVar, objArr);
        if (i3 != null) {
            return i3;
        }
        kqw i4 = i(this.c, i, iqwVar, objArr);
        return i4 != null ? i4 : new kqw(false);
    }

    public synchronized void b(jqw jqwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d58a151c", new Object[]{this, jqwVar});
        } else {
            c(jqwVar, 0);
        }
    }

    public kqw e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kqw) ipChange.ipc$dispatch("ee12f398", new Object[]{this, new Integer(i)});
        }
        return f(i, null, null, new Object[0]);
    }
}
