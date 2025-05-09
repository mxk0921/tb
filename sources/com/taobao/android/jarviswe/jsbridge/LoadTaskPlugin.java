package com.taobao.android.jarviswe.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kpw;
import tb.t2o;
import tb.v24;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LoadTaskPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_NAME = "TBJWLoadTaskBridge";

    static {
        t2o.a(1034944530);
    }

    public static /* synthetic */ Object ipc$super(LoadTaskPlugin loadTaskPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/jarviswe/jsbridge/LoadTaskPlugin");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("taskInfos".equals(str)) {
            v24.e().i(str2, wVCallBackContext);
        } else if ("getOrange".equals(str)) {
            v24.e().g(str2, wVCallBackContext);
        } else if ("gzipDecode".equals(str)) {
            v24.e().j(str2, wVCallBackContext);
        } else if ("getSelectSceneTask".equals(str)) {
            v24.e().h(str2, wVCallBackContext);
        } else if ("setSelectSceneTask".equals(str)) {
            v24.e().l(str2, wVCallBackContext);
        } else if ("getBetaSwitchEnabled".equals(str)) {
            v24.e().c(str2, wVCallBackContext);
        } else if ("betaSwitch".equals(str)) {
            v24.e().a(str2, wVCallBackContext);
        } else if ("getFeatureUploadAllSwitch".equals(str)) {
            v24.e().d(str2, wVCallBackContext);
        } else if (!"setFeatureUploadAllSwitch".equals(str)) {
            return false;
        } else {
            v24.e().k(str2, wVCallBackContext);
        }
        return true;
    }
}
