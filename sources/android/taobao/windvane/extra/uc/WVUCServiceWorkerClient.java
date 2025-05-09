package android.taobao.windvane.extra.uc;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.ServiceWorkerClient;
import com.uc.webview.export.WebResourceRequest;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVUCServiceWorkerClient extends ServiceWorkerClient {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVUCServiceWorkerClient";

    static {
        t2o.a(989856107);
    }

    public static /* synthetic */ Object ipc$super(WVUCServiceWorkerClient wVUCServiceWorkerClient, String str, Object... objArr) {
        if (str.hashCode() == -2035867177) {
            return super.shouldInterceptRequest((WebResourceRequest) objArr[0]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/extra/uc/WVUCServiceWorkerClient");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011f  */
    @Override // com.uc.webview.export.ServiceWorkerClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.uc.webview.export.WebResourceResponse shouldInterceptRequest(com.uc.webview.export.WebResourceRequest r12) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.extra.uc.WVUCServiceWorkerClient.shouldInterceptRequest(com.uc.webview.export.WebResourceRequest):com.uc.webview.export.WebResourceResponse");
    }
}
