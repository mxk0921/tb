package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.zcache.ResourceResponse;
import com.taobao.zcache.model.ZCacheResourceResponse;
import java.io.ByteArrayInputStream;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class lpx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ZCacheResourceResponse zCacheResourceResponse = null;

    static {
        t2o.a(989856360);
    }

    public ZCacheResourceResponse wrapZCacheResourceResponse(ResourceResponse resourceResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ZCacheResourceResponse) ipChange.ipc$dispatch("fb919b40", new Object[]{this, resourceResponse});
        }
        ZCacheResourceResponse zCacheResourceResponse = new ZCacheResourceResponse();
        this.zCacheResourceResponse = zCacheResourceResponse;
        if (resourceResponse == null) {
            zCacheResourceResponse.isSuccess = false;
            zCacheResourceResponse.status = 0;
            zCacheResourceResponse.zcacheInfo = ZCacheResourceResponse.ZCACHE_NO_RESPONSE;
        } else {
            zCacheResourceResponse.headers = resourceResponse.getHeader();
            Map<String, String> map = this.zCacheResourceResponse.headers;
            if (map == null || !map.containsKey("X-ZCache-Info")) {
                this.zCacheResourceResponse.zcacheInfo = ZCacheResourceResponse.ZCACHE_NO_HEADER;
            } else {
                ZCacheResourceResponse zCacheResourceResponse2 = this.zCacheResourceResponse;
                zCacheResourceResponse2.zcacheInfo = zCacheResourceResponse2.headers.get("X-ZCache-Info");
            }
            if (resourceResponse.getError() != null || resourceResponse.getData() == null) {
                ZCacheResourceResponse zCacheResourceResponse3 = this.zCacheResourceResponse;
                zCacheResourceResponse3.isSuccess = false;
                zCacheResourceResponse3.status = 1;
            } else {
                this.zCacheResourceResponse.inputStream = new ByteArrayInputStream(resourceResponse.getData());
                ZCacheResourceResponse zCacheResourceResponse4 = this.zCacheResourceResponse;
                zCacheResourceResponse4.isSuccess = true;
                zCacheResourceResponse4.status = 2;
            }
        }
        return this.zCacheResourceResponse;
    }
}
