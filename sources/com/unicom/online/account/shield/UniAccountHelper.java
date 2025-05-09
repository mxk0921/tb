package com.unicom.online.account.shield;

import android.content.Context;
import android.text.TextUtils;
import com.mobile.auth.OO0OO0o;
import com.mobile.auth.OO0OOo0;
import com.mobile.auth.OO0Oo00;
import com.mobile.auth.OOO;
import com.mobile.auth.OOO000o;
import com.mobile.auth.OOO00O0;
import com.mobile.auth.OOO00Oo;
import com.mobile.auth.OOO0OO0;
import com.mobile.auth.OOO0oO;
import com.mobile.auth.OOOO0;
import com.mobile.auth.OOOO00O;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.oOo00;
import java.net.URLDecoder;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import tb.x96;
import tb.y1r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class UniAccountHelper {
    public static final int CU_GET_TOKEN_IT = 2;
    private static final int SUCCESS = 100;
    private static volatile UniAccountHelper s_instance;
    private Context mContext = null;

    private UniAccountHelper() {
    }

    public static /* synthetic */ boolean access$000(UniAccountHelper uniAccountHelper) {
        try {
            return uniAccountHelper.getUseCacheFlag();
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return false;
        }
    }

    public static /* synthetic */ Context access$100(UniAccountHelper uniAccountHelper) {
        try {
            return uniAccountHelper.mContext;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    private String getHostName() {
        try {
            OO0Oo00.O000000o();
            return OO0Oo00.O00000o();
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static UniAccountHelper getInstance() {
        try {
            if (s_instance == null) {
                synchronized (UniAccountHelper.class) {
                    if (s_instance == null) {
                        s_instance = new UniAccountHelper();
                    }
                }
            }
            return s_instance;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    private String getSdkVersion() {
        try {
            OO0Oo00.O000000o();
            return OO0Oo00.O00000Oo();
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    private boolean getUseCacheFlag() {
        try {
            return OOO0OO0.O000000o;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return false;
        }
    }

    private void initFail(int i, ResultListener resultListener, String str) {
        try {
            oOo00.O000000o("type:" + i + "\nmsg:" + str);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("resultCode", 410021);
                jSONObject.put("resultMsg", str);
                jSONObject.put("resultData", "");
                jSONObject.put(y1r.COL_SEQ, "");
                if (resultListener != null) {
                    resultListener.onResult(jSONObject.toString());
                }
            } catch (Exception unused) {
                oOo00.O000000o();
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    private UniAccountHelper setUseCacheFlag(boolean z) {
        try {
            OOO0OO0.O000000o = z;
            return s_instance;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public String cuDebugInfo(String str) {
        try {
            if (this.mContext == null) {
                return "sdk 未初始化, context 为空";
            }
            return OO0Oo00.O000000o().O000000o(str);
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public void cuGetToken(int i, ResultListener resultListener) {
        try {
            cuPreGetToken(i, 2, "cuPreGetToken", resultListener);
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public UniAccountHelper init(Context context, String str) {
        try {
            return init(context, str, false);
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public void releaseNetwork() {
        try {
            OO0Oo00.O000000o();
            OO0Oo00.O0000O0o();
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public UniAccountHelper setApiKey(Context context, String str) {
        try {
            return setAppid(context, str);
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public void setLogEnable(boolean z) {
        try {
            oOo00.O000000o(z);
            OO0Oo00.O000000o();
            OO0Oo00.O000000o(z);
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    private UniAccountHelper initHostName(String str) {
        try {
            OO0Oo00.O000000o();
            if (OO0Oo00.O00000Oo(str)) {
                return s_instance;
            }
            oOo00.O000000o("初始化参数错误");
            return null;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public UniAccountHelper init(Context context, String str, boolean z) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str)) {
                    this.mContext = context.getApplicationContext();
                    OO0Oo00 O000000o = OO0Oo00.O000000o();
                    OOOO0.O00000Oo();
                    OOOO0.O00000o0("cuPreGetToken");
                    OOOO0.O00000o0();
                    try {
                    } catch (Exception unused) {
                        OOO.O00000Oo();
                    }
                    if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str)) {
                        OOO0OO0.O000000o = false;
                        O000000o.O000000o = context.getApplicationContext();
                        OOOO00O.O00000Oo(str);
                        OOOO00O.O00000o0(str);
                        OOOO00O.O00000oo(OOOO0.O00000o0(O000000o.O000000o));
                        OOOO00O.O00000oO();
                        OOO.O00000o0("backupIp=" + OOOO00O.O000000o);
                        OO0Oo00.O00000Oo("ali.wosms.cn");
                        OO0Oo00.O00000oo();
                        OO0Oo00.O00000o0();
                        OO0OO0o.O000000o = str;
                        setLogEnable(false);
                        return s_instance;
                    }
                    OOO.O00000oO("初始化参数不能为空");
                    OO0OO0o.O000000o = str;
                    setLogEnable(false);
                    return s_instance;
                }
            } catch (Throwable th) {
                ExceptionProcessor.processException(th);
                return null;
            }
        }
        oOo00.O000000o("初始化参数不能为空");
        return null;
    }

    public UniAccountHelper setCertFingerType(String str) {
        try {
            if (!str.equalsIgnoreCase("MD5") && !str.equalsIgnoreCase("SHA1") && !str.equalsIgnoreCase("SHA256") && !str.equalsIgnoreCase("sm3")) {
                return null;
            }
            OOO0OO0.O00000Oo = str.toLowerCase();
            return s_instance;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public UniAccountHelper setAppid(Context context, String str) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    this.mContext = context.getApplicationContext();
                    OO0Oo00 O000000o = OO0Oo00.O000000o();
                    try {
                        O000000o.O000000o = context.getApplicationContext();
                        OOOO00O.O00000Oo(str);
                        OOOO00O.O00000oo(OOOO0.O00000o0(O000000o.O000000o));
                    } catch (Exception unused) {
                        OOO.O00000Oo();
                    }
                    OO0OO0o.O000000o = str;
                    return s_instance;
                }
            } catch (Throwable th) {
                ExceptionProcessor.processException(th);
                return null;
            }
        }
        oOo00.O000000o("初始化参数不能为空");
        return null;
    }

    private void cuPreGetToken(int i, final int i2, final String str, final ResultListener resultListener) {
        try {
            Context context = this.mContext;
            if (context == null) {
                initFail(i2, resultListener, "sdk未初始化");
            } else if (OO0Oo00.O00000o(context.getApplicationContext())) {
                if (getUseCacheFlag()) {
                    OO0Oo00.O000000o();
                    String O000000o = OO0Oo00.O000000o(this.mContext, "type".concat(String.valueOf(i2)), str);
                    if (OO0OO0o.O00000oO(O000000o).booleanValue()) {
                        try {
                            JSONObject jSONObject = new JSONObject(O000000o);
                            int i3 = jSONObject.getInt("resultCode");
                            jSONObject.getInt("type");
                            long j = jSONObject.getJSONObject("resultData").getLong("exp");
                            if (i3 == 100 && j > System.currentTimeMillis()) {
                                resultListener.onResult(O000000o);
                                return;
                            }
                        } catch (Exception unused) {
                        }
                    }
                    OO0Oo00.O000000o();
                    OO0Oo00.O00000oO(this.mContext);
                }
                OO0Oo00.O000000o();
                if (!OO0Oo00.O000000o(this.mContext)) {
                    initFail(i2, resultListener, "操作频繁,请稍后再试");
                } else if (!str.equals("cuPreGetToken")) {
                    initFail(i2, resultListener, "sdk参数错误");
                } else if (i2 != 2) {
                    initFail(i2, resultListener, "sdk type 参数错误");
                } else {
                    OO0Oo00 O000000o2 = OO0Oo00.O000000o();
                    OO0OOo0 oO0OOo0 = new OO0OOo0() { // from class: com.unicom.online.account.shield.UniAccountHelper.1
                        @Override // com.mobile.auth.OO0OOo0
                        public void onResult(String str2) {
                            try {
                                try {
                                    JSONObject jSONObject2 = new JSONObject(str2);
                                    OO0OO0o.O00000o(jSONObject2.optString(y1r.COL_SEQ));
                                    int i4 = jSONObject2.getInt("resultCode");
                                    jSONObject2.getString("resultMsg");
                                    if (i4 == 100) {
                                        JSONObject jSONObject3 = jSONObject2.getJSONObject("resultData");
                                        OO0OO0o.O00000Oo(jSONObject3.optString("fakeMobile"));
                                        OO0OO0o.O00000o0(jSONObject3.optString("accessCode"));
                                        OO0OO0o.O00000Oo(jSONObject3.getLong("exp"));
                                        OO0OO0o.O000000o(System.currentTimeMillis());
                                        String optString = jSONObject2.optString(x96.PATH_OPERATOR);
                                        if (!TextUtils.isEmpty(optString)) {
                                            OO0OO0o.O000000o(optString);
                                        }
                                        if (UniAccountHelper.access$000(UniAccountHelper.this)) {
                                            OO0Oo00.O000000o();
                                            OO0Oo00.O00000oO(UniAccountHelper.access$100(UniAccountHelper.this));
                                            OO0Oo00.O000000o();
                                            Context access$100 = UniAccountHelper.access$100(UniAccountHelper.this);
                                            OO0Oo00.O000000o(access$100, "type" + i2, str, jSONObject2.toString());
                                        }
                                        OO0Oo00.O000000o();
                                        OO0Oo00.O00000Oo(UniAccountHelper.access$100(UniAccountHelper.this));
                                    } else {
                                        OO0Oo00.O000000o();
                                        OO0Oo00.O00000o0(UniAccountHelper.access$100(UniAccountHelper.this));
                                    }
                                    resultListener.onResult(jSONObject2.toString());
                                } catch (JSONException unused2) {
                                    oOo00.O000000o();
                                }
                            } catch (Throwable th) {
                                ExceptionProcessor.processException(th);
                            }
                        }
                    };
                    if (O000000o2.O000000o != null && !TextUtils.isEmpty(OOOO00O.O00000o0()) && !TextUtils.isEmpty(OOOO00O.O00000o())) {
                        OOOO0.O00000Oo();
                        OOOO0.O00000o0("cuPreGetToken");
                        OOOO0.O00000o0();
                        OOOO00O.O00000Oo(i);
                        final OOO000o oOO000o = new OOO000o();
                        final Context context2 = O000000o2.O000000o;
                        OOO00O0 ooo00o0 = new OOO00O0();
                        oOO000o.O00000Oo = ooo00o0;
                        ooo00o0.O000000o = oO0OOo0;
                        try {
                            oOO000o.O000000o.schedule(new Runnable() { // from class: com.mobile.auth.OOO000o.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    try {
                                        synchronized (oOO000o) {
                                            try {
                                                OOO00O0 ooo00o02 = oOO000o.O00000Oo;
                                                if (ooo00o02 != null) {
                                                    ooo00o02.O000000o(i2, 410000, "请求超时", "", "");
                                                    OOO000o oOO000o2 = oOO000o;
                                                    oOO000o2.O00000Oo = null;
                                                    OOO000o.O000000o(oOO000o2);
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        ExceptionProcessor.processException(th2);
                                    }
                                }
                            }, i, TimeUnit.MILLISECONDS);
                            final OOO00Oo oOO00Oo = new OOO00Oo() { // from class: com.mobile.auth.OOO000o.2
                                @Override // com.mobile.auth.OOO00Oo
                                public final void O000000o(int i4, int i5, String str2) {
                                    String str3;
                                    try {
                                        synchronized (oOO000o) {
                                            if (oOO000o.O00000Oo != null) {
                                                if (i5 == 1) {
                                                    try {
                                                        JSONObject jSONObject2 = new JSONObject(str2);
                                                        int optInt = jSONObject2.optInt("code");
                                                        String optString = jSONObject2.optString("msg");
                                                        String optString2 = jSONObject2.optString("data");
                                                        String optString3 = jSONObject2.optString(y1r.COL_SEQ);
                                                        if (optInt == 100) {
                                                            String O000000o3 = OOOO0.O000000o();
                                                            String decode = URLDecoder.decode(OOOO0.O00000Oo(optString2, O000000o3.substring(0, 16), O000000o3.substring(16, 32)), "UTF-8");
                                                            if (!TextUtils.isEmpty(decode)) {
                                                                OOO.O00000Oo("\nmsg=" + optString + "\ncontent=" + decode + "\nseq=" + optString3 + "\n");
                                                                OOO00O0 ooo00o02 = oOO000o.O00000Oo;
                                                                try {
                                                                    if (ooo00o02.O000000o != null) {
                                                                        JSONObject jSONObject3 = new JSONObject();
                                                                        jSONObject3.put("resultCode", 100);
                                                                        jSONObject3.put("resultMsg", optString);
                                                                        jSONObject3.put(y1r.COL_SEQ, optString3);
                                                                        if (!TextUtils.isEmpty(decode)) {
                                                                            try {
                                                                                jSONObject3.put("resultData", new JSONObject(decode));
                                                                            } catch (JSONException unused2) {
                                                                                jSONObject3.put("resultData", decode);
                                                                            }
                                                                        } else {
                                                                            jSONObject3.put("resultData", "");
                                                                        }
                                                                        ooo00o02.O000000o.onResult(jSONObject3.toString());
                                                                        ooo00o02.O000000o = null;
                                                                    }
                                                                } catch (Exception unused3) {
                                                                    OOO.O00000Oo();
                                                                }
                                                            } else {
                                                                OOO.O00000Oo("\nmsg=" + optString + "\ndata=" + optString2 + "\nseq=" + optString3 + "\n");
                                                                oOO000o.O00000Oo.O000000o(i4, 410002, "数据异常", optString2, optString3);
                                                            }
                                                        } else {
                                                            if (optInt != -2 || TextUtils.isEmpty(OOOO00O.O00000oo())) {
                                                                str3 = optString;
                                                            } else {
                                                                str3 = optString + "apn is " + OOOO00O.O00000oo();
                                                            }
                                                            OOO.O00000Oo("\nmsg=" + str3 + "\ndata=" + optString2 + "\nseq=" + optString3 + "\n");
                                                            oOO000o.O00000Oo.O000000o(i4, optInt, str3, optString2, optString3);
                                                        }
                                                    } catch (Exception e) {
                                                        OOO.O00000Oo("\nresponse=" + str2 + "\n");
                                                        oOO000o.O00000Oo.O000000o(i4, 410002, "异常" + e.getMessage(), str2, "");
                                                    }
                                                } else {
                                                    OOO.O00000Oo("\nresponse=" + str2 + "\n");
                                                    oOO000o.O00000Oo.O000000o(i4, i5, str2, "", "seqAndroidEmpty");
                                                }
                                                OOO000o oOO000o2 = oOO000o;
                                                oOO000o2.O00000Oo = null;
                                                OOO000o.O000000o(oOO000o2);
                                            }
                                        }
                                    } catch (Throwable th) {
                                        ExceptionProcessor.processException(th);
                                    }
                                }
                            };
                            OOO.O00000o0("\n■★■★■★■★■★■★■★■★■★■\nrequestPreCheck()\n■★■★■★■★■★■★■★■★■★■\n");
                            try {
                                int O00000Oo = OOOO0.O00000Oo(context2.getApplicationContext());
                                OOOO00O.O00000o0(O00000Oo);
                                OOO.O00000o0("-1=NULL; 0=流量; 1=双开; 2=WIFI; networkType = ".concat(String.valueOf(O00000Oo)));
                                if (O00000Oo == 1) {
                                    final long currentTimeMillis = System.currentTimeMillis();
                                    OOO0oO.O000000o().O000000o(context2, new OOO0oO.O000000o() { // from class: com.mobile.auth.OOO000o.3
                                        @Override // com.mobile.auth.OOO0oO.O000000o
                                        public final void O000000o(boolean z, Object obj) {
                                            try {
                                                if (z) {
                                                    OOO.O00000o0("selectDataChannel:".concat(String.valueOf(System.currentTimeMillis() - currentTimeMillis)));
                                                    oOO000o.O000000o(context2, i2, obj, oOO00Oo);
                                                    return;
                                                }
                                                oOO00Oo.O000000o(i2, 410003, "无法切换至数据网络");
                                            } catch (Throwable th) {
                                                ExceptionProcessor.processException(th);
                                            }
                                        }
                                    });
                                    return;
                                } else if (O00000Oo == 0) {
                                    oOO000o.O000000o(context2, i2, null, oOO00Oo);
                                    return;
                                } else {
                                    oOO00Oo.O000000o(i2, 410004, "数据网络未开启");
                                    return;
                                }
                            } catch (Exception e) {
                                OOO.O00000Oo();
                                oOO00Oo.O000000o(i2, 410005, "网络判断异常" + e.getMessage());
                                return;
                            }
                        } catch (Exception unused2) {
                            OOO.O00000Oo();
                            return;
                        }
                    }
                    OO0Oo00.O000000o(i2, oO0OOo0, "sdk未初始化");
                }
            } else {
                initFail(i2, resultListener, "数据网络未开启");
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }
}
