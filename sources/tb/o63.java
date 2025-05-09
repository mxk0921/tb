package tb;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.datapoints.StatisticalDataPoint$DataPoint;
import com.etao.feimagesearch.datapoints.StatisticalDataPoint$PageName;
import com.etao.feimagesearch.mnn.AutoDetectExtraInfoCache;
import com.etao.feimagesearch.model.IrpParamModel;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.util.PicParamUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class o63 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481296501);
    }

    public static void b(Activity activity, Bitmap bitmap, String str, PhotoFrom photoFrom) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5478f6e9", new Object[]{activity, bitmap, str, photoFrom});
            return;
        }
        pmf.e0();
        String k = mld.k(activity, bitmap, 90);
        if (!TextUtils.isEmpty(k)) {
            IrpParamModel irpParamModel = new IrpParamModel(str);
            irpParamModel.setPhotoFrom(photoFrom);
            irpParamModel.updateSessionId();
            String c = AutoDetectExtraInfoCache.Companion.a().c();
            HashMap hashMap = new HashMap(10);
            if (lg4.i0() && !TextUtils.isEmpty(c)) {
                hashMap.put(AutoDetectExtraInfoCache.EXTRA_INFO_KEY, c);
            }
            a8m.d(bitmap, k, irpParamModel, irpParamModel.getSessionId(), hashMap);
            nmj.e(activity, irpParamModel);
        }
    }

    public static void c(Uri uri, Bitmap bitmap, int i, PhotoFrom photoFrom, yr3 yr3Var, Activity activity, int i2, int i3, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82b9bc3d", new Object[]{uri, bitmap, new Integer(i), photoFrom, yr3Var, activity, new Integer(i2), new Integer(i3), str});
            return;
        }
        IrpParamModel irpParamModel = new IrpParamModel(yr3Var);
        irpParamModel.setPhotoFrom(photoFrom);
        irpParamModel.updateSessionId();
        a8m.c(uri, bitmap, i, photoFrom, yr3Var, irpParamModel.getSessionId(), i2, i3, str);
        if (!TextUtils.isEmpty(yr3Var.getSellerId())) {
            jzu.i(StatisticalDataPoint$PageName.PHOTO_SEARCH_TAKE.getPageName(), StatisticalDataPoint$DataPoint.SEARCH_FROM_SHOP.name(), new String[0]);
        }
        nmj.e(activity, irpParamModel);
    }

    public static void a(Activity activity, Bitmap bitmap, boolean z, yr3 yr3Var, Map<String, String> map, Map<String, String> map2, int i, PhotoFrom.Values values) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0d32d0f", new Object[]{activity, bitmap, new Boolean(z), yr3Var, map, map2, new Integer(i), values});
            return;
        }
        pmf.e0();
        if (!TextUtils.isEmpty(yr3Var.getSellerId())) {
            jzu.i(StatisticalDataPoint$PageName.PHOTO_SEARCH_TAKE.getPageName(), StatisticalDataPoint$DataPoint.SEARCH_FROM_SHOP.name(), new String[0]);
        }
        IrpParamModel irpParamModel = new IrpParamModel(yr3Var);
        irpParamModel.setPhotoFrom(values);
        irpParamModel.updateSessionId();
        String c = AutoDetectExtraInfoCache.Companion.a().c();
        HashMap hashMap = map == null ? new HashMap() : map;
        agh.r("Dynamic", "prepareForV2SRP", values.getValue());
        if (lg4.i0() && !TextUtils.isEmpty(c)) {
            hashMap.put(AutoDetectExtraInfoCache.EXTRA_INFO_KEY, c);
        }
        hashMap.put(l53.KEY_EXTRA_VERIFY, values.getValue());
        a8m.f(bitmap, null, PicParamUtils.Companion.a(z, values), yr3Var, irpParamModel.getSessionId(), hashMap, map2, "true".equals(lg4.Y1("irpMock")), Integer.valueOf(bitmap.hashCode()), i, values);
        nmj.e(activity, irpParamModel);
    }
}
