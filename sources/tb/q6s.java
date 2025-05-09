package tb;

import android.taobao.mulitenv.EnvironmentSwitcher;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class q6s {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FASTBUY_URL = "https://web.m.taobao.com/app/maochao-trade/fast-buy/home?wh_weex=true&weex_mode=dom&disableNav=YES&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true";
    public static final String FASTBUY_URL_PRE = "https://web.wapa.taobao.com/app/maochao-trade/fast-buy/home?wh_weex=true&weex_mode=dom&disableNav=YES&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true";
    public static final String WEEXCART_URL = "https://meta.m.taobao.com/app/tb-trade/supercart/chaoshi_cart?wx_navbar_hidden=true&wh_weex=true&weex_mode=dom&entrance=tab&cartFrom=tsm_native_taobao&sceneCartType=supermarketCart_513&pageName=superCart&disableNav=YES&wx_navbar_transparent=true&_wx_statusbar_hidden=true";
    public static final String WEEXCART_URL_PRE = "https://meta.wapa.taobao.com/app/tb-trade/supercart/chaoshi_cart?wx_navbar_hidden=true&wh_weex=true&weex_mode=dom&entrance=tab&cartFrom=tsm_native_taobao&sceneCartType=supermarketCart_513&pageName=superCart&disableNav=YES&wx_navbar_transparent=true&_wx_statusbar_hidden=true";

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("979c8009", new Object[0]);
        }
        if (EnvironmentSwitcher.a() == EnvironmentSwitcher.EnvType.OnLINE.getValue()) {
            return FASTBUY_URL;
        }
        return FASTBUY_URL_PRE;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("389476f6", new Object[0]);
        }
        if (EnvironmentSwitcher.a() == EnvironmentSwitcher.EnvType.OnLINE.getValue()) {
            return WEEXCART_URL;
        }
        return WEEXCART_URL_PRE;
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cf1317e", new Object[0]);
        }
        return fyt.c().d(fyt.ORANGE_KEY_FASTBUY_URL, a());
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("53b50841", new Object[0]);
        }
        return fyt.c().d(fyt.ORANGE_KEY_WEEXCART_URL, b());
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("810c6d98", new Object[0])).booleanValue();
        }
        String a2 = dyt.a("mc_page_router", "AB_MC_Fastbuy_Router", "useFastbuy");
        RVLLevel rVLLevel = RVLLevel.Info;
        lcn.f(rVLLevel, gyt.TLOG_MODULE, "fastbuy router ab enable: " + a2);
        return "true".equals(a2);
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff3c24ce", new Object[0])).booleanValue();
        }
        return fyt.c().b(fyt.ORANGE_KEY_FASTBUY_ENABLE, Boolean.FALSE);
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae5dcbc", new Object[0])).booleanValue();
        }
        return fyt.c().b(fyt.ORANGE_KEY_FASTBUY_PREFETCH_DISABLE, Boolean.FALSE);
    }
}
