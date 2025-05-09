package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.TaoInit;
import com.etao.feimagesearch.history.AuctionItemVO;
import com.etao.feimagesearch.history.HistoryResult;
import com.etao.feimagesearch.history.a;
import com.etao.feimagesearch.model.IrpParamModel;
import com.etao.feimagesearch.model.PhotoFrom;
import com.taobao.taobao.R;
import java.net.URLEncoder;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class n7m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(730857614);
    }

    public static long a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57210979", new Object[]{context})).longValue();
        }
        try {
            HistoryResult h = a.j().h();
            Map<Long, AuctionItemVO> map = h.resultData;
            if (map == null || map.isEmpty()) {
                return 0L;
            }
            return a.j().q(h);
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("779478fa", new Object[]{context});
        } else {
            a.j().d();
        }
    }

    public static long c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fbbca1a8", new Object[]{context})).longValue();
        }
        TaoInit.init();
        if (!lg4.Q0()) {
            return 0L;
        }
        return a(context);
    }

    public static void e(Context context, AuctionItemVO auctionItemVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("490610b7", new Object[]{context, auctionItemVO});
        } else {
            a.j().f(auctionItemVO);
        }
    }

    public static HistoryResult f(Context context, String str, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HistoryResult) ipChange.ipc$dispatch("557d6a3f", new Object[]{context, str, new Boolean(z), new Integer(i)});
        }
        return a.j().i(str, z, i);
    }

    public static void d(Activity activity, AuctionItemVO auctionItemVO, String str, PhotoFrom photoFrom) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e21bc74", new Object[]{activity, auctionItemVO, str, photoFrom});
            return;
        }
        TaoInit.init();
        mzu.k(s63.ALBUM_PAGE_NAME, "PicHistoryClick", new String[0]);
        if (auctionItemVO.isVideo) {
            String str2 = auctionItemVO.fileUrl;
            if (str2 == null || !yf9.d(str2)) {
                i0u.f(activity, Localization.q(R.string.taobao_app_1007_1_19036), 0);
                return;
            }
            nmj.a(activity, Uri.parse("https://m.taobao.com/video_imagesearch").buildUpon().appendQueryParameter("videoUrl", URLEncoder.encode(auctionItemVO.fileUrl)).build().toString());
        }
        if (TextUtils.isEmpty(str)) {
            str = "unknown";
        }
        if (photoFrom == null) {
            photoFrom = PhotoFrom.Values.HISTORY;
        }
        IrpParamModel irpParamModel = new IrpParamModel(str);
        irpParamModel.setPicUrl(auctionItemVO.picPath);
        irpParamModel.setPhotoFrom(photoFrom);
        nmj.e(activity, irpParamModel);
    }
}
