package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.EnterGoodsData;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.GoodListSearchResponse;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2ResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.taolive.lpm_android.event.LpmEventType;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.GoodMsgNew;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class iha {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final int f21309a = yga.d0();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(295699257);
        }

        public static /* synthetic */ void a(String str, String str2, LiveItem liveItem, JSONObject jSONObject, JSONObject jSONObject2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a1b066", new Object[]{str, str2, liveItem, jSONObject, jSONObject2});
            } else {
                c(str, str2, liveItem, jSONObject, jSONObject2);
            }
        }

        public static /* synthetic */ void b(String str, String str2, GoodMsgNew goodMsgNew) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7d736d82", new Object[]{str, str2, goodMsgNew});
            } else {
                e(str, str2, goodMsgNew);
            }
        }

        public static void c(String str, String str2, LiveItem liveItem, JSONObject jSONObject, JSONObject jSONObject2) {
            String str3;
            String str4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e6e066b", new Object[]{str, str2, liveItem, jSONObject, jSONObject2});
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            if (liveItem != null) {
                String valueOf = String.valueOf(liveItem.itemId);
                str3 = String.valueOf(liveItem.goodsIndex);
                str4 = valueOf;
            } else {
                str4 = null;
                str3 = null;
            }
            d(str, str2, str4, str3, jSONObject, jSONObject3);
        }

        public static void d(String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3462fb24", new Object[]{str, str2, str3, str4, jSONObject, jSONObject2});
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            if (str3 != null) {
                jSONObject3.put("itemId", (Object) str3);
            }
            if (str4 != null) {
                jSONObject3.put("goodsIndex", (Object) str4);
            }
            if (jSONObject2 != null) {
                jSONObject3.putAll(jSONObject2);
            }
            iha.a(str, str2, jSONObject, jSONObject3);
        }

        public static void e(String str, String str2, GoodMsgNew goodMsgNew) {
            String str3;
            String str4;
            LiveItem liveItem;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3babdc0", new Object[]{str, str2, goodMsgNew});
                return;
            }
            if (goodMsgNew == null || (liveItem = goodMsgNew.liveItemDO) == null) {
                str4 = null;
                str3 = null;
            } else {
                String valueOf = String.valueOf(liveItem.itemId);
                str3 = String.valueOf(goodMsgNew.liveItemDO.goodsIndex);
                str4 = valueOf;
            }
            d(str, str2, str4, str3, null, null);
        }

        public static void f(String str, String str2, EnterGoodsData enterGoodsData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2f1df6f", new Object[]{str, str2, enterGoodsData});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            if (enterGoodsData != null) {
                jSONObject.put(yj4.PARAM_ITEM_HOLD_TYPE, (Object) enterGoodsData.itemHoldType);
                jSONObject.put(yj4.PARAM_ITEM_IDS, (Object) enterGoodsData.holdItemIds);
                List<LiveItem> list = enterGoodsData.curItemList;
                if (list != null) {
                    jSONObject.put("goodsNum", (Object) Integer.valueOf(list.size()));
                }
            }
            iha.a(str, str2, null, jSONObject);
        }
    }

    static {
        t2o.a(295699255);
    }

    public static void A(GoodMsgNew goodMsgNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a485d22f", new Object[]{goodMsgNew});
        } else {
            a.b("商品消息", "结束讲解", goodMsgNew);
        }
    }

    public static void B(GoodMsgNew goodMsgNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("828009fc", new Object[]{goodMsgNew});
        } else {
            a.b("商品消息", "更新商品", goodMsgNew);
        }
    }

    public static void D(LiveItem liveItem, VideoInfo videoInfo) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6d2aabc", new Object[]{liveItem, videoInfo});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (!(liveItem == null || (jSONObject = liveItem.liveItemStatusData) == null)) {
            boolean booleanValue = jSONObject.getBooleanValue("isGray");
            boolean booleanValue2 = liveItem.liveItemStatusData.getBooleanValue("isDownShelf");
            jSONObject2.put("isGray", (Object) Boolean.valueOf(booleanValue));
            jSONObject2.put("isDownShelf", (Object) Boolean.valueOf(booleanValue2));
        }
        jSONObject2.put("liveId", (Object) (videoInfo == null ? null : String.valueOf(videoInfo.liveId)));
        a.a("小卡", "商品校验失败", liveItem, jSONObject2, null);
    }

    public static void E(LiveItem liveItem, LiveItem liveItem2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0a26869", new Object[]{liveItem, liveItem2});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (liveItem != null) {
            jSONObject.put("currItemId", (Object) String.valueOf(liveItem.itemId));
            jSONObject.put("currGoodsIndex", (Object) String.valueOf(liveItem.goodsIndex));
        }
        if (liveItem2 != null) {
            jSONObject.put("newItemId", (Object) String.valueOf(liveItem2.itemId));
            jSONObject.put("newGoodsIndex", (Object) String.valueOf(liveItem2.goodsIndex));
        }
        c("小卡", "优先级校验失败", jSONObject, null);
    }

    public static void F(LiveItem liveItem, Boolean bool, String str, Boolean bool2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ae4c35", new Object[]{liveItem, bool, str, bool2});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("succeed", (Object) bool);
        jSONObject.put("isAddProduct", (Object) bool2);
        jSONObject.put("scene", (Object) str);
        a.a("小卡", "商品请求", liveItem, jSONObject, null);
    }

    public static void G(LiveItem liveItem, LiveItem liveItem2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7edd00c2", new Object[]{liveItem, liveItem2});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (liveItem != null) {
            jSONObject.put("currItemId", (Object) String.valueOf(liveItem.itemId));
            jSONObject.put("currGoodsIndex", (Object) String.valueOf(liveItem.goodsIndex));
        }
        if (liveItem2 != null) {
            jSONObject.put("newItemId", (Object) String.valueOf(liveItem2.itemId));
            jSONObject.put("newGoodsIndex", (Object) String.valueOf(liveItem2.goodsIndex));
        }
        c("小卡", wmc.REFRESH, jSONObject, null);
    }

    public static void H(LiveItem liveItem, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8e7e07f", new Object[]{liveItem, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("goodSource", (Object) str);
        a.a("小卡", "展示", liveItem, jSONObject, null);
    }

    public static void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37130437", new Object[0]);
        } else {
            c("小卡", "播放关闭动画", null, null);
        }
    }

    public static void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f020b80a", new Object[0]);
        } else {
            c("小卡", "播放打开动画", null, null);
        }
    }

    public static void K(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b091d46", new Object[]{str, str2, str3, str4});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("popId", (Object) str);
        jSONObject.put(yj4.PARAM_ITEM_HOLD_TYPE, (Object) str2);
        jSONObject.put(yj4.PARAM_ITEM_IDS, (Object) str3);
        jSONObject.put("sjsdItemIdLiveItem", (Object) str4);
        c("SmartLanding", "触发", jSONObject, null);
    }

    public static /* synthetic */ boolean a(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("936db151", new Object[]{str, str2, jSONObject, jSONObject2})).booleanValue();
        }
        return c(str, str2, jSONObject, jSONObject2);
    }

    public static qmh b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qmh) ipChange.ipc$dispatch("ed610bd7", new Object[0]);
        }
        return qmh.f();
    }

    public static boolean c(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6831d2", new Object[]{str, str2, jSONObject, jSONObject2})).booleanValue();
        }
        try {
            String str3 = str + "-" + str2;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("briefData", (Object) jSONObject);
            jSONObject3.put("detailData", (Object) jSONObject2);
            return d(LpmEventType.TAOLIVE_GOODS, str3, new org.json.JSONObject(jSONObject3.toJSONString()), "TaoLiveGoods", "");
        } catch (Exception e) {
            hha.b("GoodsLpmUtils", e.toString());
            return false;
        }
    }

    public static boolean d(LpmEventType lpmEventType, String str, org.json.JSONObject jSONObject, String str2, String str3) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("954b273", new Object[]{lpmEventType, str, jSONObject, str2, str3})).booleanValue();
        }
        try {
            int i = f21309a;
            if (i == 1) {
                b().a(lpmEventType, str, jSONObject, str2, str3);
            } else if (i == 2) {
                if (jSONObject != null) {
                    str4 = jSONObject.toString();
                } else {
                    str4 = "";
                }
                hha.b("GoodsLpmUtils-TLog", str2 + "::" + str + "::" + str4);
            }
            return true;
        } catch (Exception e) {
            hha.b("GoodsLpmUtils", e.toString());
            return false;
        }
    }

    public static void e(EnterGoodsData enterGoodsData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cff1e4f7", new Object[]{enterGoodsData});
        } else {
            a.f("商品承接", "商品聚合页", enterGoodsData);
        }
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("417cace9", new Object[0]);
        } else {
            c("口袋组件", "关闭", null, null);
        }
    }

    public static void g(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cbe9055", new Object[]{str, str2, str3});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("liveId", (Object) str);
        jSONObject.put("liveSource", (Object) str2);
        jSONObject.put("entryLiveSource", (Object) str3);
        c("口袋组件", "初始化", jSONObject, null);
    }

    public static void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3930404", new Object[]{str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bizType", (Object) str);
        c("口袋组件", "打开Component", jSONObject, null);
    }

    public static void i(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c1c8e30", new Object[]{str, str2, new Integer(i)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bizType", (Object) str);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(rg0.JUMP_URL, (Object) str2);
        jSONObject2.put("bannerCount", (Object) Integer.valueOf(i));
        c("口袋组件", "打开H5链接", jSONObject, jSONObject2);
    }

    public static void j(String str, boolean z, boolean z2, boolean z3, long j, boolean z4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c29d7eb6", new Object[]{str, new Boolean(z), new Boolean(z2), new Boolean(z3), new Long(j), new Boolean(z4)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("from", (Object) str);
        jSONObject.put("isShowItemGroup", (Object) Boolean.valueOf(z));
        jSONObject.put("hasShow", (Object) Boolean.valueOf(z2));
        jSONObject.put("isUnderTake", (Object) Boolean.valueOf(z3));
        jSONObject.put("topItemId", (Object) Long.valueOf(j));
        jSONObject.put("recoverFromCache", (Object) Boolean.valueOf(z4));
        c("口袋组件", "打开", null, jSONObject);
    }

    public static void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42fa5f0e", new Object[]{str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("targetEntry", (Object) str);
        c("口袋列表", "顶部点击", jSONObject, null);
    }

    public static void l(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("badc1463", new Object[]{new Integer(i), str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("goodsNum", (Object) Integer.valueOf(i));
        jSONObject.put("scrollDirection", (Object) str);
        c("口袋列表", "滚动过期更新", jSONObject, null);
    }

    public static void m(ItemlistV2ResponseData itemlistV2ResponseData, boolean z, boolean z2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e8918bc", new Object[]{itemlistV2ResponseData, new Boolean(z), new Boolean(z2), str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("noticeTopItemId", (Object) Boolean.valueOf(z));
        jSONObject.put("isCdn", (Object) Boolean.valueOf(z2));
        jSONObject.put("scene", (Object) str);
        jSONObject.put("goodsNum", (Object) (itemlistV2ResponseData == null ? null : Integer.valueOf(itemlistV2ResponseData.itemListv1.size())));
        c("口袋列表", "处理商品数据", jSONObject, null);
    }

    public static void o(String str, String str2, Boolean bool, boolean z, String str3, Boolean bool2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdb96920", new Object[]{str, str2, bool, new Boolean(z), str3, bool2});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("liveId", (Object) str);
        jSONObject.put("categoryId", (Object) str2);
        jSONObject.put("noticeTopId", (Object) bool);
        jSONObject.put("useCdn", (Object) Boolean.valueOf(z));
        jSONObject.put("scene", (Object) str3);
        jSONObject.put("firstPage", (Object) bool2);
        c("口袋列表", "请求失败", null, jSONObject);
    }

    public static void p(String str, int i, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("584c860a", new Object[]{str, new Integer(i), new Boolean(z), str2});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tabName", (Object) str);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("tabSeq", (Object) Integer.valueOf(i));
        jSONObject2.put("switchTab", (Object) Boolean.valueOf(z));
        jSONObject.put("categoryId", (Object) str2);
        c("口袋列表", "Tab切换", jSONObject, jSONObject2);
    }

    public static void q(EnterGoodsData enterGoodsData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66015e59", new Object[]{enterGoodsData});
        } else {
            a.f("商品承接", "口袋", enterGoodsData);
        }
    }

    public static void r(EnterGoodsData enterGoodsData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69e3738c", new Object[]{enterGoodsData});
        } else {
            a.f("商品承接", "半屏商详", enterGoodsData);
        }
    }

    public static void s(String str, LiveItem liveItem, boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64266808", new Object[]{str, liveItem, new Boolean(z), jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("success", (Object) Boolean.valueOf(z));
        a.a(str, "商品加购", liveItem, jSONObject2, jSONObject);
    }

    public static void t(String str, LiveItem liveItem, boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f61c8d78", new Object[]{str, liveItem, new Boolean(z), jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("success", (Object) Boolean.valueOf(z));
        a.a(str, "商品去商详", liveItem, jSONObject2, jSONObject);
    }

    public static void u(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9df0e6d", new Object[]{jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            String string = jSONObject.getString("itemId");
            String string2 = jSONObject.getString("status");
            String string3 = jSONObject.getString("type");
            jSONObject2.put("itemId", (Object) string);
            jSONObject2.put("status", (Object) string2);
            jSONObject2.put("type", (Object) string3);
        }
        c("商品消息", "状态改变", jSONObject2, null);
    }

    public static void v(GoodMsgNew goodMsgNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c315e1a", new Object[]{goodMsgNew});
        } else {
            a.b("商品消息", "上架", goodMsgNew);
        }
    }

    public static void w(GoodMsgNew goodMsgNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68aa5d8d", new Object[]{goodMsgNew});
        } else {
            a.b("商品消息", "开始讲解", goodMsgNew);
        }
    }

    public static void x(GoodMsgNew goodMsgNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3af95022", new Object[]{goodMsgNew});
        } else {
            a.b("商品消息", "删除讲解", goodMsgNew);
        }
    }

    public static void y(GoodMsgNew goodMsgNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("197da136", new Object[]{goodMsgNew});
        } else {
            a.b("商品消息", "热卖", goodMsgNew);
        }
    }

    public static void z(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2169ffb", new Object[]{new Long(j), new Integer(i)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("itemId", (Object) Long.valueOf(j));
        jSONObject.put(iiz.PERF_STAG_TOTAL, (Object) Integer.valueOf(i));
        c("商品消息", "热卖数量", jSONObject, null);
    }

    public static void C(String str, String str2, boolean z, GoodListSearchResponse.GoodListSearchResponseData goodListSearchResponseData) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c58ddc1", new Object[]{str, str2, new Boolean(z), goodListSearchResponseData});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", (Object) str);
        jSONObject.put("type", (Object) str2);
        jSONObject.put("succeed", (Object) Boolean.valueOf(z));
        JSONObject jSONObject2 = new JSONObject();
        if (goodListSearchResponseData != null) {
            int i2 = goodListSearchResponseData.totalNum;
            List<ItemlistV2ResponseData.ItemListv1> list = goodListSearchResponseData.itemListv1;
            if (list != null) {
                i = list.size();
            }
            boolean z2 = goodListSearchResponseData.hasNext;
            jSONObject2.put("totalNum", (Object) Integer.valueOf(i2));
            jSONObject2.put("listSize", (Object) Integer.valueOf(i));
            jSONObject2.put("hasNext", (Object) Boolean.valueOf(z2));
        }
        c("口袋搜索", "请求", jSONObject, jSONObject2);
    }

    public static void n(List<th5> list, ItemCategory itemCategory) {
        String str;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6feab7c", new Object[]{list, itemCategory});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (itemCategory == null) {
            str = "";
        } else {
            str = itemCategory.name;
        }
        if (list != null) {
            i = list.size();
        }
        jSONObject.put("tabName", (Object) str);
        jSONObject.put("goodsNum", (Object) Integer.valueOf(i));
        c("口袋列表", "渲染", jSONObject, null);
    }
}
