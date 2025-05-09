package tb;

import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.android.icart.core.data.request.SendQueryNextPageRequest;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class yap {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199338);
    }

    public static jod a(zxb zxbVar, RequestConfig.RequestType requestType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jod) ipChange.ipc$dispatch("6cd2653b", new Object[]{zxbVar, requestType});
        }
        if (requestType == RequestConfig.RequestType.LOAD_CACHE_DATA) {
            return new jap(zxbVar);
        }
        if (requestType == RequestConfig.RequestType.QUERY_CART_PAGE) {
            return new xap(zxbVar);
        }
        if (requestType == RequestConfig.RequestType.QUERY_CART_NEXT_PAGE) {
            return new SendQueryNextPageRequest(zxbVar);
        }
        if (requestType == RequestConfig.RequestType.UPDATE) {
            return new bbp(zxbVar);
        }
        if (requestType == RequestConfig.RequestType.UPDATE_STRUCTURE) {
            return new abp(zxbVar);
        }
        return null;
    }
}
