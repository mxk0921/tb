package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zbl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ORANGE_CART_GROUP_NAME = "cart_switch";
    public static final String ORANGE_DEGRADE_H5_SCALE = "cart_degrade_to_h5_scale";
    public static final String ORANGE_TB_CART_H5 = "tb_cart_h5_url";
    public static final String ORANGE_TMS_CART_H5 = "tms_cart_h5_url";

    static {
        t2o.a(697303055);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c3318bc", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("cart_switch", "isOpenGetFragmentFromManager", "true"));
    }

    public static String b() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6dd8860b", new Object[0]);
        }
        if (ie3.b()) {
            str = "https://meta.m.taobao.com/app/tb-trade/supercart/cart?wh_weex=true&weex_mode=dom&wx_limit_raster_cache=true&wx_navbar_hidden=true&entrance=tab&floatCart=1&nav_jump_mode=std_mega_pop&stdpop_popId=float_cart_weex&skipEnterAnimation=true&stdpop_config%3D%7B%22droidPanEnable%22%3A%22true%22%7D&skipTradeHybridContainerUt=true";
        } else {
            str = "https://meta.wapa.taobao.com/app/tb-trade/supercart/cart?wh_weex=true&weex_mode=dom&wx_limit_raster_cache=true&wx_navbar_hidden=true&entrance=tab&floatCart=1&nav_jump_mode=std_mega_pop&stdpop_popId=float_cart_weex&skipEnterAnimation=true&stdpop_config%3D%7B%22droidPanEnable%22%3A%22true%22%7D&skipTradeHybridContainerUt=true";
        }
        return OrangeConfig.getInstance().getConfig("cart_switch", "cart_float_weex_url", str);
    }
}
