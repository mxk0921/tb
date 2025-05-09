package com.taobao.taolive.room;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.hw0;
import tb.jnr;
import tb.kpw;
import tb.pvs;
import tb.sbt;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class H5EmbedWVPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092742);
    }

    public static /* synthetic */ Object ipc$super(H5EmbedWVPlugin h5EmbedWVPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/H5EmbedWVPlugin");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        boolean z;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        jnr jnrVar = new jnr(str, str2, wVCallBackContext);
        if (!"enableEmbedLiveRoom".equals(str)) {
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        if (!hw0.m() || !sbt.i()) {
            z = false;
        } else {
            z = true;
        }
        jSONObject.put("enable", (Object) Boolean.valueOf(z));
        if (pvs.a0() && pvs.Z()) {
            z2 = true;
        }
        jSONObject.put("enableH5UT", (Object) Boolean.valueOf(z2));
        jSONObject.put("h5EmbedVersion", (Object) 1);
        jnrVar.h(jSONObject.toJSONString());
        return true;
    }
}
