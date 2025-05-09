package com.mobile.auth;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Build;
import android.text.TextUtils;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class OOO0oO {
    private static OOO0oO O00000oo;
    private Network O000000o = null;
    private ConnectivityManager.NetworkCallback O00000Oo = null;
    private ConnectivityManager O00000o0 = null;
    private List<O000000o> O00000o = new ArrayList();
    private Timer O00000oO = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface O000000o {
        void O000000o(boolean z, Object obj);
    }

    private OOO0oO() {
    }

    public static /* synthetic */ Network O000000o(OOO0oO oOO0oO) {
        try {
            return oOO0oO.O000000o;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static /* synthetic */ ConnectivityManager O00000Oo(OOO0oO oOO0oO) {
        try {
            return oOO0oO.O00000o0;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static /* synthetic */ Network O000000o(OOO0oO oOO0oO, Network network) {
        try {
            oOO0oO.O000000o = network;
            return network;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public final synchronized void O00000Oo() {
        ConnectivityManager.NetworkCallback networkCallback;
        try {
            try {
                Timer timer = this.O00000oO;
                if (timer != null) {
                    timer.cancel();
                    this.O00000oO = null;
                }
                ConnectivityManager connectivityManager = this.O00000o0;
                if (!(connectivityManager == null || (networkCallback = this.O00000Oo) == null)) {
                    connectivityManager.unregisterNetworkCallback(networkCallback);
                }
                this.O00000o0 = null;
                this.O00000Oo = null;
                this.O000000o = null;
                this.O00000o.clear();
            } catch (Exception unused) {
                OOO.O00000Oo();
            }
        } finally {
        }
    }

    public static OOO0oO O000000o() {
        try {
            if (O00000oo == null) {
                synchronized (OOO0oO.class) {
                    if (O00000oo == null) {
                        O00000oo = new OOO0oO();
                    }
                }
            }
            return O00000oo;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public final synchronized void O000000o(Context context, O000000o o000000o) {
        try {
            Network network = this.O000000o;
            if (network != null) {
                o000000o.O000000o(true, network);
                return;
            }
            O000000o(o000000o);
            if (this.O00000Oo == null || this.O00000o.size() < 2) {
                try {
                    this.O00000o0 = (ConnectivityManager) context.getSystemService("connectivity");
                    NetworkRequest.Builder builder = new NetworkRequest.Builder();
                    builder.addTransportType(0);
                    builder.addCapability(12);
                    NetworkRequest build = builder.build();
                    this.O00000Oo = new ConnectivityManager.NetworkCallback() { // from class: com.mobile.auth.OOO0oO.1
                        @Override // android.net.ConnectivityManager.NetworkCallback
                        public final void onAvailable(Network network2) {
                            try {
                                super.onAvailable(network2);
                                OOO.O00000o0("Network onAvailable");
                                OOO0oO.O000000o(OOO0oO.this, network2);
                                OOO0oO.O000000o(OOO0oO.this, true, network2);
                                try {
                                    String extraInfo = OOO0oO.O00000Oo(OOO0oO.this).getNetworkInfo(OOO0oO.O000000o(OOO0oO.this)).getExtraInfo();
                                    if (!TextUtils.isEmpty(extraInfo)) {
                                        OOOO00O.O00000o(extraInfo);
                                    }
                                } catch (Exception unused) {
                                    OOO.O00000Oo();
                                }
                            } catch (Throwable th) {
                                ExceptionProcessor.processException(th);
                            }
                        }

                        @Override // android.net.ConnectivityManager.NetworkCallback
                        public final void onLost(Network network2) {
                            try {
                                super.onLost(network2);
                                OOO.O00000o0("Network onLost");
                                OOO0oO.this.O00000Oo();
                            } catch (Throwable th) {
                                ExceptionProcessor.processException(th);
                            }
                        }

                        @Override // android.net.ConnectivityManager.NetworkCallback
                        public final void onUnavailable() {
                            try {
                                super.onUnavailable();
                                OOO.O00000o0("Network onUnavailable");
                                OOO0oO.O000000o(OOO0oO.this, false, null);
                                OOO0oO.this.O00000Oo();
                            } catch (Throwable th) {
                                ExceptionProcessor.processException(th);
                            }
                        }
                    };
                    int i = 3000;
                    if (OOOO00O.O0000O0o() < 3000) {
                        i = 2000;
                    }
                    if (Build.VERSION.SDK_INT >= 26) {
                        this.O00000o0.requestNetwork(build, this.O00000Oo, i);
                        return;
                    }
                    Timer timer = new Timer();
                    this.O00000oO = timer;
                    timer.schedule(new TimerTask() { // from class: com.mobile.auth.OOO0oO.2
                        @Override // java.util.TimerTask, java.lang.Runnable
                        public final void run() {
                            try {
                                OOO0oO.O000000o(OOO0oO.this, false, null);
                            } catch (Throwable th) {
                                ExceptionProcessor.processException(th);
                            }
                        }
                    }, i);
                    this.O00000o0.requestNetwork(build, this.O00000Oo);
                } catch (Exception unused) {
                    OOO.O00000Oo();
                    O000000o(false, (Network) null);
                }
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    private synchronized void O000000o(O000000o o000000o) {
        try {
            try {
                this.O00000o.add(o000000o);
            } catch (Exception unused) {
                OOO.O00000Oo();
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static /* synthetic */ void O000000o(OOO0oO oOO0oO, boolean z, Network network) {
        try {
            oOO0oO.O000000o(z, network);
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    private synchronized void O000000o(boolean z, Network network) {
        try {
            try {
                Timer timer = this.O00000oO;
                if (timer != null) {
                    timer.cancel();
                    this.O00000oO = null;
                }
                for (O000000o o000000o : this.O00000o) {
                    o000000o.O000000o(z, network);
                }
                this.O00000o.clear();
            } catch (Exception unused) {
                OOO.O00000Oo();
            }
        } finally {
        }
    }
}
