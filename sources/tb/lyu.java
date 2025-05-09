package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.inside.adapter.TMSOrangeProxy;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class lyu implements vwd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(847249440);
        t2o.a(847249434);
    }

    @Override // tb.vwd
    public boolean a(mpj mpjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4350870", new Object[]{this, mpjVar})).booleanValue();
        }
        ckf.g(mpjVar, "navigationInfo");
        List<String> z0 = wsq.z0(TMSOrangeProxy.INSTANCE.getConfigByGroupAndNameFromLocal("pha_tab_config", "h5_to_tms_list", "pages-fast.m.taobao.com/wow/z/hdwk/farm-ssr/tmfarm,pages.tmall.com/wow/bz/jingmi/1164,pages-fast.m.taobao.com/wow/z/vip/hbqd5/hbqd5.0,pages-fast.m.taobao.com/wow/a/act/tao/tmc/38057/21182/wupr?forceThemis=true,pages-fast.m.taobao.com/wow/a/act/tmall/tmc/38058/21181/wupr?forceThemis=true,pages-fast.m.taobao.com/wow/z/blackvip,pages-fast.m.taobao.com/wow/z/app/tb-vip/month-card-v2,pages-fast.m.taobao.com/wow/z/app/ltao-fe/xsms-ssr-yyds/home,pages-fast.m.taobao.com/wow/wan/ug,pages.tmall.com/wow/z/hdwk/2021tmfarm/DBsi6bzBpYt6xztHatpy,pages-fast.m.taobao.com/wow/z/tmtjb/town/home,pages-fast.m.taobao.com/wow/z/app/coinhub/super-deduct-ssr/home,taocaicai.m.taobao.com/render-wh/app/mmc-youxuan/tbmc-shop/xsd-home.html,taocaicai.m.taobao.com/render/app/mmc-youxuan/taocaicai-ssr/index.html,pages-fast.m.taobao.com/wow/z/tmtjb/tjbSSR/taocoin-home,ku.m.taobao.com,kus.m.taobao.com,pages-fast.m.taobao.com/wow/bz/jingmi/1223,chaoshi.m.tmall.com,pages-fast.m.taobao.com/wow/an/cs/flash-ssr/index,pages-fast.m.taobao.com/wow/z/hdwk/hd25spring,huodong.taobao.com/wow/z/hdwk/hd25spring"), new String[]{","}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(zz3.q(z0, 10));
        for (String str : z0) {
            arrayList.add(wsq.Q0(str).toString());
        }
        ArrayList<String> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            for (String str2 : arrayList2) {
                if (wsq.O(mpjVar.d(), str2, false, 2, null)) {
                    return true;
                }
            }
        }
        return false;
    }
}
