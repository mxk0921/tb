package android.taobao.windvane.jsbridge.api;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kpw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVUI extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989856301);
    }

    public static /* synthetic */ Object ipc$super(WVUI wvui, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/jsbridge/api/WVUI");
    }

    public final void hideLoading(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33353068", new Object[]{this, str, wVCallBackContext});
            return;
        }
        this.mWebView.hideLoadingView();
        wVCallBackContext.success();
    }

    public final void showLoading(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d2a580d", new Object[]{this, str, wVCallBackContext});
            return;
        }
        this.mWebView.showLoadingView();
        wVCallBackContext.success();
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("showLoadingBox".equals(str)) {
            showLoading(str2, wVCallBackContext);
            return true;
        } else if (!"hideLoadingBox".equals(str)) {
            return false;
        } else {
            hideLoading(str2, wVCallBackContext);
            return true;
        }
    }
}
