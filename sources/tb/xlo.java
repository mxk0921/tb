package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexCellBean;
import com.taobao.search.m3.M3CellBean;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import com.taobao.search.mmd.datasource.bean.ReviewBean;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.widgets.list.listcell.baseauction.SFAuctionBaseCellBean;
import java.util.List;
import tb.h1p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xlo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f31460a = xlo.class.getSimpleName();

    static {
        t2o.a(815793496);
    }

    public static boolean b(BaseCellBean baseCellBean) {
        AuctionBaseBean auctionBaseBean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1eede992", new Object[]{baseCellBean})).booleanValue();
        }
        if ((baseCellBean instanceof SFAuctionBaseCellBean) && (auctionBaseBean = ((SFAuctionBaseCellBean) baseCellBean).auctionBaseBean) != null) {
            return !TextUtils.isEmpty(auctionBaseBean.p4pUrl);
        }
        return false;
    }

    public static String c(BaseCellBean baseCellBean) {
        AuctionBaseBean auctionBaseBean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50cc0f9c", new Object[]{baseCellBean});
        }
        if ((baseCellBean instanceof SFAuctionBaseCellBean) && (auctionBaseBean = ((SFAuctionBaseCellBean) baseCellBean).auctionBaseBean) != null) {
            return auctionBaseBean.itemId;
        }
        if (baseCellBean instanceof M3CellBean) {
            return baseCellBean.itemId;
        }
        if (baseCellBean instanceof MuiseCellBean) {
            return baseCellBean.itemId;
        }
        if (baseCellBean instanceof WeexCellBean) {
            return baseCellBean.itemId;
        }
        return null;
    }

    public static void d(CommonBaseDatasource commonBaseDatasource, ReviewBean reviewBean, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d87558c5", new Object[]{commonBaseDatasource, reviewBean, context});
        } else if (reviewBean == null || TextUtils.isEmpty(reviewBean.h5Url)) {
            Log.e(f31460a, "review bean is null");
        } else if (commonBaseDatasource == null) {
            Log.e(f31460a, "datasource is null");
        } else if (context == null) {
            Log.e(f31460a, "context is null");
        } else {
            ArrayMap<String, String> a2 = a(commonBaseDatasource, reviewBean.totalPage * 10);
            if (a2 == null) {
                a2 = new ArrayMap<>();
            }
            a2.put("q", commonBaseDatasource.getKeyword());
            String valueOf = String.valueOf(commonBaseDatasource.hashCode());
            if (!TextUtils.isEmpty(valueOf)) {
                a2.put("srpKey", valueOf);
            }
            CommonSearchResult commonSearchResult = (CommonSearchResult) commonBaseDatasource.getTotalSearchResult();
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put("query", commonBaseDatasource.getKeyword());
            if (commonSearchResult != null) {
                arrayMap.put(h1p.a.PARAM_KEY_FIRST_RN, commonSearchResult.getMainInfo().rn);
                arrayMap.put("for_bts", commonSearchResult.pageInfo.getString("for_bts"));
            }
            CommonSearchResult commonSearchResult2 = (CommonSearchResult) commonBaseDatasource.getLastSearchResult();
            if (commonSearchResult2 != null) {
                a2.put("bucketId", commonSearchResult2.getMainInfo().abtest);
                a2.put("last_page", String.valueOf(commonSearchResult2.getMainInfo().page));
                a2.put("last_rn", commonSearchResult2.getMainInfo().rn);
                a2.put("sversion", r4p.SERVER_VERSION_VALUE);
                arrayMap.put("max_page", String.valueOf(commonSearchResult2.getMainInfo().page));
            }
            CommonSearchResult commonSearchResult3 = (CommonSearchResult) commonBaseDatasource.getTotalSearchResult();
            if (commonSearchResult3 != null) {
                a2.put(h1p.a.PARAM_KEY_FIRST_RN, commonSearchResult3.getMainInfo().rn);
            }
            sen.f("SrpReviewButton", arrayMap);
            Nav.from(context).toUri(f6p.a(reviewBean.h5Url, a2));
        }
    }

    public static ArrayMap<String, String> a(CommonBaseDatasource commonBaseDatasource, int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayMap) ipChange.ipc$dispatch("c9fe1a7b", new Object[]{commonBaseDatasource, new Integer(i)});
        }
        if (i <= 0) {
            Log.e(f31460a, "review num is invalid");
            return null;
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) commonBaseDatasource.getTotalSearchResult();
        if (commonSearchResult == null) {
            Log.e(f31460a, "total result is null");
            return null;
        }
        List<BaseCellBean> cells = commonSearchResult.getCells();
        if (cells == null || cells.size() == 0) {
            Log.e(f31460a, "items is empty");
            return null;
        }
        ArrayMap<String, String> arrayMap = new ArrayMap<>();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (BaseCellBean baseCellBean : cells) {
            if (i2 >= i) {
                break;
            }
            String c = c(baseCellBean);
            if (!TextUtils.isEmpty(c)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(c);
                if (b(baseCellBean)) {
                    if (sb2.length() > 0) {
                        sb2.append(",");
                    }
                    sb2.append(c);
                }
                i2++;
            }
        }
        String sb3 = sb.toString();
        if (!TextUtils.isEmpty(sb3)) {
            arrayMap.put("ids", sb3);
        }
        String sb4 = sb2.toString();
        if (!TextUtils.isEmpty(sb4)) {
            arrayMap.put(r4p.KEY_P4P_IDS, sb4);
        }
        return arrayMap;
    }
}
