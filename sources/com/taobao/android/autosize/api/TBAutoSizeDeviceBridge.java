package com.taobao.android.autosize.api;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.tao.log.TLog;
import tb.kpw;
import tb.nsw;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TBAutoSizeDeviceBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String IS_FOLDER_DEVICE_ACTION = "isFolderDevice";
    private static String TAG = "TBAutoSizeDeviceBridge";

    public static /* synthetic */ Object ipc$super(TBAutoSizeDeviceBridge tBAutoSizeDeviceBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/autosize/api/TBAutoSizeDeviceBridge");
    }

    private void isFolderDevice(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c54c487c", new Object[]{this, str, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        try {
            IWVWebView webview = wVCallBackContext.getWebview();
            if (webview == null) {
                nswVar.b("msg", "error: webview is empty!");
                wVCallBackContext.error(nswVar);
                return;
            }
            nswVar.a("isFolder", Boolean.valueOf(TBDeviceUtils.p(webview.getContext())));
            wVCallBackContext.success(nswVar);
        } catch (Throwable th) {
            TLog.loge(TAG, "isFolderDevice: with exception ", th);
            nswVar.b("msg", "error: with exception " + th);
            wVCallBackContext.error(nswVar);
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!TextUtils.equals(str, IS_FOLDER_DEVICE_ACTION)) {
            return false;
        }
        isFolderDevice(str2, wVCallBackContext);
        return true;
    }
}
