package com.taobao.android.live.plugin.atype.flexalocal.usertask;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cwd;
import tb.fkx;
import tb.kpw;
import tb.sjr;
import tb.t2o;
import tb.v2s;
import tb.vae;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TBLiveBaseCommonPlugin extends kpw implements vae {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295700089);
        t2o.a(806355300);
    }

    public static /* synthetic */ Object ipc$super(TBLiveBaseCommonPlugin tBLiveBaseCommonPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/usertask/TBLiveBaseCommonPlugin");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        str.hashCode();
        if (!str.equals("baseCommonFunction")) {
            return false;
        }
        JSONObject d = fkx.d(str2);
        if (d != null) {
            if (v2s.o().A() != null) {
                cwd A = v2s.o().A();
                A.c("TBLiveBaseCommonPlugin", "baseCommonFunction " + d.toJSONString());
            }
            String string = d.getString("bizType");
            String string2 = d.getString("action");
            d.getJSONObject("params");
            if ("PlatformTask".equals(string) && "PermissionSuccess".equals(string2)) {
                sjr.g().e("com.taobao.live.usertask.permissionSuccess", d);
            }
        }
        return true;
    }
}
