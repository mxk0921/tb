package com.alipay.mobile.common.transportext.biz.appevent;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alipay.mobile.common.amnet.ipcapi.pushproc.OutEventNotifyService;
import com.alipay.mobile.common.ipc.api.IPCApiFactory;
import com.alipay.mobile.common.netsdkextdependapi.security.SecurityUtil;
import com.alipay.mobile.common.transport.http.CookieAccessHelper;
import com.alipay.mobile.common.transport.http.GwCookieCacheHelper;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.ReadSettingServerUrl;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransportEnv;
import com.alipay.mobile.common.transportext.biz.util.LogUtilAmnet;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AmnetUserInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_SESSION_ID = "sessionId";
    public static final String KEY_USER_ID = "userId";
    public static final String SHARED_FILE_NAME = "amnetsui";

    /* renamed from: a  reason: collision with root package name */
    public static volatile String f4177a;
    public static volatile String b;

    public static final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80bc360d", new Object[0]);
            return;
        }
        try {
            SharedPreferences.Editor edit = ExtTransportEnv.getAppContext().getSharedPreferences("amnetsui", 4).edit();
            edit.remove("sessionId");
            edit.remove("userId");
            edit.commit();
        } catch (Exception e) {
            LogCatUtil.error("ext_AmnetUserInfo", e);
        }
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55c2065e", new Object[0]);
        }
        try {
        } catch (Throwable th) {
            LogCatUtil.error("ext_AmnetUserInfo", "getSessionid ex:" + th.toString());
        }
        if (!MiscUtils.isInAlipayClient(ExtTransportEnv.getAppContext())) {
            return "";
        }
        String gwfurl = ReadSettingServerUrl.getInstance().getGWFURL(ExtTransportEnv.getAppContext());
        String c = c(GwCookieCacheHelper.getCookie(gwfurl));
        if (!TextUtils.isEmpty(c)) {
            LogCatUtil.debug("ext_AmnetUserInfo", "sessionidFromCache:" + c);
            return c;
        }
        String c2 = c(CookieAccessHelper.getCookie(gwfurl, ExtTransportEnv.getAppContext()));
        if (!TextUtils.isEmpty(c2)) {
            LogCatUtil.debug("ext_AmnetUserInfo", "sessionidFromCookieStore:" + c2);
            return c2;
        }
        LogCatUtil.debug("ext_AmnetUserInfo", "getSessionid return null");
        return "";
    }

    public static String c(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e693c827", new Object[]{str});
        }
        try {
        } catch (Throwable th) {
            LogCatUtil.error("ext_AmnetUserInfo", "getAlipayJsessionidFromCookiestr ex:" + th.toString());
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        for (String str2 : str.split("; ")) {
            if (!TextUtils.isEmpty(str2) && str2.contains("ALIPAYJSESSIONID")) {
                return str2.substring(str2.indexOf("=") + 1);
            }
        }
        return "";
    }

    public static void d(String str, String str2, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7aa065b", new Object[]{str, str2, bArr});
            return;
        }
        try {
            ((OutEventNotifyService) IPCApiFactory.getSingletonIPCContextManager().getIpcCallManager().getIpcProxy(OutEventNotifyService.class)).notifyLoginOrLogoutEvent(str, str2, bArr);
        } catch (Exception e) {
            LogCatUtil.error("ext_AmnetUserInfo", e);
        }
    }

    public static final void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c77431d", new Object[]{str, str2});
        } else if (TextUtils.isEmpty(f4177a)) {
            a();
        } else {
            try {
                LogCatUtil.info("ext_AmnetUserInfo", "updateUserInfo,userId=[" + str + "] sessionId=[" + str2 + "]");
                String encrypt = SecurityUtil.encrypt(str);
                String encrypt2 = SecurityUtil.encrypt(str2);
                SharedPreferences.Editor edit = ExtTransportEnv.getAppContext().getSharedPreferences("amnetsui", 4).edit();
                edit.putString("userId", encrypt);
                edit.putString("sessionId", encrypt2);
                edit.commit();
            } catch (Exception e) {
                LogCatUtil.error("ext_AmnetUserInfo", e);
            }
        }
    }

    public static void resendSessionid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80e3e1bd", new Object[0]);
            return;
        }
        try {
            String str = f4177a;
            String b2 = b();
            LogCatUtil.debug("ext_AmnetUserInfo", "resendSessionid,userid: " + str + ",sessionid: " + b2);
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(b2)) {
                ((OutEventNotifyService) IPCApiFactory.getSingletonIPCContextManager().getIpcCallManager().getIpcProxy(OutEventNotifyService.class)).notifyResendSessionid(str, b2);
            }
        } catch (Throwable th) {
            LogCatUtil.error("ext_AmnetUserInfo", "resendSessionid ex:" + th.toString());
        }
    }

    public static synchronized void setUserInfo(String str, String str2, byte[] bArr) {
        String str3;
        synchronized (AmnetUserInfo.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("39e8effd", new Object[]{str, str2, bArr});
                return;
            }
            StringBuilder sb = new StringBuilder("setUserInfo,userId: ");
            sb.append(str);
            sb.append(", sessionid: ");
            sb.append(str2);
            sb.append(", syncExtParam: ");
            if (bArr == null) {
                str3 = "is null";
            } else {
                str3 = bArr.length + " byte ";
            }
            sb.append(str3);
            LogUtilAmnet.i("ext_AmnetUserInfo", sb.toString());
            f4177a = str;
            b = str2;
            e(f4177a, b);
            d(str, str2, bArr);
        }
    }
}
