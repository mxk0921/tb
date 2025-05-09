package com.alibaba.android.icart.core.promotionsubmit.event;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.android.icart.core.promotionsubmit.event.BaseEvent;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taobao.R;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.be3;
import tb.c9x;
import tb.cl8;
import tb.t2o;
import tb.ub3;
import tb.z0n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class MtopEvent extends BaseEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PromotionMtopEvent";
    public static final int TAOBAO_MTOP_BIZ_ID = 97;
    public String api;
    public MtopCallback callback;
    public List<cl8.a> failEvents;
    public JSONObject params;
    public List<cl8.a> successEvents;
    public String version;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class MtopCallback implements Serializable {
        public JSONArray fail;
        public JSONArray success;

        static {
            t2o.a(479199544);
        }
    }

    static {
        t2o.a(479199542);
    }

    public static /* synthetic */ void access$000(MtopEvent mtopEvent, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82e2adaa", new Object[]{mtopEvent, jSONObject});
        } else {
            mtopEvent.runFinishedListener(jSONObject);
        }
    }

    public static /* synthetic */ void access$100(MtopEvent mtopEvent, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac4a2689", new Object[]{mtopEvent, jSONObject});
        } else {
            mtopEvent.runFailedEvent(jSONObject);
        }
    }

    public static /* synthetic */ JSONObject access$200(MtopEvent mtopEvent, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e758aa88", new Object[]{mtopEvent, jSONObject});
        }
        return mtopEvent.dealSpecialMtopData(jSONObject);
    }

    public static /* synthetic */ void access$300(MtopEvent mtopEvent, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff191847", new Object[]{mtopEvent, jSONObject});
        } else {
            mtopEvent.runSuccessEvent(jSONObject);
        }
    }

    public static /* synthetic */ Object ipc$super(MtopEvent mtopEvent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/promotionsubmit/event/MtopEvent");
    }

    private void removeSpecialSuccessEvent(String str) {
        List<cl8.a> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbc3761d", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && (list = this.successEvents) != null) {
            for (cl8.a aVar : list) {
                if (aVar != null && str.equals(aVar.f17132a)) {
                    this.successEvents.remove(aVar);
                    return;
                }
            }
        }
    }

    private void runFailedEvent(JSONObject jSONObject) {
        BaseEvent baseEvent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fdb19b7", new Object[]{this, jSONObject});
            return;
        }
        List<cl8.a> list = this.failEvents;
        if (list != null) {
            Iterator<cl8.a> it = list.iterator();
            while (it.hasNext() && (baseEvent = it.next().b) != null) {
                baseEvent.setModalBuy(this.isModalBuy).runEvent(this.context, jSONObject);
            }
        }
    }

    private void runFinishedListener(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("281795f8", new Object[]{this, jSONObject});
            return;
        }
        BaseEvent.a aVar = this.finishedListener;
        if (aVar != null) {
            ((z0n.a) aVar).a(jSONObject);
        }
    }

    private void runSuccessEvent(JSONObject jSONObject) {
        BaseEvent baseEvent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1830a07", new Object[]{this, jSONObject});
            return;
        }
        List<cl8.a> list = this.successEvents;
        if (list != null) {
            Iterator<cl8.a> it = list.iterator();
            while (it.hasNext() && (baseEvent = it.next().b) != null) {
                baseEvent.setModalBuy(this.isModalBuy).runEvent(this.context, jSONObject);
            }
        }
    }

    @Override // com.alibaba.android.icart.core.promotionsubmit.event.BaseEvent
    public BaseEvent initEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseEvent) ipChange.ipc$dispatch("9a19a69d", new Object[]{this});
        }
        JSONObject jSONObject = this.eventParams;
        if (jSONObject != null) {
            this.api = jSONObject.getString("api");
            this.version = this.eventParams.getString("version");
            this.params = this.eventParams.getJSONObject("params");
            this.callback = (MtopCallback) JSON.toJavaObject(this.eventParams.getJSONObject("callback"), MtopCallback.class);
        }
        MtopCallback mtopCallback = this.callback;
        if (mtopCallback != null) {
            this.successEvents = cl8.b(mtopCallback.success, null);
            this.failEvents = cl8.b(this.callback.fail, null);
        }
        return this;
    }

    @Override // com.alibaba.android.icart.core.promotionsubmit.event.BaseEvent
    public void runEvent(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d1adc7e", new Object[]{this, context, jSONObject});
            return;
        }
        setContext(context);
        sendRequest();
    }

    private void sendRequest() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fa6eaee", new Object[]{this});
            return;
        }
        ub3.d("settlementCouponApply", "发送领券请求", false, 0.01f);
        IRemoteBaseListener iRemoteBaseListener = new IRemoteBaseListener() { // from class: com.alibaba.android.icart.core.promotionsubmit.event.MtopEvent.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                ub3.e(ub3.a.a("settlementCouponApplyFail").message("领券结算请求失败").sampling(1.0f));
                be3.c(MtopEvent.this.context, Localization.q(R.string.taobao_app_1028_1_21660));
                MtopEvent.access$000(MtopEvent.this, null);
                String str2 = "";
                String retCode = mtopResponse != null ? mtopResponse.getRetCode() : str2;
                if (mtopResponse != null) {
                    str2 = mtopResponse.getRetMsg();
                }
                UnifyLog.EventType eventType = UnifyLog.EventType.ERROR;
                UnifyLog.k(c9x.CART_BIZ_NAME, MtopEvent.TAG, "onError", "", "", eventType, "errorCode:" + retCode + ",errorMsg:" + str2);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                be3.c(MtopEvent.this.context, Localization.q(R.string.taobao_app_1028_1_21660));
                MtopEvent.access$000(MtopEvent.this, null);
                String str2 = "";
                String retCode = mtopResponse != null ? mtopResponse.getRetCode() : str2;
                if (mtopResponse != null) {
                    str2 = mtopResponse.getRetMsg();
                }
                UnifyLog.EventType eventType = UnifyLog.EventType.ERROR;
                UnifyLog.k(c9x.CART_BIZ_NAME, MtopEvent.TAG, "onSystemError", "", "", eventType, "errorCode:" + retCode + ",errorMsg:" + str2);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                MtopEvent.access$000(MtopEvent.this, null);
                if (mtopResponse != null) {
                    JSONObject jSONObject = ((JSONObject) JSON.parseObject(mtopResponse.getBytedata(), JSONObject.class, new Feature[0])).getJSONObject("data");
                    if (jSONObject == null || jSONObject.getBooleanValue("error")) {
                        MtopEvent.access$100(MtopEvent.this, null);
                        ub3.e(ub3.a.a("settlementCouponApplyFail").message("领券结算请求失败").sampling(1.0f));
                    } else {
                        MtopEvent mtopEvent = MtopEvent.this;
                        MtopEvent.access$300(mtopEvent, MtopEvent.access$200(mtopEvent, jSONObject));
                    }
                    try {
                        UnifyLog.EventType eventType = UnifyLog.EventType.NET;
                        UnifyLog.k(c9x.CART_BIZ_NAME, MtopEvent.TAG, "onSuccess", "", "", eventType, "response: " + mtopResponse.getDataJsonObject());
                    } catch (Exception unused) {
                    }
                }
            }
        };
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(this.api);
        mtopRequest.setVersion(this.version);
        mtopRequest.setNeedSession(true);
        mtopRequest.setNeedEcode(true);
        JSONObject jSONObject = this.params;
        if (jSONObject != null) {
            str = jSONObject.toJSONString();
        } else {
            str = "{}";
        }
        mtopRequest.setData(str);
        RemoteBusiness.build(mtopRequest).setBizId(97).registeListener((IRemoteListener) iRemoteBaseListener).reqMethod(MethodEnum.POST).startRequest();
        try {
            UnifyLog.EventType eventType = UnifyLog.EventType.NET;
            UnifyLog.k(c9x.CART_BIZ_NAME, TAG, "request", "", "", eventType, "request: " + mtopRequest.toString());
        } catch (Exception unused) {
        }
    }

    private JSONObject dealSpecialMtopData(JSONObject jSONObject) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bfe6e66a", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return jSONObject;
        }
        ub3.e(ub3.a.a("settlementCouponApplySuccess").message("领券请求成功").success(true).branchEntry(true).sampling(0.01f));
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("module");
            JSONArray jSONArray = jSONObject2.getJSONArray("applySuccessList");
            JSONArray jSONArray2 = jSONObject2.getJSONArray("applyFailList");
            int size = jSONArray != null ? jSONArray.size() : 0;
            if (jSONArray2 != null) {
                i = jSONArray2.size();
            }
            JSONObject jSONObject3 = new JSONObject();
            if (i <= 0) {
                jSONObject3.put("successNum", (Object) String.valueOf(size));
                removeSpecialSuccessEvent("toastPartSuccess");
                ub3.e(ub3.a.a("settlementCouponApplySuccess").message("全部成功").success(true).branch(1).sampling(0.01f));
            } else {
                jSONObject3.put("successNum", (Object) String.valueOf(size));
                jSONObject3.put("failedNum", (Object) String.valueOf(i));
                removeSpecialSuccessEvent("toastAllSuccess");
                ub3.e(ub3.a.a("settlementCouponApplySuccess").message("部分成功").success(true).branch(2).sampling(0.01f));
            }
            return jSONObject3;
        } catch (Throwable unused) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("allSuccessNum", (Object) "0");
            return jSONObject4;
        }
    }
}
