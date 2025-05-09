package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetRequestParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import java.util.Map;
import tb.qjd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fqm implements qjd.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809731);
        t2o.a(729809985);
    }

    @Override // tb.qjd.b
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3987b210", new Object[]{this, str, str2, str3});
        }
    }

    @Override // tb.qjd.b
    public void b(String str, String str2, AwesomeGetData awesomeGetData, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d586a494", new Object[]{this, str, str2, awesomeGetData, new Boolean(z)});
            return;
        }
        AwesomeGetContainerInnerData e = e(str, awesomeGetData);
        if (e == null) {
            uqa.b("buyAfterRecommend", "AfterBuyPersistenceData", "base == null");
        } else {
            f(str, e);
        }
    }

    @Override // tb.qjd.b
    public void d(String str, AwesomeGetRequestParams awesomeGetRequestParams, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c78df556", new Object[]{this, str, awesomeGetRequestParams, str2, new Boolean(z)});
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData] */
    public final AwesomeGetContainerInnerData e(String str, AwesomeGetData awesomeGetData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerInnerData) ipChange.ipc$dispatch("57949b77", new Object[]{this, str, awesomeGetData});
        }
        if (str == null) {
            uqa.b("buyAfterRecommend", "AfterBuyPersistenceData", "containerId == null");
            return null;
        }
        Map<String, AwesomeGetContainerData> containers = awesomeGetData.getContainers();
        if (containers == null || containers.isEmpty()) {
            uqa.b("buyAfterRecommend", "AfterBuyPersistenceData", "containerDataMap == null");
            return null;
        }
        AwesomeGetContainerData awesomeGetContainerData = containers.get(str);
        if (awesomeGetContainerData != null) {
            return awesomeGetContainerData.getBase();
        }
        uqa.b("buyAfterRecommend", "AfterBuyPersistenceData", "awesomeGetContainerData == null");
        return null;
    }

    public final void f(String str, AwesomeGetContainerInnerData awesomeGetContainerInnerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be4ee061", new Object[]{this, str, awesomeGetContainerInnerData});
            return;
        }
        JSONObject ext = awesomeGetContainerInnerData.getExt();
        if (ext == null) {
            uqa.b("buyAfterRecommend", "AfterBuyPersistenceData", "ext == null");
            return;
        }
        JSONObject jSONObject = ext.getJSONObject(vls.OPTIMIZATION_CONFIG);
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        dqm.c(str, jSONObject);
    }
}
