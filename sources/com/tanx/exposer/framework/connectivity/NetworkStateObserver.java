package com.tanx.exposer.framework.connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;
import java.util.List;
import tb.ed0;
import tb.qgh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class NetworkStateObserver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f5996a;
    public final List<b> b;
    public final ConnectivityManager c;
    public int d;
    public int e;
    public final BroadcastReceiver f;
    public ConnectivityManager.NetworkCallback g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends ConnectivityManager.NetworkCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 435028944) {
                super.onCapabilitiesChanged((Network) objArr[0], (NetworkCapabilities) objArr[1]);
                return null;
            } else if (hashCode == 2071672155) {
                super.onLost((Network) objArr[0]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/tanx/exposer/framework/connectivity/NetworkStateObserver$2");
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("19ee03d0", new Object[]{this, network, networkCapabilities});
                return;
            }
            super.onCapabilitiesChanged(network, networkCapabilities);
            if (networkCapabilities.hasCapability(16)) {
                if (networkCapabilities.hasTransport(1)) {
                    NetworkStateObserver.this.e = 1;
                } else if (networkCapabilities.hasTransport(0)) {
                    NetworkStateObserver.this.d();
                } else if (networkCapabilities.hasTransport(3)) {
                    NetworkStateObserver.this.e = 9;
                }
            }
            if (qgh.f26737a) {
                qgh.a("NetworkStateObserver", "onCapabilitiesChanged: cap = " + networkCapabilities + ", network = " + network + ", currentType = " + NetworkStateObserver.this.e + ", prevType = " + NetworkStateObserver.this.d);
            }
            NetworkStateObserver networkStateObserver = NetworkStateObserver.this;
            if (networkStateObserver.d != networkStateObserver.e) {
                networkStateObserver.c();
                NetworkStateObserver networkStateObserver2 = NetworkStateObserver.this;
                networkStateObserver2.d = networkStateObserver2.e;
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b7b355b", new Object[]{this, network});
                return;
            }
            super.onLost(network);
            if (qgh.f26737a) {
                qgh.a("NetworkStateObserver", "onLost: currentType = " + NetworkStateObserver.this.e + ", prev = " + NetworkStateObserver.this.d + ", network = " + network);
            }
            NetworkStateObserver.this.d();
            NetworkStateObserver networkStateObserver = NetworkStateObserver.this;
            if (networkStateObserver.d != networkStateObserver.e) {
                networkStateObserver.c();
                NetworkStateObserver networkStateObserver2 = NetworkStateObserver.this;
                networkStateObserver2.d = networkStateObserver2.e;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
        void a(int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c {
        public static final NetworkStateObserver tanxc_do = new NetworkStateObserver((byte) 0);

        static {
            t2o.a(283115566);
        }
    }

    static {
        t2o.a(283115562);
    }

    public /* synthetic */ NetworkStateObserver(byte b2) {
        this();
    }

    public synchronized void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e9ff2f1", new Object[]{this, bVar});
            return;
        }
        if (qgh.f26737a) {
            qgh.a("NetworkStateObserver", "addNetworkChangeListener: listener = " + bVar);
        }
        ((LinkedList) this.b).add(bVar);
        bVar.a(this.e);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd23f8e9", new Object[]{this})).booleanValue();
        }
        if (this.e != -1) {
            return true;
        }
        return false;
    }

    public synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34e889dd", new Object[]{this});
            return;
        }
        if (qgh.f26737a) {
            qgh.a("NetworkStateObserver", "notifyNetworkStateChanged: mPrevNetworkType = " + this.d + ", mCurrentNetworkType = " + this.e);
        }
        for (b bVar : this.b) {
            bVar.a(this.e);
        }
    }

    public void d() {
        NetworkInfo networkInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e52d6077", new Object[]{this});
            return;
        }
        try {
            networkInfo = this.c.getActiveNetworkInfo();
        } catch (Exception e) {
            qgh.b("NetworkStateObserver", "getActiveNetworkType exception.", e);
            networkInfo = null;
        }
        if (networkInfo == null) {
            this.e = -1;
            if (qgh.f26737a) {
                qgh.a("NetworkStateObserver", "getActiveNetworkType with null network info.");
                return;
            }
            return;
        }
        if (networkInfo.getType() == 1 && networkInfo.isConnected()) {
            this.e = 1;
        } else if (networkInfo.getType() == 0 && networkInfo.isConnected()) {
            this.e = 0;
        } else if (networkInfo.getType() != 9 || !networkInfo.isConnected()) {
            this.e = -1;
        } else {
            this.e = 9;
        }
        if (qgh.f26737a) {
            qgh.a("NetworkStateObserver", "getActiveNetworkType: mPrevNetworkType = " + this.d + ", mCurrentNetworkType = " + this.e + ", networkInfo = " + networkInfo);
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2029203", new Object[]{this});
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                NetworkRequest build = new NetworkRequest.Builder().build();
                if (this.g == null) {
                    this.g = new a();
                }
                this.c.registerNetworkCallback(build, this.g);
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            this.f5996a.registerReceiver(this.f, intentFilter);
        } catch (Throwable th) {
            qgh.b("NetworkStateObserver", "registerNetworkState exception.", th);
        }
    }

    public NetworkStateObserver() {
        this.d = -1;
        this.e = -1;
        this.f = new BroadcastReceiver() { // from class: com.tanx.exposer.framework.connectivity.NetworkStateObserver.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tanx/exposer/framework/connectivity/NetworkStateObserver$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                String action = intent.getAction();
                if (qgh.f26737a) {
                    qgh.a("NetworkStateObserver", "onReceive: action = " + action);
                }
                if (TextUtils.equals(action, "android.net.conn.CONNECTIVITY_CHANGE")) {
                    NetworkStateObserver.this.d();
                    NetworkStateObserver networkStateObserver = NetworkStateObserver.this;
                    if (networkStateObserver.d != networkStateObserver.e) {
                        networkStateObserver.c();
                        NetworkStateObserver networkStateObserver2 = NetworkStateObserver.this;
                        networkStateObserver2.d = networkStateObserver2.e;
                    }
                }
            }
        };
        Context f = ed0.h().f();
        this.f5996a = f;
        this.b = new LinkedList();
        try {
            this.c = (ConnectivityManager) f.getSystemService("connectivity");
        } catch (Exception e) {
            qgh.b("NetworkStateObserver", "get ConnectivityManager exception", e);
        }
        e();
        d();
    }
}
