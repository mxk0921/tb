package tb;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.uikit.SearchUrlImageView;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import com.taobao.search.mmd.datasource.bean.ListStyle;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class nh1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792593);
    }

    public static int a(ViewGroup.LayoutParams layoutParams, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7cbd4218", new Object[]{layoutParams, new Integer(i)})).intValue();
        }
        int i2 = layoutParams.width;
        if (i2 > 0) {
            return i2;
        }
        return (zuo.e() - i) / 2;
    }

    public static void b(SearchUrlImageView searchUrlImageView, AuctionBaseBean auctionBaseBean, ListStyle listStyle, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db5b316b", new Object[]{searchUrlImageView, auctionBaseBean, listStyle, new Integer(i)});
            return;
        }
        float f = 0.6666667f;
        if (!TextUtils.isEmpty(auctionBaseBean.uprightImgAspectRatio)) {
            f = qrl.d(auctionBaseBean.uprightImgAspectRatio, 0.6666667f);
        }
        c(searchUrlImageView, auctionBaseBean, listStyle, i, f);
    }

    public static void c(SearchUrlImageView searchUrlImageView, AuctionBaseBean auctionBaseBean, ListStyle listStyle, int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("900b63b5", new Object[]{searchUrlImageView, auctionBaseBean, listStyle, new Integer(i), new Float(f)});
            return;
        }
        if (f <= 0.0f) {
            f = 0.6666667f;
        }
        if (auctionBaseBean.isP4p) {
            searchUrlImageView.setStrategyConfig(SearchUrlImageView.STRATEGY_P4P_AUCTION);
        } else {
            searchUrlImageView.setStrategyConfig(SearchUrlImageView.STRATEGY_MAIN_SEARCH_AUCTION);
        }
        String str = auctionBaseBean.picUrl;
        int i2 = R.drawable.tbsearch_android_list_img_placeholder;
        if (listStyle == ListStyle.WATERFALL) {
            i2 = R.drawable.tbsearch_android_wf_img_placeholder;
            ViewGroup.LayoutParams layoutParams = searchUrlImageView.getLayoutParams();
            int a2 = a(layoutParams, i);
            layoutParams.width = a2;
            if (!TextUtils.isEmpty(auctionBaseBean.wfPicUrl)) {
                str = auctionBaseBean.wfPicUrl;
                layoutParams.height = (int) (a2 / f);
            } else {
                layoutParams.height = a2;
            }
            searchUrlImageView.setLayoutParams(layoutParams);
        }
        searchUrlImageView.setPlaceHoldImageResId(i2);
        searchUrlImageView.setImageUrl(str);
    }

    public static void d(ImageView imageView, AuctionBaseBean auctionBaseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("936536c", new Object[]{imageView, auctionBaseBean});
        } else if (imageView != null && auctionBaseBean != null) {
            imageView.setVisibility(0);
            if (auctionBaseBean.isContainsIcon("p4p")) {
                imageView.setImageResource(R.drawable.tbsearch_flag_p4p);
            } else if (auctionBaseBean.isContainsIcon("hblx")) {
                imageView.setImageResource(R.drawable.tbsearch_flag_flight);
            } else if (auctionBaseBean.isContainsIcon(jbk.O2O_URL)) {
                imageView.setImageResource(R.drawable.tbsearch_flag_o2o);
            } else {
                imageView.setVisibility(8);
            }
        }
    }
}
