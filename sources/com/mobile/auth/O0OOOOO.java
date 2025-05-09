package com.mobile.auth;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O0OOOOO {
    private static O0OOOOO O000000o;
    private ConnectivityManager O00000Oo;
    private ConnectivityManager.NetworkCallback O00000o;
    private Network O00000o0;
    private boolean O00000oO;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface O000000o {
        void O000000o(Network network);
    }

    private O0OOOOO(Context context) {
        try {
            this.O00000Oo = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void O00000Oo() {
        if (this.O00000Oo != null) {
            try {
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (this.O00000o != null) {
                O0O0O.O00000Oo("WifiNetworkUtils", "unregisterNetwork");
                this.O00000Oo.unregisterNetworkCallback(this.O00000o);
                this.O00000o = null;
                this.O00000o0 = null;
            }
        }
    }

    public static O0OOOOO O000000o(Context context) {
        if (O000000o == null) {
            synchronized (O0OOOOO.class) {
                try {
                    if (O000000o == null) {
                        O000000o = new O0OOOOO(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return O000000o;
    }

    public synchronized void O000000o(final O000000o o000000o) {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = this.O00000Oo;
        if (connectivityManager == null) {
            O0O0O.O000000o("WifiNetworkUtils", "mConnectivityManager 为空");
            o000000o.O000000o(null);
            return;
        }
        Network network = this.O00000o0;
        if (network == null || this.O00000oO || (networkInfo = connectivityManager.getNetworkInfo(network)) == null || !networkInfo.isAvailable()) {
            ConnectivityManager.NetworkCallback networkCallback = this.O00000o;
            if (networkCallback != null) {
                try {
                    this.O00000Oo.unregisterNetworkCallback(networkCallback);
                } catch (Exception e) {
                    e.printStackTrace();
                    this.O00000o = null;
                }
                O0O0O.O000000o("HttpUtils", "clear: ");
            }
            NetworkRequest build = new NetworkRequest.Builder().addCapability(12).addTransportType(0).build();
            ConnectivityManager.NetworkCallback networkCallback2 = new ConnectivityManager.NetworkCallback() { // from class: com.mobile.auth.O0OOOOO.1
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(Network network2) {
                    O0OOOOO.this.O00000oO = true;
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(Network network2) {
                    try {
                        if (O0OOOOO.this.O00000Oo.getNetworkCapabilities(network2).hasTransport(0)) {
                            O0OOOOO.this.O00000o0 = network2;
                            o000000o.O000000o(network2);
                            O0OOOOO.this.O00000oO = false;
                        } else {
                            O0O0O.O000000o("WifiNetworkUtils", "切换失败，未开启数据网络");
                            O0OOOOO.this.O00000o0 = null;
                            o000000o.O000000o(null);
                            O0OOOOO.this.O00000Oo.unregisterNetworkCallback(O0OOOOO.this.O00000o);
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        O0OOOOO.this.O00000o0 = null;
                        o000000o.O000000o(null);
                    }
                }
            };
            this.O00000o = networkCallback2;
            try {
                this.O00000Oo.requestNetwork(build, networkCallback2);
            } catch (Exception e2) {
                e2.printStackTrace();
                o000000o.O000000o(null);
            }
            return;
        }
        O0O0O.O000000o("HttpUtils", "reuse network: ");
        o000000o.O000000o(this.O00000o0);
    }

    public boolean O000000o() {
        return this.O00000o0 != null;
    }
}
