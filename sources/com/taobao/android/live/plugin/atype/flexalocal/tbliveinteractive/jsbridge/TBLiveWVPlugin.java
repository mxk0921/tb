package com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.fxf;
import tb.jnr;
import tb.kpw;
import tb.roa;
import tb.t2o;
import tb.tws;
import tb.v2s;
import tb.vgb;
import tb.xkc;
import tb.zvg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TBLiveWVPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699927);
    }

    public static /* synthetic */ Object ipc$super(TBLiveWVPlugin tBLiveWVPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/jsbridge/TBLiveWVPlugin");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        jnr jnrVar = new jnr(str, str2, wVCallBackContext);
        HashMap<String, String> hashMap = (HashMap) fxf.b(str2);
        if (v2s.o().e() != null) {
            if (hashMap.containsKey("__namespace")) {
                str3 = hashMap.get("__namespace");
            } else {
                str3 = "";
            }
            vgb e = v2s.o().e();
            e.c("taolive", "TBLiveWVPlugin_action_name", "action:" + str + ";name:" + str3, 1.0d);
        }
        Object a2 = roa.a(this.mWebView);
        zvg a3 = a2 instanceof xkc ? ((xkc) a2).a() : null;
        if (a3 != null && !a3.j()) {
            return a3.k(this.mWebView, str, hashMap, str2, jnrVar);
        }
        if (zvg.h() == null || !tws.h()) {
            jnrVar.b();
            return false;
        }
        boolean k = zvg.h().k(this.mWebView, str, hashMap, str2, jnrVar);
        v2s.o().e().c("taolive", "TBLiveWVPlugin_action_name", "action:LiveApiEngineSingle", 1.0d);
        return k;
    }
}
