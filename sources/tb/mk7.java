package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.config.AbnormalConfig;
import com.taobao.android.diagnose.config.RuntimeMonitorConfig;
import com.taobao.android.diagnose.config.UTCollectConfig;
import com.taobao.android.diagnose.model.AppInfo;
import com.taobao.android.diagnose.scene.engine.config.TLogUploadActionConfig;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class mk7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONFIG_ABNORMAL_CONFIG = "abnormal_config";
    public static final String CONFIG_ACTION_TLOG_UPLOAD = "scene_action_tlog_upload";
    public static final String CONFIG_APM_ENABLE = "apm_enable";
    public static final String CONFIG_CHANNEL_ENABLE = "channel_enable";
    public static final String CONFIG_COLLECT_INTERVAL = "apm_collect_interval";
    public static final String CONFIG_EXCEPTION_MONITOR_ENABLE = "exception_monitor_enable";
    public static final String CONFIG_IS_DIAGNOSE_ENABLE = "diagnose_is_enable";
    public static final String CONFIG_IS_SCENE_ENABLE = "scene_enable";
    public static final String CONFIG_MONITOR_SAMPLE = "diagnose_monitor_sample";
    public static final String CONFIG_NEW_FEATURE = "new_feature_202307";
    public static final String CONFIG_RUNTIME_MONITOR_CONFIG = "runtime_monitor_config";
    public static final String CONFIG_SCENE_AVAILABLE_LIST = "scene_available_list";
    public static final String CONFIG_SCENE_CHECK_RULE_INTERVAL = "scene_check_rule_interval";
    public static final String CONFIG_SNAPSHOT_EXPIRE_DAY = "snapshot_expire_day";
    public static final String CONFIG_SNAPSHOT_UPLOAD_ENABLE = "snapshot_upload_enable";
    public static final String CONFIG_UT_COLLECT_CONFIG = "ut_collect_config";
    public static final String INFO_LAST_CRASH = "info_last_crash";
    public static final String INFO_LAST_LAUNCH = "info_last_launch";
    public static final String IS_INNER_USER = "is_inner_user";
    public static final String USER_TYPE = "user_type";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f24099a = true;
    public static boolean b = true;
    public static boolean c = true;
    public static long d = 5;
    public static boolean e = true;
    public static int f = 7;
    public static boolean g = true;
    public static UTCollectConfig h = new UTCollectConfig();
    public static int i = 10000;
    public static TLogUploadActionConfig j = new TLogUploadActionConfig();
    public static List<String> k = new ArrayList();
    public static boolean l = true;
    public static AbnormalConfig m = new AbnormalConfig();
    public static RuntimeMonitorConfig n = new RuntimeMonitorConfig();
    public static boolean o = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a extends TypeReference<List<String>> {
    }

    static {
        t2o.a(615514155);
    }

    public static List<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fa885509", new Object[0]);
        }
        return k;
    }

    public static long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d963a1d4", new Object[0])).longValue();
        }
        return d;
    }

    public static String c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f679c99e", new Object[]{context});
        }
        SharedPreferences f2 = f(context);
        if (f2 == null) {
            return null;
        }
        return f2.getString(INFO_LAST_CRASH, null);
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f08bcd68", new Object[0])).intValue();
        }
        return i;
    }

    public static long e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2b8db3f5", new Object[]{context})).longValue();
        }
        SharedPreferences f2 = f(context);
        if (f2 != null) {
            return f2.getLong("osTypeTime", 0L);
        }
        idh.b(gjv.INNER_USER_CONFIG, "The sharedPreferences is null");
        return Long.MAX_VALUE;
    }

    public static SharedPreferences f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("684fc578", new Object[]{context});
        }
        if (context != null) {
            return context.getSharedPreferences(gjv.INNER_USER_CONFIG, 0);
        }
        return null;
    }

    public static int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40a888f3", new Object[0])).intValue();
        }
        return f;
    }

    public static TLogUploadActionConfig h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TLogUploadActionConfig) ipChange.ipc$dispatch("ce524895", new Object[0]);
        }
        return j;
    }

    public static UTCollectConfig j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UTCollectConfig) ipChange.ipc$dispatch("bf13ede9", new Object[0]);
        }
        return h;
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b955042", new Object[0])).booleanValue();
        }
        return c;
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf084de7", new Object[0])).booleanValue();
        }
        return l;
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3a017b6", new Object[0])).booleanValue();
        }
        return f24099a;
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("964be00d", new Object[0])).booleanValue();
        }
        return g;
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2f457b0", new Object[0])).booleanValue();
        }
        return b;
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d6e329d", new Object[0])).booleanValue();
        }
        return e;
    }

    public static void r(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f50385b3", new Object[]{context, str});
            return;
        }
        SharedPreferences f2 = f(context);
        if (f2 != null) {
            SharedPreferences.Editor edit = f2.edit();
            edit.putString(INFO_LAST_CRASH, str);
            if (TextUtils.isEmpty(str)) {
                edit.apply();
            } else {
                edit.commit();
            }
        }
    }

    public static String s(Context context, String str, AppInfo appInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1890b37", new Object[]{context, str, appInfo});
        }
        SharedPreferences f2 = f(context);
        if (f2 == null) {
            idh.b(gjv.INNER_USER_CONFIG, "The sharedPreferences is null");
            return "";
        }
        String string = f2.getString(INFO_LAST_LAUNCH, "");
        SharedPreferences.Editor edit = f2.edit();
        edit.putString(INFO_LAST_LAUNCH, str);
        edit.putBoolean(IS_INNER_USER, appInfo.isInner);
        edit.putInt(USER_TYPE, appInfo.userType);
        edit.apply();
        return string;
    }

    public static void t(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daa4d9ba", new Object[]{context});
            return;
        }
        SharedPreferences f2 = f(context);
        if (f2 == null) {
            idh.b(gjv.INNER_USER_CONFIG, "The sharedPreferences is null");
        } else {
            f2.edit().putLong("osTypeTime", System.currentTimeMillis()).apply();
        }
    }

    public static void u(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b07c4def", new Object[]{context, str});
            return;
        }
        SharedPreferences f2 = f(context);
        if (f2 == null) {
            idh.b(gjv.INNER_USER_CONFIG, "The sharedPreferences is null");
        } else {
            f2.edit().putString("snapshotid", str).apply();
        }
    }

    public static int i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ee487d9", new Object[]{context})).intValue();
        }
        SharedPreferences f2 = f(context);
        if (f2 == null) {
            return 0;
        }
        return f2.getInt(USER_TYPE, 0);
    }

    public static void k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
            return;
        }
        try {
            SharedPreferences f2 = f(context);
            if (f2 != null) {
                f24099a = f2.getBoolean(CONFIG_IS_DIAGNOSE_ENABLE, true);
                b = f2.getBoolean(CONFIG_IS_SCENE_ENABLE, true);
                c = f2.getBoolean(CONFIG_APM_ENABLE, true);
                e = f2.getBoolean(CONFIG_SNAPSHOT_UPLOAD_ENABLE, true);
                d = f2.getLong(CONFIG_COLLECT_INTERVAL, 5L);
                f = f2.getInt(CONFIG_SNAPSHOT_EXPIRE_DAY, 7);
                g = f2.getBoolean(CONFIG_EXCEPTION_MONITOR_ENABLE, true);
                String string = f2.getString(CONFIG_UT_COLLECT_CONFIG, "");
                if (!TextUtils.isEmpty(string)) {
                    h = (UTCollectConfig) JSON.parseObject(string, UTCollectConfig.class);
                }
                i = f2.getInt(CONFIG_MONITOR_SAMPLE, 10000);
                String string2 = f2.getString(CONFIG_ACTION_TLOG_UPLOAD, "");
                if (!TextUtils.isEmpty(string2)) {
                    j = (TLogUploadActionConfig) JSON.parseObject(string2, TLogUploadActionConfig.class);
                }
                String string3 = f2.getString(CONFIG_SCENE_AVAILABLE_LIST, "");
                if (!TextUtils.isEmpty(string3)) {
                    k = (List) JSON.parseObject(string3, new a(), new Feature[0]);
                }
                oto.l(f2.getLong(CONFIG_SCENE_CHECK_RULE_INTERVAL, 0L));
                l = f2.getBoolean(CONFIG_CHANNEL_ENABLE, true);
                String string4 = f2.getString(CONFIG_ABNORMAL_CONFIG, "");
                if (!TextUtils.isEmpty(string4)) {
                    m = (AbnormalConfig) JSON.parseObject(string4, AbnormalConfig.class);
                }
                String string5 = f2.getString(CONFIG_RUNTIME_MONITOR_CONFIG, "");
                if (!TextUtils.isEmpty(string5)) {
                    n = (RuntimeMonitorConfig) JSON.parseObject(string5, RuntimeMonitorConfig.class);
                }
                o = f2.getBoolean(CONFIG_NEW_FEATURE, true);
            }
            nk7.a(context);
        } catch (Exception e2) {
            idh.c(gjv.INNER_USER_CONFIG, "init failed: ", e2);
        }
    }
}
