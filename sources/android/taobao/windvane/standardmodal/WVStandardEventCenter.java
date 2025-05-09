package android.taobao.windvane.standardmodal;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cpr;
import tb.kpw;
import tb.lqw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVStandardEventCenter extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989856393);
    }

    public static /* synthetic */ Object ipc$super(WVStandardEventCenter wVStandardEventCenter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/standardmodal/WVStandardEventCenter");
    }

    public static void postNotificationToJS(IWVWebView iWVWebView, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3a76d0e", new Object[]{iWVWebView, str, str2});
        } else {
            WVCallBackContext.fireEvent(iWVWebView, str, str2);
        }
    }

    public void postNotificationToNative(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65806c4b", new Object[]{this, str, wVCallBackContext});
            return;
        }
        lqw.d().g(cpr.MSG_TYPE_MEDIADATA, str, wVCallBackContext);
        wVCallBackContext.success();
    }

    public static void postNotificationToJS(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6551186a", new Object[]{str, str2});
        } else {
            lqw.d().g(cpr.MSG_TYPE_SWITCH_OFFICIAL, str, str2);
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"postNotificationToNative".equals(str)) {
            return false;
        }
        postNotificationToNative(str2, wVCallBackContext);
        return true;
    }
}
