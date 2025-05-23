package com.taobao.desktop.widget.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bkb;
import tb.cdx;
import tb.hgh;
import tb.kpw;
import tb.ncx;
import tb.nsw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WidgetServiceJsBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLASSNAME_WIDGET_SERVICE = "TBWidgetServiceBridge";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements bkb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f10326a;

        public a(WidgetServiceJsBridge widgetServiceJsBridge, WVCallBackContext wVCallBackContext) {
            this.f10326a = wVCallBackContext;
        }

        @Override // tb.bkb
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e344e027", new Object[]{this, str});
                return;
            }
            nsw nswVar = new nsw();
            nswVar.b("result", str);
            WVCallBackContext wVCallBackContext = this.f10326a;
            if (wVCallBackContext != null) {
                wVCallBackContext.success(nswVar);
            }
            hgh.d("TBWidgetServiceBridge execute success result：" + str);
        }
    }

    static {
        t2o.a(437256241);
    }

    public static /* synthetic */ Object ipc$super(WidgetServiceJsBridge widgetServiceJsBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/desktop/widget/jsbridge/WidgetServiceJsBridge");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            ncx.a(this.mContext, str, str2, new a(this, wVCallBackContext));
            return true;
        } catch (Exception e) {
            hgh.d("WidgetServiceJsBridge === execute === 桌面组件jsBridge调用异常：" + e.getMessage());
            cdx.b("widget_catch_error", "WidgetServiceJsBridge", e.getMessage(), null);
            return false;
        }
    }
}
