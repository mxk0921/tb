package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.asp.APreferencesManager;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.artc.api.AConstants;
import com.taobao.media.MediaConstant;
import com.taobao.orange.OrangeConfig;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class j8l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAMESPACE = "accs";

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f21831a;
    public static final Map<Integer, List<String>> b = new HashMap();
    public static SharedPreferences c = null;
    public static Boolean d;
    public static volatile Boolean e;
    public static volatile Long f;
    public static volatile Integer g;
    public static volatile String h;
    public static volatile String i;
    public static String j;
    public static Boolean k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements z8l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(343933253);
            t2o.a(613417024);
        }

        @Override // tb.z8l
        public void onConfigUpdate(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
            } else if (GlobalClientInfo.getContext() == null) {
                ALog.e("OrangeAdapter", "onConfigUpdate context null", new Object[0]);
            } else {
                try {
                    ALog.i("OrangeAdapter", "onConfigUpdate", "namespace", str);
                    if ("accs".equals(str)) {
                        j8l.b();
                        j8l.g();
                    } else if (m8l.NAMESPACE.equals(str)) {
                        m8l.b();
                        m8l.A(OrangeConfig.getInstance().getConfigs(str), m8l.SP_NAME_ORI);
                    }
                } catch (Throwable th) {
                    ALog.e("OrangeAdapter", "onConfigUpdate", th, new Object[0]);
                }
            }
        }
    }

    static {
        t2o.a(343933252);
        f21831a = false;
        try {
            IpChange ipChange = OrangeConfig.$ipChange;
            f21831a = true;
        } catch (Exception unused) {
            f21831a = false;
        }
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
    }

    public static void C(String[] strArr, z8l z8lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ba4d723", new Object[]{strArr, z8lVar});
        } else if (f21831a) {
            OrangeConfig.getInstance().registerListener(strArr, z8lVar);
        } else {
            ALog.w("OrangeAdapter", "no orange sdk", new Object[0]);
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("108df6f6", new Object[0])).booleanValue();
        }
        boolean z = true;
        try {
            z = j(GlobalClientInfo.getContext(), Constants.SP_KEY_BG_LIMIT_SWITCH, true);
        } catch (Throwable th) {
            ALog.e("OrangeAdapter", "bgLimitEnabled err", th, new Object[0]);
        }
        ALog.d("OrangeAdapter", "bgLimitEnabled = " + z, new Object[0]);
        return z;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("115d59ae", new Object[0]);
        } else if (!s()) {
            ALog.e("OrangeAdapter", "force disable service", new Object[0]);
            ACCSManager.forceDisableService(GlobalClientInfo.getContext());
        } else if (UtilityImpl.getFocusDisableStatus(GlobalClientInfo.getContext())) {
            ALog.i("OrangeAdapter", "force enable service", new Object[0]);
            ACCSManager.forceEnableService(GlobalClientInfo.getContext());
        }
    }

    public static SharedPreferences e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("36254257", new Object[]{context});
        }
        if (c == null) {
            synchronized (j8l.class) {
                try {
                    if (c == null) {
                        c = context.getSharedPreferences(Constants.SP_FILE_NAME, 0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public static String f(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("611c4ee3", new Object[]{str, str2, str3});
        }
        if (f21831a) {
            return OrangeConfig.getInstance().getConfig(str, str2, str3);
        }
        ALog.w("OrangeAdapter", "no orange sdk", new Object[0]);
        return str3;
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b4a2a", new Object[0]);
            return;
        }
        xd0.m(GlobalClientInfo.getContext());
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.SP_KEY_KEEP_ALIVE_INIT_ENABLE, Boolean.valueOf(f("accs", Constants.SP_KEY_KEEP_ALIVE_INIT_ENABLE, "true")));
        hashMap.put(Constants.SP_KEY_NORMAL_SWITCH, Boolean.valueOf(f("accs", Constants.SP_KEY_NORMAL_SWITCH, "true")));
        hashMap.put(Constants.SP_KEY_MASS_SWITCH, Boolean.valueOf(f("accs", Constants.SP_KEY_MASS_SWITCH, "true")));
        hashMap.put(Constants.SP_KEY_BG_LIMIT_SWITCH, Boolean.valueOf(f("accs", Constants.SP_KEY_BG_LIMIT_SWITCH, "true")));
        hashMap.put(Constants.SP_KEY_ASP_ENABLE, Boolean.valueOf(f("accs", Constants.SP_KEY_ASP_ENABLE, "true")));
        E(GlobalClientInfo.getContext(), Constants.SP_KEY_CONN_SERVICE_TYPE, f("accs", Constants.SP_KEY_CONN_SERVICE_TYPE, "2"));
        E(GlobalClientInfo.getContext(), Constants.SP_KEY_UP_RETRY_IDS, f("accs", Constants.SP_KEY_UP_RETRY_IDS, "powermsg3"));
        E(GlobalClientInfo.getContext(), Constants.SP_KEY_NEW_WV_IDS, f("accs", Constants.SP_KEY_NEW_WV_IDS, Constants.HD_DDZ));
        E(GlobalClientInfo.getContext(), Constants.SP_KEY_DOWN_RTT, f("accs", Constants.SP_KEY_DOWN_RTT, ""));
        E(GlobalClientInfo.getContext(), Constants.SP_KEY_KEEP_ALIVE_RANGE, f("accs", Constants.SP_KEY_KEEP_ALIVE_RANGE, "3,96"));
        E(GlobalClientInfo.getContext(), Constants.SP_KEY_DOWN_MESSAGE, f("accs", Constants.SP_KEY_DOWN_MESSAGE, "powermsg"));
        E(GlobalClientInfo.getContext(), Constants.SP_KEY_CB_LISTENER, f("accs", Constants.SP_KEY_CB_LISTENER, "powermsg"));
        E(GlobalClientInfo.getContext(), Constants.SP_KEY_BG_MSG_FILTER, f("accs", Constants.SP_KEY_BG_MSG_FILTER, Constants.TARGET_SERVICE_EVENT_COLLECT));
        E(GlobalClientInfo.getContext(), Constants.SP_KEY_IPC_SVC_TO_LISTENER, f("accs", Constants.SP_KEY_IPC_SVC_TO_LISTENER, Constants.IMPAAS));
        try {
            D(GlobalClientInfo.getContext(), Constants.SP_KEY_CONNECT_TIMEOUT, Integer.parseInt(f("accs", Constants.SP_KEY_CONNECT_TIMEOUT, String.valueOf(10000))));
        } catch (NumberFormatException unused) {
            D(GlobalClientInfo.getContext(), Constants.SP_KEY_CONNECT_TIMEOUT, 10000);
        }
        G(GlobalClientInfo.getContext(), hashMap);
    }

    public static int h(Context context, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("534db58a", new Object[]{context, str, new Integer(i2)})).intValue();
        }
        try {
            return APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 4).getInt(str, i2);
        } catch (Exception e2) {
            ALog.e("OrangeAdapter", "getConfigFromSP fail:", e2, "key", str);
            return i2;
        }
    }

    public static String i(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1833f5aa", new Object[]{context, str, str2});
        }
        try {
            return APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 4).getString(str, str2);
        } catch (Exception e2) {
            ALog.e("OrangeAdapter", "getConfigFromSP fail:", e2, "key", str);
            return str2;
        }
    }

    public static boolean j(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("534df56c", new Object[]{context, str, new Boolean(z)})).booleanValue();
        }
        try {
            return APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 4).getBoolean(str, z);
        } catch (Exception e2) {
            ALog.e("OrangeAdapter", "getConfigFromSP fail:", e2, "key", str);
            return z;
        }
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38479f6a", new Object[0])).booleanValue();
        }
        if (UtilityImpl.isDualApp(GlobalClientInfo.getContext())) {
            return false;
        }
        if (k == null) {
            k = Boolean.TRUE;
            try {
                File file = new File(GlobalClientInfo.getContext().getDir("accs", 0), "scs_v1.lock");
                if (file.exists()) {
                    file.delete();
                }
            } catch (Throwable th) {
                ALog.e("OrangeAdapter", "isGlobalChannelEnable", th, new Object[0]);
            }
        }
        return k.booleanValue();
    }

    public static boolean v(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37b5685d", new Object[]{context})).booleanValue();
        }
        return true;
    }

    public static boolean x(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e2cb49b", new Object[]{context})).booleanValue();
        }
        return TextUtils.isEmpty(p(context));
    }

    public static boolean y(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f59c2404", new Object[]{context})).booleanValue();
        }
        return !x(context);
    }

    public static boolean z(Context context, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c08b71", new Object[]{context, new Integer(i2), str})).booleanValue();
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                if (q(context, i2, Constants.SP_FILE_NAME).contains(str)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            ALog.e("OrangeAdapter", "isServiceIdEnabledWithType err", e2, new Object[0]);
            return false;
        }
    }

    public static boolean B() {
        boolean z;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ffc17485", new Object[0])).booleanValue();
        }
        try {
            z = j(GlobalClientInfo.getContext(), Constants.SP_KEY_MASS_SWITCH, true);
            try {
                ALog.d("OrangeAdapter", "optMassEnabled", "enabled", Boolean.valueOf(z));
            } catch (Throwable th2) {
                th = th2;
                ALog.e("OrangeAdapter", "optMassEnabled", th, new Object[0]);
                return z;
            }
        } catch (Throwable th3) {
            th = th3;
            z = true;
        }
        return z;
    }

    public static void L(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51d7b5f2", new Object[]{context});
            return;
        }
        try {
            SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, "adaemon", 4).edit();
            edit.putInt("triggerType", 0);
            edit.apply();
        } catch (Throwable th) {
            ALog.e("OrangeAdapter", "setADaemonTriggerType", th, new Object[0]);
        }
    }

    public static void M(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("487b4f68", new Object[]{context});
            return;
        }
        try {
            SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).edit();
            edit.putInt("version", u() ? 302 : AConstants.ArtcErrorServerErrorDropByMobility);
            edit.apply();
        } catch (Throwable th) {
            ALog.e("OrangeAdapter", "setDefaultVersion fail:", th, new Object[0]);
        }
    }

    public static boolean s() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("538ba950", new Object[0])).booleanValue();
        }
        try {
            z = Boolean.parseBoolean(f("accs", "main_function_enable", "true"));
        } catch (Throwable th) {
            ALog.e("OrangeAdapter", "isAccsEnabled", th, new Object[0]);
            z = true;
        }
        ALog.i("OrangeAdapter", "isAccsEnabled", "enable", Boolean.valueOf(z));
        return z;
    }

    public static boolean A(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84779674", new Object[]{context})).booleanValue();
        }
        if (e == null) {
            try {
                e = Boolean.valueOf(j(context, Constants.KEY_CONTROL, false));
            } catch (Throwable th) {
                ALog.e("OrangeAdapter", "isTriggerEnable", th, new Object[0]);
                e = Boolean.FALSE;
            }
        }
        ALog.e("OrangeAdapter", "isTriggerEnable", "result", e);
        return e.booleanValue();
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2215df", new Object[]{context});
            return;
        }
        try {
            SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).edit();
            edit.remove(Constants.SP_KEY_REG_ID);
            edit.apply();
        } catch (Throwable th) {
            ALog.e("OrangeAdapter", "clearRegId fail:", th, "regId", j);
        }
    }

    public static int d(Context context) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fde3ec71", new Object[]{context})).intValue();
        }
        try {
            i2 = APreferencesManager.getSharedPreferences(context, "adaemon", 4).getInt("triggerType", 0);
        } catch (Throwable th) {
            ALog.e("OrangeAdapter", "getADaemonTriggerType", th, new Object[0]);
            i2 = 0;
        }
        ALog.d("OrangeAdapter", "getADaemonTriggerType", "result", Integer.valueOf(i2));
        return i2;
    }

    public static long k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("233e9628", new Object[]{context})).longValue();
        }
        if (g == null) {
            try {
                g = Integer.valueOf(APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).getInt(Constants.SP_KEY_CONNECT_TIMEOUT, 10000));
            } catch (Throwable th) {
                ALog.e("OrangeAdapter", "getConnectTimeout", th, new Object[0]);
            }
            ALog.d("OrangeAdapter", "getConnectTimeout", "result", g);
        }
        return g.intValue();
    }

    public static int l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb07571f", new Object[]{context})).intValue();
        }
        int i2 = 402;
        try {
            i2 = h(context, "version", u() ? 302 : 402);
        } catch (Throwable th) {
            ALog.e("OrangeAdapter", "getCurrentVersion", th, new Object[0]);
        }
        ALog.d("OrangeAdapter", "getCurrentVersion", "result", Integer.valueOf(i2));
        return i2;
    }

    public static String m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("408bfb18", new Object[]{context});
        }
        if (h == null) {
            try {
                h = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).getString(Constants.KEY_EVENT_COLLECT_STRATEGY, "");
            } catch (Throwable th) {
                ALog.e("OrangeAdapter", "getEventCollectStrategy", th, new Object[0]);
                h = "";
            }
        }
        ALog.d("OrangeAdapter", "getEventCollectStrategy", "result", h);
        return h;
    }

    public static Pair<Integer, Integer> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("a7611a01", new Object[0]);
        }
        try {
            String i2 = i(GlobalClientInfo.getContext(), Constants.SP_KEY_KEEP_ALIVE_RANGE, "3,96");
            String[] split = i2.split(",");
            if (split.length == 2) {
                ALog.e("OrangeAdapter", "getKeepAliveIdRange", x96.REFRESH_TYPE_RANGE, i2);
                return Pair.create(Integer.valueOf(Integer.parseInt(split[0])), Integer.valueOf(Integer.parseInt(split[1])));
            }
        } catch (Throwable th) {
            ALog.e("OrangeAdapter", "getKeepAliveIdRange err", th, new Object[0]);
        }
        return Pair.create(2, 96);
    }

    public static long o(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec0e3a56", new Object[]{context})).longValue();
        }
        if (f == null) {
            try {
                f = Long.valueOf(APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).getLong(Constants.SP_KEY_LAST_LAUNCH_TIME, 0L));
            } catch (Throwable th) {
                ALog.e("OrangeAdapter", "getLastActiveTime", th, new Object[0]);
            }
            ALog.d("OrangeAdapter", "getLastActiveTime", "result", f);
        }
        return f.longValue();
    }

    public static String p(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("61356cf8", new Object[]{context});
        }
        if (context == null) {
            context = re.r();
        }
        if (TextUtils.isEmpty(j)) {
            try {
                j = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 4).getString(Constants.SP_KEY_REG_ID, "");
            } catch (Throwable th) {
                ALog.e("OrangeAdapter", "getRegId", th, new Object[0]);
            }
            ALog.d("OrangeAdapter", "getRegId", "result", j);
        }
        return j;
    }

    public static String r(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1ccc0ec8", new Object[]{context});
        }
        if (i == null) {
            try {
                i = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).getString("strategy", MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
            } catch (Throwable th) {
                ALog.e("OrangeAdapter", "getStrategy", th, new Object[0]);
                i = MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264;
            }
        }
        ALog.d("OrangeAdapter", "getStrategy", "result", i);
        return i;
    }

    public static boolean t(Context context) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad0a80ee", new Object[]{context})).booleanValue();
        }
        try {
            z = e(context).getBoolean(Constants.SP_KEY_ASP_ENABLE, true);
        } catch (Throwable th) {
            ALog.e("OrangeAdapter", "isAspEnable", th, new Object[0]);
            z = false;
        }
        ALog.d("OrangeAdapter", "isAspEnable", "result", Boolean.valueOf(z));
        return z;
    }

    public static boolean w(Context context) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f39178a8", new Object[]{context})).booleanValue();
        }
        try {
            z = j(context, "switch", false);
        } catch (Throwable th) {
            ALog.e("OrangeAdapter", "isEventCollectEnable", th, new Object[0]);
            z = false;
        }
        Boolean bool = d;
        if (bool == null || bool.booleanValue() != z) {
            ALog.e("OrangeAdapter", "isEventCollectEnable", "result", Boolean.valueOf(z));
            d = Boolean.valueOf(z);
        }
        return z;
    }

    public static void G(Context context, Map<String, Boolean> map) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d64dabb0", new Object[]{context, map});
        } else if (map != null) {
            try {
            } catch (Exception e2) {
                ALog.e("OrangeAdapter", "saveConfigsToSP fail:", e2, "configs", map.toString());
            }
            if (map.size() != 0) {
                Boolean bool = map.get(Constants.SP_KEY_ASP_ENABLE);
                if (bool == null || !bool.booleanValue()) {
                    sharedPreferences = e(context);
                } else {
                    sharedPreferences = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 4);
                }
                SharedPreferences.Editor edit = sharedPreferences.edit();
                for (Map.Entry<String, Boolean> entry : map.entrySet()) {
                    edit.putBoolean(entry.getKey(), entry.getValue().booleanValue());
                }
                edit.apply();
                ALog.i("OrangeAdapter", "saveConfigsToSP-accs", "configs", map.toString());
            }
        }
    }

    public static void H(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90bf2cb", new Object[]{context, str});
            return;
        }
        try {
            h = str;
            SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).edit();
            edit.putString(Constants.KEY_EVENT_COLLECT_STRATEGY, str);
            edit.apply();
            ALog.i("OrangeAdapter", "saveEventCollectStrategy", "strategy", str, null);
        } catch (Throwable th) {
            ALog.e("OrangeAdapter", "saveEventCollectStrategy fail:", th, "strategy", str);
        }
    }

    public static void I(Context context, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c685c49", new Object[]{context, new Long(j2)});
            return;
        }
        try {
            f = Long.valueOf(j2);
            SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).edit();
            edit.putLong(Constants.SP_KEY_LAST_LAUNCH_TIME, j2);
            edit.apply();
        } catch (Throwable th) {
            ALog.e("OrangeAdapter", "saveLastActiveTime fail:", th, "lastLaunchTime", Long.valueOf(j2));
        }
    }

    public static void J(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7308f919", new Object[]{context, str});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                j = str;
                SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 4).edit();
                edit.putString(Constants.SP_KEY_REG_ID, str);
                edit.commit();
            }
        } catch (Throwable th) {
            ALog.e("OrangeAdapter", "saveRegId fail:", th, "regId", str);
        }
    }

    public static void K(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c238829b", new Object[]{context, str});
            return;
        }
        try {
            i = str;
            SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).edit();
            edit.putString("strategy", str);
            edit.apply();
        } catch (Throwable th) {
            ALog.e("OrangeAdapter", "saveStrategy fail:", th, "strategy", str);
        }
    }

    public static void D(Context context, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d97d8f8f", new Object[]{context, str, new Integer(i2)});
            return;
        }
        try {
        } catch (Exception e2) {
            ALog.e("OrangeAdapter", "saveConfigToSP fail:", e2, "key", str, "value", Integer.valueOf(i2));
        }
        if (context == null) {
            ALog.e("OrangeAdapter", "saveTLogOffToSP context null", new Object[0]);
            return;
        }
        SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 4).edit();
        edit.putInt(str, i2);
        edit.apply();
        ALog.i("OrangeAdapter", "saveConfigToSP", "key", str, "value", Integer.valueOf(i2));
    }

    public static void E(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a76b36be", new Object[]{context, str, str2});
            return;
        }
        try {
        } catch (Exception e2) {
            ALog.e("OrangeAdapter", "saveConfigToSP fail:", e2, "key", str, "value", str2);
        }
        if (context == null) {
            ALog.e("OrangeAdapter", "saveTLogOffToSP context null", new Object[0]);
            return;
        }
        SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 4).edit();
        edit.putString(str, str2);
        edit.apply();
        ALog.i("OrangeAdapter", "saveConfigToSP", "key", str, "value", str2);
    }

    public static void F(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d97dcf60", new Object[]{context, str, new Boolean(z)});
            return;
        }
        try {
        } catch (Exception e2) {
            ALog.e("OrangeAdapter", "saveConfigToSP fail:", e2, "key", str, "value", Boolean.valueOf(z));
        }
        if (context == null) {
            ALog.e("OrangeAdapter", "saveTLogOffToSP context null", new Object[0]);
            return;
        }
        SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 4).edit();
        edit.putBoolean(str, z);
        edit.apply();
        ALog.i("OrangeAdapter", "saveConfigToSP", "key", str, "value", Boolean.valueOf(z));
    }

    public static List<String> q(Context context, int i2, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("46f6be52", new Object[]{context, new Integer(i2), str});
        }
        String str3 = "";
        switch (i2) {
            case 0:
                str2 = Constants.SP_KEY_UP_RETRY_IDS;
                str3 = "powermsg3";
                break;
            case 1:
                str2 = Constants.SP_KEY_NEW_WV_IDS;
                str3 = Constants.HD_DDZ;
                break;
            case 2:
                str2 = Constants.SP_KEY_DOWN_RTT;
                break;
            case 3:
                str2 = Constants.SP_KEY_DOWN_MESSAGE;
                str3 = "powermsg";
                break;
            case 4:
                str2 = Constants.SP_KEY_CB_LISTENER;
                str3 = "powermsg";
                break;
            case 5:
                str2 = Constants.SP_KEY_BG_MSG_FILTER;
                str3 = Constants.TARGET_SERVICE_EVENT_COLLECT;
                break;
            case 6:
                str2 = Constants.SP_KEY_IPC_SVC_TO_LISTENER;
                break;
            case 7:
                str2 = m8l.KEY_CONN_TO_PULL;
                str3 = "powermsg,powermsg3";
                break;
            case 8:
                str2 = m8l.KEY_BLOCK_SERVICE;
                str3 = "powermsg3";
                break;
            default:
                str2 = null;
                break;
        }
        if (TextUtils.isEmpty(str2)) {
            ALog.d("OrangeAdapter", "getServiceIdsByType, empty key", "type", Integer.valueOf(i2));
            return Collections.emptyList();
        }
        Map<Integer, List<String>> map = b;
        synchronized (map) {
            try {
                List<String> list = (List) ((HashMap) map).get(Integer.valueOf(i2));
                if (list != null && list.size() > 0) {
                    return list;
                }
                String string = APreferencesManager.getSharedPreferences(context, str, 0).getString(str2, str3);
                if (!TextUtils.isEmpty(string)) {
                    List<String> asList = Arrays.asList(string.split(","));
                    ((HashMap) map).put(Integer.valueOf(i2), asList);
                    ALog.e("OrangeAdapter", "getServiceIdsByType content", "key", str2, "serviceIdMap", map, "list", asList);
                    ALog.d("OrangeAdapter", "getServiceIdsByType", "type", Integer.valueOf(i2), "ids", string);
                    return asList;
                }
                ALog.d("OrangeAdapter", "getServiceIdsByType", "type", Integer.valueOf(i2), "ids", string);
                return Collections.emptyList();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
