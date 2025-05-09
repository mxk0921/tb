package tb;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.EnterGoodsData;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class bia {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UNDER_TAKE_BIG_CARD = "bigCard";
    public static final String UNDER_TAKE_EXPLOSION_CARD = "itemCard";
    public static final String UNDER_TAKE_GOODS_LIST = "itemList";
    public static final String UNDER_TAKE_INSIDE_DETAIL = "insideDetail";
    public static final String UNDER_TAKE_ITEM_GROUP_LIST = "itemGroupList";

    static {
        t2o.a(295699408);
    }

    public static boolean a(xea xeaVar, String str) {
        fea k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5febf808", new Object[]{xeaVar, str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && (k = kkr.i().k(xeaVar, str)) != null && k.c() != null && !k.c().isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean b(ux9 ux9Var, Activity activity, VideoInfo videoInfo, EnterGoodsData enterGoodsData) {
        List<LiveItem> list;
        LiveItem liveItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52295b44", new Object[]{ux9Var, activity, videoInfo, enterGoodsData})).booleanValue();
        }
        if (videoInfo != null && enterGoodsData != null && TextUtils.equals(UNDER_TAKE_INSIDE_DETAIL, enterGoodsData.itemHoldType) && (list = enterGoodsData.curItemList) != null && !list.isEmpty() && !TextUtils.isEmpty(enterGoodsData.holdItemIds)) {
            String[] split = enterGoodsData.holdItemIds.split(Character.toString(','));
            if (split == null || split.length == 0 || TextUtils.isEmpty(split[0])) {
                hha.b("GoodsUnderTakeHelper", "checkInsideDetailTakeItemId | id parse failed. holdItemIds=" + enterGoodsData.holdItemIds);
            } else {
                Iterator<LiveItem> it = enterGoodsData.curItemList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        liveItem = null;
                        break;
                    }
                    liveItem = it.next();
                    if (TextUtils.equals(Long.toString(liveItem.itemId), split[0])) {
                        break;
                    }
                }
                if (liveItem == null) {
                    hha.b("GoodsUnderTakeHelper", "checkInsideDetailTakeItemId | target item find failed.  holdItemIds=" + enterGoodsData.holdItemIds);
                    return false;
                }
                if (liveItem.itemConfigInfo == null) {
                    JSONObject jSONObject = videoInfo.itemConfigInfo;
                    liveItem.itemConfigInfo = jSONObject;
                    if (jSONObject == null) {
                        liveItem.itemConfigInfo = new JSONObject();
                    }
                    JSONObject jSONObject2 = (JSONObject) liveItem.itemConfigInfo.clone();
                    liveItem.itemConfigInfo = jSONObject2;
                    jSONObject2.put("itemSourceType", (Object) "hold");
                }
                if (!xbf.d(activity, liveItem) || !xbf.j()) {
                    enterGoodsData.itemHoldType = UNDER_TAKE_GOODS_LIST;
                    videoInfo.itemHoldType = UNDER_TAKE_GOODS_LIST;
                    return false;
                }
                if (TextUtils.isEmpty(liveItem.cpsClickPos)) {
                    liveItem.cpsClickPos = "insidedetail";
                }
                hha.c("GoodsUnderTakeHelper", "checkInsideDetailTakeItemId | inside take , goodIndex=" + liveItem.goodsIndex + "  itemId=" + liveItem.itemId);
                nha.i();
                kkr.i().d().h(ux9Var, activity, liveItem, "detail", null);
                return true;
            }
        }
        return false;
    }

    public static long c(EnterGoodsData enterGoodsData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b8ddc6c", new Object[]{enterGoodsData})).longValue();
        }
        if (enterGoodsData == null || TextUtils.isEmpty(enterGoodsData.holdItemIds)) {
            return -1L;
        }
        String[] split = enterGoodsData.holdItemIds.split(Character.toString(','));
        if (split.length == 0) {
            return -1L;
        }
        return zqq.i(split[0], -1L);
    }

    public static void d(xea xeaVar, long j) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1e9aa62", new Object[]{xeaVar, new Long(j)});
        } else if (0 < j) {
            HashMap hashMap = new HashMap();
            hashMap.put("bizTopItemId", String.valueOf(j));
            hashMap.put("from", "additionitem");
            sjr g = sjr.g();
            if (xeaVar == null) {
                str = null;
            } else {
                str = xeaVar.F();
            }
            g.c(uyg.EVENT_SHOW_GOODSPACKAGE, hashMap, str);
        }
    }
}
