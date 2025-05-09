package com.mobile.auth;

import android.text.TextUtils;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class OO0o0 {
    public static String O000000o() {
        try {
            try {
                String replace = UUID.randomUUID().toString().replace("-", "");
                if (!TextUtils.isEmpty(replace) && replace.length() >= 32) {
                    return replace;
                }
                return OOOO00O.O00000o0().substring(0, 32);
            } catch (Exception unused) {
                OOO.O00000Oo();
                return "";
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static String O00000Oo(String str, String str2, String str3) {
        try {
            try {
                return O00000o0(str, str2, str3);
            } catch (Exception unused) {
                OOO.O00000Oo();
                return null;
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    private static String O00000o(String str, String str2, String str3) {
        if (str != null) {
            try {
                if (!(str.length() == 0 || str.trim().length() == 0)) {
                    if (str2 == null) {
                        throw new Exception("decrypt key is null");
                    } else if (str2.length() != 16) {
                        throw new Exception("decrypt key length error");
                    } else if (str3.length() == 16) {
                        byte[] O00000Oo = OO0o.O00000Oo(str);
                        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
                        instance.init(2, new SecretKeySpec(str2.getBytes("utf-8"), "AES"), new IvParameterSpec(str3.getBytes("utf-8")));
                        return new String(instance.doFinal(O00000Oo), "utf-8");
                    } else {
                        throw new Exception(" iv decrypt key length error");
                    }
                }
            } catch (Exception e) {
                throw new Exception("decrypt error", e);
            } catch (Throwable th) {
                ExceptionProcessor.processException(th);
                return null;
            }
        }
        return null;
    }

    private static String O00000o0(String str, String str2, String str3) {
        if (str != null) {
            try {
                if (!(str.length() == 0 || str.trim().length() == 0)) {
                    if (str2 == null) {
                        throw new Exception("encrypt key is null");
                    } else if (str2.length() != 16) {
                        throw new Exception("encrypt key length error");
                    } else if (str3.length() == 16) {
                        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
                        instance.init(1, new SecretKeySpec(str2.getBytes("utf-8"), "AES"), new IvParameterSpec(str3.getBytes("utf-8")));
                        return OO0o.O000000o(instance.doFinal(str.getBytes("utf-8")));
                    } else {
                        throw new Exception(" iv encrypt key length error");
                    }
                }
            } catch (Exception e) {
                throw new Exception("Encrypt error", e);
            } catch (Throwable th) {
                ExceptionProcessor.processException(th);
                return null;
            }
        }
        return null;
    }

    public static String O000000o(String str, String str2, String str3) {
        try {
            try {
                return O00000o(str, str2, str3);
            } catch (Exception unused) {
                OOO.O00000Oo();
                return null;
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }
}
