package com.taobao.browser;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.Measure;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lifecycle.PanguApplication;
import com.taobao.browser.config.BrowserConfigManager;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.TaoApplication;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.fm2;
import tb.m7r;
import tb.mol;
import tb.obk;
import tb.t2o;
import tb.v7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class BrowserApplication extends PanguApplication {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BrowserApplication";
    private static BrowserApplication browserApplication;
    private static boolean sOpenMultiMode = false;
    private static volatile AtomicBoolean sHasInitAppMonitor = new AtomicBoolean(false);
    private static obk sConfigListener = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            v7t.i(BrowserApplication.TAG, "onConfigUpdate in");
            if ("group_common_browser".equals(str)) {
                fm2.b().e();
                BrowserApplication.setupOpenMultiMode();
                mol.b().i();
            }
        }
    }

    static {
        t2o.a(619708441);
    }

    public static BrowserApplication getBrowserApplication() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BrowserApplication) ipChange.ipc$dispatch("f728b4d4", new Object[0]);
        }
        return browserApplication;
    }

    public static void initMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa057db1", new Object[0]);
        } else if (!sHasInitAppMonitor.get() && sHasInitAppMonitor.compareAndSet(false, true)) {
            try {
                DimensionSet create = DimensionSet.create();
                create.addDimension(m7r.KEY_MONITOR_IN_MAIN_PROCESS);
                create.addDimension(m7r.KEY_SHOULD_COLLECT_MEMORY_DATA);
                create.addDimension(m7r.KEY_MONITOR_URL);
                create.addDimension(m7r.KEY_MONITOR_PHONE_CLASS);
                create.addDimension(m7r.KEY_MONITOR_HAS_OPEN_MULTI_PROCESS_MODE);
                MeasureSet create2 = MeasureSet.create();
                Measure measure = new Measure(m7r.KEY_MONITOR_NAV_TO_ONCREATE_TIME);
                Measure measure2 = new Measure(m7r.KEY_MONITOR_MAIN_PROCESS_MEMORY);
                Measure measure3 = new Measure(m7r.KEY_MONITOR_MAIN_PROCESS_MEMORY_RATE);
                Measure measure4 = new Measure(m7r.KEY_MONITOR_SUB_PROCESS_MEMORY);
                Measure measure5 = new Measure(m7r.KEY_MONITOR_SUB_PROCESS_MEMORY_RATE);
                Measure measure6 = new Measure(m7r.KEY_MONITOR_DEVICE_TOTAL_MEMORY);
                create2.addMeasure(measure);
                create2.addMeasure(measure2);
                create2.addMeasure(measure4);
                create2.addMeasure(measure6);
                create2.addMeasure(measure3);
                create2.addMeasure(measure5);
                AppMonitor.register(m7r.KEY_MONITOR_MODULE, m7r.KEY_MONITOR_ENTER_ACTIVITY_MONITOR, create2, create);
                DimensionSet create3 = DimensionSet.create();
                create3.addDimension(m7r.KEY_MONITOR_PHONE_CLASS);
                create3.addDimension(m7r.KEY_MONITOR_REMOTE_INVOKE_CLASS);
                create3.addDimension(m7r.KEY_MONITOR_REMOTE_INVOKE_METHOD);
                MeasureSet create4 = MeasureSet.create();
                Measure measure7 = new Measure(m7r.KEY_MONITOR_REMOTE_INVOKE_TIME);
                Measure measure8 = new Measure(m7r.KEY_MONITOR_REMOTE_CONNECT_TIME);
                create4.addMeasure(measure7);
                create4.addMeasure(measure8);
                AppMonitor.register(m7r.KEY_MONITOR_MODULE, m7r.KEY_MONITOR_REMOTE_INVOKE_MONITOR, create4, create3);
            } catch (Exception unused) {
                sHasInitAppMonitor.set(false);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(BrowserApplication browserApplication2, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/BrowserApplication");
    }

    public static boolean isOpenMultiMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fca22d3", new Object[0])).booleanValue();
        }
        return sOpenMultiMode;
    }

    public static void registerConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81e7f1cc", new Object[0]);
            return;
        }
        fm2.b().c();
        BrowserConfigManager.a().b("group_common_browser", fm2.b());
    }

    public static void registerOrangeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c111c8c", new Object[0]);
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{"group_common_browser"}, sConfigListener, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
        if (isOpenMultiMode() != false) goto L_0x0063;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
        com.ut.mini.UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty(tb.m7r.KEY_MONITOR_HAS_OPEN_MULTI_PROCESS_MODE, "true");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
        com.ut.mini.UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty(tb.m7r.KEY_MONITOR_HAS_OPEN_MULTI_PROCESS_MODE, "false");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
        if (isOpenMultiMode() == false) goto L_0x006f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void setupOpenMultiMode() {
        /*
            java.lang.String r0 = "BrowserApplication"
            java.lang.String r1 = "false"
            java.lang.String r2 = "true"
            java.lang.String r3 = "hasOpenMultiProcessMode"
            java.lang.String r4 = "setupOpenMultiMode:sOpenMultiMode"
            com.android.alibaba.ip.runtime.IpChange r5 = com.taobao.browser.BrowserApplication.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            r7 = 0
            if (r6 == 0) goto L_0x001b
            java.lang.String r0 = "e1d1e5dc"
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r5.ipc$dispatch(r0, r1)
            return
        L_0x001b:
            android.app.Application r5 = com.taobao.tao.Globals.getApplication()     // Catch: all -> 0x0046, Exception -> 0x0048
            boolean r5 = tb.wym.a(r5)     // Catch: all -> 0x0046, Exception -> 0x0048
            if (r5 != 0) goto L_0x004a
            r4 = 1
            com.taobao.browser.BrowserApplication.sOpenMultiMode = r4     // Catch: all -> 0x0046, Exception -> 0x0048
            boolean r0 = isOpenMultiMode()
            if (r0 == 0) goto L_0x003a
            com.ut.mini.UTAnalytics r0 = com.ut.mini.UTAnalytics.getInstance()
            com.ut.mini.UTTracker r0 = r0.getDefaultTracker()
            r0.setGlobalProperty(r3, r2)
            goto L_0x0045
        L_0x003a:
            com.ut.mini.UTAnalytics r0 = com.ut.mini.UTAnalytics.getInstance()
            com.ut.mini.UTTracker r0 = r0.getDefaultTracker()
            r0.setGlobalProperty(r3, r1)
        L_0x0045:
            return
        L_0x0046:
            r0 = move-exception
            goto L_0x008d
        L_0x0048:
            r4 = move-exception
            goto L_0x007b
        L_0x004a:
            com.taobao.browser.BrowserApplication.sOpenMultiMode = r7     // Catch: all -> 0x0046, Exception -> 0x0048
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: all -> 0x0046, Exception -> 0x0048
            r5.<init>(r4)     // Catch: all -> 0x0046, Exception -> 0x0048
            boolean r4 = com.taobao.browser.BrowserApplication.sOpenMultiMode     // Catch: all -> 0x0046, Exception -> 0x0048
            r5.append(r4)     // Catch: all -> 0x0046, Exception -> 0x0048
            java.lang.String r4 = r5.toString()     // Catch: all -> 0x0046, Exception -> 0x0048
            tb.v7t.d(r0, r4)     // Catch: all -> 0x0046, Exception -> 0x0048
            boolean r0 = isOpenMultiMode()
            if (r0 == 0) goto L_0x006f
        L_0x0063:
            com.ut.mini.UTAnalytics r0 = com.ut.mini.UTAnalytics.getInstance()
            com.ut.mini.UTTracker r0 = r0.getDefaultTracker()
            r0.setGlobalProperty(r3, r2)
            goto L_0x008c
        L_0x006f:
            com.ut.mini.UTAnalytics r0 = com.ut.mini.UTAnalytics.getInstance()
            com.ut.mini.UTTracker r0 = r0.getDefaultTracker()
            r0.setGlobalProperty(r3, r1)
            goto L_0x008c
        L_0x007b:
            java.lang.String r5 = "setupOpenMultiMode exception:"
            java.lang.Object[] r6 = new java.lang.Object[r7]     // Catch: all -> 0x0046
            tb.v7t.e(r0, r5, r4, r6)     // Catch: all -> 0x0046
            com.taobao.browser.BrowserApplication.sOpenMultiMode = r7     // Catch: all -> 0x0046
            boolean r0 = isOpenMultiMode()
            if (r0 == 0) goto L_0x006f
            goto L_0x0063
        L_0x008c:
            return
        L_0x008d:
            boolean r4 = isOpenMultiMode()
            if (r4 == 0) goto L_0x009f
            com.ut.mini.UTAnalytics r1 = com.ut.mini.UTAnalytics.getInstance()
            com.ut.mini.UTTracker r1 = r1.getDefaultTracker()
            r1.setGlobalProperty(r3, r2)
            goto L_0x00aa
        L_0x009f:
            com.ut.mini.UTAnalytics r2 = com.ut.mini.UTAnalytics.getInstance()
            com.ut.mini.UTTracker r2 = r2.getDefaultTracker()
            r2.setGlobalProperty(r3, r1)
        L_0x00aa:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.browser.BrowserApplication.setupOpenMultiMode():void");
    }

    @Override // com.taobao.android.lifecycle.PanguApplication, android.app.Application
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        registerOrangeListener();
        setupOpenMultiMode();
        super.onCreate();
        new TaoApplication().onCreate(this);
        browserApplication = this;
        initMonitor();
    }
}
