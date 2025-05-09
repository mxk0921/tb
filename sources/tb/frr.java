package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.taolive.room.service.IPlayPublicService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class frr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f19489a = -1;
    public static float b = -1.0f;
    public static Boolean c = null;

    static {
        t2o.a(806356547);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96d9f868", new Object[0])).booleanValue();
        }
        return arq.c(OrangeConfig.getInstance().getConfig("tblive", "disableTransition", "false"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a8c1ee", new Object[0])).booleanValue();
        }
        return arq.c(OrangeConfig.getInstance().getConfig("tblive", "enableAppSettingProvider", "false"));
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eebc60f3", new Object[0])).booleanValue();
        }
        return arq.c(OrangeConfig.getInstance().getConfig("tblive", "enableOpenCardAddMessageViewNew", "true"));
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c51b68f7", new Object[0])).booleanValue();
        }
        return arq.c(OrangeConfig.getInstance().getConfig("tblive", "enableOpenCardHiddenView", "true"));
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8c359ce", new Object[0])).booleanValue();
        }
        if (arq.c(OrangeConfig.getInstance().getConfig("tblive", "enableOpenNDWarmUp", "true"))) {
            return u0.c();
        }
        return false;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfda8b61", new Object[0])).booleanValue();
        }
        return arq.c(OrangeConfig.getInstance().getConfig("tblive", "enableParseTabImage", "true"));
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e75ab653", new Object[0])).booleanValue();
        }
        return arq.c(OrangeConfig.getInstance().getConfig("tblive", "EnablePreForCountDown", "true"));
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36c01f10", new Object[0])).booleanValue();
        }
        return arq.c(OrangeConfig.getInstance().getConfig("tblive", "EnableReleasePlayer", "true"));
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf392e57", new Object[0])).booleanValue();
        }
        return arq.c(OrangeConfig.getInstance().getConfig("tblive", "enableTBLImageViewEnableReuse", "true"));
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d92cb63c", new Object[0])).booleanValue();
        }
        return true;
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10226ef", new Object[0])).booleanValue();
        }
        return arq.c(OrangeConfig.getInstance().getConfig("tblive", "enableXTabTextShadowLayer", "true"));
    }

    public static float l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58f4a5a9", new Object[0])).floatValue();
        }
        return arq.d(OrangeConfig.getInstance().getConfig("tblive", "h265MaxFreq", IPlayPublicService.PlayRate.PLAY_SPEED_1_5X));
    }

    public static String m(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4dbe341", new Object[]{str, str2});
        }
        return OrangeConfig.getInstance().getConfig("tblive", str, str2);
    }

    public static float n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e099977a", new Object[0])).floatValue();
        }
        return arq.d(m("tabImageHeight", "60"));
    }

    public static float o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c13d661", new Object[0])).floatValue();
        }
        return arq.d(m("tabImageWidth", "180"));
    }

    public static int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1856067e", new Object[0])).intValue();
        }
        return arq.f(m("tabPicBottomMargin", "0"));
    }

    public static int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e67ba01a", new Object[0])).intValue();
        }
        return arq.f(m("tabPicBottomMargin", "0"));
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd97184c", new Object[0])).booleanValue();
        }
        return arq.c(OrangeConfig.getInstance().getConfig("tblive", "HideShortVideo", "false"));
    }

    public static int s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("87749682", new Object[0])).intValue();
        }
        return arq.f(OrangeConfig.getInstance().getConfig("tblive", "HighDeviceAutoPlayDelayTime", "0"));
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f010f779", new Object[0])).booleanValue();
        }
        Boolean bool = c;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (f19489a == -1) {
            f19489a = cx4.b();
        }
        int i = f19489a;
        if (i >= 8) {
            c = Boolean.TRUE;
            return true;
        } else if (i >= 4) {
            if (b == -1.0f) {
                for (int i2 = 0; i2 < f19489a; i2++) {
                    float d = arq.d(cx4.a(i2)) / 1000000.0f;
                    if (d > b) {
                        b = d;
                    }
                }
            }
            if (b >= l()) {
                z = true;
            }
            c = Boolean.valueOf(z);
            return z;
        } else {
            c = Boolean.FALSE;
            return false;
        }
    }

    public static int u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("29ab8890", new Object[0])).intValue();
        }
        return arq.f(OrangeConfig.getInstance().getConfig("tblive", "LowDeviceAutoPlayDelayTime", ct2.COLOR_TAG_NOT_ZCACHE_RESOURCE));
    }

    public static int v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("969ed92f", new Object[0])).intValue();
        }
        return arq.f(OrangeConfig.getInstance().getConfig("tblive", "MiddleDeviceAutoPlayDelayTime", "6"));
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf4427e1", new Object[0])).booleanValue();
        }
        return arq.c(OrangeConfig.getInstance().getConfig("tblive", "TBLIVE_ORANGE_BFRTC_Enable_V1", "false"));
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc8227ba", new Object[0])).booleanValue();
        }
        return arq.c(OrangeConfig.getInstance().getConfig("tblive", "UseNewFavorLayout", "false"));
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64009cd1", new Object[0])).booleanValue();
        }
        return arq.c(OrangeConfig.getInstance().getConfig("tblive", "TBLIVE_ORANGE_RTCLIVE_Enable_V3", "false"));
    }
}
