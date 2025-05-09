package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class nrw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int OPTION_ERROR = 2;
    public static final int OPTION_HSC = 16;
    public static final int OPTION_JSBRIDGE = 4;
    public static final int OPTION_PACKAGEAPP = 8;
    public static final int OPTION_PERFORMANCE = 1;

    static {
        t2o.a(989856331);
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        init(23);
        prw.getInstance().init();
    }

    public static void init(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edcec44c", new Object[]{new Integer(i)});
            return;
        }
        rrw rrwVar = new rrw();
        if ((1 & i) > 0) {
            trw.registerPerformanceMonitor(rrwVar);
            trw.registerWVMonitor(rrwVar);
        }
        if ((i & 2) > 0) {
            trw.registerErrorMonitor(rrwVar);
        }
        if ((i & 4) > 0) {
            trw.registerJsBridgeMonitor(new frw());
        }
        if ((i & 8) > 0) {
            System.currentTimeMillis();
            if (trw.getPackageMonitorInterface() != null) {
                trw.getPackageMonitorInterface().uploadStartAppTime(System.currentTimeMillis());
            }
        }
        tqw tqwVar = new tqw();
        if ((i & 16) > 0 && vpw.commonConfig.l0) {
            trw.registerWVJsErrorMonitorInterface(tqwVar);
            trw.registerWVWhitePageMonitorInterface(tqwVar);
            trw.registerWVNetWorkMonitorInterface(tqwVar);
            trw.registerWVJsBridgeMonitorInterface(tqwVar);
            trw.registerWVZCacheMonitorInterface(tqwVar);
            trw.registerWVPerformanceMonitorInterface(tqwVar);
        }
        y71.init();
    }
}
