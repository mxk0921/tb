package com.taobao.linkmanager.afc.request;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.utils.AfcUtils;
import java.util.Map;
import mtopsdk.mtop.domain.MtopRequest;
import tb.i6j;
import tb.t2o;
import tb.vp9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class TBLinkRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ARRIVE_DATA_API = "mtop.taobao.afc.arrivedata.report";
    public static final String LOGIN_REPORT = "mtop.taobao.growth.afc.linkInfo.reportLogin";
    public static final String REDUCTION_LOGIN_API = "mtop.taobao.afc.reductionAndLogin";
    public static final String SMART_LINK_API = "mtop.taobao.baichuan.intelligent.call.query";
    public static final String VERSION = "1.0";
    private static TBLinkRequest instance;

    static {
        t2o.a(744489027);
    }

    public static synchronized TBLinkRequest getInstance() {
        synchronized (TBLinkRequest.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBLinkRequest) ipChange.ipc$dispatch("db96300c", new Object[0]);
            }
            TBLinkRequest tBLinkRequest = instance;
            if (tBLinkRequest != null) {
                return tBLinkRequest;
            }
            try {
                int i = MtopRequest.f15411a;
                instance = new TBMtopRequest();
            } catch (ClassNotFoundException unused) {
            }
            vp9.a("linkx", "TBRequest === getInstance === 生成TBRequest实例");
            return instance;
        }
    }

    private static final String getRequestId(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("71169801", new Object[]{str, new Long(j)});
        }
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append("&&");
        sb.append(j);
        sb.append("&&_$#%151Safe");
        return AfcUtils.l(sb.toString());
    }

    public void addCheckParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4071db1", new Object[]{this, map});
            return;
        }
        String str = map.get("appKey");
        if (str == null) {
            str = map.get("appkey");
        }
        long currentTimeMillis = System.currentTimeMillis();
        map.put("t", String.valueOf(currentTimeMillis));
        map.put("requestId", getRequestId(str, currentTimeMillis));
    }

    public abstract void sendRequest(String str, String str2, Map<String, String> map, boolean z, i6j i6jVar);
}
