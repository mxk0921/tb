package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.movehighlight.bundle.timeshift.model.LiveTimemovingModel;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class t90 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092712);
    }

    public static void a(LiveTimemovingModel liveTimemovingModel, Context context, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3013fc0c", new Object[]{liveTimemovingModel, context, ux9Var});
        } else if (c(liveTimemovingModel) || uwa.j()) {
            b(liveTimemovingModel, ux9Var);
        } else {
            f(liveTimemovingModel, context, ux9Var);
        }
    }

    public static void b(LiveTimemovingModel liveTimemovingModel, ux9 ux9Var) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47d0068c", new Object[]{liveTimemovingModel, ux9Var});
            return;
        }
        VideoInfo c0 = up6.c0(ux9Var);
        if (c0 != null && liveTimemovingModel != null) {
            LiveItem liveItem = new LiveItem();
            liveItem.extendVal = liveTimemovingModel.extendVal;
            liveItem.itemH5TaokeUrl = liveTimemovingModel.itemH5TaokeUrl;
            if (TextUtils.isDigitsOnly(liveTimemovingModel.itemId)) {
                liveItem.itemId = zqq.h(liveTimemovingModel.itemId);
            }
            liveItem.itemPic = liveTimemovingModel.itemPic;
            liveItem.itemUrl = liveTimemovingModel.itemUrl;
            liveItem.liveId = c0.liveId;
            liveItem.clickSource = "timeshift";
            if (liveItem.extraUTParams == null) {
                liveItem.extraUTParams = new HashMap();
            }
            Map<String, String> map = liveItem.extraUTParams;
            if (liveTimemovingModel.rightInfo != null) {
                str = "1";
            } else {
                str = "0";
            }
            map.put("highlight_coupon_type", str);
            Map<String, String> map2 = liveItem.extraUTParams;
            LiveTimemovingModel.RightInfo rightInfo = liveTimemovingModel.rightInfo;
            String str2 = null;
            map2.put("highlight_strategy_code", rightInfo != null ? rightInfo.strategyCode : null);
            Map<String, String> map3 = liveItem.extraUTParams;
            LiveTimemovingModel.RightInfo rightInfo2 = liveTimemovingModel.rightInfo;
            if (rightInfo2 != null) {
                str2 = rightInfo2.benefitCode;
            }
            map3.put("highlight_coupon_id", str2);
            liveItem.extraUTParams.put("highlight_card_clickPos", "timemove_cart");
            if (dxa.b(ux9Var).f() != null) {
                dxa.b(ux9Var).f().f(ux9Var, liveItem);
            }
        }
    }

    public static boolean c(LiveTimemovingModel liveTimemovingModel) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d42b500b", new Object[]{liveTimemovingModel})).booleanValue();
        }
        if (liveTimemovingModel == null) {
            return false;
        }
        LiveItem.Ext ext = liveTimemovingModel.extendVal;
        if (ext != null && "itemShopType".equals(ext.itemShopType)) {
            return true;
        }
        if (uwa.n() && (jSONObject = liveTimemovingModel.itemExtData) != null && jSONObject.containsKey("enableSku")) {
            return zqq.c(liveTimemovingModel.itemExtData.getString("enableSku"));
        }
        LiveItem.Ext ext2 = liveTimemovingModel.extendVal;
        if (ext2 != null) {
            return ext2.enableSKU;
        }
        return false;
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09b4e2", new Object[]{str});
        }
        return s3s.b(str);
    }

    public static void e(ux9 ux9Var, Activity activity, LiveItem liveItem, String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf32c42e", new Object[]{ux9Var, activity, liveItem, str, hashMap});
        } else if (liveItem != null) {
            String valueOf = String.valueOf(liveItem.itemId);
            sbu.b(ux9Var, "showDetail", "", valueOf, "itemId=" + liveItem.itemId);
            g(ux9Var, activity, liveItem, str, hashMap);
        }
    }

    public static void f(LiveTimemovingModel liveTimemovingModel, Context context, ux9 ux9Var) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28d97f7f", new Object[]{liveTimemovingModel, context, ux9Var});
            return;
        }
        VideoInfo c0 = up6.c0(ux9Var);
        if (c0 != null && liveTimemovingModel != null) {
            LiveItem liveItem = new LiveItem();
            liveItem.extendVal = liveTimemovingModel.extendVal;
            liveItem.itemH5TaokeUrl = liveTimemovingModel.itemH5TaokeUrl;
            if (TextUtils.isDigitsOnly(liveTimemovingModel.itemId)) {
                liveItem.itemId = zqq.h(liveTimemovingModel.itemId);
            }
            liveItem.itemPic = liveTimemovingModel.itemPic;
            liveItem.itemUrl = liveTimemovingModel.itemUrl;
            liveItem.liveId = c0.liveId;
            liveItem.itemConfigInfo = c0.itemConfigInfo;
            HashMap hashMap = new HashMap();
            hashMap.put("channel", "timemoving");
            hashMap.put("highlight_card_clickPos", "timemove_cart");
            String str2 = "0";
            hashMap.put("highlight_coupon_type", liveTimemovingModel.rightInfo != null ? "1" : str2);
            LiveTimemovingModel.RightInfo rightInfo = liveTimemovingModel.rightInfo;
            String str3 = null;
            hashMap.put("highlight_strategy_code", rightInfo != null ? rightInfo.strategyCode : null);
            LiveTimemovingModel.RightInfo rightInfo2 = liveTimemovingModel.rightInfo;
            hashMap.put("highlight_coupon_id", rightInfo2 != null ? rightInfo2.benefitCode : null);
            e(ux9Var, (Activity) context, liveItem, "detail", hashMap);
            LiveTimemovingModel.RightInfo rightInfo3 = liveTimemovingModel.rightInfo;
            if (rightInfo3 != null) {
                str = rightInfo3.benefitCode;
            } else {
                str = "";
            }
            String str4 = z9u.ARG_ITEM_ID + liveTimemovingModel.itemId;
            if (liveTimemovingModel.rightInfo != null) {
                str2 = "1";
            }
            String concat = "coupon_type=".concat(str2);
            String str5 = "coupon_id=" + str;
            StringBuilder sb = new StringBuilder("strategyCode=");
            LiveTimemovingModel.RightInfo rightInfo4 = liveTimemovingModel.rightInfo;
            if (rightInfo4 != null) {
                str3 = rightInfo4.strategyCode;
            }
            sb.append(str3);
            sbu.g(ux9Var, "timeshiftlayer-todetail", str4, concat, str5, sb.toString(), "timemove_item_type=1");
        }
    }

    public static void g(ux9 ux9Var, Activity activity, LiveItem liveItem, String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a0dcf9", new Object[]{ux9Var, activity, liveItem, str, hashMap});
        } else if (nwa.a(ux9Var).c() != null) {
            nwa.a(ux9Var).c().i(ux9Var, activity, liveItem, str, hashMap);
        }
    }
}
