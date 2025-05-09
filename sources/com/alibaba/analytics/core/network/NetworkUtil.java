package com.alibaba.analytics.core.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.nhh;
import tb.o1v;
import tb.o2w;
import tb.t2o;
import tb.zdt;
import tb.ztj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NetworkUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NETWORK_CLASS_2_3_G = "2G/3G";
    public static final String NETWORK_CLASS_2_G = "2G";
    public static final String NETWORK_CLASS_3_G = "3G";
    public static final String NETWORK_CLASS_4_G = "4G";
    public static final String NETWORK_CLASS_5_G = "5G";
    public static final String NETWORK_CLASS_UNKNOWN = "Unknown";
    public static final String NETWORK_CLASS_WIFI = "Wi-Fi";

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f2124a = {"Unknown", "Unknown"};
    public static boolean b = false;
    public static boolean c = false;
    public static boolean d = false;
    public static final NetworkStatusReceiver e = new NetworkStatusReceiver();
    public static final b f = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class NetworkStatusReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(962592912);
        }

        private NetworkStatusReceiver() {
        }

        public static /* synthetic */ Object ipc$super(NetworkStatusReceiver networkStatusReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/analytics/core/network/NetworkUtil$NetworkStatusReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else {
                zdt.c().f(NetworkUtil.a().a(context));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Context f2125a;

        static {
            t2o.a(962592911);
        }

        private b() {
        }

        public b a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f512ce95", new Object[]{this, context});
            }
            this.f2125a = context;
            return this;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Context context = this.f2125a;
            if (context != null) {
                NetworkUtil.b(context);
                ztj.f(this.f2125a);
                o1v.k(this.f2125a);
            }
        }
    }

    static {
        t2o.a(962592909);
    }

    public static /* synthetic */ b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("22d288ba", new Object[0]);
        }
        return f;
    }

    public static /* synthetic */ void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2874c7ce", new Object[]{context});
        } else {
            g(context);
        }
    }

    public static String d(Context context) {
        String[] f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("934c45b1", new Object[]{context});
        }
        try {
            f2 = f(context);
        } catch (Exception unused) {
        }
        if (f2[0].equals(NETWORK_CLASS_2_3_G)) {
            return f2[1];
        }
        if (f2[1].equals("5G")) {
            return "5G";
        }
        return "Unknown";
    }

    public static String e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4623af24", new Object[]{new Integer(i)});
        }
        if (i == 20) {
            return "4G";
        }
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return "3G";
            case 13:
                return "4G";
            default:
                return "Unknown";
        }
    }

    public static String[] f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("bb6ab417", new Object[]{context});
        }
        if (!b) {
            g(context);
        }
        return f2124a;
    }

    public static String h() {
        NetworkInfo activeNetworkInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("385238e7", new Object[0]);
        }
        Context g = o2w.k().g();
        if (g == null) {
            return "Unknown";
        }
        try {
            if (g.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", g.getPackageName()) == 0 && (activeNetworkInfo = ((ConnectivityManager) g.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) {
                if (activeNetworkInfo.getType() == 1) {
                    return "Wi-Fi";
                }
                if (activeNetworkInfo.getType() == 0) {
                    return e(activeNetworkInfo.getSubtype());
                }
            }
        } catch (Throwable unused) {
        }
        return "Unknown";
    }

    public static void m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("381c355e", new Object[]{context});
        } else if (context != null) {
            context.registerReceiver(e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            try {
                ztj.e(context);
            } catch (Exception unused) {
            }
            zdt.c().f(f.a(context));
        }
    }

    public static void n(Context context) {
        NetworkStatusReceiver networkStatusReceiver;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72121245", new Object[]{context});
        } else if (context != null && (networkStatusReceiver = e) != null) {
            context.unregisterReceiver(networkStatusReceiver);
        }
    }

    public static String c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e973a879", new Object[]{context});
        }
        try {
            return f(context)[0];
        } catch (Exception unused) {
            return "Unknown";
        }
    }

    public static boolean j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("446cfca9", new Object[]{context})).booleanValue();
        }
        if (c) {
            return d;
        }
        try {
            try {
                boolean is5GHzBandSupported = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).is5GHzBandSupported();
                d = is5GHzBandSupported;
                return is5GHzBandSupported;
            } catch (Throwable unused) {
                return d;
            }
        } finally {
            c = true;
        }
    }

    public static synchronized void g(Context context) {
        synchronized (NetworkUtil.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d68b1957", new Object[]{context});
            } else if (context != null) {
                try {
                } catch (Exception e2) {
                    nhh.f("NetworkUtil", e2);
                }
                if (context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) != 0) {
                    String[] strArr = f2124a;
                    strArr[0] = "Unknown";
                    strArr[1] = "Unknown";
                    return;
                }
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager == null) {
                    String[] strArr2 = f2124a;
                    strArr2[0] = "Unknown";
                    strArr2[1] = "Unknown";
                    return;
                }
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    String[] strArr3 = f2124a;
                    strArr3[0] = "Unknown";
                    strArr3[1] = "Unknown";
                } else if (1 == activeNetworkInfo.getType()) {
                    String[] strArr4 = f2124a;
                    strArr4[0] = "Wi-Fi";
                    strArr4[1] = "Unknown";
                } else if (activeNetworkInfo.getType() == 0) {
                    String[] strArr5 = f2124a;
                    strArr5[0] = NETWORK_CLASS_2_3_G;
                    strArr5[1] = activeNetworkInfo.getSubtypeName();
                }
                if (!b) {
                    b = true;
                }
            }
        }
    }

    public static boolean i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80c41504", new Object[]{context})).booleanValue();
        }
        if (context != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null && context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) == 0) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        return activeNetworkInfo.isConnected();
                    }
                    return false;
                }
            } catch (Exception unused) {
            }
        }
        return true;
    }

    public static boolean k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33988239", new Object[]{context})).booleanValue();
        }
        if (context != null) {
            try {
                String str = f(context)[0];
                if (str.equals("2G") || str.equals("3G") || str.equals("4G") || str.equals(NETWORK_CLASS_2_3_G)) {
                    nhh.f("NetworkUtil", "isMobile");
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c896226", new Object[]{context})).booleanValue();
        }
        if (context != null) {
            try {
                if (f(context)[0].equals("Wi-Fi")) {
                    nhh.f("NetworkUtil", "isWifi");
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
