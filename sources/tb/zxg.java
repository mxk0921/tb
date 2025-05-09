package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.business.detail.LiveDetailRequest;
import com.taobao.taolive.sdk.business.detail.LiveDetailResponse;
import com.taobao.taolive.sdk.business.detail.RecommendLiveDetailRequest;
import com.taobao.taolive.sdk.model.LiveEmbedType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class zxg extends nt1 implements b0d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LIVE_DETAIL = "mtop.mediaplatform.live.livedetail";
    public static final String LIVE_DETAIL_QUERY = "mtop.tblive.live.detail.query";
    public static final String RECOMMEND_DETAIL = "mtop.mediaplatform.live.recommend.livedetail";
    public static final String SHOP_CARD_DETAIL = "mtop.tblive.live.detail.query.room";

    static {
        t2o.a(806355994);
        t2o.a(806355932);
    }

    public zxg(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(zxg zxgVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/business/detail/LiveDetailBusiness");
    }

    public final void K(LiveDetailRequest liveDetailRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c439cea", new Object[]{this, liveDetailRequest});
        } else if (liveDetailRequest != null) {
            if (zqq.c(v2s.o().p().b("tblive", "enableGoodsMultiTabContainerV2", "true"))) {
                o3s.b("LiveDetailBusiness", "enableGoodsMultiTabContainerV2 true");
                try {
                    if (TextUtils.isEmpty(liveDetailRequest.extendJson)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("supportItemH5", (Object) "1");
                        liveDetailRequest.extendJson = JSON.toJSONString(jSONObject);
                    } else {
                        JSONObject parseObject = JSON.parseObject(liveDetailRequest.extendJson);
                        parseObject.put("supportItemH5", (Object) "1");
                        liveDetailRequest.extendJson = JSON.toJSONString(parseObject);
                    }
                } catch (Throwable th) {
                    o3s.b("LiveDetailBusiness", "add supportItemH5 error = " + th.getMessage());
                }
            } else {
                o3s.b("LiveDetailBusiness", "enableGoodsMultiTabContainerV2 false");
            }
        }
    }

    @Override // tb.b0d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        this.f24935a.onError(i, netResponse, obj);
        vgb e = v2s.o().e();
        if (e != null) {
            String str = "onError";
            String retCode = netResponse != null ? netResponse.getRetCode() : str;
            if (netResponse != null) {
                str = netResponse.getRetMsg();
            }
            e.commitFail("Page_Immersion", "firstTimeGet", retCode, str);
        }
    }

    @Override // tb.b0d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            return;
        }
        NetResponse netResponse2 = new NetResponse();
        netResponse2.setRetCode("onSuccess Error");
        netResponse2.setRetMsg("onSuccess Error");
        onError(i, netResponse2, obj);
    }

    @Override // tb.b0d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        this.f24935a.onSystemError(i, netResponse, obj);
        vgb e = v2s.o().e();
        if (e != null) {
            String str = "onSystemError";
            String retCode = netResponse != null ? netResponse.getRetCode() : str;
            if (netResponse != null) {
                str = netResponse.getRetMsg();
            }
            e.commitFail("Page_Immersion", "firstTimeGet", retCode, str);
        }
    }

    public void L(jg7 jg7Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27591563", new Object[]{this, jg7Var, str});
        } else if ("1".equals(str)) {
            RecommendLiveDetailRequest recommendLiveDetailRequest = new RecommendLiveDetailRequest();
            recommendLiveDetailRequest.liveId = jg7Var.g();
            recommendLiveDetailRequest.creatorId = jg7Var.a();
            recommendLiveDetailRequest.liveSource = jg7Var.h();
            recommendLiveDetailRequest.extendJson = jg7Var.b();
            recommendLiveDetailRequest.timeMovingItemId = jg7Var.o();
            recommendLiveDetailRequest.sjsdItemId = jg7Var.m();
            C(1, recommendLiveDetailRequest, LiveDetailResponse.class);
        } else {
            LiveDetailRequest liveDetailRequest = new LiveDetailRequest();
            liveDetailRequest.liveId = jg7Var.g();
            liveDetailRequest.creatorId = jg7Var.a();
            liveDetailRequest.liveSource = jg7Var.h();
            liveDetailRequest.extendJson = jg7Var.b();
            liveDetailRequest.timeMovingItemId = jg7Var.o();
            liveDetailRequest.sjsdItemId = jg7Var.m();
            liveDetailRequest.transParams = jg7Var.q();
            liveDetailRequest.productType = jg7Var.k();
            liveDetailRequest.entryLiveSource = jg7Var.p().get("entryLiveSource");
            if (jg7Var.l() == LiveEmbedType.SHOP_CARD) {
                liveDetailRequest.setAPI_NAME(SHOP_CARD_DETAIL);
                liveDetailRequest.setVERSION("1.0");
            } else if (liveDetailRequest.liveId != null || !zqq.c(jg7Var.j())) {
                liveDetailRequest.setAPI_NAME(LIVE_DETAIL_QUERY);
                liveDetailRequest.setVERSION("4.0");
            } else {
                liveDetailRequest.setAPI_NAME(qvs.C0());
                liveDetailRequest.setVERSION("1.0");
            }
            K(liveDetailRequest);
            liveDetailRequest.itemHoldType = jg7Var.d();
            liveDetailRequest.holdItemIds = jg7Var.e();
            liveDetailRequest.useLiveFandom = jg7Var.r();
            liveDetailRequest.forceFandom = jg7Var.c();
            liveDetailRequest.keyPointId = jg7Var.f();
            liveDetailRequest.tcpContext = jg7Var.r;
            liveDetailRequest.outParam = jg7Var.t;
            String str2 = liveDetailRequest.extendJson;
            if (str2 == null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("sjsdParams", (Object) jg7Var.n());
                jSONObject.put("needProcSjsd", (Object) jg7Var.i());
                liveDetailRequest.extendJson = JSON.toJSONString(jSONObject);
            } else {
                JSONObject parseObject = JSON.parseObject(str2);
                parseObject.put("sjsdParams", (Object) jg7Var.n());
                parseObject.put("needProcSjsd", (Object) jg7Var.i());
                liveDetailRequest.extendJson = JSON.toJSONString(parseObject);
            }
            C(1, liveDetailRequest, LiveDetailResponse.class);
        }
    }
}
