package com.etao.feimagesearch.mnn;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.LazyThreadSafetyMode;
import tb.a07;
import tb.agh;
import tb.caa;
import tb.ckf;
import tb.eno;
import tb.njg;
import tb.t2o;
import tb.wsq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class PltMnnBucketManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BUCKET_SEPARATOR = ",";
    public static final a Companion = new a(null);
    public static final njg<PltMnnBucketManager> b = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, PltMnnBucketManager$Companion$instance$2.INSTANCE);

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, String> f4774a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481297018);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final PltMnnBucketManager a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PltMnnBucketManager) ipChange.ipc$dispatch("1a95c416", new Object[]{this});
            }
            return (PltMnnBucketManager) PltMnnBucketManager.a().getValue();
        }

        public a() {
        }
    }

    static {
        t2o.a(481297017);
    }

    public /* synthetic */ PltMnnBucketManager(a07 a07Var) {
        this();
    }

    public static final /* synthetic */ njg a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("59beb729", new Object[0]);
        }
        return b;
    }

    public final String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4bb7ce3f", new Object[]{this, str, str2});
        }
        ckf.g(str, BaseMnnRunUnit.KEY_TASK_NAME);
        ckf.g(str2, "cid");
        return str + '_' + str2;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("278d14e2", new Object[]{this});
        }
        try {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> entry : this.f4774a.entrySet()) {
                ckf.f(entry, "iterator.next()");
                Map.Entry<String, String> entry2 = entry;
                sb.append(entry2.getKey());
                sb.append("_");
                sb.append(entry2.getValue());
                sb.append(",");
            }
            String sb2 = sb.toString();
            ckf.f(sb2, "stringBuilder.toString()");
            String s0 = wsq.s0(sb2, ",");
            return s0.length() > 1000 ? "" : s0;
        } catch (Exception unused) {
            return "";
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            e();
        }
    }

    public final void e() {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2572ca7a", new Object[]{this});
            return;
        }
        try {
            String d = eno.d(caa.c(), "plt_mnn_bucket_id_v2", "");
            if (!TextUtils.isEmpty(d) && (parseObject = JSON.parseObject(d)) != null) {
                for (Map.Entry<String, Object> entry : parseObject.entrySet()) {
                    if (entry.getKey() != null && (entry.getValue() instanceof String)) {
                        String key = entry.getKey();
                        if (key != null) {
                            String str = key;
                            Object value = entry.getValue();
                            if (value != null) {
                                this.f4774a.put(str, (String) value);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1b13de4", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, BaseMnnRunUnit.KEY_TASK_NAME);
        ckf.g(str2, "cid");
        if (!ckf.b(str2, this.f4774a.get(str))) {
            agh.h("PltMnnBucketManager", "update task " + str + ", newCid " + str2 + ", oldValue " + ((Object) this.f4774a.get(str)) + ' ');
            this.f4774a.put(str, str2);
            String jSONString = JSON.toJSONString(this.f4774a);
            eno.f(caa.c(), "plt_mnn_bucket_id_v2", jSONString);
            agh.h("PltMnnBucketManager", ckf.p("update ", jSONString));
            return;
        }
        agh.h("PltMnnBucketManager", "equal task " + str + ", newCid " + str2 + ", oldValue " + ((Object) this.f4774a.get(str)));
    }

    public PltMnnBucketManager() {
        this.f4774a = new ConcurrentHashMap<>();
    }
}
