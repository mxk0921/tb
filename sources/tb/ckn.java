package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.interceptor.RealTimeLogConfig;
import com.taobao.tao.log.interceptor.RealTimeLogMessageManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ckn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int RET_CONFIG_DISABLE = 2;
    public static final int RET_CONFIG_EMPTY = 4;
    public static final int RET_CONFIG_ENABLE = 1;
    public static final int RET_CONFIG_INVALID = 5;
    public static final int RET_FORBIDDEN = 3;
    public static final int RET_INTERNAL_ERROR = 8;
    public static final int RET_NET_LIMIT = 10;
    public static final int RET_REBOOT_EXPIRE = 7;
    public static final int RET_SERVER = 9;
    public static final int RET_TIME_EXPIRE = 6;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f17117a = false;
    public static boolean b = false;
    public static int c = 0;
    public static lkn d;

    static {
        t2o.a(767557661);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8117a4b6", new Object[]{context});
        } else if (b) {
            RealTimeLogMessageManager.k();
            b = false;
        }
    }

    public static synchronized int c(Context context, String str) {
        synchronized (ckn.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3d7ea3d4", new Object[]{context, str})).intValue();
            } else if (!e(context)) {
                Log.e("RealTimeLogManager", "handleConfig, RealTimeLog is forbidden");
                j(context, 3);
                return 3;
            } else {
                Log.e("RealTimeLogManager", "Receive RealTime Config from server: " + str);
                int h = h(context, str, false);
                c = h;
                if (h != 1) {
                    j(context, h);
                }
                return h;
            }
        }
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
        } else if (q4s.k()) {
            if (!RealTimeLogMessageManager.d(context)) {
                Log.e("RealTimeLogManager", "RealTimeMessageManager init failed!");
            } else if (!e(context)) {
                Log.e("RealTimeLogManager", "Init, RealTimeLog is forbidden!");
                c = 3;
                b(context);
            } else {
                String f = f(context);
                Log.e("RealTimeLogManager", "Read RealTime Config from local: " + f);
                int h = h(context, f, true);
                c = h;
                if (h != 1) {
                    if (h == 7) {
                        b = true;
                    }
                    b(context);
                }
            }
        }
    }

    public static boolean e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da5e398d", new Object[]{context})).booleanValue();
        }
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("tlog_real_time", q4s.l());
    }

    public static synchronized boolean i(Context context, RealTimeLogConfig realTimeLogConfig) {
        synchronized (ckn.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a407f9ac", new Object[]{context, realTimeLogConfig})).booleanValue();
            }
            realTimeLogConfig.toString();
            ewd n = j5s.j().n();
            if (n == null) {
                Log.e("RealTimeLogManager", "logUploader is null");
                return false;
            }
            lkn lknVar = d;
            if (lknVar == null) {
                lkn lknVar2 = new lkn(context.getApplicationContext(), realTimeLogConfig, n);
                d = lknVar2;
                lknVar2.f();
            } else {
                lknVar.h(realTimeLogConfig);
            }
            f17117a = true;
            return true;
        }
    }

    public static synchronized void j(Context context, int i) {
        synchronized (ckn.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e7255284", new Object[]{context, new Integer(i)});
                return;
            }
            lkn lknVar = d;
            if (lknVar != null) {
                lknVar.g();
                d = null;
            }
            c = i;
            b(context);
            if (f17117a) {
                f17117a = false;
                RealTimeLogMessageManager.j(i);
            }
        }
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b6e0374", new Object[]{context});
            return;
        }
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("real_time_log", 0);
            if (sharedPreferences.contains("config")) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.remove("config");
                edit.apply();
            }
        } catch (Exception e) {
            Log.e("RealTimeLogManager", "deleteConfig exception", e);
        }
    }

    public static String f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9490c17", new Object[]{context});
        }
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("real_time_log", 0);
            if (sharedPreferences.contains("config")) {
                return sharedPreferences.getString("config", "");
            }
        } catch (Exception e) {
            Log.e("RealTimeLogManager", "readConfig exception", e);
        }
        return "";
    }

    public static void g(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("635a3bac", new Object[]{context, str});
            return;
        }
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences("real_time_log", 0).edit();
            edit.putString("config", str);
            edit.apply();
        } catch (Exception e) {
            Log.e("RealTimeLogManager", "SaveConfig exception", e);
        }
    }

    public static synchronized int h(Context context, String str, boolean z) {
        RealTimeLogConfig realTimeLogConfig;
        synchronized (ckn.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b52aa9c0", new Object[]{context, str, new Boolean(z)})).intValue();
            } else if (TextUtils.isEmpty(str)) {
                Log.e("RealTimeLogManager", "The config is empty!");
                return 4;
            } else {
                try {
                    realTimeLogConfig = (RealTimeLogConfig) JSON.parseObject(str, RealTimeLogConfig.class);
                } catch (Exception e) {
                    Log.e("RealTimeLogManager", "parse config exception!", e);
                    realTimeLogConfig = null;
                }
                if (realTimeLogConfig == null) {
                    return 5;
                }
                if (!realTimeLogConfig.enable) {
                    Log.e("RealTimeLogManager", "The config is disable!");
                    return 2;
                } else if (TextUtils.isEmpty(realTimeLogConfig.token)) {
                    Log.e("RealTimeLogManager", "The config token is empty!");
                    return 5;
                } else if (z && realTimeLogConfig.expireTime == -1) {
                    Log.e("RealTimeLogManager", "The config only use once!");
                    return 7;
                } else if (realTimeLogConfig.expireTime != -1 && System.currentTimeMillis() > realTimeLogConfig.expireTime) {
                    Log.e("RealTimeLogManager", "The config is expire!");
                    return 6;
                } else if (!i(context, realTimeLogConfig)) {
                    Log.e("RealTimeLogManager", "start real time log failed!");
                    return 8;
                } else {
                    if (!z) {
                        g(context, JSON.toJSONString(realTimeLogConfig));
                    }
                    return 1;
                }
            }
        }
    }
}
