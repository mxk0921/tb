package tb;

import android.app.ActivityManager;
import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.staticdataencrypt.IStaticDataEncryptComponent;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import com.ut.device.UTDevice;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class cyv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOG = "lbs_sdk.Utils";

    /* renamed from: a  reason: collision with root package name */
    public static String f17442a = null;

    static {
        t2o.a(789577865);
    }

    public static String a(Context context, String str, String str2) {
        IStaticDataEncryptComponent staticDataEncryptComp;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d7f3157a", new Object[]{context, str, str2});
        }
        try {
            SecurityGuardManager instance = SecurityGuardManager.getInstance(context);
            if (instance == null || (staticDataEncryptComp = instance.getStaticDataEncryptComp()) == null) {
                return null;
            }
            return staticDataEncryptComp.staticSafeEncrypt(16, str, str2, "");
        } catch (Exception unused) {
            return null;
        }
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79a7d1d2", new Object[0]);
        }
        if (i("deviceId")) {
            return null;
        }
        String str = f17442a;
        if (str != null) {
            return str;
        }
        TelephonyManager telephonyManager = (TelephonyManager) Globals.getApplication().getSystemService("phone");
        if (ContextCompat.checkSelfPermission(Globals.getApplication(), "android.permission.READ_PHONE_STATE") != 0 || telephonyManager == null) {
            return null;
        }
        String proxy_getDeviceId = ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getDeviceId(telephonyManager);
        f17442a = proxy_getDeviceId;
        if (TextUtils.isEmpty(proxy_getDeviceId)) {
            f17442a = "";
        }
        return f17442a;
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e010a17a", new Object[0]);
        }
        try {
            WifiInfo connectionInfo = ((WifiManager) yah.f31937a.getSystemService("wifi")).getConnectionInfo();
            if (connectionInfo != null) {
                return h(connectionInfo.getIpAddress());
            }
            return null;
        } catch (Throwable unused) {
            mdh.b(LOG, "error: fail to get phone ip address");
            return null;
        }
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2216ad9c", new Object[0]);
        }
        return null;
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3fdfad6f", new Object[0]);
        }
        return UTDevice.getUtdid(yah.f31937a);
    }

    public static List<ScanResult> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c75827db", new Object[0]);
        }
        return new ArrayList(0);
    }

    public static String h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16508795", new Object[]{new Integer(i)});
        }
        return (i & 255) + "." + ((i >> 8) & 255) + "." + ((i >> 16) & 255) + "." + ((i >> 24) & 255);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0084 A[Catch: all -> 0x00ee, LOOP:0: B:26:0x0080->B:28:0x0084, LOOP_END, TryCatch #0 {all -> 0x00ee, blocks: (B:9:0x001b, B:11:0x002f, B:13:0x0035, B:15:0x0039, B:17:0x003f, B:20:0x0046, B:23:0x004f, B:25:0x0056, B:26:0x0080, B:28:0x0084, B:30:0x00b7, B:32:0x00bb), top: B:36:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.taobao.passivelocation.domain.LBSCellDTO[] b() {
        /*
            r0 = 1
            com.android.alibaba.ip.runtime.IpChange r1 = tb.cyv.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 0
            if (r2 == 0) goto L_0x0013
            java.lang.String r0 = "cb24bd1c"
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.Object r0 = r1.ipc$dispatch(r0, r2)
            com.taobao.passivelocation.domain.LBSCellDTO[] r0 = (com.taobao.passivelocation.domain.LBSCellDTO[]) r0
            return r0
        L_0x0013:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            r4 = 0
            if (r1 < r2) goto L_0x001b
            return r4
        L_0x001b:
            android.app.Application r1 = com.taobao.tao.Globals.getApplication()     // Catch: all -> 0x00ee
            java.lang.String r2 = "phone"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch: all -> 0x00ee
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch: all -> 0x00ee
            int r2 = r1.getSimState()     // Catch: all -> 0x00ee
            r5 = 5
            if (r2 != r5) goto L_0x00ee
            android.telephony.CellLocation r2 = r1.getCellLocation()     // Catch: all -> 0x00ee
            if (r2 == 0) goto L_0x00ee
            boolean r5 = r2 instanceof android.telephony.gsm.GsmCellLocation     // Catch: all -> 0x00ee
            if (r5 == 0) goto L_0x00b7
            java.util.List r1 = r1.getNeighboringCellInfo()     // Catch: all -> 0x00ee
            if (r1 == 0) goto L_0x0055
            int r5 = r1.size()     // Catch: all -> 0x00ee
            if (r5 != 0) goto L_0x0046
            goto L_0x0055
        L_0x0046:
            int r5 = r1.size()     // Catch: all -> 0x00ee
            r6 = 2
            if (r5 <= r6) goto L_0x004f
            r5 = 3
            goto L_0x0056
        L_0x004f:
            int r5 = r1.size()     // Catch: all -> 0x00ee
            int r5 = r5 + r0
            goto L_0x0056
        L_0x0055:
            r5 = 1
        L_0x0056:
            com.taobao.passivelocation.domain.LBSCellDTO[] r6 = new com.taobao.passivelocation.domain.LBSCellDTO[r5]     // Catch: all -> 0x00ee
            android.telephony.gsm.GsmCellLocation r2 = (android.telephony.gsm.GsmCellLocation) r2     // Catch: all -> 0x00ee
            com.taobao.passivelocation.domain.LBSCellDTO r7 = new com.taobao.passivelocation.domain.LBSCellDTO     // Catch: all -> 0x00ee
            r7.<init>()     // Catch: all -> 0x00ee
            int r8 = r2.getCid()     // Catch: all -> 0x00ee
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: all -> 0x00ee
            r7.setCellId(r8)     // Catch: all -> 0x00ee
            int r2 = r2.getLac()     // Catch: all -> 0x00ee
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: all -> 0x00ee
            r7.setLac(r2)     // Catch: all -> 0x00ee
            short r2 = tb.bgj.b     // Catch: all -> 0x00ee
            java.lang.Short r2 = java.lang.Short.valueOf(r2)     // Catch: all -> 0x00ee
            r7.setRssi(r2)     // Catch: all -> 0x00ee
            r6[r3] = r7     // Catch: all -> 0x00ee
        L_0x0080:
            int r2 = r5 + (-1)
            if (r3 >= r2) goto L_0x00b5
            java.lang.Object r2 = r1.get(r3)     // Catch: all -> 0x00ee
            android.telephony.NeighboringCellInfo r2 = (android.telephony.NeighboringCellInfo) r2     // Catch: all -> 0x00ee
            com.taobao.passivelocation.domain.LBSCellDTO r7 = new com.taobao.passivelocation.domain.LBSCellDTO     // Catch: all -> 0x00ee
            r7.<init>()     // Catch: all -> 0x00ee
            int r8 = r2.getCid()     // Catch: all -> 0x00ee
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: all -> 0x00ee
            r7.setCellId(r8)     // Catch: all -> 0x00ee
            int r8 = r2.getLac()     // Catch: all -> 0x00ee
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: all -> 0x00ee
            r7.setLac(r8)     // Catch: all -> 0x00ee
            int r2 = r2.getRssi()     // Catch: all -> 0x00ee
            short r2 = (short) r2     // Catch: all -> 0x00ee
            java.lang.Short r2 = java.lang.Short.valueOf(r2)     // Catch: all -> 0x00ee
            r7.setRssi(r2)     // Catch: all -> 0x00ee
            int r3 = r3 + r0
            r6[r3] = r7     // Catch: all -> 0x00ee
            goto L_0x0080
        L_0x00b5:
            r4 = r6
            goto L_0x00ee
        L_0x00b7:
            boolean r1 = r2 instanceof android.telephony.cdma.CdmaCellLocation     // Catch: all -> 0x00ee
            if (r1 == 0) goto L_0x00ee
            android.telephony.cdma.CdmaCellLocation r2 = (android.telephony.cdma.CdmaCellLocation) r2     // Catch: all -> 0x00ee
            com.taobao.passivelocation.domain.LBSCellDTO r1 = new com.taobao.passivelocation.domain.LBSCellDTO     // Catch: all -> 0x00ee
            r1.<init>()     // Catch: all -> 0x00ee
            com.taobao.passivelocation.domain.LBSCellDTO[] r0 = new com.taobao.passivelocation.domain.LBSCellDTO[r0]     // Catch: all -> 0x00ee
            r0[r3] = r1     // Catch: all -> 0x00ee
            r1 = r0[r3]     // Catch: all -> 0x00ee
            int r5 = r2.getNetworkId()     // Catch: all -> 0x00ee
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: all -> 0x00ee
            r1.setNetworkId(r5)     // Catch: all -> 0x00ee
            r1 = r0[r3]     // Catch: all -> 0x00ee
            int r5 = r2.getBaseStationId()     // Catch: all -> 0x00ee
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: all -> 0x00ee
            r1.setBaseStationId(r5)     // Catch: all -> 0x00ee
            r1 = r0[r3]     // Catch: all -> 0x00ee
            int r2 = r2.getSystemId()     // Catch: all -> 0x00ee
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: all -> 0x00ee
            r1.setSystemId(r2)     // Catch: all -> 0x00ee
            r4 = r0
        L_0x00ee:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.cyv.b():com.taobao.passivelocation.domain.LBSCellDTO[]");
    }

    public static boolean i(String str) {
        String config;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("483e689b", new Object[]{str})).booleanValue();
        }
        return (str == null || (config = OrangeConfig.getInstance().getConfig("gps", "privacy_disallow_list", "")) == null || !config.toLowerCase().contains(str.toLowerCase())) ? false : true;
    }

    public static boolean j(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("316efd1b", new Object[]{context, str})).booleanValue();
        }
        List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) context.getSystemService("activity")).getRunningServices(30);
        if (runningServices == null || runningServices.size() <= 0) {
            return false;
        }
        for (int i = 0; i < runningServices.size(); i++) {
            if (runningServices.get(i).service.getClassName().equals(str)) {
                mdh.a(LOG, "running_service_name=" + runningServices.get(i).service.getClassName());
                return true;
            }
        }
        return false;
    }
}
