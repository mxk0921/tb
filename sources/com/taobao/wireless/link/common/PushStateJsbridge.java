package com.taobao.wireless.link.common;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;
import tb.aqg;
import tb.irg;
import tb.kpw;
import tb.nsw;
import tb.t2o;
import tb.ypg;
import tb.zhm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PushStateJsbridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_JUMP_SWITCH = "jumpPushSetting";
    private static final String ACTION_SWITCH = "getPushSwitch";
    public static final String CLASSNAME_PUSH_STATE = "UGPushHandler";

    static {
        t2o.a(1030750260);
    }

    public static /* synthetic */ Object ipc$super(PushStateJsbridge pushStateJsbridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/wireless/link/common/PushStateJsbridge");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (TextUtils.equals("false", aqg.g(ypg.e().f32260a, "is_push_api_open", "true"))) {
            irg.a("link_tag", "PushStateJsbridge === execute === h5调用获取通知权限,功能开关关闭");
            return false;
        }
        if (TextUtils.equals(str, ACTION_SWITCH)) {
            if (wVCallBackContext != null) {
                JSONObject jSONObject = new JSONObject();
                String e = zhm.e(ypg.e().f32260a);
                irg.a("link_tag", "PushStateJsbridge === execute === h5调用获取通知权限：" + e);
                try {
                    jSONObject.put("notificationEnabled", e);
                } catch (Exception e2) {
                    irg.b("link_tag", "PushStateJsbridge === execute === 获取通知权限异常：" + e2);
                }
                nsw nswVar = new nsw();
                nswVar.d("data", jSONObject);
                wVCallBackContext.success(nswVar);
                return true;
            }
        } else if (TextUtils.equals(str, ACTION_JUMP_SWITCH)) {
            zhm.o(ypg.e().f32260a);
            irg.a("link_tag", "PushStateJsbridge === execute === h5调用跳转到通知权限开通页面");
        }
        return true;
    }
}
