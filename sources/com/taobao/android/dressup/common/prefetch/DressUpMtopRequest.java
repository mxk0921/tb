package com.taobao.android.dressup.common.prefetch;

import android.net.Uri;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.android.dressup.base.IDressUpMtopRequest;
import com.taobao.android.turbo.adapter.RequestType;
import com.taobao.tao.recommend4.manager.b;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.bwc;
import tb.ckf;
import tb.j5o;
import tb.mnv;
import tb.nhd;
import tb.t2o;
import tb.tqm;
import tb.ud0;
import tb.yj4;
import tb.yz3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0015\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/taobao/android/dressup/common/prefetch/DressUpMtopRequest;", "Lcom/taobao/android/dressup/base/IDressUpMtopRequest;", "<init>", "()V", "", "url", "Ltb/xhv;", "requestDetailMtop", "(Ljava/lang/String;)V", "Ltb/nhd;", tqm.CONFIG_RECOMMEND_MANAGER, "", "isPrefetch", "Lcom/alibaba/fastjson/JSONObject;", "hostParams", b.KEY_IS_PULL_REFRESH, "requestFeedRecommendData", "(Ltb/nhd;ZLcom/alibaba/fastjson/JSONObject;Z)V", "", "", "query", "requestDetailRecommendData", "(Ltb/nhd;Ljava/util/Map;Z)V", "Companion", "a", "turboflow_dressup_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class DressUpMtopRequest implements IDressUpMtopRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(918552679);
        }

        public a() {
        }

        public final Map<String, String> a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("d0627935", new Object[]{this, map});
            }
            ckf.g(map, "query");
            List m = yz3.m(yj4.PARAM_UT_PARAMS, "url");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!m.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            HashMap hashMap = new HashMap();
            String str = (String) linkedHashMap.get("entityId");
            if (str == null) {
                str = "107177";
            }
            hashMap.put("entityId", str);
            String jSONString = JSON.toJSONString(linkedHashMap);
            ckf.f(jSONString, "JSONObject.toJSONString(urlParams)");
            hashMap.put("params", jSONString);
            return hashMap;
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3e2a386", new Object[]{this});
            }
            return "mtop.cogman.container.nologin";
        }

        public final RequestType c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RequestType) ipChange.ipc$dispatch("47f06c77", new Object[]{this});
            }
            return RequestType.GET;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(918552678);
        t2o.a(918552596);
    }

    @Override // com.taobao.android.dressup.base.IDressUpMtopRequest
    public void requestDetailRecommendData(nhd nhdVar, Map<String, ? extends Object> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c053082", new Object[]{this, nhdVar, map, new Boolean(z)});
            return;
        }
        ckf.g(nhdVar, tqm.CONFIG_RECOMMEND_MANAGER);
        ckf.g(map, "query");
        JSONObject jSONObject = new JSONObject();
        jSONObject.putAll(map);
        jSONObject.remove(yj4.PARAM_UT_PARAMS);
        jSONObject.remove("url");
        jSONObject.put((JSONObject) "channel", "content_detail_page");
        jSONObject.put((JSONObject) "scene", "outfit_trend");
        if (z) {
            nhdVar.c(jSONObject);
        } else {
            nhdVar.a(jSONObject);
        }
    }

    @Override // com.taobao.android.dressup.base.IDressUpMtopRequest
    public void requestFeedRecommendData(nhd nhdVar, boolean z, JSONObject jSONObject, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d8661d8", new Object[]{this, nhdVar, new Boolean(z), jSONObject, new Boolean(z2)});
            return;
        }
        ckf.g(nhdVar, tqm.CONFIG_RECOMMEND_MANAGER);
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put((JSONObject) HiAnalyticsConstant.HaKey.BI_KEY_APPID, (String) 47648);
        jSONObject.put((JSONObject) "isNeedSubSelectionData", (String) Boolean.TRUE);
        if (z) {
            nhdVar.c(jSONObject);
            return;
        }
        jSONObject.put((JSONObject) b.KEY_IS_PULL_REFRESH, (String) Boolean.valueOf(z2));
        nhdVar.a(jSONObject);
    }

    @Override // com.taobao.android.dressup.base.IDressUpMtopRequest
    public void requestDetailMtop(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("201f7e39", new Object[]{this, str});
            return;
        }
        ckf.g(str, "url");
        bwc e = ud0.Companion.e();
        a aVar = Companion;
        j5o.a aVar2 = new j5o.a(aVar.b());
        aVar2.i(0).b(aVar.a(mnv.Companion.e(Uri.parse(str)))).e(aVar.c()).d(true);
        e.a(aVar2.a(), DressUpMtopRequest$requestDetailMtop$1.INSTANCE, DressUpMtopRequest$requestDetailMtop$2.INSTANCE);
    }
}
