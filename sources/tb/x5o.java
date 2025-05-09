package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.Map;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.intf.MtopPrefetch;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class x5o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(80740682);
    }

    public static MtopBusiness a(MtopRequest mtopRequest, AURANextRPCEndpoint aURANextRPCEndpoint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("ab9d9761", new Object[]{mtopRequest, aURANextRPCEndpoint});
        }
        MtopBusiness build = MtopBusiness.build(mtopRequest);
        c(build, aURANextRPCEndpoint);
        return build;
    }

    public static MtopRequest b(AURANextRPCEndpoint aURANextRPCEndpoint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("12a036a0", new Object[]{aURANextRPCEndpoint});
        }
        MtopRequest mtopRequest = new MtopRequest();
        String api = aURANextRPCEndpoint.getApi();
        String version = aURANextRPCEndpoint.getVersion();
        mtopRequest.setApiName(api);
        mtopRequest.setVersion(version);
        Map<String, String> dataParams = aURANextRPCEndpoint.getDataParams();
        if (dataParams != null) {
            mtopRequest.dataParams = dataParams;
            mtopRequest.setData(JSON.toJSONString(dataParams));
        }
        mtopRequest.setNeedEcode(aURANextRPCEndpoint.isNeedEncode());
        mtopRequest.setNeedSession(aURANextRPCEndpoint.isNeedSession());
        return mtopRequest;
    }

    public static void c(MtopBusiness mtopBusiness, AURANextRPCEndpoint aURANextRPCEndpoint) {
        MethodEnum methodEnum;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e798c298", new Object[]{mtopBusiness, aURANextRPCEndpoint});
            return;
        }
        if (aURANextRPCEndpoint.isPostMethod()) {
            methodEnum = MethodEnum.POST;
        } else {
            methodEnum = MethodEnum.GET;
        }
        mtopBusiness.reqMethod(methodEnum);
        if (aURANextRPCEndpoint.isNeedEncode()) {
            mtopBusiness.useWua();
        }
        int bizId = aURANextRPCEndpoint.getBizId();
        if (bizId != -1) {
            mtopBusiness.setBizId(bizId);
        }
        String unitStrategy = aURANextRPCEndpoint.getUnitStrategy();
        if (!TextUtils.isEmpty(unitStrategy)) {
            mtopBusiness.setUnitStrategy(unitStrategy);
        }
        String ttid = aURANextRPCEndpoint.getTtid();
        if (!TextUtils.isEmpty(ttid)) {
            mtopBusiness.ttid(ttid);
        }
        int timeout = aURANextRPCEndpoint.getTimeout();
        if (timeout > 0) {
            mtopBusiness.setConnectionTimeoutMilliSecond(timeout);
        }
        int socketTimeoutMilliSecond = aURANextRPCEndpoint.getSocketTimeoutMilliSecond();
        if (socketTimeoutMilliSecond > 0) {
            mtopBusiness.setSocketTimeoutMilliSecond(socketTimeoutMilliSecond);
        }
        String pageUrl = aURANextRPCEndpoint.getPageUrl();
        if (!TextUtils.isEmpty(pageUrl)) {
            mtopBusiness.setPageUrl(pageUrl);
        }
        Map<String, String> requestHeaders = aURANextRPCEndpoint.getRequestHeaders();
        if (requestHeaders != null) {
            mtopBusiness.headers(requestHeaders);
        }
        int retryTime = aURANextRPCEndpoint.getRetryTime();
        if (retryTime == 1 || retryTime == 0) {
            mtopBusiness.retryTime(retryTime);
        }
        String topic = aURANextRPCEndpoint.getTopic();
        if (!TextUtils.isEmpty(topic)) {
            mtopBusiness.setBizTopic(topic);
        }
        if (aURANextRPCEndpoint.getPrefetchMode() == 1) {
            mtopBusiness.prefetchMode(aURANextRPCEndpoint.getPrefetchMode());
        }
        MtopPrefetch.IPrefetchComparator prefetchComparator = aURANextRPCEndpoint.getPrefetchComparator();
        if (prefetchComparator != null) {
            mtopBusiness.prefetchComparator(prefetchComparator);
        }
        d(mtopBusiness, aURANextRPCEndpoint);
    }

    public static void d(MtopBusiness mtopBusiness, AURANextRPCEndpoint aURANextRPCEndpoint) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eac9c2a7", new Object[]{mtopBusiness, aURANextRPCEndpoint});
            return;
        }
        rbb g = ck.g();
        if (aURANextRPCEndpoint.useMainThread()) {
            str = "UI";
        } else {
            str = "非UI线程进行网络请求";
        }
        g.e(str, ck.b.b().i("AURA/performance").a());
        if (!aURANextRPCEndpoint.useMainThread()) {
            mtopBusiness.handler(dn.b());
        }
    }
}
