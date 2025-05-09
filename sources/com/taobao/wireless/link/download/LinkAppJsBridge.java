package com.taobao.wireless.link.download;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;
import tb.esg;
import tb.irg;
import tb.jsg;
import tb.kpw;
import tb.nsw;
import tb.qd1;
import tb.r91;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class LinkAppJsBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_CHECK_INSTALL_PERMISSION = "checkInstallPermission";
    private static final String ACTION_LAUNCH_APP = "launchApp";
    private static final String ACTION_REQUEST_INSTALL_PERMISSION = "requestInstallPermission";
    public static final String CLASSNAME_APP = "LinkApp";

    static {
        t2o.a(1030750276);
    }

    public static /* synthetic */ Object ipc$super(LinkAppJsBridge linkAppJsBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/wireless/link/download/LinkAppJsBridge");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        irg.b("link_tag", "LinkAppJsBridge === execute === action:" + str + ", params:" + str2);
        try {
            if (TextUtils.equals(ACTION_LAUNCH_APP, str)) {
                String string = new JSONObject(str2).getString("packageName");
                if (!TextUtils.isEmpty(string)) {
                    boolean b = r91.b(this.mContext, string);
                    if (wVCallBackContext != null) {
                        if (b) {
                            esg.b(esg.ARG1_LAUNCH_APK_DOWNLOAD, null, string, null);
                            wVCallBackContext.success();
                        } else {
                            wVCallBackContext.error();
                        }
                    }
                } else if (wVCallBackContext != null) {
                    nsw nswVar = new nsw();
                    nswVar.b("message", "Please provide the required parameter 'packageName'.");
                    wVCallBackContext.error(nswVar);
                }
            } else if (TextUtils.equals(ACTION_REQUEST_INSTALL_PERMISSION, str)) {
                qd1.a(this.mContext);
                if (wVCallBackContext != null) {
                    wVCallBackContext.success();
                }
            } else if (TextUtils.equals(ACTION_CHECK_INSTALL_PERMISSION, str)) {
                boolean a2 = jsg.a(this.mContext);
                if (wVCallBackContext != null) {
                    nsw nswVar2 = new nsw();
                    nswVar2.a("data", Boolean.valueOf(a2));
                    wVCallBackContext.success(nswVar2);
                }
            }
        } catch (Exception e) {
            irg.b("link_tag", "LinkAppJsBridge === execute === 启动安装的APP异常：" + e);
        }
        return false;
    }
}
