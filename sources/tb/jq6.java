package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2ResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.ButtonStateHelper;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class jq6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f22156a;
    public boolean b;
    public final ButtonStateHelper c = new ButtonStateHelper();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Comparator<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, obj, obj2})).intValue();
            }
            JSONObject jSONObject = (JSONObject) obj;
            JSONObject jSONObject2 = (JSONObject) obj2;
            int i = Integer.MAX_VALUE;
            int j = !TextUtils.isEmpty(jSONObject.getString("orderVal")) ? zqq.j(jSONObject.getString("orderVal")) : Integer.MAX_VALUE;
            if (!TextUtils.isEmpty(jSONObject2.getString("orderVal"))) {
                i = zqq.j(jSONObject2.getString("orderVal"));
            }
            return j - i;
        }
    }

    static {
        t2o.a(295699329);
    }

    public static void b(xea xeaVar, LiveItem liveItem, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d774896f", new Object[]{xeaVar, liveItem, str});
        } else if (liveItem != null) {
            liveItem.itemConfigInfo = jga.g(xeaVar);
            if (liveItem.nativeConfigInfos == null) {
                liveItem.nativeConfigInfos = new JSONObject();
            }
            liveItem.nativeConfigInfos.put("seckillPreheatAddCart", (Object) Boolean.valueOf(wda.u()));
            String str2 = "1";
            liveItem.nativeConfigInfos.put("newUserAddCart", (Object) str2);
            JSONObject jSONObject = liveItem.nativeConfigInfos;
            if (!wda.f()) {
                str2 = "0";
            }
            jSONObject.put("supportHotItemPreheat", (Object) str2);
            liveItem.nativeConfigInfos.put("categoryId", (Object) str);
        }
    }

    public static void c(LiveItem liveItem, long j) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e566e451", new Object[]{liveItem, new Long(j)});
        } else if (liveItem != null && (jSONObject = liveItem.itemExtData) != null && (jSONArray = jSONObject.getJSONArray("itemBenefitLabels")) != null && !jSONArray.isEmpty()) {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject2 = (JSONObject) it.next();
                if (jSONObject2 == null) {
                    it.remove();
                } else if (!i92.a(jSONObject2, j)) {
                    it.remove();
                } else {
                    return;
                }
            }
        }
    }

    public static void g(LiveItem liveItem, boolean z) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a7c7c26", new Object[]{liveItem, new Boolean(z)});
        } else if (liveItem != null && (jSONObject = liveItem.itemExtData) != null) {
            if (!z) {
                jSONObject.remove("preSaleStatus");
            } else if (TextUtils.equals("0", jSONObject.getString("preSaleStatus"))) {
                long h = zqq.h(liveItem.itemExtData.getString("depositBegin"));
                if (h >= 0 && !liveItem.itemExtData.containsKey("native_depositBegin")) {
                    liveItem.itemExtData.put("native_depositBegin", (Object) pfa.s(h, "付定"));
                }
            }
        }
    }

    public static void h(LiveItem liveItem) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cba8fc1", new Object[]{liveItem});
        } else if (liveItem != null && (jSONObject = liveItem.itemExtData) != null) {
            String string = jSONObject.getString("timingUpShelfStatus");
            long longValue = liveItem.itemExtData.getLongValue("timingStarts");
            if (TextUtils.equals("0", string) && longValue > 0 && TextUtils.isEmpty(liveItem.itemExtData.getString("native_timingStarts"))) {
                liveItem.itemExtData.put("native_timingStarts", (Object) pfa.s(longValue, "开抢"));
            }
        }
    }

    public static void m(ItemlistV2ResponseData itemlistV2ResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cfb59a1", new Object[]{itemlistV2ResponseData});
        } else if (itemlistV2ResponseData != null) {
            if (itemlistV2ResponseData.itemListv1 != null) {
                for (int i = 0; i < itemlistV2ResponseData.itemListv1.size(); i++) {
                    ItemlistV2ResponseData.ItemListv1 itemListv1 = itemlistV2ResponseData.itemListv1.get(i);
                    if (itemListv1 != null) {
                        n(itemListv1.liveItemDO);
                    }
                }
            }
            if (itemlistV2ResponseData.bizTopItemList != null) {
                for (int i2 = 0; i2 < itemlistV2ResponseData.bizTopItemList.size(); i2++) {
                    n(itemlistV2ResponseData.bizTopItemList.get(i2));
                }
            }
            if (itemlistV2ResponseData.hotList != null) {
                for (int i3 = 0; i3 < itemlistV2ResponseData.hotList.size(); i3++) {
                    n(itemlistV2ResponseData.hotList.get(i3));
                }
            }
        }
    }

    public static void n(LiveItem liveItem) {
        JSONObject jSONObject;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b889004e", new Object[]{liveItem});
        } else if (liveItem != null && (jSONObject = liveItem.itemExtData) != null) {
            for (String str : jSONObject.keySet()) {
                if (!TextUtils.isEmpty(str) && (obj = liveItem.itemExtData.get(str)) != null && !(obj instanceof JSON)) {
                    liveItem.itemExtData.put(str, (Object) obj.toString());
                }
            }
        }
    }

    public static void o(LiveItem liveItem, VideoInfo videoInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3591a130", new Object[]{liveItem, videoInfo, str});
        } else if (liveItem != null && videoInfo != null && zga.e(videoInfo.itemTransferInfo)) {
            if (!TextUtils.isEmpty(liveItem.extendVal.tradeParamsForPcg)) {
                LiveItem.Ext ext = liveItem.extendVal;
                ext.tradeParams = ext.tradeParamsForPcg;
            }
            if (TextUtils.equals(str, Long.toString(liveItem.itemId))) {
                liveItem.itemExtData.put("rec0", (Object) "true");
            }
        }
    }

    public void a(xea xeaVar, JSONObject jSONObject) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("278fa8c0", new Object[]{this, xeaVar, jSONObject});
            return;
        }
        ButtonStateHelper buttonStateHelper = this.c;
        boolean z2 = this.b;
        if (!kkr.i().t(xeaVar) || !kkr.i().s(xeaVar)) {
            z = false;
        }
        buttonStateHelper.a(xeaVar, jSONObject, z2, z);
    }

    public void d(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99d1e739", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.f22156a = z;
        this.b = z2;
    }

    public final void e(LiveItem liveItem) {
        LiveItem.Ext ext;
        JSONObject d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3704a97f", new Object[]{this, liveItem});
        } else if (liveItem != null && (ext = liveItem.extendVal) != null && !TextUtils.isEmpty(ext.timeMovingTypeInfo) && (d = fkx.d(liveItem.extendVal.timeMovingTypeInfo)) != null && !"1".equals((String) d.get(String.valueOf(liveItem.itemId)))) {
            LiveItem.Ext ext2 = liveItem.extendVal;
            ext2.playUrl = null;
            ext2.timeMovingPlayInfo = null;
        }
    }

    public void k(xea xeaVar, LiveItem liveItem, VideoInfo videoInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe384c86", new Object[]{this, xeaVar, liveItem, videoInfo, str});
        } else {
            l(xeaVar, liveItem, videoInfo, str, null);
        }
    }

    public void l(xea xeaVar, LiveItem liveItem, VideoInfo videoInfo, String str, String str2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f31a0d0", new Object[]{this, xeaVar, liveItem, videoInfo, str, str2});
        } else if (liveItem != null) {
            j(liveItem);
            f(xeaVar, liveItem);
            e(liveItem);
            g(liveItem, this.f22156a);
            h(liveItem);
            ButtonStateHelper buttonStateHelper = this.c;
            boolean z2 = this.b;
            if (!kkr.i().t(xeaVar) || !kkr.i().s(xeaVar)) {
                z = false;
            }
            buttonStateHelper.b(xeaVar, liveItem, z2, z);
            b(xeaVar, liveItem, str2);
            o(liveItem, videoInfo, str);
        }
    }

    public static boolean i(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed958a68", new Object[]{jSONArray, jSONObject})).booleanValue();
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (jSONObject2 != null && TextUtils.equals(jSONObject.getString("type"), jSONObject2.getString("type"))) {
                return true;
            }
        }
        return false;
    }

    public static void j(LiveItem liveItem) {
        JSONArray a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("651b475c", new Object[]{liveItem});
        } else if (liveItem != null) {
            if (liveItem.native_itemBenefits == null) {
                liveItem.native_itemBenefits = new JSONArray();
            }
            liveItem.native_itemBenefits.clear();
            JSONObject jSONObject = liveItem.personalityData;
            if (jSONObject != null) {
                String str = g0h.f19662a;
                if (!(jSONObject.getJSONArray(str) == null || jSONObject.getJSONArray(str).isEmpty() || (a2 = jga.a(jSONObject.getJSONArray(str))) == null)) {
                    liveItem.native_itemBenefits.addAll(a2);
                }
            }
            JSONObject jSONObject2 = liveItem.itemExtData;
            if (jSONObject2 != null) {
                JSONArray parseArray = JSON.parseArray(jSONObject2.getString(g0h.b));
                JSONArray jSONArray = new JSONArray();
                if (parseArray != null && parseArray.size() > 0) {
                    for (int i = 0; i < parseArray.size(); i++) {
                        JSONObject jSONObject3 = parseArray.getJSONObject(i);
                        if (jSONObject3 != null && !TextUtils.isEmpty(jSONObject3.getString("type")) && !i(liveItem.native_itemBenefits, jSONObject3)) {
                            jSONArray.add(jSONObject3);
                        }
                    }
                    JSONArray a3 = jga.a(jSONArray);
                    if (a3 != null) {
                        liveItem.native_itemBenefits.addAll(a3);
                    }
                    Collections.sort(liveItem.native_itemBenefits, new a());
                }
            }
        }
    }

    public final void f(xea xeaVar, LiveItem liveItem) {
        String str;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2804ec8", new Object[]{this, xeaVar, liveItem});
        } else if (liveItem != null) {
            LiveItem.Ext ext = liveItem.extendVal;
            if (ext == null || (str = ext.liveItemBizTags) == null) {
                liveItem.native_vipTagsShow = false;
                liveItem.native_canShowVipEntrance = false;
                return;
            }
            liveItem.native_vipTagsShow = (str.contains("vipFirst") || liveItem.extendVal.liveItemBizTags.contains("vipBuyGift")) && kkr.i().m(xeaVar) != 0;
            if (!kkr.i().s(xeaVar) || ((!liveItem.extendVal.liveItemBizTags.contains("vipFirst") && !liveItem.extendVal.liveItemBizTags.contains("vipBuyGift")) || kkr.i().m(xeaVar) == 0 || kkr.i().r(xeaVar) || !kkr.i().t(xeaVar))) {
                z = false;
            }
            liveItem.native_canShowVipEntrance = z;
        }
    }
}
