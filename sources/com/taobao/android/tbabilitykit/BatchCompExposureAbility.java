package com.taobao.android.tbabilitykit;

import android.text.TextUtils;
import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import tb.a07;
import tb.ckf;
import tb.eji;
import tb.hdb;
import tb.jpu;
import tb.k8;
import tb.kdb;
import tb.njg;
import tb.t2o;
import tb.vq;
import tb.ye2;
import tb.yz3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class BatchCompExposureAbility implements hdb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_BATCH_COMP_EXPOSURE = "batchCompExposure";
    public static final String BATCH_COMP_EXPOSURE = "7860200037355951613";
    public static final String ERROR_API = "errorApi";
    public static final String ERROR_PARAM = "errorParams";
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static final njg f9534a = kotlin.a.a(LazyThreadSafetyMode.NONE, BatchCompExposureAbility$Companion$exposureScheduler$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(786432041);
        }

        public a() {
        }

        public final eji a() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("2e88ef8e", new Object[]{this});
            } else {
                value = BatchCompExposureAbility.a().getValue();
            }
            return (eji) value;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f9535a;
        public final /* synthetic */ Map b;

        public b(List list, Map map) {
            this.f9535a = list;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (Object obj : this.f9535a) {
                if (!(obj instanceof JSONObject)) {
                    obj = null;
                }
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject != null) {
                    String string = jSONObject.getString("pageName");
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("args");
                    if (jSONObject3 == null) {
                        jSONObject3 = new JSONObject();
                        jSONObject2.put((JSONObject) "args", (String) jSONObject3);
                    }
                    if (!this.b.isEmpty()) {
                        for (Map.Entry entry : this.b.entrySet()) {
                            if (!TextUtils.isEmpty((CharSequence) entry.getKey()) && entry.getValue() != null && !jSONObject3.containsKey(entry.getKey())) {
                                jSONObject3.put((JSONObject) entry.getKey(), (Object) String.valueOf(entry.getValue()));
                            }
                        }
                    }
                    ye2.f(2201, string, jSONObject2);
                }
            }
        }
    }

    static {
        t2o.a(786432040);
        t2o.a(144703491);
    }

    public static final /* synthetic */ njg a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("d681e069", new Object[0]);
        }
        return f9534a;
    }

    @Override // tb.hdb
    public ExecuteResult execute(String str, kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b2cd7d0b", new Object[]{this, str, kdbVar, map, vqVar});
        }
        ckf.g(str, "api");
        ckf.g(kdbVar, "context");
        ckf.g(map, "params");
        ckf.g(vqVar, "callback");
        if (!ckf.b(str, API_BATCH_COMP_EXPOSURE)) {
            return new ErrorResult(ERROR_API, "The ability api name is error, please check it.", (Map) null, 4, (a07) null);
        }
        Map<String, Object> r = MegaUtils.r(map, "engineStorageExposureIdentify");
        if (r == null) {
            r = kotlin.collections.a.h();
        }
        Map<String, Object> r2 = MegaUtils.r(map, "commonArgs");
        if (r2 == null) {
            r2 = kotlin.collections.a.h();
        }
        List<Object> n = MegaUtils.n(map, "pairs");
        if (n == null) {
            n = yz3.i();
        }
        if (r.isEmpty() || n.isEmpty()) {
            return new ErrorResult(ERROR_PARAM, "The params is miss, please check it.", (Map) null, 4, (a07) null);
        }
        Object userContext = kdbVar.getUserContext();
        if (userContext instanceof k8) {
            Object obj = r.get("key");
            if (!(obj instanceof String)) {
                obj = null;
            }
            String str2 = (String) obj;
            if (str2 == null) {
                str2 = "";
            }
            if (!TextUtils.isEmpty(str2)) {
                k8 k8Var = (k8) userContext;
                k8Var.a().a(b(str2, r.get("value")), k8Var, null);
            }
        }
        eji.j(Companion.a(), new b(n, r2), 0L, null, 4, null);
        return new FinishResult(null, null, 3, null);
    }

    public final JSONObject b(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7d0bf992", new Object[]{this, str, obj});
        }
        return new JSONObject(kotlin.collections.a.k(jpu.a("type", "engineStorageSet"), jpu.a("params", kotlin.collections.a.k(jpu.a("key", str), jpu.a("value", obj)))));
    }
}
