package com.taobao.wireless.link.login;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import org.json.JSONObject;
import tb.esg;
import tb.irg;
import tb.kpw;
import tb.t2o;
import tb.uih;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class LoginFreeJsbridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_LOGIN = "saveTransferLoginInfo";
    public static final String CLASSNAME_LOGINFREEJSBRIDGE = "LoginFreeAPI";

    static {
        t2o.a(1030750285);
    }

    public static /* synthetic */ Object ipc$super(LoginFreeJsbridge loginFreeJsbridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/wireless/link/login/LoginFreeJsbridge");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (TextUtils.equals(str, ACTION_LOGIN)) {
            irg.a("link_tag", "LoginFreeJsbridge === execute === 写入到手淘的信息：" + str2);
            try {
                JSONObject jSONObject = new JSONObject(str2);
                String str3 = (String) jSONObject.get("schemaUrl");
                String str4 = (String) jSONObject.get("packageName");
                uih.f().f29397a = str3;
                if (!TextUtils.isEmpty(str4)) {
                    ((HashMap) uih.f().b).put(str4, Boolean.FALSE);
                }
                irg.a("link_tag", "LoginFreeJsbridge === execute === 写免登信息：schemaUrl=" + str3);
                esg.b(esg.ARG1_WRITE_LOGIN_FREE, str2, str3, new HashMap());
            } catch (Exception e) {
                irg.a("link_tag", "LoginFreeJsbridge === execute === 写免登信息异常=" + e);
                return false;
            }
        }
        return true;
    }
}
