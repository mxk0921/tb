package com.taobao.infoflow.taobao.subservice.base.jsbridgeservice.impl.bridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.taobao.subservice.base.jsbridgeservice.impl.bridge.model.JsActionModel;
import tb.fve;
import tb.kpw;
import tb.lvf;
import tb.t2o;
import tb.xve;
import tb.zuf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class InfoFlowWVPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "InfoFlowWVPlugin";

    static {
        t2o.a(491782236);
    }

    public static /* synthetic */ Object ipc$super(InfoFlowWVPlugin infoFlowWVPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/base/jsbridgeservice/impl/bridge/InfoFlowWVPlugin");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        JsActionModel a2 = zuf.a(str, str2);
        if (a2 != null && a2.isValid()) {
            return xve.b(a2, new lvf(wVCallBackContext));
        }
        fve.e("InfoFlowWVPlugin", "jsActionModel is null。 不符合协议约定，见类注释");
        wVCallBackContext.error("不符合协议约定，请和客户端同学确认协议");
        return false;
    }
}
