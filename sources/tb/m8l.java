package tb;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class m8l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_AGOO_OPTIMIZATION_RANGE = "agoo_optimization_range";
    public static final String KEY_ALLOW_LOSS_SERVICE_ID = "allow_loss_service_id";
    public static final String KEY_BLOCK_SERVICE = "block_service_ids";
    public static final String KEY_CONN_TO_PULL = "connect_to_pull_ids";
    public static final String KEY_KEEP_ALIVE_PREFIX = "keep_alive_prefix";
    public static final String KEY_KEEP_ALIVE_REPORT_RANGE = "keep_alive_report_range";
    public static final String KEY_SMART_HB_RANGE = "smart_hb_range";
    public static final String NAMESPACE = "accs2";
    public static final String SP_NAME = "ACCS_SDK2";
    public static final String SP_NAME_ORI = "ACCS_SDK2_ORI";

    /* renamed from: a  reason: collision with root package name */
    public static Long f23846a;
    public static Long b;
    public static Boolean c;
    public static Boolean e;

    static {
        t2o.a(343933254);
    }

    public static void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b94b4b83", new Object[0]);
        } else if (h.b()) {
            brt.d().execute(new Runnable() { // from class: tb.l8l
                @Override // java.lang.Runnable
                public final void run() {
                    m8l.q();
                }
            });
        } else {
            A(laq.a(re.r(), SP_NAME_ORI), SP_NAME);
        }
    }

    public static boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f7c7b30", new Object[0])).booleanValue();
        }
        return xaa.f31247a;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aded33c", new Object[0]);
            return;
        }
        f23846a = null;
        b = null;
        c = null;
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ce1fd45", new Object[0]);
        }
        String str = "2,99";
        try {
            str = l(GlobalClientInfo.getContext(), KEY_AGOO_OPTIMIZATION_RANGE, str);
            ALog.d("OrangeAdapter2", "agooChangesInRange = " + str, new Object[0]);
            return str;
        } catch (Throwable th) {
            ALog.e("OrangeAdapter2", "agooChangesInRange err", th, new Object[0]);
            return str;
        }
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5d15b3f", new Object[0]);
        }
        String str = Constants.TARGET_SERVICE_EVENT_COLLECT;
        try {
            str = l(GlobalClientInfo.getContext(), KEY_ALLOW_LOSS_SERVICE_ID, str);
            ALog.d("OrangeAdapter2", "getAllowLossServiceId = " + str, new Object[0]);
            return str;
        } catch (Throwable th) {
            ALog.e("OrangeAdapter2", "getAllowLossServiceId err", th, new Object[0]);
            return str;
        }
    }

    public static String e(Map<String, ?> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3eb59ea8", new Object[]{map, str, str2});
        }
        if (map.containsKey(str)) {
            return String.valueOf(map.get(str));
        }
        return str2;
    }

    public static String f() {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35a94eb5", new Object[0]);
        }
        try {
            String l = l(GlobalClientInfo.getContext(), KEY_KEEP_ALIVE_PREFIX, "");
            String str = Build.BRAND;
            if (l.contains(str)) {
                for (String str2 : l.split(",")) {
                    if (!TextUtils.isEmpty(str2) && str2.contains("=")) {
                        String[] split2 = str2.split("=");
                        if (str.equals(split2[0])) {
                            return split2[1];
                        }
                    }
                }
            }
            ALog.d("OrangeAdapter2", "getKeepAlivePrefix = ", new Object[0]);
        } catch (Throwable th) {
            ALog.e("OrangeAdapter2", "getKeepAlivePrefix err", th, new Object[0]);
        }
        return "";
    }

    public static long g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7d8f46", new Object[0])).longValue();
        }
        long j = 86400000;
        try {
            j = Long.parseLong(l(GlobalClientInfo.getContext(), "keep_alive_report_interval", String.valueOf(86400000L)));
            ALog.d("OrangeAdapter2", "getKeepAliveReportInterval = " + j, new Object[0]);
            return j;
        } catch (Throwable th) {
            ALog.e("OrangeAdapter2", "getKeepAliveReportInterval err", th, new Object[0]);
            return j;
        }
    }

    public static long h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("db3208f6", new Object[0])).longValue();
        }
        Long l = f23846a;
        if (l != null) {
            return l.longValue();
        }
        int i = 600;
        try {
            i = Integer.parseInt(l(GlobalClientInfo.getContext(), "smart_hb_max_interval", String.valueOf(600)));
            ALog.e("OrangeAdapter2", "getSmartHbMaxIntervalInMill = " + i, new Object[0]);
        } catch (Throwable th) {
            ALog.e("OrangeAdapter2", "getSmartHbMaxIntervalInMill err", th, new Object[0]);
        }
        long j = i * 1000;
        f23846a = Long.valueOf(j);
        return j;
    }

    public static long i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("933d4fc8", new Object[0])).longValue();
        }
        Long l = b;
        if (l != null) {
            return l.longValue();
        }
        int i = 60;
        try {
            i = Integer.parseInt(l(GlobalClientInfo.getContext(), "smart_hb_min_interval", String.valueOf(60)));
            ALog.e("OrangeAdapter2", "getSmartHbMinIntervalInMill = " + i, new Object[0]);
        } catch (Throwable th) {
            ALog.e("OrangeAdapter2", "getSmartHbMinIntervalInMill err", th, new Object[0]);
        }
        long j = i * 1000;
        b = Long.valueOf(j);
        return j;
    }

    public static boolean j(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("628cf1c7", new Object[]{str, new Integer(i)})).booleanValue();
        }
        try {
            return k(i).contains(str);
        } catch (Throwable th) {
            ALog.e("OrangeAdapter2", "getAvailableByServiceIdAndType err", th, new Object[0]);
            return false;
        }
    }

    public static List<String> k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("30392323", new Object[]{new Integer(i)});
        }
        try {
            return j8l.q(GlobalClientInfo.getContext(), i, SP_NAME);
        } catch (Throwable th) {
            ALog.e("OrangeAdapter2", "getServiceIdsByType err", th, new Object[0]);
            return null;
        }
    }

    public static String l(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a804d6d2", new Object[]{context, str, str2});
        }
        return n70.a(context, SP_NAME, 4, str, str2);
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b3dc522", new Object[0])).booleanValue();
        }
        boolean z = true;
        try {
            z = Boolean.parseBoolean(l(GlobalClientInfo.getContext(), "normal_changes", "true"));
            ALog.d("OrangeAdapter2", "isNormalChangesAvailable = " + z, new Object[0]);
            return z;
        } catch (Throwable th) {
            ALog.e("OrangeAdapter2", "isNormalChangesAvailable err", th, new Object[0]);
            return z;
        }
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87a3407d", new Object[0])).booleanValue();
        }
        boolean z = true;
        try {
            z = Boolean.parseBoolean(l(GlobalClientInfo.getContext(), "normal_changes_v1", "true"));
            ALog.d("OrangeAdapter2", "isNormalChangesAvailableV1 = " + z, new Object[0]);
            return z;
        } catch (Throwable th) {
            ALog.e("OrangeAdapter2", "isNormalChangesAvailableV1 err", th, new Object[0]);
            return z;
        }
    }

    public static boolean p() {
        boolean z;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87b157fe", new Object[0])).booleanValue();
        }
        try {
            z = Boolean.parseBoolean(l(GlobalClientInfo.getContext(), "normal_changes_v2", "false"));
            try {
                ALog.d("OrangeAdapter2", "isNormalChangesAvailableV2 = " + z, new Object[0]);
            } catch (Throwable th2) {
                th = th2;
                ALog.e("OrangeAdapter2", "isNormalChangesAvailableV2 err", th, new Object[0]);
                return z;
            }
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
        return z;
    }

    public static /* synthetic */ void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fae830b", new Object[0]);
        } else {
            A(laq.a(re.r(), SP_NAME_ORI), SP_NAME);
        }
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29c4ac5d", new Object[0])).booleanValue();
        }
        return h.g();
    }

    public static boolean s() {
        boolean z;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3509f33a", new Object[0])).booleanValue();
        }
        if (!cp.j()) {
            return true;
        }
        try {
            z = Boolean.parseBoolean(l(GlobalClientInfo.getContext(), "opt_overseas_monitor", "false"));
            try {
                ALog.d("OrangeAdapter2", "optOverseasMonitor = " + z, new Object[0]);
            } catch (Throwable th2) {
                th = th2;
                ALog.e("OrangeAdapter2", "optOverseasMonitor err", th, new Object[0]);
                return z;
            }
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
        return z;
    }

    public static boolean t() {
        boolean z;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37dfe155", new Object[0])).booleanValue();
        }
        if (!cp.j()) {
            return true;
        }
        try {
            z = Boolean.parseBoolean(l(GlobalClientInfo.getContext(), "opt_bc_biz_ack", "false"));
            try {
                ALog.d("OrangeAdapter2", "optBCBizAck = " + z, new Object[0]);
            } catch (Throwable th2) {
                th = th2;
                ALog.e("OrangeAdapter2", "optBCBizAck err", th, new Object[0]);
                return z;
            }
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
        return z;
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63469ca7", new Object[0])).booleanValue();
        }
        return UtilityImpl.isAppKeepAlive();
    }

    public static boolean v() {
        boolean z;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c07801d", new Object[0])).booleanValue();
        }
        try {
            z = Boolean.parseBoolean(l(GlobalClientInfo.getContext(), "opt_bind_app_once", "false"));
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
        try {
            ALog.d("OrangeAdapter2", "optBindAppOnce = " + z, new Object[0]);
        } catch (Throwable th3) {
            th = th3;
            ALog.e("OrangeAdapter2", "optBindAppOnce err", th, new Object[0]);
            return z;
        }
        return z;
    }

    public static boolean w() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d40fcea", new Object[0])).booleanValue();
        }
        if (e == null) {
            try {
                z = l(GlobalClientInfo.getContext(), "optConnListenerRecover", "Xiaomi,Redmi").contains(Build.BRAND);
            } catch (Throwable th) {
                ALog.e("OrangeAdapter2", "optConnectionListenerRecover err", th, new Object[0]);
                z = false;
            }
            e = Boolean.valueOf(z);
            ALog.e("OrangeAdapter2", "optConnectionListenerRecover = " + e, new Object[0]);
        }
        return e.booleanValue();
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37be83a6", new Object[0])).booleanValue();
        }
        return UtilityImpl.isAppKeepAlive();
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f8a6874", new Object[0])).booleanValue();
        }
        return m(l(GlobalClientInfo.getContext(), KEY_KEEP_ALIVE_REPORT_RANGE, null));
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5c36451", new Object[0])).booleanValue();
        }
        Boolean bool = c;
        if (bool != null) {
            return bool.booleanValue();
        }
        Context context = GlobalClientInfo.getContext();
        if (UtilityImpl.isChannelProcess(context) && m(l(context, KEY_SMART_HB_RANGE, "18-18"))) {
            z = true;
        }
        c = Boolean.valueOf(z);
        return z;
    }

    public static boolean m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8b403ad", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || !UtilityImpl.isAppKeepAlive()) {
            return false;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split("-");
                Pair create = Pair.create(Integer.valueOf(Integer.parseInt(split[0])), Integer.valueOf(Integer.parseInt(split[1])));
                int appKeepAliveBucketId = UtilityImpl.getAppKeepAliveBucketId(GlobalClientInfo.getContext());
                boolean z = appKeepAliveBucketId >= ((Integer) create.first).intValue() && appKeepAliveBucketId <= ((Integer) create.second).intValue();
                ALog.e("OrangeAdapter2", "withInRange", "enabled", Boolean.valueOf(z));
                return z;
            }
        } catch (Throwable th) {
            ALog.e("OrangeAdapter2", "withInRange err", th, new Object[0]);
        }
        return false;
    }

    public static void A(Map<String, ?> map, String str) {
        String str2;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cd90ef1", new Object[]{map, str});
        } else if (map == null || map.isEmpty()) {
            ALog.e("OrangeAdapter2", "map is empty", new Object[0]);
        } else {
            try {
                HashMap hashMap = new HashMap();
                str2 = "OrangeAdapter2";
                try {
                    hashMap.put("optConnListenerRecover", e(map, "optConnListenerRecover", "Xiaomi,Redmi"));
                    hashMap.put("opt_bc_biz_ack", e(map, "opt_bc_biz_ack", "false"));
                    hashMap.put("opt_overseas_monitor", e(map, "opt_overseas_monitor", "false"));
                    hashMap.put("smart_hb_max_interval", e(map, "smart_hb_max_interval", "600"));
                    hashMap.put("smart_hb_min_interval", e(map, "smart_hb_min_interval", "60"));
                    hashMap.put("keep_alive_report_interval", e(map, "keep_alive_report_interval", String.valueOf(86400000L)));
                    hashMap.put("opt_bind_app_once", e(map, "opt_bind_app_once", "false"));
                    hashMap.put("normal_changes", e(map, "normal_changes", "true"));
                    hashMap.put("normal_changes_v1", e(map, "normal_changes_v1", "true"));
                    hashMap.put("normal_changes_v2", e(map, "normal_changes_v2", "false"));
                    hashMap.put(KEY_CONN_TO_PULL, e(map, KEY_CONN_TO_PULL, "powermsg3"));
                    hashMap.put(KEY_BLOCK_SERVICE, e(map, KEY_BLOCK_SERVICE, "powermsg3"));
                    hashMap.put(KEY_AGOO_OPTIMIZATION_RANGE, e(map, KEY_AGOO_OPTIMIZATION_RANGE, "2,99"));
                    hashMap.put(KEY_ALLOW_LOSS_SERVICE_ID, e(map, KEY_ALLOW_LOSS_SERVICE_ID, Constants.TARGET_SERVICE_EVENT_COLLECT));
                    hashMap.put(KEY_KEEP_ALIVE_REPORT_RANGE, e(map, KEY_KEEP_ALIVE_REPORT_RANGE, null));
                    hashMap.put(KEY_SMART_HB_RANGE, e(map, KEY_SMART_HB_RANGE, "18-18"));
                    hashMap.put(KEY_KEEP_ALIVE_PREFIX, e(map, KEY_KEEP_ALIVE_PREFIX, ""));
                    laq.d(re.r(), str, hashMap);
                } catch (Throwable th2) {
                    th = th2;
                    ALog.e(str2, "saveConfigToSP err", th, new Object[0]);
                }
            } catch (Throwable th3) {
                th = th3;
                str2 = "OrangeAdapter2";
            }
        }
    }
}
