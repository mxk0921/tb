package com.taobao.android.layoutmanager.module;

import android.os.Handler;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.session.constants.SessionConstants;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.core.l;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.flexbox.layoutmanager.module.AnyThread;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.IRemoteParserListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.common.MtopNetworkProp;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.domain.ProtocolEnum;
import mtopsdk.mtop.intf.MtopBuilder;
import mtopsdk.mtop.intf.MtopPrefetch;
import mtopsdk.mtop.util.MtopStatistics;
import mtopsdk.mtop.util.ReflectUtil;
import tb.akt;
import tb.bps;
import tb.hqq;
import tb.igs;
import tb.nwv;
import tb.t2o;
import tb.tfs;
import tb.ug7;

/* compiled from: Taobao */
@AnyThread
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class MtopModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_PREFETCH_TIMEOUT = 10000;
    public static final String KEY_MTOP_BIZ_ID = "bizId";
    public static final String KEY_MTOP_BIZ_TOPIC = "bizTopic";
    public static final String KEY_MTOP_HEADER_XBIZINFO = "x-biz-info";
    public static final String KEY_MTOP_HEADER_XBIZTYPE = "x-biz-type";
    public static final String KEY_PAGE_INDEX = "pageIndex";
    public static final String KEY_TOPIC = "topic";
    public static final String TAG = "mtop";
    private static int mtopRequestId = 0;
    private static List<e> prefetchList = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static abstract class TNodeMtopListener implements IRemoteBaseListener, IRemoteParserListener {
        static {
            t2o.a(502268115);
            t2o.a(589299719);
            t2o.a(589299722);
        }

        private TNodeMtopListener() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class TNodeMtopRequest extends MtopRequest {
        private d interceptor;

        static {
            t2o.a(502268116);
        }

        public TNodeMtopRequest(d dVar) {
            this.interceptor = dVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements MtopPrefetch.IPrefetchComparator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f8207a;

        public a(d dVar) {
            this.f8207a = dVar;
        }

        @Override // mtopsdk.mtop.intf.MtopPrefetch.IPrefetchComparator
        public MtopPrefetch.CompareResult compare(MtopBuilder mtopBuilder, MtopBuilder mtopBuilder2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MtopPrefetch.CompareResult) ipChange.ipc$dispatch("cca63c2e", new Object[]{this, mtopBuilder, mtopBuilder2});
            }
            MtopPrefetch.CompareResult compareResult = new MtopPrefetch.CompareResult();
            MtopRequest mtopRequest = mtopBuilder.getMtopContext().b;
            MtopRequest mtopRequest2 = mtopBuilder2.getMtopContext().b;
            d dVar = this.f8207a;
            if (dVar == null) {
                if (mtopRequest instanceof TNodeMtopRequest) {
                    dVar = ((TNodeMtopRequest) mtopRequest).interceptor;
                }
                if (dVar == null && (mtopRequest2 instanceof TNodeMtopRequest)) {
                    dVar = ((TNodeMtopRequest) mtopRequest2).interceptor;
                }
            }
            compareResult.setSame(MtopModule.requestEqual(mtopRequest.getApiName(), mtopRequest.getVersion(), mtopRequest.dataParams, mtopRequest2.getApiName(), mtopRequest2.getVersion(), mtopRequest2.dataParams, dVar));
            tfs.e("mtop", "prefetchrequest 默认IPrefetchComparator compare isSame: " + compareResult.isSame());
            return compareResult;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements MtopPrefetch.IPrefetchCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d.j f8208a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Map c;
        public final /* synthetic */ e d;

        public b(d.j jVar, String str, Map map, e eVar) {
            this.f8208a = jVar;
            this.b = str;
            this.c = map;
            this.d = eVar;
        }

        @Override // mtopsdk.mtop.intf.MtopPrefetch.IPrefetchCallback
        public void onPrefetch(String str, HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("58e86b4c", new Object[]{this, str, hashMap});
                return;
            }
            l.k(this.f8208a.f11976a, str, this.b, this.c);
            tfs.g("mtop", "TNode mtop prefetch type:" + str + " api:" + this.d.f8209a);
            if (akt.j1()) {
                if (!"TYPE_MISS".equals(str) && this.d != null) {
                    MtopModule.access$400().remove(this.d);
                }
            } else if ("TYPE_HIT".equals(str) || "TYPE_EXPIRE".equals(str)) {
                MtopModule.access$400().clear();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c {
        void a(MtopBuilder mtopBuilder);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface d {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f8209a;
        public final String b;
        public final JSONObject c;
        public final d d;

        static {
            t2o.a(502268114);
        }

        public e(String str, String str2, JSONObject jSONObject, d dVar) {
            this.f8209a = str;
            this.b = str2;
            this.c = jSONObject;
            this.d = dVar;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            d dVar = this.d;
            if (dVar == null) {
                dVar = ((e) obj).d;
            }
            e eVar = (e) obj;
            return MtopModule.requestEqual(this.f8209a, this.b, this.c, eVar.f8209a, eVar.b, eVar.c, dVar);
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            int hashCode = 527 + this.f8209a.hashCode();
            String str = this.b;
            if (str != null) {
                hashCode = (hashCode * 31) + str.hashCode();
            }
            JSONObject jSONObject = this.c;
            if (jSONObject != null) {
                return (hashCode * 31) + jSONObject.hashCode();
            }
            return hashCode;
        }
    }

    static {
        t2o.a(502268108);
        t2o.a(503316559);
    }

    public static /* synthetic */ String access$100(String str, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d60cd24f", new Object[]{str, map, new Boolean(z)});
        }
        return buildMtopRequestInfo(str, map, z);
    }

    public static /* synthetic */ void access$200(Map map, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2450ed31", new Object[]{map, mtopResponse});
        } else {
            addMtopStatistics(map, mtopResponse);
        }
    }

    public static /* synthetic */ List access$400() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6ee5f86c", new Object[0]);
        }
        return prefetchList;
    }

    public static Map<String, String> appendHeaderXBizInfo(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b197e06d", new Object[]{map, str});
        }
        if (map == null) {
            map = new HashMap<>();
        }
        if (map.containsKey(KEY_MTOP_HEADER_XBIZINFO)) {
            map.put(KEY_MTOP_HEADER_XBIZINFO, map.get(KEY_MTOP_HEADER_XBIZINFO) + ";" + str);
        } else {
            map.put(KEY_MTOP_HEADER_XBIZINFO, str);
        }
        return map;
    }

    private static String buildMtopRequestInfo(String str, Map map, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fb99f399", new Object[]{str, map, new Boolean(z)});
        }
        hqq.b a2 = hqq.a();
        hqq.b b2 = a2.b(" api: ").b(str).b("params: ");
        if (map != null) {
            str2 = JSON.toJSONString(map);
        } else {
            str2 = "";
        }
        b2.b(str2).b("isprefetch: ").a(Boolean.valueOf(z));
        return a2.toString();
    }

    private static boolean hasPrefetchMtop(String str, String str2, JSONObject jSONObject, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("875ebf4a", new Object[]{str, str2, jSONObject, dVar})).booleanValue();
        }
        return prefetchList.contains(new e(str, str2, jSONObject, dVar));
    }

    public static void request(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ab124dd", new Object[]{jVar});
        } else {
            requestWithParser(jVar, null, null);
        }
    }

    public static boolean requestEqual(String str, String str2, Map map, String str3, String str4, Map map2, d dVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa02a63a", new Object[]{str, str2, map, str3, str4, map2, dVar})).booleanValue();
        }
        if (!str.equals(str3) || !str2.equals(str4)) {
            z = false;
        }
        if (z) {
            return z & paramsEqual(map, map2, dVar);
        }
        return z;
    }

    public static void requestWithParser(d.j jVar, IRemoteBaseListener iRemoteBaseListener, IRemoteParserListener iRemoteParserListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c3a98a", new Object[]{jVar, iRemoteBaseListener, iRemoteParserListener});
        } else {
            requestWithParserInner(jVar, iRemoteBaseListener, iRemoteParserListener, null);
        }
    }

    public static void requestWithParserInner(d.j jVar, IRemoteBaseListener iRemoteBaseListener, IRemoteParserListener iRemoteParserListener, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ac60c4a", new Object[]{jVar, iRemoteBaseListener, iRemoteParserListener, cVar});
        } else {
            requestWithParserInner(jVar, iRemoteBaseListener, iRemoteParserListener, cVar, null);
        }
    }

    private static void addMtopStatistics(Map map, MtopResponse mtopResponse) {
        String str;
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dc863d7", new Object[]{map, mtopResponse});
            return;
        }
        try {
            MtopStatistics mtopStat = mtopResponse.getMtopStat();
            if (mtopResponse.getHeaderFields() != null) {
                if (akt.i1()) {
                    map.put("headers", nwv.t0(mtopResponse.getHeaderFields()));
                }
                List<String> list2 = mtopResponse.getHeaderFields().get(HttpConstant.EAGLE_EYE_ID_2);
                str = (list2 == null || list2.isEmpty()) ? null : list2.get(0);
                if (TextUtils.isEmpty(str) && (list = mtopResponse.getHeaderFields().get("eagleeye-traceid")) != null && !list.isEmpty()) {
                    str = list.get(0);
                }
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                str = mtopStat.eagleEyeTraceId;
            }
            map.put("traceId", mtopStat.fullTraceId);
            map.put("eagleeyeTraceId", str);
            map.put("httpResponseCode", Integer.valueOf(mtopResponse.getResponseCode()));
            map.put("isPrefetch", Boolean.valueOf(mtopStat.isPrefetch));
            map.put(bps.RENDER_RESULT_IS_FROM_CACHE, Integer.valueOf(mtopStat.getRbStatData().isCache));
            map.put("isLoginCancel", null);
            map.put("isCacheExpired", null);
        } catch (Throwable th) {
            tfs.d("addMtopStatistics: " + th.getMessage());
        }
    }

    private static String buildRequestId(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e9c2e88", new Object[]{str, map});
        }
        String str2 = map != null ? map.get("entityId") : null;
        if (TextUtils.isEmpty(str2)) {
            int i = mtopRequestId;
            mtopRequestId = 1 + i;
            str2 = String.valueOf(i);
        }
        return str + "|" + str2;
    }

    public static void requestWithParserInner(final d.j jVar, final IRemoteBaseListener iRemoteBaseListener, final IRemoteParserListener iRemoteParserListener, c cVar, d dVar) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        String str;
        e eVar;
        HashMap hashMap;
        int i2;
        int i3;
        String str2;
        HashMap hashMap2;
        HashMap hashMap3;
        e eVar2;
        String str3;
        boolean z4;
        String str4;
        final d.k kVar;
        RemoteBusiness remoteBusiness;
        String str5;
        int i4;
        String str6;
        o oVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("884e4178", new Object[]{jVar, iRemoteBaseListener, iRemoteParserListener, cVar, dVar});
            return;
        }
        boolean z5 = (iRemoteBaseListener == null && iRemoteParserListener == null) ? false : true;
        final long nanoTime = System.nanoTime();
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            final String string = jSONObject.getString("api");
            final String string2 = jSONObject.getString("v");
            JSONObject jSONObject2 = jSONObject.getJSONObject("headers");
            JSONObject jSONObject3 = jSONObject.getJSONObject("data");
            int intValue = jSONObject.getIntValue(SessionConstants.ECODE);
            int intValue2 = jSONObject.getIntValue(MspGlobalDefine.SESSION);
            String string3 = jSONObject.getString("type");
            int intValue3 = jSONObject.getIntValue("timeout");
            boolean booleanValue = jSONObject.getBooleanValue("isEnableWUA");
            int intValue4 = jSONObject.getIntValue("wuaType");
            String string4 = jSONObject.getString("bizId");
            int intValue5 = jSONObject.getIntValue("pageIndex");
            String string5 = jSONObject.getString("topic");
            JSONObject jSONObject4 = jSONObject.getJSONObject("options");
            if (jSONObject4 != null) {
                z2 = jSONObject4.getBooleanValue("prefetch");
                z = booleanValue;
                i = nwv.t(jSONObject4.get("prefetchTimeout"), 10000);
                if (TextUtils.isEmpty(string4)) {
                    string4 = jSONObject4.getString("bizId");
                }
                if (TextUtils.isEmpty(string5)) {
                    string5 = jSONObject4.getString(KEY_MTOP_BIZ_TOPIC);
                }
            } else {
                z = booleanValue;
                string5 = string5;
                i = 10000;
                z2 = false;
            }
            boolean booleanValue2 = jSONObject4 != null ? jSONObject4.getBooleanValue("trace") : false;
            if (z2) {
                eVar = new e(string, string2, jSONObject3, dVar);
                str = "trace";
                prefetchList.add(eVar);
                z3 = false;
            } else {
                str = "trace";
                z3 = hasPrefetchMtop(string, string2, jSONObject3, dVar);
                eVar = null;
            }
            d.k kVar2 = jVar.c;
            TNodeMtopRequest tNodeMtopRequest = new TNodeMtopRequest(dVar);
            if (string != null) {
                tNodeMtopRequest.setApiName(string);
            }
            if (string2 != null) {
                tNodeMtopRequest.setVersion(string2);
            }
            tNodeMtopRequest.setNeedEcode(intValue > 0);
            tNodeMtopRequest.setNeedSession(intValue2 > 0);
            if (jSONObject2 == null || jSONObject2.isEmpty()) {
                hashMap = null;
            } else {
                HashMap hashMap4 = new HashMap();
                Iterator<Map.Entry<String, Object>> it = jSONObject2.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, Object> next = it.next();
                    if (next == null || next.getValue() == null) {
                        it = it;
                    } else {
                        it = it;
                        hashMap4.put(next.getKey(), next.getValue().toString());
                    }
                }
                hashMap = hashMap4;
            }
            final HashMap hashMap5 = new HashMap();
            if (jSONObject3 != null) {
                for (Map.Entry<String, Object> entry : jSONObject3.entrySet()) {
                    if (!(entry == null || entry.getValue() == null)) {
                        hashMap5.put(entry.getKey(), entry.getValue().toString());
                    }
                }
            }
            tNodeMtopRequest.dataParams = hashMap5;
            tNodeMtopRequest.setData(ReflectUtil.convertMapToDataStr(hashMap5));
            RemoteBusiness build = RemoteBusiness.build((MtopRequest) tNodeMtopRequest);
            Handler handler = jVar.h;
            if (handler != null) {
                build.handler(handler);
            } else if (!z5 && (oVar = jVar.f11976a) != null) {
                build.handler(oVar.X());
            }
            final String buildRequestId = buildRequestId(string, hashMap5);
            igs.a("mtop request start" + buildRequestId + " prefetch:" + z2);
            if (iRemoteParserListener == null && iRemoteBaseListener == null && kVar2 == null) {
                kVar = kVar2;
                hashMap2 = hashMap5;
                i2 = i;
                i4 = intValue3;
                str5 = string4;
                str2 = string3;
                i3 = intValue5;
                hashMap3 = hashMap;
                str3 = str;
                eVar2 = eVar;
                z4 = z2;
                str4 = string;
                remoteBusiness = build;
            } else {
                kVar = kVar2;
                str5 = string4;
                str3 = str;
                eVar2 = eVar;
                intValue4 = intValue4;
                i4 = intValue3;
                str4 = string;
                z4 = z2;
                remoteBusiness = build;
                hashMap2 = hashMap5;
                hashMap3 = hashMap;
                i2 = i;
                str2 = string3;
                i3 = intValue5;
                remoteBusiness.registeListener((IRemoteListener) new TNodeMtopListener() { // from class: com.taobao.android.layoutmanager.module.MtopModule.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super();
                    }

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str7, Object... objArr) {
                        str7.hashCode();
                        int hashCode = str7.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str7 + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/module/MtopModule$1");
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteParserListener
                    public void parseResponse(MtopResponse mtopResponse) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("12969fa0", new Object[]{this, mtopResponse});
                            return;
                        }
                        IRemoteParserListener iRemoteParserListener2 = IRemoteParserListener.this;
                        if (iRemoteParserListener2 != null) {
                            iRemoteParserListener2.parseResponse(mtopResponse);
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onError(int i5, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i5), mtopResponse, obj});
                            return;
                        }
                        igs.a("mtop request fail " + buildRequestId);
                        MtopStatistics mtopStat = mtopResponse.getMtopStat();
                        String str7 = string;
                        long nanoTime2 = System.nanoTime() - nanoTime;
                        String str8 = string2;
                        Map map = hashMap5;
                        String str9 = "";
                        String str10 = mtopStat != null ? mtopStat.fullTraceId : str9;
                        if (mtopStat != null) {
                            str9 = mtopStat.eagleEyeTraceId;
                        }
                        l.j(jVar.f11976a, new l.k(str7, nanoTime2, false, str8, map, str10, str9), mtopStat != null && mtopStat.isPrefetch);
                        String str11 = mtopResponse.getRetCode() + "::" + mtopResponse.getRetMsg();
                        StringBuilder sb = new StringBuilder("mtop onError: ");
                        sb.append(str11);
                        sb.append(MtopModule.access$100(string, map, mtopStat != null && mtopStat.isPrefetch));
                        tfs.g("mtop", sb.toString());
                        if (kVar != null) {
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put("error", (Object) str11);
                            MtopModule.access$200(jSONObject5, mtopResponse);
                            kVar.a(jVar, jSONObject5);
                        } else {
                            IRemoteBaseListener iRemoteBaseListener2 = iRemoteBaseListener;
                            if (iRemoteBaseListener2 != null) {
                                iRemoteBaseListener2.onError(i5, mtopResponse, obj);
                            }
                        }
                        igs.c();
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                    public void onSystemError(int i5, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i5), mtopResponse, obj});
                            return;
                        }
                        igs.a("mtop request fail " + buildRequestId);
                        MtopStatistics mtopStat = mtopResponse.getMtopStat();
                        String str7 = string;
                        long nanoTime2 = System.nanoTime() - nanoTime;
                        String str8 = string2;
                        Map map = hashMap5;
                        String str9 = "";
                        String str10 = mtopStat != null ? mtopStat.fullTraceId : str9;
                        if (mtopStat != null) {
                            str9 = mtopStat.eagleEyeTraceId;
                        }
                        l.j(jVar.f11976a, new l.k(str7, nanoTime2, false, str8, map, str10, str9), mtopStat != null && mtopStat.isPrefetch);
                        String str11 = mtopResponse.getRetCode() + "::" + mtopResponse.getRetMsg();
                        StringBuilder sb = new StringBuilder("mtop onSystemError ");
                        sb.append(str11);
                        sb.append(MtopModule.access$100(string, map, mtopStat != null && mtopStat.isPrefetch));
                        tfs.g("mtop", sb.toString());
                        if (kVar != null) {
                            JSONObject jSONObject5 = new JSONObject();
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.add(str11);
                            jSONObject5.put("error", (Object) jSONArray);
                            MtopModule.access$200(jSONObject5, mtopResponse);
                            kVar.a(jVar, jSONObject5);
                        } else {
                            IRemoteBaseListener iRemoteBaseListener2 = iRemoteBaseListener;
                            if (iRemoteBaseListener2 != null) {
                                iRemoteBaseListener2.onSystemError(i5, mtopResponse, obj);
                            }
                        }
                        igs.c();
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onSuccess(int i5, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                        boolean z6;
                        Map map;
                        boolean z7 = false;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i5), mtopResponse, baseOutDo, obj});
                            return;
                        }
                        MtopStatistics mtopStat = mtopResponse.getMtopStat();
                        String str7 = string;
                        long nanoTime2 = System.nanoTime() - nanoTime;
                        String str8 = string2;
                        Map map2 = hashMap5;
                        String str9 = "";
                        String str10 = mtopStat != null ? mtopStat.fullTraceId : str9;
                        if (mtopStat != null) {
                            str9 = mtopStat.eagleEyeTraceId;
                        }
                        l.k kVar3 = new l.k(str7, nanoTime2, true, str8, map2, str10, str9);
                        StringBuilder sb = new StringBuilder("mtop onSuccess, ");
                        String str11 = string;
                        if (mtopStat == null || !mtopStat.isPrefetch) {
                            map = map2;
                            z6 = false;
                        } else {
                            map = map2;
                            z6 = true;
                        }
                        sb.append(MtopModule.access$100(str11, map, z6));
                        tfs.g("mtop", sb.toString());
                        if (kVar != null || iRemoteBaseListener != null) {
                            StringBuilder sb2 = new StringBuilder("mtop request success ");
                            sb2.append(buildRequestId);
                            sb2.append(" prefetch:");
                            sb2.append(mtopStat != null && mtopStat.isPrefetch);
                            igs.a(sb2.toString());
                            o oVar2 = jVar.f11976a;
                            if (mtopStat != null && mtopStat.isPrefetch) {
                                z7 = true;
                            }
                            l.j(oVar2, kVar3, z7);
                            if (kVar != null) {
                                JSONObject originFastJsonObject = mtopResponse.getOriginFastJsonObject();
                                JSONObject jSONObject5 = new JSONObject();
                                jSONObject5.put("data", (Object) originFastJsonObject);
                                MtopModule.access$200(jSONObject5, mtopResponse);
                                kVar.a(jVar, jSONObject5);
                            } else {
                                IRemoteBaseListener iRemoteBaseListener2 = iRemoteBaseListener;
                                if (iRemoteBaseListener2 != null) {
                                    iRemoteBaseListener2.onSuccess(i5, mtopResponse, baseOutDo, obj);
                                }
                            }
                            igs.c();
                        }
                    }
                });
            }
            remoteBusiness.protocol(ProtocolEnum.HTTPSECURE);
            remoteBusiness.setConnectionTimeoutMilliSecond(i4);
            remoteBusiness.setSocketTimeoutMilliSecond(i4);
            remoteBusiness.supportStreamJson(true);
            remoteBusiness.setBizId(82);
            tfs.e("mtop", "bizTopic= " + string5 + ", bizId=" + str5 + " pageIndex:" + i3);
            if (!TextUtils.isEmpty(str5)) {
                remoteBusiness.setBizId(str5);
            }
            if (!TextUtils.isEmpty(string5)) {
                remoteBusiness.setBizTopic(string5);
            }
            if (i3 > 0) {
                remoteBusiness.setPageIndex(i3);
            }
            if ("POST".equalsIgnoreCase(str2)) {
                remoteBusiness.reqMethod(MethodEnum.POST);
            }
            if (z4 || z3) {
                str6 = str4;
                tfs.e("mtop", "prefetchrequest " + str6);
            } else {
                remoteBusiness.useCache();
                StringBuilder sb = new StringBuilder("prefetchrequest ");
                str6 = str4;
                sb.append(str6);
                sb.append(" ;;; useCache()");
                tfs.e("mtop", sb.toString());
            }
            if (z) {
                remoteBusiness.useWua();
                remoteBusiness.useWua(intValue4);
            }
            remoteBusiness.setErrorNotifyAfterCache(true);
            if (hashMap3 != null) {
                remoteBusiness.headers((Map<String, String>) hashMap3);
            }
            l.l(jVar.f11976a, str6, hashMap2, z4);
            tfs.g("mtop", "start mtop request: " + buildMtopRequestInfo(str6, hashMap2, z4));
            if (z4) {
                remoteBusiness.prefetchComparator((MtopPrefetch.IPrefetchComparator) new a(dVar));
                remoteBusiness.prefetch(i2, (MtopPrefetch.IPrefetchCallback) new b(jVar, str6, hashMap2, eVar2));
            }
            remoteBusiness.startRequest();
            if (booleanValue2 && kVar != null) {
                JSONObject jSONObject5 = new JSONObject();
                MtopNetworkProp mtopNetworkProp = remoteBusiness.mtopProp;
                if (mtopNetworkProp != null) {
                    jSONObject5.put("traceId", (Object) mtopNetworkProp.clientTraceId);
                }
                jSONObject5.put(str3, (Object) Boolean.TRUE);
                kVar.a(jVar, jSONObject5);
            }
            if (cVar != null) {
                cVar.a(remoteBusiness);
            }
            igs.c();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0093, code lost:
        if (((tb.ug7) r9).b(r3, r2, r4) == false) goto L_0x0096;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean defalutParamsEqual(java.util.Map r7, java.util.Map r8, com.taobao.android.layoutmanager.module.MtopModule.d r9) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.layoutmanager.module.MtopModule.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001f
            java.lang.String r3 = "5c9b9220"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r7
            r4[r0] = r8
            r7 = 2
            r4[r7] = r9
            java.lang.Object r7 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L_0x001f:
            int r2 = r7.size()     // Catch: all -> 0x0057
            int r3 = r8.size()     // Catch: all -> 0x0057
            if (r2 == r3) goto L_0x002a
            return r1
        L_0x002a:
            java.util.Set r7 = r7.entrySet()     // Catch: all -> 0x0057
            java.util.Iterator r7 = r7.iterator()     // Catch: all -> 0x0057
        L_0x0032:
            boolean r2 = r7.hasNext()     // Catch: all -> 0x0057
            if (r2 == 0) goto L_0x0097
            java.lang.Object r2 = r7.next()     // Catch: all -> 0x0057
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: all -> 0x0057
            java.lang.Object r3 = r2.getKey()     // Catch: all -> 0x0057
            java.lang.String r3 = (java.lang.String) r3     // Catch: all -> 0x0057
            java.lang.Object r2 = r2.getValue()     // Catch: all -> 0x0057
            if (r2 != 0) goto L_0x005a
            java.lang.Object r2 = r8.get(r3)     // Catch: all -> 0x0057
            if (r2 != 0) goto L_0x0059
            boolean r2 = r8.containsKey(r3)     // Catch: all -> 0x0057
            if (r2 != 0) goto L_0x0032
            goto L_0x0059
        L_0x0057:
            r7 = move-exception
            goto L_0x0098
        L_0x0059:
            return r1
        L_0x005a:
            java.lang.Object r4 = r8.get(r3)     // Catch: all -> 0x0057
            boolean r5 = r2.equals(r4)     // Catch: all -> 0x0057
            if (r5 != 0) goto L_0x0032
            java.lang.String r5 = "params"
            boolean r5 = r3.equals(r5)     // Catch: all -> 0x0057
            if (r5 == 0) goto L_0x008a
            boolean r5 = r2 instanceof java.lang.String     // Catch: all -> 0x0057
            if (r5 == 0) goto L_0x008a
            boolean r5 = r4 instanceof java.lang.String     // Catch: all -> 0x0057
            if (r5 == 0) goto L_0x008a
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5     // Catch: all -> 0x0057
            com.alibaba.fastjson.JSONObject r5 = com.alibaba.fastjson.JSON.parseObject(r5)     // Catch: all -> 0x0057
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6     // Catch: all -> 0x0057
            com.alibaba.fastjson.JSONObject r6 = com.alibaba.fastjson.JSON.parseObject(r6)     // Catch: all -> 0x0057
            boolean r5 = r5.equals(r6)     // Catch: all -> 0x0057
            if (r5 == 0) goto L_0x008a
            goto L_0x0032
        L_0x008a:
            if (r9 == 0) goto L_0x0096
            r5 = r9
            tb.ug7 r5 = (tb.ug7) r5     // Catch: all -> 0x0057
            boolean r2 = r5.b(r3, r2, r4)     // Catch: all -> 0x0057
            if (r2 == 0) goto L_0x0096
            goto L_0x0032
        L_0x0096:
            return r1
        L_0x0097:
            return r0
        L_0x0098:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "defalutParamsEqual error:"
            r8.<init>(r9)
            java.lang.String r7 = r7.getMessage()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            tb.tfs.d(r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.layoutmanager.module.MtopModule.defalutParamsEqual(java.util.Map, java.util.Map, com.taobao.android.layoutmanager.module.MtopModule$d):boolean");
    }

    private static boolean paramsEqual(Map map, Map map2, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("833318f1", new Object[]{map, map2, dVar})).booleanValue();
        }
        if (map == null && map2 == null) {
            return true;
        }
        if (!(map == null || map2 == null)) {
            try {
                if (dVar != null) {
                    return ((ug7) dVar).e(map, map2);
                }
                return defalutParamsEqual(map, map2, dVar);
            } catch (Exception e2) {
                tfs.d("paramsEqual error:" + e2.getMessage());
            }
        }
        return false;
    }
}
