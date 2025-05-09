package android.taobao.windvane.extra.uc;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.idst.nls.restapi.HttpRequest;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.uc.webview.export.WebView;
import com.uc.webview.export.extension.INetworkDelegate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.lcn;
import tb.t2o;
import tb.v7t;
import tb.vpw;
import tb.x74;
import tb.y71;
import tb.yvj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVNetworkDelegate extends INetworkDelegate {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WindVane/Image";
    private static final AtomicBoolean sHasDowngraded = new AtomicBoolean(false);

    static {
        t2o.a(989856094);
    }

    public WVNetworkDelegate(Context context) {
    }

    public static /* synthetic */ Object ipc$super(WVNetworkDelegate wVNetworkDelegate, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/extra/uc/WVNetworkDelegate");
    }

    @Override // com.uc.webview.export.extension.INetworkDelegate
    public void onBeforeSendRequest(WebView webView, INetworkDelegate.IRequestData iRequestData) {
        String str;
        String str2;
        String key;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("288e18cf", new Object[]{this, webView, iRequestData});
        } else if (iRequestData != null) {
            String url = iRequestData.getUrl();
            if (!x74.m(url) || !shouldModifyAcceptHeader(url)) {
                return;
            }
            if (!ExtImgDecoder.getInstance().canExtImgDecoder()) {
                lcn.f(RVLLevel.Error, TAG, "image decoder is not ready.");
                return;
            }
            Map<String, String> headers = iRequestData.getHeaders();
            if (yvj.a(headers)) {
                lcn.f(RVLLevel.Error, TAG, "main document request, skip adding accept: " + url);
                return;
            }
            boolean z = vpw.commonConfig.r1;
            boolean useAlphaChannelDecoder = ExtImgDecoder.getInstance().useAlphaChannelDecoder();
            if (z || useAlphaChannelDecoder) {
                v7t.d(TAG, "add heic accept " + z + " " + useAlphaChannelDecoder + " " + url);
                if (headers == null) {
                    headers = new HashMap<>();
                }
                Iterator<Map.Entry<String, String>> it = headers.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        str2 = null;
                        break;
                    }
                    Map.Entry<String, String> next = it.next();
                    if (next != null && (key = next.getKey()) != null && key.equalsIgnoreCase("accept")) {
                        str = next.getValue();
                        str2 = next.getKey();
                        break;
                    }
                }
                if (TextUtils.isEmpty(str2)) {
                    str2 = HttpRequest.HEADER_ACCEPT;
                }
                if (z) {
                    if (TextUtils.isEmpty(str)) {
                        str = "image/heic";
                    } else {
                        str = "image/heic," + str;
                    }
                }
                if (useAlphaChannelDecoder) {
                    if (TextUtils.isEmpty(str)) {
                        str = "image/heia";
                    } else {
                        str = "image/heia," + str;
                    }
                }
                iRequestData.setHeader(str2, str);
            }
        }
    }

    private static boolean shouldModifyAcceptHeader(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f122c3b7", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        if (vpw.commonConfig.j3 && ExtImgDecoder.getDecodeErrorCount() > 5) {
            if (sHasDowngraded.compareAndSet(false, true)) {
                v7t.d(TAG, "downgrade image decoder");
                y71.commitSuccess(y71.MONITOR_POINT_WV_CONSECUTIVE_DECODE_ERROR, "");
            }
            return false;
        } else if (str.contains("/O1CN")) {
            return true;
        } else {
            try {
                Uri parse = Uri.parse(str);
                if (parse != null) {
                    String host = parse.getHost();
                    if (!TextUtils.equals("gw.alicdn.com", host)) {
                        if (TextUtils.equals("img.alicdn.com", host)) {
                        }
                    }
                    return true;
                }
            } catch (Exception unused) {
            }
            return false;
        }
    }
}
