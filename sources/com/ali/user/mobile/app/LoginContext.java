package com.ali.user.mobile.app;

import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.model.CommonCallback;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.utils.FileUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class LoginContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static CommonDataCallback alipayHkCallback;
    public static CommonCallback callback;
    public static String loginUIType;
    public static DataCallback<Boolean> mDataCallback;
    public static long sLoginRpcStartTime;
    public static long sSSOAuthCodeStartTime;
    public static long sSingleLoginStartTime;
    public static String traceid;
    public static RpcResponse uninstallResponse;
    public static int uninstallType;
    public static boolean NEED_ACCS_LOGIN = false;
    public static int launchTime = -1;
    public static volatile Map<String, String> times = Collections.synchronizedMap(new HashMap());
    public static LoginParam sCurrentLoginParam = null;

    static {
        t2o.a(68157445);
    }

    public static int getLaunchTimes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff14c017", new Object[0])).intValue();
        }
        if (launchTime == -1) {
            launchTime = FileUtil.getLaunchTimes();
        }
        return launchTime;
    }
}
