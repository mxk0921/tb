package com.taobao.downloader.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY;
import java.io.Serializable;
import tb.fs7;
import tb.xh4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class NetworkManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static NetworkManager d;

    /* renamed from: a  reason: collision with root package name */
    public final a f10391a;
    public final Context b;
    public NetChangeListener c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface NetChangeListener extends Serializable {
        void onChange(a aVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f10393a;
    }

    public NetworkManager(Context context) {
        this.b = context;
        a aVar = new a();
        this.f10391a = aVar;
        d();
        xh4.n = aVar.f10393a;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        try {
            context.registerReceiver(new BroadcastReceiver() { // from class: com.taobao.downloader.manager.NetworkManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/downloader/manager/NetworkManager$1");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                        return;
                    }
                    int i = NetworkManager.a(NetworkManager.this).f10393a;
                    NetworkManager.b(NetworkManager.this);
                    xh4.n = NetworkManager.a(NetworkManager.this).f10393a;
                    if (i == NetworkManager.a(NetworkManager.this).f10393a) {
                        fs7.c("NetworkManager", "network status is not changed", "netType", Integer.valueOf(i));
                    } else if (NetworkManager.c(NetworkManager.this) != null) {
                        NetworkManager.c(NetworkManager.this).onChange(NetworkManager.a(NetworkManager.this));
                    }
                }
            }, intentFilter);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static /* synthetic */ a a(NetworkManager networkManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("630af3a3", new Object[]{networkManager});
        }
        return networkManager.f10391a;
    }

    public static /* synthetic */ void b(NetworkManager networkManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("867b597f", new Object[]{networkManager});
        } else {
            networkManager.d();
        }
    }

    public static /* synthetic */ NetChangeListener c(NetworkManager networkManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetChangeListener) ipChange.ipc$dispatch("41f02cc0", new Object[]{networkManager});
        }
        return networkManager.c;
    }

    public static NetworkManager e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkManager) ipChange.ipc$dispatch("d8814927", new Object[]{context});
        }
        if (d == null && context != null) {
            d = new NetworkManager(context);
        }
        return d;
    }

    public a f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("e4689c30", new Object[]{this});
        }
        return this.f10391a;
    }

    public final boolean g(ConnectivityManager connectivityManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56709450", new Object[]{this, connectivityManager})).booleanValue();
        }
        try {
            return connectivityManager.isActiveNetworkMetered();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void h(NetChangeListener netChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ece670", new Object[]{this, netChangeListener});
        } else {
            this.c = netChangeListener;
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("123561f2", new Object[]{this});
            return;
        }
        a aVar = this.f10391a;
        aVar.f10393a = 0;
        aVar.getClass();
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e707f307", new Object[]{this});
            return;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.b.getSystemService("connectivity");
            if (connectivityManager == null) {
                i();
                return;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                i();
            } else if (activeNetworkInfo.getType() == 1) {
                if (g(connectivityManager)) {
                    this.f10391a.f10393a = 1;
                } else {
                    this.f10391a.f10393a = 4;
                }
                this.f10391a.getClass();
            } else {
                this.f10391a.f10393a = 2;
                a aVar = this.f10391a;
                ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getNetworkType((TelephonyManager) this.b.getSystemService("phone"));
                aVar.getClass();
            }
        } catch (Throwable unused) {
            i();
        }
    }
}
