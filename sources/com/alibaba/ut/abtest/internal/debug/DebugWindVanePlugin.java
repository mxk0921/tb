package com.alibaba.ut.abtest.internal.debug;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.d3r;
import tb.kpw;
import tb.n;
import tb.nsw;
import tb.ogh;
import tb.t2o;
import tb.uwf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DebugWindVanePlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_SERVER_NAME = "WVUTABDebug";
    private static final String TAG = "DebugWindVanePlugin";

    static {
        t2o.a(961544362);
    }

    public static /* synthetic */ Object ipc$super(DebugWindVanePlugin debugWindVanePlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ut/abtest/internal/debug/DebugWindVanePlugin");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        ogh.e(TAG, "action=" + str + ", params=" + str2 + ", callback=" + wVCallBackContext);
        if (TextUtils.equals("startRealtimeDebug", str)) {
            n.j().v(true);
            if (!TextUtils.isEmpty(str2)) {
                Debug debug = (Debug) uwf.a(str2, Debug.class);
                if (debug == null) {
                    ogh.g(TAG, "开启实时调试失败，参数错误。params=" + str2);
                    if (wVCallBackContext != null) {
                        wVCallBackContext.error();
                    }
                    return true;
                }
                n.j().k().h(debug);
                if (wVCallBackContext != null) {
                    wVCallBackContext.success();
                }
            } else if (wVCallBackContext != null) {
                wVCallBackContext.error();
            }
            n.j().e().r("startRealtimeDebug");
            return true;
        } else if (!TextUtils.equals("getContextValue", str)) {
            return false;
        } else {
            if (wVCallBackContext != null) {
                nsw nswVar = new nsw();
                nswVar.b("utdid", d3r.c().d());
                nswVar.b("userid", n.j().o());
                nswVar.b("usernick", n.j().p());
                wVCallBackContext.success(nswVar);
            }
            return true;
        }
    }
}
