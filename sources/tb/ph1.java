package tb;

import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import com.taobao.search.mmd.uikit.PriceView;
import com.taobao.tao.Globals;
import com.taobao.tao.util.StringUtil;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ph1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int daySoldTextColor = Globals.getApplication().getResources().getColor(R.color.double11_text_color);
    public static final int normalSoldTextColor = Globals.getApplication().getResources().getColor(R.color.gray_99);

    static {
        t2o.a(815792492);
    }

    public static void a(PriceView priceView, AuctionBaseBean auctionBaseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ade57362", new Object[]{priceView, auctionBaseBean});
        } else if (priceView != null) {
            if (!TextUtils.isEmpty(auctionBaseBean.daySold)) {
                priceView.setSalesText(auctionBaseBean.daySold);
                priceView.setSalesColor(daySoldTextColor);
            } else if (!TextUtils.isEmpty(auctionBaseBean.realSales)) {
                priceView.setSalesText(auctionBaseBean.realSales);
                priceView.setSalesColor(normalSoldTextColor);
            } else if (!TextUtils.isEmpty(auctionBaseBean.selled)) {
                String a2 = rwm.a(auctionBaseBean.selled);
                if (!StringUtil.isEmpty(a2)) {
                    priceView.setSalesText(a2 + Localization.q(R.string.taobao_app_1005_1_16682));
                } else {
                    priceView.setSalesText(auctionBaseBean.selled + Localization.q(R.string.taobao_app_1005_1_16682));
                }
                priceView.setSalesColor(normalSoldTextColor);
            } else {
                priceView.setSalesText(null);
            }
        }
    }

    public static void b(PriceView priceView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdb6a96f", new Object[]{priceView});
        } else {
            priceView.setSalesText(null);
        }
    }
}
