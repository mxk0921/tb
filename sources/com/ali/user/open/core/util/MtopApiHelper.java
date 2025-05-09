package com.ali.user.open.core.util;

import android.text.TextUtils;
import android.util.Pair;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.service.RpcService;
import com.ali.user.open.core.trace.SDKLogger;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.orange.OrangeConfig;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class MtopApiHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<String, Pair<String, String>> NEW_API = new HashMap<String, Pair<String, String>>() { // from class: com.ali.user.open.core.util.MtopApiHelper.1
        {
            put(ApiConstants.ApiName.AUTO_LOGIN, new Pair(ApiConstants.ApiName.NEW_AUTO_LOGIN, "1.0"));
            put("mtop.taobao.login.signForAlipaySNSLogin", new Pair("mtop.alibaba.havana.login.signforalipaysnslogin", "1.0"));
            put(ApiConstants.ApiName.TOKEN_LOGIN, new Pair(ApiConstants.ApiName.NEW_TOKEN_LOGIN, "1.0"));
        }
    };

    static {
        t2o.a(71303245);
    }

    public static boolean isInABTestRegion(String str, String str2) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e538ab5", new Object[]{str, str2})).booleanValue();
        }
        String deviceId = ((RpcService) AliMemberSDK.getService(RpcService.class)).getDeviceId();
        if (TextUtils.isEmpty(deviceId)) {
            SDKLogger.e("MemberMtopApi", "isInABTestRegion deviceId is null");
            deviceId = "";
        }
        int abs = Math.abs(deviceId.hashCode()) % 10000;
        try {
            i = Integer.parseInt(OrangeConfig.getInstance().getConfig(LoginSwitch.CONFIG_GROUP_LOGIN, str, str2));
        } catch (Throwable th) {
            th.printStackTrace();
            i = 0;
        }
        if (abs < i) {
            return true;
        }
        return false;
    }

    public static boolean useNewApi(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17506896", new Object[]{str})).booleanValue();
        }
        return NEW_API.containsKey(str) && isInABTestRegion("user_new_mtop_api", "-1");
    }
}
