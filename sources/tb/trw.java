package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class trw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static csw f28918a;
    public static hqw b;
    public static erw c;
    public static yrw d;
    public static srw e;
    public static yqw f;
    public static vqw g;
    public static uqw h;
    public static wqw i;
    public static zqw j;
    public static xqw k;

    static {
        t2o.a(989856344);
    }

    public static hqw getErrorMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hqw) ipChange.ipc$dispatch("b40d30b1", new Object[0]);
        }
        return b;
    }

    public static erw getJsBridgeMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (erw) ipChange.ipc$dispatch("e7a87e79", new Object[0]);
        }
        return c;
    }

    public static yrw getPackageMonitorInterface() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yrw) ipChange.ipc$dispatch("8f3e613a", new Object[0]);
        }
        return d;
    }

    public static csw getPerformanceMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (csw) ipChange.ipc$dispatch("f531a421", new Object[0]);
        }
        return f28918a;
    }

    public static wqw getWVNetWorkMonitorInterface() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wqw) ipChange.ipc$dispatch("bedb1d67", new Object[0]);
        }
        return i;
    }

    public static yqw getWVWhitePageMonitorInterface() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yqw) ipChange.ipc$dispatch("e1024a27", new Object[0]);
        }
        return f;
    }

    public static uqw getWvJsBridgeMonitorInterface() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uqw) ipChange.ipc$dispatch("9aad65a3", new Object[0]);
        }
        return h;
    }

    public static vqw getWvJsErrorMonitorInterface() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vqw) ipChange.ipc$dispatch("66f31ce7", new Object[0]);
        }
        return g;
    }

    public static srw getWvMonitorInterface() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (srw) ipChange.ipc$dispatch("75d00d73", new Object[0]);
        }
        return e;
    }

    public static xqw getWvPerformanceMonitorInterface() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xqw) ipChange.ipc$dispatch("5667ad87", new Object[0]);
        }
        return k;
    }

    public static zqw getWvzCacheMonitorInterface() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zqw) ipChange.ipc$dispatch("c484bd7", new Object[0]);
        }
        return j;
    }

    public static void registerErrorMonitor(hqw hqwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("213963d6", new Object[]{hqwVar});
        } else {
            b = hqwVar;
        }
    }

    public static void registerJsBridgeMonitor(erw erwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdfa9048", new Object[]{erwVar});
        } else {
            c = erwVar;
        }
    }

    public static void registerPackageMonitorInterface(yrw yrwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f864832b", new Object[]{yrwVar});
        } else {
            d = yrwVar;
        }
    }

    public static void registerPerformanceMonitor(csw cswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9ffb356", new Object[]{cswVar});
        } else {
            f28918a = cswVar;
        }
    }

    public static void registerWVJsBridgeMonitorInterface(uqw uqwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("996980b4", new Object[]{uqwVar});
        } else {
            h = uqwVar;
        }
    }

    public static void registerWVJsErrorMonitorInterface(vqw vqwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f85949c4", new Object[]{vqwVar});
        } else {
            g = vqwVar;
        }
    }

    public static void registerWVMonitor(srw srwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b81b1377", new Object[]{srwVar});
        } else {
            e = srwVar;
        }
    }

    public static void registerWVNetWorkMonitorInterface(wqw wqwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9076d6a6", new Object[]{wqwVar});
        } else {
            i = wqwVar;
        }
    }

    public static void registerWVPerformanceMonitorInterface(xqw xqwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82719b62", new Object[]{xqwVar});
        } else {
            k = xqwVar;
        }
    }

    public static void registerWVWhitePageMonitorInterface(yqw yqwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a205ffd2", new Object[]{yqwVar});
        } else {
            f = yqwVar;
        }
    }

    public static void registerWVZCacheMonitorInterface(zqw zqwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83ca31b4", new Object[]{zqwVar});
        } else {
            j = zqwVar;
        }
    }
}
