package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.asp.APreferencesManager;
import com.taobao.accs.client.AccsConfig;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import org.android.agoo.common.Config;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class czv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SP_AGOO_BIND_FILE_NAME = "AGOO_BIND";

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f17474a = new byte[0];
    public static int b = -1;
    public static volatile int c = -1;

    static {
        t2o.a(343933261);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c26ae84f", new Object[]{context});
            return;
        }
        try {
            SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, "AGOO_BIND", 0).edit();
            edit.clear();
            edit.apply();
        } catch (Exception e) {
            ALog.e("Utils", "clearAgooBindCache", e, new Object[0]);
        }
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccd9de74", new Object[]{context});
            return;
        }
        try {
            synchronized (f17474a) {
                SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).edit();
                edit.clear();
                edit.apply();
            }
        } catch (Throwable th) {
            ALog.e("Utils", "clearAllSharePreferences", th, new Object[0]);
        }
    }

    public static boolean c(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b37c282", new Object[]{obj, obj2})).booleanValue();
        }
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int d(Context context) {
        int i;
        Throwable th;
        Throwable th2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bde5bd9b", new Object[]{context})).intValue();
        }
        if (c != -1) {
            return c;
        }
        try {
            try {
            } catch (Throwable th3) {
                th2 = th3;
                i = context;
            }
        } catch (Throwable th4) {
            th = th4;
            i = 0;
        }
        synchronized (f17474a) {
            try {
                i = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).getInt(Constants.SP_KEY_DEBUG_MODE, 0);
                return i;
            } catch (Throwable th5) {
                th2 = th5;
                i = 0;
                try {
                    throw th2;
                } catch (Throwable th6) {
                    th = th6;
                    ALog.e("Utils", "getMode", th, new Object[0]);
                    return i;
                }
            }
        }
    }

    @Deprecated
    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6811c3f9", new Object[0]);
            return;
        }
        try {
            AccsConfig.build();
        } catch (Throwable th) {
            ALog.e("Utils", "initConfig", th, new Object[0]);
            th.printStackTrace();
        }
    }

    public static boolean h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff629ea6", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        if (b == -1) {
            b = context.getApplicationInfo().targetSdkVersion;
        }
        if (b < 26 || Build.VERSION.SDK_INT < 26) {
            return false;
        }
        return true;
    }

    public static void i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44c9070a", new Object[]{context});
            return;
        }
        try {
            UtilityImpl.killService(context);
        } catch (Throwable th) {
            ALog.e("Utils", "killService", th, new Object[0]);
        }
    }

    public static void j(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("833a5125", new Object[]{context, str});
            return;
        }
        try {
            Config.setAgooAppKey(context, str);
        } catch (Throwable th) {
            ALog.e("Utils", "setAgooAppkey", th, new Object[0]);
            th.printStackTrace();
        }
    }

    public static void k(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eab05467", new Object[]{context, new Integer(i)});
            return;
        }
        try {
            c = i;
            synchronized (f17474a) {
                SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).edit();
                edit.putInt(Constants.SP_KEY_DEBUG_MODE, i);
                edit.apply();
            }
        } catch (Throwable th) {
            ALog.e("Utils", "setMode", th, new Object[0]);
        }
    }

    public static boolean g(Context context) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42bb9b9", new Object[]{context})).booleanValue();
        }
        try {
            z = UtilityImpl.isMainProcess(context);
        } catch (Throwable th) {
            ALog.e("Utils", "killservice", th, new Object[0]);
            th.printStackTrace();
            z = true;
        }
        ALog.i("Utils", "isMainProcess", "result", Boolean.valueOf(z));
        return z;
    }

    public static String e(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("62e134e9", new Object[]{context, str, str2});
        }
        String str3 = null;
        try {
            synchronized (f17474a) {
                str3 = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).getString(str, null);
            }
            ALog.i("Utils", "getSpValue", "value", str3);
            if (TextUtils.isEmpty(str3)) {
                ALog.e("Utils", "getSpValue use default!", new Object[0]);
                return str2;
            }
        } catch (Throwable th) {
            ALog.e("Utils", "getSpValue fail", th, new Object[0]);
        }
        return str3;
    }

    public static void l(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebf321a3", new Object[]{context, str, str2});
        } else if (TextUtils.isEmpty(str2)) {
            ALog.e("Utils", "setSpValue null", new Object[0]);
        } else {
            try {
                synchronized (f17474a) {
                    SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).edit();
                    edit.putString(str, str2);
                    edit.apply();
                }
                ALog.i("Utils", "setSpValue", "key", str, "value", str2);
            } catch (Exception e) {
                ALog.e("Utils", "setSpValue fail", e, new Object[0]);
            }
        }
    }
}
