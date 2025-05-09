package android.taobao.windvane.extra.uc;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.uc.webview.base.klog.ILogger;
import tb.abq;
import tb.og8;
import tb.t2o;
import tb.vpw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UCLog extends ILogger {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String MODULE = "WindVane";
    private static final String TAG = "UCLog";
    private final abq mSpanWrapper = new abq();
    private static final boolean DEBUG = og8.b();
    private static volatile boolean isInit = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Holder {
        public static final UCLog sInstance = new UCLog();

        static {
            t2o.a(989856078);
        }

        private Holder() {
        }
    }

    static {
        t2o.a(989856077);
    }

    public static final UCLog getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UCLog) ipChange.ipc$dispatch("9a6d2e3b", new Object[0]);
        }
        return Holder.sInstance;
    }

    public static /* synthetic */ Object ipc$super(UCLog uCLog, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/extra/uc/UCLog");
    }

    private void log(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29cf83f6", new Object[]{this, str, str2, th});
        } else if (vpw.commonConfig.h2) {
            if (th == null) {
                TLog.loge("WindVane", str, str2);
            } else {
                TLog.loge("WindVane", str, str2, th);
            }
        }
    }

    @Override // com.uc.webview.base.klog.ILogger
    public void d(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ec3ad6", new Object[]{this, str, str2, th});
        } else {
            log(str, str2, th);
        }
    }

    @Override // com.uc.webview.base.klog.ILogger
    public void e(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{this, str, str2, th});
        } else {
            log(str, str2, th);
        }
    }

    public abq getSpanWrapper() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (abq) ipChange.ipc$dispatch("5b230494", new Object[]{this});
        }
        return this.mSpanWrapper;
    }

    @Override // com.uc.webview.base.klog.ILogger
    public void i(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("662468f1", new Object[]{this, str, str2, th});
        } else {
            log(str, str2, th);
        }
    }

    public boolean isInited() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae907f84", new Object[]{this})).booleanValue();
        }
        return isInit;
    }

    @Override // com.uc.webview.base.klog.ILogger
    public void w(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("818e83a3", new Object[]{this, str, str2, th});
        } else {
            log(str, str2, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void init(boolean r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = android.taobao.windvane.extra.uc.UCLog.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001b
            java.lang.Boolean r3 = new java.lang.Boolean
            r3.<init>(r6)
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r1] = r5
            r6[r0] = r3
            java.lang.String r0 = "edcf041d"
            r2.ipc$dispatch(r0, r6)
            return
        L_0x001b:
            java.lang.String r2 = "UCLog"
            if (r6 != 0) goto L_0x0028
            boolean r6 = android.taobao.windvane.extra.uc.UCLog.DEBUG     // Catch: all -> 0x0026
            if (r6 == 0) goto L_0x0024
            goto L_0x0028
        L_0x0024:
            r6 = 0
            goto L_0x0029
        L_0x0026:
            r6 = move-exception
            goto L_0x0048
        L_0x0028:
            r6 = 1
        L_0x0029:
            java.lang.String r3 = com.uc.webview.export.extension.SettingKeys.EnableKLog     // Catch: all -> 0x0026
            com.uc.webview.export.extension.GlobalSettings.set(r3, r6)     // Catch: all -> 0x0026
            java.lang.String r3 = com.uc.webview.export.extension.SettingKeys.SdkEnableLogToLogCat     // Catch: all -> 0x0026
            boolean r4 = android.taobao.windvane.extra.uc.UCLog.DEBUG     // Catch: all -> 0x0026
            com.uc.webview.export.extension.GlobalSettings.set(r3, r4)     // Catch: all -> 0x0026
            if (r6 == 0) goto L_0x0039
            r6 = r5
            goto L_0x003a
        L_0x0039:
            r6 = 0
        L_0x003a:
            com.uc.webview.base.klog.ILogger.Instance.set(r6)     // Catch: all -> 0x0026
            android.taobao.windvane.extra.uc.UCLog.isInit = r0     // Catch: all -> 0x0026
            java.lang.String r6 = "WindVane"
            java.lang.String r0 = "init success"
            com.taobao.tao.log.TLog.loge(r6, r2, r0)     // Catch: all -> 0x0026
            goto L_0x0050
        L_0x0048:
            java.lang.String r0 = "init fail"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            tb.v7t.e(r2, r0, r6, r1)
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.extra.uc.UCLog.init(boolean):void");
    }
}
