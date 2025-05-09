package tb;

import android.content.Context;
import android.os.Build;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.model.AppInfo;
import java.util.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xk7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATUS_EXCEPTION = 8;
    public static final int STATUS_FORMAT_FAILED = 9;
    public static final int STATUS_HAPPEN = 1;
    public static final int STATUS_SAVE = 2;
    public static final int STATUS_SAVE_FAILED = 7;
    public static final int STATUS_UPLOAD = 3;
    public static final int STATUS_UPLOAD_DISABLE = 6;
    public static final int STATUS_UPLOAD_FAILED = 5;
    public static final int STATUS_UPLOAD_SUCCESS = 4;

    /* renamed from: a  reason: collision with root package name */
    public static final int f31437a = new Random().nextInt(10000);

    static {
        t2o.a(615514144);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2312d58", new Object[0])).booleanValue();
        }
        int d = mk7.d();
        if (d == 10000 || d >= f31437a) {
            return true;
        }
        return false;
    }

    public static void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63bd2fb1", new Object[]{new Integer(i)});
            return;
        }
        AppInfo c = uk7.i().g().c();
        String format = String.format("type:TYPE_ABNORMAL;value1:%d;value2:%b;value3:%b", Integer.valueOf(i), Boolean.valueOf(c.isInner), Boolean.valueOf(c.isDebug));
        idh.a("DiagnoseMonitor", "statisticsAbnormal: ".concat(format));
        AppMonitor.Alarm.commitSuccess("diagnose", "runtimeInfo", format);
    }

    public static void f(Context context, AppInfo appInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c68896", new Object[]{context, appInfo});
        } else if (System.currentTimeMillis() - mk7.e(context) >= 86400000) {
            String format = String.format("osType:%s,osVer:%s,inner:%b,isDebug:%b,harmonyVer:%s,run64Bit:%b,support64Bit:%b,apkType:%d,bTaoFlag:%d,osSdk:%d", appInfo.os, appInfo.osDisplay, Boolean.valueOf(appInfo.isInner), Boolean.valueOf(appInfo.isDebug), appInfo.harmonyVer, Boolean.valueOf(appInfo.run64Bit), Boolean.valueOf(br2.d()), Integer.valueOf(br2.a(context)), 0, Integer.valueOf(Build.VERSION.SDK_INT));
            AppMonitor.Alarm.commitSuccess("diagnose", "data", format);
            idh.a("DiagnoseMonitor", format);
            mk7.t(context);
        }
    }

    public static void a(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cca4f9a0", new Object[]{str, new Integer(i), new Integer(i2)});
        } else if (c()) {
            String format = String.format("snapshotID:%s;exceptionType:%d;status:%d", str, Integer.valueOf(i), Integer.valueOf(i2));
            AppMonitor.Alarm.commitSuccess("diagnose", "exception", format);
            idh.a("DiagnoseMonitor", format);
        }
    }

    public static void b(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb21a8a3", new Object[]{str, new Integer(i), str2});
        } else if (c()) {
            String format = String.format("snapshotID:%s;exceptionType:%d;status:%d", str, Integer.valueOf(i), 8);
            AppMonitor.Alarm.commitFail("diagnose", "exception", format, "", str2);
            idh.a("DiagnoseMonitor", format);
        }
    }

    public static void d(long j, long j2, long j3, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67733df0", new Object[]{new Long(j), new Long(j2), new Long(j3), new Long(j4)});
            return;
        }
        String format = String.format("type:TYPE_MEM_EXHAUST;value1:%d;value2:%d;value3:%d;value4:%d", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4));
        idh.a("DiagnoseMonitor", "memoryExhaustInfo: ".concat(format));
        AppMonitor.Alarm.commitSuccess("diagnose", "runtimeInfo", format);
    }
}
