package tb;

import android.app.Application;
import android.util.Log;
import androidx.core.content.ContextCompat;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.alibaba.wireless.security.aopsdk.Invocation;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.privacyguard.config.RuleConfig;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class vyl implements jjd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String[] DEFAULT_PERMISSIONS;
    public static final long DEFAULT_TIME = -1;
    public static final String KEY_LAST_CHECK_TIME = "last_check_time";
    public static final String KEY_LAST_COMMIT_TIME = "last_commit_time";
    public static final String KEY_LAST_PERMISSION_STATUS = "last_permission_status";
    public static final long MAX_COMMIT_TIME_INTERVAL = 2592000;
    public static final long MAX_TIME_INTERVAL = 86400;
    public static final long MILLS_TO_SEC = 1000;
    public static final String MONITOR_PERMISSION_CHECK = "PermissionCheck";
    public static final String SP_PERMISSIONS = "sensitive_permissions";
    public static final String TAG = "PermissionDiffReporter";
    public static final int TBPGAuthorizationStatusAppOP = 1;
    public static final int TBPGAuthorizationStatusAuthorizedAlways = 3;
    public static final int TBPGAuthorizationStatusDenied = 2;

    /* renamed from: a  reason: collision with root package name */
    public static List<String> f30345a;

    static {
        t2o.a(757071915);
        t2o.a(757071913);
        String[] strArr = {"android.permission.SEND_SMS", "android.permission.RECEIVE_SMS", "android.permission.RECEIVE_SMS", "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS", "android.permission.WRITE_CALENDAR", t4p.CAMERA, "android.permission.RECORD_AUDIO", "android.permission.CALL_PHONE", "android.permission.READ_CALL_LOG", "android.permission.WRITE_CALL_LOG", "android.permission.READ_PHONE_STATE", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE", p78.ACCESS_FINE_LOCATION, "android.permission.ACCESS_COARSE_LOCATION"};
        DEFAULT_PERMISSIONS = strArr;
        f30345a = Arrays.asList(strArr);
    }

    @Override // tb.jjd
    public void a(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4675afe", new Object[]{this, invocation});
        }
    }

    @Override // tb.jjd
    public boolean b(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40f8c14f", new Object[]{this, invocation})).booleanValue();
        }
        return false;
    }

    public boolean c(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("163bcad2", new Object[]{this, jSONObject, jSONObject2})).booleanValue();
        }
        if (jSONObject2 == null || jSONObject.length() != jSONObject2.length()) {
            return false;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (jSONObject.optInt(next, -1) != jSONObject2.optInt(next, -1)) {
                return false;
            }
        }
        return true;
    }

    public JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5f379f35", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        Application a2 = shl.b().a();
        if (a2 == null) {
            Log.e(TAG, "getCurrentPermissionInfo: context is null!");
            return jSONObject;
        }
        try {
            RuleConfig b = yhl.a().b();
            if (!(b == null || b.getPermissionCheckList() == null)) {
                f30345a = b.getPermissionCheckList();
            }
            for (String str : f30345a) {
                int checkSelfPermission = ContextCompat.checkSelfPermission(a2, str);
                if (checkSelfPermission == -2) {
                    checkSelfPermission = 1;
                } else if (checkSelfPermission == -1) {
                    checkSelfPermission = 2;
                } else if (checkSelfPermission == 0) {
                    checkSelfPermission = 3;
                }
                jSONObject.put(str, checkSelfPermission);
            }
        } catch (Throwable th) {
            Log.e(TAG, "getCurrentPermissionInfo: can not obtain current permission info!");
            th.printStackTrace();
        }
        return jSONObject;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7b76bdd", new Object[]{this});
            return;
        }
        DimensionSet create = DimensionSet.create();
        create.addDimension("grantResult");
        AppMonitor.register(xhl.MONITOR_MODULE, MONITOR_PERMISSION_CHECK, MeasureSet.create(), create);
    }

    public void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed1fc4e3", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            Log.e(TAG, "report: current permission info is null!");
        } else {
            DimensionValueSet create = DimensionValueSet.create();
            create.setValue("grantResult", jSONObject.toString());
            AppMonitor.Stat.commit(xhl.MONITOR_MODULE, MONITOR_PERMISSION_CHECK, create, MeasureValueSet.create());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
        if (r13 != (-1)) goto L_0x0058;
     */
    @Override // tb.jjd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void init() {
        /*
            r17 = this;
            r1 = r17
            com.android.alibaba.ip.runtime.IpChange r0 = tb.vyl.$ipChange
            boolean r2 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0014
            java.lang.String r2 = "fede197"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r1
            r0.ipc$dispatch(r2, r3)
            return
        L_0x0014:
            r17.e()
            tb.shl r0 = tb.shl.b()
            android.app.Application r0 = r0.a()
            java.lang.String r2 = "sensitive_permissions"
            r3 = 4
            android.content.SharedPreferences r2 = r0.getSharedPreferences(r2, r3)
            tb.yhl r0 = tb.yhl.a()
            com.taobao.privacyguard.config.RuleConfig r0 = r0.b()
            if (r0 == 0) goto L_0x0038
            boolean r3 = r0.isReportPermissionCheck()
            if (r3 != 0) goto L_0x0038
            return
        L_0x0038:
            java.lang.String r3 = "last_check_time"
            r4 = -1
            long r6 = r2.getLong(r3, r4)
            java.lang.String r8 = "last_commit_time"
            long r9 = r2.getLong(r8, r4)
            long r11 = java.lang.System.currentTimeMillis()
            if (r0 == 0) goto L_0x0055
            long r13 = r0.permissionCheckInterval
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0055
            goto L_0x0058
        L_0x0055:
            r13 = 86400(0x15180, double:4.26873E-319)
        L_0x0058:
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0066
            long r6 = r11 - r6
            r15 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 * r15
            int r0 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c0
        L_0x0066:
            org.json.JSONObject r6 = r17.d()
            java.lang.String r7 = "last_permission_status"
            java.lang.String r0 = ""
            java.lang.String r0 = r2.getString(r7, r0)
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch: all -> 0x0079
            r13.<init>(r0)     // Catch: all -> 0x0079
            goto L_0x0085
        L_0x0079:
            r0 = move-exception
            java.lang.String r13 = "PermissionDiffReporter"
            java.lang.String r14 = "init: can not obtain last permission info!"
            android.util.Log.e(r13, r14)
            r0.printStackTrace()
            r13 = 0
        L_0x0085:
            boolean r0 = r1.c(r6, r13)
            if (r0 == 0) goto L_0x00a6
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00a6
            long r4 = r11 - r9
            r9 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x009b
            goto L_0x00a6
        L_0x009b:
            android.content.SharedPreferences$Editor r0 = r2.edit()
            r0.putLong(r3, r11)
            r0.apply()
            goto L_0x00c0
        L_0x00a6:
            r1.f(r6)
            android.content.SharedPreferences$Editor r0 = r2.edit()
            r0.putLong(r3, r11)
            r0.putLong(r8, r11)
            java.lang.String r2 = r6.toString()
            r0.putString(r7, r2)
            r0.apply()
            r6.toString()
        L_0x00c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.vyl.init():void");
    }
}
