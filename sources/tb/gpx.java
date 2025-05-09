package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.zcache.Error;
import com.taobao.zcache.PackUpdateFinishedCallback;
import com.taobao.zcache.ResourceResponse;
import com.taobao.zcache.model.ZCacheResourceResponse;
import com.taobao.zcachecorewrapper.IZCacheCore;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class gpx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static gpx f20159a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements PackUpdateFinishedCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IZCacheCore.UpdateCallback f20160a;

        public a(gpx gpxVar, IZCacheCore.UpdateCallback updateCallback) {
            this.f20160a = updateCallback;
        }

        @Override // com.taobao.zcache.PackUpdateFinishedCallback
        public void finish(String str, Error error) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("abd8ffc9", new Object[]{this, str, error});
                return;
            }
            IZCacheCore.UpdateCallback updateCallback = this.f20160a;
            if (updateCallback != null) {
                updateCallback.finish(str, new com.taobao.zcachecorewrapper.model.Error(error));
            }
        }
    }

    static {
        t2o.a(996147230);
    }

    public static gpx d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gpx) ipChange.ipc$dispatch("7854a17c", new Object[0]);
        }
        if (f20159a == null) {
            synchronized (gpx.class) {
                try {
                    if (f20159a == null) {
                        f20159a = new gpx();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f20159a;
    }

    @Deprecated
    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8824a790", new Object[]{this, str, str2});
        }
        return yox.e(str, str2);
    }

    @Deprecated
    public ZCacheResourceResponse b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ZCacheResourceResponse) ipChange.ipc$dispatch("1e989a57", new Object[]{this, str});
        }
        return c(str, new HashMap());
    }

    @Deprecated
    public ZCacheResourceResponse c(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ZCacheResourceResponse) ipChange.ipc$dispatch("1c0148cc", new Object[]{this, str, map});
        }
        ResourceResponse h = yox.h(new y8o(str, map));
        ZCacheResourceResponse zCacheResourceResponse = new ZCacheResourceResponse();
        if (h == null) {
            zCacheResourceResponse.isSuccess = false;
            zCacheResourceResponse.status = 0;
            zCacheResourceResponse.zcacheInfo = ZCacheResourceResponse.ZCACHE_NO_RESPONSE;
        } else {
            Map<String, String> header = h.getHeader();
            zCacheResourceResponse.headers = header;
            if (header == null || !header.containsKey("X-ZCache-Info")) {
                zCacheResourceResponse.zcacheInfo = ZCacheResourceResponse.ZCACHE_NO_HEADER;
            } else {
                zCacheResourceResponse.zcacheInfo = zCacheResourceResponse.headers.get("X-ZCache-Info");
            }
            if (h.getError() == null) {
                zCacheResourceResponse.inputStream = new ByteArrayInputStream(h.getData());
                zCacheResourceResponse.isSuccess = true;
                zCacheResourceResponse.status = 2;
            } else {
                zCacheResourceResponse.isSuccess = false;
                zCacheResourceResponse.status = 1;
            }
        }
        return zCacheResourceResponse;
    }

    @Deprecated
    public boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3525c17", new Object[]{this, str})).booleanValue();
        }
        return yox.m(str);
    }

    @Deprecated
    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9528696", new Object[]{this, str});
        } else {
            yox.t(str, null);
        }
    }

    @Deprecated
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8098c98d", new Object[]{this});
        }
    }

    @Deprecated
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b6e4f73", new Object[]{this});
        } else {
            yox.z();
        }
    }

    @Deprecated
    public void i(String str, String str2, int i, IZCacheCore.UpdateCallback updateCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6aa5743", new Object[]{this, str, str2, new Integer(i), updateCallback});
        } else {
            yox.A(new ekl(str, str2), new a(this, updateCallback));
        }
    }
}
