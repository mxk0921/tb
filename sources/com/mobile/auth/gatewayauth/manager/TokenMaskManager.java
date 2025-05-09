package com.mobile.auth.gatewayauth.manager;

import android.text.TextUtils;
import android.util.LruCache;
import com.mobile.auth.O0Oo000;
import com.mobile.auth.OO0000o;
import com.mobile.auth.OO00O0;
import com.mobile.auth.OO00OO;
import com.mobile.auth.OooOO;
import com.mobile.auth.gatewayauth.Constant;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.ResultCode;
import com.mobile.auth.gatewayauth.manager.O000000o;
import com.mobile.auth.gatewayauth.manager.base.Cache;
import com.mobile.auth.gatewayauth.manager.base.CacheKey;
import com.mobile.auth.gatewayauth.manager.base.O00000Oo;
import com.mobile.auth.gatewayauth.model.LoginPhoneInfo;
import com.mobile.auth.gatewayauth.network.UTSharedPreferencesHelper;
import com.mobile.auth.gatewayauth.utils.EncryptUtils;
import com.mobile.auth.gatewayauth.utils.O00000o0;
import com.mobile.auth.gatewayauth.utils.O0000O0o;
import com.mobile.auth.gatewayauth.utils.TokenGenerator;
import com.mobile.auth.ooO0Ooo;
import com.nirvana.tools.requestqueue.strategy.ThreadStrategy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import tb.gs2;
import tb.ln8;
import tb.n5o;
import tb.qv2;
import tb.rlp;
import tb.swf;
import tb.sy4;
import tb.wrf;
import tb.ws2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TokenMaskManager {
    private O00000Oo O000000o;
    private SystemManager O00000Oo;
    private VendorSdkInfoManager O00000o;
    private O00000o O00000o0;
    private O0000OOo O00000oO;
    private TokenGenerator O00000oo;
    private O0Oo000 O0000O0o;
    private gs2 O0000Ooo;
    private gs2 O0000o0;
    private gs2 O0000o00;
    private gs2 O0000o0O;
    private ws2 O0000o0o;
    private volatile Map<String, LoginPhoneInfo> O0000OOo = new ConcurrentHashMap();
    private volatile Cache<LoginPhoneInfo> O0000Oo0 = null;
    private volatile LruCache<String, Cache<String>> O0000Oo = new LruCache<>(10);
    private volatile LruCache<String, Cache<String>> O0000OoO = new LruCache<>(10);

    public TokenMaskManager(O00000Oo o00000Oo, SystemManager systemManager, O00000o o00000o, O0000OOo o0000OOo, VendorSdkInfoManager vendorSdkInfoManager) {
        this.O000000o = o00000Oo;
        this.O00000Oo = systemManager;
        this.O00000o0 = o00000o;
        O0Oo000 O000000o = o00000o.O000000o();
        this.O0000O0o = O000000o;
        this.O00000o = vendorSdkInfoManager;
        this.O00000oO = o0000OOo;
        this.O00000oo = new TokenGenerator(O000000o, this.O00000Oo, vendorSdkInfoManager);
        this.O0000o0o = ws2.b(this.O00000Oo.O00000oO());
        O00000Oo();
        O0000O0o.O000000o(new Runnable() { // from class: com.mobile.auth.gatewayauth.manager.TokenMaskManager.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TokenMaskManager.O000000o(TokenMaskManager.this);
                    TokenMaskManager.O00000Oo(TokenMaskManager.this);
                    TokenMaskManager.O00000o0(TokenMaskManager.this);
                } catch (Throwable th) {
                    try {
                        ExceptionProcessor.processException(th);
                    } catch (Throwable th2) {
                        ExceptionProcessor.processException(th2);
                    }
                }
            }
        });
    }

    private void O00000Oo() {
        try {
            gs2 a2 = this.O0000o0o.a("key_handler_login_token");
            this.O0000Ooo = a2;
            if (a2 == null) {
                this.O0000Ooo = this.O0000o0o.d("key_handler_login_token", new rlp(1, true, "AUTH_APP_INFO", UTSharedPreferencesHelper.LOGIN_TOKEN_KEY));
            }
            gs2 a3 = this.O0000o0o.a("key_handler_verify_token");
            this.O0000o00 = a3;
            if (a3 == null) {
                this.O0000o00 = this.O0000o0o.d("key_handler_verify_token", new rlp(1, true, "AUTH_APP_INFO", UTSharedPreferencesHelper.VERIFY_TOKEN_KEY));
            }
            gs2 a4 = this.O0000o0o.a("key_handler_imsi_mask");
            this.O0000o0 = a4;
            if (a4 == null) {
                this.O0000o0 = this.O0000o0o.d("key_handler_imsi_mask", new rlp(1, true, "AUTH_APP_INFO", UTSharedPreferencesHelper.MASK_IMSI_KEY));
            }
            gs2 a5 = this.O0000o0o.a("key_handler_ip_mask");
            this.O0000o0O = a5;
            if (a5 == null) {
                this.O0000o0O = this.O0000o0o.d("key_handler_ip_mask", new rlp(1, true, "AUTH_APP_INFO", UTSharedPreferencesHelper.MASK_LOCAL_IP_KEY));
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public static /* synthetic */ O0Oo000 O00000o(TokenMaskManager tokenMaskManager) {
        try {
            return tokenMaskManager.O0000O0o;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private synchronized void O00000o0() {
        try {
            try {
                String decryptContent = this.O00000Oo.decryptContent(this.O0000o0.a());
                Cache<LoginPhoneInfo> cache = null;
                if (!TextUtils.isEmpty(decryptContent)) {
                    JSONObject jSONObject = new JSONObject(decryptContent);
                    Iterator<String> keys = jSONObject.keys();
                    if (jSONObject.length() > 0) {
                        this.O0000OOo = new ConcurrentHashMap(jSONObject.length());
                    }
                    while (keys != null && keys.hasNext()) {
                        String next = keys.next();
                        this.O0000OOo.put(next, wrf.a(jSONObject.optJSONObject(next), new LoginPhoneInfo(), null));
                    }
                }
                String decryptContent2 = this.O00000Oo.decryptContent(this.O0000o0O.a());
                if (!TextUtils.isEmpty(decryptContent2)) {
                    cache = Cache.fromJson(new JSONObject(decryptContent2), new swf<LoginPhoneInfo>() { // from class: com.mobile.auth.gatewayauth.manager.TokenMaskManager.4
                    });
                }
                if (cache != null) {
                    this.O0000Oo0 = cache;
                } else {
                    UTSharedPreferencesHelper.putAppInfo(this.O00000Oo.O00000oO(), UTSharedPreferencesHelper.MASK_LOCAL_IP_KEY, "");
                }
            } catch (Exception e) {
                this.O0000O0o.O00000o("loadMaskFromDisk error!", ln8.a(e));
            }
        } finally {
        }
    }

    public static /* synthetic */ Cache O00000oO(TokenMaskManager tokenMaskManager) {
        try {
            return tokenMaskManager.O0000Oo0;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public static /* synthetic */ SystemManager O00000oo(TokenMaskManager tokenMaskManager) {
        try {
            return tokenMaskManager.O00000Oo;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public static /* synthetic */ gs2 O0000O0o(TokenMaskManager tokenMaskManager) {
        try {
            return tokenMaskManager.O0000o0O;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public static /* synthetic */ gs2 O0000OOo(TokenMaskManager tokenMaskManager) {
        try {
            return tokenMaskManager.O0000o0;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    private synchronized String popToken(String str, CacheKey cacheKey, gs2 gs2Var, LruCache<String, Cache<String>> lruCache, long j) {
        try {
            if (O00000Oo(cacheKey)) {
                return null;
            }
            if (!O000000o(str, cacheKey.getKey(), lruCache, j)) {
                this.O0000O0o.O000000o("There's no valid token!");
                return null;
            }
            Cache<String> cache = lruCache.get(str);
            if (cache != null) {
                try {
                    if (cache.getKey() != null && cache.getKey().equals(cacheKey.getKey())) {
                        lruCache.remove(str);
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry<String, Cache<String>> entry : lruCache.snapshot().entrySet()) {
                            jSONObject.put(entry.getKey(), entry.getValue().toJson());
                        }
                        String jSONObject2 = jSONObject.toString();
                        gs2Var.b(sy4.e(jSONObject2, this.O00000Oo.O000000o() + this.O00000Oo.O00000Oo()));
                        return cache.getValue();
                    }
                } catch (Exception e) {
                    this.O0000O0o.O00000o("pop token failed!", ln8.a(e));
                    return null;
                }
            }
            return null;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public LoginPhoneInfo O000000o(CacheKey cacheKey) {
        try {
            if (O00000Oo(cacheKey)) {
                return null;
            }
            return (!cacheKey.isLocalIp() || this.O0000Oo0 == null || !cacheKey.getKey().equals(this.O0000Oo0.getKey())) ? this.O0000OOo.get(cacheKey.getKey()) : this.O0000Oo0.getValue();
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public static /* synthetic */ String O000000o(TokenMaskManager tokenMaskManager, String str, String str2, boolean z) {
        try {
            return tokenMaskManager.O000000o(str, str2, z);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private synchronized void O00000o() {
        try {
            try {
                String decryptContent = this.O00000Oo.decryptContent(this.O0000Ooo.a());
                HashMap hashMap = null;
                if (!TextUtils.isEmpty(decryptContent)) {
                    JSONObject jSONObject = new JSONObject(decryptContent);
                    if (jSONObject.length() > 0) {
                        hashMap = new HashMap(jSONObject.length());
                    }
                    Iterator<String> keys = jSONObject.keys();
                    swf<String> swfVar = new swf<String>() { // from class: com.mobile.auth.gatewayauth.manager.TokenMaskManager.5
                    };
                    while (keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, Cache.fromJson(jSONObject.optJSONObject(next), swfVar));
                    }
                }
                if (hashMap != null) {
                    this.O0000Oo.evictAll();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        this.O0000Oo.put(entry.getKey(), entry.getValue());
                    }
                }
            } catch (Exception e) {
                this.O0000O0o.O00000o("loadLoginTokenFromDisk failed!", ln8.a(e));
            }
        } finally {
        }
    }

    public static /* synthetic */ void O00000o0(TokenMaskManager tokenMaskManager) {
        try {
            tokenMaskManager.O00000oO();
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private synchronized void O00000oO() {
        try {
            try {
                String decryptContent = this.O00000Oo.decryptContent(this.O0000o00.a());
                HashMap hashMap = null;
                if (!TextUtils.isEmpty(decryptContent)) {
                    JSONObject jSONObject = new JSONObject(decryptContent);
                    if (jSONObject.length() > 0) {
                        hashMap = new HashMap(jSONObject.length());
                    }
                    Iterator<String> keys = jSONObject.keys();
                    swf<String> swfVar = new swf<String>() { // from class: com.mobile.auth.gatewayauth.manager.TokenMaskManager.6
                    };
                    while (keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, Cache.fromJson(jSONObject.optJSONObject(next), swfVar));
                    }
                }
                if (hashMap != null) {
                    this.O0000OoO.evictAll();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        this.O0000OoO.put(entry.getKey(), entry.getValue());
                    }
                }
            } catch (Exception e) {
                this.O0000O0o.O00000o("loadVerifyTokenFromDisk failed!", ln8.a(e));
            }
        } finally {
        }
    }

    private synchronized void O00000oo() {
        try {
            if (this.O0000OOo != null) {
                this.O0000OOo.clear();
            }
            UTSharedPreferencesHelper.clearAppInfo(this.O00000Oo.O00000oO(), UTSharedPreferencesHelper.MASK_IMSI_KEY);
            if (this.O0000Oo0 != null) {
                this.O0000Oo0.clear();
            }
            UTSharedPreferencesHelper.clearAppInfo(this.O00000Oo.O00000oO(), UTSharedPreferencesHelper.MASK_LOCAL_IP_KEY);
        } finally {
        }
    }

    private synchronized void O0000O0o() {
        try {
            if (this.O0000Oo != null) {
                this.O0000Oo.evictAll();
            }
            UTSharedPreferencesHelper.clearAppInfo(this.O00000Oo.O00000oO(), UTSharedPreferencesHelper.LOGIN_TOKEN_KEY);
        } finally {
        }
    }

    private synchronized void O0000OOo() {
        try {
            if (this.O0000OoO != null) {
                this.O0000OoO.evictAll();
            }
            UTSharedPreferencesHelper.clearAppInfo(this.O00000Oo.O00000oO(), UTSharedPreferencesHelper.VERIFY_TOKEN_KEY);
        } finally {
        }
    }

    public void O00000Oo(long j, final String str, final RequestCallback<String, O00000Oo> requestCallback, final CacheKey cacheKey, long j2, final String str2, String str3, String str4) {
        if (requestCallback != null) {
            try {
                if (O00000Oo(str2, cacheKey.getKey(), j2)) {
                    requestCallback.onSuccess("true");
                    this.O0000O0o.O000000o("Update VerifyToken from cache!");
                } else if (this.O000000o.O00000o()) {
                    requestCallback.onError(O00000Oo.O000000o(Constant.CODE_ERROR_FUNCTION_LIMIT, "该功能已达最大调用次数"));
                } else {
                    this.O000000o.O00000oO();
                    n5o.a().b(new OO0000o(this.O00000oO, new qv2<OO00O0>(ThreadStrategy.SAME_WITH_CALLABLE, 2000L) { // from class: com.mobile.auth.gatewayauth.manager.TokenMaskManager.3
                        public void O000000o(OO00O0 oo00o0) {
                            try {
                                TokenMaskManager.O00000o(TokenMaskManager.this).O000000o("Update VerifyToken from network!");
                                if (oo00o0.O000000o()) {
                                    oo00o0.O00000Oo().O000000o(Math.min(System.currentTimeMillis() + 86400000, oo00o0.O00000Oo().O00000oo()));
                                    TokenMaskManager.O00000Oo(TokenMaskManager.this, str2, str, cacheKey, oo00o0.O00000Oo().O00000o(), oo00o0.O00000Oo().O00000oo());
                                    requestCallback.onSuccess("false");
                                    return;
                                }
                                O00000Oo O00000Oo = oo00o0.O00000Oo();
                                if (O00000Oo == null) {
                                    O00000Oo = O00000Oo.O000000o(ResultCode.CODE_ERROR_UNKNOWN_FAIL, "未知异常");
                                }
                                requestCallback.onError(O00000Oo);
                            } catch (Throwable th) {
                                try {
                                    ExceptionProcessor.processException(th);
                                } catch (Throwable th2) {
                                    ExceptionProcessor.processException(th2);
                                }
                            }
                        }

                        @Override // tb.qv2
                        public /* synthetic */ void onResult(OO00O0 oo00o0) {
                            try {
                                O000000o(oo00o0);
                            } catch (Throwable th) {
                                try {
                                    ExceptionProcessor.processException(th);
                                } catch (Throwable th2) {
                                    ExceptionProcessor.processException(th2);
                                }
                            }
                        }
                    }, j, str, O000000o.O00000Oo.O000000o().O000000o(str3).O00000Oo(str4).O000000o()));
                }
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
    }

    private String O000000o(String str, CacheKey cacheKey, long j) {
        try {
            return popToken(str, cacheKey, this.O0000Ooo, this.O0000Oo, j);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public void O00000Oo(long j, final String str, final RequestCallback<O00000Oo, O00000Oo> requestCallback, CacheKey cacheKey, String str2, long j2, int i, final String str3, final String str4) {
        if (requestCallback != null) {
            try {
                String O000000o = O000000o(str2, cacheKey, j2);
                O00000o0.O000000o().O000000o(str3, "tokenCache", System.currentTimeMillis());
                if (!TextUtils.isEmpty(O000000o)) {
                    this.O0000O0o.O000000o("Get LoginToken from cache!");
                    requestCallback.onSuccess(O00000Oo.O000000o().O00000o0(O000000o).O000000o(true).O000000o());
                } else if (this.O000000o.O000000o(i)) {
                    requestCallback.onError(O00000Oo.O000000o(Constant.CODE_ERROR_FUNCTION_LIMIT, "该功能已达最大调用次数"));
                } else {
                    this.O000000o.O00000Oo(i);
                    O00000o0.O000000o().O000000o(str3, "addLimitCount", System.currentTimeMillis());
                    n5o.a().b(new ooO0Ooo(new OooOO(this.O00000oO, str, j, str3) { // from class: com.mobile.auth.gatewayauth.manager.TokenMaskManager.16
                        @Override // com.mobile.auth.OooOO
                        public void O000000o(RequestCallback requestCallback2, O000000o o000000o) {
                            try {
                                o000000o.O00000Oo(requestCallback2, O000000o.O00000Oo.O000000o().O000000o(str3).O00000Oo(str4).O000000o());
                            } catch (Throwable th) {
                                try {
                                    ExceptionProcessor.processException(th);
                                } catch (Throwable th2) {
                                    ExceptionProcessor.processException(th2);
                                }
                            }
                        }
                    }, new qv2<OO00OO>(ThreadStrategy.SAME_WITH_CALLABLE, 2000L) { // from class: com.mobile.auth.gatewayauth.manager.TokenMaskManager.15
                        public void O000000o(OO00OO oo00oo) {
                            O00000Oo O00000Oo;
                            RequestCallback requestCallback2;
                            try {
                                TokenMaskManager.O00000o(TokenMaskManager.this).O000000o("Update LoginToken from network!");
                                if (oo00oo.O000000o()) {
                                    String O000000o2 = TokenMaskManager.O000000o(TokenMaskManager.this, oo00oo.O00000Oo().O00000o(), str, true);
                                    if (!TextUtils.isEmpty(O000000o2)) {
                                        oo00oo.O00000Oo().O00000o0(O000000o2);
                                        requestCallback.onSuccess(oo00oo.O00000Oo());
                                        return;
                                    }
                                    O00000Oo = oo00oo.O00000Oo();
                                    if (O00000Oo == null) {
                                        O00000Oo = O00000Oo.O000000o(ResultCode.CODE_DIRECT_ENCRPT_FAILED, ResultCode.MSG_DIRECT_ENCRPT_FAILED);
                                    }
                                    O00000Oo.O000000o(ResultCode.CODE_DIRECT_ENCRPT_FAILED);
                                    O00000Oo.O00000Oo(ResultCode.MSG_DIRECT_ENCRPT_FAILED);
                                    requestCallback2 = requestCallback;
                                } else {
                                    O00000Oo = oo00oo.O00000Oo();
                                    if (O00000Oo == null) {
                                        O00000Oo = O00000Oo.O000000o(ResultCode.CODE_ERROR_UNKNOWN_FAIL, "未知异常");
                                    }
                                    requestCallback2 = requestCallback;
                                }
                                requestCallback2.onError(O00000Oo);
                            } catch (Throwable th) {
                                try {
                                    ExceptionProcessor.processException(th);
                                } catch (Throwable th2) {
                                    ExceptionProcessor.processException(th2);
                                }
                            }
                        }

                        @Override // tb.qv2
                        public /* synthetic */ void onResult(OO00OO oo00oo) {
                            try {
                                O000000o(oo00oo);
                            } catch (Throwable th) {
                                try {
                                    ExceptionProcessor.processException(th);
                                } catch (Throwable th2) {
                                    ExceptionProcessor.processException(th2);
                                }
                            }
                        }
                    }, j, str3));
                    O00000o0.O000000o().O000000o(str3, "createCallable", System.currentTimeMillis());
                }
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
    }

    private String O000000o(String str, String str2, CacheKey cacheKey, long j) {
        try {
            return popToken(str, cacheKey, this.O0000o00, this.O0000OoO, j);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public static /* synthetic */ void O00000Oo(TokenMaskManager tokenMaskManager) {
        try {
            tokenMaskManager.O00000o();
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    private String O000000o(String str, String str2, boolean z) {
        try {
            O000000o O000000o = this.O00000oO.O000000o(str2);
            LoginPhoneInfo O000000o2 = O000000o(this.O00000Oo.getSimCacheKey(false, str2));
            return this.O00000oo.O000000o(this.O00000Oo.O00000oO(), EncryptUtils.generateAesKey(), str, str2, z, O000000o.O000000o(), O000000o.O00000Oo(), this.O00000Oo.O00000Oo(str2), this.O00000o.O00000o(), O000000o2 != null ? O000000o2.getPhoneNumber() : null);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public static /* synthetic */ void O00000Oo(TokenMaskManager tokenMaskManager, String str, String str2, CacheKey cacheKey, String str3, long j) {
        try {
            tokenMaskManager.O000000o(str, str2, cacheKey, str3, j);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    private synchronized void O00000Oo(String str, String str2, CacheKey cacheKey, String str3, long j) {
        try {
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } finally {
            }
        }
        if (!TextUtils.isEmpty(str3) || !O00000Oo(cacheKey)) {
            Cache cache = this.O0000Oo.get(str);
            if (cache == null) {
                cache = Cache.newIpCache().O000000o();
                this.O0000Oo.put(str, cache);
            }
            cache.setKey(cacheKey.getKey());
            cache.setValue(O000000o(str3, str2, true));
            cache.setExpiredTime(j);
            JSONObject jSONObject = new JSONObject();
            try {
                for (Map.Entry<String, Cache<String>> entry : this.O0000Oo.snapshot().entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue().toJson());
                }
            } catch (Exception e) {
                this.O0000O0o.O00000o("Cache login token error!", ln8.a(e));
            }
            this.O0000Ooo.b(this.O00000Oo.encryptContent(jSONObject.toString()));
        }
    }

    private void requestMask(long j, String str, final RequestCallback<OO00OO, O00000Oo> requestCallback, CacheKey cacheKey, String str2, int i, final String str3, final String str4) {
        try {
            if (this.O000000o.O000000o(i)) {
                requestCallback.onError(O00000Oo.O000000o(Constant.CODE_ERROR_FUNCTION_LIMIT, "该功能已达最大调用次数"));
                return;
            }
            this.O000000o.O00000Oo(i);
            O00000o0.O000000o().O000000o(str3, "addLimitCount", System.currentTimeMillis());
            n5o.a().b(new ooO0Ooo(new OooOO(this.O00000oO, str, j, str3) { // from class: com.mobile.auth.gatewayauth.manager.TokenMaskManager.12
                @Override // com.mobile.auth.OooOO
                public void O000000o(RequestCallback requestCallback2, O000000o o000000o) {
                    try {
                        o000000o.O000000o(requestCallback2, O000000o.O00000Oo.O000000o().O000000o(str3).O00000Oo(str4).O000000o());
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            }, new qv2<OO00OO>(ThreadStrategy.SAME_WITH_CALLABLE, 2000L) { // from class: com.mobile.auth.gatewayauth.manager.TokenMaskManager.11
                public void O000000o(OO00OO oo00oo) {
                    try {
                        if (oo00oo.O000000o()) {
                            requestCallback.onSuccess(oo00oo);
                            return;
                        }
                        O00000Oo O00000Oo = oo00oo.O00000Oo();
                        if (O00000Oo == null) {
                            O00000Oo = O00000Oo.O000000o(ResultCode.CODE_ERROR_UNKNOWN_FAIL, "未知异常");
                        }
                        requestCallback.onError(O00000Oo);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }

                @Override // tb.qv2
                public /* synthetic */ void onResult(OO00OO oo00oo) {
                    try {
                        O000000o(oo00oo);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            }, j, str3));
            O00000o0.O000000o().O000000o(str3, "createCallable", System.currentTimeMillis());
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public synchronized void O000000o() {
        try {
            for (O000000o o000000o : this.O00000oO.O000000o()) {
                o000000o.O00000o0();
            }
            O00000oo();
            O0000O0o();
            O0000OOo();
        } finally {
        }
    }

    public void updateMask(long j, final String str, final RequestCallback<O00000Oo, O00000Oo> requestCallback, final CacheKey cacheKey, int i, final String str2, String str3, String str4) {
        if (requestCallback != null) {
            try {
                if (this.O000000o.O00000o0()) {
                    requestCallback.onError(O00000Oo.O000000o(Constant.CODE_ERROR_FUNCTION_DEMOTE, "系统维护，功能不可用"));
                    return;
                }
                LoginPhoneInfo O000000o = O000000o(cacheKey);
                O00000o0.O000000o().O000000o(str3, "maskCache", System.currentTimeMillis());
                final CacheKey vendorCacheKey = this.O00000Oo.getVendorCacheKey(str);
                long O000000o2 = O00000o0.O000000o(str);
                O0Oo000 o0Oo000 = this.O0000O0o;
                StringBuilder sb = new StringBuilder("HasMaskCache:");
                sb.append(O000000o != null);
                o0Oo000.O000000o(sb.toString(), ", SimKey:", cacheKey.toString());
                if (O000000o != null) {
                    requestCallback.onSuccess(O00000Oo.O000000o().O000000o(true).O000000o(O000000o).O000000o());
                    if (!Constant.VENDOR_CMCC.equals(str) && !Constant.VENDOR_CUXZ.equals(str) && !O000000o(str2, vendorCacheKey.getKey(), O000000o2)) {
                        O000000o(j, str, new RequestCallback<String, O00000Oo>() { // from class: com.mobile.auth.gatewayauth.manager.TokenMaskManager.9
                            public void O000000o(O00000Oo o00000Oo) {
                                try {
                                    TokenMaskManager.O00000o(TokenMaskManager.this).O00000o("Update LoginToken failed when update mask!", o00000Oo == null ? "" : o00000Oo.toString());
                                } catch (Throwable th) {
                                    try {
                                        ExceptionProcessor.processException(th);
                                    } catch (Throwable th2) {
                                        ExceptionProcessor.processException(th2);
                                    }
                                }
                            }

                            @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
                            public /* synthetic */ void onError(O00000Oo o00000Oo) {
                                try {
                                    O000000o(o00000Oo);
                                } catch (Throwable th) {
                                    try {
                                        ExceptionProcessor.processException(th);
                                    } catch (Throwable th2) {
                                        ExceptionProcessor.processException(th2);
                                    }
                                }
                            }

                            @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
                            public /* synthetic */ void onSuccess(String str5) {
                                try {
                                    O000000o(str5);
                                } catch (Throwable th) {
                                    try {
                                        ExceptionProcessor.processException(th);
                                    } catch (Throwable th2) {
                                        ExceptionProcessor.processException(th2);
                                    }
                                }
                            }

                            public void O000000o(String str5) {
                                try {
                                    TokenMaskManager.O00000o(TokenMaskManager.this).O000000o("Update LoginToken success when update mask!");
                                } catch (Throwable th) {
                                    try {
                                        ExceptionProcessor.processException(th);
                                    } catch (Throwable th2) {
                                        ExceptionProcessor.processException(th2);
                                    }
                                }
                            }
                        }, vendorCacheKey, str2, O000000o2, i, str3, str4);
                        return;
                    }
                    return;
                }
                requestMask(j, str, new RequestCallback<OO00OO, O00000Oo>() { // from class: com.mobile.auth.gatewayauth.manager.TokenMaskManager.10
                    public void O000000o(OO00OO oo00oo) {
                        try {
                            LoginPhoneInfo build = LoginPhoneInfo.newLoginPhoneInfo().protocolName(oo00oo.O00000o0().O00000oO()).protocolUrl(oo00oo.O00000o0().O00000oo()).phoneNumber(oo00oo.O00000o0().O00000Oo()).build();
                            TokenMaskManager.O000000o(TokenMaskManager.this, cacheKey, build, str);
                            requestCallback.onSuccess(O00000Oo.O000000o().O000000o(false).O000000o(build).O000000o());
                            oo00oo.O00000Oo().O000000o(Math.min(System.currentTimeMillis() + 86400000, oo00oo.O00000Oo().O00000oo()));
                            if (!TextUtils.isEmpty(oo00oo.O00000Oo().O00000o())) {
                                TokenMaskManager.O000000o(TokenMaskManager.this, str2, str, vendorCacheKey, oo00oo.O00000Oo().O00000o(), oo00oo.O00000Oo().O00000oo());
                            }
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }

                    @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
                    public /* synthetic */ void onError(O00000Oo o00000Oo) {
                        try {
                            O000000o(o00000Oo);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }

                    @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
                    public /* synthetic */ void onSuccess(OO00OO oo00oo) {
                        try {
                            O000000o(oo00oo);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }

                    public void O000000o(O00000Oo o00000Oo) {
                        if (o00000Oo == null) {
                            try {
                                o00000Oo = O00000Oo.O000000o(ResultCode.CODE_ERROR_UNKNOWN_FAIL, "未知异常");
                            } catch (Throwable th) {
                                try {
                                    ExceptionProcessor.processException(th);
                                    return;
                                } catch (Throwable th2) {
                                    ExceptionProcessor.processException(th2);
                                    return;
                                }
                            }
                        }
                        requestCallback.onError(o00000Oo);
                    }
                }, cacheKey, str2, i, str3, str4);
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
    }

    private boolean O00000Oo(CacheKey cacheKey) {
        if (cacheKey != null) {
            try {
                if (!TextUtils.isEmpty(cacheKey.getKey())) {
                    return false;
                }
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                    return false;
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                    return false;
                }
            }
        }
        return true;
    }

    public void O000000o(long j, final String str, final RequestCallback<O00000Oo, O00000Oo> requestCallback, CacheKey cacheKey, long j2, String str2, String str3, String str4) {
        if (requestCallback != null) {
            try {
                String O000000o = O000000o(str2, str, cacheKey, j2);
                O00000o0.O000000o().O000000o(str3, "tokenCache", System.currentTimeMillis());
                if (!TextUtils.isEmpty(O000000o)) {
                    requestCallback.onSuccess(O00000Oo.O000000o().O000000o(true).O00000o0(O000000o).O000000o());
                    this.O0000O0o.O000000o("Get VerifyToken from cache!");
                } else if (this.O000000o.O00000o()) {
                    requestCallback.onError(O00000Oo.O000000o(Constant.CODE_ERROR_FUNCTION_LIMIT, "该功能已达最大调用次数"));
                } else {
                    this.O000000o.O00000oO();
                    O00000o0.O000000o().O000000o(str3, "addLimitCount", System.currentTimeMillis());
                    n5o.a().b(new OO0000o(this.O00000oO, new qv2<OO00O0>(ThreadStrategy.SAME_WITH_CALLABLE, 2000L) { // from class: com.mobile.auth.gatewayauth.manager.TokenMaskManager.2
                        public void O000000o(OO00O0 oo00o0) {
                            try {
                                TokenMaskManager.O00000o(TokenMaskManager.this).O000000o("Update VerifyToken from network!");
                                if (oo00o0.O000000o()) {
                                    oo00o0.O00000Oo().O00000o0(TokenMaskManager.O000000o(TokenMaskManager.this, oo00o0.O00000Oo().O00000o(), str, false));
                                    requestCallback.onSuccess(oo00o0.O00000Oo());
                                    return;
                                }
                                O00000Oo O00000Oo = oo00o0.O00000Oo();
                                if (O00000Oo == null) {
                                    O00000Oo = O00000Oo.O000000o(ResultCode.CODE_ERROR_UNKNOWN_FAIL, "未知异常");
                                }
                                requestCallback.onError(O00000Oo);
                            } catch (Throwable th) {
                                try {
                                    ExceptionProcessor.processException(th);
                                } catch (Throwable th2) {
                                    ExceptionProcessor.processException(th2);
                                }
                            }
                        }

                        @Override // tb.qv2
                        public /* synthetic */ void onResult(OO00O0 oo00o0) {
                            try {
                                O000000o(oo00o0);
                            } catch (Throwable th) {
                                try {
                                    ExceptionProcessor.processException(th);
                                } catch (Throwable th2) {
                                    ExceptionProcessor.processException(th2);
                                }
                            }
                        }
                    }, j, str, O000000o.O00000Oo.O000000o().O000000o(str3).O00000Oo(str4).O000000o()));
                    O00000o0.O000000o().O000000o(str3, "createCallable", System.currentTimeMillis());
                }
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
    }

    private boolean O00000Oo(String str, String str2, long j) {
        try {
            if (this.O0000OoO == null) {
                return false;
            }
            return O000000o(str, str2, this.O0000OoO, j);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    public void O000000o(long j, final String str, final RequestCallback<String, O00000Oo> requestCallback, final CacheKey cacheKey, final String str2, long j2, int i, final String str3, final String str4) {
        if (requestCallback != null) {
            try {
                if (this.O000000o.O000000o(i)) {
                    requestCallback.onError(O00000Oo.O000000o(Constant.CODE_ERROR_FUNCTION_LIMIT, "该功能已达最大调用次数"));
                    return;
                }
                this.O000000o.O00000Oo(i);
                n5o.a().b(new ooO0Ooo(new OooOO(this.O00000oO, str, j, str3) { // from class: com.mobile.auth.gatewayauth.manager.TokenMaskManager.14
                    @Override // com.mobile.auth.OooOO
                    public void O000000o(RequestCallback requestCallback2, O000000o o000000o) {
                        try {
                            o000000o.O00000Oo(requestCallback2, O000000o.O00000Oo.O000000o().O000000o(str3).O00000Oo(str4).O000000o());
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }
                }, new qv2<OO00OO>(ThreadStrategy.SAME_WITH_CALLABLE, 2000L) { // from class: com.mobile.auth.gatewayauth.manager.TokenMaskManager.13
                    public void O000000o(OO00OO oo00oo) {
                        try {
                            TokenMaskManager.O00000o(TokenMaskManager.this).O000000o("Update LoginToken from network!");
                            if (oo00oo.O000000o()) {
                                oo00oo.O00000Oo().O000000o(Math.min(System.currentTimeMillis() + 86400000, oo00oo.O00000Oo().O00000oo()));
                                TokenMaskManager.O000000o(TokenMaskManager.this, str2, str, cacheKey, oo00oo.O00000Oo().O00000o(), oo00oo.O00000Oo().O00000oo());
                                requestCallback.onSuccess("false");
                                return;
                            }
                            O00000Oo O00000Oo = oo00oo.O00000Oo();
                            if (O00000Oo == null) {
                                O00000Oo = O00000Oo.O000000o(ResultCode.CODE_ERROR_UNKNOWN_FAIL, "未知异常");
                            }
                            requestCallback.onError(O00000Oo);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }

                    @Override // tb.qv2
                    public /* synthetic */ void onResult(OO00OO oo00oo) {
                        try {
                            O000000o(oo00oo);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }
                }, j, str3));
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
    }

    public static /* synthetic */ void O000000o(TokenMaskManager tokenMaskManager) {
        try {
            tokenMaskManager.O00000o0();
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public static /* synthetic */ void O000000o(TokenMaskManager tokenMaskManager, CacheKey cacheKey, LoginPhoneInfo loginPhoneInfo, String str) {
        try {
            tokenMaskManager.O000000o(cacheKey, loginPhoneInfo, str);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public static /* synthetic */ void O000000o(TokenMaskManager tokenMaskManager, String str, String str2, CacheKey cacheKey, String str3, long j) {
        try {
            tokenMaskManager.O00000Oo(str, str2, cacheKey, str3, j);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    private synchronized void O000000o(CacheKey cacheKey, LoginPhoneInfo loginPhoneInfo, String str) {
        if (loginPhoneInfo != null) {
            try {
                if (O00000Oo(cacheKey)) {
                    cacheKey = this.O00000Oo.getSimCacheKey(false, str);
                }
            } finally {
            }
            if (!O00000Oo(cacheKey)) {
                if (cacheKey.isLocalIp()) {
                    this.O0000Oo0 = Cache.newIpCache().O000000o(cacheKey.getKey()).O000000o((Cache.O000000o) loginPhoneInfo).O000000o(System.currentTimeMillis() + 86400000).O000000o();
                    O0000O0o.O000000o(new Runnable() { // from class: com.mobile.auth.gatewayauth.manager.TokenMaskManager.7
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                TokenMaskManager.O0000O0o(TokenMaskManager.this).b(TokenMaskManager.O00000oo(TokenMaskManager.this).encryptContent(TokenMaskManager.O00000oO(TokenMaskManager.this).toJson().toString()));
                            } catch (Throwable th) {
                                try {
                                    ExceptionProcessor.processException(th);
                                } catch (Throwable th2) {
                                    ExceptionProcessor.processException(th2);
                                }
                            }
                        }
                    });
                } else {
                    try {
                        this.O0000OOo.put(cacheKey.getKey(), loginPhoneInfo);
                        final JSONObject jSONObject = new JSONObject();
                        for (Map.Entry<String, LoginPhoneInfo> entry : this.O0000OOo.entrySet()) {
                            jSONObject.put(entry.getKey(), wrf.n(entry.getValue(), null));
                        }
                        O0000O0o.O000000o(new Runnable() { // from class: com.mobile.auth.gatewayauth.manager.TokenMaskManager.8
                            @Override // java.lang.Runnable
                            public void run() {
                                try {
                                    TokenMaskManager.O0000OOo(TokenMaskManager.this).b(TokenMaskManager.O00000oo(TokenMaskManager.this).encryptContent(jSONObject.toString()));
                                } catch (Throwable th) {
                                    try {
                                        ExceptionProcessor.processException(th);
                                    } catch (Throwable th2) {
                                        ExceptionProcessor.processException(th2);
                                    }
                                }
                            }
                        });
                    } catch (Exception e) {
                        this.O0000O0o.O00000o("Cache mask error!", ln8.a(e));
                    }
                }
            }
        }
    }

    private synchronized void O000000o(String str, String str2, CacheKey cacheKey, String str3, long j) {
        try {
        } finally {
        }
        if (!TextUtils.isEmpty(str3)) {
            if (O00000Oo(cacheKey)) {
                cacheKey = this.O00000Oo.getSimCacheKey(false, str2);
            }
            if (!O00000Oo(cacheKey)) {
                Cache cache = this.O0000OoO.get(str);
                if (cache == null) {
                    cache = Cache.newIpCache().O000000o();
                    this.O0000OoO.put(str, cache);
                }
                cache.setKey(cacheKey.getKey());
                cache.setValue(O000000o(str3, str2, false));
                cache.setExpiredTime(j);
                JSONObject jSONObject = new JSONObject();
                try {
                    for (Map.Entry<String, Cache<String>> entry : this.O0000OoO.snapshot().entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue().toJson());
                    }
                } catch (Exception e) {
                    this.O0000O0o.O00000o("Cache verify token error!", ln8.a(e));
                }
                this.O0000o00.b(this.O00000Oo.encryptContent(jSONObject.toString()));
            }
        }
    }

    private boolean O000000o(String str, String str2, long j) {
        try {
            if (this.O0000Oo == null) {
                return false;
            }
            return O000000o(str, str2, this.O0000Oo, j);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    private synchronized boolean O000000o(String str, String str2, LruCache<String, Cache<String>> lruCache, long j) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return this.O00000Oo.O000000o(str2, lruCache.get(str), j);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }
}
