package com.taobao.android.detail.ttdetail.widget.webview.plugin;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.jov;
import tb.kpw;
import tb.t2o;
import tb.tgh;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class OpenWindowPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PLUGIN_NAME = "DetailBase";

    static {
        t2o.a(912263161);
    }

    public static /* synthetic */ Object ipc$super(OpenWindowPlugin openWindowPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/webview/plugin/OpenWindowPlugin");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("openWindow".equals(str)) {
            return openWindow(str2);
        }
        return false;
    }

    private boolean openWindow(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9756c9ef", new Object[]{this, str})).booleanValue();
        }
        try {
            String str2 = (String) ((Map) JSON.parseObject(str, Map.class)).get("url");
            if (TextUtils.isEmpty(str2)) {
                return false;
            }
            tgh.b("Page_detail", "open window");
            if (this.mContext != null) {
                tgh.b("Page_detail", "open window onSuccess");
                jov.k(this.mContext, str2);
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
