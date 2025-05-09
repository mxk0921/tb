package com.mobile.auth.gatewayauth.manager;

import android.content.Context;
import android.os.Debug;
import android.os.Looper;
import android.text.TextUtils;
import com.mobile.auth.O0Oo000;
import com.mobile.auth.gatewayauth.Constant;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.manager.base.Cache;
import com.mobile.auth.gatewayauth.manager.base.CacheKey;
import com.mobile.auth.gatewayauth.manager.compat.ResultCodeProcessor;
import com.mobile.auth.gatewayauth.model.TokenRet;
import com.mobile.auth.gatewayauth.utils.O00000Oo;
import com.mobile.auth.gatewayauth.utils.O00000o;
import com.mobile.auth.gatewayauth.utils.O0000Oo0;
import com.mobile.auth.gatewayauth.utils.security.CheckProxy;
import com.mobile.auth.gatewayauth.utils.security.CheckRoot;
import com.mobile.auth.gatewayauth.utils.security.EmulatorDetector;
import com.mobile.auth.gatewayauth.utils.security.PackageUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import tb.ln8;
import tb.sy4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class SystemManager {
    private final Context O000000o;
    private String O00000Oo;
    private final O0Oo000 O00000o;
    private String O00000o0;
    private volatile boolean O00000oO = true;
    private Future<?> O00000oo;

    public SystemManager(final Context context, O0Oo000 o0Oo000) {
        this.O000000o = context.getApplicationContext();
        this.O00000oo = ln8.b().h(new Runnable() { // from class: com.mobile.auth.gatewayauth.manager.SystemManager.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SystemManager.O000000o(SystemManager.this, PackageUtils.getPackageName(context));
                    SystemManager.O00000Oo(SystemManager.this, PackageUtils.getSign(context));
                } catch (Throwable th) {
                    try {
                        ExceptionProcessor.processException(th);
                    } catch (Throwable th2) {
                        ExceptionProcessor.processException(th2);
                    }
                }
            }
        });
        this.O00000o = o0Oo000;
    }

    private TokenRet O000000o(ResultCodeProcessor resultCodeProcessor, String str) {
        try {
            if (!O00000Oo.O00000oo(this.O000000o)) {
                return resultCodeProcessor.convertErrorInfo(Constant.CODE_ERROR_NO_SIM_FAIL, "SIM卡无法检测", str);
            }
            if (!O00000Oo.O00000oO(this.O000000o)) {
                return resultCodeProcessor.convertErrorInfo(Constant.CODE_ERROR_NO_MOBILE_NETWORK_FAIL, "移动网络未开启", str);
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

    public synchronized String O00000Oo() {
        try {
            Future<?> future = this.O00000oo;
            if (future != null) {
                try {
                    future.get();
                    this.O00000oo = null;
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
        return this.O00000o0;
    }

    public String O00000o() {
        try {
            return O00000Oo.O00000o0(this.O000000o);
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

    public String O00000o0() {
        try {
            return O00000Oo.O00000Oo(this.O000000o);
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

    public Context O00000oO() {
        try {
            return this.O000000o;
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

    public String O00000oo(String str) {
        try {
            return Constant.ACTION_SDK + O00000Oo(str).toLowerCase() + Constant.ACTION_SDK_LOGIN_TOKEN;
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

    public String O0000O0o(String str) {
        try {
            return Constant.ACTION_SDK + O00000Oo(str).toLowerCase() + Constant.ACTION_SDK_AUTH_TOKEN;
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

    public TokenRet checkEnvSafe(ResultCodeProcessor resultCodeProcessor, String str) {
        try {
            try {
                String isDeviceRooted = CheckRoot.isDeviceRooted();
                if (!TextUtils.isEmpty(isDeviceRooted)) {
                    return resultCodeProcessor.convertErrorInfo(Constant.CODE_ERROR_PHONE_UNSAFE_FAIL, "手机终端不安全:the phone is root, " + isDeviceRooted, str);
                } else if (Thread.currentThread() == Looper.getMainLooper().getThread() && EmulatorDetector.isEmulator(this.O000000o)) {
                    return resultCodeProcessor.convertErrorInfo(Constant.CODE_ERROR_PHONE_UNSAFE_FAIL, "手机终端不安全:Emulator is detected, please use real phone!", str);
                } else {
                    if (CheckProxy.isDevicedProxy(this.O000000o)) {
                        return resultCodeProcessor.convertErrorInfo(Constant.CODE_ERROR_PHONE_UNSAFE_FAIL, "手机终端不安全:the phone is proxy, please do not proxy!", str);
                    }
                    if (!Debug.isDebuggerConnected() || O0000Oo0.O000000o()) {
                        return null;
                    }
                    return resultCodeProcessor.convertErrorInfo(Constant.CODE_ERROR_PHONE_UNSAFE_FAIL, "手机终端不安全:the app is debuggerConnected, please do not debug!", str);
                }
            } catch (Exception e) {
                return resultCodeProcessor.convertErrorInfo(Constant.CODE_ERROR_PHONE_UNSAFE_FAIL, "无法判运营商: " + e.getMessage(), str);
            }
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

    public synchronized String decryptContent(String str) {
        try {
            try {
                if (!TextUtils.isEmpty(str)) {
                    str = sy4.e(str, O000000o() + O00000Oo());
                }
            } catch (Exception e) {
                this.O00000o.O00000o("Decrypt content failed !", ln8.a(e), "|content:", str);
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
        return str;
    }

    public synchronized String encryptContent(String str) {
        try {
            try {
                if (!TextUtils.isEmpty(str)) {
                    str = sy4.i(str, O000000o() + O00000Oo());
                }
            } catch (Exception e) {
                this.O00000o.O00000o("Encrypt content failed!", ln8.a(e));
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
        return str;
    }

    public CacheKey getSimCacheKey(boolean z, String str) {
        if (!z) {
            try {
                if (FeatureManager.getInstance().get(FeatureManager.FEATURE_KEY_CACHE_LEVEL_VENDOR) == null) {
                    String O000000o = O00000o.O000000o(this.O000000o);
                    if (!TextUtils.isEmpty(O000000o)) {
                        return CacheKey.newSimKey().O000000o(O000000o).O000000o(false).O000000o();
                    }
                    return null;
                }
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
        return getVendorCacheKey(str);
    }

    public CacheKey getVendorCacheKey(String str) {
        try {
            return CacheKey.newSimKey().O000000o(str).O000000o(false).O000000o();
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

    public static /* synthetic */ String O00000Oo(SystemManager systemManager, String str) {
        try {
            systemManager.O00000o0 = str;
            return str;
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

    public TokenRet O000000o(ResultCodeProcessor resultCodeProcessor, boolean z, String str) {
        try {
            TokenRet checkEnvSafe = checkEnvSafe(resultCodeProcessor, str);
            return (checkEnvSafe != null || !z) ? checkEnvSafe : O000000o(resultCodeProcessor, str);
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

    public String O00000o(String str) {
        try {
            return Constant.ACTION_SDK + O00000Oo(str).toLowerCase() + Constant.ACTION_SDK_PRE_AUTH_CODE;
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

    public String O00000o0(String str) {
        try {
            return Constant.ACTION_SDK + O00000Oo(str).toLowerCase() + Constant.ACTION_SDK_PRE_LOGIN_CODE;
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

    public String O00000oO(String str) {
        try {
            return Constant.ACTION_SDK + O00000Oo(str).toLowerCase() + Constant.ACTION_SDK_LOGIN_CODE;
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

    public synchronized String O000000o() {
        try {
            Future<?> future = this.O00000oo;
            if (future != null) {
                try {
                    future.get();
                    this.O00000oo = null;
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
        return this.O00000Oo;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String O00000Oo(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "unknown"
            if (r6 != 0) goto L_0x0006
            return r0
        L_0x0006:
            int r1 = r6.hashCode()     // Catch: all -> 0x0026
            r2 = -1350608857(0xffffffffaf7f5827, float:-2.3223433E-10)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x0032
            r2 = 95009260(0x5a9b9ec, float:1.596098E-35)
            if (r1 == r2) goto L_0x0028
            r2 = 880617272(0x347d2738, float:2.3576729E-7)
            if (r1 == r2) goto L_0x001c
            goto L_0x003c
        L_0x001c:
            java.lang.String r1 = "cm_zyhl"
            boolean r6 = r6.equals(r1)     // Catch: all -> 0x0026
            if (r6 == 0) goto L_0x003c
            r6 = 0
            goto L_0x003d
        L_0x0026:
            r6 = move-exception
            goto L_0x004d
        L_0x0028:
            java.lang.String r1 = "cu_xw"
            boolean r6 = r6.equals(r1)     // Catch: all -> 0x0026
            if (r6 == 0) goto L_0x003c
            r6 = 1
            goto L_0x003d
        L_0x0032:
            java.lang.String r1 = "ct_sjl"
            boolean r6 = r6.equals(r1)     // Catch: all -> 0x0026
            if (r6 == 0) goto L_0x003c
            r6 = 2
            goto L_0x003d
        L_0x003c:
            r6 = -1
        L_0x003d:
            if (r6 == 0) goto L_0x004a
            if (r6 == r4) goto L_0x0047
            if (r6 == r3) goto L_0x0044
            return r0
        L_0x0044:
            java.lang.String r6 = "CTCC"
            return r6
        L_0x0047:
            java.lang.String r6 = "CUCC"
            return r6
        L_0x004a:
            java.lang.String r6 = "CMCC"
            return r6
        L_0x004d:
            r0 = 0
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r6)     // Catch: all -> 0x0052
            return r0
        L_0x0052:
            r6 = move-exception
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.gatewayauth.manager.SystemManager.O00000Oo(java.lang.String):java.lang.String");
    }

    public static /* synthetic */ String O000000o(SystemManager systemManager, String str) {
        try {
            systemManager.O00000Oo = str;
            return str;
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

    public void O000000o(String str) {
        try {
            if ((FeatureManager.getInstance().get("whiteFileCheck") == null || !"false".equals(FeatureManager.getInstance().get("whiteFileCheck").toString())) && !TextUtils.isEmpty(str)) {
                InputStream inputStream = null;
                try {
                    String k = sy4.k(str);
                    if (!TextUtils.isEmpty(k)) {
                        InputStream open = this.O000000o.getAssets().open(k);
                        this.O00000oO = false;
                        if (open != null) {
                            try {
                                open.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    } else {
                        this.O00000oO = true;
                    }
                } catch (Exception unused) {
                    this.O00000oO = true;
                    if (0 != 0) {
                        try {
                            inputStream.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public synchronized <T> boolean O000000o(String str, Cache<T> cache, long j) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (cache != null && cache.getKey() != null && cache.getKey().equals(str) && cache.getExpiredTime() - j > currentTimeMillis) {
                return true;
            }
            if (cache != null) {
                this.O00000o.O000000o("ExpiredTime:", String.valueOf(cache.getExpiredTime()), "|threshold:", String.valueOf(j), "|currTime:", String.valueOf(currentTimeMillis));
            }
            return false;
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
