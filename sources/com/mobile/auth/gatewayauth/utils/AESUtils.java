package com.mobile.auth.gatewayauth.utils;

import android.util.Base64;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.io.UnsupportedEncodingException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AESUtils {
    private static final String CipherMode = "AES/CBC/PKCS7Padding";

    private static IvParameterSpec createIV(String str) {
        byte[] bArr;
        if (str == null) {
            str = "";
        }
        try {
            StringBuffer stringBuffer = new StringBuffer(16);
            while (true) {
                stringBuffer.append(str);
                if (stringBuffer.length() >= 16) {
                    break;
                }
                str = " ";
            }
            try {
                bArr = stringBuffer.substring(0, 16).getBytes("UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                bArr = null;
            }
            return new IvParameterSpec(bArr);
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

    private static SecretKeySpec createKey(String str) {
        byte[] bArr;
        if (str == null) {
            str = "";
        }
        try {
            try {
                bArr = str.getBytes("UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                bArr = null;
            }
            return new SecretKeySpec(bArr, "AES");
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

    public static String decrypt(String str, String str2) {
        try {
            try {
                return decryptBase642String(str, str2, EncryptUtils.IV_PARAMETER_SPEC);
            } catch (Exception e) {
                O0000Oo0.O000000o(e);
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

    public static byte[] decryptBase642Byte(String str, String str2, String str3) {
        byte[] bArr;
        try {
            try {
                bArr = Base64.decode(str, 0);
            } catch (Exception e) {
                e.printStackTrace();
                bArr = null;
            }
            return decryptByte2Byte(bArr, str2, str3);
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

    public static String decryptBase642String(String str, String str2, String str3) {
        try {
            return decryptByte2String(Base64.decode(str, 0), str2, str3);
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

    public static byte[] decryptByte2Byte(byte[] bArr, String str, String str2) {
        try {
            try {
                SecretKeySpec createKey = createKey(str);
                Cipher instance = Cipher.getInstance(CipherMode);
                instance.init(2, createKey, createIV(str2));
                return instance.doFinal(bArr);
            } catch (Exception e) {
                e.printStackTrace();
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

    public static String decryptByte2String(byte[] bArr, String str, String str2) {
        try {
            return new String(decryptByte2Byte(bArr, str, str2));
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

    public static byte[] decryptString2Byte(String str, String str2, String str3) {
        byte[] bArr;
        try {
            try {
                bArr = str.getBytes("UTF-8");
            } catch (Exception e) {
                e.printStackTrace();
                bArr = null;
            }
            return decryptByte2Byte(bArr, str2, str3);
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

    public static String encrypt(String str, String str2) {
        try {
            try {
                return encryptString2Base64(str, str2, EncryptUtils.IV_PARAMETER_SPEC);
            } catch (Exception e) {
                O0000Oo0.O000000o(e);
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

    public static String encryptByte2Base64(byte[] bArr, String str, String str2) {
        try {
            return new String(Base64.encode(encryptByte2Byte(bArr, str, str2), 0));
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

    public static byte[] encryptByte2Byte(byte[] bArr, String str, String str2) {
        try {
            try {
                SecretKeySpec createKey = createKey(str);
                Cipher instance = Cipher.getInstance(CipherMode);
                instance.init(1, createKey, createIV(str2));
                return instance.doFinal(bArr);
            } catch (Exception e) {
                e.printStackTrace();
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

    public static String encryptByte2String(byte[] bArr, String str, String str2) {
        try {
            return new String(encryptByte2Byte(bArr, str, str2));
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

    public static String encryptString2Base64(String str, String str2, String str3) {
        byte[] bArr;
        try {
            try {
                bArr = str.getBytes("UTF-8");
            } catch (Exception e) {
                e.printStackTrace();
                bArr = null;
            }
            return new String(Base64.encode(encryptByte2Byte(bArr, str2, str3), 0));
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

    public static byte[] encryptString2Byte(String str, String str2, String str3) {
        byte[] bArr;
        try {
            try {
                bArr = str.getBytes("UTF-8");
            } catch (Exception e) {
                e.printStackTrace();
                bArr = null;
            }
            return encryptByte2Byte(bArr, str2, str3);
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

    public static String encryptString2String(String str, String str2, String str3) {
        byte[] bArr;
        try {
            try {
                bArr = str.getBytes("UTF-8");
            } catch (Exception e) {
                e.printStackTrace();
                bArr = null;
            }
            return new String(encryptByte2Byte(bArr, str2, str3));
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
