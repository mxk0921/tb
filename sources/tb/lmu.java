package tb;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.power.APower;
import com.taobao.common.inspector.DeviceInspector;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class lmu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NETWORK = "nwtp";
    public static final String NETWORN_2G = "2G";
    public static final String NETWORN_3G = "3G";
    public static final String NETWORN_4G = "4G";
    public static final String NETWORN_MOBILE = "mobile";
    public static final String NETWORN_NONE = "unknown";
    public static final String NETWORN_WIFI = "wifi";

    /* renamed from: a  reason: collision with root package name */
    public DeviceInspector f23427a = null;

    static {
        t2o.a(395313651);
    }

    public void a(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc06b2cf", new Object[]{this, context, map});
            return;
        }
        b(map);
        map.put(NETWORK, f(context));
    }

    public pr3 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pr3) ipChange.ipc$dispatch("3f921a4d", new Object[]{this});
        }
        DeviceInspector deviceInspector = this.f23427a;
        if (deviceInspector != null) {
            return deviceInspector.g();
        }
        return null;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2ea365ec", new Object[]{this})).intValue();
        }
        DeviceInspector deviceInspector = this.f23427a;
        if (deviceInspector != null) {
            return (int) (deviceInspector.f() * 100.0d);
        }
        return 0;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76437399", new Object[]{this})).intValue();
        }
        DeviceInspector deviceInspector = this.f23427a;
        if (deviceInspector != null) {
            return deviceInspector.h() / 1000;
        }
        return 0;
    }

    public String f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8ddeb58", new Object[]{this, context});
        }
        try {
            return g(context);
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    public void h(Context context, qr3 qr3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41b21d9b", new Object[]{this, context, qr3Var});
        } else {
            this.f23427a = new DeviceInspector(context, qr3Var);
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f20d3fd", new Object[]{this});
            return;
        }
        DeviceInspector deviceInspector = this.f23427a;
        if (deviceInspector != null) {
            deviceInspector.k();
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d62ca4", new Object[]{this});
        } else if (this.f23427a != null) {
            this.f23427a.j(nf.m(), l0r.DEFAULT_TCP_CONNECT_TIMEOUT_MS);
        }
    }

    public void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2aa4f33", new Object[]{this, map});
            return;
        }
        DeviceInspector deviceInspector = this.f23427a;
        if (deviceInspector != null) {
            Intent e = deviceInspector.e();
            if (e != null) {
                float a2 = t52.a(e, 0.0f);
                float b = t52.b(e, 0);
                map.put("bat", String.valueOf(a2));
                map.put("tem", String.valueOf(b));
            }
            map.put("mem", String.valueOf(this.f23427a.h() / 1000.0f));
            map.put(APower.TYPE_CPU, "" + (this.f23427a.f() * 100.0d));
        }
    }

    public final String g(Context context) {
        NetworkInfo activeNetworkInfo;
        NetworkInfo.State state;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("794dbb71", new Object[]{this, context});
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (!(connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable())) {
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
            if (networkInfo != null && (state = networkInfo.getState()) != null && (state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING)) {
                return "wifi";
            }
            NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
            if (networkInfo2 != null) {
                NetworkInfo.State state2 = networkInfo2.getState();
                String subtypeName = networkInfo2.getSubtypeName();
                if (state2 != null && (state2 == NetworkInfo.State.CONNECTED || state2 == NetworkInfo.State.CONNECTING)) {
                    switch (activeNetworkInfo.getSubtype()) {
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
                            if (subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000")) {
                                return "3G";
                            }
                            return "mobile";
                    }
                }
            }
        }
        return "unknown";
    }
}
