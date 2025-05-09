package com.mobile.auth;

import android.text.TextUtils;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import tb.h1p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class OO00Oo0 {
    private static volatile OO00Oo0 O000000o;
    private OO00OOO O00000oO;
    private int O00000Oo = 0;
    private int O00000o0 = 3000;
    private int O00000o = 3000;

    public static OO00Oo0 O000000o() {
        try {
            if (O000000o == null) {
                synchronized (OO00Oo0.class) {
                    if (O000000o == null) {
                        O000000o = new OO00Oo0();
                    }
                }
            }
            return O000000o;
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

    public OO00o00 O00000Oo() {
        OO00o00 oO00o00;
        OO00OOO oo00ooo;
        String str;
        try {
            oO00o00 = new OO00o00();
            oo00ooo = this.O00000oO;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
        if (oo00ooo == null) {
            oO00o00.O000000o("100008");
            oO00o00.O00000Oo("请求参数为空");
            oO00o00.O000000o(false);
            return oO00o00;
        } else if (TextUtils.isEmpty(oo00ooo.getBaseUrl())) {
            oO00o00.O000000o("100004");
            oO00o00.O00000Oo("url 为空");
            oO00o00.O000000o(false);
            return oO00o00;
        } else {
            try {
                if (TextUtils.isEmpty(new URL(this.O00000oO.getBaseUrl()).getHost())) {
                    oO00o00.O000000o("100001");
                    oO00o00.O00000Oo("host 为空");
                    oO00o00.O000000o(false);
                    return oO00o00;
                } else if (TextUtils.isEmpty(this.O00000oO.getMethod()) && TextUtils.isEmpty(this.O00000oO.getAction())) {
                    oO00o00.O000000o("100002");
                    oO00o00.O00000Oo("api 为空");
                    oO00o00.O000000o(false);
                    return oO00o00;
                } else if (!this.O00000oO.isSign() || !TextUtils.isEmpty(this.O00000oO.getAccessKeySecret())) {
                    try {
                        this.O00000oO.setRequestMethod("POST");
                        this.O00000Oo = 0;
                        if (this.O00000oO.getBaseUrl().startsWith(h1p.HTTPS_PREFIX)) {
                            str = OO00O0o.O000000o(this.O00000oO, this.O00000o0, this.O00000o);
                        } else {
                            str = OO00O0o.O000000o(this.O00000oO, this.O00000o0, this.O00000o, this.O00000Oo);
                        }
                        if (!TextUtils.isEmpty(str) && !"{}".equals(str)) {
                            oO00o00.O000000o("100000");
                            oO00o00.O00000Oo("请求成功");
                            oO00o00.O000000o(true);
                            oO00o00.O00000o0(str);
                            return oO00o00;
                        }
                        oO00o00.O000000o("100007");
                        oO00o00.O00000Oo("数据返回错误");
                        oO00o00.O000000o(false);
                        return oO00o00;
                    } catch (IOException e) {
                        e.printStackTrace();
                        oO00o00.O000000o("100006");
                        oO00o00.O00000Oo(e.getLocalizedMessage());
                        oO00o00.O000000o(false);
                        return oO00o00;
                    }
                } else {
                    oO00o00.O000000o("100003");
                    oO00o00.O00000Oo("未设置secretkey");
                    oO00o00.O000000o(false);
                    return oO00o00;
                }
            } catch (MalformedURLException e2) {
                e2.printStackTrace();
                oO00o00.O000000o("100001");
                oO00o00.O00000Oo("host 为空");
                oO00o00.O000000o(false);
                return oO00o00;
            }
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public OO00Oo0 O000000o(OO00OOO oo00ooo) {
        try {
            this.O00000oO = oo00ooo;
            return O000000o;
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
}
