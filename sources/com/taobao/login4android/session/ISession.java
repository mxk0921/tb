package com.taobao.login4android.session;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface ISession {
    void appendEventTrace(String str);

    boolean checkSessionValid();

    void clearAutoLoginInfo();

    void clearCookie2();

    void clearCookieManager();

    void clearCookieManager(boolean z);

    void clearSessionInfo();

    void clearSessionOnlyCookie();

    String getDisplayNick();

    String getEcode();

    String getEmail();

    String getEventTrace();

    String getExtJson();

    long getHavanaSsoTokenExpiredTime();

    String getHeadPicLink();

    String getLoginPhone();

    int getLoginSite();

    long getLoginTime();

    String getLoginToken();

    String getNick();

    String getOldEncryptedUserId();

    String getOldNick();

    String getOldSid();

    String getOldUserId();

    String getOneTimeToken();

    String getSessionDisastergrd();

    long getSessionExpiredTime();

    String getSid();

    String getSsoToken();

    String getSubSid();

    String getUidDigest();

    String getUserId();

    String getUserName();

    void injectCookie(String[] strArr, String[] strArr2);

    void injectCookie(String[] strArr, String[] strArr2, boolean z);

    void injectExternalCookies(String[] strArr, boolean z, boolean z2);

    boolean isCommentTokenUsed();

    void onLoginSuccess(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j, String[] strArr, String[] strArr2, String[] strArr3, long j2, long j3, String str9);

    boolean recoverCookie();

    void setCommentTokenUsed(boolean z);

    void setDisplayNick(String str);

    void setEcode(String str);

    void setEmail(String str);

    void setExtJson(String str);

    void setHavanaSsoTokenExpiredTime(long j);

    void setHeadPicLink(String str);

    void setLoginSite(int i);

    void setLoginToken(String str);

    void setNick(String str);

    void setOldEncryptedUserId(String str);

    void setOneTimeToken(String str);

    void setSDKHandler(InjectHandler injectHandler);

    void setSessionDisastergrd(String str);

    void setSessionExpiredTime(long j);

    void setSid(String str);

    void setSsoToken(String str);

    void setSubSid(String str);

    void setUidDigest(String str);

    void setUserId(String str);

    void setUserName(String str);

    void setWriteUT(boolean z);

    void trackLoginValid(String str, String str2);
}
