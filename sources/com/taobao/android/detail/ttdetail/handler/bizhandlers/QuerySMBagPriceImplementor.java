package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Seller;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.request.params.MtopRequestParams;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.util.HashMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ag0;
import tb.bw7;
import tb.f6j;
import tb.hjh;
import tb.ir;
import tb.lwm;
import tb.t2o;
import tb.ze7;
import tb.zre;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class QuerySMBagPriceImplementor implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "querySMBagPrice";

    /* renamed from: a  reason: collision with root package name */
    public final ze7 f6821a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class MarketBagPriceRequestCallback implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private JSONObject mEventFields;
        private RuntimeAbilityParam[] mRuntimeParams;

        static {
            t2o.a(912261933);
            t2o.a(589299719);
        }

        public MarketBagPriceRequestCallback(JSONObject jSONObject, RuntimeAbilityParam... runtimeAbilityParamArr) {
            this.mEventFields = jSONObject;
            this.mRuntimeParams = runtimeAbilityParamArr;
        }

        private String getBagPrice(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5f107a1d", new Object[]{this, mtopResponse});
            }
            if (mtopResponse == null || mtopResponse.getBytedata() == null) {
                writeBackRoutes(this.mEventFields.getString("unloginBtnTitle"), "");
                return null;
            }
            JSONObject parseObject = JSON.parseObject(new String(mtopResponse.getBytedata()));
            if (parseObject == null) {
                writeBackRoutes(this.mEventFields.getString("unloginBtnTitle"), "");
                return null;
            }
            JSONObject jSONObject = parseObject.getJSONObject("data");
            if (jSONObject == null) {
                writeBackRoutes(this.mEventFields.getString("unloginBtnTitle"), "");
                return null;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("model");
            if (jSONObject2 != null) {
                return jSONObject2.getString("price");
            }
            writeBackRoutes(this.mEventFields.getString("unloginBtnTitle"), "");
            return null;
        }

        private void monitorResponseError() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6f7f914", new Object[]{this});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("itemId", QuerySMBagPriceImplementor.b(QuerySMBagPriceImplementor.this).i().c("requestItemId"));
            bw7.b(hashMap, -500004, "猫超购物车价格查询失败");
        }

        private void writeBackRoutes(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d6f2da6b", new Object[]{this, str, str2});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.putAll(this.mEventFields);
            jSONObject.put("subType", (Object) "jhsRemind");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(ag0.KEY_BE_REPLACED, (Object) "bottomBarVO");
            jSONObject2.put(ag0.KEY_TO_REPLACE, (Object) "fields");
            jSONObject.put(ag0.KEY_TARGET_REPLACEMENT, (Object) jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("price", (Object) str2);
            jSONObject3.put("btnTitle", (Object) str);
            jSONObject.put("payload", (Object) jSONObject3);
            QuerySMBagPriceImplementor.b(QuerySMBagPriceImplementor.this).b().h(new ir(new JSONObject(jSONObject) { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.QuerySMBagPriceImplementor.MarketBagPriceRequestCallback.1
                public final /* synthetic */ JSONObject val$adjustStateEventFields;

                {
                    this.val$adjustStateEventFields = jSONObject;
                    put("type", ag0.EVENT_TYPE);
                    put("fields", (Object) jSONObject);
                }
            }), this.mRuntimeParams);
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            writeBackRoutes(this.mEventFields.getString("unloginBtnTitle"), "");
            monitorResponseError();
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                return;
            }
            String bagPrice = getBagPrice(mtopResponse);
            if (TextUtils.isEmpty(bagPrice)) {
                writeBackRoutes(this.mEventFields.getString("unloginBtnTitle"), "");
                return;
            }
            String string = this.mEventFields.getString("loginBtnTitle");
            writeBackRoutes(string, lwm.unit + bagPrice);
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            writeBackRoutes(this.mEventFields.getString("unloginBtnTitle"), "");
            monitorResponseError();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class MarketBagPriceRequestParams implements MtopRequestParams {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String mDivisionCode;
        private String mSellerId;

        static {
            t2o.a(912261936);
            t2o.a(912262184);
        }

        public MarketBagPriceRequestParams(String str, String str2) {
            this.mDivisionCode = str;
            this.mSellerId = str2;
        }

        @Override // com.taobao.android.detail.ttdetail.request.params.MtopRequestParams
        public String toData() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("add28f54", new Object[]{this});
            }
            HashMap hashMap = new HashMap();
            hashMap.put("cartFrom", "tsm_client_native");
            hashMap.put("sellerId", this.mSellerId);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("divisionCode", this.mDivisionCode);
            hashMap.put("exParams", JSON.toJSONString(hashMap2));
            hashMap.put("detail_v", "3.3.2");
            return JSON.toJSONString(hashMap);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends f6j<MarketBagPriceRequestParams> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912261935);
        }

        public a(QuerySMBagPriceImplementor querySMBagPriceImplementor, MarketBagPriceRequestParams marketBagPriceRequestParams) {
            super(marketBagPriceRequestParams);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/handler/bizhandlers/QuerySMBagPriceImplementor$MarketBagPriceRequestClient");
        }

        @Override // tb.f6j
        public String d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this});
            }
            return "mtop.trade.queryBagPrice";
        }

        @Override // tb.f6j
        public String e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this});
            }
            return "1.2";
        }

        @Override // tb.f6j
        public boolean k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3050dbb1", new Object[]{this})).booleanValue();
            }
            return true;
        }
    }

    static {
        t2o.a(912261932);
        t2o.a(912261826);
    }

    public QuerySMBagPriceImplementor(Context context, ze7 ze7Var) {
        this.f6821a = ze7Var;
    }

    public static /* synthetic */ ze7 b(QuerySMBagPriceImplementor querySMBagPriceImplementor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ze7) ipChange.ipc$dispatch("e875443e", new Object[]{querySMBagPriceImplementor});
        }
        return querySMBagPriceImplementor.f6821a;
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (irVar == null || (a2 = irVar.a()) == null) {
            return false;
        }
        if (DataUtils.b0(this.f6821a.e())) {
            return true;
        }
        c(a2, runtimeAbilityParamArr);
        return true;
    }

    public final void c(JSONObject jSONObject, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9db33576", new Object[]{this, jSONObject, runtimeAbilityParamArr});
            return;
        }
        Boolean bool = jSONObject.getBoolean("downgrade");
        if ((bool == null || !bool.booleanValue()) && hjh.c()) {
            a aVar = new a(this, new MarketBagPriceRequestParams(jSONObject.getString("divisionCode"), DataUtils.E((Seller) this.f6821a.e().f(Seller.class), "")));
            aVar.q(new MarketBagPriceRequestCallback(jSONObject, runtimeAbilityParamArr));
            aVar.c();
        }
    }
}
