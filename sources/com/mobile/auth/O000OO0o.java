package com.mobile.auth;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import anet.channel.util.HttpConstant;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.net.InetAddress;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O000OO0o {
    private static final String O000000o = "O000OO0o";
    private O000000o O00000oO;
    private boolean O00000Oo = false;
    private ConnectivityManager O00000o0 = null;
    private ConnectivityManager.NetworkCallback O00000o = null;
    private long O00000oo = 0;
    private long O0000O0o = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface O000000o {
        void O000000o();

        void O000000o(int i, String str, long j);

        void O000000o(Network network, long j);
    }

    public static int O000000o(String str) {
        try {
            byte[] address = InetAddress.getByName(str).getAddress();
            return (address[0] & 255) | ((address[3] & 255) << 24) | ((address[2] & 255) << 16) | ((address[1] & 255) << 8);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return -1;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return -1;
            }
        }
    }

    public static /* synthetic */ O000000o O00000Oo(O000OO0o o000OO0o) {
        try {
            return o000OO0o.O00000oO;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public static /* synthetic */ long O00000o(O000OO0o o000OO0o) {
        try {
            return o000OO0o.O0000O0o;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return -1L;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return -1L;
            }
        }
    }

    public static /* synthetic */ void O00000o0(O000OO0o o000OO0o) {
        try {
            o000OO0o.O00000Oo();
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public static /* synthetic */ long O00000oO(O000OO0o o000OO0o) {
        try {
            return o000OO0o.O00000oo;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return -1L;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return -1L;
            }
        }
    }

    public static /* synthetic */ ConnectivityManager O00000oo(O000OO0o o000OO0o) {
        try {
            return o000OO0o.O00000o0;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public static /* synthetic */ long O000000o(O000OO0o o000OO0o, long j) {
        try {
            o000OO0o.O00000oo = j;
            return j;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return -1L;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return -1L;
            }
        }
    }

    public static String O00000Oo(String str) {
        try {
            int indexOf = str.indexOf(HttpConstant.SCHEME_SPLIT);
            if (indexOf > 0) {
                str = str.substring(indexOf + 3);
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 >= 0) {
                str = str.substring(0, indexOf2);
            }
            int indexOf3 = str.indexOf(47);
            if (indexOf3 >= 0) {
                str = str.substring(0, indexOf3);
            }
            int indexOf4 = str.indexOf(63);
            return indexOf4 >= 0 ? str.substring(0, indexOf4) : str;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public static /* synthetic */ ConnectivityManager O000000o(O000OO0o o000OO0o, ConnectivityManager connectivityManager) {
        try {
            o000OO0o.O00000o0 = connectivityManager;
            return connectivityManager;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    private void O00000Oo() {
        ConnectivityManager.NetworkCallback networkCallback;
        try {
            ConnectivityManager connectivityManager = this.O00000o0;
            if (connectivityManager != null && (networkCallback = this.O00000o) != null) {
                connectivityManager.unregisterNetworkCallback(networkCallback);
                this.O00000o0 = null;
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public static /* synthetic */ String O000000o() {
        try {
            return O000000o;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    private boolean O00000Oo(Context context, String str) {
        boolean z;
        Throwable th;
        try {
            Class<?> cls = Class.forName("android.net.ConnectivityManager");
            this.O00000oo = 0L;
            this.O0000O0o = System.currentTimeMillis();
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            this.O00000o0 = connectivityManager;
            if (connectivityManager.getNetworkInfo(5).getState().compareTo(NetworkInfo.State.CONNECTED) != 0) {
                cls.getMethod("startUsingNetworkFeature", Integer.TYPE, String.class).invoke(this.O00000o0, 0, "enableHIPRI");
                for (int i = 0; i < 5 && this.O00000o0.getNetworkInfo(5).getState().compareTo(NetworkInfo.State.CONNECTED) != 0; i++) {
                    Thread.sleep(500L);
                }
            }
            int O000000o2 = O000000o(O00000Oo(str));
            Class<?> cls2 = Integer.TYPE;
            boolean booleanValue = ((Boolean) cls.getMethod("requestRouteToHost", cls2, cls2).invoke(this.O00000o0, 5, Integer.valueOf(O000000o2))).booleanValue();
            try {
                this.O00000oo = System.currentTimeMillis() - this.O0000O0o;
                String str2 = O000000o;
                com.mobile.auth.O000000o.O000000o(str2, "Switch network result ： " + booleanValue + " (4.x) , expendTime ：" + this.O00000oo);
                return booleanValue;
            } catch (Throwable th2) {
                th = th2;
                z = booleanValue;
                try {
                    com.mobile.auth.O000000o.O000000o(O000000o, "4.x网络切换异常", th);
                    return z;
                } catch (Throwable th3) {
                    try {
                        ExceptionProcessor.processException(th3);
                        return false;
                    } catch (Throwable th4) {
                        ExceptionProcessor.processException(th4);
                        return false;
                    }
                }
            }
        } catch (Throwable th5) {
            th = th5;
            z = false;
        }
    }

    public void O000000o(final int i) {
        try {
            O000o00.O000000o().O000000o(new Runnable() { // from class: com.mobile.auth.O000OO0o.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (i > 2500) {
                            Thread.sleep(2500L);
                            if (!O000OO0o.O000000o(O000OO0o.this)) {
                                if (O000OO0o.O00000Oo(O000OO0o.this) != null) {
                                    O000OO0o.O00000Oo(O000OO0o.this).O000000o(80800, "WIFI切换超时", 2500L);
                                }
                                com.mobile.auth.O000000o.O000000o(O000OO0o.O000000o(), "切换网络超时(L)");
                                O000OO0o.O00000o0(O000OO0o.this);
                                return;
                            }
                        }
                        int i2 = i;
                        if (i2 > 2500) {
                            i2 -= 2500;
                        }
                        Thread.sleep(i2);
                        if (O000OO0o.O00000Oo(O000OO0o.this) == null) {
                            return;
                        }
                        if (!O000OO0o.O000000o(O000OO0o.this)) {
                            O000OO0o.O00000Oo(O000OO0o.this).O000000o(80800, "WIFI切换超时", 2500L);
                            O000OO0o.O00000o0(O000OO0o.this);
                            return;
                        }
                        O000OO0o.O00000Oo(O000OO0o.this).O000000o();
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    private void O000000o(Context context) {
        try {
            this.O00000oo = 0L;
            this.O00000o0 = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
            this.O0000O0o = System.currentTimeMillis();
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            builder.addCapability(12);
            builder.addTransportType(0);
            NetworkRequest build = builder.build();
            ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback() { // from class: com.mobile.auth.O000OO0o.2
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(Network network) {
                    try {
                        long currentTimeMillis = System.currentTimeMillis();
                        O000OO0o o000OO0o = O000OO0o.this;
                        O000OO0o.O000000o(o000OO0o, currentTimeMillis - O000OO0o.O00000o(o000OO0o));
                        O000OO0o.O000000o(O000OO0o.this, true);
                        if (O000OO0o.O00000Oo(O000OO0o.this) != null) {
                            O000OO0o.O00000Oo(O000OO0o.this).O000000o(network, O000OO0o.O00000oO(O000OO0o.this));
                        }
                        if (O000OO0o.O00000oo(O000OO0o.this) != null) {
                            O000OO0o.O00000oo(O000OO0o.this).unregisterNetworkCallback(this);
                            O000OO0o.O000000o(O000OO0o.this, (ConnectivityManager) null);
                        }
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            };
            this.O00000o = networkCallback;
            this.O00000o0.requestNetwork(build, networkCallback);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void O000000o(Context context, O000000o o000000o) {
        try {
            this.O00000oO = o000000o;
            O000000o(context);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public boolean O000000o(Context context, String str) {
        try {
            return O00000Oo(context, str);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    public static /* synthetic */ boolean O000000o(O000OO0o o000OO0o) {
        try {
            return o000OO0o.O00000Oo;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    public static /* synthetic */ boolean O000000o(O000OO0o o000OO0o, boolean z) {
        try {
            o000OO0o.O00000Oo = z;
            return z;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }
}
