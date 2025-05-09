package com.taobao.android.diagnose.collector;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.telephony.TelephonyManager;
import androidx.core.content.ContextCompat;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.collector.NetworkObserver;
import com.taobao.android.diagnose.model.NetInfo;
import com.taobao.tao.log.logger.EventLogger;
import tb.al7;
import tb.cwj;
import tb.idh;
import tb.t2o;
import tb.uk7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NetworkObserver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class NetworkStatusListener extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(615514136);
        }

        public static /* synthetic */ void b(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7d4ad605", new Object[]{context});
            } else {
                NetworkObserver.b(cwj.a(context));
            }
        }

        public static /* synthetic */ Object ipc$super(NetworkStatusListener networkStatusListener, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/diagnose/collector/NetworkObserver$NetworkStatusListener");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(final Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else {
                al7.b().a(new Runnable() { // from class: tb.wtj
                    @Override // java.lang.Runnable
                    public final void run() {
                        NetworkObserver.NetworkStatusListener.b(context);
                    }
                });
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a extends ConnectivityManager.NetworkCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Application f7244a;
        public final ConnectivityManager b;
        public final TelephonyManager c;

        static {
            t2o.a(615514135);
        }

        public a(Application application) {
            this.f7244a = application;
            this.c = (TelephonyManager) application.getSystemService("phone");
            this.b = (ConnectivityManager) application.getSystemService("connectivity");
        }

        public static /* synthetic */ void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73870e4c", new Object[0]);
            } else {
                NetworkObserver.a(3, 0, "");
            }
        }

        public static /* synthetic */ void g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e352f199", new Object[0]);
            } else {
                NetworkObserver.a(4, 0, "");
            }
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 838841652) {
                super.onAvailable((Network) objArr[0]);
                return null;
            } else if (hashCode == 957220088) {
                super.onUnavailable();
                return null;
            } else if (hashCode == 2071672155) {
                super.onLost((Network) objArr[0]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/diagnose/collector/NetworkObserver$NetworkStatusCallback");
            }
        }

        public final int d(Network network) {
            int dataNetworkType;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9c9bf270", new Object[]{this, network})).intValue();
            }
            try {
                NetworkCapabilities networkCapabilities = this.b.getNetworkCapabilities(network);
                if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                    if (!networkCapabilities.hasTransport(1) && !networkCapabilities.hasTransport(5)) {
                        if (networkCapabilities.hasTransport(0)) {
                            if (ContextCompat.checkSelfPermission(this.f7244a, "android.permission.READ_PHONE_STATE") != 0) {
                                return 1;
                            }
                            dataNetworkType = this.c.getDataNetworkType();
                            return cwj.b(dataNetworkType);
                        } else if (networkCapabilities.hasTransport(3)) {
                            return 8;
                        } else {
                            return 9;
                        }
                    }
                    return 7;
                }
            } catch (Exception e) {
                idh.c("NetworkStatusCallback", "getNetType", e);
            }
            return 0;
        }

        public final /* synthetic */ void e(Network network) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("28df9987", new Object[]{this, network});
            } else {
                NetworkObserver.a(2, d(network), this.c.getSimOperator());
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(final Network network) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("31ffb534", new Object[]{this, network});
                return;
            }
            super.onAvailable(network);
            al7.b().a(new Runnable() { // from class: tb.utj
                @Override // java.lang.Runnable
                public final void run() {
                    NetworkObserver.a.this.e(network);
                }
            });
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b7b355b", new Object[]{this, network});
                return;
            }
            super.onLost(network);
            al7.b().a(new Runnable() { // from class: tb.vtj
                @Override // java.lang.Runnable
                public final void run() {
                    NetworkObserver.a.f();
                }
            });
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("390e04f8", new Object[]{this});
                return;
            }
            super.onUnavailable();
            al7.b().a(new Runnable() { // from class: tb.ttj
                @Override // java.lang.Runnable
                public final void run() {
                    NetworkObserver.a.g();
                }
            });
        }
    }

    static {
        t2o.a(615514134);
    }

    public static void b(NetInfo netInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e2f0f6d", new Object[]{netInfo});
        } else {
            a(netInfo.getStatus(), netInfo.getType(), netInfo.getOperator());
        }
    }

    public static void a(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57f05057", new Object[]{new Integer(i), new Integer(i2), str});
            return;
        }
        try {
            uk7.i().g().s(new NetInfo(i, i2, str));
            EventLogger.builder(4).setPageID(uk7.i().g().j()).setData("status", String.valueOf(i)).setData("type", String.valueOf(i2)).setData("operate", str).log(al7.b().c());
            idh.a(RPCDataItems.SWITCH_TAG_LOG, String.format("Network status changed: Status: %d, Type:%d", Integer.valueOf(i), Integer.valueOf(i2)));
        } catch (Exception e) {
            idh.c("NetworkStatusCallback", "updateNetStatus", e);
        }
    }
}
