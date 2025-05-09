package com.taobao.android.live.plugin.atype.flexalocal.smartlayer.templateprocess.recommend;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alilive.adapter.business.BusinessInfo;
import com.alilive.adapter.business.BusinessUtil;
import com.alilive.adapter.business.FissionTcpParam;
import com.alipay.mobile.monitor.track.spm.merge.MergeUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.ItemInfo;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.business.MtopTbliveRecommendPopviewQueryResponse;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.viewmodel.SmartLayerViewModel;
import com.taobao.android.tbsku.TBXSkuCore;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.VideoStatus;
import java.util.ArrayList;
import java.util.HashMap;
import tb.amr;
import tb.b0d;
import tb.eon;
import tb.fkx;
import tb.frd;
import tb.fxf;
import tb.g6q;
import tb.l6q;
import tb.t2o;
import tb.ux9;
import tb.v2s;
import tb.yga;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class SmartRecommendPopViewModel extends SmartLayerViewModel implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DX_VERSION_CODE = "20250101";
    private String code;
    private JSONObject logParams;
    private String mItemIds;
    private JSONObject mRecommendQuery;
    private String mShareType;
    private String outerAdUserParam;
    private String rid;
    private String tcpOuterParam;
    private String typeName;
    private int pageIndex = 1;
    private int pageSize = 10;
    private JSONArray pageExpInfoList = new JSONArray();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ frd f8675a;

        public a(frd frdVar) {
            this.f8675a = frdVar;
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                SmartRecommendPopViewModel.access$300(SmartRecommendPopViewModel.this, netResponse, this.f8675a);
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            JSONObject jSONObject = netBaseOutDo instanceof MtopTbliveRecommendPopviewQueryResponse ? (JSONObject) netBaseOutDo.getData() : null;
            frd frdVar = this.f8675a;
            if (frdVar == null) {
                return;
            }
            if (jSONObject != null) {
                SmartRecommendPopViewModel.access$002(SmartRecommendPopViewModel.this, jSONObject.getString("code"));
                SmartRecommendPopViewModel.access$102(SmartRecommendPopViewModel.this, jSONObject.getString("typeName"));
                SmartRecommendPopViewModel.access$202(SmartRecommendPopViewModel.this, jSONObject.getJSONObject("logParams"));
                if (!"200".equals(SmartRecommendPopViewModel.access$000(SmartRecommendPopViewModel.this)) || !"multiItemWithRight".equals(SmartRecommendPopViewModel.access$100(SmartRecommendPopViewModel.this))) {
                    this.f8675a.onFail("query_interact_data_empty", "RecommendPop数据请求无数据");
                } else {
                    this.f8675a.onSuccess(jSONObject);
                }
            } else {
                frdVar.onFail("query_interact_data_empty", "RecommendPop数据请求为空");
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                SmartRecommendPopViewModel.access$300(SmartRecommendPopViewModel.this, netResponse, this.f8675a);
            }
        }
    }

    static {
        t2o.a(295699806);
        t2o.a(806355930);
    }

    public SmartRecommendPopViewModel(l6q l6qVar, g6q g6qVar) {
        super(l6qVar, g6qVar);
        Uri parse;
        JSONObject jSONObject;
        this.mItemIds = "";
        this.mShareType = "";
        this.mRecommendQuery = new JSONObject();
        if (!TextUtils.isEmpty(l6qVar.l) && (parse = Uri.parse(l6qVar.l)) != null) {
            l6q l6qVar2 = this.mSmartContext;
            if (!(l6qVar2 == null || (jSONObject = l6qVar2.r) == null)) {
                this.mItemIds = amr.A(jSONObject.getString("itemIds"), this.mSmartContext.r.getString(yj4.PARAM_SHAQRE_ITEM_ID), this.mSmartContext.r.getString("dispatchItemID"));
                this.mShareType = this.mSmartContext.r.getString("shareType");
                JSONObject jSONObject2 = this.mSmartContext.r.getJSONObject("huanduanParams");
                this.mRecommendQuery = jSONObject2;
                if (jSONObject2 == null) {
                    this.mRecommendQuery = new JSONObject();
                }
                this.mRecommendQuery.put("versionCode", (Object) DX_VERSION_CODE);
            }
            this.outerAdUserParam = parse.getQueryParameter("outerAdUserParam");
            this.tcpOuterParam = parse.getQueryParameter(yj4.PARAM_TCP_OUTER_PARAM);
            this.rid = parse.getQueryParameter(MergeUtil.KEY_RID);
        }
    }

    public static /* synthetic */ String access$000(SmartRecommendPopViewModel smartRecommendPopViewModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4ed2fb44", new Object[]{smartRecommendPopViewModel});
        }
        return smartRecommendPopViewModel.code;
    }

    public static /* synthetic */ String access$002(SmartRecommendPopViewModel smartRecommendPopViewModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e70f7bc", new Object[]{smartRecommendPopViewModel, str});
        }
        smartRecommendPopViewModel.code = str;
        return str;
    }

    public static /* synthetic */ String access$100(SmartRecommendPopViewModel smartRecommendPopViewModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50e65a45", new Object[]{smartRecommendPopViewModel});
        }
        return smartRecommendPopViewModel.typeName;
    }

    public static /* synthetic */ String access$102(SmartRecommendPopViewModel smartRecommendPopViewModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e9b4f87d", new Object[]{smartRecommendPopViewModel, str});
        }
        smartRecommendPopViewModel.typeName = str;
        return str;
    }

    public static /* synthetic */ JSONObject access$202(SmartRecommendPopViewModel smartRecommendPopViewModel, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4ba55138", new Object[]{smartRecommendPopViewModel, jSONObject});
        }
        smartRecommendPopViewModel.logParams = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ void access$300(SmartRecommendPopViewModel smartRecommendPopViewModel, NetResponse netResponse, frd frdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebd60528", new Object[]{smartRecommendPopViewModel, netResponse, frdVar});
        } else {
            smartRecommendPopViewModel.callbackFail(netResponse, frdVar);
        }
    }

    private void callbackFail(NetResponse netResponse, frd frdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca978ff9", new Object[]{this, netResponse, frdVar});
            return;
        }
        String str = "network_request_error";
        String str2 = "网络请求失败";
        if (netResponse != null) {
            if (!TextUtils.isEmpty(netResponse.getRetCode())) {
                str = netResponse.getRetCode();
            }
            if (!TextUtils.isEmpty(netResponse.getRetMsg())) {
                str2 = netResponse.getRetMsg();
            }
        }
        if (frdVar != null) {
            frdVar.onFail(str, str2);
        }
    }

    public static /* synthetic */ Object ipc$super(SmartRecommendPopViewModel smartRecommendPopViewModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/smartlayer/templateprocess/recommend/SmartRecommendPopViewModel");
    }

    private void mergeDataAttributes(BusinessInfo businessInfo, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3e9927d", new Object[]{this, businessInfo, new Boolean(z)});
        } else if (businessInfo != null && businessInfo.tcp != null && !TextUtils.isEmpty(this.mSmartContext.l)) {
            l6q l6qVar = this.mSmartContext;
            ux9 ux9Var = l6qVar.t;
            if (ux9Var != null) {
                FissionTcpParam fissionTcpParam = businessInfo.tcp;
                fissionTcpParam.dataAttributes = BusinessUtil.c(ux9Var, fissionTcpParam.dataAttributes, l6qVar.l);
            } else {
                FissionTcpParam fissionTcpParam2 = businessInfo.tcp;
                fissionTcpParam2.dataAttributes = BusinessUtil.b(l6qVar.q, fissionTcpParam2.dataAttributes, l6qVar.l);
            }
            if (!yga.O()) {
                return;
            }
            if (businessInfo.mIsJumpGoodsDetail) {
                businessInfo.tcp.dataAttributes.put("jumpTarget", "itemDetail");
            } else if (z) {
                businessInfo.tcp.dataAttributes.put("jumpTarget", TBXSkuCore.CONTAINER_TYPE_NEWBUY);
            }
        }
    }

    private void mergeTcpContextFromVideoInfo(BusinessInfo businessInfo) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea6f2237", new Object[]{this, businessInfo});
            return;
        }
        FissionTcpParam fissionTcpParam = businessInfo.tcp;
        if (fissionTcpParam != null && fissionTcpParam.context != null) {
            VideoInfo videoInfo = this.mSmartContext.o;
            if (videoInfo != null && (jSONObject = videoInfo.tcpContext) != null && jSONObject.size() > 0) {
                for (String str : this.mSmartContext.o.tcpContext.keySet()) {
                    businessInfo.tcp.context.put(str, this.mSmartContext.o.tcpContext.getString(str));
                }
            } else if (this.tcpOuterParam != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(yj4.PARAM_TCP_OUTER_PARAM, (Object) this.tcpOuterParam);
                for (String str2 : jSONObject2.keySet()) {
                    businessInfo.tcp.context.put(str2, jSONObject2.getString(str2));
                }
            }
        }
    }

    public void addPageExpInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b33dfcc", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("itemId", (Object) str);
            this.pageExpInfoList.add(jSONObject);
            if (this.pageExpInfoList.size() > 50) {
                this.pageExpInfoList.remove(0);
            }
        }
    }

    public void sampleSkipToGoodsDetail(String str, ItemInfo itemInfo, boolean z, boolean z2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb3d6b08", new Object[]{this, str, itemInfo, new Boolean(z), new Boolean(z2), str2});
        } else if (this.mSmartContext != null && this.mSmartConfig != null) {
            BusinessInfo businessInfo = new BusinessInfo();
            businessInfo.mIsJumpGoodsDetail = z;
            businessInfo.mJumpUrl = str;
            businessInfo.clickType = str2;
            businessInfo.actionSource = str2;
            if (itemInfo != null) {
                businessInfo.tcp = (FissionTcpParam) fkx.j(itemInfo.tcp, FissionTcpParam.class);
            }
            FissionTcpParam fissionTcpParam = businessInfo.tcp;
            if (fissionTcpParam == null) {
                FissionTcpParam fissionTcpParam2 = new FissionTcpParam();
                businessInfo.tcp = fissionTcpParam2;
                fissionTcpParam2.context = new HashMap();
                if ("close".equals(str2)) {
                    FissionTcpParam fissionTcpParam3 = businessInfo.tcp;
                    fissionTcpParam3.adUserId = "-1";
                    fissionTcpParam3.contentId = this.mSmartContext.e;
                }
            } else if (fissionTcpParam.context == null) {
                fissionTcpParam.context = new HashMap();
            }
            FissionTcpParam fissionTcpParam4 = businessInfo.tcp;
            if (!(fissionTcpParam4 == null || fissionTcpParam4.context == null)) {
                if ("close".equals(str2)) {
                    FissionTcpParam fissionTcpParam5 = businessInfo.tcp;
                    fissionTcpParam5.scenceId = "";
                    fissionTcpParam5.tcpBid = "";
                } else {
                    mergeTcpContextFromVideoInfo(businessInfo);
                }
                mergeDataAttributes(businessInfo, z2);
                businessInfo.tcp.context.put("outerAdUserParam", this.outerAdUserParam);
                if (!TextUtils.isEmpty(this.rid)) {
                    businessInfo.tcp.context.put(MergeUtil.KEY_RID, this.rid);
                }
                businessInfo.tcp.context.put("livesource", this.mSmartContext.b);
                businessInfo.tcp.context.put("entrylivesource", this.mSmartContext.d);
                businessInfo.tcp.context.put("bizTraceId", v2s.o().u().getUserId() + "_" + businessInfo.tcp.adUserId + "_" + businessInfo.tcp.contentId + "_" + businessInfo.tcp.itemId + "_" + System.currentTimeMillis());
                businessInfo.tcp.context.put("switchIndex", this.mSmartContext.k);
                businessInfo.tcp.context.put("spm-url", this.mSmartContext.i);
                businessInfo.tcp.context.put("entryspm", this.mSmartContext.j);
                if (amr.x()) {
                    businessInfo.tcp.context.put("spm-cnt", this.mSmartContext.p);
                    businessInfo.tcp.context.put("entryspmpre", this.mSmartContext.m);
                    businessInfo.tcp.context.put("entrylivesourcepre", this.mSmartContext.n);
                }
            }
            BusinessUtil.h(this.mSmartContext.a(), businessInfo);
            if (this.mSmartContext.b() != null) {
                ArrayList arrayList = new ArrayList();
                if (this.mSmartContext.t != null) {
                    arrayList.add("liveToken=" + this.mSmartContext.t.p());
                } else {
                    arrayList.add("liveToken=" + this.mSmartContext.f);
                }
                arrayList.add("actionSource=" + str2);
                arrayList.add("entryLiveSource=" + this.mSmartContext.d);
                arrayList.add("liveSource=" + this.mSmartContext.b);
                arrayList.add("context=" + fkx.i(businessInfo.tcp.context));
                arrayList.add("spm-cnt=" + this.mSmartContext.p);
                arrayList.add("spm-url=" + this.mSmartContext.i);
                this.mSmartContext.b().c("outerTraceMonitor", (String[]) arrayList.toArray(new String[0]));
            }
        }
    }

    public void trackClickUT(String str, ItemInfo itemInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6ca005", new Object[]{this, str, itemInfo});
        } else {
            trackClickUT(str, null, itemInfo);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.smartlayer.viewmodel.SmartLayerViewModel
    public void requestDataWithStage(String str, frd frdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6253a24", new Object[]{this, str, frdVar});
        } else if (TextUtils.equals(str, "show")) {
            this.pageIndex = 1;
            this.pageExpInfoList = new JSONArray();
            requestShowData(frdVar);
        } else if (TextUtils.equals(str, "loadMore")) {
            this.pageIndex++;
            requestShowData(frdVar);
        }
    }

    public void trackClickUT(String str, ArrayList<String> arrayList, ItemInfo itemInfo) {
        JSONObject jSONObject;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca18a215", new Object[]{this, str, arrayList, itemInfo});
            return;
        }
        l6q l6qVar = this.mSmartContext;
        if (!(l6qVar == null || l6qVar.b() == null || TextUtils.isEmpty(str))) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("time=" + String.valueOf(System.currentTimeMillis()));
            arrayList2.add("panelTechType=dx");
            if (itemInfo == null || itemInfo.item == null) {
                arrayList2.add("restore_flag=1");
            } else {
                arrayList2.add("itemPrice=" + itemInfo.item.getString("itemPrice"));
                arrayList2.add("promotionPrice=" + itemInfo.item.getString("promotionPrice"));
                arrayList2.add("restore_flag=" + (TextUtils.equals(this.mItemIds, itemInfo.item.getString("id")) ? 1 : 0));
            }
            arrayList2.add("popCode=" + this.code);
            arrayList2.add("typeName=" + this.typeName);
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
            }
            arrayList2.add("spm-cnt=" + this.mSmartContext.p);
            arrayList2.add("spm-url=" + this.mSmartContext.i);
            arrayList2.add("feeds_pos=1");
            arrayList2.add("page_mod=zhiboliveid");
            arrayList2.add("is_fp_mod=1");
            if (itemInfo == null || (jSONObject = itemInfo.logParams) == null) {
                JSONObject jSONObject2 = this.logParams;
                if (jSONObject2 != null) {
                    for (String str2 : jSONObject2.keySet()) {
                        arrayList2.add(str2 + "=" + this.logParams.getString(str2));
                    }
                }
            } else {
                for (String str3 : jSONObject.keySet()) {
                    arrayList2.add(str3 + "=" + itemInfo.logParams.getString(str3));
                }
            }
            if (this.mSmartContext.o != null) {
                arrayList2.add("roomStatus=" + this.mSmartContext.o.roomStatus);
            }
            ux9 ux9Var = this.mSmartContext.t;
            if (!(ux9Var == null || ux9Var.x() == null)) {
                StringBuilder sb = new StringBuilder("isKandian=");
                if (VideoStatus.VIDEO_TIMESHIFT_STATUS != this.mSmartContext.t.x().e()) {
                    z = false;
                }
                sb.append(z);
                arrayList2.add(sb.toString());
            }
            this.mSmartContext.b().c(str, (String[]) arrayList2.toArray(new String[0]));
        }
    }

    public void trackShowUT(String str, ItemInfo itemInfo) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c792ba", new Object[]{this, str, itemInfo});
            return;
        }
        l6q l6qVar = this.mSmartContext;
        if (l6qVar != null && l6qVar.b() != null && !TextUtils.isEmpty(str)) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("popCode", this.code);
            hashMap.put("typename", this.typeName);
            hashMap.put("time", String.valueOf(System.currentTimeMillis()));
            hashMap.put("panelTechType", "dx");
            hashMap.put("spm-cnt", this.mSmartContext.p);
            hashMap.put("spm-url", this.mSmartContext.p);
            hashMap.put("feeds_pos", "1");
            hashMap.put("page_mod", "zhiboliveid");
            hashMap.put("is_fp_mod", "1");
            if (itemInfo != null) {
                JSONObject jSONObject = itemInfo.item;
                if (jSONObject != null) {
                    hashMap.put("itemPrice", jSONObject.getString("itemPrice"));
                    hashMap.put("promotionPrice", itemInfo.item.getString("promotionPrice"));
                    hashMap.put("restore_flag", String.valueOf(TextUtils.equals(this.mItemIds, itemInfo.item.getString("id")) ? 1 : 0));
                }
                JSONObject jSONObject2 = itemInfo.logParams;
                if (jSONObject2 != null) {
                    hashMap.putAll(fxf.a(jSONObject2));
                } else {
                    JSONObject jSONObject3 = this.logParams;
                    if (jSONObject3 != null) {
                        hashMap.putAll(fxf.a(jSONObject3));
                    }
                }
            } else {
                hashMap.put("restore_flag", "1");
            }
            VideoInfo videoInfo = this.mSmartContext.o;
            if (videoInfo != null) {
                hashMap.put("roomStatus", videoInfo.roomStatus);
            }
            ux9 ux9Var = this.mSmartContext.t;
            if (!(ux9Var == null || ux9Var.x() == null)) {
                if (VideoStatus.VIDEO_TIMESHIFT_STATUS != this.mSmartContext.t.x().e()) {
                    z = false;
                }
                hashMap.put("isKandian", String.valueOf(z));
            }
            this.mSmartContext.b().b(str, hashMap);
        }
    }

    private void requestShowData(frd frdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49049711", new Object[]{this, frdVar});
        } else if (this.mSmartContext != null && this.mSmartConfig != null && frdVar != null) {
            eon eonVar = new eon(new a(frdVar));
            try {
                l6q l6qVar = this.mSmartContext;
                eonVar.L(l6qVar.e, l6qVar.c, l6qVar.i, l6qVar.j, l6qVar.b, l6qVar.d, this.mItemIds, this.mShareType, this.mRecommendQuery.toJSONString(), this.mSmartContext.k, null, String.valueOf(this.pageIndex), String.valueOf(this.pageSize), this.pageExpInfoList.toString(), true);
            } catch (Exception e) {
                frdVar.onFail("query_recommend_pop_data_exception", "RecommendPop数据请求发生异常");
                e.printStackTrace();
            }
        }
    }
}
