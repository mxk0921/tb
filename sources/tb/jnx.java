package tb;

import android.content.Context;
import android.content.IntentFilter;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.xstate.network.NetworkStateReceiver;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class jnx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static NetworkStateReceiver b;
    public static Context c;

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, String> f22108a = new ConcurrentHashMap<>();
    public static volatile boolean d = false;

    static {
        t2o.a(589300088);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73d32de9", new Object[]{context});
            return;
        }
        try {
            if (!d) {
                TBSdkLog.e("mtopsdk.XStateDelegate", "[checkInit]XState init called.");
                if (context == null) {
                    TBSdkLog.e("mtopsdk.XStateDelegate", "[checkInit]parameter context for init(Context context) is null.");
                    return;
                }
                c = context;
                if (b == null) {
                    b = new NetworkStateReceiver();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    context.registerReceiver(b, intentFilter);
                }
                d = true;
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    TBSdkLog.i("mtopsdk.XStateDelegate", "[checkInit] init XState OK,isInit=" + d);
                }
            }
        } catch (Throwable th) {
            TBSdkLog.e("mtopsdk.XStateDelegate", "[checkInit] checkInit error --" + th.toString());
        }
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4afea14", new Object[]{str});
        }
        ConcurrentHashMap<String, String> concurrentHashMap = f22108a;
        if (concurrentHashMap == null || str == null) {
            return null;
        }
        return concurrentHashMap.get(str);
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
        } else if (!d) {
            a(context);
        }
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f6b8294", new Object[]{str});
        }
        ConcurrentHashMap<String, String> concurrentHashMap = f22108a;
        if (concurrentHashMap == null || str == null) {
            return null;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            TBSdkLog.d("mtopsdk.XStateDelegate", "remove XState key=".concat(str));
        }
        return concurrentHashMap.remove(str);
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b8d794a", new Object[]{str, str2});
            return;
        }
        ConcurrentHashMap<String, String> concurrentHashMap = f22108a;
        if (concurrentHashMap != null && str != null && str2 != null) {
            concurrentHashMap.put(str, str2);
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                TBSdkLog.d("mtopsdk.XStateDelegate", "[setValue]set  XStateID succeed," + str + "=" + str2);
            }
        } else if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
            TBSdkLog.e("mtopsdk.XStateDelegate", "[setValue]set  XStateID failed,key=" + str + ",value=" + str2);
        }
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ec0ab50", new Object[0]);
        } else if (d) {
            try {
                if (SwitchConfig.getInstance().isXStateOpt()) {
                    TBSdkLog.e("mtopsdk.XStateDelegate", "[unInit]XState not need to unInit.", new Throwable());
                    return;
                }
                TBSdkLog.e("mtopsdk.XStateDelegate", "[unInit]XState unInit called.", new Throwable());
                if (d) {
                    ConcurrentHashMap<String, String> concurrentHashMap = f22108a;
                    if (concurrentHashMap != null) {
                        concurrentHashMap.clear();
                    }
                    Context context = c;
                    if (context == null) {
                        TBSdkLog.e("mtopsdk.XStateDelegate", "[unInit] context in Class XState is null.");
                        return;
                    }
                    NetworkStateReceiver networkStateReceiver = b;
                    if (networkStateReceiver != null) {
                        context.unregisterReceiver(networkStateReceiver);
                        b = null;
                    }
                    d = false;
                    if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                        TBSdkLog.i("mtopsdk.XStateDelegate", "[unInit] unInit XState OK,isInit=" + d);
                    }
                }
            } catch (Exception e) {
                TBSdkLog.e("mtopsdk.XStateDelegate", "[unInit] unInit error --" + e.toString());
            }
        }
    }
}
