package tb;

import android.graphics.Color;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import com.taobao.search.mmd.uikit.PriceView;
import com.taobao.tao.util.TaoHelper;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class oh1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792491);
    }

    public static void a(AuctionBaseBean auctionBaseBean, PriceView priceView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e5ac0bb", new Object[]{auctionBaseBean, priceView});
        } else if (TextUtils.isEmpty(auctionBaseBean.price)) {
            b(priceView);
        } else {
            d(priceView);
            priceView.setPrefixText(auctionBaseBean.pricePrefix);
            priceView.setUnitText(auctionBaseBean.priceUnit);
            priceView.setLocalPrice(auctionBaseBean.localPrice);
            priceView.setPriceIconSuffix(auctionBaseBean.priceIconSuffixText);
            priceView.setIcon(auctionBaseBean.priceIconUrl, auctionBaseBean.priceIconWidth, auctionBaseBean.priceIconHeight);
            priceView.setPriceTextColor(srl.c(auctionBaseBean.priceColor, Color.parseColor("#FF5000")));
            priceView.setIconSuffixColor(srl.c(auctionBaseBean.priceIconSuffixColor, Color.parseColor("#FF5000")));
            c(auctionBaseBean.price, priceView);
        }
    }

    public static void b(PriceView priceView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17a9652", new Object[]{priceView});
        } else {
            priceView.setVisibility(8);
        }
    }

    public static void c(String str, PriceView priceView) {
        char charAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b88fcbb4", new Object[]{str, priceView});
            return;
        }
        String formatPriceStr = TaoHelper.formatPriceStr(str);
        int indexOf = formatPriceStr.indexOf(46);
        if (indexOf == -1) {
            indexOf = formatPriceStr.length();
        }
        priceView.setIntegerPriceText(formatPriceStr.substring(0, indexOf));
        if (indexOf >= formatPriceStr.length()) {
            priceView.setDecimalPriceText(null);
            return;
        }
        String substring = formatPriceStr.substring(indexOf + 1);
        if (substring.equals("00")) {
            priceView.setDecimalPriceText(null);
        } else if (TextUtils.isEmpty(substring) || !substring.endsWith("0") || (charAt = substring.charAt(0)) == '0') {
            priceView.setDecimalPriceText(".".concat(substring));
        } else {
            priceView.setDecimalPriceText("." + charAt);
        }
    }

    public static void d(PriceView priceView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a2f3777", new Object[]{priceView});
        } else {
            priceView.setVisibility(0);
        }
    }
}
