package com.alipay.mobile.common.transport.httpdns;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.alipay.mobile.common.transport.utils.SharedPreUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class NetworkManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "HDNS_NetManager";
    public static final long changeInterval = 3600000;
    public static final long maxTimesLimit = 12;

    /* renamed from: a  reason: collision with root package name */
    public Context f4108a;
    public BroadcastReceiver b;
    public long changeBegin;
    public int changeCount;
    public Boolean lastConnected;
    public int netSubType;
    public int netType;
    public boolean neverReceive;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class Singleton {
        public static NetworkManager instance = new NetworkManager();
    }

    public static /* synthetic */ boolean access$100(NetworkManager networkManager, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d04aac4", new Object[]{networkManager, context})).booleanValue();
        }
        return networkManager.d(context);
    }

    public static /* synthetic */ void access$200(NetworkManager networkManager, Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62b7ef73", new Object[]{networkManager, context, new Boolean(z)});
        } else {
            networkManager.b(context, z);
        }
    }

    public static NetworkManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkManager) ipChange.ipc$dispatch("67335042", new Object[0]);
        }
        return Singleton.instance;
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            SharedPreUtils.putData(this.f4108a, "http_dns_netchangecount", i);
        }
    }

    public final void b(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258fda74", new Object[]{this, context, new Boolean(z)});
        }
    }

    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else if (this.f4108a != null) {
            LogCatUtil.info(TAG, "httpdns manager close");
            try {
                this.f4108a.unregisterReceiver(this.b);
            } catch (IllegalArgumentException e) {
                LogCatUtil.warn(TAG, "httpdns exception: " + e.toString());
            }
            this.b = null;
        }
    }

    public final boolean e(boolean z, int i, int i2) {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("270908d0", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (this.netType == -1 || this.netSubType == -1 || (bool = this.lastConnected) == null) {
            LogCatUtil.info(TAG, " New contivity broadcast！");
        } else if (bool.booleanValue() == z && this.netType == i && this.netSubType == i2) {
            LogCatUtil.info(TAG, " Old contivity broadcast！");
            return false;
        }
        return true;
    }

    public final boolean g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{this, context})).booleanValue();
        }
        if (context != null && this.f4108a == null && AlipayHttpDnsClient.getDnsClient().getFlag() == 0) {
            return true;
        }
        return false;
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        long l = l();
        this.changeBegin = l;
        if (l == -1) {
            k();
        }
        int j = j();
        this.changeCount = j;
        if (j == -1) {
            a(0);
        }
    }

    public final int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        return SharedPreUtils.getIntData(this.f4108a, "http_dns_netchangecount");
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            SharedPreUtils.putData(this.f4108a, "dns_netchange_begin", System.currentTimeMillis());
        }
    }

    public final long l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e1", new Object[]{this})).longValue();
        }
        return SharedPreUtils.getLonggData(this.f4108a, "dns_netchange_begin");
    }

    public synchronized void setNetworkContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7fb2b5e", new Object[]{this, context});
        } else if (g(context)) {
            this.f4108a = context;
            i();
            this.b = new BroadcastReceiver() { // from class: com.alipay.mobile.common.transport.httpdns.NetworkManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transport/httpdns/NetworkManager$1");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(final Context context2, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    } else if (intent != null && TextUtils.equals(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
                        LogCatUtil.info(NetworkManager.TAG, "onReceive at: " + getClass().getName() + ", Intent: " + intent);
                        try {
                            NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.transport.httpdns.NetworkManager.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        NetworkManager.access$100(NetworkManager.this, context2);
                                    }
                                }
                            });
                        } catch (Throwable th) {
                            LogCatUtil.error(NetworkManager.TAG, "setNetworkContext exception= " + th.toString());
                        }
                    }
                }
            };
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            context.registerReceiver(this.b, intentFilter);
        }
    }

    public NetworkManager() {
        this.changeBegin = -1L;
        this.changeCount = -1;
        this.f4108a = null;
        this.b = null;
        this.lastConnected = null;
        this.neverReceive = true;
        this.netType = -1;
        this.netSubType = -1;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (MiscUtils.isAtFrontDesk(this.f4108a)) {
            return f();
        }
        LogCatUtil.warn(TAG, "wallet isn't at front desk,httpdns ignore netchange");
        return false;
    }

    public final boolean d(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        if (h(context) == 1) {
            HttpDns.getInstance().getGetAllByNameHelper().clearCache();
            LogCatUtil.debug(TAG, "NetworkManager#onReceive 网络变化");
            if (this.neverReceive) {
                LogCatUtil.debug(TAG, "NetworkManager#onReceive first receive,ignore");
                this.neverReceive = false;
                NetworkAsyncTaskExecutor.schedule(new Runnable() { // from class: com.alipay.mobile.common.transport.httpdns.NetworkManager.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            NetworkManager.access$200(NetworkManager.this, context, true);
                        }
                    }
                }, 10L, TimeUnit.SECONDS);
                return true;
            }
            NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.transport.httpdns.NetworkManager.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    NetworkManager networkManager = NetworkManager.this;
                    NetworkManager.access$200(networkManager, context, networkManager.neverReceive);
                }
            });
            if (!c()) {
                return true;
            }
            LogCatUtil.info(TAG, "网络切换，发送强请求");
            HttpDns.getInstance().delayRequestStrong(1);
        }
        return false;
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        int j = j() + 1;
        this.changeCount = j;
        a(j);
        if (this.changeCount > 12) {
            long l = l();
            this.changeBegin = l;
            if (l + 3600000 < System.currentTimeMillis()) {
                a(1);
                k();
                LogCatUtil.info(TAG, "interval more than one hour,set changeCount 1");
            } else {
                LogCatUtil.info(TAG, "netchange exceeds 12 ,ignore it");
                return false;
            }
        }
        this.changeCount = j();
        LogCatUtil.info(TAG, "httpdns network change,changeCount= " + this.changeCount);
        return true;
    }

    public final int h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f76bb91", new Object[]{this, context})).intValue();
        }
        NetworkInfo activeNetworkInfo = NetworkUtils.getActiveNetworkInfo(context);
        if (activeNetworkInfo == null) {
            LogCatUtil.info(TAG, "当前无网络!");
            this.lastConnected = Boolean.FALSE;
            return 0;
        }
        boolean isAvailable = activeNetworkInfo.isAvailable();
        boolean isConnected = activeNetworkInfo.isConnected();
        int type = activeNetworkInfo.getType();
        int subtype = activeNetworkInfo.getSubtype();
        String extraInfo = activeNetworkInfo.getExtraInfo();
        if (!e(isConnected, type, subtype)) {
            return 2;
        }
        this.lastConnected = Boolean.valueOf(isConnected);
        this.netType = type;
        this.netSubType = subtype;
        LogCatUtil.info(TAG, " type=[" + type + "] subType=[" + subtype + "]  available=[" + isAvailable + "] connected=[" + isConnected + "] detailedState=[" + activeNetworkInfo.getDetailedState() + "] extraInfo=[" + extraInfo + "]");
        StringBuilder sb = new StringBuilder(" activeNetworkInfo hashcode=");
        sb.append(activeNetworkInfo.hashCode());
        sb.append("  activeNetworkInfo = [");
        sb.append(activeNetworkInfo.toString());
        sb.append("]\n");
        LogCatUtil.info(TAG, sb.toString());
        return !this.lastConnected.booleanValue() ? 0 : 1;
    }
}
