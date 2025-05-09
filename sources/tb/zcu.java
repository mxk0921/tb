package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class zcu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RATE_DETAIL_V2_PAGE_I18N_URL = "https://web.m.taobao.com/app/mtb-guang/ugc/evaluation/detail?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true&rateId=";
    public static final String RATE_DETAIL_V2_PAGE_URL = "https://h5.m.taobao.com/tnode/index.htm?tnode=page_ratedetail%40ugc%3fpangesture%3dpullrightexit%26navbarHide%3dtrue%26immersive%3dtrue&rateId=";
    public static final String RATE_DETAIL_V2_PAGE_WEEX_URL = "https://meta.m.taobao.com/app/taobao-ugc-community/rate-detail/?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true&rateId=";

    static {
        t2o.a(758120531);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8d85fba", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig("tb_ratepublish_android", "rate_detail_v2_page_i18n_url", RATE_DETAIL_V2_PAGE_I18N_URL);
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a855065c", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig("tb_ratepublish_android", "rate_detail_v2_page_weex_url", RATE_DETAIL_V2_PAGE_WEEX_URL);
    }
}
