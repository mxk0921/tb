package com.taobao.tbpoplayer.filter;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.norm.IUserCheckRequestListener;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.trigger.page.PageTriggerService;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.login4android.api.Login;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import com.taobao.tao.TaoPackageInfo;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tbpoplayer.filter.MtopGroupPreCheckManager;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.jk;
import tb.t2o;
import tb.wdm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MtopGroupPreCheckManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentMap<String, Map<String, a>> f13395a = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum RequestState {
        waiting,
        success,
        fail,
        noLogin;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(RequestState requestState, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbpoplayer/filter/MtopGroupPreCheckManager$RequestState");
        }

        public static RequestState valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RequestState) ipChange.ipc$dispatch("57eea260", new Object[]{str});
            }
            return (RequestState) Enum.valueOf(RequestState.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public volatile MtopResponse f13396a;
        public final Map<String, String> c;
        public final Set<String> d;
        public final Map<String, b> e;
        public volatile OnePopModule i;
        public final Set<String> f = Collections.synchronizedSet(new HashSet());
        public final Set<String> g = Collections.synchronizedSet(new HashSet());
        public final Map<String, JSONObject> h = new ConcurrentHashMap();
        public volatile RequestState b = RequestState.waiting;

        static {
            t2o.a(790626356);
        }

        public a(MtopGroupPreCheckManager mtopGroupPreCheckManager, com.alibaba.poplayer.trigger.a aVar, JSONObject jSONObject, IUserCheckRequestListener iUserCheckRequestListener) {
            Set<String> synchronizedSet = Collections.synchronizedSet(new HashSet());
            this.d = synchronizedSet;
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            this.e = concurrentHashMap;
            this.i = aVar.k();
            concurrentHashMap.put(aVar.K().indexID, new b(mtopGroupPreCheckManager, aVar, jSONObject, iUserCheckRequestListener));
            synchronizedSet.addAll(PageTriggerService.instance().getPagePreCheckGroupIndexIds(aVar.h(), aVar.K().preCheckGroupId));
            this.c = mtopGroupPreCheckManager.g(aVar.h(), aVar.K().preCheckGroupId);
        }

        public void c(String str, JSONObject jSONObject, PopRequest popRequest, IUserCheckRequestListener iUserCheckRequestListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9ba9cbe", new Object[]{this, str, jSONObject, popRequest, iUserCheckRequestListener});
                return;
            }
            boolean contains = this.f.contains(str);
            JSONObject jSONObject2 = (JSONObject) ((ConcurrentHashMap) this.h).get(str);
            wdm.f(wdm.CATEGORY_TRIGGER_EVENT, str, "MtopGroupPreCheckManager.dealMtopResponse.isApiSuccess=true.isPop=" + contains);
            if (contains) {
                iUserCheckRequestListener.onFinished(true, "", null, null, null, jSONObject2);
                return;
            }
            if (this.g.contains(str)) {
                MtopPopCheckHelper.m().f(jSONObject.getString("falseAction"), popRequest);
            }
            iUserCheckRequestListener.onFinished(false, "", OnePopModule.OnePopLoseReasonCode.MtopPreCheckNoPop, MtopPopCheckHelper.m().i(jSONObject2), null, null);
        }

        public final /* synthetic */ void d(RequestState requestState, String str, OnePopModule.OnePopLoseReasonCode onePopLoseReasonCode, String str2, String str3) {
            IUserCheckRequestListener iUserCheckRequestListener;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97814195", new Object[]{this, requestState, str, onePopLoseReasonCode, str2, str3});
                return;
            }
            this.b = requestState;
            for (String str4 : ((ConcurrentHashMap) this.e).keySet()) {
                try {
                    b bVar = (b) ((ConcurrentHashMap) this.e).get(str4);
                    if (!(bVar == null || (iUserCheckRequestListener = bVar.c) == null)) {
                        iUserCheckRequestListener.onFinished(false, str, onePopLoseReasonCode, str2, str3, null);
                    }
                } catch (Throwable th) {
                    wdm.h("MtopGroupInfo.triggerListenersOnFail.onFinished.error.", th);
                }
            }
        }

        public final /* synthetic */ void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9dca0b68", new Object[]{this});
                return;
            }
            this.b = RequestState.success;
            for (String str : ((ConcurrentHashMap) this.e).keySet()) {
                try {
                    b bVar = (b) ((ConcurrentHashMap) this.e).get(str);
                    c(str, bVar.b, bVar.f13397a, bVar.c);
                } catch (Throwable th) {
                    wdm.h("MtopGroupInfo.triggerListenersOnSuccess.onFinished.error.", th);
                }
            }
        }

        public void f(final RequestState requestState, final String str, final OnePopModule.OnePopLoseReasonCode onePopLoseReasonCode, final String str2, final String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("389b58d0", new Object[]{this, requestState, str, onePopLoseReasonCode, str2, str3});
                return;
            }
            try {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.d5j
                    @Override // java.lang.Runnable
                    public final void run() {
                        MtopGroupPreCheckManager.a.this.d(requestState, str, onePopLoseReasonCode, str2, str3);
                    }
                });
            } catch (Throwable th) {
                wdm.h("MtopGroupInfo.triggerListenersOnFail.error.", th);
            }
        }

        public void g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5653784", new Object[]{this});
                return;
            }
            try {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.e5j
                    @Override // java.lang.Runnable
                    public final void run() {
                        MtopGroupPreCheckManager.a.this.e();
                    }
                });
            } catch (Throwable th) {
                wdm.h("MtopGroupInfo.triggerListenersOnSuccess.error.", th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public final PopRequest f13397a;
        public final JSONObject b;
        public final IUserCheckRequestListener c;

        static {
            t2o.a(790626357);
        }

        public b(MtopGroupPreCheckManager mtopGroupPreCheckManager, PopRequest popRequest, JSONObject jSONObject, IUserCheckRequestListener iUserCheckRequestListener) {
            this.f13397a = popRequest;
            this.b = jSONObject;
            this.c = iUserCheckRequestListener;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final MtopGroupPreCheckManager f13398a = new MtopGroupPreCheckManager();

        static {
            t2o.a(790626359);
        }

        public static /* synthetic */ MtopGroupPreCheckManager a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MtopGroupPreCheckManager) ipChange.ipc$dispatch("f36de8ae", new Object[0]);
            }
            return f13398a;
        }
    }

    static {
        t2o.a(790626354);
    }

    public static /* synthetic */ void d(MtopGroupPreCheckManager mtopGroupPreCheckManager, com.alibaba.poplayer.trigger.a aVar, String str, MtopResponse mtopResponse, a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ba65879", new Object[]{mtopGroupPreCheckManager, aVar, str, mtopResponse, aVar2});
        } else {
            mtopGroupPreCheckManager.f(aVar, str, mtopResponse, aVar2);
        }
    }

    public static MtopGroupPreCheckManager i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopGroupPreCheckManager) ipChange.ipc$dispatch("218ba13", new Object[0]);
        }
        return c.a();
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fda48fdf", new Object[]{this, str});
            return;
        }
        try {
            Iterator it = ((ConcurrentHashMap) this.f13395a).keySet().iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (!TextUtils.isEmpty(str2)) {
                    if (!str2.equals(str) && !str2.startsWith(str)) {
                    }
                    it.remove();
                }
            }
        } catch (Throwable th) {
            wdm.h("MtopGroupPreCheckManager.cleanPageCacheRequests.error.", th);
        }
    }

    public Map<String, String> g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4c890981", new Object[]{this, str, str2});
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        if (TextUtils.isEmpty(str2)) {
            return concurrentHashMap;
        }
        try {
            List<com.alibaba.poplayer.trigger.a> pagePreCheckGroupRequests = PageTriggerService.instance().getPagePreCheckGroupRequests(str, str2);
            if (pagePreCheckGroupRequests != null) {
                for (com.alibaba.poplayer.trigger.a aVar : pagePreCheckGroupRequests) {
                    if (aVar != null && str2.equals(aVar.K().preCheckGroupId)) {
                        concurrentHashMap.put(aVar.K().indexID, MtopPopCheckHelper.m().j(aVar));
                    }
                }
            }
        } catch (Throwable th) {
            wdm.h("getPagePreCheckGroupRequestPramsMap", th);
        }
        return concurrentHashMap;
    }

    public final JSONObject h(MtopResponse mtopResponse, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d6be6fe3", new Object[]{this, mtopResponse, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        if (mtopResponse != null) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put(jk.KEY_RET_CODE, mtopResponse.getRetCode());
                hashMap.put(jk.KEY_MAPPING_CODE, mtopResponse.getMappingCode());
                hashMap.put(TBImageFlowMonitor.RESPONSE_CODE_MEASURE, Integer.valueOf(mtopResponse.getResponseCode()));
                jSONObject2.put("appendInfo", (Object) new JSONObject(hashMap));
                jSONObject2.put("result", (Object) jSONObject);
            } catch (Throwable th) {
                wdm.h("getResponseData.error.", th);
            }
        }
        return jSONObject2;
    }

    public boolean j(PopRequest popRequest) {
        BaseConfigItem K;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16401dcc", new Object[]{this, popRequest})).booleanValue();
        }
        if ((popRequest instanceof com.alibaba.poplayer.trigger.a) && (K = ((com.alibaba.poplayer.trigger.a) popRequest).K()) != null && !TextUtils.isEmpty(K.preCheckGroupId)) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void k(String str, JSONObject jSONObject, com.alibaba.poplayer.trigger.a aVar, a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("268de6da", new Object[]{this, str, jSONObject, aVar, aVar2});
        } else {
            n(str, jSONObject, aVar, aVar2);
        }
    }

    public final /* synthetic */ void l(final String str, final JSONObject jSONObject, final com.alibaba.poplayer.trigger.a aVar, final a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3160f308", new Object[]{this, str, jSONObject, aVar, aVar2});
        } else {
            Coordinator.execute(new Runnable() { // from class: tb.c5j
                @Override // java.lang.Runnable
                public final void run() {
                    MtopGroupPreCheckManager.this.k(str, jSONObject, aVar, aVar2);
                }
            }, 23);
        }
    }

    public final /* synthetic */ void m(String str, JSONObject jSONObject, com.alibaba.poplayer.trigger.a aVar, a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8986c67", new Object[]{this, str, jSONObject, aVar, aVar2});
        } else {
            n(str, jSONObject, aVar, aVar2);
        }
    }

    public final void p(final com.alibaba.poplayer.trigger.a aVar, final JSONObject jSONObject, final a aVar2) {
        final String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54c23de6", new Object[]{this, aVar, jSONObject, aVar2});
            return;
        }
        try {
            if (jSONObject.containsKey("name")) {
                str = jSONObject.getString("name");
            } else {
                str = "";
            }
            long longValue = jSONObject.containsKey("sliceMs") ? jSONObject.getLong("sliceMs").longValue() : 0L;
            if (longValue > 0) {
                Handler handler = new Handler(Looper.getMainLooper());
                long abs = Math.abs(new SecureRandom().nextLong()) % longValue;
                String R = com.alibaba.poplayer.trigger.a.R(aVar);
                wdm.f(wdm.CATEGORY_TRIGGER_EVENT, R, "MtopGroupPreCheckManager.startPopCheckRequest.ReadyToExecute.name=" + str + ".sliceMs=" + longValue + ".delayMs=" + abs);
                handler.postDelayed(new Runnable() { // from class: tb.a5j
                    @Override // java.lang.Runnable
                    public final void run() {
                        MtopGroupPreCheckManager.this.l(str, jSONObject, aVar, aVar2);
                    }
                }, abs);
                return;
            }
            String R2 = com.alibaba.poplayer.trigger.a.R(aVar);
            wdm.f(wdm.CATEGORY_TRIGGER_EVENT, R2, "MtopGroupPreCheckManager.startPopCheckRequest.ReadyToExecute.name=" + str + ".NoDelay.");
            Coordinator.execute(new Runnable() { // from class: tb.b5j
                @Override // java.lang.Runnable
                public final void run() {
                    MtopGroupPreCheckManager.this.m(str, jSONObject, aVar, aVar2);
                }
            }, 23);
        } catch (Throwable th) {
            aVar2.f(RequestState.fail, "", OnePopModule.OnePopLoseReasonCode.MtopPreCheckFail, "startError", "");
            wdm.h("MtopGroupPreCheckManager.startPopCheckRequest.error", th);
        }
    }

    public final void q(MtopResponse mtopResponse, JSONObject jSONObject, a aVar) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6d689cf", new Object[]{this, mtopResponse, jSONObject, aVar});
        } else if (jSONObject != null) {
            try {
                if (!(!jSONObject.containsKey("data") || aVar == null || (jSONObject2 = jSONObject.getJSONObject("data")) == null)) {
                    String string = jSONObject2.getString("popEnableList");
                    JSONObject jSONObject4 = jSONObject2.getJSONObject("groupContent");
                    List<String> parseArray = JSON.parseArray(string, String.class);
                    if (parseArray != null) {
                        for (String str : parseArray) {
                            if (aVar.d.contains(str)) {
                                aVar.f.add(str);
                                if (!(jSONObject4 == null || (jSONObject3 = jSONObject4.getJSONObject(str)) == null)) {
                                    ((ConcurrentHashMap) aVar.h).put(str, h(mtopResponse, jSONObject3));
                                }
                            }
                        }
                    }
                    List parseArray2 = JSON.parseArray(jSONObject2.getString("falseActionList"), String.class);
                    aVar.g.clear();
                    if (parseArray2 != null) {
                        aVar.g.addAll(parseArray2);
                    }
                }
            } catch (Throwable th) {
                wdm.h("MtopGroupPreCheckManager.syncDataToGroupInfo.error.", th);
            }
        }
    }

    public final void f(com.alibaba.poplayer.trigger.a aVar, String str, MtopResponse mtopResponse, a aVar2) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c81fb5a6", new Object[]{this, aVar, str, mtopResponse, aVar2});
            return;
        }
        String R = com.alibaba.poplayer.trigger.a.R(aVar);
        wdm.f(wdm.CATEGORY_TRIGGER_EVENT, R, "MtopGroupPreCheckManager.dealMtopResponse");
        if (!((ConcurrentHashMap) this.f13395a).containsKey(aVar.h())) {
            wdm.f("pageLifeCycle", com.alibaba.poplayer.trigger.a.R(aVar), "MtopGroupPreCheckManager.pageSwitched.");
            return;
        }
        wdm.f(wdm.CATEGORY_TRIGGER_EVENT, R, "MtopGroupPreCheckManager.dealMtopResponse.NeedDeal.");
        try {
            if (mtopResponse != null) {
                aVar2.f13396a = mtopResponse;
                aVar.k().F = (mtopResponse.getHeaderFields() == null || (list = mtopResponse.getHeaderFields().get("eagleeye-traceid")) == null || list.isEmpty()) ? null : list.get(0);
                JSONObject jSONObject = (JSONObject) MtopPopCheckHelper.m().k(mtopResponse).get("result");
                if (mtopResponse.isApiSuccess()) {
                    q(mtopResponse, jSONObject, aVar2);
                    aVar2.g();
                    return;
                }
                wdm.f(wdm.CATEGORY_TRIGGER_EVENT, R, "MtopGroupPreCheckManager.dealMtopResponse.isApiSuccess=false.RetCode=" + mtopResponse.getRetCode() + ".ResponseCode=" + mtopResponse.getResponseCode());
                aVar.k().f0 = MtopPopCheckHelper.m().h(mtopResponse);
                aVar2.f(RequestState.fail, str, OnePopModule.OnePopLoseReasonCode.MtopPreCheckFail, mtopResponse.getRetCode(), str);
                return;
            }
            wdm.f(wdm.CATEGORY_TRIGGER_EVENT, R, "MtopGroupPreCheckManager.dealMtopResponse.response==null.");
            aVar2.f(RequestState.fail, str, OnePopModule.OnePopLoseReasonCode.MtopPreCheckFail, "responseNull", str);
        } catch (Throwable th) {
            wdm.h("MtopGroupPreCheckManager.dealMtopResponse.error", th);
            aVar2.f(RequestState.fail, str, OnePopModule.OnePopLoseReasonCode.MtopPreCheckFail, "dealMtopResponseError", str);
        }
    }

    public final void n(final String str, JSONObject jSONObject, final com.alibaba.poplayer.trigger.a aVar, final a aVar2) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94b51d5e", new Object[]{this, str, jSONObject, aVar, aVar2});
            return;
        }
        try {
            if (!((ConcurrentHashMap) this.f13395a).containsKey(aVar.h())) {
                wdm.f("pageLifeCycle", com.alibaba.poplayer.trigger.a.R(aVar), "MtopGroupPreCheckManager.sendUserCheckRequest.pageSwitched.");
                return;
            }
            if (jSONObject.containsKey("version")) {
                str2 = jSONObject.getString("version");
            } else {
                str2 = "1.0";
            }
            if (jSONObject.containsKey("requestParams")) {
                str3 = jSONObject.getString("requestParams");
            } else {
                str3 = "";
            }
            int intValue = jSONObject.containsKey("timeoutMs") ? jSONObject.getInteger("timeoutMs").intValue() : 3000;
            boolean booleanValue = jSONObject.getBooleanValue("login");
            boolean booleanValue2 = jSONObject.getBooleanValue("wua");
            if (!booleanValue || !TextUtils.isEmpty(Login.getUserId())) {
                MtopRequest mtopRequest = new MtopRequest();
                mtopRequest.setApiName(str);
                mtopRequest.setVersion(str2);
                mtopRequest.setNeedEcode(booleanValue);
                String R = com.alibaba.poplayer.trigger.a.R(aVar);
                wdm.f(wdm.CATEGORY_TRIGGER_EVENT, R, "MtopGroupPreCheckManager.ReadyToSend.names=" + str + ".needLogin=" + booleanValue + ".needECode=" + booleanValue);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("poplayerParams", (Object) aVar.K().params);
                jSONObject2.put("triggerUri", (Object) aVar.L().uri);
                jSONObject2.put("triggerParam", (Object) aVar.L().param);
                jSONObject2.put("uuid", (Object) R);
                jSONObject2.put("preCheckGroupId", (Object) aVar.K().preCheckGroupId);
                jSONObject2.put("popEnableList", (Object) aVar2.d);
                jSONObject2.put("popEnableMap", (Object) aVar2.c);
                JSONObject jSONObject3 = new JSONObject();
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject3 = JSON.parseObject(str3);
                }
                if (jSONObject3 == null) {
                    jSONObject3 = new JSONObject();
                }
                MtopPopCheckHelper.m().r(jSONObject3, jSONObject2, true);
                mtopRequest.setData(JSON.toJSONString(jSONObject3));
                MtopBusiness socketTimeoutMilliSecond = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, PopLayer.getReference().getApp()), mtopRequest, TaoPackageInfo.getTTID()).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.tbpoplayer.filter.MtopGroupPreCheckManager.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        } else {
                            MtopGroupPreCheckManager.d(MtopGroupPreCheckManager.this, aVar, str, mtopResponse, aVar2);
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        } else {
                            MtopGroupPreCheckManager.d(MtopGroupPreCheckManager.this, aVar, str, mtopResponse, aVar2);
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        } else {
                            MtopGroupPreCheckManager.d(MtopGroupPreCheckManager.this, aVar, str, mtopResponse, aVar2);
                        }
                    }
                }).showLoginUI(false).reqMethod(MethodEnum.POST).setConnectionTimeoutMilliSecond(3000).setSocketTimeoutMilliSecond(intValue);
                if (booleanValue2) {
                    socketTimeoutMilliSecond.useWua();
                }
                socketTimeoutMilliSecond.startRequest();
                return;
            }
            aVar.k().r0 = false;
            aVar2.f(RequestState.noLogin, str, OnePopModule.OnePopLoseReasonCode.MtopPreCheckNoPop, "userIdEmpty", null);
        } catch (Throwable th) {
            aVar2.f(RequestState.fail, str, OnePopModule.OnePopLoseReasonCode.MtopPreCheckFail, "sendError", str);
            wdm.h("MtopGroupPreCheckManager.sendUserCheckRequest.error", th);
        }
    }

    public boolean o(PopRequest popRequest, JSONObject jSONObject, IUserCheckRequestListener iUserCheckRequestListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd2feaba", new Object[]{this, popRequest, jSONObject, iUserCheckRequestListener})).booleanValue();
        }
        try {
            String h = popRequest.h();
            BaseConfigItem K = ((com.alibaba.poplayer.trigger.a) popRequest).K();
            if (!((ConcurrentHashMap) this.f13395a).containsKey(h)) {
                a aVar = new a(this, (com.alibaba.poplayer.trigger.a) popRequest, jSONObject, iUserCheckRequestListener);
                HashMap hashMap = new HashMap();
                hashMap.put(K.preCheckGroupId, aVar);
                ((ConcurrentHashMap) this.f13395a).put(h, hashMap);
                p((com.alibaba.poplayer.trigger.a) popRequest, jSONObject, aVar);
            } else {
                Map map = (Map) ((ConcurrentHashMap) this.f13395a).get(h);
                if (!map.containsKey(K.preCheckGroupId)) {
                    a aVar2 = new a(this, (com.alibaba.poplayer.trigger.a) popRequest, jSONObject, iUserCheckRequestListener);
                    map.put(K.preCheckGroupId, aVar2);
                    p((com.alibaba.poplayer.trigger.a) popRequest, jSONObject, aVar2);
                } else {
                    a aVar3 = (a) map.get(K.preCheckGroupId);
                    MtopResponse mtopResponse = aVar3.f13396a;
                    if (aVar3.b == RequestState.waiting) {
                        ((ConcurrentHashMap) aVar3.e).put(K.indexID, new b(this, popRequest, jSONObject, iUserCheckRequestListener));
                    } else if (aVar3.b == RequestState.fail) {
                        popRequest.k().f0 = aVar3.i.f0;
                        popRequest.k().F = aVar3.i.F;
                        popRequest.k().r0 = false;
                        iUserCheckRequestListener.onFinished(false, "", OnePopModule.OnePopLoseReasonCode.MtopPreCheckFail, mtopResponse.getRetCode(), mtopResponse.getApi(), null);
                    } else if (aVar3.b == RequestState.success) {
                        popRequest.k().E = aVar3.i.E;
                        popRequest.k().F = aVar3.i.F;
                        popRequest.k().r0 = false;
                        aVar3.c(K.indexID, jSONObject, popRequest, iUserCheckRequestListener);
                    } else if (aVar3.b == RequestState.noLogin) {
                        popRequest.k().r0 = false;
                        iUserCheckRequestListener.onFinished(false, "", OnePopModule.OnePopLoseReasonCode.MtopPreCheckNoPop, "userIdEmpty", null, null);
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            wdm.h("MtopGroupPreCheckManager.startNewPreCheckGroup.error.", th);
            iUserCheckRequestListener.onFinished(false, "", OnePopModule.OnePopLoseReasonCode.MtopPreCheckFail, "startGroupCheckError", null, null);
            return true;
        }
    }
}
