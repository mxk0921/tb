package com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.iw0;
import tb.jnr;
import tb.kpw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TBLiveOnlyDebugWVPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699926);
    }

    public static /* synthetic */ Object ipc$super(TBLiveOnlyDebugWVPlugin tBLiveOnlyDebugWVPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/jsbridge/TBLiveOnlyDebugWVPlugin");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        jnr jnrVar = new jnr(str, str2, wVCallBackContext);
        if (!str.equals("isDebugEnv")) {
            return false;
        }
        jnrVar.h("{\"result\":\"" + iw0.j(this.mContext) + "\"}");
        return true;
    }
}
