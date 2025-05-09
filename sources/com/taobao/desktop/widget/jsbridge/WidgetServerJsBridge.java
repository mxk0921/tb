package com.taobao.desktop.widget.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cdx;
import tb.hgh;
import tb.kpw;
import tb.ncx;
import tb.nsw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WidgetServerJsBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLASSNAME_WIDGET_CLIENT_PASS = "ClientPaasBridge";

    static {
        t2o.a(437256236);
    }

    public static /* synthetic */ Object ipc$super(WidgetServerJsBridge widgetServerJsBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/desktop/widget/jsbridge/WidgetServerJsBridge");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            Object b = ncx.b(this.mContext, str, str2);
            nsw nswVar = new nsw();
            nswVar.a("result", b);
            wVCallBackContext.success(nswVar);
            return true;
        } catch (Exception e) {
            hgh.d("WidgetServerJsBridge === execute === 桌面组件jsBridge调用异常：" + e.getMessage());
            cdx.b("widget_catch_error", "WidgetServerJsBridge", e.getMessage(), null);
            return false;
        }
    }
}
