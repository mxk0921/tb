package mtopsdk.xstate.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.mobile.common.transport.utils.ConnectionUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Locale;
import mtopsdk.common.util.RemoteConfig;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import mtopsdk.xstate.NetworkClassEnum;
import tb.inx;
import tb.puj;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class NetworkStateReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_BLUETOOTH = 7;
    public static final int TYPE_DUMMY = 8;
    public static final int TYPE_ETHERNET = 9;
    public static final int TYPE_MOBILE = 0;
    public static final int TYPE_MOBILE_CBS = 12;
    public static final int TYPE_MOBILE_DUN = 4;
    public static final int TYPE_MOBILE_EMERGENCY = 15;
    public static final int TYPE_MOBILE_FOTA = 10;
    public static final int TYPE_MOBILE_HIPRI = 5;
    public static final int TYPE_MOBILE_IA = 14;
    public static final int TYPE_MOBILE_IMS = 11;
    public static final int TYPE_MOBILE_MMS = 2;
    public static final int TYPE_MOBILE_SUPL = 3;
    public static final int TYPE_PROXY = 16;
    public static final int TYPE_VPN = 17;
    public static final int TYPE_WIFI = 1;
    public static final int TYPE_WIFI_P2P = 13;
    public static final int TYPE_WIMAX = 6;

    /* renamed from: a  reason: collision with root package name */
    public static ConnectivityManager f15413a = null;
    public static WifiManager b = null;
    public static volatile String c = "";
    public static volatile String d = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f15414a;

        public a(Context context) {
            this.f15414a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                NetworkStateReceiver.this.c(this.f15414a);
            } catch (Throwable th) {
                TBSdkLog.e("mtopsdk.NetworkStateReceiver", "[onReceive] updateNetworkStatus error", th);
            }
        }
    }

    static {
        t2o.a(589300095);
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a9716001", new Object[]{new Integer(i)});
        }
        switch (i) {
            case 0:
                return "MOBILE";
            case 1:
                return "WIFI";
            case 2:
                return "MOBILE_MMS";
            case 3:
                return "MOBILE_SUPL";
            case 4:
                return "MOBILE_DUN";
            case 5:
                return "MOBILE_HIPRI";
            case 6:
                return "WIMAX";
            case 7:
                return "BLUETOOTH";
            case 8:
                return "DUMMY";
            case 9:
                return "ETHERNET";
            case 10:
                return "MOBILE_FOTA";
            case 11:
                return "MOBILE_IMS";
            case 12:
                return "MOBILE_CBS";
            case 13:
                return "WIFI_P2P";
            case 14:
                return "MOBILE_IA";
            case 15:
                return "MOBILE_EMERGENCY";
            case 16:
                return RPCDataItems.PROXY;
            case 17:
                return "VPN";
            default:
                return Integer.toString(i);
        }
    }

    public static /* synthetic */ Object ipc$super(NetworkStateReceiver networkStateReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/xstate/network/NetworkStateReceiver");
    }

    public final String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f61864", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.contains("cmwap")) {
                return "cmwap";
            }
            if (lowerCase.contains(ConnectionUtil.TYPE_UNIWAP)) {
                return ConnectionUtil.TYPE_UNIWAP;
            }
            if (lowerCase.contains(ConnectionUtil.TYPE_3GWAP)) {
                return ConnectionUtil.TYPE_3GWAP;
            }
            if (lowerCase.contains(ConnectionUtil.TYPE_CTWAP)) {
                return ConnectionUtil.TYPE_CTWAP;
            }
            if (lowerCase.contains(ConnectionUtil.TYPE_CMNET)) {
                return ConnectionUtil.TYPE_CMNET;
            }
            if (lowerCase.contains(ConnectionUtil.TYPE_UNINET)) {
                return ConnectionUtil.TYPE_UNINET;
            }
            if (lowerCase.contains(ConnectionUtil.TYPE_3GNET)) {
                return ConnectionUtil.TYPE_3GNET;
            }
            if (lowerCase.contains(ConnectionUtil.TYPE_CTNET)) {
                return ConnectionUtil.TYPE_CTNET;
            }
        }
        return "unknown";
    }

    public void c(Context context) {
        NetworkInfo networkInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("758b430a", new Object[]{this, context});
        } else if (context != null) {
            WifiInfo wifiInfo = null;
            try {
                if (f15413a == null) {
                    f15413a = (ConnectivityManager) context.getSystemService("connectivity");
                }
                networkInfo = f15413a.getActiveNetworkInfo();
            } catch (Throwable th) {
                TBSdkLog.e("mtopsdk.NetworkStateReceiver", "getNetworkInfo error.", th);
                networkInfo = null;
            }
            if (networkInfo == null || !networkInfo.isConnected()) {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    TBSdkLog.i("mtopsdk.NetworkStateReceiver", "[updateNetworkStatus]no network");
                }
                NetworkClassEnum networkClassEnum = NetworkClassEnum.NET_NO;
                inx.l("nq", networkClassEnum.getNetClass());
                inx.l("netType", networkClassEnum.getNetClass());
                return;
            }
            int type = networkInfo.getType();
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i("mtopsdk.NetworkStateReceiver", "[updateNetworkStatus] NetworkInfo isConnected=" + networkInfo.isConnected() + ", isAvailable=" + networkInfo.isAvailable() + ", type=" + a(type));
            }
            if (type == 0) {
                int subtype = networkInfo.getSubtype();
                NetworkClassEnum a2 = puj.a(subtype);
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                    TBSdkLog.d("mtopsdk.NetworkStateReceiver", "[updateNetworkStatus]Mobile network," + a2.getNetClass());
                }
                b(networkInfo.getExtraInfo());
                inx.l("nq", a2.getNetClass());
                inx.l("netType", puj.b(subtype));
            } else if (type == 1) {
                if (RemoteConfig.getInstance().removeWifiInfo) {
                    d = "02:00:00:00:00:00";
                    c = "<unknown ssid>";
                } else {
                    try {
                        if (b == null) {
                            b = (WifiManager) context.getSystemService("wifi");
                        }
                        wifiInfo = b.getConnectionInfo();
                    } catch (Throwable th2) {
                        TBSdkLog.e("mtopsdk.NetworkStateReceiver", "[updateNetworkStatus]getWifiInfo error.", th2);
                    }
                    if (wifiInfo != null) {
                        d = wifiInfo.getBSSID();
                        c = wifiInfo.getSSID();
                    }
                }
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    TBSdkLog.i("mtopsdk.NetworkStateReceiver", "[updateNetworkStatus]WIFI network.ssid= " + c + ", bssid=" + d);
                }
                NetworkClassEnum networkClassEnum2 = NetworkClassEnum.NET_WIFI;
                inx.l("nq", networkClassEnum2.getNetClass());
                inx.l("netType", networkClassEnum2.getNetClass());
            } else if (type != 9) {
                String a3 = a(type);
                inx.l("nq", a3);
                inx.l("netType", a3);
            } else {
                NetworkClassEnum networkClassEnum3 = NetworkClassEnum.NET_ETHERNET;
                inx.l("nq", networkClassEnum3.getNetClass());
                inx.l("netType", networkClassEnum3.getNetClass());
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i("mtopsdk.NetworkStateReceiver", "[onReceive] networkStateReceiver onReceive");
        }
        MtopSDKThreadPoolExecutorFactory.submit(new a(context));
    }
}
