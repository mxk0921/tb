package android.taobao.windvane.extra.uc.prefetch;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.uc.webview.export.WebResourceResponse;
import com.uc.webview.export.WebView;
import tb.lcn;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ResourcePrefetch {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final ResourcePrefetch INSTANCE = new ResourcePrefetch();
    private static final String MODULE = "WindVane/Prefetch";

    static {
        t2o.a(989856174);
    }

    private ResourcePrefetch() {
    }

    public static ResourcePrefetch getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResourcePrefetch) ipChange.ipc$dispatch("a5819894", new Object[0]);
        }
        return INSTANCE;
    }

    public WebResourceResponse fetch(WebView webView, ResourceRequest resourceRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebResourceResponse) ipChange.ipc$dispatch("11905a01", new Object[]{this, webView, resourceRequest});
        }
        return null;
    }

    @Deprecated
    public void prefetch(ResourceRequest resourceRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4425d5c", new Object[]{this, resourceRequest});
        } else {
            lcn.f(RVLLevel.Warn, MODULE, "prefetch is deprecated");
        }
    }
}
