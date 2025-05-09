package com.taobao.tao.recommend3.gateway.prefetch.tschedule;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tscheduleprotocol.CustomScheduleProtocol;
import com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback;
import java.util.HashMap;
import java.util.Map;
import tb.cel;
import tb.jh0;
import tb.phd;
import tb.t2o;
import tb.uqa;
import tb.xvl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TSRecmdReqPrefetch implements CustomScheduleProtocol {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String COMMON = "common";
    private static final String ORDER_LIST = "orderlist";
    private static final String PAY_SUCCESS = "paysuccess";
    public static final String PREFETCH_PARAMS = "prefetchParams";
    public static final String PREFETCH_PARAMS_IGNORE = "ignores";
    public static final String PREFETCH_PARAMS_PREFETCH = "prefetch";
    public static final String PREFETCH_PARAMS_TIMEOUT = "timeout";
    private static final String SCENE = "scene";
    private static final String TAG = "TSRecmdReqPrefetch";
    private final Map<String, phd> mPrefetchMap;

    static {
        t2o.a(729809718);
    }

    public TSRecmdReqPrefetch() {
        HashMap hashMap = new HashMap();
        this.mPrefetchMap = hashMap;
        hashMap.put("orderlist", new cel());
        hashMap.put("paysuccess", new xvl());
        hashMap.put("common", new jh0());
    }

    @Override // com.taobao.android.tscheduleprotocol.CustomScheduleProtocol
    public void preload(Context context, String str, ScheduleProtocolCallback scheduleProtocolCallback, JSONObject jSONObject, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b43e4cd", new Object[]{this, context, str, scheduleProtocolCallback, jSONObject, objArr});
        } else if (jSONObject == null) {
            uqa.b("recmdPrefetch", TAG, "jsonObject == null");
        } else {
            phd phdVar = this.mPrefetchMap.get(jSONObject.getString("scene"));
            if (phdVar == null) {
                uqa.b("recmdPrefetch", TAG, "recommendPrefetch == null");
                return;
            }
            uqa.b("recmdPrefetch", TAG, "nav的链接是： " + str);
            phdVar.a(str, jSONObject);
        }
    }
}
