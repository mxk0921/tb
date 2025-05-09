package com.taobao.vessel.web;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.cbo;
import tb.e4w;
import tb.kpw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class VesselWebApiPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(967835677);
    }

    public static /* synthetic */ Object ipc$super(VesselWebApiPlugin vesselWebApiPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/vessel/web/VesselWebApiPlugin");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"vessel".equals(str)) {
            return false;
        }
        HashMap hashMap = new HashMap();
        try {
            map = JSON.parseObject(str2);
        } catch (Exception e) {
            hashMap.put("err", e);
            map = hashMap;
        }
        e4w.b().c(wVCallBackContext.getWebview(), map, new cbo(wVCallBackContext));
        return true;
    }
}
