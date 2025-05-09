package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class zng {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(708837414);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f2c204d", new Object[0])).booleanValue();
        }
        return jog.d("enableLoadingPerf", true, false);
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5dc5ba0", new Object[0]);
        }
        return jog.b("lightBuyUrl", dbv.PRE_RENDER_URL_LIGHT_BUY, false);
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f9d3037", new Object[0]);
        }
        return jog.b("lightBuyPreUrl", "https://meta.wapa.taobao.com/app/tb-trade/light-buy/home?wh_weex=true&weex_mode=dom&wx_limit_raster_cache=true&preload=true", false);
    }
}
