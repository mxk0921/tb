package com.taobao.android.detail2.core.framework.data.net.prerequest;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.preload.core.task.PreloadTaskEntity;
import com.taobao.android.weex_framework.jni.MUSCommonNativeBridge;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.btm;
import tb.byj;
import tb.ddt;
import tb.fbh;
import tb.fdv;
import tb.ftm;
import tb.g8n;
import tb.itm;
import tb.ktm;
import tb.ltm;
import tb.mbq;
import tb.nyj;
import tb.o2r;
import tb.o8n;
import tb.oj7;
import tb.on8;
import tb.q0j;
import tb.t2o;
import tb.txj;
import tb.vv6;
import tb.y9a;
import tb.yjd;
import tb.ynm;
import tb.yox;
import tb.ysm;
import tb.zg7;
import tb.zgj;
import tb.zxu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NewDetailPreRequester implements yjd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int b = 0;
    public static int c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final on8 f7123a = new on8();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class NDRemoteBaseListener implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final int CORE_POOL_SIZE = 1;
        private static final int KEEP_ALIVE_TIME = 60;
        private on8 mExecutorServiceFactory;
        public Map<String, String> mId2CacheKeyMap;
        public PreloadTaskEntity mPreloadtaskEntity;
        public ddt mTaskCallback;
        public String mTaskToken;
        private String mTaskToken_remoteProcessSub;

        static {
            t2o.a(352321813);
            t2o.a(589299719);
        }

        public NDRemoteBaseListener(on8 on8Var, PreloadTaskEntity preloadTaskEntity, Map<String, String> map, ddt ddtVar, String str) {
            this.mExecutorServiceFactory = on8Var;
            this.mPreloadtaskEntity = preloadTaskEntity;
            this.mTaskCallback = ddtVar;
            this.mId2CacheKeyMap = map;
            this.mTaskToken = str;
            this.mTaskToken_remoteProcessSub = nyj.z().f("remoteProcessSub", str);
        }

        private void dealMtopError(PreloadTaskEntity preloadTaskEntity, ddt ddtVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44a29158", new Object[]{this, preloadTaskEntity, ddtVar});
            } else {
                ((ysm.a) ddtVar).a(preloadTaskEntity, null);
            }
        }

        private ExecutorService getExecutorService() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ExecutorService) ipChange.ipc$dispatch("d9806c48", new Object[]{this});
            }
            return this.mExecutorServiceFactory.a(1, 60, "newdetail-pre-request-data-parse");
        }

        public a generateDataProcessRunnable(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("54f596ce", new Object[]{this, mtopResponse});
            }
            return new a(mtopResponse, this.mPreloadtaskEntity, this.mId2CacheKeyMap, this.mTaskCallback, this.mTaskToken);
        }

        public String getRequestFailErrorCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a0373cfb", new Object[]{this});
            }
            return q0j.ERROR_CODE_OPEN_IMMEDIATELY_REQUEST_FAIL;
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                return;
            }
            nyj.z().s("remoteProcess", true, this.mTaskToken);
            nyj.z().v(this.mTaskToken_remoteProcessSub, "remoteProcessSub", true, "onSuccess");
            getExecutorService().execute(generateDataProcessRunnable(mtopResponse));
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            nyj.z().s("remoteProcess", false, this.mTaskToken);
            nyj.z().v(this.mTaskToken_remoteProcessSub, "remoteProcessSub", false, "systemError");
            dealMtopError(this.mPreloadtaskEntity, this.mTaskCallback);
            mbq.a("new_detail", mtopResponse);
            traceError(mtopResponse);
        }

        private void traceError(MtopResponse mtopResponse) {
            ArrayList<PreloadTaskEntity.a> arrayList;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f943280f", new Object[]{this, mtopResponse});
            } else if (mtopResponse == null) {
                nyj.z().J("errMsg", "mtopRspIsNull", this.mTaskToken);
                nyj.z().p(this.mTaskToken, "ndPreRequest", false);
            } else {
                String g = zxu.g(mtopResponse);
                nyj.z().J("traceId", g, this.mTaskToken);
                StringBuilder sb = new StringBuilder("traceId: " + g + ", nids:[");
                PreloadTaskEntity preloadTaskEntity = this.mPreloadtaskEntity;
                if (!(preloadTaskEntity == null || (arrayList = preloadTaskEntity.items) == null)) {
                    Iterator<PreloadTaskEntity.a> it = arrayList.iterator();
                    while (it.hasNext()) {
                        PreloadTaskEntity.a next = it.next();
                        if (next != null) {
                            String str = next.e;
                            sb.append(str);
                            sb.append(",");
                            zgj.c(str, 2);
                        }
                    }
                }
                sb.append("], errorMSg: ");
                sb.append(mtopResponse.getRetMsg());
                sb.append(", errorCode: ");
                sb.append(mtopResponse.getRetCode());
                q0j.p(q0j.SCENE_OPEN_IMMEDIATELY, getRequestFailErrorCode(), sb.toString(), new HashMap());
                nyj.z().p(this.mTaskToken, "ndPreRequest", false);
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            nyj.z().s("remoteProcess", false, this.mTaskToken);
            nyj.z().v(this.mTaskToken_remoteProcessSub, "remoteProcessSub", true, "onError");
            dealMtopError(this.mPreloadtaskEntity, this.mTaskCallback);
            mbq.a("new_detail", mtopResponse);
            traceError(mtopResponse);
        }
    }

    static {
        t2o.a(352321811);
    }

    public static /* synthetic */ int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bcd6076a", new Object[0])).intValue();
        }
        return b;
    }

    public static /* synthetic */ int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bd46c372", new Object[0])).intValue();
        }
        int i = b;
        b = i + 1;
        return i;
    }

    public final String d(PreloadTaskEntity preloadTaskEntity) {
        ArrayList<PreloadTaskEntity.a> arrayList;
        PreloadTaskEntity.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a33d1b5f", new Object[]{this, preloadTaskEntity});
        }
        if (preloadTaskEntity == null || (arrayList = preloadTaskEntity.items) == null || arrayList.isEmpty() || (aVar = preloadTaskEntity.items.get(0)) == null) {
            return "";
        }
        String e = ynm.e(aVar.d);
        if (TextUtils.isEmpty(e)) {
            return "";
        }
        return e;
    }

    public NDRemoteBaseListener e(on8 on8Var, PreloadTaskEntity preloadTaskEntity, Map<String, String> map, ddt ddtVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NDRemoteBaseListener) ipChange.ipc$dispatch("dfe843a1", new Object[]{this, on8Var, preloadTaskEntity, map, ddtVar, str});
        }
        return new NDRemoteBaseListener(on8Var, preloadTaskEntity, map, ddtVar, str);
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49f9c538", new Object[]{this});
        }
        return "ndPreLoad";
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35643a4f", new Object[]{this})).booleanValue();
        }
        return true;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private MtopResponse f7124a;
        private PreloadTaskEntity b;
        private Map<String, String> c;
        private ddt d;
        private String e;

        static {
            t2o.a(352321812);
        }

        public a(MtopResponse mtopResponse, PreloadTaskEntity preloadTaskEntity, Map<String, String> map, ddt ddtVar, String str) {
            new HashMap();
            this.f7124a = mtopResponse;
            this.b = preloadTaskEntity;
            this.d = ddtVar;
            this.c = map;
            this.e = str;
        }

        private JSONObject b(MtopResponse mtopResponse, PreloadTaskEntity preloadTaskEntity, ddt ddtVar) {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("5d320df0", new Object[]{this, mtopResponse, preloadTaskEntity, ddtVar});
            }
            try {
                jSONObject = JSON.parseObject(new String(mtopResponse.getBytedata())).getJSONObject("data");
            } catch (Exception e) {
                ((ysm.a) ddtVar).a(preloadTaskEntity, e);
                txj.f("new_detail异常", "mtopresponse解析失败", e);
                jSONObject = null;
            }
            if (jSONObject == null || jSONObject.isEmpty()) {
                txj.e(txj.TAG_RENDER, "预请求preCheckMtopData，拿到的data为空");
                ((ysm.a) ddtVar).a(preloadTaskEntity, null);
                nyj.z().J("errMsg", "预请求数据 data 节点为空", this.e);
                return null;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("preloadSectionList");
            if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                return jSONObject2;
            }
            txj.e(txj.TAG_RENDER, "预请求preCheckMtopData，拿到的preloadSectionList为空");
            ((ysm.a) ddtVar).a(preloadTaskEntity, null);
            nyj.z().J("errMsg", "预请求数据 preloadSectionList 节点为空", this.e);
            return null;
        }

        private void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("21cf692c", new Object[]{this});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("isSuccess", String.valueOf(MUSCommonNativeBridge.c()));
            hashMap.put("preloadWeexNum", String.valueOf(NewDetailPreRequester.a()));
            txj.e(txj.TAG_RENDER, "ND在预请求第" + NewDetailPreRequester.a() + "次成功时是否加载成功：" + MUSCommonNativeBridge.c());
            q0j.g("eventProcess", q0j.UMBRELLA_TAG_PRELOAD_WEEX_LOAD_SO_SUCCESS, null);
            NewDetailPreRequester.b();
        }

        public void c(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6915338", new Object[]{this, jSONObject});
            } else if (NewDetailPreRequester.a() != 0) {
                txj.e(txj.TAG_RENDER, "非首次预请求，不加载zcache");
            } else {
                ArrayList<String> b0 = byj.b0();
                if (b0.size() == 0) {
                    txj.e(txj.TAG_RENDER, "zcache orange list为空，不加载zcache");
                } else if (jSONObject == null) {
                    txj.e(txj.TAG_RENDER, "数据节点为空，不加载zcache");
                } else {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("detailInfo");
                    if (jSONObject2 == null) {
                        txj.e(txj.TAG_RENDER, "detailInfo数据节点为空，不加载zcache");
                        return;
                    }
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("biz");
                    if (jSONObject3 == null) {
                        txj.e(txj.TAG_RENDER, "biz数据节点为空，不加载zcache");
                        return;
                    }
                    JSONObject jSONObject4 = jSONObject3.getJSONObject("feature");
                    if (jSONObject4 == null) {
                        txj.e(txj.TAG_RENDER, "feature数据节点为空，不加载zcache");
                        return;
                    }
                    JSONObject jSONObject5 = jSONObject4.getJSONObject("optimizeConfig");
                    if (jSONObject5 == null) {
                        txj.e(txj.TAG_RENDER, "optimizeConfig数据节点为空，不加载zcache");
                    } else if (!"true".equals(jSONObject5.getString("enableAllOptimize"))) {
                        txj.e(txj.TAG_RENDER, "enableAllOptimize没打开，不加载zcache");
                    } else {
                        yox.n(b0);
                        txj.e(txj.TAG_RENDER, "首次预请求完成加载zcache成功：" + b0);
                    }
                }
            }
        }

        public String f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8b41c5dc", new Object[]{this, str});
            }
            return ynm.b(this.c, str);
        }

        public String g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("27bf2452", new Object[]{this});
            }
            return q0j.ERROR_CODE_OPEN_IMMEDIATELY_NID_MISMATCH_DISTINCT;
        }

        public void h(String str, JSONObject jSONObject, int i, ktm ktmVar, String str2, StringBuilder sb) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da4b2aff", new Object[]{this, str, jSONObject, new Integer(i), ktmVar, str2, sb});
                return;
            }
            ktmVar.d(new btm.b().n("preload").l("low").m(str).o(jSONObject).p(str2).k());
            sb.append(str);
            sb.append(", ");
            if (i == 0) {
                c(jSONObject);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            nyj.z().c(fdv.F_DATA_PROCESS, this.e);
            JSONObject b = b(this.f7124a, this.b, this.d);
            d(this.f7124a, b);
            if (b == null) {
                nyj.z().s(fdv.F_DATA_PROCESS, false, this.e);
                nyj.z().p(this.e, "ndPreRequest", false);
                return;
            }
            a(b, this.f7124a, this.b, this.d);
            mbq.b("new_detail", this.f7124a);
            nyj.z().s(fdv.F_DATA_PROCESS, true, this.e);
            nyj.z().p(this.e, "ndPreRequest", true);
        }

        private void d(MtopResponse mtopResponse, JSONObject jSONObject) {
            ArrayList<PreloadTaskEntity.a> arrayList;
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("abaa6871", new Object[]{this, mtopResponse, jSONObject});
                return;
            }
            int size = jSONObject == null ? 0 : jSONObject.keySet().size();
            PreloadTaskEntity preloadTaskEntity = this.b;
            if (!(preloadTaskEntity == null || (arrayList = preloadTaskEntity.items) == null)) {
                i = arrayList.size();
            }
            if (i != size) {
                ArrayList arrayList2 = new ArrayList();
                String g = zxu.g(mtopResponse);
                StringBuilder sb = new StringBuilder("traceId: " + g + ", responseNids: ");
                if (jSONObject == null) {
                    sb.append("null, ");
                } else {
                    sb.append("[");
                    for (String str : jSONObject.keySet()) {
                        if (!TextUtils.isEmpty(str)) {
                            String f = f(str);
                            sb.append(f);
                            sb.append(", ");
                            arrayList2.add(f);
                        }
                    }
                    sb.append("]");
                }
                sb.append(", requestNids: ");
                ArrayList arrayList3 = new ArrayList();
                PreloadTaskEntity preloadTaskEntity2 = this.b;
                if (preloadTaskEntity2 == null || preloadTaskEntity2.items == null) {
                    sb.append("null");
                } else {
                    sb.append("[");
                    Iterator<PreloadTaskEntity.a> it = this.b.items.iterator();
                    while (it.hasNext()) {
                        PreloadTaskEntity.a next = it.next();
                        if (next != null) {
                            String str2 = next.e;
                            sb.append(str2);
                            sb.append(",");
                            if (!arrayList3.contains(str2)) {
                                arrayList3.add(str2);
                                if (!arrayList2.contains(str2)) {
                                    zgj.c(str2, 3);
                                }
                            }
                        }
                    }
                    sb.append("]");
                }
                if (arrayList3.size() != arrayList2.size()) {
                    q0j.p(q0j.SCENE_OPEN_IMMEDIATELY, g(), sb.toString(), new HashMap());
                }
            }
        }

        private void a(JSONObject jSONObject, MtopResponse mtopResponse, PreloadTaskEntity preloadTaskEntity, ddt ddtVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d683a94", new Object[]{this, jSONObject, mtopResponse, preloadTaskEntity, ddtVar});
                return;
            }
            try {
                StringBuilder sb = new StringBuilder("NewDetailPreRequester.dealMtopSuccess调用,缓存");
                ktm a2 = ltm.a(preloadTaskEntity.bizName);
                int i = 0;
                for (String str : jSONObject.keySet()) {
                    if (!TextUtils.isEmpty(str)) {
                        String f = f(str);
                        h(f, jSONObject.getJSONObject(str), i, a2, preloadTaskEntity.sourceFrom, sb);
                        zgj.c(f, 5);
                        q0j.g("eventProcess", q0j.UMBRELLA_TAG_PRE_REQUEST_SUCCESS, null);
                        i++;
                    }
                }
                txj.e(txj.TAG_RENDER, sb.toString());
                if (vv6.a()) {
                    a2.c("preload", "low");
                }
                e();
                ((ysm.a) ddtVar).b(preloadTaskEntity, mtopResponse);
            } catch (Exception e) {
                txj.f("new_detail异常", "dealMtopSuccess异常", e);
                ((ysm.a) ddtVar).a(preloadTaskEntity, e);
            }
        }
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9087861", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public final JSONArray c(ArrayList<PreloadTaskEntity.a> arrayList, HashMap<String, String> hashMap, PreRequestParams preRequestParams) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("e0e14a2b", new Object[]{this, arrayList, hashMap, preRequestParams});
        }
        JSONArray jSONArray = new JSONArray();
        String str = new fbh().g(y9a.b()).c;
        Iterator<PreloadTaskEntity.a> it = arrayList.iterator();
        while (it.hasNext()) {
            PreloadTaskEntity.a next = it.next();
            JSONObject jSONObject = new JSONObject();
            Map<String, String> g = g8n.g(next.c, byj.GUIDE_PRELOAD_PARAMS_BLACKLIST, byj.DEFAULT_GUIDE_PRELOAD_PARAMS_BLACKLIST);
            if (!TextUtils.isEmpty(str) && !"0".equals(str)) {
                g.put(g8n.B, str);
            }
            if (!z && g()) {
                if (!TextUtils.isEmpty(next.d) && TextUtils.equals(Uri.parse(next.d).getQueryParameter("cutPreload"), "Y")) {
                    preRequestParams.setRecAppId(PreRequestParams.REC_APP_ID);
                }
                z = true;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("queryParams", (Object) g);
            jSONObject.put("bizParams", (Object) jSONObject2);
            String c2 = o8n.c(next.d);
            if (h()) {
                jSONObject.put("itemId", (Object) c2);
            }
            jSONArray.add(jSONObject);
            hashMap.put(c2, next.e);
            zgj.a a2 = zgj.a(next.e);
            if (a2 != null && a2.b == 5) {
                zgj.c(next.e, 4);
            }
            zgj.c(next.e, 1);
            zgj.d(next.e);
        }
        return jSONArray;
    }

    @Override // tb.yjd
    public void request(PreloadTaskEntity preloadTaskEntity, ddt ddtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6f98b7d", new Object[]{this, preloadTaskEntity, ddtVar});
            return;
        }
        String a2 = nyj.z().a("ndPreRequest");
        nyj.z().c("callRequest", a2);
        String f = nyj.z().f("callRequestSub", a2);
        o2r.a("NewDetailPreRequester_request");
        o2r.b();
        txj.e(txj.TAG_RENDER, "NewDetailPreRequester.request调用");
        nyj.z().J("preReqSucCount", Integer.valueOf(b + 1), a2);
        nyj.z().J("preReqAllCount", Integer.valueOf(c + 1), a2);
        c++;
        ftm b2 = itm.b("new_detail");
        if (b2 != null) {
            b2.s(byj.L(y9a.b()));
        }
        ArrayList<PreloadTaskEntity.a> arrayList = preloadTaskEntity.items;
        if (arrayList == null || arrayList.isEmpty()) {
            txj.e(txj.TAG_RENDER, "NewDetailPreRequester.request调用,preloadTaskEntity.items为空");
            ((ysm.a) ddtVar).a(preloadTaskEntity, null);
            nyj.z().v(f, "callRequestSub", false, "itemIsEmpty");
            nyj.z().s("callRequest", false, a2);
            nyj.z().p(a2, "ndPreRequest", false);
            return;
        }
        PreRequestParams preRequestParams = new PreRequestParams();
        HashMap<String, String> hashMap = new HashMap<>();
        preRequestParams.setBatchParams(c(arrayList, hashMap, preRequestParams));
        preRequestParams.setNewDetailVisibleSizeInfo(oj7.d());
        preRequestParams.setNewType(f());
        nyj.z().J("batchSize", Integer.valueOf(arrayList.size()), a2);
        String d = d(preloadTaskEntity);
        preRequestParams.setNewDetailChannel(d);
        nyj.z().J("preReqChannel", d, a2);
        zg7 zg7Var = new zg7(y9a.b(), preRequestParams, "NewDetailPreload", false);
        zg7Var.d(e(this.f7123a, preloadTaskEntity, hashMap, ddtVar, a2));
        txj.e(txj.TAG_RENDER, "NewDetailPreRequester.request调用,发起mtop调用");
        zg7Var.b();
        nyj.z().v(f, "callRequestSub", true, "requestExecute");
        nyj.z().s("callRequest", true, a2);
        nyj.z().c("remoteProcess", a2);
    }
}
