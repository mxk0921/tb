package com.taobao.tbpoplayer.filter;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.norm.IUserCheckRequestListener;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tbpoplayer.filter.MtopPopCheckHelper;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.mtop.domain.MtopResponse;
import tb.jk;
import tb.t2o;
import tb.vem;
import tb.wdm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MtopPopCheckHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<PopRequest, Pair<String, MtopBusiness>> f13399a = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final MtopPopCheckHelper f13400a = new MtopPopCheckHelper();

        static {
            t2o.a(790626362);
        }

        public static /* synthetic */ MtopPopCheckHelper a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MtopPopCheckHelper) ipChange.ipc$dispatch("ed8560b2", new Object[0]);
            }
            return f13400a;
        }
    }

    static {
        t2o.a(790626360);
    }

    public static /* synthetic */ void d(MtopPopCheckHelper mtopPopCheckHelper, com.alibaba.poplayer.trigger.a aVar, String str, MtopResponse mtopResponse, String str2, IUserCheckRequestListener iUserCheckRequestListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3edad64", new Object[]{mtopPopCheckHelper, aVar, str, mtopResponse, str2, iUserCheckRequestListener});
        } else {
            mtopPopCheckHelper.g(aVar, str, mtopResponse, str2, iUserCheckRequestListener);
        }
    }

    public static MtopPopCheckHelper m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopPopCheckHelper) ipChange.ipc$dispatch("436e61d7", new Object[0]);
        }
        return a.a();
    }

    public void f(String str, PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea09038a", new Object[]{this, str, popRequest});
            return;
        }
        String R = com.alibaba.poplayer.trigger.a.R(popRequest);
        if (!TextUtils.isEmpty(str) && popRequest != null && !TextUtils.isEmpty(R)) {
            if (str.equals("increaseTime")) {
                popRequest.r();
            } else if (str.equals("finishPop")) {
                popRequest.b();
            }
        }
    }

    public String h(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7945794c", new Object[]{this, mtopResponse});
        }
        JSONObject jSONObject = new JSONObject();
        if (mtopResponse != null) {
            try {
                jSONObject.put("api", (Object) mtopResponse.getApi());
                jSONObject.put("v", (Object) mtopResponse.getV());
                jSONObject.put(jk.KEY_RET_CODE, (Object) mtopResponse.getRetCode());
                jSONObject.put(jk.KEY_RET_MSG, (Object) mtopResponse.getRetMsg());
                jSONObject.put(jk.KEY_MAPPING_CODE, (Object) mtopResponse.getMappingCode());
                jSONObject.put(TBImageFlowMonitor.RESPONSE_CODE_MEASURE, (Object) Integer.valueOf(mtopResponse.getResponseCode()));
                jSONObject.put("headerFields", (Object) mtopResponse.getHeaderFields());
            } catch (Throwable th) {
                wdm.h("getErrorInfoForFailRequest.error.", th);
            }
        }
        return jSONObject.toJSONString();
    }

    public String i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b6ceb3f5", new Object[]{this, jSONObject});
        }
        Object a2 = vem.a(jSONObject, "falseReason");
        if (a2 instanceof String) {
            return (String) a2;
        }
        return "normalNoPop";
    }

    public String j(com.alibaba.poplayer.trigger.a aVar) {
        JSONObject l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97bd312e", new Object[]{this, aVar});
        }
        if (aVar == null) {
            return "";
        }
        try {
            if (com.alibaba.poplayer.trigger.a.J(aVar) == null || (l = l(aVar)) == null || !l.containsKey("requestParams")) {
                return "";
            }
            return l.getString("requestParams");
        } catch (Throwable th) {
            wdm.h("getRequestParam.error.", th);
            return "";
        }
    }

    public Map<String, Object> k(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bcd37f42", new Object[]{this, mtopResponse});
        }
        HashMap hashMap = new HashMap();
        if (mtopResponse != null) {
            try {
                HashMap hashMap2 = new HashMap();
                hashMap2.put(jk.KEY_RET_CODE, mtopResponse.getRetCode());
                hashMap2.put(jk.KEY_MAPPING_CODE, mtopResponse.getMappingCode());
                hashMap2.put(TBImageFlowMonitor.RESPONSE_CODE_MEASURE, Integer.valueOf(mtopResponse.getResponseCode()));
                hashMap.put("appendInfo", new JSONObject(hashMap2));
                JSONObject jSONObject = null;
                if (mtopResponse.getBytedata() != null) {
                    String str = new String(mtopResponse.getBytedata(), "UTF-8");
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject = JSON.parseObject(str);
                    }
                }
                hashMap.put("result", jSONObject);
            } catch (Throwable th) {
                wdm.h("getResponseData.error.", th);
            }
        }
        return hashMap;
    }

    public JSONObject l(PopRequest popRequest) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1303a1a3", new Object[]{this, popRequest});
        }
        try {
            if (!(popRequest instanceof com.alibaba.poplayer.trigger.a)) {
                if (popRequest != null) {
                    popRequest.k().E = "skip";
                }
                return null;
            }
            String str2 = ((com.alibaba.poplayer.trigger.a) popRequest).K().popPreCheckParams;
            if (TextUtils.isEmpty(str2)) {
                popRequest.k().E = "skip";
                return null;
            }
            JSONObject parseObject = JSON.parseObject(str2);
            if (parseObject.containsKey("name")) {
                str = parseObject.getString("name");
            } else {
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                return parseObject;
            }
            popRequest.k().E = "skip";
            return null;
        } catch (Throwable th) {
            wdm.h("getValidConfigJson.error.", th);
            return null;
        }
    }

    public final boolean n(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9b2462e", new Object[]{this, obj})).booleanValue();
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (TextUtils.isDigitsOnly(str)) {
                return !str.equals("0");
            }
            return Boolean.parseBoolean(str);
        } else if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        } else {
            if (!(obj instanceof Integer) || ((Integer) obj).intValue() == 0) {
                return false;
            }
            return true;
        }
    }

    public final /* synthetic */ void o(String str, JSONObject jSONObject, com.alibaba.poplayer.trigger.a aVar, IUserCheckRequestListener iUserCheckRequestListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6bb7518", new Object[]{this, str, jSONObject, aVar, iUserCheckRequestListener});
        } else {
            s(str, jSONObject, aVar, iUserCheckRequestListener);
        }
    }

    public final /* synthetic */ void p(final String str, final JSONObject jSONObject, final com.alibaba.poplayer.trigger.a aVar, final IUserCheckRequestListener iUserCheckRequestListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b89588", new Object[]{this, str, jSONObject, aVar, iUserCheckRequestListener});
        } else {
            Coordinator.execute(new Runnable() { // from class: tb.z5j
                @Override // java.lang.Runnable
                public final void run() {
                    MtopPopCheckHelper.this.o(str, jSONObject, aVar, iUserCheckRequestListener);
                }
            }, 23);
        }
    }

    public final /* synthetic */ void q(String str, JSONObject jSONObject, com.alibaba.poplayer.trigger.a aVar, IUserCheckRequestListener iUserCheckRequestListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ef4ace7", new Object[]{this, str, jSONObject, aVar, iUserCheckRequestListener});
        } else {
            s(str, jSONObject, aVar, iUserCheckRequestListener);
        }
    }

    public final boolean t(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f790e16e", new Object[]{this, obj})).booleanValue();
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof String) {
            return Boolean.parseBoolean((String) obj);
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    public boolean u(PopRequest popRequest, final JSONObject jSONObject, final IUserCheckRequestListener iUserCheckRequestListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f08b0134", new Object[]{this, popRequest, jSONObject, iUserCheckRequestListener})).booleanValue();
        }
        try {
            final com.alibaba.poplayer.trigger.a aVar = (com.alibaba.poplayer.trigger.a) popRequest;
            final String string = jSONObject.getString("name");
            ((ConcurrentHashMap) this.f13399a).put(popRequest, new Pair(string, null));
            long longValue = jSONObject.containsKey("sliceMs") ? jSONObject.getLong("sliceMs").longValue() : 0L;
            if (longValue > 0) {
                Handler handler = new Handler(Looper.getMainLooper());
                long abs = Math.abs(new SecureRandom().nextLong()) % longValue;
                String R = com.alibaba.poplayer.trigger.a.R(popRequest);
                wdm.f(wdm.CATEGORY_TRIGGER_EVENT, R, "startPopCheckRequest.ReadyToExecute.name=" + string + ".sliceMs=" + longValue + ".delayMs=" + abs);
                handler.postDelayed(new Runnable() { // from class: tb.x5j
                    @Override // java.lang.Runnable
                    public final void run() {
                        MtopPopCheckHelper.this.p(string, jSONObject, aVar, iUserCheckRequestListener);
                    }
                }, abs);
            } else {
                String R2 = com.alibaba.poplayer.trigger.a.R(popRequest);
                wdm.f(wdm.CATEGORY_TRIGGER_EVENT, R2, "startPopCheckRequest.ReadyToExecute.name=" + string + ".NoDelay.");
                Coordinator.execute(new Runnable() { // from class: tb.y5j
                    @Override // java.lang.Runnable
                    public final void run() {
                        MtopPopCheckHelper.this.q(string, jSONObject, aVar, iUserCheckRequestListener);
                    }
                }, 23);
            }
            return true;
        } catch (Throwable th) {
            ((ConcurrentHashMap) this.f13399a).remove(popRequest);
            iUserCheckRequestListener.onFinished(false, "", OnePopModule.OnePopLoseReasonCode.MtopPreCheckFail, "startPopCheckRequestError", null, null);
            wdm.h("startPopCheckRequest.error.", th);
            return true;
        }
    }

    public boolean e(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b36eb455", new Object[]{this, popRequest})).booleanValue();
        }
        if (popRequest == null) {
            return false;
        }
        try {
            Pair pair = (Pair) ((ConcurrentHashMap) this.f13399a).get(popRequest);
            if (pair != null) {
                ((ConcurrentHashMap) this.f13399a).remove(popRequest);
                Object obj = pair.second;
                if (obj != null && !((MtopBusiness) obj).isTaskCanceled()) {
                    ((MtopBusiness) pair.second).cancelRequest();
                    wdm.f(wdm.CATEGORY_TRIGGER_EVENT, com.alibaba.poplayer.trigger.a.R(popRequest), "startPopCheckRequest.cancelPopCheckRequest.");
                    return true;
                }
            }
        } catch (Throwable th) {
            wdm.h("cancelPopCheckRequest.error", th);
        }
        return false;
    }

    public boolean r(JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("548a2f3", new Object[]{this, jSONObject, jSONObject2, new Boolean(z)})).booleanValue();
        }
        if (!(jSONObject == null || jSONObject2 == null)) {
            try {
                for (String str : jSONObject.keySet()) {
                    if (str != null && str.equals("popOriginParams")) {
                        jSONObject.put(str, (Object) JSON.toJSONString(jSONObject2));
                        return true;
                    } else if (jSONObject.get(str) instanceof JSONObject) {
                        if (r(jSONObject.getJSONObject(str), jSONObject2, false)) {
                            return true;
                        }
                    } else if (jSONObject.get(str) instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) jSONObject.get(str);
                        for (int i = 0; i < jSONArray.size(); i++) {
                            if (r(jSONArray.getJSONObject(i), jSONObject2, false)) {
                                return true;
                            }
                        }
                        continue;
                    } else if (jSONObject.get(str) instanceof String) {
                        JSONObject jSONObject3 = jSONObject.getJSONObject(str);
                        if (r(jSONObject3, jSONObject2, false)) {
                            jSONObject.put(str, (Object) JSON.toJSONString(jSONObject3));
                            return true;
                        }
                        JSONArray jSONArray2 = jSONObject.getJSONArray(str);
                        if (jSONArray2 != null) {
                            for (int i2 = 0; i2 < jSONArray2.size(); i2++) {
                                if (r(jSONArray2.getJSONObject(i2), jSONObject2, false)) {
                                    jSONObject.put(str, (Object) JSON.toJSONString(jSONArray2));
                                    return true;
                                }
                            }
                            continue;
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                if (z) {
                    jSONObject.put("popOriginParams", (Object) JSON.toJSONString(jSONObject2));
                }
            } catch (Throwable th) {
                wdm.h("replacePopRequestOriginParams.error.", th);
            }
        }
        return false;
    }

    public final void g(com.alibaba.poplayer.trigger.a aVar, String str, MtopResponse mtopResponse, String str2, IUserCheckRequestListener iUserCheckRequestListener) {
        String str3;
        Throwable th;
        Object obj;
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2189d24d", new Object[]{this, aVar, str, mtopResponse, str2, iUserCheckRequestListener});
            return;
        }
        String R = com.alibaba.poplayer.trigger.a.R(aVar);
        wdm.f(wdm.CATEGORY_TRIGGER_EVENT, R, "startPopCheckRequest.dealMtopResponse.");
        if (((ConcurrentHashMap) this.f13399a).containsKey(aVar)) {
            ((ConcurrentHashMap) this.f13399a).remove(aVar);
            wdm.f(wdm.CATEGORY_TRIGGER_EVENT, R, "startPopCheckRequest.dealMtopResponse.NeedDeal.");
            HashMap hashMap = new HashMap();
            try {
                if (mtopResponse != null) {
                    aVar.k().F = (mtopResponse.getHeaderFields() == null || (list = mtopResponse.getHeaderFields().get("eagleeye-traceid")) == null || list.isEmpty()) ? null : list.get(0);
                    Map<String, Object> k = k(mtopResponse);
                    JSONObject jSONObject = (JSONObject) k.get("result");
                    if (mtopResponse.isApiSuccess()) {
                        boolean n = n(vem.a(jSONObject, "poplayerShouldPop"));
                        wdm.f(wdm.CATEGORY_TRIGGER_EVENT, R, "startPopCheckRequest.dealMtopResponse.isApiSuccess=true.isPop=" + n);
                        if (!n) {
                            if (!t(vem.a(jSONObject, "poplayerSkipFalseAction"))) {
                                f(str2, aVar);
                            }
                            iUserCheckRequestListener.onFinished(false, str, OnePopModule.OnePopLoseReasonCode.MtopPreCheckNoPop, i(jSONObject), null, k);
                            return;
                        }
                        aVar.k().E = "commonPass";
                        iUserCheckRequestListener.onFinished(true, str, null, null, null, k);
                        return;
                    }
                    wdm.f(wdm.CATEGORY_TRIGGER_EVENT, R, "startPopCheckRequest.dealMtopResponse.isApiSuccess=false.RetCode=" + mtopResponse.getRetCode() + ".ResponseCode=" + mtopResponse.getResponseCode());
                    aVar.k().f0 = h(mtopResponse);
                    iUserCheckRequestListener.onFinished(false, str, OnePopModule.OnePopLoseReasonCode.MtopPreCheckFail, mtopResponse.getRetCode(), str, k);
                    return;
                }
                wdm.f(wdm.CATEGORY_TRIGGER_EVENT, R, "startPopCheckRequest.dealMtopResponse.response==null.");
                str3 = "result";
                try {
                    iUserCheckRequestListener.onFinished(false, str, OnePopModule.OnePopLoseReasonCode.MtopPreCheckFail, "responseNull", str, hashMap);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        ((ConcurrentHashMap) this.f13399a).remove(aVar);
                        wdm.h("startPopCheckRequest.asyncRequest.dealMtopResponse.error", th);
                        if (mtopResponse == null || mtopResponse.getBytedata() == null) {
                            obj = "";
                        } else {
                            obj = JSON.parseObject(new String(mtopResponse.getBytedata()));
                        }
                        hashMap.put(str3, obj);
                        iUserCheckRequestListener.onFinished(false, str, OnePopModule.OnePopLoseReasonCode.MtopPreCheckFail, "dealMtopResponseError", str, hashMap);
                    } catch (Throwable unused) {
                        iUserCheckRequestListener.onFinished(false, str, OnePopModule.OnePopLoseReasonCode.MtopPreCheckFail, "dealMtopResponseErrorError", str, hashMap);
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                str3 = "result";
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(final java.lang.String r17, com.alibaba.fastjson.JSONObject r18, final com.alibaba.poplayer.trigger.a r19, final com.alibaba.poplayer.norm.IUserCheckRequestListener r20) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tbpoplayer.filter.MtopPopCheckHelper.s(java.lang.String, com.alibaba.fastjson.JSONObject, com.alibaba.poplayer.trigger.a, com.alibaba.poplayer.norm.IUserCheckRequestListener):void");
    }
}
