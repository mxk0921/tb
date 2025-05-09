package com.taobao.android.turbo.adapter.impl;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.adapter.RequestType;
import com.taobao.android.turbo.adapter.impl.mtop.MtopRequestWrapper;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.IRemoteParserListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.JsonTypeEnum;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.domain.ProtocolEnum;
import mtopsdk.mtop.intf.MtopBuilder;
import mtopsdk.mtop.intf.MtopPrefetch;
import mtopsdk.mtop.util.MtopStatistics;
import mtopsdk.mtop.util.ReflectUtil;
import tb.a07;
import tb.bwc;
import tb.ckf;
import tb.j5o;
import tb.j7j;
import tb.jwc;
import tb.njg;
import tb.q8u;
import tb.t2o;
import tb.t4j;
import tb.tpu;
import tb.u1a;
import tb.uj3;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class MtopAdapter implements bwc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "MtopAdapter";
    public int b;
    public static final a Companion = new a(null);
    public static final njg d = kotlin.a.b(MtopAdapter$Companion$instance$2.INSTANCE);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<b> f9728a = new ArrayList<>(0);
    public final t4j c = new t4j();

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\"\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/taobao/android/turbo/adapter/impl/MtopAdapter$MtopListener;", "Lcom/taobao/tao/remotebusiness/IRemoteBaseListener;", "Lcom/taobao/tao/remotebusiness/IRemoteParserListener;", "()V", "turboflow_framework_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static abstract class MtopListener implements IRemoteBaseListener, IRemoteParserListener {
        static {
            t2o.a(919601204);
            t2o.a(589299719);
            t2o.a(589299722);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(919601202);
        }

        public a() {
        }

        public final MtopAdapter a() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("9e8806c7", new Object[]{this});
            } else {
                value = MtopAdapter.c().getValue();
            }
            return (MtopAdapter) value;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f9729a;
        public final String b;
        public final Map<String, ? extends Object> c;
        public final /* synthetic */ MtopAdapter d;

        static {
            t2o.a(919601205);
        }

        public b(MtopAdapter mtopAdapter, String str, String str2, Map<String, ? extends Object> map, jwc jwcVar) {
            ckf.g(str, "api");
            this.d = mtopAdapter;
            this.f9729a = str;
            this.b = str2;
            this.c = map;
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("67b7a95", new Object[]{this});
            }
            return this.f9729a;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            b bVar = (b) obj;
            return MtopAdapter.d(this.d).c(this.f9729a, this.b, this.c, bVar.f9729a, bVar.b, bVar.c, null);
        }

        public int hashCode() {
            int i;
            int i2 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            int hashCode = 527 + this.f9729a.hashCode();
            String str = this.b;
            if (str != null) {
                int i3 = hashCode * 31;
                if (str != null) {
                    i = str.hashCode();
                } else {
                    i = 0;
                }
                hashCode = i3 + i;
            }
            Map<String, ? extends Object> map = this.c;
            if (map == null) {
                return hashCode;
            }
            int i4 = hashCode * 31;
            if (map != null) {
                i2 = map.hashCode();
            }
            return i4 + i2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class c implements MtopPrefetch.IPrefetchComparator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // mtopsdk.mtop.intf.MtopPrefetch.IPrefetchComparator
        public final MtopPrefetch.CompareResult compare(MtopBuilder mtopBuilder, MtopBuilder mtopBuilder2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MtopPrefetch.CompareResult) ipChange.ipc$dispatch("cca63c2e", new Object[]{this, mtopBuilder, mtopBuilder2});
            }
            MtopPrefetch.CompareResult compareResult = new MtopPrefetch.CompareResult();
            ckf.f(mtopBuilder, "first");
            MtopRequest mtopRequest = mtopBuilder.getMtopContext().b;
            ckf.f(mtopRequest, "first.mtopContext.mtopRequest");
            ckf.f(mtopBuilder2, com.taobao.android.detail.ttdetail.floatview.globalbarrage.c.LOCATION_SECOND);
            MtopRequest mtopRequest2 = mtopBuilder2.getMtopContext().b;
            ckf.f(mtopRequest2, "second.mtopContext.mtopRequest");
            jwc comparator = mtopRequest instanceof MtopRequestWrapper ? ((MtopRequestWrapper) mtopRequest).getComparator() : null;
            if (comparator == null && (mtopRequest2 instanceof MtopRequestWrapper)) {
                comparator = ((MtopRequestWrapper) mtopRequest2).getComparator();
            }
            t4j d = MtopAdapter.d(MtopAdapter.this);
            String apiName = mtopRequest.getApiName();
            ckf.f(apiName, "request1.apiName");
            String version = mtopRequest.getVersion();
            Map<String, String> map = mtopRequest.dataParams;
            String apiName2 = mtopRequest2.getApiName();
            ckf.f(apiName2, "request2.apiName");
            compareResult.setSame(d.c(apiName, version, map, apiName2, mtopRequest2.getVersion(), mtopRequest2.dataParams, comparator));
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, MtopAdapter.TAG, "prefetchrequest 默认IPrefetchComparator compare isSame: " + compareResult.isSame(), null, 4, null);
            return compareResult;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class d implements MtopPrefetch.IPrefetchCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ b b;

        public d(b bVar) {
            this.b = bVar;
        }

        @Override // mtopsdk.mtop.intf.MtopPrefetch.IPrefetchCallback
        public final void onPrefetch(String str, HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("58e86b4c", new Object[]{this, str, hashMap});
                return;
            }
            tpu.a aVar = tpu.Companion;
            StringBuilder sb = new StringBuilder("mtop prefetch type:");
            sb.append(str);
            sb.append(" api:");
            b bVar = this.b;
            sb.append(bVar != null ? bVar.a() : null);
            tpu.a.b(aVar, MtopAdapter.TAG, sb.toString(), null, 4, null);
            if (!ckf.b("TYPE_MISS", str) && this.b != null) {
                MtopAdapter.f(MtopAdapter.this).remove(this.b);
            }
        }
    }

    static {
        t2o.a(919601201);
        t2o.a(919601170);
    }

    public static final /* synthetic */ String b(MtopAdapter mtopAdapter, String str, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("70fa0850", new Object[]{mtopAdapter, str, map, new Boolean(z)});
        }
        return mtopAdapter.i(str, map, z);
    }

    public static final /* synthetic */ njg c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("fb99327c", new Object[0]);
        }
        return d;
    }

    public static final /* synthetic */ t4j d(MtopAdapter mtopAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t4j) ipChange.ipc$dispatch("38ca1f95", new Object[]{mtopAdapter});
        }
        return mtopAdapter.c;
    }

    public static final /* synthetic */ j7j e(MtopAdapter mtopAdapter, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j7j) ipChange.ipc$dispatch("fc5ce2cc", new Object[]{mtopAdapter, mtopResponse});
        }
        return mtopAdapter.k(mtopResponse);
    }

    public static final /* synthetic */ ArrayList f(MtopAdapter mtopAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("6d1c0221", new Object[]{mtopAdapter});
        }
        return mtopAdapter.f9728a;
    }

    public final MtopRequest h(j5o j5oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("1d915569", new Object[]{this, j5oVar});
        }
        MtopRequestWrapper mtopRequestWrapper = new MtopRequestWrapper(null);
        mtopRequestWrapper.setApiName(j5oVar.a());
        mtopRequestWrapper.setVersion(j5oVar.p());
        mtopRequestWrapper.setNeedEcode(j5oVar.e());
        mtopRequestWrapper.setNeedSession(j5oVar.g());
        HashMap hashMap = new HashMap();
        Map<String, Object> c2 = j5oVar.c();
        if (c2 != null && !c2.isEmpty()) {
            for (Map.Entry<String, Object> entry : j5oVar.c().entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue().toString());
            }
        }
        mtopRequestWrapper.dataParams = hashMap;
        mtopRequestWrapper.setData(ReflectUtil.convertMapToDataStr(hashMap));
        return mtopRequestWrapper;
    }

    public final String i(String str, Map<?, ?> map, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fb99f399", new Object[]{this, str, map, new Boolean(z)});
        }
        StringBuilder sb = new StringBuilder(" api: ");
        sb.append(str);
        sb.append("params: ");
        if (map != null) {
            str2 = JSON.toJSONString(map);
        } else {
            str2 = "";
        }
        sb.append(str2);
        sb.append("isprefetch: ");
        sb.append(z);
        String sb2 = sb.toString();
        ckf.f(sb2, "stringBuilder.toString()");
        return sb2;
    }

    public final String j(String str, Map<String, String> map) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e9c2e88", new Object[]{this, str, map});
        }
        if (map != null) {
            str2 = map.get("entityId");
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            int i = this.b;
            this.b = 1 + i;
            str2 = String.valueOf(i);
        }
        return str + '|' + str2;
    }

    public final j7j k(MtopResponse mtopResponse) {
        String str;
        boolean z;
        MtopStatistics.RbStatisticData rbStatData;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j7j) ipChange.ipc$dispatch("eed34c17", new Object[]{this, mtopResponse});
        }
        MtopStatistics mtopStat = mtopResponse.getMtopStat();
        if (mtopStat == null || (str = mtopStat.eagleEyeTraceId) == null) {
            str = "";
        }
        int responseCode = mtopResponse.getResponseCode();
        if (mtopStat != null) {
            z = mtopStat.isPrefetch;
        } else {
            z = false;
        }
        if (!(mtopStat == null || (rbStatData = mtopStat.getRbStatData()) == null)) {
            i = rbStatData.isCache;
        }
        return new j7j(str, responseCode, z, i);
    }

    public final boolean l(String str, String str2, Map<String, ? extends Object> map, jwc jwcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebc145bb", new Object[]{this, str, str2, map, jwcVar})).booleanValue();
        }
        return this.f9728a.contains(new b(this, str, str2, map, jwcVar));
    }

    public final RemoteBusiness g(MtopRequest mtopRequest, j5o j5oVar, boolean z) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteBusiness) ipChange.ipc$dispatch("9328db9e", new Object[]{this, mtopRequest, j5oVar, new Boolean(z)});
        }
        RemoteBusiness build = RemoteBusiness.build(mtopRequest);
        ckf.f(build, "RemoteBusiness.build(request)");
        build.protocol(ProtocolEnum.HTTPSECURE);
        build.setConnectionTimeoutMilliSecond(j5oVar.l());
        build.setSocketTimeoutMilliSecond(j5oVar.l());
        build.supportStreamJson(true);
        build.setBizId(82);
        if (!TextUtils.isEmpty(j5oVar.b())) {
            build.setBizId(j5oVar.b());
        }
        if (!TextUtils.isEmpty(j5oVar.m())) {
            build.setBizTopic(j5oVar.m());
        }
        if (j5oVar.h() > 0) {
            build.setPageIndex(j5oVar.h());
        }
        if (j5oVar.k() == RequestType.POST) {
            build.reqMethod(MethodEnum.POST);
        }
        if (ckf.b(j5oVar.d(), "originaljson")) {
            build.setJsonType(JsonTypeEnum.ORIGINALJSON);
        }
        if (!j5oVar.i() && !z && !j5oVar.n()) {
            build.useCache();
        }
        if (j5oVar.o()) {
            build.useWua();
            build.useWua(j5oVar.q());
        }
        build.setErrorNotifyAfterCache(true);
        Map<String, Object> f = j5oVar.f();
        if (f == null || f.isEmpty()) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            for (Map.Entry<String, Object> entry : j5oVar.f().entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue().toString());
            }
        }
        if (hashMap != null && !hashMap.isEmpty()) {
            build.headers((Map<String, String>) hashMap);
        }
        return build;
    }

    @Override // tb.bwc
    public void a(final j5o j5oVar, final u1a<? super Map<String, ? extends Object>, ? super j7j, xhv> u1aVar, final w1a<? super String, ? super String, ? super j7j, xhv> w1aVar) {
        b bVar;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("571ed51d", new Object[]{this, j5oVar, u1aVar, w1aVar});
            return;
        }
        ckf.g(j5oVar, "params");
        ckf.g(u1aVar, "successCallback");
        ckf.g(w1aVar, "failCallback");
        if (j5oVar.i()) {
            bVar = new b(this, j5oVar.a(), j5oVar.p(), j5oVar.c(), null);
            this.f9728a.add(bVar);
        } else {
            bVar = null;
            z = l(j5oVar.a(), j5oVar.p(), j5oVar.c(), null);
        }
        final MtopRequest h = h(j5oVar);
        final String j = j(j5oVar.a(), h.dataParams);
        q8u.a aVar = q8u.Companion;
        aVar.a("mtop request start" + j);
        tpu.a aVar2 = tpu.Companion;
        tpu.a.b(aVar2, TAG, "start mtop request: " + i(j5oVar.a(), h.dataParams, j5oVar.i()), null, 4, null);
        RemoteBusiness g = g(h, j5oVar, z);
        g.registeListener((IRemoteListener) new MtopListener() { // from class: com.taobao.android.turbo.adapter.impl.MtopAdapter$request$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(MtopAdapter$request$1 mtopAdapter$request$1, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/adapter/impl/MtopAdapter$request$1");
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                ckf.g(mtopResponse, "mtopResponse");
                q8u.a aVar3 = q8u.Companion;
                aVar3.a("mtop request success " + j);
                j7j e = MtopAdapter.e(MtopAdapter.this, mtopResponse);
                tpu.a aVar4 = tpu.Companion;
                tpu.a.b(aVar4, MtopAdapter.TAG, "mtop onSuccess, " + MtopAdapter.b(MtopAdapter.this, j5oVar.a(), h.dataParams, e.b()), null, 4, null);
                JSONObject originFastJsonObject = mtopResponse.getOriginFastJsonObject();
                if (originFastJsonObject == null) {
                    try {
                        byte[] bytedata = mtopResponse.getBytedata();
                        ckf.f(bytedata, "mtopResponse.bytedata");
                        originFastJsonObject = JSON.parseObject(new String(bytedata, uj3.UTF_8));
                    } catch (Exception e2) {
                        tpu.Companion.a(MtopAdapter.TAG, "mtop onSuccess, parse data error ", e2);
                    }
                }
                u1a u1aVar2 = u1aVar;
                ckf.f(originFastJsonObject, "data");
                u1aVar2.invoke(originFastJsonObject, e);
                q8u.Companion.c();
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                ckf.g(mtopResponse, "mtopResponse");
                q8u.a aVar3 = q8u.Companion;
                aVar3.a("mtop request fail " + j);
                j7j e = MtopAdapter.e(MtopAdapter.this, mtopResponse);
                tpu.a aVar4 = tpu.Companion;
                tpu.a.b(aVar4, MtopAdapter.TAG, "mtop onSystemError " + (mtopResponse.getRetCode() + "::" + mtopResponse.getRetMsg()) + MtopAdapter.b(MtopAdapter.this, j5oVar.a(), h.dataParams, e.b()), null, 4, null);
                w1a w1aVar2 = w1aVar;
                String retCode = mtopResponse.getRetCode();
                ckf.f(retCode, "mtopResponse.retCode");
                String retMsg = mtopResponse.getRetMsg();
                ckf.f(retMsg, "mtopResponse.retMsg");
                w1aVar2.invoke(retCode, retMsg, e);
                aVar3.c();
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteParserListener
            public void parseResponse(MtopResponse mtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("12969fa0", new Object[]{this, mtopResponse});
                } else {
                    ckf.g(mtopResponse, "mtopResponse");
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                boolean z2 = true;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                ckf.g(mtopResponse, "mtopResponse");
                q8u.a aVar3 = q8u.Companion;
                aVar3.a("mtop request fail " + j);
                j7j e = MtopAdapter.e(MtopAdapter.this, mtopResponse);
                tpu.a aVar4 = tpu.Companion;
                StringBuilder sb = new StringBuilder("mtop onError ");
                sb.append(mtopResponse.getRetCode() + "::" + mtopResponse.getRetMsg());
                MtopAdapter mtopAdapter = MtopAdapter.this;
                String a2 = j5oVar.a();
                Map<String, String> map = h.dataParams;
                if (e == null || !e.b()) {
                    z2 = false;
                }
                sb.append(MtopAdapter.b(mtopAdapter, a2, map, z2));
                tpu.a.b(aVar4, MtopAdapter.TAG, sb.toString(), null, 4, null);
                w1a w1aVar2 = w1aVar;
                String retCode = mtopResponse.getRetCode();
                ckf.f(retCode, "mtopResponse.retCode");
                String retMsg = mtopResponse.getRetMsg();
                ckf.f(retMsg, "mtopResponse.retMsg");
                w1aVar2.invoke(retCode, retMsg, e);
                aVar3.c();
            }
        });
        if (j5oVar.i()) {
            g.prefetchComparator((MtopPrefetch.IPrefetchComparator) new c());
            g.prefetch(j5oVar.j(), (MtopPrefetch.IPrefetchCallback) new d(bVar));
        }
        g.startRequest();
        aVar.c();
    }
}
