package com.taobao.wireless.link.download;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import org.json.JSONObject;
import tb.irg;
import tb.jsg;
import tb.kpw;
import tb.mu7;
import tb.nsw;
import tb.t2o;
import tb.uih;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class CheckAppStatusJsBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_CHECK_APP_STATUS = "checkStatus";
    public static final String CLASSNAME_CHECK_APP_STATUS = "CheckAppStatus";

    static {
        t2o.a(1030750266);
    }

    private boolean getIsLogin(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64b69dfe", new Object[]{this, str})).booleanValue();
        }
        if (str == null || uih.f().b == null || ((HashMap) uih.f().b).size() == 0) {
            return false;
        }
        return ((Boolean) ((HashMap) uih.f().b).get(str)).booleanValue();
    }

    public static /* synthetic */ Object ipc$super(CheckAppStatusJsBridge checkAppStatusJsBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/wireless/link/download/CheckAppStatusJsBridge");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            if (TextUtils.equals("checkStatus", str)) {
                JSONObject jSONObject = new JSONObject(str2);
                String string = jSONObject.getString("packageName");
                int i = jSONObject.getInt(BaseFBPlugin.ACT_CONF.supportVersion);
                if (wVCallBackContext != null) {
                    nsw nswVar = new nsw();
                    boolean m = jsg.m(this.mContext, string);
                    nswVar.a("hasInstall", Boolean.valueOf(m));
                    nswVar.a("hasSupportFreeLogin", Boolean.valueOf(hasSupportFreeLogin(this.mContext, string, i)));
                    nswVar.a("hasLogin", Boolean.valueOf(getIsLogin(string)));
                    wVCallBackContext.success(nswVar);
                    irg.a("link_tag", "CheckAppStatusJsBridge === execute === wvResult：" + nswVar.m());
                    if (m) {
                        mu7.k().d(this.mContext, string);
                    }
                }
            }
        } catch (Exception e) {
            irg.b("link_tag", "CheckAppStatusJsBridge === execute === 获取登录安装数据异常：" + e);
        }
        return false;
    }

    private boolean hasSupportFreeLogin(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6538dfc4", new Object[]{this, context, str, new Integer(i)})).booleanValue();
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                return false;
            }
            return packageInfo.versionCode >= i;
        } catch (Exception e) {
            irg.b("link_tag", "CheckAppStatusJsBridge === hasSupportFreeLogin === 获取packageInfo异常：" + e);
            return false;
        }
    }
}
