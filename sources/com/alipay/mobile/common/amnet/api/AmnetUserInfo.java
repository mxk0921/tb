package com.alipay.mobile.common.amnet.api;

import android.text.TextUtils;
import com.alipay.mobile.common.netsdkextdependapi.security.SecurityUtil;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AmnetUserInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_SESSION_ID = "sessionId";
    public static final String KEY_USER_ID = "userId";
    public static final String SHARED_FILE_NAME = "amnetsui";

    /* renamed from: a  reason: collision with root package name */
    public static volatile String f3887a = null;
    public static volatile String b = null;
    public static boolean neverLogged = true;

    public static final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        try {
            String string = AmnetEnvHelper.getAppContext().getSharedPreferences("amnetsui", 4).getString("userId", "");
            if (TextUtils.isEmpty(string)) {
                return "";
            }
            String decrypt = SecurityUtil.decrypt(string);
            LogCatUtil.info("amnet_AmnetUserInfo", "getUserIdFromShared. userid=[" + decrypt + "]");
            return decrypt;
        } catch (Exception e) {
            LogCatUtil.error("amnet_AmnetUserInfo", e);
            return "";
        }
    }

    public static final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        try {
            String string = AmnetEnvHelper.getAppContext().getSharedPreferences("amnetsui", 4).getString("sessionId", "");
            if (TextUtils.isEmpty(string)) {
                return "";
            }
            String decrypt = SecurityUtil.decrypt(string);
            LogCatUtil.info("amnet_AmnetUserInfo", "getSessionIdFromShared. sessionId=[" + decrypt + "]");
            return decrypt;
        } catch (Exception e) {
            LogCatUtil.error("amnet_AmnetUserInfo", e);
            return "";
        }
    }

    public static String getSessionId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8ede3e", new Object[0]);
        }
        if (TextUtils.isEmpty(b)) {
            b = b();
        }
        return b;
    }

    public static synchronized String getUserId() {
        synchronized (AmnetUserInfo.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[0]);
            }
            if (TextUtils.isEmpty(f3887a)) {
                f3887a = a();
            }
            return f3887a;
        }
    }

    public static void setSessionId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("648aa560", new Object[]{str});
        } else {
            b = str;
        }
    }

    public static synchronized void setUserId(String str) {
        synchronized (AmnetUserInfo.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ca419d9", new Object[]{str});
            } else {
                f3887a = str;
            }
        }
    }

    public static synchronized void setUserInfo(String str, String str2) {
        synchronized (AmnetUserInfo.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b83d0b6", new Object[]{str, str2});
                return;
            }
            LogCatUtil.info("amnet_AmnetUserInfo", "setUserInfo: [ AmnetUserInfo ] [ userId" + str + " ][ sessionId" + str2 + " ]");
            f3887a = str;
            b = str2;
            neverLogged = false;
        }
    }
}
