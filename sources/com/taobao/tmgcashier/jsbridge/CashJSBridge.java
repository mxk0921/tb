package com.taobao.tmgcashier.jsbridge;

import android.net.Uri;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.tao.log.TLog;
import org.json.JSONObject;
import tb.kpw;
import tb.t2o;
import tb.t6s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class CashJSBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TMGCashJSBridge";

    static {
        t2o.a(860880909);
    }

    public static /* synthetic */ Object ipc$super(CashJSBridge cashJSBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tmgcashier/jsbridge/CashJSBridge");
    }

    private void skip2TNGD(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed1a4b8", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                TLog.loge("tmgcashier", TAG, "skip2TNGD params 为空！");
                wVCallBackContext.error("skip2TNGD params 为空！");
                return;
            }
            Nav withFlags = Nav.from(this.mContext).allowEscape().withFlags(268435456);
            Uri parse = Uri.parse(new JSONObject(str).getString("url"));
            if (!"tngdwallet".equalsIgnoreCase(parse.getScheme())) {
                wVCallBackContext.error("只支持tngdwallet类型schema");
            } else if (withFlags.toUri(parse)) {
                wVCallBackContext.success();
            } else {
                wVCallBackContext.error("Nav error!");
            }
        } catch (Exception e) {
            TLog.loge("tmgcashier", TAG, e.getMessage());
            wVCallBackContext.error(e.getMessage());
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (t6s.BRIDGE_ACTION_SKIP2TNGD.equalsIgnoreCase(str)) {
            skip2TNGD(str2, wVCallBackContext);
        }
        return true;
    }
}
