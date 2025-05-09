package com.ali.user.open.cookies;

import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.ali.user.open.core.Site;
import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.model.Constants;
import com.ali.user.open.core.trace.SDKLogger;
import com.ali.user.open.core.util.FileUtils;
import com.ali.user.open.service.impl.SessionManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.session.constants.SessionConstants;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class CookieManagerWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final CookieManagerWrapper INSTANCE = new CookieManagerWrapper();
    private static final String TAG = "CookieManagerWrapper";

    private CookieManagerWrapper() {
    }

    private String getDomainBySite(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c79f8697", new Object[]{this, str});
        }
        if (TextUtils.equals(str, "taobao")) {
            return ".taobao.com";
        }
        if (TextUtils.equals(str, "alipay")) {
            return ".alipay.com";
        }
        if (TextUtils.equals(str, Site.DAMAI)) {
            return ".damai.cn";
        }
        if (TextUtils.equals(str, "eleme")) {
            return ".ele.me";
        }
        if (TextUtils.equals(str, Site.ICBU)) {
            return ".alibaba.com";
        }
        if (TextUtils.equals(str, "xianyu")) {
            return ".goofish.com";
        }
        return "";
    }

    public void clearCookies(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5884b093", new Object[]{this, str});
        } else {
            clearCookies(str, "");
        }
    }

    public String getCoookieBackupFileNameBySite(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d90065a3", new Object[]{this, str});
        }
        return Constants.COOKIES + str + "_backup";
    }

    public String getCoookieFileNameBySite(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a2ed0e85", new Object[]{this, str});
        }
        return Constants.COOKIES + str;
    }

    public synchronized void injectCookie(String str, String[] strArr, String[] strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e468d546", new Object[]{this, str, strArr, strArr2});
            return;
        }
        if (KernelContext.getApplicationContext() != null) {
            if (strArr != null) {
                SDKLogger.d(TAG, "injectCookie cookies != null");
                ArrayList arrayList = new ArrayList();
                String domainBySite = getDomainBySite(str);
                for (String str2 : strArr) {
                    if (!TextUtils.isEmpty(str2)) {
                        LoginCookie parseCookie = LoginCookieUtils.parseCookie(str2);
                        String httpDomin = LoginCookieUtils.getHttpDomin(parseCookie);
                        String loginCookie = parseCookie.toString();
                        SDKLogger.d(TAG, "add cookie: " + loginCookie);
                        CookieManagerService.getWebViewProxy().setCookie(httpDomin, loginCookie);
                        if (TextUtils.equals(parseCookie.domain, domainBySite)) {
                            arrayList.add(parseCookie);
                        }
                    }
                }
                if (strArr2 != null && strArr2.length > 0 && !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        LoginCookie loginCookie2 = (LoginCookie) it.next();
                        String str3 = loginCookie2.domain;
                        for (String str4 : strArr2) {
                            loginCookie2.domain = str4;
                            String httpDomin2 = LoginCookieUtils.getHttpDomin(loginCookie2);
                            String loginCookie3 = loginCookie2.toString();
                            SDKLogger.d(TAG, "add cookies to domain:" + str4 + ", cookie = " + loginCookie3);
                            CookieManagerService.getWebViewProxy().setCookie(httpDomin2, loginCookie3);
                        }
                        loginCookie2.domain = str3;
                    }
                }
                CookieManagerService.getWebViewProxy().flush();
                if (strArr.length > 0) {
                    FileUtils.writeFileData(KernelContext.getApplicationContext(), getCoookieFileNameBySite(str), TextUtils.join(Constants.COOKIE_SPLIT, strArr));
                    FileUtils.writeFileData(KernelContext.getApplicationContext(), getCoookieBackupFileNameBySite(str), TextUtils.join(Constants.COOKIE_SPLIT, strArr));
                }
            } else {
                clearCookies(str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b A[Catch: all -> 0x001a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0004, B:6:0x000a, B:17:0x004b), top: B:24:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void refreshCookie(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "get cookie from storage:"
            monitor-enter(r5)
            com.android.alibaba.ip.runtime.IpChange r1 = com.ali.user.open.cookies.CookieManagerWrapper.$ipChange     // Catch: all -> 0x001a
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange     // Catch: all -> 0x001a
            if (r2 == 0) goto L_0x001c
            java.lang.String r0 = "70b2c270"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: all -> 0x001a
            r3 = 0
            r2[r3] = r5     // Catch: all -> 0x001a
            r3 = 1
            r2[r3] = r6     // Catch: all -> 0x001a
            r1.ipc$dispatch(r0, r2)     // Catch: all -> 0x001a
            monitor-exit(r5)
            return
        L_0x001a:
            r6 = move-exception
            goto L_0x0050
        L_0x001c:
            r1 = 0
            android.content.Context r2 = com.ali.user.open.core.context.KernelContext.getApplicationContext()     // Catch: all -> 0x0047
            java.lang.String r3 = r5.getCoookieFileNameBySite(r6)     // Catch: all -> 0x0047
            java.lang.String r2 = com.ali.user.open.core.util.FileUtils.readFileData(r2, r3)     // Catch: all -> 0x0047
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: all -> 0x0047
            if (r3 != 0) goto L_0x0048
            java.lang.String r3 = com.ali.user.open.cookies.CookieManagerWrapper.TAG     // Catch: all -> 0x0047
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: all -> 0x0047
            r4.<init>(r0)     // Catch: all -> 0x0047
            r4.append(r2)     // Catch: all -> 0x0047
            java.lang.String r0 = r4.toString()     // Catch: all -> 0x0047
            com.ali.user.open.core.trace.SDKLogger.d(r3, r0)     // Catch: all -> 0x0047
            java.lang.String r0 = "\u0005"
            java.lang.String[] r0 = android.text.TextUtils.split(r2, r0)     // Catch: all -> 0x0047
            goto L_0x0049
        L_0x0047:
        L_0x0048:
            r0 = r1
        L_0x0049:
            if (r0 == 0) goto L_0x004e
            r5.injectCookie(r6, r0, r1)     // Catch: all -> 0x001a
        L_0x004e:
            monitor-exit(r5)
            return
        L_0x0050:
            monitor-exit(r5)     // Catch: all -> 0x001a
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.open.cookies.CookieManagerWrapper.refreshCookie(java.lang.String):void");
    }

    public void clearCookies(String str, String str2) {
        String[] strArr;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e53fb9d", new Object[]{this, str, str2});
            return;
        }
        SDKLogger.e("clearCookies", "into clearCookies ");
        CookieSyncManager.createInstance(KernelContext.getApplicationContext());
        SDKLogger.e("clearCookies", "into clearCookies removeSessionCookie finish");
        if (TextUtils.isEmpty(str2)) {
            str2 = FileUtils.readFileData(KernelContext.getApplicationContext(), getCoookieFileNameBySite(str));
        }
        String[] strArr2 = null;
        if (!TextUtils.isEmpty(str2)) {
            SDKLogger.d(TAG, "get cookie from storage:" + str2);
            strArr = TextUtils.split(str2, Constants.COOKIE_SPLIT);
        } else {
            strArr = null;
        }
        SDKLogger.e("clearCookies", "into clearCookies readFileData finish");
        if (strArr != null) {
            ArrayList arrayList = new ArrayList();
            String domainBySite = getDomainBySite(str);
            for (String str3 : strArr) {
                if (!TextUtils.isEmpty(str3)) {
                    try {
                        LoginCookie parseCookie = LoginCookieUtils.parseCookie(str3);
                        if (!"munb".equals(parseCookie.name)) {
                            String httpDomin = LoginCookieUtils.getHttpDomin(parseCookie);
                            LoginCookieUtils.expiresCookies(parseCookie);
                            CookieManagerService.getWebViewProxy().setCookie(httpDomin, parseCookie.toString());
                            if (TextUtils.equals(parseCookie.domain, domainBySite)) {
                                arrayList.add(parseCookie);
                            }
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
            try {
                SessionManager sessionManager = SessionManager.INSTANCE;
                if (!(sessionManager.getInternalSession(str) == null || sessionManager.getInternalSession(str).otherInfo == null || (obj = sessionManager.getInternalSession(str).otherInfo.get(SessionConstants.SSO_DOMAIN_LIST)) == null || !(obj instanceof ArrayList))) {
                    strArr2 = (String[]) ((ArrayList) obj).toArray(new String[0]);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (strArr2 != null && strArr2.length > 0 && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    LoginCookie loginCookie = (LoginCookie) it.next();
                    String str4 = loginCookie.domain;
                    for (String str5 : strArr2) {
                        loginCookie.domain = str5;
                        String httpDomin2 = LoginCookieUtils.getHttpDomin(loginCookie);
                        LoginCookieUtils.expiresCookies(loginCookie);
                        CookieManagerService.getWebViewProxy().setCookie(httpDomin2, loginCookie.toString());
                    }
                    loginCookie.domain = str4;
                }
            }
            SDKLogger.d(TAG, "injectCookie cookies is null");
            FileUtils.writeFileData(KernelContext.getApplicationContext(), getCoookieFileNameBySite(str), "");
        }
        SDKLogger.e("clearCookies", "into clearCookies reset cookie finish");
        CookieManagerService.getWebViewProxy().removeExpiredCookie();
        SDKLogger.e("clearCookies", "into clearCookies removeExpiredCookie finish");
        CookieManagerService.getWebViewProxy().flush();
        SDKLogger.e("clearCookies", "into clearCookies  finish");
    }
}
