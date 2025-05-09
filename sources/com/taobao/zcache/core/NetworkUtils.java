package com.taobao.zcache.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY;
import com.taobao.android.riverlogger.RVLLevel;
import tb.lcn;
import tb.t2o;
import tb.tft;
import tb.yox;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class NetworkUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static BroadcastReceiver f14182a = null;
    public static a b = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void a(int i);
    }

    static {
        t2o.a(996147253);
    }

    public static /* synthetic */ a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("285e22ab", new Object[0]);
        }
        return b;
    }

    public static int b() {
        NetworkInfo networkInfo;
        NetworkInfo.State state;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f618e03a", new Object[0])).intValue();
        }
        Context g = yox.g();
        ConnectivityManager connectivityManager = (ConnectivityManager) g.getSystemService("connectivity");
        if (connectivityManager == null) {
            return 0;
        }
        try {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Exception unused) {
            networkInfo = null;
        }
        if (networkInfo == null || !networkInfo.isAvailable()) {
            return 0;
        }
        NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(1);
        if (networkInfo2 != null && (state = networkInfo2.getState()) != null && (state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING)) {
            return 1;
        }
        TelephonyManager telephonyManager = (TelephonyManager) g.getSystemService("phone");
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                i = telephonyManager.getDataNetworkType();
            } catch (SecurityException unused2) {
            }
        } else {
            i = ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getNetworkType(telephonyManager);
        }
        return (i == 1 || i == 2 || i == 4 || i == 7 || i == 11 || i == 16) ? 2 : 3;
    }

    public static void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edf1d367", new Object[]{aVar});
        } else if (aVar != null) {
            if (f14182a == null) {
                try {
                    f14182a = new BroadcastReceiver() { // from class: com.taobao.zcache.core.NetworkUtils.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        /* compiled from: Taobao */
                        /* renamed from: com.taobao.zcache.core.NetworkUtils$1$a */
                        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
                        public class a implements Runnable {
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            public a() {
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange = $ipChange;
                                if (ipChange instanceof IpChange) {
                                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    NetworkUtils.a().a(NetworkUtils.b());
                                }
                            }
                        }

                        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                            str.hashCode();
                            int hashCode = str.hashCode();
                            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/zcache/core/NetworkUtils$1");
                        }

                        @Override // android.content.BroadcastReceiver
                        public void onReceive(Context context, Intent intent) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                            } else if (NetworkUtils.a() != null) {
                                tft.b(new a());
                            }
                        }
                    };
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    yox.g().getApplicationContext().registerReceiver(f14182a, intentFilter);
                } catch (Throwable th) {
                    lcn.a(RVLLevel.Error, "ZCache/Setup").j("registerNetworkStatusListener").g(101, th.getLocalizedMessage()).f();
                }
            }
            b = aVar;
        }
    }
}
