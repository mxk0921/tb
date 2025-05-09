package android.taobao.windvane.jsbridge.api;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.api.WVCamera;
import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Context mContext;
    public IWVWebView mWebView;

    static {
        t2o.a(989856308);
    }

    public abstract void doUpload(WVCamera.g gVar, WVCallBackContext wVCallBackContext);

    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
            return;
        }
        this.mContext = context;
        this.mWebView = iWVWebView;
    }

    public void resetMultiPictureResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c33741b8", new Object[]{this});
        }
    }
}
