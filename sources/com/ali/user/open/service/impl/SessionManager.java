package com.ali.user.open.service.impl;

import android.content.Intent;
import android.text.TextUtils;
import com.ali.user.mobile.model.DeviceTokenSignParam;
import com.ali.user.open.cookies.CookieManagerWrapper;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.Site;
import com.ali.user.open.core.config.ConfigManager;
import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.model.DeviceTokenRO;
import com.ali.user.open.core.model.LoginDataModel;
import com.ali.user.open.core.model.LoginReturnData;
import com.ali.user.open.core.model.ResultCode;
import com.ali.user.open.core.service.RpcService;
import com.ali.user.open.core.service.StorageService;
import com.ali.user.open.core.trace.SDKLogger;
import com.ali.user.open.core.util.CommonUtils;
import com.ali.user.open.core.util.JSONUtils;
import com.ali.user.open.core.util.ReflectionUtils;
import com.ali.user.open.history.AccountHistoryManager;
import com.ali.user.open.history.HistoryAccount;
import com.ali.user.open.service.SessionService;
import com.ali.user.open.session.InternalSession;
import com.ali.user.open.session.Session;
import com.ali.user.open.util.SessionUtils;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.session.constants.SessionConstants;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SessionManager implements SessionService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final SessionManager INSTANCE = new SessionManager();
    private static final String TAG = "SessionManager";
    private volatile InternalSession internalSession;
    private volatile Map<String, InternalSession> mIntenalSessions;
    public String internalSessionStoreKey = "internal_session";
    public String internalSessionMapKey = "internal_session_list";

    public SessionManager() {
        CommonUtils.sendUT("init_step_ucc_init_session_module");
        try {
            preInit();
        } catch (Throwable unused) {
            this.internalSession = new InternalSession();
            this.mIntenalSessions = new HashMap();
        }
    }

    private Object getServiceInstance(String str, String[] strArr, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7da5945b", new Object[]{this, str, strArr, objArr});
        }
        try {
            return ReflectionUtils.newInstance(str, strArr, objArr);
        } catch (NoSuchMethodError e) {
            e.printStackTrace();
            return null;
        }
    }

    private void refreshInternalSession(InternalSession internalSession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cde64dc", new Object[]{this, internalSession});
            return;
        }
        this.internalSession = internalSession;
        ((StorageService) AliMemberSDK.getService(StorageService.class)).putValue(this.internalSessionStoreKey, SessionUtils.toInternalSessionJSON(internalSession), true);
        if (this.mIntenalSessions != null) {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<String, InternalSession> entry : this.mIntenalSessions.entrySet()) {
                InternalSession value = entry.getValue();
                if (value != null) {
                    jSONArray.put(SessionUtils.toInternalSessionJSON(value));
                }
            }
            ((StorageService) AliMemberSDK.getService(StorageService.class)).putValue(this.internalSessionMapKey, jSONArray.toString(), true);
        }
        if (KernelContext.getApplicationContext() != null) {
            Intent intent = new Intent();
            intent.setAction("aliuser_sync_session");
            intent.setPackage(KernelContext.getApplicationContext().getPackageName());
            KernelContext.getApplicationContext().sendBroadcast(intent);
        }
    }

    private void registerStorage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d7b16df", new Object[]{this});
            return;
        }
        try {
            KernelContext.registerService(new Class[]{StorageService.class}, getServiceInstance("com.ali.user.open.securityguard.SecurityGuardWrapper", null, null), null);
        } catch (NoSuchMethodError e) {
            e.printStackTrace();
        }
    }

    public long adjustSessionExpireTime(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("139544ee", new Object[]{this, new Long(j), new Long(j2)})).longValue();
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (currentTimeMillis <= j2) {
            return j;
        }
        if (j > 0) {
            return j + (currentTimeMillis - j2);
        }
        return 86400 + currentTimeMillis;
    }

    public InternalSession createInternalSession(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InternalSession) ipChange.ipc$dispatch("c767e63f", new Object[]{this, str}) : createInternalSession("", str);
    }

    public Set<String> getAllSessionSites() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("7c693d17", new Object[]{this});
        }
        if (this.mIntenalSessions == null) {
            return null;
        }
        this.mIntenalSessions.keySet();
        return null;
    }

    public InternalSession getInternalSession() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InternalSession) ipChange.ipc$dispatch("412181db", new Object[]{this}) : this.internalSession;
    }

    @Override // com.ali.user.open.service.SessionService
    public Session getSession() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Session) ipChange.ipc$dispatch("c273bebb", new Object[]{this});
        }
        Session session = new Session();
        String str = "";
        session.nick = this.internalSession == null ? str : this.internalSession.nick;
        session.hid = this.internalSession == null ? str : this.internalSession.userId;
        session.sid = this.internalSession == null ? str : this.internalSession.sid;
        long j = 0;
        session.loginTime = this.internalSession == null ? 0L : this.internalSession.loginTime;
        if (this.internalSession != null) {
            j = this.internalSession.expireIn;
        }
        session.expireIn = j;
        session.avatarUrl = this.internalSession == null ? str : this.internalSession.avatarUrl;
        session.openId = this.internalSession == null ? str : this.internalSession.openId;
        session.openSid = this.internalSession == null ? str : this.internalSession.openSid;
        session.topAccessToken = this.internalSession == null ? str : this.internalSession.topAccessToken;
        session.topAuthCode = this.internalSession == null ? str : this.internalSession.topAuthCode;
        session.topExpireTime = this.internalSession == null ? str : this.internalSession.topExpireTime;
        if (this.internalSession != null) {
            str = this.internalSession.bindToken;
        }
        session.bindToken = str;
        return session;
    }

    public String getSessionData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b8f1b0f", new Object[]{this});
        }
        try {
            return ((StorageService) getServiceInstance("com.ali.user.open.securityguard.SecurityGuardWrapper", null, null)).getValue(this.internalSessionStoreKey, true);
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // com.ali.user.open.service.SessionService
    public boolean isSessionValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f14699db", new Object[]{this})).booleanValue();
        }
        String str = TAG;
        SDKLogger.d(str, "func isSessionValid");
        if (this.internalSession == null || TextUtils.isEmpty(this.internalSession.sid)) {
            SDKLogger.d(str, "isSessionValid()  internalSession is null");
            return false;
        } else if (this.internalSession.loginTime == 0 || this.internalSession.expireIn == 0) {
            SDKLogger.d(str, "isSessionValid()  loginTime is 0 or expireIn is 0");
            return false;
        } else {
            StringBuilder sb = new StringBuilder("isSessionValid()  ");
            sb.append(System.currentTimeMillis() / 1000 < this.internalSession.expireIn);
            SDKLogger.d(str, sb.toString());
            return System.currentTimeMillis() / 1000 < this.internalSession.expireIn;
        }
    }

    @Override // com.ali.user.open.service.SessionService
    public ResultCode logout(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResultCode) ipChange.ipc$dispatch("2747b42c", new Object[]{this, str});
        }
        CookieManagerWrapper.INSTANCE.clearCookies(str);
        InternalSession internalSession = new InternalSession();
        if (this.mIntenalSessions != null) {
            this.mIntenalSessions.remove(str);
        }
        refreshInternalSession(internalSession);
        if (!TextUtils.isEmpty(Site.getMtopInstanceTag(str))) {
            ((RpcService) AliMemberSDK.getService(RpcService.class)).logout(Site.getMtopInstanceTag(str));
        }
        return ResultCode.SUCCESS;
    }

    public void reloadSession() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84f728c4", new Object[]{this});
            return;
        }
        try {
            StorageService storageService = (StorageService) getServiceInstance("com.ali.user.open.securityguard.SecurityGuardWrapper", null, null);
            String value = storageService.getValue(this.internalSessionStoreKey, true);
            if (TextUtils.isEmpty(value)) {
                value = storageService.getValue(this.internalSessionStoreKey, true);
            }
            if (!TextUtils.isEmpty(value)) {
                this.internalSession = createInternalSession("taobao", value);
                storageService.putValue(this.internalSessionStoreKey, SessionUtils.toInternalSessionJSON(this.internalSession), true);
                if (this.mIntenalSessions == null) {
                    this.mIntenalSessions = new HashMap();
                }
                if (!TextUtils.isEmpty(this.internalSession.site)) {
                    this.mIntenalSessions.put(this.internalSession.site, this.internalSession);
                } else {
                    this.mIntenalSessions.put("taobao", this.internalSession);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public InternalSession createInternalSession(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InternalSession) ipChange.ipc$dispatch("1b379c09", new Object[]{this, str, str2});
        }
        InternalSession internalSession = new InternalSession();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            internalSession.sid = JSONUtils.optString(jSONObject, "sid");
            if (TextUtils.isEmpty(str)) {
                internalSession.site = JSONUtils.optString(jSONObject, "site");
            } else {
                internalSession.site = str;
            }
            internalSession.expireIn = JSONUtils.optInteger(jSONObject, "expireIn").intValue();
            internalSession.avatarUrl = JSONUtils.optString(jSONObject, "avatarUrl");
            internalSession.userId = JSONUtils.optString(jSONObject, "userId");
            internalSession.nick = JSONUtils.optString(jSONObject, "nick");
            internalSession.openId = JSONUtils.optString(jSONObject, "openId");
            internalSession.openSid = JSONUtils.optString(jSONObject, "openSid");
            internalSession.deviceTokenKey = JSONUtils.optString(jSONObject, "deviceTokenKey");
            internalSession.deviceTokenSalt = JSONUtils.optString(jSONObject, "deviceTokenSalt");
            if (!TextUtils.isEmpty(internalSession.sid) && !TextUtils.isEmpty(internalSession.userId) && TextUtils.equals(KernelContext.getApplicationContext().getPackageName(), CommonUtils.getProcessName(KernelContext.getApplicationContext()))) {
                if (ConfigManager.getInstance().isRegisterSidToMtopDefault()) {
                    CommonUtils.sendUT("ucc_register_to_mtop");
                    ((RpcService) AliMemberSDK.getService(RpcService.class)).registerSessionInfo(null, internalSession.sid, internalSession.userId);
                } else if (!TextUtils.isEmpty(internalSession.site)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("site", internalSession.site);
                    hashMap.put("sid", internalSession.sid);
                    CommonUtils.sendUT("ucc_register_to_mtop_site", hashMap);
                    if (!TextUtils.isEmpty(Site.getMtopInstanceTag(internalSession.site))) {
                        ((RpcService) AliMemberSDK.getService(RpcService.class)).registerSessionInfo(Site.getMtopInstanceTag(internalSession.site), internalSession.sid, internalSession.userId);
                    }
                }
            }
            internalSession.loginTime = JSONUtils.optLong(jSONObject, SessionConstants.LOGIN_TIME).longValue();
            internalSession.mobile = JSONUtils.optString(jSONObject, "mobile");
            internalSession.loginId = JSONUtils.optString(jSONObject, "loginId");
            internalSession.autoLoginToken = JSONUtils.optString(jSONObject, DeviceTokenSignParam.KEY_AUTOLOGINTOKEN);
            internalSession.topAccessToken = JSONUtils.optString(jSONObject, "topAccessToken");
            internalSession.topExpireTime = JSONUtils.optString(jSONObject, "topExpireTime");
            internalSession.topAuthCode = JSONUtils.optString(jSONObject, "topAuthCode");
            internalSession.otherInfo = JSONUtils.toMap(jSONObject.optJSONObject("otherInfo"));
        } catch (Throwable th) {
            SDKLogger.e(TAG, th.getMessage(), th);
        }
        return internalSession;
    }

    public InternalSession getInternalSession(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InternalSession) ipChange.ipc$dispatch("75b408a5", new Object[]{this, str});
        }
        if (this.mIntenalSessions == null) {
            return null;
        }
        return this.mIntenalSessions.get(str);
    }

    @Override // com.ali.user.open.service.SessionService
    public void refreshCookie(String str, LoginReturnData loginReturnData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42be76b2", new Object[]{this, str, loginReturnData});
            return;
        }
        if (loginReturnData != null && !TextUtils.isEmpty(loginReturnData.data)) {
            try {
                LoginDataModel loginDataModel = (LoginDataModel) JSONUtils.toPOJO(new JSONObject(loginReturnData.data), LoginDataModel.class);
                Map<String, Object> map = loginDataModel.extendAttribute;
                String[] strArr = null;
                if (map != null) {
                    try {
                        Object obj = map.get(SessionConstants.SSO_DOMAIN_LIST);
                        if (obj != null && (obj instanceof ArrayList)) {
                            strArr = (String[]) ((ArrayList) obj).toArray(new String[0]);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                CookieManagerWrapper.INSTANCE.injectCookie(str, loginDataModel.cookies, strArr);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.ali.user.open.service.SessionService
    public void refreshWhenLogin(String str, LoginReturnData loginReturnData) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("103e1ec7", new Object[]{this, str, loginReturnData});
        } else if (loginReturnData != null && !TextUtils.isEmpty(loginReturnData.data)) {
            InternalSession internalSession = new InternalSession();
            try {
                LoginDataModel loginDataModel = (LoginDataModel) JSONUtils.toPOJO(new JSONObject(loginReturnData.data), LoginDataModel.class);
                internalSession.site = str;
                internalSession.externalCookies = loginDataModel.externalCookies;
                internalSession.userId = loginDataModel.userId;
                String str2 = loginDataModel.nick;
                if (str2 != null) {
                    try {
                        internalSession.nick = URLDecoder.decode(str2, "UTF-8");
                    } catch (Exception e) {
                        SDKLogger.e(TAG, e.getMessage(), e);
                    }
                }
                internalSession.openId = loginDataModel.openId;
                internalSession.openSid = loginDataModel.openSid;
                internalSession.avatarUrl = loginDataModel.headPicLink;
                internalSession.email = loginDataModel.email;
                DeviceTokenRO deviceTokenRO = loginReturnData.deviceToken;
                if (deviceTokenRO != null) {
                    internalSession.deviceTokenSalt = deviceTokenRO.salt;
                    internalSession.deviceTokenKey = deviceTokenRO.key;
                }
                if (TextUtils.equals(str, "taobao")) {
                    AccountHistoryManager.getInstance().putLoginHistory(new HistoryAccount(loginDataModel.userId, internalSession.deviceTokenKey, loginDataModel.nick, loginDataModel.phone, loginDataModel.email), internalSession.deviceTokenSalt);
                }
                long j = loginDataModel.loginTime;
                internalSession.loginTime = j;
                internalSession.sid = loginDataModel.sid;
                internalSession.expireIn = adjustSessionExpireTime(loginDataModel.expires, j);
                internalSession.mobile = loginDataModel.loginPhone;
                internalSession.loginId = loginReturnData.showLoginId;
                internalSession.autoLoginToken = loginDataModel.autoLoginToken;
                internalSession.topAccessToken = loginDataModel.topAccessToken;
                internalSession.topAuthCode = loginDataModel.topAuthCode;
                internalSession.topExpireTime = loginDataModel.topExpireTime;
                internalSession.otherInfo = loginDataModel.extendAttribute;
                Map<String, String> map = loginReturnData.extMap;
                if (map != null) {
                    internalSession.bindToken = map.get("bind_token");
                }
                HashMap hashMap = new HashMap();
                hashMap.put("site", str);
                hashMap.put("sid", loginDataModel.sid);
                CommonUtils.sendUT("ucc_register_to_mtop_site", hashMap);
                if (!TextUtils.isEmpty(Site.getMtopInstanceTag(str)) && TextUtils.equals(KernelContext.getApplicationContext().getPackageName(), CommonUtils.getProcessName(KernelContext.getApplicationContext()))) {
                    ((RpcService) AliMemberSDK.getService(RpcService.class)).registerSessionInfo(Site.getMtopInstanceTag(str), loginDataModel.sid, loginDataModel.userId);
                }
                String[] strArr = null;
                try {
                    Map<String, Object> map2 = loginDataModel.extendAttribute;
                    if (!(map2 == null || (obj = map2.get(SessionConstants.SSO_DOMAIN_LIST)) == null || !(obj instanceof ArrayList))) {
                        strArr = (String[]) ((ArrayList) obj).toArray(new String[0]);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                CookieManagerWrapper.INSTANCE.injectCookie(str, loginDataModel.cookies, strArr);
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            SDKLogger.d(MspGlobalDefine.SESSION, "session = " + internalSession.toString());
            this.mIntenalSessions.put(str, internalSession);
            refreshInternalSession(internalSession);
        }
    }

    private void preInit() throws JSONException {
        JSONArray jSONArray;
        InternalSession createInternalSession;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f8aa55a", new Object[]{this});
            return;
        }
        if (AliMemberSDK.getService(StorageService.class) == null) {
            registerStorage();
        }
        String value = ((StorageService) AliMemberSDK.getService(StorageService.class)).getValue("loginEnvironmentIndex", true);
        String valueOf = String.valueOf(KernelContext.getEnvironment().ordinal());
        if (value == null || value.equals(valueOf)) {
            String value2 = ((StorageService) AliMemberSDK.getService(StorageService.class)).getValue(this.internalSessionMapKey, true);
            if (TextUtils.isEmpty(value2)) {
                value2 = ((StorageService) AliMemberSDK.getService(StorageService.class)).getValue(this.internalSessionMapKey, true);
            }
            String value3 = ((StorageService) AliMemberSDK.getService(StorageService.class)).getValue(this.internalSessionStoreKey, true);
            if (TextUtils.isEmpty(value3)) {
                value3 = ((StorageService) AliMemberSDK.getService(StorageService.class)).getValue(this.internalSessionStoreKey, true);
            }
            this.mIntenalSessions = new HashMap();
            if (!TextUtils.isEmpty(value2)) {
                try {
                    jSONArray = new JSONArray(value2);
                } catch (JSONException e) {
                    e.printStackTrace();
                    jSONArray = null;
                }
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (!TextUtils.isEmpty(jSONArray.optString(i)) && (createInternalSession = createInternalSession(jSONArray.optString(i))) != null && !TextUtils.isEmpty(createInternalSession.site)) {
                        this.mIntenalSessions.put(createInternalSession.site, createInternalSession);
                    }
                }
            }
            if (!TextUtils.isEmpty(value3)) {
                this.internalSession = createInternalSession(value3);
                if (this.internalSession == null) {
                    return;
                }
                if (!TextUtils.isEmpty(this.internalSession.site)) {
                    this.mIntenalSessions.put(this.internalSession.site, this.internalSession);
                } else {
                    this.mIntenalSessions.put("taobao", this.internalSession);
                }
            } else {
                this.internalSession = new InternalSession();
            }
        } else {
            ((StorageService) AliMemberSDK.getService(StorageService.class)).putValue("loginEnvironmentIndex", valueOf, true);
            ((StorageService) AliMemberSDK.getService(StorageService.class)).removeValue(this.internalSessionStoreKey, true);
            ((StorageService) AliMemberSDK.getService(StorageService.class)).removeValue(this.internalSessionMapKey, true);
            this.internalSession = new InternalSession();
            this.mIntenalSessions = new HashMap();
        }
    }

    @Override // com.ali.user.open.service.SessionService
    public boolean isSessionValid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d0f9be5", new Object[]{this, str})).booleanValue();
        }
        String str2 = TAG;
        SDKLogger.d(str2, "func isSessionValid");
        if (this.mIntenalSessions == null || this.mIntenalSessions.get(str) == null || TextUtils.isEmpty(this.mIntenalSessions.get(str).sid)) {
            SDKLogger.d(str2, "isSessionValid()  internalSession is null");
            return false;
        }
        InternalSession internalSession = this.mIntenalSessions.get(str);
        if (internalSession.loginTime == 0 || internalSession.expireIn == 0) {
            SDKLogger.d(str2, "isSessionValid()  loginTime is 0 or expireIn is 0");
            return false;
        }
        StringBuilder sb = new StringBuilder("isSessionValid()  ");
        sb.append(System.currentTimeMillis() / 1000 < internalSession.expireIn);
        SDKLogger.d(str2, sb.toString());
        return System.currentTimeMillis() / 1000 < internalSession.expireIn;
    }

    public void reloadSession(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b644bd8", new Object[]{this, str, str2});
            return;
        }
        try {
            StorageService storageService = (StorageService) getServiceInstance("com.ali.user.open.securityguard.SecurityGuardWrapper", null, null);
            if (!TextUtils.isEmpty(str2)) {
                this.internalSession = createInternalSession(str, str2);
                storageService.putValue(this.internalSessionStoreKey, SessionUtils.toInternalSessionJSON(this.internalSession), true);
                if (this.mIntenalSessions == null) {
                    this.mIntenalSessions = new HashMap();
                }
                if (!TextUtils.isEmpty(this.internalSession.site)) {
                    this.mIntenalSessions.put(this.internalSession.site, this.internalSession);
                } else {
                    this.mIntenalSessions.put("taobao", this.internalSession);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.ali.user.open.service.SessionService
    public Session getSession(String str) {
        InternalSession internalSession;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Session) ipChange.ipc$dispatch("a5d69a45", new Object[]{this, str});
        }
        Session session = new Session();
        if (!(this.mIntenalSessions == null || (internalSession = this.mIntenalSessions.get(str)) == null)) {
            session.nick = internalSession.nick;
            session.hid = internalSession.userId;
            session.sid = internalSession.sid;
            session.loginTime = internalSession.loginTime;
            session.expireIn = internalSession.expireIn;
            session.avatarUrl = internalSession.avatarUrl;
            session.openId = internalSession.openId;
            session.openSid = internalSession.openSid;
            session.topAccessToken = internalSession.topAccessToken;
            session.topAuthCode = internalSession.topAuthCode;
            session.topExpireTime = internalSession.topExpireTime;
            session.bindToken = internalSession.bindToken;
        }
        return session;
    }
}
