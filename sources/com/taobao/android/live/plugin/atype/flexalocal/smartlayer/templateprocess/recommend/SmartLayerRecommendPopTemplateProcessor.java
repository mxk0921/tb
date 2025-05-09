package com.taobao.android.live.plugin.atype.flexalocal.smartlayer.templateprocess.recommend;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.ItemInfo;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.constant.SmartLayerConstant$SmartLayerStage;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.controller.SmartRecommendPopLayerController;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.viewmodel.SmartLayerViewModel;
import com.taobao.android.tbsku.TBXSkuCore;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.b7q;
import tb.drd;
import tb.fkx;
import tb.g6q;
import tb.l6q;
import tb.l7q;
import tb.p6q;
import tb.rg0;
import tb.s6q;
import tb.t2o;
import tb.uir;
import tb.x6q;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class SmartLayerRecommendPopTemplateProcessor extends x6q implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "SmartLayerRecommendPopTemplatePlugin";
    public boolean isReceiving = false;
    private boolean isRequestRecommendFinish = false;
    public g6q mConfig;
    public SmartRecommendPopLayerController mLayerController;
    public l6q mSmartContext;
    public SmartRecommendPopViewModel mViewModel;

    static {
        t2o.a(295699804);
        t2o.a(806355930);
    }

    public SmartLayerRecommendPopTemplateProcessor(SmartRecommendPopLayerController smartRecommendPopLayerController) {
        this.mLayerController = smartRecommendPopLayerController;
        if (smartRecommendPopLayerController != null) {
            this.mConfig = smartRecommendPopLayerController.f24542a;
            this.mViewModel = (SmartRecommendPopViewModel) smartRecommendPopLayerController.c;
            this.mSmartContext = smartRecommendPopLayerController.b;
        }
    }

    public static /* synthetic */ List access$000(SmartLayerRecommendPopTemplateProcessor smartLayerRecommendPopTemplateProcessor, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7e9d944a", new Object[]{smartLayerRecommendPopTemplateProcessor, jSONObject});
        }
        return smartLayerRecommendPopTemplateProcessor.generateListItem(jSONObject);
    }

    public static /* synthetic */ boolean access$102(SmartLayerRecommendPopTemplateProcessor smartLayerRecommendPopTemplateProcessor, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97d935a2", new Object[]{smartLayerRecommendPopTemplateProcessor, new Boolean(z)})).booleanValue();
        }
        smartLayerRecommendPopTemplateProcessor.isRequestRecommendFinish = z;
        return z;
    }

    private JSONObject generateAnimData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("752c3679", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getJSONObject("animInfo");
    }

    private List<SmartRecommendPopLayerController.ListItemInfo> generateListItem(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("74d0a244", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        return getItemInfoList(jSONObject.getJSONArray("cardInfoList"));
    }

    private JSONObject generateRedPacketData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("62b9fadb", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getJSONObject("redPacketInfo");
    }

    private JSONObject generateShowData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cb46c283", new Object[]{this});
        }
        SmartRecommendPopViewModel smartRecommendPopViewModel = this.mViewModel;
        if (smartRecommendPopViewModel == null || this.mSmartContext == null) {
            return null;
        }
        return smartRecommendPopViewModel.getModeDataWithStage("show");
    }

    private JSONObject generateTopBarData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4f264dec", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getJSONObject(yj4.PARAM_EXTEND);
    }

    private List<SmartRecommendPopLayerController.ListItemInfo> getItemInfoList(JSONArray jSONArray) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d714b583", new Object[]{this, jSONArray});
        }
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                SmartRecommendPopLayerController.ListItemInfo listItemInfo = (SmartRecommendPopLayerController.ListItemInfo) fkx.j(jSONObject, SmartRecommendPopLayerController.ListItemInfo.class);
                listItemInfo.ori = jSONObject;
                JSONObject jSONObject2 = listItemInfo.item;
                if (jSONObject2 != null) {
                    str = jSONObject2.getString("id");
                } else {
                    str = "";
                }
                listItemInfo.itemId = str;
                arrayList.add(listItemInfo);
                this.mViewModel.addPageExpInfo(listItemInfo.itemId);
            }
        }
        return arrayList;
    }

    private void goToDetail(ItemInfo itemInfo, boolean z) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20740bbd", new Object[]{this, itemInfo, new Boolean(z)});
            return;
        }
        SmartLayerConstant$SmartLayerStage smartLayerConstant$SmartLayerStage = SmartLayerConstant$SmartLayerStage.SMART_JUMP;
        g6q g6qVar = this.mConfig;
        p6q.d(smartLayerConstant$SmartLayerStage, g6qVar, "goToDetail", "点击跳转：" + z);
        if (this.mViewModel != null && itemInfo != null && (jSONObject = itemInfo.card) != null && jSONObject.containsKey("detailUrl")) {
            String string = itemInfo.card.getString("detailUrl");
            HashMap hashMap = new HashMap();
            hashMap.put("isNewBuy", String.valueOf(z));
            hashMap.put(rg0.JUMP_URL, string);
            b7q.e(this.mConfig, this.mSmartContext, smartLayerConstant$SmartLayerStage, SmartLayerConstant$SmartLayerStage.SMART_SHOW, hashMap);
            if (!z || (jSONObject2 = itemInfo.item) == null || !jSONObject2.getBooleanValue("enableSku")) {
                this.mViewModel.sampleSkipToGoodsDetail(string, itemInfo, true, false, "gotodetail");
                return;
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("itemId", itemInfo.item.getString("id"));
            hashMap2.put("openFrom", "tblive");
            hashMap2.put("bottomMode", "BUYNOW");
            if (itemInfo.item.containsKey("tradeParams")) {
                hashMap2.put("exParams", itemInfo.item.getJSONObject("tradeParams"));
            }
            uir.a("taolivegoods", "openNewBuy", hashMap2, this.mSmartContext.a(), null);
            this.mViewModel.sampleSkipToGoodsDetail("", itemInfo, false, true, "gotodetail");
        }
    }

    public static /* synthetic */ Object ipc$super(SmartLayerRecommendPopTemplateProcessor smartLayerRecommendPopTemplateProcessor, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/smartlayer/templateprocess/recommend/SmartLayerRecommendPopTemplateProcessor");
    }

    private void showAnim() {
        JSONObject generateShowData;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9db9c835", new Object[]{this});
        } else if (this.mLayerController != null && (generateShowData = generateShowData()) != null && (jSONObject = generateShowData.getJSONObject("displayStyleExtend")) != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("animation");
            JSONObject generateRedPacketData = generateRedPacketData(jSONObject2);
            JSONObject generateAnimData = generateAnimData(jSONObject2);
            if (generateRedPacketData != null) {
                this.mLayerController.F(jSONObject);
            } else if (generateAnimData != null) {
                this.mLayerController.E(jSONObject);
            }
        }
    }

    public boolean isValid(String str) {
        s6q modeWithStage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77e5607", new Object[]{this, str})).booleanValue();
        }
        if (this.mViewModel == null || this.mLayerController == null || TextUtils.isEmpty(str) || (modeWithStage = this.mViewModel.getModeWithStage(str)) == null || modeWithStage.f27828a == null) {
            return false;
        }
        return true;
    }

    public void onLayerDidShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9814c91", new Object[]{this});
            return;
        }
        SmartRecommendPopViewModel smartRecommendPopViewModel = this.mViewModel;
        if (smartRecommendPopViewModel != null) {
            smartRecommendPopViewModel.trackShowUT("item_right_popview_expousure", null);
        }
    }

    public void onLayerWillShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e3ec8", new Object[]{this});
        }
    }

    @Override // tb.x6q
    public void onLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1309896c", new Object[]{this});
            return;
        }
        registerEventHandler();
        processShowStage();
    }

    public void onUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b567900f", new Object[]{this});
        } else {
            refreshTemplate();
        }
    }

    public void processShowStage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a32e27d9", new Object[]{this});
        } else if (this.mViewModel != null) {
            if (!isValid("show")) {
                this.mLayerController.d("ERROR_CODE_DATA_ERROR", "数据不合法");
                return;
            }
            p6q.d(SmartLayerConstant$SmartLayerStage.SMART_TEMPLATE, this.mConfig, TAG, "processShowStage");
            refreshTemplate();
            showAnim();
            this.mLayerController.g();
            onLayerWillShow();
        }
    }

    public void refreshTemplate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("590afa7c", new Object[]{this});
        } else if (this.mLayerController != null) {
            JSONObject generateShowData = generateShowData();
            this.mLayerController.G(generateTopBarData(generateShowData), generateListItem(generateShowData));
        }
    }

    public void registerEventHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b02649a", new Object[]{this});
            return;
        }
        SmartRecommendPopLayerController smartRecommendPopLayerController = this.mLayerController;
        if (smartRecommendPopLayerController != null) {
            smartRecommendPopLayerController.D(new l7q(this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements drd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.drd
        public void a(SmartLayerViewModel smartLayerViewModel, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4d19433", new Object[]{this, smartLayerViewModel, str});
                return;
            }
            SmartLayerRecommendPopTemplateProcessor.this.isReceiving = false;
            p6q.c(SmartLayerConstant$SmartLayerStage.SMART_LOAD_MORE, smartLayerViewModel != null ? smartLayerViewModel.mSmartConfig : null, "loadMore", "权益领取成功：");
            SmartLayerRecommendPopTemplateProcessor smartLayerRecommendPopTemplateProcessor = SmartLayerRecommendPopTemplateProcessor.this;
            SmartRecommendPopViewModel smartRecommendPopViewModel = smartLayerRecommendPopTemplateProcessor.mViewModel;
            if (smartRecommendPopViewModel == null || smartLayerRecommendPopTemplateProcessor.mLayerController == null) {
                SmartLayerRecommendPopTemplateProcessor.access$102(smartLayerRecommendPopTemplateProcessor, true);
                return;
            }
            List<SmartRecommendPopLayerController.ListItemInfo> access$000 = SmartLayerRecommendPopTemplateProcessor.access$000(SmartLayerRecommendPopTemplateProcessor.this, smartRecommendPopViewModel.getModeDataWithStage("loadMore"));
            if (access$000 == null || access$000.isEmpty()) {
                SmartLayerRecommendPopTemplateProcessor.access$102(SmartLayerRecommendPopTemplateProcessor.this, true);
                return;
            }
            SmartLayerRecommendPopTemplateProcessor.this.mLayerController.C(access$000);
            SmartLayerRecommendPopTemplateProcessor.access$102(SmartLayerRecommendPopTemplateProcessor.this, false);
        }

        @Override // tb.drd
        public void b(SmartLayerViewModel smartLayerViewModel, String str, String str2, String str3) {
            g6q g6qVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c6ba852", new Object[]{this, smartLayerViewModel, str, str2, str3});
                return;
            }
            if (smartLayerViewModel == null || (g6qVar = smartLayerViewModel.mSmartConfig) == null) {
                g6qVar = null;
            }
            SmartLayerConstant$SmartLayerStage smartLayerConstant$SmartLayerStage = SmartLayerConstant$SmartLayerStage.SMART_LOAD_MORE;
            p6q.c(smartLayerConstant$SmartLayerStage, g6qVar, "loadMore", "请求分页数据失败，返回结果：" + str2 + ", " + str3);
            SmartLayerRecommendPopTemplateProcessor smartLayerRecommendPopTemplateProcessor = SmartLayerRecommendPopTemplateProcessor.this;
            smartLayerRecommendPopTemplateProcessor.isReceiving = false;
            SmartLayerRecommendPopTemplateProcessor.access$102(smartLayerRecommendPopTemplateProcessor, true);
        }
    }

    public void loadMore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f65f062", new Object[]{this});
        } else if (!this.isRequestRecommendFinish) {
            SmartRecommendPopViewModel smartRecommendPopViewModel = this.mViewModel;
            if (smartRecommendPopViewModel == null) {
                p6q.c(SmartLayerConstant$SmartLayerStage.SMART_LOAD_MORE, this.mConfig, "loadMore", "mViewModel为null");
            } else if (this.isReceiving) {
                p6q.c(SmartLayerConstant$SmartLayerStage.SMART_LOAD_MORE, this.mConfig, "loadMore", "正在领取中");
            } else {
                this.isReceiving = true;
                smartRecommendPopViewModel.loadWithStage("loadMore", new a());
            }
        }
    }

    public void handleEvent(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2f89b8", new Object[]{this, objArr});
        } else if (this.mLayerController != null && this.mViewModel != null && objArr != null && objArr.length >= 2) {
            Object obj = objArr[1];
            ItemInfo itemInfo = obj instanceof JSONObject ? (ItemInfo) fkx.j((JSON) obj, ItemInfo.class) : null;
            if ("close".equals(objArr[0])) {
                this.mLayerController.o();
                this.mViewModel.sampleSkipToGoodsDetail("", itemInfo, false, false, "close");
                this.mViewModel.trackClickUT("item_right_popview_close_click", itemInfo);
            } else if ("goToDetail".equals(objArr[0])) {
                goToDetail(itemInfo, false);
                this.mViewModel.trackClickUT("item_right_popview_item_click", itemInfo);
            } else if (TBXSkuCore.CONTAINER_TYPE_NEWBUY.equals(objArr[0])) {
                goToDetail(itemInfo, true);
                this.mViewModel.trackClickUT("item_right_popview_button_click", itemInfo);
            }
        }
    }
}
