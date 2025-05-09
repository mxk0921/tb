package com.taobao.mytaobao.homepage.plugin;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.WindVaneInterface;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import tb.kpw;
import tb.pgj;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TBMyTaobaoWVPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String TAG = "TBMyTaobaoWVPlugin";

    static {
        t2o.a(745537740);
    }

    public static /* synthetic */ Object ipc$super(TBMyTaobaoWVPlugin tBMyTaobaoWVPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/homepage/plugin/TBMyTaobaoWVPlugin");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("getPassParams".equals(str)) {
            return getPassParams(str2, wVCallBackContext);
        }
        return false;
    }

    @WindVaneInterface
    public boolean getPassParams(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2645afff", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        TLog.logi(TAG, "getPassParams");
        String c = pgj.c(TAG);
        if (TextUtils.isEmpty(c)) {
            c = new JSONObject(0).toString();
        }
        wVCallBackContext.success(c);
        return true;
    }
}
