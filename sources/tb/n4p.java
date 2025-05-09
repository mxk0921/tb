package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.util.NetWorkUtils;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class n4p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final n4p INSTANCE = new n4p();
    public static final int TYPE_2G = 2;
    public static final int TYPE_3G = 3;
    public static final int TYPE_4G = 4;
    public static final int TYPE_NO_WIFI = 0;
    public static final int TYPE_UNKNOWN = -1;
    public static final int TYPE_WIFI = 1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(993001986);
            int[] iArr = new int[NetWorkUtils.MobileNetworkType.values().length];
            try {
                iArr[NetWorkUtils.MobileNetworkType.MOBILE_NETWORK_TYPE_2G.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NetWorkUtils.MobileNetworkType.MOBILE_NETWORK_TYPE_3G.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NetWorkUtils.MobileNetworkType.MOBILE_NETWORK_TYPE_4G.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        t2o.a(993001985);
    }

    @JvmStatic
    public static final int a() {
        NetWorkUtils.ConnectType connectType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("700d68cc", new Object[0])).intValue();
        }
        NetWorkUtils.MobileNetworkType mobileNetworkType = null;
        try {
            connectType = NetWorkUtils.getConnectType(Globals.getApplication());
        } catch (Throwable th) {
            c4p.o("SearchNetworkUtil", "获取网络连接类型异常", th);
            connectType = null;
        }
        if (connectType == null) {
            c4p.m("SearchNetworkUtil", "未获取到网络连接类型");
            return -1;
        } else if (connectType == NetWorkUtils.ConnectType.CONNECT_TYPE_WIFI) {
            c4p.m("SearchNetworkUtil", "wifi");
            return 1;
        } else {
            try {
                mobileNetworkType = NetWorkUtils.getMobileNetworkType(Globals.getApplication());
            } catch (Throwable th2) {
                c4p.o("SearchNetworkUtil", "获取移动网络类型异常", th2);
            }
            if (mobileNetworkType == null) {
                c4p.m("SearchNetworkUtil", "未获取到移动网络类型");
                return 0;
            }
            int i = a.$EnumSwitchMapping$0[mobileNetworkType.ordinal()];
            if (i == 1) {
                return 2;
            }
            if (i != 2) {
                return i != 3 ? 0 : 4;
            }
            return 3;
        }
    }

    @JvmStatic
    public static final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc3067d6", new Object[0]);
        }
        int a2 = a();
        if (a2 == 0) {
            return "nowifi";
        }
        if (a2 == 1) {
            return "wifi";
        }
        if (a2 == 2) {
            return "2g";
        }
        if (a2 == 3) {
            return "3g";
        }
        if (a2 != 4) {
            return "unknown";
        }
        return "4g";
    }

    @JvmStatic
    public static final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("614c23d0", new Object[0])).booleanValue();
        }
        return NetWorkUtils.isNetworkAvailable(Globals.getApplication());
    }

    @JvmStatic
    public static final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80bd486a", new Object[0])).booleanValue();
        }
        if (1 == a()) {
            return true;
        }
        return false;
    }
}
